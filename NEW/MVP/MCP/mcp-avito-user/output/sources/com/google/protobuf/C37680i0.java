package com.google.protobuf;

/* compiled from: LazyFieldLite.java */
/* renamed from: com.google.protobuf.i0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37680i0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC37707w0 f362879a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AbstractC37700t f362880b;

    static {
        M.b();
    }

    public final InterfaceC37707w0 a(InterfaceC37707w0 interfaceC37707w0) {
        if (this.f362879a == null) {
            synchronized (this) {
                if (this.f362879a == null) {
                    try {
                        this.f362879a = interfaceC37707w0;
                        this.f362880b = AbstractC37700t.f362954c;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f362879a = interfaceC37707w0;
                        this.f362880b = AbstractC37700t.f362954c;
                    }
                }
            }
        }
        return this.f362879a;
    }

    public final AbstractC37700t b() {
        if (this.f362880b != null) {
            return this.f362880b;
        }
        synchronized (this) {
            try {
                if (this.f362880b != null) {
                    return this.f362880b;
                }
                if (this.f362879a == null) {
                    this.f362880b = AbstractC37700t.f362954c;
                } else {
                    this.f362880b = this.f362879a.toByteString();
                }
                return this.f362880b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37680i0)) {
            return false;
        }
        C37680i0 c37680i0 = (C37680i0) obj;
        InterfaceC37707w0 interfaceC37707w0 = this.f362879a;
        InterfaceC37707w0 interfaceC37707w02 = c37680i0.f362879a;
        return (interfaceC37707w0 == null && interfaceC37707w02 == null) ? b().equals(c37680i0.b()) : (interfaceC37707w0 == null || interfaceC37707w02 == null) ? interfaceC37707w0 != null ? interfaceC37707w0.equals(c37680i0.a(interfaceC37707w0.getDefaultInstanceForType())) : a(interfaceC37707w02.getDefaultInstanceForType()).equals(interfaceC37707w02) : interfaceC37707w0.equals(interfaceC37707w02);
    }

    public int hashCode() {
        return 1;
    }
}
