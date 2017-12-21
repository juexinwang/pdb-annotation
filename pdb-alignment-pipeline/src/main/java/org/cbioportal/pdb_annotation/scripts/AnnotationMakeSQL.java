package org.cbioportal.pdb_annotation.scripts;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.cbioportal.pdb_annotation.util.ReadConfig;
import org.cbioportal.pdb_annotation.util.annotation.AvSnp;
import org.cbioportal.pdb_annotation.util.annotation.DbNSFP;


/**
 * Add Point Mutation Annotation from annovar tools
 * 
 * TODO Baoxin
 * @author wangjue
 *
 */
public class AnnotationMakeSQL {
    
    final static Logger log = Logger.getLogger(AnnotationMakeSQL.class);
    private String workspace;
    private String version;
    
    AnnotationMakeSQL(PdbScriptsPipelineRunCommand app){
        this.workspace = ReadConfig.annotationDir;
        this.version = app.getGenomeVersion();
    }
    
    
    List<AvSnp> parseAvSnp(){
        List<AvSnp> list = new ArrayList<AvSnp>();
        //TODO      
        File file = null;
        if(this.version.equals("hg19")){
            file = new File(this.workspace+ReadConfig.annotationHg19Avsnp); 
        }else if(this.version.equals("hg38")){
            file = new File(this.workspace+ReadConfig.annotationHg38Avsnp);
        }
        //read file
        
        return list;
    }
    
    
    List<DbNSFP> parseDbNSFP(){
        List<DbNSFP> list = new ArrayList<DbNSFP>();
        //TODO
      //TODO      
        File file = null;
        if(this.version.equals("hg19")){
            file = new File(this.workspace+ReadConfig.annotationHg19Dbnsfp); 
        }else if(this.version.equals("hg38")){
            file = new File(this.workspace+ReadConfig.annotationHg38Dbnsfp);
        }
        //read file
        return list;
    }
    
    
    void generateAnnotationAvSnp(){
        List<AvSnp> list = parseAvSnp();
        for(AvSnp avsnp:list){
            //TODO
            makeTable_annotation_avsnp_insert(avsnp);
            //Write
        }
    }
    
    void generateAnnotationDbNSFP(){
        List<DbNSFP> list = parseDbNSFP();
        for(DbNSFP dbNSFP:list){
            //TODO
            makeTable_annotation_dbNSFP_insert(dbNSFP);
            //Write
        }
    }
    
    
    public String makeTable_annotation_avsnp_insert(AvSnp avsnp) {
        //TODO
        return "";
    }
    
    public String makeTable_annotation_dbNSFP_insert(DbNSFP dbnsfp) {
        //TODO
        return "";
    }

}
