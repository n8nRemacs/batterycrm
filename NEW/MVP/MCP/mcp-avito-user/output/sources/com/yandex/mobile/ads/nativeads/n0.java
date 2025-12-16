package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.Pair;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.a51;
import com.yandex.mobile.ads.impl.dn0;
import com.yandex.mobile.ads.impl.oo0;
import com.yandex.mobile.ads.impl.q21;
import com.yandex.mobile.ads.impl.q31;
import com.yandex.mobile.ads.impl.v11;
import com.yandex.mobile.ads.impl.xc1;
import j.N;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class n0 extends v {

    /* renamed from: f, reason: collision with root package name */
    @N
    private final h0 f392694f;

    /* renamed from: g, reason: collision with root package name */
    @N
    private final q21 f392695g;

    public n0(@N h0 h0Var, @N l0 l0Var, @N q21 q21Var, @N AdResponse adResponse) {
        super(l0Var, adResponse);
        this.f392694f = h0Var;
        this.f392695g = q21Var;
    }

    @Override // com.yandex.mobile.ads.nativeads.v
    @N
    @j.k0
    public final Pair<xc1.a, String> a(@N Context context, int i12, boolean z12, boolean z13) {
        v11 v11VarA = this.f392695g.a(context);
        return (v11VarA == null || v11VarA.N()) ? super.a(context, i12, z12, z13) : new Pair<>(xc1.a.f391685b, null);
    }

    @Override // com.yandex.mobile.ads.nativeads.v
    public final xc1 a(@N Context context, xc1.a aVar, boolean z12, int i12) {
        xc1 xc1VarA;
        if (aVar == xc1.a.f391685b) {
            Iterator<u> it = this.f392694f.e().iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    Object obj = (u) it.next();
                    if (obj instanceof j0) {
                        j0 j0Var = (j0) obj;
                        dn0 dn0VarE = j0Var.e();
                        oo0 oo0VarF = j0Var.f();
                        v11 v11VarA = this.f392695g.a(context);
                        boolean z13 = v11VarA == null || v11VarA.N();
                        Iterator<q31> it2 = oo0VarF.e().iterator();
                        while (it2.hasNext()) {
                            int iC2 = z13 ? it2.next().c() : i12;
                            if (z12) {
                                xc1VarA = ((v) dn0VarE).b(context, iC2);
                            } else {
                                xc1VarA = ((v) dn0VarE).a(context, iC2);
                            }
                            if (xc1VarA.e() != xc1.a.f391685b) {
                                break;
                            }
                        }
                        break loop0;
                    }
                } else {
                    aVar = xc1.a.f391689f;
                    break;
                }
            }
        }
        return new xc1(aVar, new a51());
    }
}
