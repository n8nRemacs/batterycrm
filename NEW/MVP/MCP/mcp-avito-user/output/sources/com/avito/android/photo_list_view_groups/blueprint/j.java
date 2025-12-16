package com.avito.android.photo_list_view_groups.blueprint;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.photo_list_view_groups.view_holders.l;
import com.avito.android.remote.model.category_parameters.ImageAction;
import com.avito.android.remote.model.category_parameters.ImageBadgeGroup;
import com.avito.android.remote.model.category_parameters.ImageGroup;
import com.avito.android.util.R0;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoItemGroupsView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_list_view_groups/blueprint/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/photo_list_view_groups/blueprint/i;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f218504b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f218505c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_list_view_groups.h f218506d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g80.d f218507e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f218508f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f218509g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public List<ImageGroup> f218510h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public List<ImageBadgeGroup> f218511i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public List<ImageAction> f218512j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f218513k;

    @Inject
    public j(@Y61.k View view, @Y61.k l lVar, @Y61.k R0 r02, @Y61.k com.avito.android.photo_list_view_groups.h hVar, @Y61.k g80.d dVar) {
        super(view);
        this.f218504b = lVar;
        this.f218505c = r02;
        this.f218506d = hVar;
        this.f218507e = dVar;
        this.f218508f = (ComponentContainer) view.findViewById(R.id.photo_param_container);
        View viewFindViewById = view.findViewById(R.id.image_list_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f218509g = recyclerView;
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f218510h = c42784z0;
        this.f218511i = c42784z0;
        this.f218512j = c42784z0;
        recyclerView.l(new com.avito.android.photo_list_view_groups.a(), -1);
    }

    @Override // com.avito.android.photo_list_view_groups.blueprint.i
    public final void H(@Y61.l CharSequence charSequence) {
        ComponentContainer.n(this.f218508f, charSequence, 2);
    }

    @Override // com.avito.android.photo_list_view_groups.blueprint.i
    public final void La(@Y61.k List<ImageGroup> list) {
        this.f218510h = list;
    }

    @Override // com.avito.android.photo_list_view_groups.blueprint.i
    public final void Ua(@Y61.k com.avito.android.photo_list_view_groups.g gVar) {
        List<ImageGroup> list = this.f218510h;
        List<ImageBadgeGroup> list2 = this.f218511i;
        List<ImageAction> list3 = this.f218512j;
        gVar.A(new com.avito.android.photo_list_view_groups.f(this.f218509g, gVar, this.f218504b, this.f218506d, this.f218507e, list, list2, list3, this.f218505c));
    }

    @Override // com.avito.android.photo_list_view_groups.blueprint.i
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f218513k = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f218513k;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.photo_list_view_groups.blueprint.i
    public final void kd(@Y61.k List<ImageBadgeGroup> list) {
        this.f218511i = list;
    }

    @Override // com.avito.android.photo_list_view_groups.blueprint.i
    public final void m5(@Y61.k List<ImageAction> list) {
        this.f218512j = list;
    }

    @Override // com.avito.android.photo_list_view_groups.blueprint.i
    public final void setTitle(@Y61.l String str) {
        this.f218508f.setTitle(str);
    }

    @Override // com.avito.android.photo_list_view_groups.blueprint.i
    public final void u(@Y61.l CharSequence charSequence) {
        this.f218508f.q(charSequence);
    }
}
