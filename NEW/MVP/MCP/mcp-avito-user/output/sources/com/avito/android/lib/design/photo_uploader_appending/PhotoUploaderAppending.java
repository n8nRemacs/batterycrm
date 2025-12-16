package com.avito.android.lib.design.photo_uploader_appending;

import X41.j;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.I5;
import com.avito.android.util.r6;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import j.e0;
import j.f0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;
import wK0.AbstractC49526a;

/* compiled from: PhotoUploaderAppending.kt */
@s0
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0015J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\n\u001a\u00020\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0010\u001a\u00020\u00052\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\rJ\u0019\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/avito/android/lib/design/photo_uploader_appending/PhotoUploaderAppending;", "Landroid/widget/FrameLayout;", "LpK0/a;", "", VoiceInfo.STATE, "Lkotlin/G0;", "setState", "([I)V", "", "text", "setText", "(Ljava/lang/String;)V", "", "(Ljava/lang/Integer;)V", "Landroid/graphics/drawable/Drawable;", "icon", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "(I)V", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoUploaderAppending extends FrameLayout implements InterfaceC46971a {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f179938f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final int[] f179939g = new int[0];

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final int[] f179940h = {R.attr.state_error};

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f179941b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f179942c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f179943d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public int[] f179944e;

    /* compiled from: PhotoUploaderAppending.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/photo_uploader_appending/PhotoUploaderAppending$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @j
    public PhotoUploaderAppending(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void a(TypedArray typedArray) {
        setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, x.a(typedArray, getContext(), 0), x.a(typedArray, getContext(), 10), typedArray.getDimensionPixelSize(6, 0), x.a(typedArray, getContext(), 1), typedArray.getDimensionPixelSize(2, 0), 96));
        if (typedArray.hasValue(12)) {
            TextView textView = this.f179942c;
            if (textView == null) {
                textView = null;
            }
            textView.setTextAppearance(typedArray.getResourceId(12, 0));
        }
        if (typedArray.hasValue(13)) {
            TextView textView2 = this.f179942c;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setTextColor(x.a(typedArray, getContext(), 13));
        }
        if (typedArray.hasValue(5)) {
            LinearLayout linearLayout = this.f179943d;
            if (linearLayout == null) {
                linearLayout = null;
            }
            linearLayout.setShowDividers(2);
            LinearLayout linearLayout2 = this.f179943d;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            linearLayout2.setDividerDrawable(r6.a(typedArray.getDimensionPixelSize(5, 0)));
        }
        if (typedArray.hasValue(8)) {
            ImageView imageView = this.f179941b;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setImageTintList(x.a(typedArray, getContext(), 8));
        }
        if (typedArray.hasValue(3)) {
            LinearLayout linearLayout3 = this.f179943d;
            if (linearLayout3 == null) {
                linearLayout3 = null;
            }
            linearLayout3.setOrientation(typedArray.getInt(3, 0));
        }
        if (typedArray.hasValue(4)) {
            LinearLayout linearLayout4 = this.f179943d;
            LinearLayout linearLayout5 = linearLayout4 != null ? linearLayout4 : null;
            int dimensionPixelSize = typedArray.getDimensionPixelSize(4, 0);
            linearLayout5.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
        setText(typedArray.getString(11));
        setIcon(typedArray.getDrawable(7));
    }

    @Override // android.view.ViewGroup, android.view.View
    @k
    public final int[] onCreateDrawableState(int i12) {
        return View.mergeDrawableStates(super.onCreateDrawableState(i12 + this.f179944e.length), this.f179944e);
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178971h0);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setIcon(@l Drawable icon) {
        ImageView imageView = this.f179941b;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(icon);
    }

    public final void setState(@k int[] state) {
        this.f179944e = Arrays.copyOf(state, state.length);
        refreshDrawableState();
    }

    public final void setText(@l String text) {
        TextView textView = this.f179942c;
        if (textView == null) {
            textView = null;
        }
        I5.a(textView, text, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PhotoUploaderAppending(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.photoUploaderAppending : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_PhotoUploaderAppending : i13;
        super(context, attributeSet, i12);
        this.f179944e = new int[0];
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178971h0, i12, i13);
        LayoutInflater.from(getContext()).inflate(typedArrayObtainStyledAttributes.getResourceId(9, R.layout.photo_uploader_appending), (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.icon_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f179941b = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.text_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f179942c = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.content_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f179943d = (LinearLayout) viewFindViewById3;
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setIcon(@InterfaceC42165v @l Integer icon) {
        Drawable drawable;
        if (icon != null) {
            drawable = androidx.core.content.d.getDrawable(getContext(), icon.intValue());
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public final void setText(@l @e0 Integer text) {
        String string;
        if (text != null) {
            string = getContext().getString(text.intValue());
        } else {
            string = null;
        }
        setText(string);
    }
}
