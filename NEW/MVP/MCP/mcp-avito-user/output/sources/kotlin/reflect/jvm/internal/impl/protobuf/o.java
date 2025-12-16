package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: MessageLite.java */
/* loaded from: classes8.dex */
public interface o extends p {

    /* compiled from: MessageLite.java */
    public interface a extends Cloneable, p {
        o build();

        a d(e eVar, f fVar);
    }

    void a(CodedOutputStream codedOutputStream);

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();
}
