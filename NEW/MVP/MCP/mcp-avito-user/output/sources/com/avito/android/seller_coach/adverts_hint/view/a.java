package com.avito.android.seller_coach.adverts_hint.view;

import Y61.k;
import android.view.View;
import androidx.core.view.C22823h0;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShortAdvicesStackView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/view/a;", "Landroidx/viewpager2/widget/ViewPager2$l;", "<init>", "()V", "a", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements ViewPager2.l {

    /* renamed from: a, reason: collision with root package name */
    public int f267322a = 3;

    /* compiled from: ShortAdvicesStackView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/view/a$a;", "", "<init>", "()V", "", "ALPHA_FACTOR", "F", "DEFAULT_ALPHA", "DEFAULT_SCALE", "DEFAULT_TRANSLATION_X", "SCALE_FACTOR", "", "SHIFT_TRANSLATION_Y", "I", "STACK_SIZE_DEFAULT", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.seller_coach.adverts_hint.view.a$a, reason: collision with other inner class name */
    public static final class C7983a {
        public /* synthetic */ C7983a(C42822w c42822w) {
            this();
        }

        public C7983a() {
        }
    }

    static {
        new C7983a(null);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.l
    public final void a(@k View view, float f12) {
        C22823h0.H(view, -Math.abs(f12));
        if (f12 <= 0.0f) {
            view.setTranslationX(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setAlpha(f12 + 1.0f);
            return;
        }
        if (f12 > this.f267322a - 1) {
            view.setTranslationX(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setAlpha(f12 + 1.0f);
            return;
        }
        float f13 = ((-0.14f) * f12) + 1.0f;
        view.setScaleX(f13);
        view.setScaleY(f13);
        view.setTranslationX((-view.getWidth()) * f12);
        view.setTranslationY(50 * f12);
        view.setAlpha((f12 * (-0.1f)) + 1.0f);
    }
}
