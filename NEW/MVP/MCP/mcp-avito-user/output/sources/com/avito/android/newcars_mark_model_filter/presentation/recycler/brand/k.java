package com.avito.android.newcars_mark_model_filter.presentation.recycler.brand;

import Y41.l;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BrandOptionItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/recycler/brand/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/newcars_mark_model_filter/presentation/recycler/brand/i;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f207381e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f207382b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f207383c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f207384d;

    public k(@Y61.k View view) {
        super(view);
        this.f207382b = view;
        this.f207383c = (SimpleDraweeView) view.findViewById(R.id.icon_item_brand);
        this.f207384d = (TextView) view.findViewById(R.id.brand_title);
    }

    @Override // com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.i
    public final void DG(@Y61.k b bVar, @Y61.k l<? super Long, G0> lVar) {
        View view = this.f207382b;
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(bVar.f207372f, com.avito.android.lib.util.darkTheme.c.b(view.getContext()));
        if (imageDependsOnThemeOrDefault != null) {
            SimpleDraweeView simpleDraweeView = this.f207383c;
            Uri uriD = C35829k2.c(imageDependsOnThemeOrDefault, simpleDraweeView, 2, 22).d();
            if (uriD != null) {
                simpleDraweeView.setVisibility(0);
                ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                aVarA.f(uriD);
                aVarA.c();
            }
        }
        this.f207384d.setText(bVar.f207370d);
        view.setOnClickListener(new j(0, lVar, bVar));
    }
}
