package com.avito.android.service_booking_common.blueprints.date;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.service_booking_common.di.InterfaceC34925a;
import com.avito.android.service_booking_common.di.InterfaceC34927c;
import com.avito.android.service_booking_common.di.InterfaceC34928d;
import com.avito.android.util.InterfaceC35945t1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qt0.C47440d;

/* compiled from: SbDateBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/date/a;", "LTV0/b;", "Lcom/avito/android/service_booking_common/blueprints/date/s;", "Lqt0/d;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<s, C47440d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f276314a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f276315b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f276316c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f276317d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f276318e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<Long> f276319f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_common.blueprints.date.date_list.c f276320g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f276321h = new g.a<>(R.layout.service_booking_item_date, new C8205a());

    /* compiled from: SbDateBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/service_booking_common/blueprints/date/s;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/service_booking_common/blueprints/date/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service_booking_common.blueprints.date.a$a, reason: collision with other inner class name */
    public static final class C8205a extends N implements Y41.p<ViewGroup, View, s> {
        public C8205a() {
            super(2);
        }

        @Override // Y41.p
        public final s invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            a aVar = a.this;
            return new s(view2, aVar.f276315b, aVar.f276316c, aVar.f276317d, aVar.f276318e, aVar.f276319f, aVar.f276320g);
        }
    }

    @Inject
    public a(@Y61.k d dVar, @InterfaceC34927c @Y61.k com.avito.konveyor.adapter.j jVar, @InterfaceC34927c @Y61.k com.avito.konveyor.adapter.a aVar, @InterfaceC34928d @Y61.k com.avito.konveyor.adapter.j jVar2, @InterfaceC34928d @Y61.k com.avito.konveyor.adapter.a aVar2, @Y61.k @InterfaceC34925a InterfaceC35945t1<Long> interfaceC35945t1, @Y61.k com.avito.android.service_booking_common.blueprints.date.date_list.c cVar) {
        this.f276314a = dVar;
        this.f276315b = jVar;
        this.f276316c = aVar;
        this.f276317d = jVar2;
        this.f276318e = aVar2;
        this.f276319f = interfaceC35945t1;
        this.f276320g = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f276314a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f276321h;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof C47440d;
    }
}
