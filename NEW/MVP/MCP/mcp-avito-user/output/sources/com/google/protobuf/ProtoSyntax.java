package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ProtoSyntax {

    /* renamed from: b, reason: collision with root package name */
    public static final ProtoSyntax f362731b;

    /* renamed from: c, reason: collision with root package name */
    public static final ProtoSyntax f362732c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ProtoSyntax[] f362733d;

    static {
        ProtoSyntax protoSyntax = new ProtoSyntax("PROTO2", 0);
        f362731b = protoSyntax;
        ProtoSyntax protoSyntax2 = new ProtoSyntax("PROTO3", 1);
        f362732c = protoSyntax2;
        f362733d = new ProtoSyntax[]{protoSyntax, protoSyntax2};
    }

    public ProtoSyntax() {
        throw null;
    }

    public static ProtoSyntax valueOf(String str) {
        return (ProtoSyntax) java.lang.Enum.valueOf(ProtoSyntax.class, str);
    }

    public static ProtoSyntax[] values() {
        return (ProtoSyntax[]) f362733d.clone();
    }
}
