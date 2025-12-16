package com.avito.android.photo_list_view_groups.blueprint.re23;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.remote.model.category_parameters.ImageAction;
import com.avito.android.remote.model.category_parameters.ImageBadgeGroup;
import com.avito.android.remote.model.category_parameters.ImageGroup;
import com.avito.android.util.R0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoItemGroupsRe23View.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_list_view_groups/blueprint/re23/i;", "LHj/c;", "Lcom/avito/android/photo_list_view_groups/blueprint/re23/h;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends Hj.c implements h {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final R0 f218531m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final com.avito.android.photo_list_view_groups.view_holders.k f218532n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final com.avito.android.photo_list_view_groups.h f218533o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final g80.d f218534p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final RecyclerView f218535q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public List<ImageGroup> f218536r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public List<ImageBadgeGroup> f218537s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public List<ImageAction> f218538t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public Y41.a<G0> f218539u;

    public i(@k View view, @k com.avito.android.util.text.a aVar, @k R0 r02, @k com.avito.android.photo_list_view_groups.view_holders.k kVar, @k com.avito.android.photo_list_view_groups.h hVar, @k g80.d dVar) {
        super(view, R.layout.photo_item_groups_re23_content, aVar);
        this.f218531m = r02;
        this.f218532n = kVar;
        this.f218533o = hVar;
        this.f218534p = dVar;
        this.f7656e.getContext();
        View viewFindViewById = this.f7656e.findViewById(R.id.image_list_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f218535q = recyclerView;
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f218536r = c42784z0;
        this.f218537s = c42784z0;
        this.f218538t = c42784z0;
        recyclerView.l(new com.avito.android.photo_list_view_groups.a(), -1);
    }

    @Override // com.avito.android.photo_list_view_groups.blueprint.re23.h
    public final void La(@k List<ImageGroup> list) {
        this.f218536r = list;
    }

    @Override // com.avito.android.photo_list_view_groups.blueprint.re23.h
    public final void Ua(@k com.avito.android.photo_list_view_groups.g gVar) {
        List<ImageGroup> list = this.f218536r;
        List<ImageBadgeGroup> list2 = this.f218537s;
        List<ImageAction> list3 = this.f218538t;
        gVar.A(new com.avito.android.photo_list_view_groups.f(this.f218535q, gVar, this.f218532n, this.f218533o, this.f218534p, list, list2, list3, this.f218531m));
    }

    @Override // com.avito.android.photo_list_view_groups.blueprint.re23.h
    public final void d(@l Y41.a<G0> aVar) {
        this.f218539u = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f218539u;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.photo_list_view_groups.blueprint.re23.h
    public final void kd(@k List<ImageBadgeGroup> list) {
        this.f218537s = list;
    }

    @Override // com.avito.android.photo_list_view_groups.blueprint.re23.h
    public final void m5(@k List<ImageAction> list) {
        this.f218538t = list;
    }
}
