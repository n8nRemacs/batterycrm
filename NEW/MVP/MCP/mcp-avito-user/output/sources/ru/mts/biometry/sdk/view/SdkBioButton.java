package ru.mts.biometry.sdk.view;

import B91.C13113f;
import Ca1.f;
import X41.j;
import Y61.k;
import Y61.l;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.annotation.Keep;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import g2.d;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import z91.c;

@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\n\u0010\tR(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lru/mts/biometry/sdk/view/SdkBioButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "", "enabled", "Lkotlin/G0;", "setEnabled", "(Z)V", "enableLoader", "()V", "disableLoader", "", "value", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "ru/mts/biometry/sdk/view/b", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SdkBioButton extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    public final C13113f f436530b;

    @j
    public SdkBioButton(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Keep
    public void disableLoader() {
        C13113f c13113f = this.f436530b;
        c13113f.f1112c.setVisibility(4);
        c13113f.f1113d.setVisibility(0);
        c13113f.f1112c.clearAnimation();
    }

    @Keep
    public void enableLoader() throws Resources.NotFoundException {
        C13113f c13113f = this.f436530b;
        c13113f.f1112c.setVisibility(0);
        c13113f.f1113d.setVisibility(4);
        c13113f.f1112c.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.sdk_bio_rotate));
    }

    public final void g(AttributeSet attributeSet, int i12, int i13) {
        ColorStateList colorStateListValueOf;
        ColorStateList colorStateListValueOf2;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.m.f443893a, i12, i13);
        try {
            setText(typedArrayObtainStyledAttributes.getString(6));
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
            if (drawable != null) {
                setBackground(drawable);
            }
            try {
                colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(0);
            } catch (Exception unused) {
                colorStateListValueOf = ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(0, 0));
            }
            setBackgroundTintList(colorStateListValueOf);
            try {
                colorStateListValueOf2 = typedArrayObtainStyledAttributes.getColorStateList(7);
            } catch (Exception unused2) {
                colorStateListValueOf2 = ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(7, 0));
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            Integer numValueOf = Integer.valueOf(resourceId);
            if (resourceId == 0) {
                numValueOf = null;
            }
            C13113f c13113f = this.f436530b;
            if (numValueOf != null) {
                c13113f.f1113d.setTextAppearance(numValueOf.intValue());
            }
            c13113f.f1113d.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(9, false));
            c13113f.f1113d.setTextColor(colorStateListValueOf2);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(4);
            if (drawable2 != null) {
                c13113f.f1111b.setVisibility(0);
                c13113f.f1111b.setImageDrawable(drawable2);
                c13113f.f1111b.setImageTintList(colorStateListValueOf2);
            }
            c13113f.f1112c.setBackgroundTintList(colorStateListValueOf2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @l
    public String getText() {
        return this.f436530b.f1113d.getText().toString();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        C13113f c13113f = this.f436530b;
        c13113f.f1113d.setEnabled(enabled);
        c13113f.f1112c.setEnabled(enabled);
    }

    public void setText(@l String str) {
        this.f436530b.f1113d.setText(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SdkBioButton(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        Object obj = null;
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12, i13);
        LayoutInflater.from(context).inflate(R.layout.sdk_bio_button, this);
        int i15 = R.id.iv_start_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) d.a(this, R.id.iv_start_icon);
        if (appCompatImageView != null) {
            i15 = R.id.progress;
            View viewA = d.a(this, R.id.progress);
            if (viewA != null) {
                i15 = R.id.tv_btn_title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) d.a(this, R.id.tv_btn_title);
                if (appCompatTextView != null) {
                    C13113f c13113f = new C13113f(this, appCompatImageView, viewA, appCompatTextView);
                    this.f436530b = c13113f;
                    if (attributeSet != null) {
                        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.m.f443893a);
                        try {
                            b[] bVarArr = b.f436594b;
                            int i16 = typedArrayObtainStyledAttributes.getInt(8, 0);
                            Iterator it = ((AbstractC42738c) b.f436595c).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                if (((b) next).ordinal() == i16) {
                                    obj = next;
                                    break;
                                }
                            }
                            b bVar = (b) obj;
                            int i17 = (bVar == null ? -1 : f.f2260a[bVar.ordinal()]) == 1 ? R.attr.sdkBioButtonSecondary : R.attr.sdkBioButtonPrimary;
                            if (typedArrayObtainStyledAttributes.hasValue(3)) {
                                setMinHeight((int) typedArrayObtainStyledAttributes.getDimension(3, getResources().getDimension(R.dimen.sdk_bio_button_height)));
                            }
                            if (typedArrayObtainStyledAttributes.hasValue(5)) {
                                this.f436530b.f1112c.setBackground(typedArrayObtainStyledAttributes.getDrawable(5));
                            }
                            g(attributeSet, i17, i13);
                            typedArrayObtainStyledAttributes.recycle();
                        } catch (Throwable th2) {
                            typedArrayObtainStyledAttributes.recycle();
                            throw th2;
                        }
                    }
                    c13113f.f1110a.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, R.animator.anim_press));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i15)));
    }
}
