package com.avito.android.lib.design.alert_banner;

import RU.a;
import X41.j;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.button.b;
import com.avito.android.lib.design.close_button.CloseButton;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.seller_promotions.o;
import com.avito.android.travel_guest_profile.items.profile_header.h;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.google.android.material.shape.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import wK0.AbstractC49528c;

/* compiled from: AlertBanner.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/avito/android/lib/design/alert_banner/AlertBanner;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "visible", "Lkotlin/G0;", "setCloseButtonVisible", "(Z)V", "Landroid/view/View$OnClickListener;", "listener", "setCloseButtonListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/view/View;", "<set-?>", "d", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "contentView", "LRU/a;", "e", "LRU/a;", "getContent", "()LRU/a;", "content", "", "f", "I", "getContentLayoutRes", "()I", "contentLayoutRes", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CustomViewStyleable"})
/* loaded from: classes14.dex */
public final class AlertBanner extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @l
    public ViewGroup f178261b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public CloseButton f178262c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public View contentView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    public final a content;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int contentLayoutRes;

    @j
    public AlertBanner(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public static void h(AlertBanner alertBanner, int i12) {
        int i13 = alertBanner.contentLayoutRes;
        TypedArray typedArrayObtainStyledAttributes = alertBanner.getContext().obtainStyledAttributes(null, d.n.f178962d, 0, C35835l0.j(i12, alertBanner.getContext()));
        alertBanner.g(typedArrayObtainStyledAttributes, Integer.valueOf(i13));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(@l View view, int i12, @l ViewGroup.LayoutParams layoutParams) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.container) {
            this.f178261b = (ViewGroup) view;
        } else {
            if (numValueOf == null || numValueOf.intValue() != R.id.close_button) {
                throw new UnsupportedOperationException("Operation addView isn't supported. You should use setContentByRes");
            }
            this.f178262c = (CloseButton) view;
        }
        super.addView(view, i12, layoutParams);
    }

    public final void g(TypedArray typedArray, Integer num) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int i12;
        ImageView imageView;
        ViewGroup viewGroup = this.f178261b;
        if (viewGroup == null) {
            throw new IllegalStateException("Alert hasn't been initialized yet");
        }
        setBackground(AbstractC49528c.a.b(AbstractC49528c.f441377b, q.a(getContext(), typedArray.getResourceId(4, 0), 0).a(), 0, 0, 0, 0, x.a(typedArray, getContext(), 2), x.a(typedArray, getContext(), 3), null, null, 414));
        if (typedArray.hasValue(13)) {
            dimensionPixelSize2 = typedArray.getDimensionPixelSize(13, 0);
            i12 = dimensionPixelSize2;
            dimensionPixelSize3 = i12;
            dimensionPixelSize = dimensionPixelSize3;
        } else {
            dimensionPixelSize = typedArray.getDimensionPixelSize(15, 0);
            dimensionPixelSize2 = 0;
            dimensionPixelSize3 = typedArray.getDimensionPixelSize(14, 0);
            i12 = 0;
        }
        int dimensionPixelSize4 = typedArray.getDimensionPixelSize(7, 0);
        ConstraintLayout.b bVar = (ConstraintLayout.b) viewGroup.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = dimensionPixelSize2;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = dimensionPixelSize4;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = dimensionPixelSize3;
        bVar.f44156C = dimensionPixelSize;
        int dimensionPixelSize5 = typedArray.getDimensionPixelSize(9, 0);
        int dimensionPixelSize6 = typedArray.getDimensionPixelSize(8, 0);
        CloseButton closeButton = this.f178262c;
        if (closeButton != null) {
            D6.c(closeButton, null, Integer.valueOf(dimensionPixelSize5), Integer.valueOf(dimensionPixelSize6), null, 9);
        }
        CloseButton closeButton2 = this.f178262c;
        if (closeButton2 != null) {
            closeButton2.setAppearance(typedArray.getResourceId(10, 0));
        }
        int resourceId = typedArray.getResourceId(16, 0);
        this.contentLayoutRes = num != null ? num.intValue() : typedArray.getResourceId(12, 0);
        View viewInflate = LayoutInflater.from(new ContextThemeWrapper(getContext(), resourceId)).inflate(this.contentLayoutRes, viewGroup, false);
        this.contentView = viewInflate;
        a aVar = this.content;
        aVar.f14462j = null;
        aVar.f14463k = null;
        aVar.f14464l = null;
        aVar.f14465m = null;
        aVar.f14466n = null;
        if (viewInflate != null) {
            aVar.f14462j = (TextView) viewInflate.findViewById(R.id.title);
            aVar.f14463k = (TextView) viewInflate.findViewById(R.id.body);
            aVar.f14464l = (Button) viewInflate.findViewById(R.id.button);
            aVar.f14465m = (TextView) viewInflate.findViewById(R.id.link);
            aVar.f14466n = (ImageView) viewInflate.findViewById(R.id.image);
            TextView textView = aVar.f14462j;
            if (textView != null) {
                D6.w(textView);
            }
            TextView textView2 = aVar.f14463k;
            if (textView2 != null) {
                D6.w(textView2);
            }
            ImageView imageView2 = aVar.f14466n;
            if (imageView2 != null) {
                D6.w(imageView2);
            }
            Button button = aVar.f14464l;
            if (button != null) {
                D6.w(button);
            }
            TextView textView3 = aVar.f14465m;
            if (textView3 != null) {
                D6.w(textView3);
            }
            TextView textView4 = aVar.f14465m;
            if (textView4 != null) {
                textView4.setMovementMethod(LinkMovementMethod.getInstance());
            }
            aVar.c(aVar.f14453a);
            aVar.a(aVar.f14454b);
            ImageView imageView3 = aVar.f14466n;
            if (imageView3 != null) {
                imageView3.setBackground(null);
            }
            aVar.b(aVar.f14459g);
            String str = aVar.f14455c;
            h hVar = aVar.f14456d;
            aVar.f14455c = str;
            aVar.f14456d = hVar;
            Button button2 = aVar.f14464l;
            if (button2 != null) {
                b.a(button2, str, false);
            }
            Button button3 = aVar.f14464l;
            if (button3 != null) {
                button3.setOnClickListener(hVar);
            }
            String str2 = aVar.f14457e;
            o oVar = aVar.f14458f;
            aVar.f14457e = str2;
            aVar.f14458f = oVar;
            TextView textView5 = aVar.f14465m;
            if (textView5 != null) {
                I5.a(textView5, str2, false);
            }
            TextView textView6 = aVar.f14465m;
            if (textView6 != null) {
                textView6.setOnClickListener(oVar);
            }
            if (aVar.f14461i && (imageView = aVar.f14466n) != null) {
                imageView.setImageTintList(aVar.f14460h);
            }
        }
        viewGroup.removeAllViews();
        viewGroup.addView(this.contentView, 0);
    }

    @k
    public final a getContent() {
        return this.content;
    }

    public final int getContentLayoutRes() {
        return this.contentLayoutRes;
    }

    @l
    public final View getContentView() {
        return this.contentView;
    }

    public final void setCloseButtonListener(@l View.OnClickListener listener) {
        CloseButton closeButton = this.f178262c;
        if (closeButton != null) {
            closeButton.setOnClickListener(listener);
        }
    }

    public final void setCloseButtonVisible(boolean visible) {
        CloseButton closeButton = this.f178262c;
        if (closeButton != null) {
            D6.G(closeButton, visible);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AlertBanner(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.alertBanner : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_AlertBanner : i13;
        super(context, attributeSet, i12);
        LayoutInflater.from(context).inflate(R.layout.design_alert_banner, (ViewGroup) this, true);
        a aVar = new a();
        int[] iArr = d.n.f178962d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i12, i13);
        aVar.f14453a = typedArrayObtainStyledAttributes.getString(20);
        aVar.f14454b = typedArrayObtainStyledAttributes.getString(5);
        aVar.f14455c = typedArrayObtainStyledAttributes.getString(6);
        aVar.f14457e = typedArrayObtainStyledAttributes.getString(19);
        aVar.f14459g = typedArrayObtainStyledAttributes.getDrawable(17);
        typedArrayObtainStyledAttributes.recycle();
        this.content = aVar;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i12, i13);
        g(typedArrayObtainStyledAttributes2, null);
        CloseButton closeButton = this.f178262c;
        if (closeButton != null) {
            D6.G(closeButton, typedArrayObtainStyledAttributes2.getBoolean(11, false));
        }
        typedArrayObtainStyledAttributes2.recycle();
    }
}
