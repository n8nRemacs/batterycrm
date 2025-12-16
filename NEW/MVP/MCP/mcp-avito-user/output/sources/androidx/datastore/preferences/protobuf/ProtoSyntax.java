package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ProtoSyntax {

    /* renamed from: b, reason: collision with root package name */
    public static final ProtoSyntax f45735b;

    /* renamed from: c, reason: collision with root package name */
    public static final ProtoSyntax f45736c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ProtoSyntax[] f45737d;

    static {
        ProtoSyntax protoSyntax = new ProtoSyntax("PROTO2", 0);
        f45735b = protoSyntax;
        ProtoSyntax protoSyntax2 = new ProtoSyntax("PROTO3", 1);
        f45736c = protoSyntax2;
        f45737d = new ProtoSyntax[]{protoSyntax, protoSyntax2};
    }

    public ProtoSyntax() {
        throw null;
    }

    public static ProtoSyntax valueOf(String str) {
        return (ProtoSyntax) Enum.valueOf(ProtoSyntax.class, str);
    }

    public static ProtoSyntax[] values() {
        return (ProtoSyntax[]) f45737d.clone();
    }
}
