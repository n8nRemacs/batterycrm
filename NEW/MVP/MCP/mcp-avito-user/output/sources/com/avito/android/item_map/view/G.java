package com.avito.android.item_map.view;

import android.location.Location;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.permissions.InterfaceC33034d;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ItemMapPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/location/Location;", "kotlin.jvm.PlatformType", "itemLocation", "Lkotlin/G0;", "invoke", "(Landroid/location/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class G extends kotlin.jvm.internal.N implements Y41.l<Location, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f173412l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(I i12) {
        super(1);
        this.f173412l = i12;
    }

    @Override // Y41.l
    public final G0 invoke(Location location) {
        String str;
        Location location2 = location;
        I i12 = this.f173412l;
        ItemMapState itemMapState = i12.f173414a;
        boolean z12 = itemMapState.f173445r;
        V v12 = i12.f173423j;
        InterfaceC33034d interfaceC33034d = i12.f173417d;
        if (v12 != null) {
            v12.b(new AvitoMapPoint(location2.getLatitude(), location2.getLongitude(), null, 4, null), interfaceC33034d.i(), z12, itemMapState.f173446s, i12.f173415b.f());
        }
        i12.f173414a = ItemMapState.a(i12.f173414a, location2, interfaceC33034d.i(), null, 0.0f, null, false, false, 268435359);
        i12.f173420g.f(location2, null);
        ItemMapState itemMapState2 = i12.f173414a;
        if (!itemMapState2.f173445r) {
            boolean z13 = itemMapState2.f173446s;
            if (z13 && (str = itemMapState2.f173429b) != null) {
                i12.f173421h.f(location2, str);
            }
            AvitoMapPoint avitoMapPoint = i12.f173414a.f173430c;
            if (avitoMapPoint != null) {
                i12.f173419f.b(avitoMapPoint, z13);
            }
        }
        i12.f173414a = ItemMapState.a(i12.f173414a, null, false, null, 0.0f, null, false, false, 268369919);
        return G0.f406611a;
    }
}
