package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.fy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public abstract class rx<T extends fy<T>> extends b00 {

    /* renamed from: A, reason: collision with root package name */
    private T f389686A;

    /* renamed from: B, reason: collision with root package name */
    @j.N
    private final ay<T> f389687B;

    /* renamed from: C, reason: collision with root package name */
    @j.N
    private final e00 f389688C;

    /* renamed from: w, reason: collision with root package name */
    @j.N
    private final nx f389689w;

    /* renamed from: x, reason: collision with root package name */
    @j.P
    private lx<T> f389690x;

    /* renamed from: y, reason: collision with root package name */
    @j.P
    private lx<T> f389691y;

    /* renamed from: z, reason: collision with root package name */
    @j.N
    private final sx<T> f389692z;

    public rx(@j.N Context context, @j.N ko1 ko1Var, @j.N y6 y6Var, @j.N sx<T> sxVar, @j.N a4 a4Var, @j.N ay<T> ayVar, @j.N e00 e00Var) {
        super(context, y6Var, a4Var);
        C39314d0.a(context);
        this.f389688C = e00Var;
        this.f389687B = ayVar;
        this.f389692z = sxVar;
        this.f389689w = new nx(ko1Var);
        a(com.yandex.mobile.ads.banner.b.a(com.yandex.mobile.ads.banner.a.f382509a));
    }

    @j.N
    public abstract lx<T> a(@j.N mx mxVar);

    @Override // com.yandex.mobile.ads.impl.re
    public final void a(@j.N w2 w2Var) {
        this.f389692z.a(w2Var);
    }

    @Override // com.yandex.mobile.ads.impl.re
    public final void b(@j.N g5 g5Var) {
        super.b(g5Var);
    }

    @Override // com.yandex.mobile.ads.impl.re
    public final void m() {
        this.f389692z.a(i5.f386320l);
    }

    @Override // com.yandex.mobile.ads.impl.re
    public final void n() {
        T t12 = this.f389686A;
        if (t12 != null) {
            this.f389692z.a(t12);
        } else {
            this.f389692z.a(i5.f386311c);
        }
    }

    public final void t() {
        if (g7.a((b00) this)) {
            return;
        }
        Context context = this.f389494b;
        Iterator it = new HashSet(Arrays.asList(this.f389691y, this.f389690x)).iterator();
        while (it.hasNext()) {
            lx lxVar = (lx) it.next();
            if (lxVar != null) {
                lxVar.a(context);
            }
        }
        c();
        getClass().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.re
    public void a(@j.N AdResponse<String> adResponse) {
        super.a((AdResponse<T>) adResponse);
        this.f389688C.a(adResponse);
        lx<T> lxVarA = a(this.f389689w.a(adResponse));
        Context contextA = C39314d0.a();
        if (contextA == null) {
            contextA = this.f389494b;
        }
        lxVarA.a(contextA, adResponse);
        this.f389691y = this.f389690x;
        this.f389690x = lxVarA;
        this.f389686A = (T) this.f389687B.a(adResponse, d(), lxVarA);
    }
}
