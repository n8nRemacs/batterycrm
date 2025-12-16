package com.avito.android.shortcut_navigation_bar.adapter.category_node;

import Y61.k;
import Y61.l;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CategoryNodeView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/category_node/d;", "Lcom/avito/android/shortcut_navigation_bar/adapter/category_node/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f283265e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f283266b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f283267c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public ValueAnimator f283268d;

    public d(@k View view) {
        super(view);
        this.f283266b = view;
        TextView textView = (TextView) view.findViewById(R.id.title);
        this.f283267c = textView;
        ImageView imageView = (ImageView) view.findViewById(R.id.image_left);
        view.setSelected(true);
        imageView.setImageResource(R.drawable.ic_rubricator);
        textView.setMaxWidth((int) ((C35835l0.g(view.getContext()).x - (32 * view.getContext().getResources().getDisplayMetrics().density)) / 2));
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.category_node.c
    public final void a(@k Y41.a<G0> aVar) {
        this.f283266b.setOnClickListener(new A(13, aVar));
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.category_node.c
    public final void j2() {
        TextView textView = this.f283267c;
        if (textView.getLayoutParams().width == 0) {
            textView.setAlpha(1.0f);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = -2;
            textView.setLayoutParams(layoutParams);
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        ValueAnimator valueAnimator = this.f283268d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f283268d = null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.category_node.c
    public final void jG() {
        ValueAnimator valueAnimator = this.f283268d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofInt(this.f283267c.getMeasuredWidth(), 0).setDuration(600L);
        this.f283268d = duration;
        if (duration != null) {
            duration.addUpdateListener(new AV.a(this, 17));
        }
        ValueAnimator valueAnimator2 = this.f283268d;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new a());
        }
        ValueAnimator valueAnimator3 = this.f283268d;
        if (valueAnimator3 != null) {
            valueAnimator3.setInterpolator(new AccelerateInterpolator());
        }
        ValueAnimator valueAnimator4 = this.f283268d;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.category_node.c
    public final void setText(@k String str) {
        I5.a(this.f283267c, str, false);
    }

    /* compiled from: CategoryNodeView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/shortcut_navigation_bar/adapter/category_node/d$a", "Landroid/animation/Animator$AnimatorListener;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@k Animator animator) {
            I5.a(d.this.f283267c, "", false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@k Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@k Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@k Animator animator) {
        }
    }
}
