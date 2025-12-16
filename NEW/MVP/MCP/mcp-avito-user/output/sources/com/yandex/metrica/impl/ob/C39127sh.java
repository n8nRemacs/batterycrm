package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.a;
import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.sh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C39127sh implements a.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f381837a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ File f381838b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Eh f381839c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C38758di f381840d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C39175uh f381841e;

    public C39127sh(C39175uh c39175uh, String str, File file, Eh eh2, C38758di c38758di) {
        this.f381841e = c39175uh;
        this.f381837a = str;
        this.f381838b = file;
        this.f381839c = eh2;
        this.f381840d = c38758di;
    }

    @Override // com.yandex.metrica.coreutils.services.a.c
    public void onWaitFinished() {
        CacheControlHttpsConnectionPerformer cacheControlHttpsConnectionPerformer = this.f381841e.f381970d;
        String str = this.f381837a;
        C39175uh c39175uh = this.f381841e;
        File file = this.f381838b;
        Eh eh2 = this.f381839c;
        C38758di c38758di = this.f381840d;
        c39175uh.getClass();
        cacheControlHttpsConnectionPerformer.a(str, new C39151th(c39175uh, c38758di, file, eh2));
    }
}
