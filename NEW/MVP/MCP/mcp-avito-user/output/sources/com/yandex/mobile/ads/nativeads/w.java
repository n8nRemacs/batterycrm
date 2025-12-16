package com.yandex.mobile.ads.nativeads;

import android.view.View;
import com.yandex.mobile.ads.impl.cm0;
import com.yandex.mobile.ads.impl.eb;
import com.yandex.mobile.ads.impl.fb;
import com.yandex.mobile.ads.impl.hb;
import com.yandex.mobile.ads.impl.jl0;
import com.yandex.mobile.ads.impl.l31;
import com.yandex.mobile.ads.impl.n2;
import com.yandex.mobile.ads.impl.n30;
import com.yandex.mobile.ads.impl.ok0;
import com.yandex.mobile.ads.impl.om0;
import com.yandex.mobile.ads.impl.oo0;
import com.yandex.mobile.ads.impl.rb;
import com.yandex.mobile.ads.impl.w20;
import com.yandex.mobile.ads.impl.wd0;
import j.N;
import j.P;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final c f392890a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final w20 f392891b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final c0 f392892c;

    /* renamed from: d, reason: collision with root package name */
    @N
    private final HashMap f392893d;

    public w(@N jl0 jl0Var, @N n2 n2Var, @N w20 w20Var, @N n30 n30Var, @N c cVar, @N ok0 ok0Var, @N rb rbVar, @N om0 om0Var, @N cm0 cm0Var, @N oo0 oo0Var, @P l31 l31Var) {
        this.f392890a = cVar;
        this.f392891b = w20Var;
        wd0 wd0Var = new wd0(rbVar, n2Var, n30Var, ok0Var.c(), l31Var);
        c0 c0VarA = jl0Var.a();
        this.f392892c = c0VarA;
        this.f392893d = new hb(c0VarA, w20Var, wd0Var, om0Var, cm0Var, oo0Var).a();
    }

    public final void a() {
        for (fb fbVar : this.f392893d.values()) {
            if (fbVar != null) {
                fbVar.a();
            }
        }
    }

    public final void b() {
        for (fb fbVar : this.f392893d.values()) {
            if (fbVar != null) {
                fbVar.destroy();
            }
        }
    }

    @N
    public final Map<String, fb<?>> c() {
        return this.f392893d;
    }

    @N
    public final w20 d() {
        return this.f392891b;
    }

    @P
    public final View e() {
        return this.f392892c.k();
    }

    @N
    public final c f() {
        return this.f392890a;
    }

    @N
    public final c0 g() {
        return this.f392892c;
    }

    @P
    public final fb a(@P eb ebVar) {
        if (ebVar != null) {
            return (fb) this.f392893d.get(ebVar.b());
        }
        return null;
    }
}
