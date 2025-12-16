package com.avito.android.vas_performance.ui.items.competitive_vas;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CompetitiveVasItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/competitive_vas/j;", "Lcom/avito/android/vas_performance/ui/items/competitive_vas/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f321635l = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f321636b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f321637c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f321638d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final StrikethroughTextView f321639e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f321640f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f321641g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Button f321642h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Button f321643i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final LinearLayout f321644j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final SimpleDraweeView f321645k;

    public j(@k View view) {
        super(view);
        this.f321636b = view;
        View viewFindViewById = view.findViewById(R.id.header);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f321637c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.sub_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f321638d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.price_old);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.strikethrough.StrikethroughTextView");
        }
        this.f321639e = (StrikethroughTextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f321640f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f321641g = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.button_minus);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f321642h = (Button) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.button_plus);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f321643i = (Button) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.icons_container);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f321644j = (LinearLayout) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.lightning_icon);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f321645k = (SimpleDraweeView) viewFindViewById9;
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas.i
    public final void DD(@k List<UniversalImage> list) throws Resources.NotFoundException {
        LinearLayout linearLayout = this.f321644j;
        linearLayout.removeAllViews();
        View view = this.f321636b;
        int i12 = view.getResources().getDisplayMetrics().widthPixels;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(view.getContext());
        boolean z12 = list.size() >= 5 && i12 <= 372;
        if (z12) {
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.low_competitive_vas_button_width);
            this.f321642h.getLayoutParams().width = dimensionPixelSize;
            this.f321643i.getLayoutParams().width = dimensionPixelSize;
            int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(R.dimen.low_competitive_buttons_padding);
            D6.c(this.f321644j, Integer.valueOf(dimensionPixelSize2), null, Integer.valueOf(dimensionPixelSize2), null, 10);
        }
        for (UniversalImage universalImage : list) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) layoutInflaterFrom.inflate(R.layout.competitive_vas_icon_item, (ViewGroup) linearLayout, false);
            if (z12) {
                int dimensionPixelSize3 = simpleDraweeView.getRootView().getResources().getDimensionPixelSize(R.dimen.low_competitive_vas_icon_size);
                simpleDraweeView.getLayoutParams().width = dimensionPixelSize3;
                simpleDraweeView.getLayoutParams().height = dimensionPixelSize3;
                int dimensionPixelSize4 = simpleDraweeView.getRootView().getResources().getDimensionPixelSize(R.dimen.low_competitive_vas_icon_margin);
                D6.c(simpleDraweeView, Integer.valueOf(dimensionPixelSize4), null, Integer.valueOf(dimensionPixelSize4), null, 10);
            }
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(view.getContext()))), null, null, null, 14);
            linearLayout.addView(simpleDraweeView);
        }
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas.i
    public final void JD(boolean z12) {
        this.f321643i.setEnabled(z12);
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas.i
    public final void T4(@l String str) {
        I5.a(this.f321639e, str, false);
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas.i
    public final void U1(@k String str) {
        this.f321637c.setText(str);
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas.i
    public final void X1(@k Y41.l<? super c, G0> lVar) {
        this.f321642h.setOnClickListener(new com.avito.android.seller_promotions.b(22, lVar));
        this.f321643i.setOnClickListener(new com.avito.android.seller_promotions.b(23, lVar));
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas.i
    public final void h(@k String str) {
        this.f321640f.setText(str);
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas.i
    public final void mP(boolean z12) {
        this.f321642h.setEnabled(z12);
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas.i
    public final void n0(@k String str) {
        this.f321638d.setText(str);
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas.i
    public final void x(@k com.avito.android.image_loader.k kVar) {
        ImageRequest.a aVarA = C35949t5.a(this.f321641g);
        aVarA.d(kVar);
        aVarA.c();
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas.i
    public final void x1(@l com.avito.android.image_loader.a aVar) {
        SimpleDraweeView simpleDraweeView = this.f321645k;
        if (aVar == null) {
            simpleDraweeView.setVisibility(4);
            return;
        }
        simpleDraweeView.setVisibility(0);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(aVar);
        aVarA.c();
    }
}
