package com.avito.android.edit_carousel.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.edit_carousel.adapter.advert.a;
import com.avito.android.edit_carousel.entity.CarouselEditorData;
import com.avito.android.edit_carousel.mvi.entity.EditCarouselInternalAction;
import com.avito.android.edit_carousel.mvi.entity.EditCarouselState;
import com.avito.android.profile_settings_extended.entity.CarouselEditorSettings;
import com.avito.android.profile_settings_extended.entity.ExtendedProfileSettingsAdvert;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: EditCarouselReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements u<EditCarouselInternalAction, EditCarouselState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CarouselEditorData f146528b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.edit_carousel.k f146529c;

    @Inject
    public l(@Y61.k CarouselEditorData carouselEditorData, @Y61.k com.avito.android.edit_carousel.k kVar) {
        this.f146528b = carouselEditorData;
        this.f146529c = kVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final EditCarouselState a(EditCarouselInternalAction editCarouselInternalAction, EditCarouselState editCarouselState) {
        LinkedHashSet linkedHashSetO0;
        ArrayList arrayList;
        EditCarouselInternalAction editCarouselInternalAction2 = editCarouselInternalAction;
        EditCarouselState editCarouselState2 = editCarouselState;
        Integer numValueOf = null;
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.InitEditMode) {
            CarouselEditorData carouselEditorData = this.f146528b;
            Integer num = carouselEditorData.f146381f;
            if (num == null) {
                CarouselEditorSettings.CarouselNameItem carouselNameItem = (CarouselEditorSettings.CarouselNameItem) C42745f0.K(0, carouselEditorData.f146379d.f230262j);
                if (carouselNameItem != null) {
                    numValueOf = Integer.valueOf(carouselNameItem.f230263b);
                }
            } else {
                numValueOf = num;
            }
            Collection collection = carouselEditorData.f146380e;
            if (collection == null) {
                collection = C42784z0.f406748b;
            }
            return b(EditCarouselState.b.a(editCarouselState2.f146487c, numValueOf, false, new LinkedHashSet(collection), 2), editCarouselState2);
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.AdvertsLoadingInProgress) {
            return EditCarouselState.a(editCarouselState2, EditCarouselState.d.c.f146514a, null, null, null, 30);
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.AdvertsLoaded) {
            EditCarouselInternalAction.AdvertsLoaded advertsLoaded = (EditCarouselInternalAction.AdvertsLoaded) editCarouselInternalAction2;
            return c(EditCarouselState.c.a(editCarouselState2.f146488d, advertsLoaded.f146460b, null, advertsLoaded.f146462d, advertsLoaded.f146463e, advertsLoaded.f146461c, 0L, null, 98), editCarouselState2);
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.AdvertsLoadingError) {
            return EditCarouselState.a(editCarouselState2, EditCarouselState.d.C4258d.f146515a, null, null, null, 30);
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.CarouselModificationInProgress) {
            return b(EditCarouselState.b.a(editCarouselState2.f146487c, null, true, null, 5), editCarouselState2);
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.CarouselModificationSuccess) {
            return b(EditCarouselState.b.a(editCarouselState2.f146487c, null, false, null, 5), editCarouselState2);
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.CarouselModificationFailure) {
            return b(EditCarouselState.b.a(editCarouselState2.f146487c, null, false, null, 5), editCarouselState2);
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.OnNamePicked) {
            return b(EditCarouselState.b.a(editCarouselState2.f146487c, Integer.valueOf(((EditCarouselInternalAction.OnNamePicked) editCarouselInternalAction2).f146474b), false, null, 6), editCarouselState2);
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.OnSortTypePicked) {
            return EditCarouselState.a(editCarouselState2, null, null, EditCarouselState.c.a(editCarouselState2.f146488d, null, null, null, Integer.valueOf(((EditCarouselInternalAction.OnSortTypePicked) editCarouselInternalAction2).f146476b), 0L, 0L, null, 87), null, 27);
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.OnQueryUpdated) {
            return EditCarouselState.a(editCarouselState2, null, null, EditCarouselState.c.a(editCarouselState2.f146488d, null, ((EditCarouselInternalAction.OnQueryUpdated) editCarouselInternalAction2).f146475b, null, null, 0L, 0L, null, 93), null, 27);
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.AdvertSelectedItemAction) {
            a.b bVar = ((EditCarouselInternalAction.AdvertSelectedItemAction) editCarouselInternalAction2).f146459b;
            boolean z12 = bVar.f146241d;
            EditCarouselState.c cVar = editCarouselState2.f146488d;
            ExtendedProfileSettingsAdvert extendedProfileSettingsAdvert = bVar.f146239b;
            if (z12) {
                linkedHashSetO0 = C42745f0.O0(cVar.f146504g);
                linkedHashSetO0.remove(extendedProfileSettingsAdvert);
                G0 g02 = G0.f406611a;
            } else {
                linkedHashSetO0 = C42745f0.O0(cVar.f146504g);
                linkedHashSetO0.add(extendedProfileSettingsAdvert);
                G0 g03 = G0.f406611a;
            }
            EditCarouselState.c cVarA = EditCarouselState.c.a(cVar, null, null, null, null, 0L, 0L, linkedHashSetO0, 63);
            List<a.b> list = cVarA.f146498a;
            int iIndexOf = list != null ? list.indexOf(bVar) : -1;
            if (iIndexOf != -1) {
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(list);
                    a.b bVar2 = list.get(iIndexOf);
                    arrayList2.set(iIndexOf, new a.b(bVar2.f146239b, bVar2.f146240c, !bVar2.f146241d));
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                cVarA = EditCarouselState.c.a(cVarA, arrayList, null, null, null, 0L, 0L, null, WebSocketProtocol.PAYLOAD_SHORT);
            }
            return c(cVarA, editCarouselState2);
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.AdvertDeleteItemAction) {
            EditCarouselState.b bVar3 = editCarouselState2.f146487c;
            LinkedHashSet linkedHashSetO02 = C42745f0.O0(bVar3.f146497c);
            linkedHashSetO02.remove(((EditCarouselInternalAction.AdvertDeleteItemAction) editCarouselInternalAction2).f146458b.f146242b);
            G0 g04 = G0.f406611a;
            return b(EditCarouselState.b.a(bVar3, null, false, linkedHashSetO02, 3), editCarouselState2);
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.PagingBarItemAction) {
            return EditCarouselState.a(editCarouselState2, null, null, EditCarouselState.c.a(editCarouselState2.f146488d, null, null, null, null, 0L, (((EditCarouselInternalAction.PagingBarItemAction) editCarouselInternalAction2).f146477b - 1) * 10, null, 95), null, 27);
        }
        boolean z13 = editCarouselInternalAction2 instanceof EditCarouselInternalAction.SwapAdverts;
        EditCarouselState.b bVar4 = editCarouselState2.f146487c;
        if (!z13) {
            if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.SwitchModeToEdit) {
                return b(EditCarouselState.b.a(bVar4, null, false, ((EditCarouselInternalAction.SwitchModeToEdit) editCarouselInternalAction2).f146482b ? editCarouselState2.f146488d.f146504g : bVar4.f146497c, 3), EditCarouselState.a(editCarouselState2, null, null, new EditCarouselState.c(null, null, null, null, 0L, 0L, null, 127, null), null, 27));
            }
            if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.SwitchModeToSearch) {
                return EditCarouselState.a(c(new EditCarouselState.c(null, null, null, null, 0L, 0L, bVar4.f146497c, 63, null), EditCarouselState.a(editCarouselState2, null, null, null, null, 15)), EditCarouselState.d.c.f146514a, null, null, null, 30);
            }
            if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.SelectSortType ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.HeaderSelectItemAction ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.RefreshAdverts ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.LeaveScreen) {
                return editCarouselState2;
            }
            throw new NoWhenBranchMatchedException();
        }
        EditCarouselInternalAction.SwapAdverts swapAdverts = (EditCarouselInternalAction.SwapAdverts) editCarouselInternalAction2;
        int i12 = swapAdverts.f146480b - 1;
        int i13 = swapAdverts.f146481c - 1;
        Set<ExtendedProfileSettingsAdvert> set = bVar4.f146497c;
        if (i12 < 0 || i12 >= set.size() || i13 < 0) {
            return editCarouselState2;
        }
        Set<ExtendedProfileSettingsAdvert> set2 = bVar4.f146497c;
        if (i13 >= set2.size()) {
            return editCarouselState2;
        }
        ArrayList arrayList3 = new ArrayList(set2);
        Collections.swap(arrayList3, i12, i13);
        return b(EditCarouselState.b.a(editCarouselState2.f146487c, null, false, new LinkedHashSet(arrayList3), 3), editCarouselState2);
    }

    public final EditCarouselState b(EditCarouselState.b bVar, EditCarouselState editCarouselState) {
        Integer num;
        Integer num2;
        Object next;
        EditCarouselState.Mode mode = EditCarouselState.Mode.f146491b;
        CarouselEditorData carouselEditorData = this.f146528b;
        CarouselEditorSettings carouselEditorSettings = carouselEditorData.f146379d;
        ArrayList arrayList = new ArrayList();
        String str = carouselEditorSettings.f230254b;
        Iterator it = carouselEditorData.f146379d.f230262j.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            num = bVar.f146495a;
            num2 = carouselEditorData.f146381f;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            int i12 = ((CarouselEditorSettings.CarouselNameItem) next).f230263b;
            Integer num3 = num == null ? num2 : num;
            if (num3 != null && i12 == num3.intValue()) {
                break;
            }
        }
        CarouselEditorSettings.CarouselNameItem carouselNameItem = (CarouselEditorSettings.CarouselNameItem) next;
        arrayList.add(new com.avito.android.edit_carousel.adapter.header.a(null, str, carouselEditorSettings.f230255c, carouselEditorSettings.f230256d, carouselEditorSettings.f230257e, carouselEditorSettings.f230258f, carouselNameItem != null ? carouselNameItem.f230264c : null, 1, null));
        Set<ExtendedProfileSettingsAdvert> set = bVar.f146497c;
        Set<ExtendedProfileSettingsAdvert> set2 = set;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(set2, 10));
        int i13 = 0;
        for (Object obj : set2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList2.add(new a.c((ExtendedProfileSettingsAdvert) obj, null, i14, 2, null));
            i13 = i14;
        }
        arrayList.addAll(arrayList2);
        boolean z12 = true;
        if (set.size() < carouselEditorSettings.f230261i) {
            arrayList.add(new com.avito.android.edit_carousel.adapter.button.a(null, carouselEditorSettings.f230259g, 1, null));
        }
        String strB = this.f146529c.b();
        boolean z13 = bVar.f146496b;
        if (z13 || !n.a(set, carouselEditorData) || (num == null && num2 == null)) {
            z12 = false;
        }
        return EditCarouselState.a(editCarouselState, new EditCarouselState.d.a(null, false, arrayList, new EditCarouselState.d.a.C4257a(null, strB, z12, z13)), bVar, null, mode, 20);
    }

    public final EditCarouselState c(EditCarouselState.c cVar, EditCarouselState editCarouselState) {
        EditCarouselState.d aVar;
        Set<ExtendedProfileSettingsAdvert> set;
        Object next;
        EditCarouselState.Mode mode = EditCarouselState.Mode.f146492c;
        List list = cVar.f146498a;
        if (O2.a(list)) {
            CarouselEditorData carouselEditorData = this.f146528b;
            CarouselEditorSettings carouselEditorSettings = carouselEditorData.f146379d;
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                list = C42784z0.f406748b;
            }
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator it = list2.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                set = cVar.f146504g;
                if (!zHasNext) {
                    break;
                }
                a.b bVar = (a.b) it.next();
                Iterator it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    Iterator it3 = it2;
                    if (bVar.f146239b.f230267b == ((ExtendedProfileSettingsAdvert) next).f230267b) {
                        break;
                    }
                    it2 = it3;
                }
                boolean z12 = next != null;
                if (z12 != bVar.f146241d) {
                    bVar = new a.b(bVar.f146239b, bVar.f146240c, z12);
                }
                arrayList2.add(bVar);
            }
            arrayList.addAll(arrayList2);
            long j12 = cVar.f146502e;
            if (j12 > 10) {
                arrayList.add(new com.avito.android.edit_carousel.adapter.paging_bar.a(null, (long) Math.ceil(j12 / 10.0d), (cVar.f146503f / 10) + 1, 1, null));
            }
            com.avito.android.edit_carousel.k kVar = this.f146529c;
            String strD = kVar.d();
            int size = set.size();
            CarouselEditorSettings carouselEditorSettings2 = carouselEditorData.f146379d;
            aVar = new EditCarouselState.d.a(strD, true, arrayList, new EditCarouselState.d.a.C4257a(kVar.a(size, carouselEditorSettings2.f230260h, carouselEditorSettings2.f230261i), carouselEditorSettings.f230259g, n.a(set, carouselEditorData), false, 8, null));
        } else {
            aVar = EditCarouselState.d.b.f146513a;
        }
        return EditCarouselState.a(editCarouselState, aVar, null, cVar, mode, 18);
    }
}
