package com.avito.android.mortgage.root;

import KZ.A;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.compose.design.shared.stepsbar.StepsBarView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import com.avito.android.mortgage.widgets.StackedImageView;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.google.android.material.appbar.AppBarLayout;
import g10.C40511a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: MortgageRootView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/b;", "", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f202186a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f202187b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public ViewGroup f202188c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public MotionLayout f202189d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public AppBarLayout f202190e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public ImageButton f202191f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public ImageButton f202192g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public ImageButton f202193h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public StackedImageView f202194i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public StackedImageView f202195j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public TextView f202196k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public TextView f202197l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public StepsBarView f202198m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public CardView f202199n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public ImageView f202200o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public ViewGroup f202201p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public Button f202202q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public Button f202203r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public TextView f202204s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public RecyclerView f202205t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final a f202206u = new a();

    /* renamed from: v, reason: collision with root package name */
    @l
    public com.avito.android.progress_overlay.l f202207v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f202208w;

    /* renamed from: x, reason: collision with root package name */
    @l
    public C40511a f202209x;

    /* compiled from: MortgageRootView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/b$a;", "Lcom/google/android/material/appbar/AppBarLayout$g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a implements AppBarLayout.g {
        public a() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public final void c(@k AppBarLayout appBarLayout, int i12) {
            float totalScrollRange = (-i12) / appBarLayout.getTotalScrollRange();
            b bVar = b.this;
            MotionLayout motionLayout = bVar.f202189d;
            if (motionLayout != null) {
                motionLayout.setProgress(totalScrollRange);
            }
            StepsBarView stepsBarView = bVar.f202198m;
            if (stepsBarView != null) {
                stepsBarView.setInfoAlpha(s.a(1 - (3 * totalScrollRange), 0.0f));
            }
        }
    }

    /* compiled from: MortgageRootView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.root.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C6005b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202211a = new int[ApplicationProcessType.values().length];
    }

    @Inject
    public b(@k com.avito.konveyor.adapter.d dVar, @k com.avito.konveyor.a aVar) {
        this.f202186a = dVar;
        this.f202187b = aVar;
    }

    public final Context a() {
        ViewGroup viewGroup = this.f202188c;
        Context context = viewGroup != null ? viewGroup.getContext() : null;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void b(C40511a c40511a) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewGroup viewGroup;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        if (c40511a == null) {
            ViewGroup viewGroup2 = this.f202201p;
            if (viewGroup2 != null) {
                float fR2 = D6.r(viewGroup2);
                if (fR2 <= 0.0f || (viewGroup = this.f202201p) == null || (viewPropertyAnimatorAnimate2 = viewGroup.animate()) == null) {
                    return;
                }
                viewPropertyAnimatorAnimate2.translationY(fR2);
                return;
            }
            return;
        }
        Button button = this.f202202q;
        A a12 = c40511a.f396231a;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, a12 != null ? a12.getTitle() : null, false);
        }
        Button button2 = this.f202203r;
        A a13 = c40511a.f396232b;
        if (button2 != null) {
            com.avito.android.lib.design.button.b.a(button2, a13 != null ? a13.getTitle() : null, false);
        }
        TextView textView = this.f202204s;
        if (textView != null) {
            j.a(textView, c40511a.f396234d, null);
        }
        ApplicationProcessType applicationProcessType = c40511a.f396233c;
        if ((applicationProcessType == null ? -1 : C6005b.f202211a[applicationProcessType.ordinal()]) == -1) {
            Button button3 = this.f202202q;
            if (button3 != null) {
                button3.setLoading(false);
            }
            Button button4 = this.f202203r;
            if (button4 != null) {
                button4.setLoading(false);
            }
            Button button5 = this.f202202q;
            if (button5 != null) {
                button5.setEnabled(true);
            }
            Button button6 = this.f202203r;
            if (button6 != null) {
                button6.setEnabled(true);
            }
        } else {
            if (applicationProcessType == (a12 != null ? a12.getType() : null)) {
                Button button7 = this.f202202q;
                if (button7 != null) {
                    button7.setLoading(true);
                }
                Button button8 = this.f202202q;
                if (button8 != null) {
                    button8.setEnabled(false);
                }
                Button button9 = this.f202203r;
                if (button9 != null) {
                    button9.setEnabled(false);
                }
            } else {
                if (applicationProcessType == (a13 != null ? a13.getType() : null)) {
                    Button button10 = this.f202203r;
                    if (button10 != null) {
                        button10.setLoading(true);
                    }
                    Button button11 = this.f202202q;
                    if (button11 != null) {
                        button11.setEnabled(false);
                    }
                    Button button12 = this.f202203r;
                    if (button12 != null) {
                        button12.setEnabled(false);
                    }
                } else {
                    Button button13 = this.f202202q;
                    if (button13 != null) {
                        button13.setLoading(false);
                    }
                    Button button14 = this.f202203r;
                    if (button14 != null) {
                        button14.setLoading(false);
                    }
                    Button button15 = this.f202202q;
                    if (button15 != null) {
                        button15.setEnabled(true);
                    }
                    Button button16 = this.f202203r;
                    if (button16 != null) {
                        button16.setEnabled(true);
                    }
                }
            }
        }
        ViewGroup viewGroup3 = this.f202201p;
        if (viewGroup3 == null || (viewPropertyAnimatorAnimate = viewGroup3.animate()) == null) {
            return;
        }
        viewPropertyAnimatorAnimate.translationY(0.0f);
    }
}
