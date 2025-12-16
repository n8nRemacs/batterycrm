package com.yandex.div.core.tooltip;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.internal.util.p;
import com.yandex.div2.DivTooltip;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivTooltipAnimation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/tooltip/m;", "Landroid/transition/Visibility;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class m extends Visibility {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DivTooltip.Position f367778b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Float f367779c;

    /* renamed from: d, reason: collision with root package name */
    public final float f367780d;

    /* compiled from: DivTooltipAnimation.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DivTooltip.Position.values().length];
            iArr[1] = 1;
            iArr[0] = 2;
            iArr[7] = 3;
            iArr[3] = 4;
            iArr[4] = 5;
            iArr[5] = 6;
            iArr[2] = 7;
            iArr[6] = 8;
        }
    }

    public /* synthetic */ m(DivTooltip.Position position, Float f12, int i12, C42822w c42822w) {
        this(position, (i12 & 2) != 0 ? null : f12);
    }

    @Override // android.transition.Visibility
    @Y61.k
    public final Animator onAppear(@Y61.k ViewGroup viewGroup, @Y61.k View view, @Y61.k TransitionValues transitionValues, @Y61.k TransitionValues transitionValues2) {
        int i12;
        DivTooltip.Position position = this.f367778b;
        int i13 = -1;
        switch (position) {
            case LEFT:
            case TOP_LEFT:
            case BOTTOM_LEFT:
                i12 = 1;
                break;
            case TOP:
            case BOTTOM:
                i12 = 0;
                break;
            case TOP_RIGHT:
            case RIGHT:
            case BOTTOM_RIGHT:
                i12 = -1;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (position) {
            case LEFT:
            case RIGHT:
                i13 = 0;
                break;
            case TOP_LEFT:
            case TOP:
            case TOP_RIGHT:
                i13 = 1;
                break;
            case BOTTOM_RIGHT:
            case BOTTOM:
            case BOTTOM_LEFT:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        float f12 = i12;
        float height = this.f367780d;
        Float f13 = this.f367779c;
        view.setTranslationX(f12 * (f13 != null ? f13.floatValue() * view.getWidth() : height));
        float f14 = i13;
        if (f13 != null) {
            height = view.getHeight() * f13.floatValue();
        }
        view.setTranslationY(f14 * height);
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, view.getTranslationX(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, view.getTranslationY(), 0.0f));
    }

    @Override // android.transition.Visibility
    @Y61.k
    public final Animator onDisappear(@Y61.k ViewGroup viewGroup, @Y61.k View view, @Y61.k TransitionValues transitionValues, @Y61.k TransitionValues transitionValues2) {
        int i12;
        DivTooltip.Position position = this.f367778b;
        int i13 = -1;
        switch (position) {
            case LEFT:
            case TOP_LEFT:
            case BOTTOM_LEFT:
                i12 = 1;
                break;
            case TOP:
            case BOTTOM:
                i12 = 0;
                break;
            case TOP_RIGHT:
            case RIGHT:
            case BOTTOM_RIGHT:
                i12 = -1;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (position) {
            case LEFT:
            case RIGHT:
                i13 = 0;
                break;
            case TOP_LEFT:
            case TOP:
            case TOP_RIGHT:
                i13 = 1;
                break;
            case BOTTOM_RIGHT:
            case BOTTOM:
            case BOTTOM_LEFT:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Property property = View.TRANSLATION_X;
        float f12 = i12;
        float height = this.f367780d;
        Float f13 = this.f367779c;
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.0f, f12 * (f13 != null ? f13.floatValue() * view.getWidth() : height));
        Property property2 = View.TRANSLATION_Y;
        float f14 = i13;
        if (f13 != null) {
            height = view.getHeight() * f13.floatValue();
        }
        return ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderOfFloat, PropertyValuesHolder.ofFloat((Property<?, Float>) property2, 0.0f, f14 * height));
    }

    public m(@Y61.k DivTooltip.Position position, @Y61.l Float f12) {
        this.f367778b = position;
        this.f367779c = f12;
        this.f367780d = 10.0f * p.f370185a.density;
    }
}
