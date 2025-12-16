package com.avito.android.advert.item.additionalSeller.feature_item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.active_orders_common.items.order.n;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FeatureItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/feature_item/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/additionalSeller/feature_item/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f72579d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f72580b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f72581c;

    public g(@k View view) {
        super(view);
        this.f72580b = (TextView) view.findViewById(R.id.title);
        this.f72581c = (SimpleDraweeView) view.findViewById(R.id.image);
    }

    @Override // com.avito.android.advert.item.additionalSeller.feature_item.f
    public final void c(@k Y41.a<G0> aVar) {
        this.f72581c.setOnClickListener(new n(3, aVar));
    }

    @Override // com.avito.android.advert.item.additionalSeller.feature_item.f
    public final void l(@k Image image) {
        SimpleDraweeView simpleDraweeView = this.f72581c;
        simpleDraweeView.e(C35829k2.c(image, simpleDraweeView, 2, 22).d());
    }

    @Override // com.avito.android.advert.item.additionalSeller.feature_item.f
    public final void setTitle(@k String str) {
        this.f72580b.setText(str);
    }
}
