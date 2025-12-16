package com.avito.android.str_booking.ui.calculation;

import Jx0.C14258a;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingCalculationPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f285966l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f285967m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, g gVar) {
        super(0);
        this.f285966l = dVar;
        this.f285967m = gVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        SuggestAnalyticsEvent suggestAnalyticsEvent = this.f285966l.f285961c;
        if (suggestAnalyticsEvent != null) {
            g gVar = this.f285967m;
            C14258a.f9179c.getClass();
            gVar.f285968b.c(C14258a.C0546a.a(suggestAnalyticsEvent));
        }
        return G0.f406611a;
    }
}
