package com.avito.android.extended_profile_map.mvi;

import AA.b;
import AA.d;
import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink;
import com.avito.android.extended_profile_map.ExtendedProfileAddress;
import com.avito.android.remote.model.DeeplinkAction;
import java.util.LinkedHashMap;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileMapReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_map/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "LAA/b;", "LAA/d;", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements u<AA.b, AA.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_map.bottom_sheet.h f151308b;

    @Inject
    public n(@Y61.k com.avito.android.extended_profile_map.bottom_sheet.h hVar) {
        this.f151308b = hVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final AA.d a(AA.b bVar, AA.d dVar) {
        DeeplinkAction deeplinkAction;
        AA.b bVar2 = bVar;
        AA.d dVar2 = dVar;
        boolean z12 = bVar2 instanceof b.f;
        com.avito.android.extended_profile_map.bottom_sheet.h hVar = this.f151308b;
        DeepLink deepLink = null;
        if (z12) {
            b.f fVar = (b.f) bVar2;
            Set<ExtendedProfileAddress> set = fVar.f177b;
            ExtendedProfileAddress extendedProfileAddress = set.size() == 1 ? (ExtendedProfileAddress) C42745f0.D(set) : null;
            return AA.d.a(dVar2, fVar.f177b, fVar.f176a, extendedProfileAddress, extendedProfileAddress != null ? hVar.a(extendedProfileAddress) : null, null, null, 48);
        }
        if (bVar2 instanceof b.e) {
            ExtendedProfileAddress extendedProfileAddress2 = ((b.e) bVar2).f175a;
            return AA.d.a(dVar2, null, null, extendedProfileAddress2, hVar.a(extendedProfileAddress2), null, null, 51);
        }
        if (bVar2.equals(b.a.f169a)) {
            return AA.d.a(dVar2, null, null, null, null, null, null, 51);
        }
        if (bVar2.equals(b.c.f171a)) {
            return AA.d.a(dVar2, null, null, null, null, null, null, 43);
        }
        if (bVar2 instanceof b.g) {
            com.avito.android.extended_profile_map.bottom_sheet.g gVar = dVar2.f187d;
            return AA.d.a(dVar2, null, null, null, gVar != null ? new com.avito.android.extended_profile_map.bottom_sheet.g(gVar.f151201a, gVar.f151202b, gVar.f151203c, gVar.f151204d, gVar.f151205e, gVar.f151206f, gVar.f151207g, ((b.g) bVar2).f178a) : null, null, null, 55);
        }
        if (bVar2 instanceof b.h) {
            b.h hVar2 = (b.h) bVar2;
            return AA.d.a(dVar2, null, null, null, null, new d.b(hVar2.f179a, hVar2.f180b), null, 47);
        }
        if (!(bVar2 instanceof b.d)) {
            if (bVar2 instanceof b.C0012b) {
                return dVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(dVar2.f189f);
        b.d dVar3 = (b.d) bVar2;
        com.avito.android.extended_profile_phone_dialog.f fVar2 = dVar3.f173b;
        ExtendedProfilePhoneRequestLink extendedProfilePhoneRequestLink = dVar3.f172a;
        linkedHashMap.put(extendedProfilePhoneRequestLink, fVar2);
        G0 g02 = G0.f406611a;
        AA.d dVarA = AA.d.a(dVar2, null, null, null, null, null, linkedHashMap, 31);
        ExtendedProfileAddress extendedProfileAddress3 = dVar2.f186c;
        if (extendedProfileAddress3 != null && (deeplinkAction = extendedProfileAddress3.f151146i) != null) {
            deepLink = deeplinkAction.getDeepLink();
        }
        return L.f(deepLink, extendedProfilePhoneRequestLink) ? AA.d.a(dVarA, null, null, null, null, new d.b(fVar2, dVar3.f174c), null, 47) : dVarA;
    }
}
