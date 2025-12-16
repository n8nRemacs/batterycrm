package com.avito.android.service_booking_common.blueprints.check_price_list;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qt0.C47439c;

/* compiled from: SbCheckPriceListBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/check_price_list/a;", "LTV0/b;", "Lcom/avito/android/service_booking_common/blueprints/check_price_list/p;", "Lqt0/c;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<p, C47439c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f276244a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f276245b = new g.a<>(R.layout.service_booking_item_check_price_list, C8202a.f276246l);

    /* compiled from: SbCheckPriceListBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/service_booking_common/blueprints/check_price_list/p;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/service_booking_common/blueprints/check_price_list/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service_booking_common.blueprints.check_price_list.a$a, reason: collision with other inner class name */
    public static final class C8202a extends N implements Y41.p<ViewGroup, View, p> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8202a f276246l = new C8202a();

        public C8202a() {
            super(2);
        }

        @Override // Y41.p
        public final p invoke(ViewGroup viewGroup, View view) {
            return new p(view);
        }
    }

    @Inject
    public a(@Y61.k d dVar) {
        this.f276244a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f276244a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f276245b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof C47439c;
    }
}
