package com.avito.android.shortcut_navigation_bar;

import android.widget.FrameLayout;
import com.avito.android.remote.model.search.TopWidget;
import com.avito.android.shortcut_navigation_bar.m0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g0 extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34999p f283404l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TopWidget.Onboarding f283405m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283406n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283407o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(C34999p c34999p, TopWidget.Onboarding onboarding, Y41.a<G0> aVar, Y41.a<G0> aVar2) {
        super(0);
        this.f283404l = c34999p;
        this.f283405m = onboarding;
        this.f283406n = aVar;
        this.f283407o = aVar2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Integer bottom;
        Integer top;
        Integer right;
        Integer left;
        C34999p c34999p = this.f283404l;
        c34999p.getClass();
        TopWidget.Onboarding onboarding = this.f283405m;
        TopWidget.Onboarding.Margin margin = onboarding.getMargin();
        int iB2 = (margin == null || (left = margin.getLeft()) == null) ? 0 : y6.b(left.intValue());
        TopWidget.Onboarding.Margin margin2 = onboarding.getMargin();
        int iB3 = (margin2 == null || (right = margin2.getRight()) == null) ? 0 : y6.b(right.intValue());
        TopWidget.Onboarding.Margin margin3 = onboarding.getMargin();
        int iB4 = (margin3 == null || (top = margin3.getTop()) == null) ? 0 : y6.b(top.intValue());
        TopWidget.Onboarding.Margin margin4 = onboarding.getMargin();
        int iB5 = (margin4 == null || (bottom = margin4.getBottom()) == null) ? 0 : y6.b(bottom.intValue());
        FrameLayout frameLayout = c34999p.f283449D;
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((frameLayout.getWidth() - iB2) - iB3, (frameLayout.getHeight() - iB4) - iB5);
        layoutParams.setMargins(iB2, iB4, iB3, iB5);
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        m0 m0Var = m0.f283432a;
        e0 e0Var = new e0(this.f283407o, c34999p, onboarding);
        f0 f0Var = new f0(c34999p, frameLayout2);
        m0Var.getClass();
        m0.a(m0Var, frameLayout2, new m0.b(onboarding.getTitle(), onboarding.getText(), onboarding.getButtonTitle()), e0Var, f0Var, this.f283406n, y6.b(onboarding.getCornerRadius() != null ? r1.intValue() : 0), null, null, 960);
        return G0.f406611a;
    }
}
