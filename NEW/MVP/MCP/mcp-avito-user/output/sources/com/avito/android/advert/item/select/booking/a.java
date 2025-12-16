package com.avito.android.advert.item.select.booking;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import lf.InterfaceC43762a;

/* compiled from: AutoSelectBookingBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/select/booking/a;", "LTV0/b;", "Lcom/avito/android/advert/item/select/booking/f;", "Lcom/avito/android/advert/item/select/booking/AutoSelectBookingItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<f, AutoSelectBookingItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f79370a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC43762a f79371b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f79372c = new g.a<>(R.layout.auto_select_booking_item, new C2344a());

    /* compiled from: AutoSelectBookingBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/select/booking/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/select/booking/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.select.booking.a$a, reason: collision with other inner class name */
    public static final class C2344a extends N implements p<ViewGroup, View, h> {
        public C2344a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view, a.this.f79371b);
        }
    }

    @Inject
    public a(@k d dVar, @k InterfaceC43762a interfaceC43762a) {
        this.f79370a = dVar;
        this.f79371b = interfaceC43762a;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f79370a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f79372c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AutoSelectBookingItem;
    }
}
