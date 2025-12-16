package com.avito.android.service_booking_common.blueprints.contact;

import com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SbContactItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f276298l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f276299m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, h hVar) {
        super(0);
        this.f276298l = hVar;
        this.f276299m = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity = this.f276298l.f276304d;
        if (serviceBookingItemDetailsActivity != null) {
            serviceBookingItemDetailsActivity.c2(this.f276299m);
        }
        return G0.f406611a;
    }
}
