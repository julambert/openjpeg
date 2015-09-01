package org.codecCentral.imageio.generic;

import javax.imageio.spi.ImageWriterSpi;

public abstract class GenericImageWriterSpi extends ImageWriterSpi {

	 public GenericImageWriterSpi(String vendorName,
             String version,
             String[] names,
             String[] suffixes,
             String[] MIMETypes,
             String writerClassName,
             Class[] outputTypes,
             String[] readerSpiNames,
             boolean supportsStandardStreamMetadataFormat,
             String nativeStreamMetadataFormatName,
             String nativeStreamMetadataFormatClassName,
             String[] extraStreamMetadataFormatNames,
             String[] extraStreamMetadataFormatClassNames,
             boolean supportsStandardImageMetadataFormat,
             String nativeImageMetadataFormatName,
             String nativeImageMetadataFormatClassName,
             String[] extraImageMetadataFormatNames,
             String[] extraImageMetadataFormatClassNames) {
	super(vendorName, version,
	 names, suffixes, MIMETypes, writerClassName,
	 outputTypes, extraImageMetadataFormatClassNames, supportsStandardStreamMetadataFormat,
	 nativeStreamMetadataFormatName,
	 nativeStreamMetadataFormatClassName,
	 extraStreamMetadataFormatNames,
	 extraStreamMetadataFormatClassNames,
	 supportsStandardImageMetadataFormat,
	 nativeImageMetadataFormatName,
	 nativeImageMetadataFormatClassName,
	 extraImageMetadataFormatNames,
	 extraImageMetadataFormatClassNames);


}


}
