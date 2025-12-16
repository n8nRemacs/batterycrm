package com.yandex.mobile.ads.impl;

import com.yandex.metrica.YandexMetrica;

/* loaded from: classes8.dex */
public final class pa {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final je1 f388752a;

    public pa(@Y61.k je1 je1Var) {
        this.f388752a = je1Var;
    }

    public final void a() {
        try {
            String libraryVersion = YandexMetrica.getLibraryVersion();
            this.f388752a.getClass();
            ie1 ie1VarA = je1.a("4.0.0");
            if (ie1VarA == null) {
                return;
            }
            this.f388752a.getClass();
            ie1 ie1VarA2 = je1.a("6.0.0");
            if (ie1VarA2 == null) {
                return;
            }
            this.f388752a.getClass();
            ie1 ie1VarA3 = je1.a(libraryVersion);
            if (ie1VarA3 == null || ie1VarA3.compareTo(ie1VarA) < 0 || ie1VarA3.compareTo(ie1VarA2) >= 0) {
                throw new g70(up1.a("Incorrect AppMetrica Version. The minimum supported version of AppMetrica SDK is 4.0.0 (inclusive) and the maximum supported version is 6.0.0 (exclusive). And the current version of AppMetrica SDK is ", libraryVersion));
            }
        } catch (NoClassDefFoundError unused) {
            throw new g70("Incorrect AppMetrica Integration. The minimum supported version of AppMetrica SDK is 4.0.0 (inclusive) and the maximum supported version is 6.0.0 (exclusive). Please, check your AppMetrica integration.");
        }
    }

    public /* synthetic */ pa() {
        this(new je1());
    }
}
