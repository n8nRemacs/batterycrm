package com.avito.android.competitor_analytics.ui;

import androidx.compose.foundation.layout.InterfaceC20611q1;
import androidx.compose.foundation.layout.R1;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsChartMetrics.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/q1;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/q1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.competitor_analytics.ui.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29530g extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20611q1, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f124739l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f124740m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AttributedText f124741n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29530g(String str, String str2, AttributedText attributedText) {
        super(3);
        this.f124739l = str;
        this.f124740m = str2;
        this.f124741n = attributedText;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(InterfaceC20611q1 interfaceC20611q1, androidx.compose.runtime.A a12, Integer num) {
        InterfaceC20611q1 interfaceC20611q12 = interfaceC20611q1;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(interfaceC20611q12) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            r.f(this.f124739l, C22501m2.a(aVar, "metrics_chart_items_total_" + this.f124740m), a13, 0);
            AttributedText attributedText = this.f124741n;
            if (attributedText != null) {
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarM = R1.m(aVar, 0.0f, 0.0f, 0.0f, 4, 7);
                InterfaceC22215f.f39074a.getClass();
                r.b(attributedText, interfaceC20611q12.c(vVarM, InterfaceC22215f.a.f39087m), a13, 8);
            }
        }
        return kotlin.G0.f406611a;
    }
}
