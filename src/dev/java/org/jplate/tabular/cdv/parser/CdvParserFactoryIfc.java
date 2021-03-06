package org.jplate.tabular.cdv.parser;

import org.jplate.tabular.parser.TabularParserFactoryIfc;


/**
 
    Factory for creating implementations of CdvParserIfc's.


    <pre>
Modifications:
    $Date: 2008-12-02 12:32:45 -0500 (Tue, 02 Dec 2008) $
    $Revision: 479 $
    $Author: sfloess $
    $HeadURL: https://jplate.svn.sourceforge.net/svnroot/jplate/trunk/src/dev/java/org/jplate/tabular/cdv/parser/CdvParserFactoryIfc.java $
    </pre>

    @param <V> The CDV parser type created.

*/
public interface CdvParserFactoryIfc <V extends CdvParserIfc <?>>
    extends TabularParserFactoryIfc <V>
{
    // ----------------------------------------------------------------------
    //
    // Interface definitions follow...
    //
    // ----------------------------------------------------------------------

    
    // ----------------------------------------------------------------------
    //
    // Static class definitions follow...
    //
    // ----------------------------------------------------------------------


    // ----------------------------------------------------------------------
    //
    // Static member definitions follow...
    //
    // ----------------------------------------------------------------------


    // ----------------------------------------------------------------------
    //
    // Instance class definitions follow...
    //
    // ----------------------------------------------------------------------


    // ----------------------------------------------------------------------
    //
    // Instance method definitions follow...
    //
    // ----------------------------------------------------------------------


}
