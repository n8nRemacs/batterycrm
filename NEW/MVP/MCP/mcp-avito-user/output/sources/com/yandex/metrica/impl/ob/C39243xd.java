package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.xd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C39243xd implements InterfaceC39219wd {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f382188a;

    public C39243xd(boolean z12) {
        this.f382188a = z12;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39219wd
    public boolean a(@j.N String str) {
        if ("android.permission.ACCESS_FINE_LOCATION".equals(str) || "android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            return this.f382188a;
        }
        return true;
    }

    public String toString() {
        return androidx.appcompat.app.r.x(new StringBuilder("LocationFlagStrategy{mEnabled="), this.f382188a, '}');
    }
}
