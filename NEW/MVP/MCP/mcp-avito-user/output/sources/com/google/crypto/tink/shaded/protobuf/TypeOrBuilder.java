package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes6.dex */
public interface TypeOrBuilder extends MessageLiteOrBuilder {
    Field getFields(int i12);

    int getFieldsCount();

    List<Field> getFieldsList();

    String getName();

    ByteString getNameBytes();

    String getOneofs(int i12);

    ByteString getOneofsBytes(int i12);

    int getOneofsCount();

    List<String> getOneofsList();

    Option getOptions(int i12);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
