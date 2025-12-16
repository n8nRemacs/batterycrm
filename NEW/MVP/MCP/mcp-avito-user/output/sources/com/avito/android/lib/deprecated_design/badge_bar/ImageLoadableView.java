package com.avito.android.lib.deprecated_design.badge_bar;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.d;
import com.avito.android.R;
import com.avito.android.design.State;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import fw.C40487a;
import gw.InterfaceC40743a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ImageLoadableView.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR.\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR*\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00108\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/lib/deprecated_design/badge_bar/ImageLoadableView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lgw/a;", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "getPlaceholderDrawable", "()Landroid/graphics/drawable/Drawable;", "setPlaceholderDrawable", "(Landroid/graphics/drawable/Drawable;)V", "placeholderDrawable", "value", "c", "getImage", "setImage", "image", "Lcom/avito/android/design/State;", "d", "Lcom/avito/android/design/State;", "getState", "()Lcom/avito/android/design/State;", "setState", "(Lcom/avito/android/design/State;)V", VoiceInfo.STATE, "Landroid/view/View;", "e", "Landroid/view/View;", "getImageContainerView", "()Landroid/view/View;", "setImageContainerView", "(Landroid/view/View;)V", "imageContainerView", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImageLoadableView extends AppCompatImageView implements InterfaceC40743a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public Drawable placeholderDrawable;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public Drawable image;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    public State state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public View imageContainerView;

    /* compiled from: ImageLoadableView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f177824a;

        static {
            int[] iArr = new int[State.values().length];
            try {
                State.a aVar = State.f135879c;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f177824a = iArr;
        }
    }

    @j
    public ImageLoadableView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
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
    public final Drawable getPlaceholderDrawable() {
        return this.placeholderDrawable;
    }

    @k
    public State getState() {
        return this.state;
    }

    @Override // gw.InterfaceC40743a
    public void setImage(@l Drawable drawable) {
        this.image = drawable;
        if (a.f177824a[getState().ordinal()] == 1) {
            setImageDrawable(getImage());
        } else {
            setImageDrawable(this.placeholderDrawable);
        }
    }

    public void setImageContainerView(@l View view) {
        this.imageContainerView = view;
    }

    public final void setPlaceholderDrawable(@l Drawable drawable) {
        this.placeholderDrawable = drawable;
    }

    @Override // gw.InterfaceC40743a
    public void setState(@k State state) {
        this.state = state;
        if (a.f177824a[getState().ordinal()] == 1) {
            setImageDrawable(getImage());
        } else {
            setImageDrawable(this.placeholderDrawable);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageLoadableView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.imageLoadableView : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_ImageLoadableView : i13;
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C40487a.l.f396189d, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.placeholderDrawable = d.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.state = State.f135880d;
        this.imageContainerView = this;
    }
}
