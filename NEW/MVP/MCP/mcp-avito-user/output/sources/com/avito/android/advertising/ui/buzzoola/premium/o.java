package com.avito.android.advertising.ui.buzzoola.premium;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.util.layout.RatioFrameLayout;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BuzzoolaPremiumLegalItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/premium/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advertising/ui/buzzoola/premium/n;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f88659b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RatioFrameLayout f88660c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Float f88661d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f88662e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f88663f;

    public o(@Y61.k View view) {
        super(view);
        this.f88659b = view;
        this.f88660c = (RatioFrameLayout) view;
        View viewFindViewById = view.findViewById(R.id.logo);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f88662e = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f88663f = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.n
    public final void I4(@Y61.l Uri uri) {
        boolean z12 = uri != null;
        SimpleDraweeView simpleDraweeView = this.f88662e;
        D6.G(simpleDraweeView, z12);
        if (uri == null) {
            simpleDraweeView.setController(null);
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(ImageKt.toImage(uri)));
        aVarA.f169500r = false;
        aVarA.c();
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.n
    public final void Mm(int i12) {
        View view = this.f88659b;
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable == null) {
            return;
        }
        GradientDrawable gradientDrawable2 = (GradientDrawable) gradientDrawable.mutate();
        gradientDrawable2.setColor(i12);
        view.setBackground(gradientDrawable2);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.n
    public final void VN(int i12, @Y61.k String str) {
        TextView textView = this.f88663f;
        textView.setText(str);
        textView.setTextColor(i12);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.n
    public final void q0(float f12) {
        if (L.d(this.f88661d, f12)) {
            return;
        }
        RatioFrameLayout ratioFrameLayout = this.f88660c;
        ratioFrameLayout.setRatio(f12);
        ratioFrameLayout.requestLayout();
        this.f88661d = Float.valueOf(f12);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.n
    public final void x0(@Y61.k View.OnClickListener onClickListener) {
        this.f88659b.setOnClickListener(onClickListener);
    }
}
