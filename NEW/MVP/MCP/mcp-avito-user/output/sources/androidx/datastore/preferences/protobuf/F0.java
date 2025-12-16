package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: MessageLite.java */
/* loaded from: classes.dex */
public interface F0 extends G0 {

    /* compiled from: MessageLite.java */
    public interface a extends G0, Cloneable {
        F0 buildPartial();
    }

    void b(CodedOutputStream codedOutputStream);

    int getSerializedSize();

    GeneratedMessageLite.b newBuilderForType();

    GeneratedMessageLite.b toBuilder();

    AbstractC22934w toByteString();
}
