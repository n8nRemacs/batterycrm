package com.google.android.exoplayer2.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.avito.android.R;
import com.google.android.exoplayer2.ui.s;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: StyledPlayerControlViewLayoutManager.java */
/* loaded from: classes6.dex */
final class z {

    /* renamed from: A, reason: collision with root package name */
    public boolean f347664A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f347665B;

    /* renamed from: a, reason: collision with root package name */
    public final s f347667a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final View f347668b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final ViewGroup f347669c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final ViewGroup f347670d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final ViewGroup f347671e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final ViewGroup f347672f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final ViewGroup f347673g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public final ViewGroup f347674h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public final ViewGroup f347675i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public final View f347676j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public final View f347677k;

    /* renamed from: l, reason: collision with root package name */
    public final AnimatorSet f347678l;

    /* renamed from: m, reason: collision with root package name */
    public final AnimatorSet f347679m;

    /* renamed from: n, reason: collision with root package name */
    public final AnimatorSet f347680n;

    /* renamed from: o, reason: collision with root package name */
    public final AnimatorSet f347681o;

    /* renamed from: p, reason: collision with root package name */
    public final AnimatorSet f347682p;

    /* renamed from: q, reason: collision with root package name */
    public final ValueAnimator f347683q;

    /* renamed from: r, reason: collision with root package name */
    public final ValueAnimator f347684r;

    /* renamed from: s, reason: collision with root package name */
    public final w f347685s = new w(this, 0);

    /* renamed from: t, reason: collision with root package name */
    public final w f347686t = new w(this, 3);

    /* renamed from: u, reason: collision with root package name */
    public final w f347687u = new w(this, 4);

    /* renamed from: v, reason: collision with root package name */
    public final w f347688v = new w(this, 5);

    /* renamed from: w, reason: collision with root package name */
    public final w f347689w = new w(this, 6);

    /* renamed from: x, reason: collision with root package name */
    public final y f347690x = new y(this, 0);

    /* renamed from: C, reason: collision with root package name */
    public boolean f347666C = true;

    /* renamed from: z, reason: collision with root package name */
    public int f347692z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f347691y = new ArrayList();

    /* compiled from: StyledPlayerControlViewLayoutManager.java */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            z zVar = z.this;
            View view = zVar.f347668b;
            if (view != null) {
                view.setVisibility(4);
            }
            ViewGroup viewGroup = zVar.f347669c;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            ViewGroup viewGroup2 = zVar.f347671e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            z zVar = z.this;
            View view = zVar.f347676j;
            if (!(view instanceof com.google.android.exoplayer2.ui.i) || zVar.f347664A) {
                return;
            }
            com.google.android.exoplayer2.ui.i iVar = (com.google.android.exoplayer2.ui.i) view;
            ValueAnimator valueAnimator = iVar.f347470F;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            valueAnimator.setFloatValues(iVar.f347471G, 0.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    /* compiled from: StyledPlayerControlViewLayoutManager.java */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            z zVar = z.this;
            View view = zVar.f347668b;
            if (view != null) {
                view.setVisibility(0);
            }
            ViewGroup viewGroup = zVar.f347669c;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = zVar.f347671e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(zVar.f347664A ? 0 : 4);
            }
            View view2 = zVar.f347676j;
            if (!(view2 instanceof com.google.android.exoplayer2.ui.i) || zVar.f347664A) {
                return;
            }
            com.google.android.exoplayer2.ui.i iVar = (com.google.android.exoplayer2.ui.i) view2;
            ValueAnimator valueAnimator = iVar.f347470F;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            iVar.f347472H = false;
            valueAnimator.setFloatValues(iVar.f347471G, 1.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    /* compiled from: StyledPlayerControlViewLayoutManager.java */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f347695a;

        public c(s sVar) {
            this.f347695a = sVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            z zVar = z.this;
            zVar.i(1);
            if (zVar.f347665B) {
                this.f347695a.post(zVar.f347685s);
                zVar.f347665B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            z.this.i(3);
        }
    }

    /* compiled from: StyledPlayerControlViewLayoutManager.java */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f347697a;

        public d(s sVar) {
            this.f347697a = sVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            z zVar = z.this;
            zVar.i(2);
            if (zVar.f347665B) {
                this.f347697a.post(zVar.f347685s);
                zVar.f347665B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            z.this.i(3);
        }
    }

    /* compiled from: StyledPlayerControlViewLayoutManager.java */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f347699a;

        public e(s sVar) {
            this.f347699a = sVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            z zVar = z.this;
            zVar.i(2);
            if (zVar.f347665B) {
                this.f347699a.post(zVar.f347685s);
                zVar.f347665B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            z.this.i(3);
        }
    }

    /* compiled from: StyledPlayerControlViewLayoutManager.java */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            z.this.i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            z.this.i(4);
        }
    }

    /* compiled from: StyledPlayerControlViewLayoutManager.java */
    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            z.this.i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            z.this.i(4);
        }
    }

    /* compiled from: StyledPlayerControlViewLayoutManager.java */
    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = z.this.f347672f;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            z zVar = z.this;
            ViewGroup viewGroup = zVar.f347674h;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                zVar.f347674h.setTranslationX(r0.getWidth());
                ViewGroup viewGroup2 = zVar.f347674h;
                viewGroup2.scrollTo(viewGroup2.getWidth(), 0);
            }
        }
    }

    /* compiled from: StyledPlayerControlViewLayoutManager.java */
    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = z.this.f347674h;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = z.this.f347672f;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    public z(s sVar) throws Resources.NotFoundException {
        this.f347667a = sVar;
        int i12 = 3;
        this.f347668b = sVar.findViewById(R.id.exo_controls_background);
        this.f347669c = (ViewGroup) sVar.findViewById(R.id.exo_center_controls);
        this.f347671e = (ViewGroup) sVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) sVar.findViewById(R.id.exo_bottom_bar);
        this.f347670d = viewGroup;
        this.f347675i = (ViewGroup) sVar.findViewById(R.id.exo_time);
        View viewFindViewById = sVar.findViewById(R.id.exo_progress);
        this.f347676j = viewFindViewById;
        this.f347672f = (ViewGroup) sVar.findViewById(R.id.exo_basic_controls);
        this.f347673g = (ViewGroup) sVar.findViewById(R.id.exo_extra_controls);
        this.f347674h = (ViewGroup) sVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = sVar.findViewById(R.id.exo_overflow_show);
        this.f347677k = viewFindViewById2;
        View viewFindViewById3 = sVar.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new t(this, i12));
            viewFindViewById3.setOnClickListener(new t(this, i12));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new x(this, 3));
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new x(this, 0));
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = sVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f347678l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(sVar));
        animatorSet.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension)).with(d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f347679m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(sVar));
        animatorSet2.play(d(viewFindViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f347680n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(sVar));
        animatorSet3.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension2)).with(d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f347681o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension, 0.0f)).with(d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f347682p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension2, 0.0f)).with(d(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f347683q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new x(this, 1));
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f347684r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new x(this, 2));
        valueAnimatorOfFloat4.addListener(new i());
    }

    public static int c(@P View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static ObjectAnimator d(View view, float f12, float f13) {
        return ObjectAnimator.ofFloat(view, "translationY", f12, f13);
    }

    public static boolean j(View view) {
        int id2 = view.getId();
        return id2 == R.id.exo_bottom_bar || id2 == R.id.exo_prev || id2 == R.id.exo_next || id2 == R.id.exo_rew || id2 == R.id.exo_rew_with_amount || id2 == R.id.exo_ffwd || id2 == R.id.exo_ffwd_with_amount;
    }

    public final void a(float f12) {
        ViewGroup viewGroup = this.f347674h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f12) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f347675i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f12);
        }
        ViewGroup viewGroup3 = this.f347672f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f12);
        }
    }

    public final boolean b(@P View view) {
        return view != null && this.f347691y.contains(view);
    }

    public final void e(long j12, Runnable runnable) {
        if (j12 >= 0) {
            this.f347667a.postDelayed(runnable, j12);
        }
    }

    public final void f() {
        w wVar = this.f347689w;
        s sVar = this.f347667a;
        sVar.removeCallbacks(wVar);
        sVar.removeCallbacks(this.f347686t);
        sVar.removeCallbacks(this.f347688v);
        sVar.removeCallbacks(this.f347687u);
    }

    public final void g() {
        if (this.f347692z == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.f347667a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f347666C) {
                e(showTimeoutMs, this.f347689w);
            } else if (this.f347692z == 1) {
                e(2000L, this.f347687u);
            } else {
                e(showTimeoutMs, this.f347688v);
            }
        }
    }

    public final void h(@P View view, boolean z12) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f347691y;
        if (!z12) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f347664A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i12) {
        int i13 = this.f347692z;
        this.f347692z = i12;
        s sVar = this.f347667a;
        if (i12 == 2) {
            sVar.setVisibility(8);
        } else if (i13 == 2) {
            sVar.setVisibility(0);
        }
        if (i13 != i12) {
            Iterator<s.m> it = sVar.f347580c.iterator();
            while (it.hasNext()) {
                it.next().b(sVar.getVisibility());
            }
        }
    }

    public final void k() {
        if (!this.f347666C) {
            i(0);
            g();
            return;
        }
        int i12 = this.f347692z;
        if (i12 == 1) {
            this.f347681o.start();
        } else if (i12 == 2) {
            this.f347682p.start();
        } else if (i12 == 3) {
            this.f347665B = true;
        } else if (i12 == 4) {
            return;
        }
        g();
    }
}
