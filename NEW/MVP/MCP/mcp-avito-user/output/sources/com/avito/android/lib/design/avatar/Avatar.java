package com.avito.android.lib.design.avatar;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.design.State;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import gw.InterfaceC40743a;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Avatar.kt */
@s0
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR.\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R.\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R*\u0010!\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010)\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\"8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010-\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R*\u00105\u001a\u00020.2\u0006\u0010\n\u001a\u00020.8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u00109\u001a\u00020.2\u0006\u0010\n\u001a\u00020.8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b7\u00102\"\u0004\b8\u00104R$\u0010A\u001a\u0004\u0018\u00010:8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/avito/android/lib/design/avatar/Avatar;", "Landroidx/cardview/widget/CardView;", "Lgw/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/drawable/Drawable;", "value", "b", "Landroid/graphics/drawable/Drawable;", "getPlaceholderBackground", "()Landroid/graphics/drawable/Drawable;", "setPlaceholderBackground", "(Landroid/graphics/drawable/Drawable;)V", "placeholderBackground", "c", "getPlaceholderImage", "setPlaceholderImage", "placeholderImage", "d", "getImage", "setImage", "image", "", "e", "I", "getSize", "()I", "setSize", "(I)V", "size", "Lcom/avito/android/design/State;", "f", "Lcom/avito/android/design/State;", "getState", "()Lcom/avito/android/design/State;", "setState", "(Lcom/avito/android/design/State;)V", VoiceInfo.STATE, "g", "getCornerRadius", "setCornerRadius", "cornerRadius", "Landroid/content/res/ColorStateList;", "h", "Landroid/content/res/ColorStateList;", "getRippleColor", "()Landroid/content/res/ColorStateList;", "setRippleColor", "(Landroid/content/res/ColorStateList;)V", "rippleColor", "i", "getTintColor", "setTintColor", "tintColor", "Landroid/view/View;", "j", "Landroid/view/View;", "getImageContainerView", "()Landroid/view/View;", "setImageContainerView", "(Landroid/view/View;)V", "imageContainerView", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Avatar extends CardView implements InterfaceC40743a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public Drawable placeholderBackground;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public Drawable placeholderImage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public Drawable image;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    public State state;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int cornerRadius;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    public ColorStateList rippleColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    public ColorStateList tintColor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @l
    public View imageContainerView;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final ImageView f178356k;

    /* compiled from: Avatar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                State.a aVar = State.f135879c;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                State.a aVar2 = State.f135879c;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Avatar(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.state = State.f135882f;
        this.rippleColor = ColorStateList.valueOf(0);
        this.tintColor = ColorStateList.valueOf(0);
        this.imageContainerView = this;
        LayoutInflater.from(getContext()).inflate(R.layout.design_avatar, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.image_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f178356k = (ImageView) viewFindViewById;
        setCardElevation(0.0f);
        setPreventCornerOverlap(false);
        setUseCompatPadding(false);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f179000w, 0, 0);
        setImage(typedArrayObtainStyledAttributes.getDrawable(0));
        setPlaceholderBackground(typedArrayObtainStyledAttributes.getDrawable(2));
        setPlaceholderImage(typedArrayObtainStyledAttributes.getDrawable(3));
        State.a aVar = State.f135879c;
        int integer = typedArrayObtainStyledAttributes.getInteger(5, getState().f135885b);
        aVar.getClass();
        for (State state : State.values()) {
            if (state.f135885b == integer) {
                setState(state);
                setCornerRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
                ColorStateList colorStateListA = x.a(typedArrayObtainStyledAttributes, getContext(), 4);
                setRippleColor(colorStateListA == null ? this.rippleColor : colorStateListA);
                ColorStateList colorStateListA2 = x.a(typedArrayObtainStyledAttributes, getContext(), 6);
                setTintColor(colorStateListA2 == null ? this.tintColor : colorStateListA2);
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final void c() {
        Drawable drawable;
        int iOrdinal = getState().ordinal();
        ImageView imageView = this.f178356k;
        if (iOrdinal == 0) {
            if (this.placeholderBackground == null || (drawable = this.placeholderImage) == null) {
                return;
            }
            imageView.setImageDrawable(new LayerDrawable(new Drawable[]{this.placeholderBackground, C35835l0.l(drawable, this.tintColor.getDefaultColor())}));
            return;
        }
        if (iOrdinal == 1) {
            imageView.setImageDrawable(this.placeholderBackground);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            imageView.setImageDrawable(getImage());
        }
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // gw.InterfaceC40743a
    @l
    public Drawable getImage() {
        return this.image;
    }

    @Override // gw.InterfaceC40743a
    @l
    public View getImageContainerView() {
        return this.imageContainerView;
    }

    @l
    public final Drawable getPlaceholderBackground() {
        return this.placeholderBackground;
    }

    @l
    public final Drawable getPlaceholderImage() {
        return this.placeholderImage;
    }

    @k
    public final ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    public final int getSize() {
        return this.size;
    }

    @k
    public State getState() {
        return this.state;
    }

    @k
    public final ColorStateList getTintColor() {
        return this.tintColor;
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        setSize(getMeasuredHeight());
        float f12 = this.size / 2.0f;
        float f13 = this.cornerRadius;
        if (f12 > f13) {
            f12 = f13;
        }
        setRadius(f12);
        if (this.size != 0) {
            setForeground(new RippleDrawable(this.rippleColor, null, null));
        }
        c();
    }

    public final void setCornerRadius(int i12) {
        this.cornerRadius = i12;
        float f12 = this.size / 2.0f;
        float f13 = i12;
        if (f12 > f13) {
            f12 = f13;
        }
        setRadius(f12);
    }

    @Override // gw.InterfaceC40743a
    public void setImage(@l Drawable drawable) {
        this.image = drawable;
        c();
    }

    public void setImageContainerView(@l View view) {
        this.imageContainerView = view;
    }

    public final void setPlaceholderBackground(@l Drawable drawable) {
        this.placeholderBackground = drawable;
        c();
    }

    public final void setPlaceholderImage(@l Drawable drawable) {
        this.placeholderImage = drawable;
        c();
    }

    public final void setRippleColor(@k ColorStateList colorStateList) {
        this.rippleColor = colorStateList;
        if (this.size == 0) {
            return;
        }
        setForeground(new RippleDrawable(this.rippleColor, null, null));
    }

    public final void setSize(int i12) {
        this.size = i12;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int i13 = this.size;
            layoutParams.height = i13;
            layoutParams.width = i13;
            requestLayout();
        }
    }

    @Override // gw.InterfaceC40743a
    public void setState(@k State state) {
        this.state = state;
        c();
    }

    public final void setTintColor(@k ColorStateList colorStateList) {
        this.tintColor = colorStateList;
        c();
    }
}
