package Ug0;

import Y61.k;
import Y61.l;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.transition.L;
import androidx.transition.V;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetSharedTransition.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LUg0/a;", "Landroidx/transition/L;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ug0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15517a extends L {

    /* renamed from: B, reason: collision with root package name */
    @k
    public static final String[] f16549B;

    /* compiled from: BottomSheetSharedTransition.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LUg0/a$a;", "", "<init>", "()V", "", "PROP_HEIGHT", "Ljava/lang/String;", "", "TransitionProperties", "[Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ug0.a$a, reason: collision with other inner class name */
    public static final class C1135a {
        public /* synthetic */ C1135a(C42822w c42822w) {
            this();
        }

        public C1135a() {
        }
    }

    static {
        new C1135a(null);
        f16549B = new String[]{"heightTransition:height"};
    }

    public static Point M(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService("window")).getCurrentWindowMetrics();
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            return new Point((currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right, (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom);
        }
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }

    @Override // androidx.transition.L
    public final void f(@k V v12) {
        C22771k c22771kE;
        HashMap map = v12.f54716a;
        View view = (View) v12.f54717b.getParent();
        int i12 = 0;
        view.measure(View.MeasureSpec.makeMeasureSpec(M(view.getContext()).x, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        int i13 = M(view.getContext()).y;
        J0 j0O = C22823h0.o(view);
        if (j0O != null && (c22771kE = j0O.e(1)) != null) {
            i12 = c22771kE.f44776b;
        }
        int i14 = i13 - i12;
        if (measuredHeight > i14) {
            measuredHeight = i14;
        }
        map.put("heightTransition:height", Integer.valueOf(measuredHeight));
    }

    @Override // androidx.transition.L
    public final void j(@k V v12) {
        v12.f54716a.put("heightTransition:height", Integer.valueOf(v12.f54717b.getHeight()));
        Object parent = v12.f54717b.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = view.getHeight();
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.transition.L
    @l
    public final Animator n(@k ViewGroup viewGroup, @l V v12, @l V v13) {
        if (v12 == null || v13 == null) {
            return null;
        }
        int iIntValue = ((Integer) v12.f54716a.get("heightTransition:height")).intValue();
        int iIntValue2 = ((Integer) v13.f54716a.get("heightTransition:height")).intValue();
        View view = v13.f54717b;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iIntValue, iIntValue2);
        View view2 = (View) view.getParent();
        valueAnimatorOfInt.addUpdateListener(new QU.a(view2, 2));
        valueAnimatorOfInt.addListener(new b(view2));
        List listSingletonList = Collections.singletonList(valueAnimatorOfInt);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new androidx.interpolator.view.animation.b());
        animatorSet.setDuration(200L);
        animatorSet.playTogether(listSingletonList);
        return animatorSet;
    }

    @Override // androidx.transition.L
    @k
    public final String[] v() {
        return f16549B;
    }
}
