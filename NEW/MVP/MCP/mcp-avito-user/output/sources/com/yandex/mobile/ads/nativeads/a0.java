package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.k7;
import com.yandex.mobile.ads.impl.q21;
import com.yandex.mobile.ads.impl.rl0;
import com.yandex.mobile.ads.impl.v11;
import com.yandex.mobile.ads.impl.xc1;
import j.N;
import j.P;

/* loaded from: classes8.dex */
final class a0 implements k7 {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final f0 f392595a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final rl0 f392596b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private final q21 f392597c = q21.b();

    /* renamed from: d, reason: collision with root package name */
    @N
    private final Context f392598d;

    public a0(@N Context context, @N g gVar, @N rl0 rl0Var) {
        this.f392595a = gVar;
        this.f392596b = rl0Var;
        this.f392598d = context;
    }

    @Override // com.yandex.mobile.ads.impl.k7
    public final boolean a() {
        this.f392596b.getClass();
        v11 v11VarA = this.f392597c.a(this.f392598d);
        return !(v11VarA != null && v11VarA.Z()) || ((e0) this.f392595a.a(false)).b() == xc1.a.f391685b;
    }
}
