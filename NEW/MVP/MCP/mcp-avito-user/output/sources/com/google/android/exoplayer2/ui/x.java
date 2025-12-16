package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class x implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f347660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f347661b;

    public /* synthetic */ x(Object obj, int i12) {
        this.f347660a = i12;
        this.f347661b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.f347661b;
        switch (this.f347660a) {
            case 0:
                z zVar = (z) obj;
                zVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = zVar.f347668b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup = zVar.f347669c;
                if (viewGroup != null) {
                    viewGroup.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = zVar.f347671e;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                    break;
                }
                break;
            case 1:
                z zVar2 = (z) obj;
                zVar2.getClass();
                zVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                z zVar3 = (z) obj;
                zVar3.getClass();
                zVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                z zVar4 = (z) obj;
                zVar4.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = zVar4.f347668b;
                if (view2 != null) {
                    view2.setAlpha(fFloatValue2);
                }
                ViewGroup viewGroup3 = zVar4.f347669c;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue2);
                }
                ViewGroup viewGroup4 = zVar4.f347671e;
                if (viewGroup4 != null) {
                    viewGroup4.setAlpha(fFloatValue2);
                    break;
                }
                break;
            default:
                int i12 = i.f347464Q;
                i iVar = (i) obj;
                iVar.getClass();
                iVar.f347471G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.invalidate(iVar.f347481b);
                break;
        }
    }
}
