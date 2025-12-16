package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes2.dex */
public final class pf implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pf(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                qf qfVar = (qf) this.b;
                qfVar.d = null;
                qf.a(qfVar, (OneMeButton) this.c);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, k18] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qf qfVar = (qf) obj2;
                qfVar.d = null;
                qf.a(qfVar, (OneMeButton) obj);
                return;
            case 1:
                return;
            case 2:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj2;
                yy7[] yy7VarArr = FakeInAppReviewBottomSheet.L0;
                ((ConstraintLayout) fakeInAppReviewBottomSheet.C0.D(fakeInAppReviewBottomSheet, FakeInAppReviewBottomSheet.L0[0])).setVisibility(8);
                ((FrameLayout) obj).postDelayed(fakeInAppReviewBottomSheet.J0, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                return;
            case 3:
                ((ap8) obj2).setAlpha(((rf) obj).b.floatValue());
                return;
            default:
                fbb fbbVar = (fbb) obj2;
                ?? r7 = fbbVar.B0;
                ViewGroup.LayoutParams layoutParams = fbbVar.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = -2;
                layoutParams.height = -2;
                fbbVar.setMinimumHeight(0);
                fbbVar.setLayoutParams(layoutParams);
                int iOrdinal = fbbVar.s0.ordinal();
                if (iOrdinal == 0) {
                    ((View) fbbVar.D0.getValue()).setVisibility(fbbVar.getShouldShowSearchIcon() ? 0 : 8);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((View) fbbVar.C0.getValue()).setVisibility(fbbVar.getShouldShowSearchIcon() ? 0 : 8);
                }
                ((View) fbbVar.A0.getValue()).setVisibility(8);
                ((View) fbbVar.E0.getValue()).setVisibility(8);
                ((View) r7.getValue()).setVisibility(8);
                ((w3b) r7.getValue()).setText((CharSequence) null);
                fbbVar.z0 = dbb.a;
                cbb cbbVar = fbbVar.t0;
                if (cbbVar != null) {
                    cbbVar.a0();
                    return;
                }
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((fn5) this.b).t0 = (Layout) this.c;
                break;
            case 2:
            case 3:
                break;
            default:
                fbb fbbVar = (fbb) this.b;
                ?? r0 = fbbVar.B0;
                ((w3b) r0.getValue()).setHint((CharSequence) null);
                InputMethodManager inputMethodManager = (InputMethodManager) s34.b((Context) this.c, InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(((w3b) r0.getValue()).getWindowToken(), 0);
                }
                fbbVar.z0 = dbb.b;
                break;
        }
    }
}
