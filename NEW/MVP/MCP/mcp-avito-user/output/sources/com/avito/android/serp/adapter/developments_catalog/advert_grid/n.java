package com.avito.android.serp.adapter.developments_catalog.advert_grid;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DevelopmentItemGridView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/developments_catalog/advert_grid/n;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/developments_catalog/advert_grid/m;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class n extends com.avito.android.serp.c implements m {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f269831k = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f269832b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f269833c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.image_loader.d f269834d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f269835e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f269836f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f269837g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final StrikethroughTextView f269838h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f269839i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f269840j;

    /* compiled from: DevelopmentItemGridView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(n.this.f269833c.c());
        }
    }

    public n(@Y61.k View view, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        super(view);
        this.f269832b = view;
        this.f269833c = aVar;
        this.f269834d = new com.avito.android.image_loader.e().a(view.getContext());
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f269835e = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f269836f = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.price);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f269837g = (TextView) viewFindViewById3;
        this.f269838h = (StrikethroughTextView) view.findViewById(R.id.promoPrice);
        View viewFindViewById4 = view.findViewById(R.id.period);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f269839i = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.address);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f269840j = (TextView) viewFindViewById5;
    }

    @Override // com.avito.android.serp.adapter.developments_catalog.advert_grid.m
    public final void N2(@Y61.l String str) {
        I5.a(this.f269837g, str, false);
    }

    @Override // com.avito.android.serp.adapter.developments_catalog.advert_grid.m
    public final void b(@Y61.l String str) {
        I5.a(this.f269836f, str, false);
    }

    @Override // com.avito.android.serp.adapter.developments_catalog.advert_grid.m
    public final void c(@Y61.k Y41.a<G0> aVar) {
        this.f269832b.setOnClickListener(new com.avito.android.seller_promotions.o(17, aVar));
    }

    @Override // com.avito.android.serp.adapter.developments_catalog.advert_grid.m
    public final void fD(@Y61.l String str, @Y61.l String str2) {
        I5.a(this.f269839i, str, false);
        I5.a(this.f269840j, str2, false);
    }

    @Override // com.avito.android.serp.adapter.developments_catalog.advert_grid.m
    public final void tS(@Y61.l String str) {
        StrikethroughTextView strikethroughTextView = this.f269838h;
        if (strikethroughTextView != null) {
            strikethroughTextView.f180648q = true;
            strikethroughTextView.invalidate();
        }
        if (strikethroughTextView != null) {
            I5.a(strikethroughTextView, str, false);
        }
    }

    public void x(@Y61.k com.avito.android.image_loader.k kVar) {
        SimpleDraweeView simpleDraweeView = this.f269835e;
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(kVar);
        aVarA.f169501s = d.a.a(this.f269834d, simpleDraweeView.getContext(), kVar, null, null, 28);
        aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA.f169497o = new a();
        aVarA.c();
    }

    @Override // com.avito.android.serp.adapter.developments_catalog.advert_grid.m
    public void B40(@Y61.l GeoReference geoReference) {
    }
}
