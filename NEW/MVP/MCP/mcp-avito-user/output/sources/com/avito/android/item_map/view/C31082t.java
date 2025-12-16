package com.avito.android.item_map.view;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.item_map.ItemMapFragment;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.RouteButtons;
import kotlin.G0;
import kotlin.Metadata;
import pO.InterfaceC46983a;

/* compiled from: ItemMapPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapPoint;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/avito_map/AvitoMapPoint;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.item_map.view.t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31082t extends kotlin.jvm.internal.N implements Y41.l<AvitoMapPoint, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f173635l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31082t(I i12) {
        super(1);
        this.f173635l = i12;
    }

    @Override // Y41.l
    public final G0 invoke(AvitoMapPoint avitoMapPoint) {
        String str;
        AvitoMapPoint avitoMapPoint2 = avitoMapPoint;
        I i12 = this.f173635l;
        RouteButtons routeButtons = i12.f173414a.f173442o;
        InterfaceC46983a interfaceC46983a = i12.f173421h;
        if (routeButtons == null || !routeButtons.getNeedToNewRouteFlow()) {
            Coordinates coordinates = new Coordinates(avitoMapPoint2.getLatitude(), avitoMapPoint2.getLongitude());
            String str2 = i12.f173414a.f173429b;
            if (str2 != null) {
                interfaceC46983a.f(null, str2);
            }
            ItemMapFragment itemMapFragment = i12.f173424k;
            if (itemMapFragment != null) {
                itemMapFragment.D5(coordinates);
            }
        } else {
            com.avito.android.item_map.routes.k kVar = i12.f173419f;
            kVar.d(true);
            if (kVar.e()) {
                I.g(i12, 1);
            } else {
                ItemMapState itemMapStateA = ItemMapState.a(i12.f173414a, null, false, null, 0.0f, null, false, true, 268304383);
                i12.f173414a = itemMapStateA;
                if (itemMapStateA.f173446s && (str = itemMapStateA.f173429b) != null) {
                    interfaceC46983a.f(itemMapStateA.f173434g, str);
                }
                AvitoMapPoint avitoMapPoint3 = i12.f173414a.f173430c;
                if (avitoMapPoint3 != null) {
                    kVar.b(avitoMapPoint3, true);
                }
            }
        }
        return G0.f406611a;
    }
}
