/*
 * LibreClinica is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://libreclinica.org/license
 * LibreClinica, copyright (C) 2020
 */
package org.akaza.openclinica.domain.datamap;

// default package
// Generated Aug 8, 2013 11:32:37 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.akaza.openclinica.domain.DataMapDomainObject;

/**
 * DnStudySubjectMapId generated by hbm2java
 */
@Embeddable
public class DnStudySubjectMapId extends DataMapDomainObject{
	private Integer studySubjectId;
	private Integer discrepancyNoteId;
	private String columnName;

	public DnStudySubjectMapId() {
	}

	public DnStudySubjectMapId(Integer studySubjectId,
			Integer discrepancyNoteId, String columnName) {
		this.studySubjectId = studySubjectId;
		this.discrepancyNoteId = discrepancyNoteId;
		this.columnName = columnName;
	}

	@Column(name = "study_subject_id")
	public Integer getStudySubjectId() {
		return this.studySubjectId;
	}

	public void setStudySubjectId(Integer studySubjectId) {
		this.studySubjectId = studySubjectId;
	}

	@Column(name = "discrepancy_note_id")
	public Integer getDiscrepancyNoteId() {
		return this.discrepancyNoteId;
	}

	public void setDiscrepancyNoteId(Integer discrepancyNoteId) {
		this.discrepancyNoteId = discrepancyNoteId;
	}

	@Column(name = "column_name")
	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DnStudySubjectMapId))
			return false;
		DnStudySubjectMapId castOther = (DnStudySubjectMapId) other;

		return ((this.getStudySubjectId() == castOther.getStudySubjectId()) || (this
				.getStudySubjectId() != null
				&& castOther.getStudySubjectId() != null && this
				.getStudySubjectId().equals(castOther.getStudySubjectId())))
				&& ((this.getDiscrepancyNoteId() == castOther
						.getDiscrepancyNoteId()) || (this
						.getDiscrepancyNoteId() != null
						&& castOther.getDiscrepancyNoteId() != null && this
						.getDiscrepancyNoteId().equals(
								castOther.getDiscrepancyNoteId())))
				&& ((this.getColumnName() == castOther.getColumnName()) || (this
						.getColumnName() != null
						&& castOther.getColumnName() != null && this
						.getColumnName().equals(castOther.getColumnName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getStudySubjectId() == null ? 0 : this.getStudySubjectId()
						.hashCode());
		result = 37
				* result
				+ (getDiscrepancyNoteId() == null ? 0 : this
						.getDiscrepancyNoteId().hashCode());
		result = 37
				* result
				+ (getColumnName() == null ? 0 : this.getColumnName()
						.hashCode());
		return result;
	}



}
