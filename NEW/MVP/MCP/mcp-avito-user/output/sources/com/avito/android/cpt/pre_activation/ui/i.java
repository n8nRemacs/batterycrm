package com.avito.android.cpt.pre_activation.ui;

import Xr.InterfaceC17040a;
import Xr.InterfaceC17041b;
import Y41.l;
import Y41.p;
import android.os.Bundle;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PreActivationScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class i extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Xr.c f126772l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<InterfaceC17040a, G0> f126773m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC17041b> f126774n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p<DeepLink, Boolean, G0> f126775o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f126776p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l<Bundle, G0> f126777q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f126778r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Xr.c cVar, l lVar, InterfaceC43160i interfaceC43160i, p pVar, com.avito.android.lib.design.bottom_sheet.d dVar, l lVar2, v vVar, int i12) {
        super(2);
        this.f126772l = cVar;
        this.f126773m = lVar;
        this.f126774n = interfaceC43160i;
        this.f126775o = pVar;
        this.f126776p = dVar;
        this.f126777q = lVar2;
        this.f126778r = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(33289);
        l<Bundle, G0> lVar = this.f126777q;
        p<DeepLink, Boolean, G0> pVar = this.f126775o;
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f126776p;
        j.a(this.f126772l, this.f126773m, this.f126774n, pVar, dVar, lVar, a12, iA2);
        return G0.f406611a;
    }
}
