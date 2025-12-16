package com.avito.android.photo_list_view_groups.blueprint;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.ImageAction;
import com.avito.android.remote.model.category_parameters.ImageBadgeGroup;
import com.avito.android.remote.model.category_parameters.ImageGroup;
import com.avito.android.util.T3;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoItemGroupsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/blueprint/g;", "Lcom/avito/android/photo_list_view_groups/blueprint/e;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_list_view_groups.g f218502b;

    @Inject
    public g(@Y61.k com.avito.android.photo_list_view_groups.g gVar) {
        this.f218502b = gVar;
    }

    public final void O(i iVar, ParameterElement.z zVar) {
        ItemWithState.State state = zVar.f117616j;
        if (state instanceof ItemWithState.State.Normal) {
            iVar.u(((ItemWithState.State.Normal) state).f173899b);
        } else if (state instanceof ItemWithState.State.Warning) {
            iVar.H(((ItemWithState.State.Warning) state).f173900b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            iVar.H(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            iVar.H(null);
        }
        this.f218502b.p(zVar.f117616j instanceof ItemWithState.State.Error);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k(eVar, (com.avito.conveyor_item.a) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) aVar;
        if (!(eVar instanceof i)) {
            throw new IllegalArgumentException("View should be PhotoItemGroupsView, but was " + eVar);
        }
        if (!(aVar2 instanceof ParameterElement.z)) {
            throw new IllegalArgumentException("Item should be ParameterElement.Photo, but was " + aVar2);
        }
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof T3) {
                obj = obj2;
            }
        }
        T3 t32 = (T3) (obj instanceof T3 ? obj : null);
        if (t32 == null) {
            k(eVar, aVar2);
            return;
        }
        if (t32.f318741a) {
            O((i) eVar, (ParameterElement.z) aVar2);
        }
        if (t32.f318742b) {
            this.f218502b.c(((ParameterElement.z) aVar2).f117612f);
        }
    }

    public final void k(@Y61.k TV0.e eVar, @Y61.k com.avito.conveyor_item.a aVar) {
        if (!(eVar instanceof i)) {
            throw new IllegalArgumentException("View should be PhotoItemGroupsView, but was " + eVar);
        }
        if (!(aVar instanceof ParameterElement.z)) {
            throw new IllegalArgumentException("Item should be ParameterElement.Photo, but was " + aVar);
        }
        ParameterElement.z zVar = (ParameterElement.z) aVar;
        List<ImageGroup> list = zVar.f117615i;
        if (list == null) {
            throw new IllegalArgumentException("imageGroups should be presented");
        }
        List<ImageBadgeGroup> list2 = zVar.f117614h;
        if (list2 == null) {
            throw new IllegalArgumentException("imageBadgeGroups should be presented");
        }
        List<ImageAction> list3 = zVar.f117613g;
        if (list3 == null) {
            throw new IllegalArgumentException("imageActions should be presented");
        }
        i iVar = (i) eVar;
        iVar.setTitle(!zVar.f117617k ? zVar.f117610d : null);
        iVar.La(list);
        iVar.kd(list2);
        iVar.m5(list3);
        O(iVar, zVar);
        int i12 = zVar.f117612f;
        com.avito.android.photo_list_view_groups.g gVar = this.f218502b;
        gVar.c(i12);
        iVar.Ua(gVar);
        iVar.d(new f(this));
    }
}
