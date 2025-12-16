package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* loaded from: classes8.dex */
public final class wn1 implements xd0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final be0 f391451a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final yd0 f391452b = new yd0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ae0 f391453c = new ae0();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final zd0 f391454d = new zd0();

    public wn1(@j.N AdResponse<?> adResponse) {
        this.f391451a = new be0(adResponse);
    }

    @Override // com.yandex.mobile.ads.impl.xd0
    @j.P
    public final vd0 a(@j.N CustomizableMediaView customizableMediaView, @j.N n2 n2Var, @j.N w20 w20Var, @j.N n30 n30Var, @j.N om0 om0Var, @j.N cm0 cm0Var, @j.P l31 l31Var, @j.P rd0 rd0Var) {
        sn0 sn0VarA = om0Var.a();
        ro0 ro0VarB = om0Var.b();
        vd0 vd0VarA = null;
        if (rd0Var == null) {
            return null;
        }
        List<b30> listA = rd0Var.a();
        rb0 rb0VarB = rd0Var.b();
        Context context = customizableMediaView.getContext();
        if (sn0VarA != null) {
            vd0VarA = this.f391451a.a(customizableMediaView, n2Var, n30Var, sn0VarA, cm0Var);
        } else if (ro0VarB != null && rb0VarB != null && g7.a(context)) {
            try {
                vd0VarA = this.f391454d.a(customizableMediaView, rb0VarB, n30Var, ro0VarB, n2Var);
            } catch (kl1 unused) {
            }
        }
        if (vd0VarA != null || listA == null || listA.isEmpty()) {
            return vd0VarA;
        }
        if (listA.size() == 1) {
            return this.f391452b.a(customizableMediaView, w20Var, n2Var);
        }
        try {
            return this.f391453c.a(customizableMediaView, w20Var, listA, n2Var, l31Var);
        } catch (Throwable unused2) {
            return this.f391452b.a(customizableMediaView, w20Var, n2Var);
        }
    }
}
