package com.avito.android.hotel_available_rooms.konveyor.filter;

import TV0.g;
import Y41.p;
import Y61.k;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.hotel_available_rooms.di.z;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomFilterBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/filter/a;", "LTV0/b;", "Lcom/avito/android/hotel_available_rooms/konveyor/filter/g;", "Lcom/avito/android/hotel_available_rooms/konveyor/filter/HotelRoomFilterItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<g, HotelRoomFilterItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f162912a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Locale f162913b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f162914c = new g.a<>(R.layout.hotel_room_filter_item, new C4761a());

    /* compiled from: HotelRoomFilterBlueprint.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/hotel_available_rooms/konveyor/filter/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/hotel_available_rooms/konveyor/filter/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.hotel_available_rooms.konveyor.filter.a$a, reason: collision with other inner class name */
    public static final class C4761a extends N implements p<ViewGroup, View, h> {
        public C4761a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            Configuration configuration = new Configuration(view2.getResources().getConfiguration());
            configuration.setLocale(a.this.f162913b);
            return new h(view2, view2.getContext().createConfigurationContext(configuration).getResources());
        }
    }

    @Inject
    public a(@k e eVar, @z @k Locale locale) {
        this.f162912a = eVar;
        this.f162913b = locale;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f162912a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f162914c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof HotelRoomFilterItem;
    }
}
