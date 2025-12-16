package com.avito.android.photo_list_view.re23.blueprint;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.remote.model.category_parameters.ImageAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: PublishPhotoItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_list_view/re23/blueprint/i;", "LHj/c;", "Lcom/avito/android/photo_list_view/re23/blueprint/h;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends Hj.c implements h {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final com.avito.android.photo_list_view.re23.k f218193m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final g80.d f218194n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Context f218195o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final RecyclerView f218196p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public List<ImageAction> f218197q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public Y41.a<G0> f218198r;

    public i(@k View view, @k com.avito.android.util.text.a aVar, @k com.avito.android.photo_list_view.re23.k kVar, @k g80.d dVar) {
        super(view, R.layout.publish_photo_item_content, aVar);
        this.f218193m = kVar;
        this.f218194n = dVar;
        this.f218195o = this.f7656e.getContext();
        View viewFindViewById = this.f7656e.findViewById(R.id.image_list_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f218196p = recyclerView;
        this.f218197q = C42784z0.f406748b;
        recyclerView.l(new com.avito.android.photo_list_view.re23.d(), -1);
    }

    @Override // com.avito.android.photo_list_view.re23.blueprint.h
    public final void Q30(@k com.avito.android.photo_list_view.re23.a aVar) {
        aVar.A(new com.avito.android.photo_list_view.re23.c(this.f218196p, aVar, this.f218193m, this.f218194n, this.f218197q));
    }

    @Override // com.avito.android.photo_list_view.re23.blueprint.h
    public final void d(@l Y41.a<G0> aVar) {
        this.f218198r = aVar;
    }

    @Override // com.avito.android.photo_list_view.re23.blueprint.h
    @k
    /* renamed from: getContext, reason: from getter */
    public final Context getF218195o() {
        return this.f218195o;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f218198r;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.photo_list_view.re23.blueprint.h
    public final void m5(@k List<ImageAction> list) {
        this.f218197q = list;
    }
}
