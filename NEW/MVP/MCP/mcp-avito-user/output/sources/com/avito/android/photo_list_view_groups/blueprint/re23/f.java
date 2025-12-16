package com.avito.android.photo_list_view_groups.blueprint.re23;

import Hj.C13996a;
import Y61.k;
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

/* compiled from: PhotoItemGroupsRe23Presenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/blueprint/re23/f;", "Lcom/avito/android/photo_list_view_groups/blueprint/re23/d;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.photo_list_view_groups.g f218529b;

    @Inject
    public f(@k com.avito.android.photo_list_view_groups.g gVar) {
        this.f218529b = gVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof T3) {
                obj = obj2;
            }
        }
        T3 t32 = (T3) (obj instanceof T3 ? obj : null);
        if (t32 == null) {
            k(hVar, aVar);
            return;
        }
        if (!(aVar instanceof ParameterElement.z)) {
            throw new IllegalArgumentException("Item should be ParameterElement.PhotosWithGroups, but was " + aVar);
        }
        ParameterElement.z zVar = (ParameterElement.z) aVar;
        C13996a c13996a = new C13996a(zVar.f117610d, zVar.f117616j, zVar.f117617k, false, null, null, null, null, null, 504, null);
        boolean z12 = t32.f318741a;
        com.avito.android.photo_list_view_groups.g gVar = this.f218529b;
        if (z12) {
            hVar.a60(c13996a);
            gVar.p(c13996a.f7644b instanceof ItemWithState.State.Error);
        }
        if (t32.f318742b) {
            gVar.c(zVar.f117612f);
        }
    }

    public final void k(@k h hVar, @k TV0.a aVar) {
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
        hVar.La(list);
        hVar.kd(list2);
        hVar.m5(list3);
        C13996a c13996a = new C13996a(zVar.f117610d, zVar.f117616j, zVar.f117617k, false, null, null, null, null, null, 504, null);
        hVar.a60(c13996a);
        boolean z12 = c13996a.f7644b instanceof ItemWithState.State.Error;
        com.avito.android.photo_list_view_groups.g gVar = this.f218529b;
        gVar.p(z12);
        gVar.c(zVar.f117612f);
        hVar.Ua(gVar);
        hVar.d(new e(this));
    }
}
