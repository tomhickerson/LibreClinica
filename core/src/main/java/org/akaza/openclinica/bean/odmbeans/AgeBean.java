/*
 * LibreClinica is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://libreclinica.org/license
 * LibreClinica, copyright (C) 2020
 */
/*
 * LibreClinica is distributed under the GNU Lesser General Public License (GNU
 * LGPL).
 *
 * For details see: https://libreclinica.org/license copyright 
 *
 */

package org.akaza.openclinica.bean.odmbeans;



/**
 *
 * @author ywang (Aug, 2010)
 *
 */

public class AgeBean {
    private String minimumAge;
    private String maximumAge;
    
    public String getMinimumAge() {
        return minimumAge;
    }
    public void setMinimumAge(String minimumAge) {
        this.minimumAge = minimumAge;
    }
    public String getMaximumAge() {
        return maximumAge;
    }
    public void setMaximumAge(String maximumAge) {
        this.maximumAge = maximumAge;
    }
}