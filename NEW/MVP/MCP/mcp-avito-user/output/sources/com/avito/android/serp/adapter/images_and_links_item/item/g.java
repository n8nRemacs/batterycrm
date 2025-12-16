package com.avito.android.serp.adapter.images_and_links_item.item;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.seller_promotions.o;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ImageWithLinkItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/images_and_links_item/item/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/images_and_links_item/item/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f270200f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f270201b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f270202c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f270203d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f270204e;

    public g(@k View view) {
        super(view);
        this.f270201b = view;
        this.f270202c = (SimpleDraweeView) view.findViewById(R.id.image);
        this.f270203d = (TextView) view.findViewById(R.id.title);
        this.f270204e = view.getContext();
    }

    @Override // com.avito.android.serp.adapter.images_and_links_item.item.f
    public final void ez(@k UniversalImage universalImage, @l String str, @k Y41.a<G0> aVar, boolean z12) {
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f270204e)));
        View view = this.f270201b;
        if (z12) {
            view.getLayoutParams().width = view.getResources().getDimensionPixelOffset(R.dimen.image_with_link_item_carousel_width);
        }
        SimpleDraweeView simpleDraweeView = this.f270202c;
        simpleDraweeView.setAspectRatio(1.4f);
        C35949t5.c(this.f270202c, aVarB, null, null, null, 14);
        D6.H(simpleDraweeView);
        this.f270203d.setText(str);
        view.setOnClickListener(new o(18, aVar));
    }
}
