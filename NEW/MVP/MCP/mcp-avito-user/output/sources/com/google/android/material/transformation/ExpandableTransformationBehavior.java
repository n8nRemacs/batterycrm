package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import j.InterfaceC42153i;
import j.N;
import j.P;

@Deprecated
/* loaded from: classes6.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b, reason: collision with root package name */
    @P
    public AnimatorSet f357721b;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @InterfaceC42153i
    public void v(View view, View view2, boolean z12, boolean z13) {
        AnimatorSet animatorSet = this.f357721b;
        boolean z14 = animatorSet != null;
        if (z14) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetW = w(view, view2, z12, z14);
        this.f357721b = animatorSetW;
        animatorSetW.addListener(new a(this));
        this.f357721b.start();
        if (z13) {
            return;
        }
        this.f357721b.end();
    }

    @N
    public abstract AnimatorSet w(View view, View view2, boolean z12, boolean z13);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
