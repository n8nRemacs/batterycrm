package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class q81 implements gn {

    /* renamed from: a, reason: collision with root package name */
    private final gn f389109a;

    /* renamed from: b, reason: collision with root package name */
    private final fn f389110b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f389111c;

    /* renamed from: d, reason: collision with root package name */
    private long f389112d;

    public q81(gn gnVar, bh bhVar) {
        this.f389109a = (gn) db.a(gnVar);
        this.f389110b = (fn) db.a(bhVar);
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final long a(kn knVar) {
        long jA2 = this.f389109a.a(knVar);
        this.f389112d = jA2;
        if (jA2 == 0) {
            return 0L;
        }
        if (knVar.f387198g == -1 && jA2 != -1) {
            knVar = knVar.a(jA2);
        }
        this.f389111c = true;
        this.f389110b.a(knVar);
        return this.f389112d;
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final Map<String, List<String>> b() {
        return this.f389109a.b();
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void close() {
        try {
            this.f389109a.close();
        } finally {
            if (this.f389111c) {
                this.f389111c = false;
                this.f389110b.close();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    @j.P
    public final Uri d() {
        return this.f389109a.d();
    }

    @Override // com.yandex.mobile.ads.impl.dn
    public final int read(byte[] bArr, int i12, int i13) {
        if (this.f389112d == 0) {
            return -1;
        }
        int i14 = this.f389109a.read(bArr, i12, i13);
        if (i14 > 0) {
            this.f389110b.write(bArr, i12, i14);
            long j12 = this.f389112d;
            if (j12 != -1) {
                this.f389112d = j12 - i14;
            }
        }
        return i14;
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void a(ua1 ua1Var) {
        ua1Var.getClass();
        this.f389109a.a(ua1Var);
    }
}
