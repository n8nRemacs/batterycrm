package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.i20;
import com.yandex.mobile.ads.impl.k9;
import com.yandex.mobile.ads.impl.lp;
import com.yandex.mobile.ads.impl.m90;
import com.yandex.mobile.ads.impl.p21;
import java.util.List;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class O implements m90.a, m90.b, lp.g.a, oi1, i20.a, rf {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f383270c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f383271d;

    public /* synthetic */ O(int i12, Object obj, Object obj2) {
        this.f383269b = i12;
        this.f383270c = obj;
        this.f383271d = obj2;
    }

    @Override // com.yandex.mobile.ads.impl.lp.g.a
    public List a(int i12, v91 v91Var, int[] iArr) {
        switch (this.f383269b) {
            case 11:
                return lp.a((lp.c) this.f383270c, (int[]) this.f383271d, i12, v91Var, iArr);
            default:
                return lp.a((lp.c) this.f383270c, (String) this.f383271d, i12, v91Var, iArr);
        }
    }

    @Override // com.yandex.mobile.ads.impl.m90.a
    public void invoke(Object obj) {
        k9 k9Var = (k9) obj;
        switch (this.f383269b) {
            case 0:
                k9Var.getClass();
                break;
            case 1:
            default:
                fo.a((k9.a) this.f383270c, (zc0) this.f383271d, k9Var);
                break;
            case 2:
                k9Var.getClass();
                break;
            case 3:
                k9Var.getClass();
                break;
            case 4:
                k9Var.getClass();
                break;
            case 5:
                k9Var.getClass();
                break;
            case 6:
                fo.a((k9.a) this.f383270c, (ji1) this.f383271d, k9Var);
                break;
            case 7:
                k9Var.getClass();
                break;
            case 8:
                k9Var.getClass();
                break;
            case 9:
                k9Var.getClass();
                break;
        }
    }

    @Override // com.yandex.mobile.ads.impl.oi1
    public Map a() {
        return om.a((om) this.f383270c, (im) this.f383271d);
    }

    @Override // com.yandex.mobile.ads.impl.i20.a
    public void a(g20 g20Var) {
        ((p21) this.f383270c).a((p21.a) this.f383271d, g20Var);
    }

    @Override // com.yandex.mobile.ads.impl.m90.b
    public void a(Object obj, nw nwVar) {
        ((fo) this.f383270c).a((gt0) this.f383271d, (k9) obj, nwVar);
    }

    @Override // com.yandex.mobile.ads.impl.rf
    public void a(String str) {
        ((re) this.f383270c).a((ac1) this.f383271d, str);
    }
}
