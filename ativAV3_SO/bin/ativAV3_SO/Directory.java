����   = I  ativAV3_SO/Directory  java/lang/Object name Ljava/lang/String; files Ljava/util/HashMap; 	Signature 8Ljava/util/HashMap<Ljava/lang/String;LativAV3_SO/File;>; directories =Ljava/util/HashMap<Ljava/lang/String;LativAV3_SO/Directory;>; <init> (Ljava/lang/String;)V Code
     ()V	      java/util/HashMap
  	    	     LineNumberTable LocalVariableTable this LativAV3_SO/Directory; getName ()Ljava/lang/String; setName addFile (LativAV3_SO/File;)V
 & ( ' ativAV3_SO/File   !
  * + , put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; file LativAV3_SO/File; 
removeFile
  1 2 3 remove &(Ljava/lang/Object;)Ljava/lang/Object; fileName getFile %(Ljava/lang/String;)LativAV3_SO/File;
  8 9 3 get addDirectory (LativAV3_SO/Directory;)V
  ( 	directory removeDirectory dirName getDirectory *(Ljava/lang/String;)LativAV3_SO/Directory; getFiles ()Ljava/util/HashMap; :()Ljava/util/HashMap<Ljava/lang/String;LativAV3_SO/File;>; getDirectories ?()Ljava/util/HashMap<Ljava/lang/String;LativAV3_SO/Directory;>; 
SourceFile Directory.java !               	    
     	             d      *� *+� *� Y� � *� Y� � �           
   	                             !     /     *� �                         "      >     *+� �       
                          # $     F     *� +� %+� )W�       
                      - .   /      B     
*� +� 0W�       
     	         
       
 4    5 6     @     *� +� 7� &�           !                4    : ;     F     *� +� <+� )W�       
    %  &                =    >      B     
*� +� 0W�       
    ) 	 *        
       
 ?    @ A     @     *� +� 7� �           -                ?    B C  	    D    /     *� �           1              E C  	    F    /     *� �           5              G    H