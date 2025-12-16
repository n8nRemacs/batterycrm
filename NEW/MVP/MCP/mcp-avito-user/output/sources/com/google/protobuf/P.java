package com.google.protobuf;

/* compiled from: ExtensionSchemas.java */
@InterfaceC37706w
/* loaded from: classes7.dex */
final class P {

    /* renamed from: a, reason: collision with root package name */
    public static final O f362729a = new O();

    /* renamed from: b, reason: collision with root package name */
    public static final N<?> f362730b;

    static {
        N<?> n12;
        try {
            n12 = (N) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            n12 = null;
        }
        f362730b = n12;
    }
}
