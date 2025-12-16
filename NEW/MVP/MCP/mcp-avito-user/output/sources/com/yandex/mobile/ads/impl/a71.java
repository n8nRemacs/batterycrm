package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class a71 implements gn {

    /* renamed from: a, reason: collision with root package name */
    private final gn f383429a;

    /* renamed from: b, reason: collision with root package name */
    private long f383430b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f383431c = Uri.EMPTY;

    public a71(gn gnVar) {
        this.f383429a = (gn) db.a(gnVar);
        Collections.emptyMap();
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final long a(kn knVar) {
        this.f383431c = knVar.f387192a;
        Collections.emptyMap();
        long jA2 = this.f383429a.a(knVar);
        Uri uriD = this.f383429a.d();
        uriD.getClass();
        this.f383431c = uriD;
        this.f383429a.b();
        return jA2;
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final Map<String, List<String>> b() {
        return this.f383429a.b();
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void close() {
        this.f383429a.close();
    }

    @Override // com.yandex.mobile.ads.impl.gn
    @j.P
    public final Uri d() {
        return this.f383429a.d();
    }

    public final long f() {
        return this.f383430b;
    }

    public final Uri g() {
        return this.f383431c;
    }

    @Override // com.yandex.mobile.ads.impl.dn
    public final int read(byte[] bArr, int i12, int i13) {
        int i14 = this.f383429a.read(bArr, i12, i13);
        if (i14 != -1) {
            this.f383430b += i14;
        }
        return i14;
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void a(ua1 ua1Var) {
        ua1Var.getClass();
        this.f383429a.a(ua1Var);
    }
}
