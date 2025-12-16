package com.avito.android.item_map.amenity;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import javax.inject.Inject;
import kotlin.Metadata;
import vO.InterfaceC49241a;

/* compiled from: AmenityButtonsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/amenity/f;", "Lcom/avito/android/item_map/amenity/c;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49241a f173290a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f173291b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f173292c;

    @Inject
    public f(@Y61.k InterfaceC49241a interfaceC49241a, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f173290a = interfaceC49241a;
        this.f173291b = fVar;
        this.f173292c = interfaceC35745a5;
    }

    @Override // com.avito.android.item_map.amenity.c
    @Y61.k
    public final C41982q1 a(@Y61.k AvitoMapPoint avitoMapPoint, @Y61.k String str, @Y61.k String str2) {
        return this.f173290a.a(str, (float) avitoMapPoint.getLatitude(), (float) avitoMapPoint.getLongitude(), str2).d0(new com.avito.android.blueprints.publish.reg_number.d(2, d.f173288l)).r0(P2.c.f318721a).m0(new com.avito.android.blueprints.publish.reg_number.d(3, new e(this))).x0(this.f173292c.a());
    }
}
