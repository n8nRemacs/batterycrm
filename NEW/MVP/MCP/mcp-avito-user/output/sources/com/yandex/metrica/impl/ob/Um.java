package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Um implements Vm {

    /* renamed from: a, reason: collision with root package name */
    public final int f379748a;

    public Um(int i12) {
        this.f379748a = i12;
    }

    @Override // com.yandex.metrica.impl.ob.Vm
    public int a() {
        return this.f379748a;
    }

    public String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("BytesTruncatedInfo{bytesTruncated="), this.f379748a, '}');
    }

    public static Vm a(Vm... vmArr) {
        int iA2 = 0;
        for (Vm vm2 : vmArr) {
            if (vm2 != null) {
                iA2 = vm2.a() + iA2;
            }
        }
        return new Um(iA2);
    }
}
