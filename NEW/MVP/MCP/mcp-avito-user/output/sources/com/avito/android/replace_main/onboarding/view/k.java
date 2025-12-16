package com.avito.android.replace_main.onboarding.view;

import Cm0.C13324a;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: ReplaceMainOnboardingContent.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class k extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C13324a f254551l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f254552m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T f254553n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f254554o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f254555p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f254556q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f254557r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(C13324a c13324a, Y41.a aVar, Y41.a aVar2, Y41.l lVar, InterfaceC22204y1 interfaceC22204y1, p pVar, T t12) {
        super(2);
        this.f254551l = c13324a;
        this.f254552m = pVar;
        this.f254553n = t12;
        this.f254554o = interfaceC22204y1;
        this.f254555p = (N) lVar;
        this.f254556q = (N) aVar;
        this.f254557r = (N) aVar2;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r6v2, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r9v2, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            C13324a c13324a = this.f254551l;
            v.a aVar = androidx.compose.ui.v.f42878y1;
            com.avito.android.lib.compose.design.component.attributedtext.a.b(c13324a.f2654a, C22501m2.a(aVar, "modal_title"), 0, null, null, 0, a13, 56, 60);
            float f12 = 6;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(f12, null, a13, 6);
            com.avito.android.lib.compose.design.component.attributedtext.a.b(c13324a.f2655b, C22501m2.a(aVar, "modal_subtitle"), 0, null, null, 0, a13, 56, 60);
            com.akita.compose.foundation.ui.g.a(16, null, a13, 6);
            C13324a.b bVar = c13324a.f2656c;
            ?? r62 = this.f254555p;
            ?? r42 = this.f254556q;
            ?? r92 = this.f254557r;
            i iVar = new i(c13324a, r42, r92, r62, this.f254554o, this.f254552m, this.f254553n);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.button.m.c(bVar.f2663a, iVar, com.akita.compose.theme.re23.b.c(a13).X1(), C22501m2.a(C20588k2.d(aVar, 1.0f), "modal_primary_button"), null, null, null, this.f254554o.getF42167b().booleanValue(), false, null, a13, 3584, 880);
            com.akita.compose.foundation.ui.g.a(f12, null, a13, 6);
            com.akita.compose.component.button.m.c(c13324a.f2657d.f2662a, new j(this.f254552m, c13324a, r92), com.akita.compose.theme.re23.b.c(a13).r2(), C22501m2.a(C20588k2.d(aVar, 1.0f), "modal_secondary_button"), null, null, null, false, false, null, a13, 3584, 1008);
        }
        return G0.f406611a;
    }
}
