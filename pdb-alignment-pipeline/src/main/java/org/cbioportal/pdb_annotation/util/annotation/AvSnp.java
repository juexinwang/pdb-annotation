package org.cbioportal.pdb_annotation.util.annotation;

/**
 * Class for hg19_avsnp150.txt or hg38_avsnp150.txt
 * 
 * @author wangjue
 *
 */
public class AvSnp {
    
    public String chr;
    public String startPos;
    public String endPos;
    public String ref;
    public String alt;
    public String snpName;
    
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
