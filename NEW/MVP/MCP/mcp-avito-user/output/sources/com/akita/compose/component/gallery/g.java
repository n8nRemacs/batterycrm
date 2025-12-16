package com.akita.compose.component.gallery;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.C22061e3;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: Gallery.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/k0;", "Landroidx/compose/ui/layout/h0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/k0;Landroidx/compose/ui/layout/h0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.q<InterfaceC22369k0, InterfaceC22363h0, C22712b, InterfaceC22367j0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w0 f61596l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f61597m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Configuration f61598n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f61599o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e f61600p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(w0 w0Var, u uVar, Configuration configuration, Context context, e eVar) {
        super(3);
        this.f61596l = w0Var;
        this.f61597m = uVar;
        this.f61598n = configuration;
        this.f61599o = context;
        this.f61600p = eVar;
    }

    @Override // Y41.q
    public final InterfaceC22367j0 invoke(InterfaceC22369k0 interfaceC22369k0, InterfaceC22363h0 interfaceC22363h0, C22712b c22712b) {
        float fJ2;
        float fM02;
        InterfaceC22369k0 interfaceC22369k02 = interfaceC22369k0;
        InterfaceC22363h0 interfaceC22363h02 = interfaceC22363h0;
        long j12 = c22712b.f42843a;
        int f28948n = this.f61596l.j().getF28948n();
        u uVar = this.f61597m;
        if (f28948n > 1) {
            fJ2 = C22712b.j(j12) - (interfaceC22369k02.M0(uVar.f61628a) * 2);
            fM02 = interfaceC22369k02.M0(o.f61621a);
        } else {
            fJ2 = C22712b.j(j12);
            fM02 = interfaceC22369k02.M0(uVar.f61628a) * 2;
        }
        float f12 = fJ2 - fM02;
        int iB2 = this.f61598n.orientation == 2 ? kotlin.math.b.b(this.f61599o.getResources().getDisplayMetrics().heightPixels * 0.73f) : kotlin.math.b.b(0.75f * f12);
        int iY02 = interfaceC22369k02.y0(uVar.f61631d);
        if (iB2 > iY02) {
            iB2 = iY02;
        }
        int iB3 = kotlin.math.b.b(f12);
        e eVar = this.f61600p;
        ((C22061e3) eVar.f61593a).L3(iB3);
        ((C22061e3) eVar.f61594b).L3(iB2);
        C22712b.a aVar = C22712b.f42842b;
        int iJ2 = C22712b.j(j12);
        aVar.getClass();
        K0 k0I = interfaceC22363h02.I(C22712b.a.c(iJ2, iB2));
        return interfaceC22369k02.L0(k0I.f40345b, k0I.f40346c, P0.c(), new f(k0I));
    }
}
