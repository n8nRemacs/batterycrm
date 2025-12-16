package com.avito.android.competitor_analytics.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.ui.platform.C22501m2;
import com.avito.android.competitor_analytics.domain.model.ActionButton;
import com.avito.android.competitor_analytics.mvi.entity.b;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsFooter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class D extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.b f124600l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b.e f124601m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124602n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D(com.avito.android.competitor_analytics.mvi.entity.b bVar, b.e eVar, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar) {
        super(3);
        this.f124600l = bVar;
        this.f124601m = eVar;
        this.f124602n = lVar;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            com.avito.android.competitor_analytics.mvi.entity.b bVar = this.f124600l;
            b.g gVar = bVar.f124479j;
            ActionButton actionButton = gVar != null ? gVar.f124506f : null;
            Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar = this.f124602n;
            if (actionButton == null) {
                a13.C(-549499620);
                I.c(this.f124601m, lVar, a13, 8);
                a13.h();
            } else {
                a13.C(-549392112);
                com.akita.compose.component.button.m.c(bVar.f124479j.f124506f.f124315a, new C(lVar, bVar), com.avito.android.actions_sheet.a.o(com.akita.compose.theme.re23.b.f63983a, a13), C22501m2.a(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), "footer_metrics_button"), null, null, null, false, false, null, a13, 3584, 1008);
                a13.h();
            }
        }
        return kotlin.G0.f406611a;
    }
}
