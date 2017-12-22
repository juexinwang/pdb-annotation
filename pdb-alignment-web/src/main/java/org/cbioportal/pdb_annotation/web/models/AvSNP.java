package org.cbioportal.pdb_annotation.web.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "annotation_avsnp")
public class AvSNP {
    
    @Id
    @Column(name = "POSID")
    public String posId;
    
    @Column(name = "CHR")
    public String chr;
    
    @Column(name = "STARTPOS")
    public String startPos;
    
    @Column(name = "ENDPOS")
    public String endPos;
    
    @Column(name = "REF")
    public String ref;
    
    @Column(name = "ALT")
    public String alt;
    
    @Column(name = "SNPNAME")
    public String snpName;
    
    
    public String getPosId() {
        return posId;
    }
    public void setPosId(String posId) {
        this.posId = posId;
    }
    public String getChr() {
        return chr;
    }
    public void setChr(String chr) {
        this.chr = chr;
    }
    public String getStartPos() {
        return startPos;
    }
    public void setStartPos(String startPos) {
        this.startPos = startPos;
    }
    public String getEndPos() {
        return endPos;
    }
    public void setEndPos(String endPos) {
        this.endPos = endPos;
    }
    public String getRef() {
        return ref;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }
    public String getAlt() {
        return alt;
    }
    public void setAlt(String alt) {
        this.alt = alt;
    }
    public String getSnpName() {
        return snpName;
    }
    public void setSnpName(String snpName) {
        this.snpName = snpName;
    }

}
