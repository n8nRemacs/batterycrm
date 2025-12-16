package com.avito.android.advert.item.other_categories.item;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.active_orders_common.items.order.n;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/other_categories/item/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/other_categories/item/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f77869g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f77870b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f77871c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f77872d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f77873e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f77874f;

    public f(@k View view) {
        super(view);
        this.f77870b = view;
        this.f77871c = (TextView) view.findViewById(R.id.other_category_title);
        this.f77872d = (TextView) view.findViewById(R.id.other_category_subtitle);
        this.f77873e = (SimpleDraweeView) view.findViewById(R.id.other_category_image);
        this.f77874f = (ImageView) view.findViewById(R.id.other_category_right_icon);
    }

    @Override // com.avito.android.advert.item.other_categories.item.e
    public final void a(@k Y41.a<G0> aVar) {
        this.f77870b.setOnClickListener(new n(28, aVar));
    }

    @Override // com.avito.android.advert.item.other_categories.item.e
    public final void f(@l String str) {
        I5.a(this.f77872d, str, false);
    }

    @Override // com.avito.android.advert.item.other_categories.item.e
    public final void i(@k UniversalImage universalImage) {
        Image imageQ = com.avito.android.actions_sheet.a.q(this.f77870b, universalImage);
        int i12 = imageQ != null ? 0 : 8;
        SimpleDraweeView simpleDraweeView = this.f77873e;
        simpleDraweeView.setVisibility(i12);
        com.avito.android.image_loader.glide.utils.b.d(simpleDraweeView, com.avito.android.image_loader.b.b(imageQ));
    }

    @Override // com.avito.android.advert.item.other_categories.item.e
    public final void setTitle(@k String str) {
        this.f77871c.setText(str);
    }

    @Override // com.avito.android.advert.item.other_categories.item.e
    public final void yV(@l String str) {
        Integer numA;
        int i12 = str != null ? 0 : 8;
        ImageView imageView = this.f77874f;
        imageView.setVisibility(i12);
        if (str == null || (numA = q.a(str)) == null) {
            return;
        }
        Drawable drawableM = C35835l0.m(this.f77870b.getContext(), numA.intValue(), R.attr.black);
        if (drawableM != null) {
            imageView.setImageDrawable(drawableM);
        }
    }
}
