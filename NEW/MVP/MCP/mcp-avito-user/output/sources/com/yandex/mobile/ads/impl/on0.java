package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.exo.offline.DownloadRequest;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public final class on0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final com.yandex.mobile.ads.exo.offline.c f388594a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final CopyOnWriteArrayList<String> f388595b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final CopyOnWriteArrayList<zg1> f388596c = new CopyOnWriteArrayList<>();

    public on0(@Y61.k Context context) {
        this.f388594a = gh1.b(context.getApplicationContext());
    }

    public final void a() {
        Iterator<String> it = this.f388595b.iterator();
        while (it.hasNext()) {
            String next = it.next();
            com.yandex.mobile.ads.exo.offline.c cVar = this.f388594a;
            if (cVar != null) {
                cVar.a(next);
            }
        }
        this.f388596c.clear();
    }

    public final void a(@Y61.k String str, @Y61.k zg1 zg1Var) {
        if (this.f388594a != null) {
            Uri uri = Uri.parse(str);
            String strValueOf = String.valueOf(f20.a());
            DownloadRequest downloadRequestA = new DownloadRequest.b(uri, strValueOf).a();
            this.f388596c.add(zg1Var);
            this.f388595b.add(strValueOf);
            this.f388594a.a(new il1(strValueOf, zg1Var));
            this.f388594a.a(downloadRequestA);
            this.f388594a.a();
            return;
        }
        zg1Var.b();
        a();
    }
}
