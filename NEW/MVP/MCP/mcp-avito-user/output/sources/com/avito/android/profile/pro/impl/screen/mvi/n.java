package com.avito.android.profile.pro.impl.screen.mvi;

import D90.b;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.profile.pro.impl.screen.item.geo_banner.ProfileProGeoBannerItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "LD90/b;", "LD90/d;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements u<D90.b, D90.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v90.e f223726b;

    @Inject
    public n(@Y61.k v90.e eVar) {
        this.f223726b = eVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final D90.d a(D90.b bVar, D90.d dVar) {
        D90.b bVar2 = bVar;
        D90.d dVar2 = dVar;
        if (bVar2.equals(b.g.f3024a)) {
            return D90.d.a(dVar2, null, true, null, null, false, null, null, null, 0, 0, null, null, null, 8189);
        }
        if (bVar2 instanceof b.c) {
            return D90.d.a(dVar2, null, false, z.k(((b.c) bVar2).f3020a), null, false, null, null, null, 0, 0, null, null, null, 8185);
        }
        if (bVar2 instanceof b.a) {
            b.a aVar = (b.a) bVar2;
            Boolean bool = aVar.f3012d;
            return D90.d.a(dVar2, aVar.f3009a, false, null, null, bool != null ? bool.booleanValue() : false, aVar.f3010b, aVar.f3011c, aVar.f3013e, aVar.f3014f, aVar.f3015g, aVar.f3016h, aVar.f3017i, null, 4104);
        }
        if (bVar2 instanceof b.o) {
            return D90.d.a(dVar2, null, false, null, null, false, null, null, null, 0, 0, null, null, null, 8189);
        }
        if (bVar2 instanceof b.v) {
            return D90.d.a(dVar2, null, false, null, ((b.v) bVar2).f3041a, false, null, null, null, 0, 0, null, null, null, 8183);
        }
        if (bVar2 instanceof b.p) {
            return D90.d.a(dVar2, null, false, null, null, false, this.f223726b.b(dVar2), null, null, 0, 0, null, null, null, 8159);
        }
        if (!(bVar2 instanceof b.e)) {
            if (!(bVar2 instanceof b.u)) {
                return bVar2 instanceof b.w ? D90.d.a(dVar2, null, false, null, null, false, null, null, null, 0, 0, null, null, ((b.w) bVar2).f3042a, 4095) : dVar2;
            }
            b.u uVar = (b.u) bVar2;
            return D90.d.a(dVar2, null, false, null, null, false, null, null, null, uVar.f3039a, uVar.f3040b, null, null, null, 7423);
        }
        b.e eVar = (b.e) bVar2;
        List<com.avito.conveyor_item.a> list = dVar2.f3066f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) obj;
            ProfileProGeoBannerItem profileProGeoBannerItem = eVar.f3022a;
            if (!L.f(aVar2, profileProGeoBannerItem) && !L.f(aVar2.getF217296b(), profileProGeoBannerItem.f223261b)) {
                arrayList.add(obj);
            }
        }
        return D90.d.a(dVar2, null, false, null, null, false, arrayList, null, null, 0, 0, null, null, null, 8159);
    }
}
