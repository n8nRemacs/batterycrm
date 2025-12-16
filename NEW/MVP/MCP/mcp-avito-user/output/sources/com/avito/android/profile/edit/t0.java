package com.avito.android.profile.edit;

import com.avito.android.profile.edit.refactoring.adapter.item.InputItem;
import com.avito.android.profile.edit.refactoring.adapter.item.LocationItem;
import com.avito.android.profile.edit.refactoring.adapter.item.PhoneInputItem;
import com.avito.android.profile.edit.refactoring.adapter.item.SubLocationItem;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.K0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SaveProfileInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/t0;", "Lcom/avito/android/profile/edit/i0;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class t0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f222299a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.G f222300b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final V f222301c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f222302d;

    public t0(@Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k com.avito.android.account.G g12, @Y61.k V v12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f222299a = interfaceC34401z0;
        this.f222300b = g12;
        this.f222301c = v12;
        this.f222302d = interfaceC35745a5;
    }

    public static String b(Map map) {
        Location location;
        Object obj = map.get(1L);
        String id2 = null;
        LocationItem locationItem = obj instanceof LocationItem ? (LocationItem) obj : null;
        if (locationItem != null && (location = locationItem.f222256c) != null) {
            id2 = location.getId();
        }
        return id2 == null ? "" : id2;
    }

    @Override // com.avito.android.profile.edit.i0
    @Y61.k
    public final K0 a(@Y61.k Map map) {
        io.reactivex.rxjava3.core.z zVarT;
        String str;
        Profile f222071e = this.f222301c.getF222071e();
        InterfaceC35745a5 interfaceC35745a5 = this.f222302d;
        kotlin.Q q12 = null;
        q12 = null;
        if (f222071e == null || !f222071e.isIncomplete()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object obj = map.get(6L);
            InputItem inputItem = obj instanceof InputItem ? (InputItem) obj : null;
            String str2 = inputItem != null ? inputItem.f222253d : null;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("manager", str2);
            linkedHashMap.put(SearchParamsConverterKt.LOCATION_ID, b(map));
            Object obj2 = map.get(2L);
            SubLocationItem subLocationItem = obj2 instanceof SubLocationItem ? (SubLocationItem) obj2 : null;
            if (subLocationItem != null) {
                int i12 = subLocationItem.f222264d;
                if (i12 == 1) {
                    str = SearchParamsConverterKt.METRO_ID;
                } else if (i12 == 2) {
                    str = SearchParamsConverterKt.DIRECTION_ID;
                } else if (i12 == 4) {
                    str = SearchParamsConverterKt.DISTRICT_ID;
                }
                NameIdEntity nameIdEntity = subLocationItem.f222265e;
                String id2 = nameIdEntity != null ? nameIdEntity.getId() : null;
                q12 = new kotlin.Q(str, id2 != null ? id2 : "");
            }
            if (q12 != null) {
            }
            zVarT = this.f222299a.m(linkedHashMap).x0(interfaceC35745a5.a()).d0(q0.f222237b).T(new s0(this), Integer.MAX_VALUE);
        } else {
            Object obj3 = map.get(4L);
            PhoneInputItem phoneInputItem = obj3 instanceof PhoneInputItem ? (PhoneInputItem) obj3 : null;
            String str3 = phoneInputItem != null ? phoneInputItem.f222260d : null;
            String str4 = str3 != null ? str3 : "";
            zVarT = this.f222300b.getF68056k().S().p(new l0(this, map, str4)).x0(interfaceC35745a5.a()).T(new m0(this), Integer.MAX_VALUE).T(new n0(this, str4), Integer.MAX_VALUE).d0(new o0(str4));
        }
        return zVarT.l0(new p0(this));
    }
}
