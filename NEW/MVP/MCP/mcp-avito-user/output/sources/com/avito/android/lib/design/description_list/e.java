package com.avito.android.lib.design.description_list;

import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.video.internal.audio.q;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import j.U;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: InfoTextView.kt */
@s0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001#J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010\"\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001e¨\u0006$"}, d2 = {"Lcom/avito/android/lib/design/description_list/e;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnClickListener;", "listener", "Lkotlin/G0;", "setIconClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setTextViewAppearance", "(I)V", "color", "setIconTint", "inset", "setIconInset", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "icon", "", "<set-?>", "d", "Ljava/lang/CharSequence;", "getLeftText", "()Ljava/lang/CharSequence;", "leftText", "e", "getRightText", "rightText", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f179038b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public final ImageView icon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public CharSequence leftText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public CharSequence rightText;

    /* renamed from: f, reason: collision with root package name */
    @l
    public n f179042f;

    /* renamed from: g, reason: collision with root package name */
    public int f179043g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public n f179044h;

    /* renamed from: i, reason: collision with root package name */
    public int f179045i;

    /* compiled from: InfoTextView.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/description_list/e$a;", "Landroid/text/style/MetricAffectingSpan;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends MetricAffectingSpan {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Typeface f179046b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ColorStateList f179047c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Float f179048d;

        public a() {
            this(null, null, null, 7, null);
        }

        @Override // android.text.style.CharacterStyle
        public final void updateDrawState(@k TextPaint textPaint) {
            updateMeasureState(textPaint);
            ColorStateList colorStateList = this.f179047c;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(textPaint.drawableState, 0));
            }
        }

        @Override // android.text.style.MetricAffectingSpan
        public final void updateMeasureState(@k TextPaint textPaint) {
            Typeface typeface = this.f179046b;
            if (typeface != null) {
                textPaint.setTypeface(typeface);
            }
            Float f12 = this.f179048d;
            if (f12 != null) {
                textPaint.setTextSize(f12.floatValue());
            }
        }

        public /* synthetic */ a(Typeface typeface, ColorStateList colorStateList, Float f12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : typeface, (i12 & 2) != 0 ? null : colorStateList, (i12 & 4) != 0 ? null : f12);
        }

        public a(@l Typeface typeface, @l ColorStateList colorStateList, @l Float f12) {
            this.f179046b = typeface;
            this.f179047c = colorStateList;
            this.f179048d = f12;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.infoTextView : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_InfoTextView : i13;
        super(context, attributeSet, i12, i13);
        LayoutInflater.from(context).inflate(R.layout.design_info_view, this);
        View viewFindViewById = findViewById(R.id.info_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f179038b = textView;
        View viewFindViewById2 = findViewById(R.id.info_tooltip);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById2;
        this.icon = imageView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178937O, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            textView.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(4, 0));
        }
        this.leftText = typedArrayObtainStyledAttributes.getString(0);
        this.rightText = typedArrayObtainStyledAttributes.getString(2);
        this.f179043g = typedArrayObtainStyledAttributes.getColor(1, C35835l0.d(R.attr.gray54, context));
        this.f179045i = typedArrayObtainStyledAttributes.getColor(3, C35835l0.d(R.attr.black, context));
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            imageView.post(new q(typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0), 7, this));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            imageView.setImageTintList(x.a(typedArrayObtainStyledAttributes, context, 6));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setIconDrawable(typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        g();
    }

    public final void g() {
        CharSequence charSequence;
        SpannableString spannableString;
        CharSequence charSequence2 = this.leftText;
        if (charSequence2 == null || (charSequence = this.rightText) == null) {
            return;
        }
        if (charSequence2 == null || charSequence == null) {
            spannableString = new SpannableString("");
        } else {
            SpannableString spannableString2 = new SpannableString(((Object) charSequence2) + ": " + ((Object) charSequence));
            n nVar = this.f179042f;
            spannableString2.setSpan(nVar != null ? new a(nVar.f12989c, ColorStateList.valueOf(this.f179043g), nVar.f12987a) : new ForegroundColorSpan(this.f179043g), 0, charSequence2.length() + 1, 18);
            n nVar2 = this.f179044h;
            spannableString2.setSpan(nVar2 != null ? new a(nVar2.f12989c, ColorStateList.valueOf(this.f179045i), nVar2.f12987a) : new ForegroundColorSpan(this.f179043g), charSequence2.length() + 1, spannableString2.length(), 18);
            spannableString = spannableString2;
        }
        this.f179038b.setText(spannableString);
    }

    @k
    public final ImageView getIcon() {
        return this.icon;
    }

    @l
    public final CharSequence getLeftText() {
        return this.leftText;
    }

    @l
    public final CharSequence getRightText() {
        return this.rightText;
    }

    public final void setIconClickListener(@l View.OnClickListener listener) {
        this.icon.setOnClickListener(listener);
    }

    public final void setIconDrawable(@l Drawable iconDrawable) {
        C35821j2.a(this.icon, iconDrawable);
    }

    public final void setIconInset(@U int inset) {
        TextView textView = this.f179038b;
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), inset, textView.getPaddingBottom());
    }

    public final void setIconTint(int color) {
        this.icon.setImageTintList(ColorStateList.valueOf(color));
    }

    public final void setTextViewAppearance(@f0 int style) {
        this.f179038b.setTextAppearance(style);
    }
}
