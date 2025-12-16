package com.avito.android.body_condition;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.n;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.f0;
import kotlin.Metadata;

/* compiled from: CarBodySidePageButton.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/body_condition/k;", "Landroid/widget/FrameLayout;", "", "title", "Lkotlin/G0;", "setTitle", "(Ljava/lang/String;)V", "", "isActivated", "setRedDot", "(Z)V", "", "resId", "setTitleAppearance", "(I)V", "Lcom/avito/android/remote/model/Image;", "image", "setImage", "(Lcom/avito/android/remote/model/Image;)V", "isRedesign", "setSelectedBackground", "_avito_body-condition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f106828b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f106829c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f106830d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f106831e;

    public k(@Y61.k Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.car_body_side_page_button, (ViewGroup) this, true);
        TextView textView = (TextView) ((ViewGroup) findViewById(R.id.container)).findViewById(R.id.title);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.f106828b = textView;
        this.f106829c = (SimpleDraweeView) findViewById(R.id.image_view);
        this.f106830d = findViewById(R.id.overlay);
        this.f106831e = (ImageView) findViewById(R.id.red_dot);
        setClickable(true);
        setFocusable(true);
    }

    private static final void setIsSelected$setSelectedState(k kVar) {
        kVar.f106828b.setTextColor(C35835l0.d(R.attr.black, kVar.getContext()));
        D6.H(kVar.f106830d);
    }

    public final void a(boolean z12, boolean z13) {
        if (z12) {
            setIsSelected$setSelectedState(this);
        } else {
            this.f106828b.setTextColor(C35835l0.d(z13 ? R.attr.gray54 : R.attr.gray48, getContext()));
            D6.w(this.f106830d);
        }
    }

    public final void setImage(@Y61.k Image image) {
        C35949t5.c(this.f106829c, n.a(image), null, null, null, 14);
    }

    public final void setRedDot(boolean isActivated) {
        D6.G(this.f106831e, isActivated);
    }

    public final void setSelectedBackground(boolean isRedesign) {
        D6.D(this.f106830d, isRedesign ? R.drawable.car_body_side_page_button_overlay_redesign : R.drawable.car_body_side_page_button_overlay);
    }

    public final void setTitle(@Y61.l String title) {
        I5.a(this.f106828b, title, false);
    }

    public final void setTitleAppearance(@f0 int resId) {
        this.f106828b.setTextAppearance(resId);
    }
}
