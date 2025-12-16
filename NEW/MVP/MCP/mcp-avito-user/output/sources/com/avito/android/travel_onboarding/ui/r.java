package com.avito.android.travel_onboarding.ui;

import ZE0.d;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TravelOnboardingContentScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class r extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d.b f302463l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f302464m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(d.b bVar, Y41.l<? super ZE0.a, G0> lVar) {
        super(1);
        this.f302463l = bVar;
        this.f302464m = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        d.b bVar = this.f302463l;
        YE0.i iVar = bVar.f20018b.f19387a;
        ?? r22 = this.f302464m;
        if (iVar != null) {
            m0Var2.c(null, null, new C22096n(-138135105, new l(iVar, r22), true));
        }
        YE0.b bVar2 = bVar.f20018b;
        YE0.e eVar = bVar2.f19389c;
        if (eVar != null ? !eVar.f19399b.isEmpty() : false) {
            m0Var2.c(null, null, new C22096n(-5179722, new o(eVar, r22), true));
        }
        YE0.h hVar = bVar2.f19388b;
        if (hVar != null) {
            m0Var2.c(null, null, new C22096n(-1236472265, new q(hVar, r22), true));
        }
        return G0.f406611a;
    }
}
