package com.avito.android.onboarding.dialog.view.carousel;

import kotlin.Metadata;

/* compiled from: OnboardingCarouselView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f209004b;

    public l(o oVar) {
        this.f209004b = oVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        o oVar = this.f209004b;
        oVar.f209013f.getLayoutParams().height = iIntValue;
        oVar.f209013f.requestLayout();
    }
}
