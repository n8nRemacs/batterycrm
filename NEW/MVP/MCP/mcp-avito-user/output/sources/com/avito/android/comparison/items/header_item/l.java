package com.avito.android.comparison.items.header_item;

import Qq.InterfaceC14923a;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ComparisonHeaderView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comparison/items/header_item/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comparison/items/header_item/k;", "LQq/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l extends com.avito.konveyor.adapter.b implements k, InterfaceC14923a {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f123984l = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f123985b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f123986c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f123987d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f123988e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f123989f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f123990g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f123991h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AppCompatCheckBox f123992i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final View f123993j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final View f123994k;

    public l(@Y61.k View view) {
        super(view);
        this.f123985b = view;
        View viewFindViewById = view.findViewById(R.id.comparison_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f123986c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.comparison_price);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f123987d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.comparison_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f123988e = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.overlay_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f123989f = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.comparison_action_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f123990g = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.comparison_menu_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f123991h = (Button) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.lock_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatCheckBox");
        }
        this.f123992i = (AppCompatCheckBox) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.left_divider);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f123993j = viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.right_divider);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f123994k = viewFindViewById9;
    }

    @Override // com.avito.android.comparison.items.header_item.k
    public final void Nu(@Y61.k Y41.a<G0> aVar) {
        this.f123991h.setOnClickListener(new com.avito.android.calltracking.item.m(23, aVar));
    }

    @Override // com.avito.android.comparison.items.header_item.k
    public final void bE(@Y61.l m mVar, @Y61.k Y41.a<G0> aVar) {
        Button button = this.f123990g;
        D6.G(button, true);
        button.setText(mVar.getF123998a());
        button.setAppearanceFromAttr(mVar.h());
        button.setOnClickListener(new com.avito.android.calltracking.item.m(22, aVar));
    }

    @Override // com.avito.android.comparison.items.header_item.k
    public final void dE(@Y61.k Y41.a<G0> aVar) {
        this.f123992i.setOnClickListener(new com.avito.android.body_condition.h(21, aVar, this));
    }

    @Override // Qq.InterfaceC14923a
    public final void dr() {
        this.f123992i.setChecked(true);
    }

    @Override // Qq.InterfaceC14923a
    public final void ey(boolean z12) {
        D6.G(this.f123994k, z12);
    }

    @Override // com.avito.android.comparison.items.header_item.k
    public final void fq(boolean z12) {
        D6.G(this.f123991h, z12);
    }

    @Override // com.avito.android.comparison.items.header_item.k
    public final void km(@Y61.k Image image, boolean z12) {
        G0 g02;
        SimpleDraweeView simpleDraweeView = this.f123988e;
        Uri uriB = C35829k2.c(image, simpleDraweeView, 1, 22).b();
        if (uriB != null) {
            D6.G(simpleDraweeView, true);
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.f(uriB);
            aVarA.c();
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(simpleDraweeView);
        }
        ImageView imageView = this.f123989f;
        if (z12) {
            D6.w(imageView);
        } else {
            D6.G(imageView, true);
        }
    }

    @Override // Qq.InterfaceC14923a
    public final void oS(boolean z12) {
        D6.G(this.f123993j, z12);
    }

    @Override // com.avito.android.comparison.items.header_item.k
    public final void p(@Y61.k String str) {
        I5.a(this.f123987d, str, false);
    }

    @Override // com.avito.android.comparison.items.header_item.k
    public final void p3(@Y61.k Y41.a<G0> aVar) {
        this.f123985b.setOnClickListener(new com.avito.android.calltracking.item.m(24, aVar));
    }

    @Override // com.avito.android.comparison.items.header_item.k
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f123986c, str, false);
    }
}
