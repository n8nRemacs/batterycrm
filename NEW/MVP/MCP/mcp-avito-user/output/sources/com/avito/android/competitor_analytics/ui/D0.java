package com.avito.android.competitor_analytics.ui;

import androidx.compose.foundation.layout.R1;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsSuggestsV2.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class D0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f124603l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(boolean z12) {
        super(2);
        this.f124603l = z12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(com.akita.compose.theme.re23.e.f64563h0, 0, a13);
            boolean z12 = !this.f124603l;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.d.a(eVarA, z12, C22501m2.a(R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 2, 0.0f, 0.0f, 13), "suggests_expand_icon"), a13, 392, 0);
        }
        return kotlin.G0.f406611a;
    }
}
