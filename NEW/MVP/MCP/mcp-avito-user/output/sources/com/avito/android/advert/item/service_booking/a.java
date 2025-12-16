package com.avito.android.advert.item.service_booking;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/service_booking/a;", "LTV0/b;", "Lcom/avito/android/advert/item/service_booking/h;", "Lcom/avito/android/advert/item/service_booking/ServiceBookingItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<h, ServiceBookingItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f79825a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f79826b = new g.a<>(R.layout.advert_details_service_booking, C2355a.f79827l);

    /* compiled from: ServiceBookingBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/service_booking/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/service_booking/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.service_booking.a$a, reason: collision with other inner class name */
    public static final class C2355a extends N implements p<ViewGroup, View, k> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2355a f79827l = new C2355a();

        public C2355a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            return new k(view, viewGroup);
        }
    }

    @Inject
    public a(@Y61.k c cVar) {
        this.f79825a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f79825a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f79826b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof ServiceBookingItem) && !((ServiceBookingItem) aVar).f79815f;
    }
}
