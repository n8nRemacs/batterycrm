package com.avito.android.component.advert_contact_bar.installments;

import Y61.k;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.compose.ui.RunnableC22211b;
import androidx.core.view.o0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Animations.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_ui-components_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: Animations.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.component.advert_contact_bar.installments.a$a, reason: collision with other inner class name */
    public static final class C3718a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f125178l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ View f125179m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3718a(LinearLayout linearLayout, View view) {
            super(0);
            this.f125178l = linearLayout;
            this.f125179m = view;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f125178l.removeView(this.f125179m);
            return G0.f406611a;
        }
    }

    public static final ViewPropertyAnimator a(View view, boolean z12) {
        return view.animate().alpha(z12 ? 1.0f : 0.0f).setDuration(250L).setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public static final void b(@k LinearLayout linearLayout) {
        if (linearLayout.getChildCount() == 0) {
            return;
        }
        View viewA = o0.a(linearLayout, 0);
        c(viewA, false).withEndAction(new RunnableC22211b(8, new C3718a(linearLayout, viewA))).start();
    }

    public static final ViewPropertyAnimator c(View view, boolean z12) {
        float f12 = z12 ? 0.5f : 1.0f;
        float f13 = z12 ? 1.0f : 0.5f;
        view.setPivotX(0.0f);
        view.setAlpha(z12 ? 0.0f : 1.0f);
        view.setScaleX(f12);
        return a(view, z12).scaleX(f13);
    }
}
