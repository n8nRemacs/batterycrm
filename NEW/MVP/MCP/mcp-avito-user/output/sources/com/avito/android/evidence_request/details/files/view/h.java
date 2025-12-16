package com.avito.android.evidence_request.details.files.view;

import android.animation.ValueAnimator;
import com.avito.android.evidence_request.details.files.view.g;
import com.avito.android.evidence_request.mvi.evidence_details.adapter.files.i;
import com.avito.android.lib.design.progress_bar.ProgressBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProgressBar f148489b;

    public /* synthetic */ h(ProgressBar progressBar, int i12) {
        this.f148488a = i12;
        this.f148489b = progressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ProgressBar progressBar = this.f148489b;
        switch (this.f148488a) {
            case 0:
                int i12 = g.b.f148479k;
                progressBar.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int i13 = g.b.f148479k;
                progressBar.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                int i14 = i.b.f148790j;
                progressBar.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int i15 = i.b.f148790j;
                progressBar.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
