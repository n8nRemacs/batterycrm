package com.avito.android.advert_collection_adding.adapter.advert_collection;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCollectionView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection_adding/adapter/advert_collection/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_collection_adding/adapter/advert_collection/g;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f81768g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f81769b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f81770c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f81771d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f81772e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.image_loader.d f81773f;

    public h(@k View view) {
        super(view);
        this.f81769b = view;
        View viewFindViewById = view.findViewById(R.id.collectionTitle);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f81770c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.collectionSize);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f81771d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f81772e = (SimpleDraweeView) viewFindViewById3;
        this.f81773f = new com.avito.android.image_loader.e().a(view.getContext());
    }

    @Override // com.avito.android.advert_collection_adding.adapter.advert_collection.g
    public final void L0(@l Y41.a<G0> aVar) {
        this.f81769b.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(1, aVar));
    }

    @Override // com.avito.android.advert_collection_adding.adapter.advert_collection.g
    public final void setTitle(@k String str) {
        I5.a(this.f81770c, str, false);
    }

    @Override // com.avito.android.advert_collection_adding.adapter.advert_collection.g
    public final void x(@k com.avito.android.image_loader.k kVar) {
        Drawable drawableA = d.a.a(this.f81773f, this.f81769b.getContext(), kVar, null, null, 28);
        ImageRequest.a aVarA = C35949t5.a(this.f81772e);
        aVarA.d(kVar);
        aVarA.f169501s = drawableA;
        aVarA.c();
    }

    @Override // com.avito.android.advert_collection_adding.adapter.advert_collection.g
    public final void yb(int i12) throws Resources.NotFoundException {
        I5.a(this.f81771d, this.f81769b.getResources().getQuantityString(R.plurals.advert_count, i12, Integer.valueOf(i12)), false);
    }
}
