package com.avito.android.travel_guest_profile.mvi;

import Dh0.InterfaceC13400a;
import PE0.c;
import QE0.a;
import android.net.Uri;
import com.avito.android.arch.mvi.a;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import com.avito.android.travel_guest_profile.mvi.entity.TravelGuestProfileInternalAction;
import com.avito.android.util.C35755b0;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TravelGuestProfileActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LQE0/a;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "LQE0/d;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<QE0.a, TravelGuestProfileInternalAction, QE0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_guest_profile.domain.interactors.c f302144a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_guest_profile.domain.interactors.f f302145b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_guest_profile.domain.interactors.a f302146c;

    @Inject
    public a(@Y61.k com.avito.android.travel_guest_profile.domain.interactors.c cVar, @Y61.k com.avito.android.travel_guest_profile.domain.interactors.f fVar, @Y61.k com.avito.android.travel_guest_profile.domain.interactors.a aVar) {
        this.f302144a = cVar;
        this.f302145b = fVar;
        this.f302146c = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<TravelGuestProfileInternalAction> b(QE0.a aVar, QE0.d dVar) {
        SearchParametersEntry.SearchParametersBlock.Sort sortCopy$default;
        InterfaceC43160i<TravelGuestProfileInternalAction> interfaceC43160iB;
        QE0.a aVar2 = aVar;
        QE0.d dVar2 = dVar;
        boolean z12 = aVar2 instanceof a.h;
        String str = dVar2.f13623c;
        com.avito.android.travel_guest_profile.domain.interactors.f fVar = this.f302145b;
        SearchParametersEntry.SearchParametersBlock.Sort sort = dVar2.f13625e;
        String str2 = dVar2.f13622b;
        if (z12) {
            InterfaceC43160i<TravelGuestProfileInternalAction> interfaceC43160iA = this.f302144a.a(str2);
            mapC = sort != null ? C35755b0.c(Collections.singletonMap(sort.getParamName(), sort.getSelectedOption())) : null;
            if (mapC == null) {
                mapC = P0.c();
            }
            return C43175k.N(interfaceC43160iA, fVar.a(str2, str, mapC));
        }
        if (aVar2 instanceof a.C0891a) {
            return new C43210w(new TravelGuestProfileInternalAction.OpenDeeplink(((a.C0891a) aVar2).f13600a));
        }
        if (aVar2 instanceof a.g) {
            return new C43210w(new TravelGuestProfileInternalAction.OpenDeeplink(((a.g) aVar2).f13606a));
        }
        boolean z13 = aVar2 instanceof a.b;
        com.avito.android.travel_guest_profile.domain.interactors.a aVar3 = this.f302146c;
        String str3 = dVar2.f13624d;
        if (z13) {
            aVar3.f301967a.c(new KE0.b(aVar3.f301968b.a(), str3));
            return new C43210w(new TravelGuestProfileInternalAction.OpenPhotoGallery(Collections.singletonList(((a.b) aVar2).f13601a), null));
        }
        if (aVar2 instanceof a.e) {
            return new C43210w(new TravelGuestProfileInternalAction.OpenDeeplink(((a.e) aVar2).f13604a));
        }
        boolean z14 = aVar2 instanceof a.i;
        String str4 = dVar2.f13623c;
        Uri uri = dVar2.f13628h;
        if (z14) {
            if (((a.i) aVar2).f13608a) {
                return (uri == null || (interfaceC43160iB = fVar.b(uri)) == null) ? C43175k.w() : interfaceC43160iB;
            }
            mapC = sort != null ? C35755b0.c(Collections.singletonMap(sort.getParamName(), sort.getSelectedOption())) : null;
            if (mapC == null) {
                mapC = P0.c();
            }
            return fVar.a(str2, str4, mapC);
        }
        if (aVar2 instanceof a.c) {
            PE0.c cVar = ((a.c) aVar2).f13602a;
            if (cVar instanceof c.a) {
                return new C43210w(new TravelGuestProfileInternalAction.OpenDeeplink(((c.a) cVar).f12885a));
            }
            if (!(cVar instanceof c.b)) {
                return C43175k.w();
            }
            mapC = sort != null ? C35755b0.c(Collections.singletonMap(sort.getParamName(), sort.getSelectedOption())) : null;
            if (mapC == null) {
                mapC = P0.c();
            }
            return fVar.a(str2, str4, mapC);
        }
        if (aVar2 instanceof a.k) {
            return sort != null ? new C43210w(new TravelGuestProfileInternalAction.OpenSortingOptionsDialog(sort.getSelectedOption(), sort.getOptions())) : C43175k.w();
        }
        if (aVar2 instanceof a.l) {
            if (sort != null && (sortCopy$default = SearchParametersEntry.SearchParametersBlock.Sort.copy$default(sort, null, ((a.l) aVar2).f13611a, null, null, null, 29, null)) != null) {
                mapC = C35755b0.c(Collections.singletonMap(sortCopy$default.getParamName(), sortCopy$default.getSelectedOption()));
            }
            if (mapC == null) {
                mapC = P0.c();
            }
            return fVar.a(str2, str, mapC);
        }
        if (aVar2 instanceof a.j) {
            InterfaceC13400a interfaceC13400a = ((a.j) aVar2).f13609a;
            if (!(interfaceC13400a instanceof InterfaceC13400a.c)) {
                return C43175k.w();
            }
            InterfaceC13400a.c cVar2 = (InterfaceC13400a.c) interfaceC13400a;
            return new C43210w(new TravelGuestProfileInternalAction.OpenPhotoGallery(cVar2.a(), Integer.valueOf(cVar2.getF3376b())));
        }
        if (!(aVar2 instanceof a.d)) {
            if (aVar2 instanceof a.f) {
                return uri != null ? fVar.b(uri) : C43175k.w();
            }
            throw new NoWhenBranchMatchedException();
        }
        String str5 = ((a.d) aVar2).f13603a;
        if (str5 != null) {
            aVar3.f301967a.c(new KE0.c(aVar3.f301968b.a(), str3, str5));
        }
        return C43175k.w();
    }
}
