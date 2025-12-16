package com.avito.android.beduin.common.component.product_comparison.items;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.image.ImageStyle;
import com.avito.android.beduin.common.utils.B;
import com.avito.android.beduin.common.utils.H;
import com.avito.android.beduin.common.utils.s;
import com.avito.android.beduin.common.utils.u;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.n;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: BeduinProductComparisonItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/product_comparison/items/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/beduin/common/component/product_comparison/items/f;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f102160b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f102161c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f102162d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f102163e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ViewGroup f102164f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final j f102165g;

    public g(@k View view) {
        super(view);
        this.f102160b = view;
        this.f102161c = (SimpleDraweeView) view.findViewById(R.id.image);
        this.f102162d = (TextView) view.findViewById(R.id.title);
        this.f102163e = (TextView) view.findViewById(R.id.description);
        this.f102164f = (ViewGroup) view.findViewById(R.id.header_text_container);
        this.f102165g = new j(view);
    }

    @Override // com.avito.android.beduin.common.component.product_comparison.items.f
    public final void QP(@k a aVar) {
        UniversalColor errorColor;
        float f12 = aVar.f102146b;
        SimpleDraweeView simpleDraweeView = this.f102161c;
        simpleDraweeView.setAspectRatio(f12);
        GW0.b bVar = new GW0.b(simpleDraweeView.getResources());
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(n.a(aVar.f102145a));
        Context context = simpleDraweeView.getContext();
        ImageStyle imageStyle = aVar.f102147c;
        u.a(aVarA, imageStyle, context);
        aVarA.f169500r = false;
        B.b(simpleDraweeView, imageStyle, aVarA);
        Context context2 = simpleDraweeView.getContext();
        if (imageStyle == null || (errorColor = imageStyle.getErrorColor()) == null) {
            bVar.f6543h = null;
        } else {
            bVar.f6543h = H.a(context2, errorColor);
        }
        s.a(bVar, imageStyle, simpleDraweeView.getContext());
        simpleDraweeView.setHierarchy(bVar.a());
        aVarA.c();
        h.a(this.f102162d, aVar.f102148d, aVar.f102149e);
        h.a(this.f102163e, aVar.f102150f, aVar.f102151g);
        this.f102164f.getLayoutParams().height = aVar.f102152h;
    }

    @Override // com.avito.android.beduin.common.component.product_comparison.items.f
    public final void T30(@k ArrayList arrayList) {
        j jVar = this.f102165g;
        jVar.c(jVar.f102173b, arrayList);
    }

    @Override // com.avito.android.beduin.common.component.product_comparison.items.f
    public final void aC(int i12) {
        this.f102165g.f102174c = i12;
    }

    @Override // com.avito.android.beduin.common.component.product_comparison.items.f
    public final void f5(int i12) {
        this.f102160b.getLayoutParams().width = i12;
    }
}
