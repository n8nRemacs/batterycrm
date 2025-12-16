package com.avito.android.competitor_analytics.ui;

import androidx.compose.ui.platform.C22501m2;
import com.avito.android.competitor_analytics.mvi.entity.b;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsNavBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class X extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b.g.c f124711l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(b.g.c cVar) {
        super(2);
        this.f124711l = cVar;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            r.d(this.f124711l.f124521a, C22501m2.a(androidx.compose.ui.v.f42878y1, "nav_bar_title_hint"), a13, 48);
        }
        return kotlin.G0.f406611a;
    }
}
