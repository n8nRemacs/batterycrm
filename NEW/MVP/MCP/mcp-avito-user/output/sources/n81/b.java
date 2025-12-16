package N81;

import Y61.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.avito.android.util.D6;
import hw.InterfaceC41177b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FloatingToolbar.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LN81/b;", "LN81/a;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b implements N81.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f11223a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f11224b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f11225c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11226d;

    /* renamed from: e, reason: collision with root package name */
    public int f11227e;

    /* renamed from: f, reason: collision with root package name */
    public int f11228f;

    /* compiled from: FloatingToolbar.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"N81/b$a", "Landroid/animation/AnimatorListenerAdapter;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@k Animator animator) {
            b.this.c(false);
        }
    }

    /* compiled from: FloatingToolbar.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"N81/b$b", "Landroid/animation/AnimatorListenerAdapter;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: N81.b$b, reason: collision with other inner class name */
    public static final class C0720b extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f11231b;

        public C0720b(int i12) {
            this.f11231b = i12;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@k Animator animator) {
            int i12 = this.f11231b;
            b bVar = b.this;
            bVar.c((i12 == 0 && bVar.f11226d) ? false : true);
        }
    }

    public b(@k View view, @k View view2, @k View view3, boolean z12) {
        this.f11223a = view;
        this.f11224b = view2;
        this.f11225c = view3;
        this.f11226d = z12;
    }

    public final void a() {
        int i12 = this.f11228f;
        View view = this.f11224b;
        if (i12 > 0) {
            if (this.f11227e > view.getHeight()) {
                d();
                return;
            } else {
                e(this.f11227e);
                return;
            }
        }
        if (i12 < 0) {
            if (this.f11223a.getTranslationY() >= view.getHeight() * (-0.6d) || this.f11227e <= view.getHeight()) {
                e(this.f11227e);
            } else {
                d();
            }
        }
    }

    public final void b(int i12, int i13) {
        this.f11227e = i13;
        this.f11228f = i12;
        View view = this.f11223a;
        int translationY = (int) (i12 - view.getTranslationY());
        view.animate().cancel();
        int i14 = this.f11228f;
        View view2 = this.f11224b;
        float f12 = 0.0f;
        if (i14 > 0) {
            if (translationY < view2.getHeight()) {
                if (this.f11227e > view2.getHeight()) {
                    c(true);
                }
                if (this.f11227e != 0) {
                    f12 = -translationY;
                }
            } else {
                c(false);
                if (this.f11227e != 0) {
                    translationY = view2.getHeight();
                    f12 = -translationY;
                }
            }
        } else if (i14 < 0) {
            if (translationY >= 0) {
                if (this.f11227e > view2.getHeight()) {
                    c(true);
                }
                f12 = -translationY;
            } else if (this.f11227e <= 0 && this.f11226d) {
                c(false);
            }
        }
        if (this.f11228f != 0) {
            view.setTranslationY(f12);
        }
    }

    public final void c(boolean z12) {
        View view = this.f11225c;
        if (z12) {
            D6.H(view);
        } else {
            D6.g(view);
        }
    }

    public final void d() {
        this.f11223a.animate().translationY(-this.f11224b.getHeight()).setInterpolator(new LinearInterpolator()).setDuration(180L).setListener(new a());
    }

    public final void e(int i12) {
        this.f11223a.animate().translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(180L).setListener(new C0720b(i12));
    }

    public /* synthetic */ b(View view, View view2, View view3, boolean z12, int i12, C42822w c42822w) {
        this(view, view2, view3, (i12 & 8) != 0 ? true : z12);
    }
}
