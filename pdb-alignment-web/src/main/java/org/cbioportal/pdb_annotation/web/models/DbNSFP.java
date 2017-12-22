package org.cbioportal.pdb_annotation.web.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "annotation_dbnsfp")
public class DbNSFP {
    
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
    
    @Column(name = "SIFT_SCORE")
    public String SIFT_score;

    @Column(name = "SIFT_CONVERTED_RANKSCORE")
    public String SIFT_converted_rankscore;
    
    @Column(name = "SIFT_PRED")
    public String SIFT_pred;
    
    @Column(name = "POLYPHEN2_HDIV_SCORE")
    public String Polyphen2_HDIV_score;
    
    @Column(name = "POLYPHEN2_HDIV_RANKSCORE")
    public String Polyphen2_HDIV_rankscore;
    
    @Column(name = "POLYPHEN2_HDIV_PRED")
    public String Polyphen2_HDIV_pred;
    
    @Column(name = "POLYPHEN2_HVAR_SCORE")
    public String Polyphen2_HVAR_score;
    
    @Column(name = "POLYPHEN2_HVAR_RANKSCORE")
    public String Polyphen2_HVAR_rankscore;
    
    @Column(name = "POLYPHEN2_HVAR_PRED")
    public String Polyphen2_HVAR_pred;

    @Column(name = "LRT_SCORE")
    public String LRT_score;

    @Column(name = "LRT_CONVERTED_RANKSCORE")
    public String LRT_converted_rankscore;

    @Column(name = "LRT_PRED")
    public String LRT_pred;

    @Column(name = "MUTATIONTASTER_SCORE")
    public String MutationTaster_score;

    @Column(name = "MUTATIONTASTER_CONVERTED_RANKSCORE")
    public String MutationTaster_converted_rankscore;

    @Column(name = "MUTATIONTASTER_PRED")
    public String MutationTaster_pred;

    @Column(name = "MUTATIONASSESSOR_SCORE")
    public String MutationAssessor_score;

    @Column(name = "MUTATIONASSESSOR_SCORE_RANKSCORE")
    public String MutationAssessor_score_rankscore;

    @Column(name = "MUTATIONASSESSOR_PRED")
    public String MutationAssessor_pred;

    @Column(name = "FATHMM_SCORE")
    public String FATHMM_score;

    @Column(name = "FATHMM_CONVERTED_RANKSCORE")
    public String FATHMM_converted_rankscore;

    @Column(name = "FATHMM_PRED")
    public String FATHMM_pred;

    @Column(name = "PROVEAN_SCORE")
    public String PROVEAN_score;

    @Column(name = "PROVEAN_CONVERTED_RANKSCORE")
    public String PROVEAN_converted_rankscore;

    @Column(name = "PROVEAN_PRED")
    public String PROVEAN_pred;

    @Column(name = "VEST3_SCORE")
    public String VEST3_score;
    
    @Column(name = "VEST3_RANKSCORE")
    public String VEST3_rankscore;

    @Column(name = "METASVM_SCORE")
    public String MetaSVM_score;

    @Column(name = "METASVM_RANKSCORE")
    public String MetaSVM_rankscore;

    @Column(name = "METASVM_PRED")
    public String MetaSVM_pred;

    @Column(name = "METALR_SCORE")
    public String MetaLR_score;

    @Column(name = "METALR_RANKSCORE")
    public String MetaLR_rankscore;

    @Column(name = "METALR_PRED")
    public String MetaLR_pred;

    @Column(name = "M_CAP_SCORE")
    public String M_CAP_score;

    @Column(name = "M_CAP_RANKSCORE")
    public String M_CAP_rankscore;

    @Column(name = "M_CAP_PRED")
    public String M_CAP_pred;

    @Column(name = "CADD_RAW")
    public String CADD_raw;

    @Column(name = "CADD_RAW_RANKSCORECADD_PHRED")
    public String CADD_raw_rankscoreCADD_phred;

    @Column(name = "DANN_SCORE")
    public String DANN_score;

    @Column(name = "DANN_RANKSCORE")
    public String DANN_rankscore;

    @Column(name = "FATHMM_MKL_CODING_SCORE")
    public String fathmm_MKL_coding_score;

    @Column(name = "FATHMM_MKL_CODING_RANKSCORE")
    public String fathmm_MKL_coding_rankscore;

    @Column(name = "FATHMM_MKL_CODING_PRED")
    public String fathmm_MKL_coding_pred;

    @Column(name = "EIGEN_CODING_OR_NONCODING")
    public String Eigen_coding_or_noncoding;

    @Column(name = "EIGEN_RAW")
    public String Eigen_raw;

    @Column(name = "EIGEN_PC_RAW")
    public String Eigen_PC_raw;

    @Column(name = "GENOCANYON_SCORE")
    public String GenoCanyon_score;

    @Column(name = "GENOCANYON_SCORE_RANKSCORE")
    public String GenoCanyon_score_rankscore;

    @Column(name = "INTEGRATED_FITCONS_SCORE")
    public String integrated_fitCons_score;

    @Column(name = "INTEGRATED_FITCONS_SCORE_RANKSCORE")
    public String integrated_fitCons_score_rankscore;

    @Column(name = "INTEGRATED_CONFIDENCE_VALUE")
    public String integrated_confidence_value;

    @Column(name = "GERPPP_RS")
    public String GERPPP_RS;

    @Column(name = "GERPPP_RS_RANKSCORE")
    public String GERPPP_RS_rankscore;

    @Column(name = "PHYLOP100WAY_VERTEBRATE")
    public String phyloP100way_vertebrate;

    @Column(name = "PHYLOP100WAY_VERTEBRATE_RANKSCORE")
    public String phyloP100way_vertebrate_rankscore;

    @Column(name = "PHYLOP20WAY_MAMMALIAN")
    public String phyloP20way_mammalian;

    @Column(name = "PHYLOP20WAY_MAMMALIAN_RANKSCORE")
    public String phyloP20way_mammalian_rankscore;

    @Column(name = "PHASTCONS100WAY_VERTEBRATE")
    public String phastCons100way_vertebrate;

    @Column(name = "PHASTCONS100WAY_VERTEBRATE_RANKSCORE")
    public String phastCons100way_vertebrate_rankscore;

    @Column(name = "PHASTCONS20WAY_MAMMALIAN")
    public String phastCons20way_mammalian;

    @Column(name = "PHASTCONS20WAY_MAMMALIAN_RANKSCORE")
    public String phastCons20way_mammalian_rankscore;

    @Column(name = "SIPHY_29WAY_LOGODDS")
    public String SiPhy_29way_logOdds;

    @Column(name = "SIPHY_29WAY_LOGODDS_RANKSCORE")
    public String SiPhy_29way_logOdds_rankscore;

    @Column(name = "INTERPRO_DOMAIN")
    public String Interpro_domain;

    @Column(name = "GTEX_V6_TISSUE")
    public String GTEx_V6_gene;

    @Column(name = "GTEX_V6_TISSUE")
    public String GTEx_V6_tissue;
    
    
    
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
    public String getSIFT_score() {
        return SIFT_score;
    }
    public void setSIFT_score(String sIFT_score) {
        SIFT_score = sIFT_score;
    }
    public String getSIFT_converted_rankscore() {
        return SIFT_converted_rankscore;
    }
    public void setSIFT_converted_rankscore(String sIFT_converted_rankscore) {
        SIFT_converted_rankscore = sIFT_converted_rankscore;
    }
    public String getSIFT_pred() {
        return SIFT_pred;
    }
    public void setSIFT_pred(String sIFT_pred) {
        SIFT_pred = sIFT_pred;
    }
    public String getPolyphen2_HDIV_score() {
        return Polyphen2_HDIV_score;
    }
    public void setPolyphen2_HDIV_score(String polyphen2_HDIV_score) {
        Polyphen2_HDIV_score = polyphen2_HDIV_score;
    }
    public String getPolyphen2_HDIV_rankscore() {
        return Polyphen2_HDIV_rankscore;
    }
    public void setPolyphen2_HDIV_rankscore(String polyphen2_HDIV_rankscore) {
        Polyphen2_HDIV_rankscore = polyphen2_HDIV_rankscore;
    }
    public String getPolyphen2_HDIV_pred() {
        return Polyphen2_HDIV_pred;
    }
    public void setPolyphen2_HDIV_pred(String polyphen2_HDIV_pred) {
        Polyphen2_HDIV_pred = polyphen2_HDIV_pred;
    }
    public String getPolyphen2_HVAR_score() {
        return Polyphen2_HVAR_score;
    }
    public void setPolyphen2_HVAR_score(String polyphen2_HVAR_score) {
        Polyphen2_HVAR_score = polyphen2_HVAR_score;
    }
    public String getPolyphen2_HVAR_rankscore() {
        return Polyphen2_HVAR_rankscore;
    }
    public void setPolyphen2_HVAR_rankscore(String polyphen2_HVAR_rankscore) {
        Polyphen2_HVAR_rankscore = polyphen2_HVAR_rankscore;
    }
    public String getPolyphen2_HVAR_pred() {
        return Polyphen2_HVAR_pred;
    }
    public void setPolyphen2_HVAR_pred(String polyphen2_HVAR_pred) {
        Polyphen2_HVAR_pred = polyphen2_HVAR_pred;
    }
    public String getLRT_score() {
        return LRT_score;
    }
    public void setLRT_score(String lRT_score) {
        LRT_score = lRT_score;
    }
    public String getLRT_converted_rankscore() {
        return LRT_converted_rankscore;
    }
    public void setLRT_converted_rankscore(String lRT_converted_rankscore) {
        LRT_converted_rankscore = lRT_converted_rankscore;
    }
    public String getLRT_pred() {
        return LRT_pred;
    }
    public void setLRT_pred(String lRT_pred) {
        LRT_pred = lRT_pred;
    }
    public String getMutationTaster_score() {
        return MutationTaster_score;
    }
    public void setMutationTaster_score(String mutationTaster_score) {
        MutationTaster_score = mutationTaster_score;
    }
    public String getMutationTaster_converted_rankscore() {
        return MutationTaster_converted_rankscore;
    }
    public void setMutationTaster_converted_rankscore(String mutationTaster_converted_rankscore) {
        MutationTaster_converted_rankscore = mutationTaster_converted_rankscore;
    }
    public String getMutationTaster_pred() {
        return MutationTaster_pred;
    }
    public void setMutationTaster_pred(String mutationTaster_pred) {
        MutationTaster_pred = mutationTaster_pred;
    }
    public String getMutationAssessor_score() {
        return MutationAssessor_score;
    }
    public void setMutationAssessor_score(String mutationAssessor_score) {
        MutationAssessor_score = mutationAssessor_score;
    }
    public String getMutationAssessor_score_rankscore() {
        return MutationAssessor_score_rankscore;
    }
    public void setMutationAssessor_score_rankscore(String mutationAssessor_score_rankscore) {
        MutationAssessor_score_rankscore = mutationAssessor_score_rankscore;
    }
    public String getMutationAssessor_pred() {
        return MutationAssessor_pred;
    }
    public void setMutationAssessor_pred(String mutationAssessor_pred) {
        MutationAssessor_pred = mutationAssessor_pred;
    }
    public String getFATHMM_score() {
        return FATHMM_score;
    }
    public void setFATHMM_score(String fATHMM_score) {
        FATHMM_score = fATHMM_score;
    }
    public String getFATHMM_converted_rankscore() {
        return FATHMM_converted_rankscore;
    }
    public void setFATHMM_converted_rankscore(String fATHMM_converted_rankscore) {
        FATHMM_converted_rankscore = fATHMM_converted_rankscore;
    }
    public String getFATHMM_pred() {
        return FATHMM_pred;
    }
    public void setFATHMM_pred(String fATHMM_pred) {
        FATHMM_pred = fATHMM_pred;
    }
    public String getPROVEAN_score() {
        return PROVEAN_score;
    }
    public void setPROVEAN_score(String pROVEAN_score) {
        PROVEAN_score = pROVEAN_score;
    }
    public String getPROVEAN_converted_rankscore() {
        return PROVEAN_converted_rankscore;
    }
    public void setPROVEAN_converted_rankscore(String pROVEAN_converted_rankscore) {
        PROVEAN_converted_rankscore = pROVEAN_converted_rankscore;
    }
    public String getPROVEAN_pred() {
        return PROVEAN_pred;
    }
    public void setPROVEAN_pred(String pROVEAN_pred) {
        PROVEAN_pred = pROVEAN_pred;
    }
    
    public String getVEST3_score() {
        return VEST3_score;
    }
    public void setVEST3_score(String vEST3_score) {
        VEST3_score = vEST3_score;
    }
    public String getVEST3_rankscore() {
        return VEST3_rankscore;
    }
    public void setVEST3_rankscore(String vEST3_rankscore) {
        VEST3_rankscore = vEST3_rankscore;
    }
    public String getMetaSVM_score() {
        return MetaSVM_score;
    }
    public void setMetaSVM_score(String metaSVM_score) {
        MetaSVM_score = metaSVM_score;
    }
    public String getMetaSVM_rankscore() {
        return MetaSVM_rankscore;
    }
    public void setMetaSVM_rankscore(String metaSVM_rankscore) {
        MetaSVM_rankscore = metaSVM_rankscore;
    }
    public String getMetaSVM_pred() {
        return MetaSVM_pred;
    }
    public void setMetaSVM_pred(String metaSVM_pred) {
        MetaSVM_pred = metaSVM_pred;
    }
    public String getMetaLR_score() {
        return MetaLR_score;
    }
    public void setMetaLR_score(String metaLR_score) {
        MetaLR_score = metaLR_score;
    }
    public String getMetaLR_rankscore() {
        return MetaLR_rankscore;
    }
    public void setMetaLR_rankscore(String metaLR_rankscore) {
        MetaLR_rankscore = metaLR_rankscore;
    }
    public String getMetaLR_pred() {
        return MetaLR_pred;
    }
    public void setMetaLR_pred(String metaLR_pred) {
        MetaLR_pred = metaLR_pred;
    }
    public String getM_CAP_score() {
        return M_CAP_score;
    }
    public void setM_CAP_score(String m_CAP_score) {
        M_CAP_score = m_CAP_score;
    }
    public String getM_CAP_rankscore() {
        return M_CAP_rankscore;
    }
    public void setM_CAP_rankscore(String m_CAP_rankscore) {
        M_CAP_rankscore = m_CAP_rankscore;
    }
    public String getM_CAP_pred() {
        return M_CAP_pred;
    }
    public void setM_CAP_pred(String m_CAP_pred) {
        M_CAP_pred = m_CAP_pred;
    }
    public String getCADD_raw() {
        return CADD_raw;
    }
    public void setCADD_raw(String cADD_raw) {
        CADD_raw = cADD_raw;
    }
    public String getCADD_raw_rankscoreCADD_phred() {
        return CADD_raw_rankscoreCADD_phred;
    }
    public void setCADD_raw_rankscoreCADD_phred(String cADD_raw_rankscoreCADD_phred) {
        CADD_raw_rankscoreCADD_phred = cADD_raw_rankscoreCADD_phred;
    }
    public String getDANN_score() {
        return DANN_score;
    }
    public void setDANN_score(String dANN_score) {
        DANN_score = dANN_score;
    }
    public String getDANN_rankscore() {
        return DANN_rankscore;
    }
    public void setDANN_rankscore(String dANN_rankscore) {
        DANN_rankscore = dANN_rankscore;
    }
    public String getFathmm_MKL_coding_score() {
        return fathmm_MKL_coding_score;
    }
    public void setFathmm_MKL_coding_score(String fathmm_MKL_coding_score) {
        this.fathmm_MKL_coding_score = fathmm_MKL_coding_score;
    }
    public String getFathmm_MKL_coding_rankscore() {
        return fathmm_MKL_coding_rankscore;
    }
    public void setFathmm_MKL_coding_rankscore(String fathmm_MKL_coding_rankscore) {
        this.fathmm_MKL_coding_rankscore = fathmm_MKL_coding_rankscore;
    }
    public String getFathmm_MKL_coding_pred() {
        return fathmm_MKL_coding_pred;
    }
    public void setFathmm_MKL_coding_pred(String fathmm_MKL_coding_pred) {
        this.fathmm_MKL_coding_pred = fathmm_MKL_coding_pred;
    }
    public String getEigen_coding_or_noncoding() {
        return Eigen_coding_or_noncoding;
    }
    public void setEigen_coding_or_noncoding(String eigen_coding_or_noncoding) {
        Eigen_coding_or_noncoding = eigen_coding_or_noncoding;
    }
    public String getEigen_raw() {
        return Eigen_raw;
    }
    public void setEigen_raw(String eigen_raw) {
        Eigen_raw = eigen_raw;
    }
    public String getEigen_PC_raw() {
        return Eigen_PC_raw;
    }
    public void setEigen_PC_raw(String eigen_PC_raw) {
        Eigen_PC_raw = eigen_PC_raw;
    }
    public String getGenoCanyon_score() {
        return GenoCanyon_score;
    }
    public void setGenoCanyon_score(String genoCanyon_score) {
        GenoCanyon_score = genoCanyon_score;
    }
    public String getGenoCanyon_score_rankscore() {
        return GenoCanyon_score_rankscore;
    }
    public void setGenoCanyon_score_rankscore(String genoCanyon_score_rankscore) {
        GenoCanyon_score_rankscore = genoCanyon_score_rankscore;
    }
    public String getIntegrated_fitCons_score() {
        return integrated_fitCons_score;
    }
    public void setIntegrated_fitCons_score(String integrated_fitCons_score) {
        this.integrated_fitCons_score = integrated_fitCons_score;
    }
    public String getIntegrated_fitCons_score_rankscore() {
        return integrated_fitCons_score_rankscore;
    }
    public void setIntegrated_fitCons_score_rankscore(String integrated_fitCons_score_rankscore) {
        this.integrated_fitCons_score_rankscore = integrated_fitCons_score_rankscore;
    }
    public String getIntegrated_confidence_value() {
        return integrated_confidence_value;
    }
    public void setIntegrated_confidence_value(String integrated_confidence_value) {
        this.integrated_confidence_value = integrated_confidence_value;
    }
    public String getGERPPP_RS() {
        return GERPPP_RS;
    }
    public void setGERPPP_RS(String gERPPP_RS) {
        GERPPP_RS = gERPPP_RS;
    }
    public String getGERPPP_RS_rankscore() {
        return GERPPP_RS_rankscore;
    }
    public void setGERPPP_RS_rankscore(String gERPPP_RS_rankscore) {
        GERPPP_RS_rankscore = gERPPP_RS_rankscore;
    }
    public String getPhyloP100way_vertebrate() {
        return phyloP100way_vertebrate;
    }
    public void setPhyloP100way_vertebrate(String phyloP100way_vertebrate) {
        this.phyloP100way_vertebrate = phyloP100way_vertebrate;
    }
    public String getPhyloP100way_vertebrate_rankscore() {
        return phyloP100way_vertebrate_rankscore;
    }
    public void setPhyloP100way_vertebrate_rankscore(String phyloP100way_vertebrate_rankscore) {
        this.phyloP100way_vertebrate_rankscore = phyloP100way_vertebrate_rankscore;
    }
    public String getPhyloP20way_mammalian() {
        return phyloP20way_mammalian;
    }
    public void setPhyloP20way_mammalian(String phyloP20way_mammalian) {
        this.phyloP20way_mammalian = phyloP20way_mammalian;
    }
    public String getPhyloP20way_mammalian_rankscore() {
        return phyloP20way_mammalian_rankscore;
    }
    public void setPhyloP20way_mammalian_rankscore(String phyloP20way_mammalian_rankscore) {
        this.phyloP20way_mammalian_rankscore = phyloP20way_mammalian_rankscore;
    }
    public String getPhastCons100way_vertebrate() {
        return phastCons100way_vertebrate;
    }
    public void setPhastCons100way_vertebrate(String phastCons100way_vertebrate) {
        this.phastCons100way_vertebrate = phastCons100way_vertebrate;
    }
    public String getPhastCons100way_vertebrate_rankscore() {
        return phastCons100way_vertebrate_rankscore;
    }
    public void setPhastCons100way_vertebrate_rankscore(String phastCons100way_vertebrate_rankscore) {
        this.phastCons100way_vertebrate_rankscore = phastCons100way_vertebrate_rankscore;
    }
    public String getPhastCons20way_mammalian() {
        return phastCons20way_mammalian;
    }
    public void setPhastCons20way_mammalian(String phastCons20way_mammalian) {
        this.phastCons20way_mammalian = phastCons20way_mammalian;
    }
    public String getPhastCons20way_mammalian_rankscore() {
        return phastCons20way_mammalian_rankscore;
    }
    public void setPhastCons20way_mammalian_rankscore(String phastCons20way_mammalian_rankscore) {
        this.phastCons20way_mammalian_rankscore = phastCons20way_mammalian_rankscore;
    }
    public String getSiPhy_29way_logOdds() {
        return SiPhy_29way_logOdds;
    }
    public void setSiPhy_29way_logOdds(String siPhy_29way_logOdds) {
        SiPhy_29way_logOdds = siPhy_29way_logOdds;
    }
    public String getSiPhy_29way_logOdds_rankscore() {
        return SiPhy_29way_logOdds_rankscore;
    }
    public void setSiPhy_29way_logOdds_rankscore(String siPhy_29way_logOdds_rankscore) {
        SiPhy_29way_logOdds_rankscore = siPhy_29way_logOdds_rankscore;
    }
    public String getInterpro_domain() {
        return Interpro_domain;
    }
    public void setInterpro_domain(String interpro_domain) {
        Interpro_domain = interpro_domain;
    }
    public String getGTEx_V6_gene() {
        return GTEx_V6_gene;
    }
    public void setGTEx_V6_gene(String gTEx_V6_gene) {
        GTEx_V6_gene = gTEx_V6_gene;
    }
    public String getGTEx_V6_tissue() {
        return GTEx_V6_tissue;
    }
    public void setGTEx_V6_tissue(String gTEx_V6_tissue) {
        GTEx_V6_tissue = gTEx_V6_tissue;
    }
    
    


}
