/*
 * LibreClinica is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://libreclinica.org/license
 * LibreClinica, copyright (C) 2020
 */
package org.akaza.openclinica.domain.datamap;

// default package
// Generated Aug 8, 2013 11:32:37 AM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.akaza.openclinica.domain.MutableDomainObject;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * DnStudyEventMap generated by hbm2java
 */
@Entity
@Table(name = "dn_study_event_map")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DnStudyEventMap implements MutableDomainObject,Serializable{

	private DnStudyEventMapId dnStudyEventMapId;
	private StudyEvent studyEvent;
	private DiscrepancyNote discrepancyNote;

	public DnStudyEventMap() {
	}

	public DnStudyEventMap(DnStudyEventMapId id) {
		this.dnStudyEventMapId = id;
	}

	public DnStudyEventMap(DnStudyEventMapId id, StudyEvent studyEvent,
			DiscrepancyNote discrepancyNote) {
		this.dnStudyEventMapId = id;
		this.studyEvent = studyEvent;
		this.discrepancyNote = discrepancyNote;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "studyEventId", column = @Column(name = "study_event_id")),
			@AttributeOverride(name = "discrepancyNoteId", column = @Column(name = "discrepancy_note_id")),
			@AttributeOverride(name = "columnName", column = @Column(name = "column_name")) })
	public DnStudyEventMapId getDnStudyEventMapId() {
		return this.dnStudyEventMapId;
	}

	public void setDnStudyEventMapId(DnStudyEventMapId id) {
		this.dnStudyEventMapId = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "study_event_id", insertable = false, updatable = false)
	public StudyEvent getStudyEvent() {
		return this.studyEvent;
	}

	public void setStudyEvent(StudyEvent studyEvent) {
		this.studyEvent = studyEvent;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "discrepancy_note_id", insertable = false, updatable = false)
	public DiscrepancyNote getDiscrepancyNote() {
		return this.discrepancyNote;
	}

	public void setDiscrepancyNote(DiscrepancyNote discrepancyNote) {
		this.discrepancyNote = discrepancyNote;
	}

	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transient
	public Integer getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVersion(Integer version) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transient
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
