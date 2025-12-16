package com.avito.android.lib.deprecated_design;

import Y61.k;
import Y61.l;
import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.imv_similiar_adverts.h;
import com.avito.android.util.C35872q;
import com.avito.android.util.I5;
import hw.InterfaceC41179d;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NetworkProblemView.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/lib/deprecated_design/NetworkProblemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/lib/deprecated_design/NetworkProblemView$b;", "onRetryListener", "Lkotlin/G0;", "setListener", "(Lcom/avito/android/lib/deprecated_design/NetworkProblemView$b;)V", "a", "b", "c", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class NetworkProblemView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public TextView f177760b;

    /* renamed from: c, reason: collision with root package name */
    public View f177761c;

    /* renamed from: d, reason: collision with root package name */
    public View f177762d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public TextView f177763e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public b f177764f;

    /* compiled from: NetworkProblemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/NetworkProblemView$a;", "Lcom/avito/android/util/q$b;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C35872q.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final View f177765a;

        public a(@k View view) {
            this.f177765a = view;
        }

        @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@k Animator animator) {
            this.f177765a.setVisibility(8);
        }
    }

    /* compiled from: NetworkProblemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/NetworkProblemView$b;", "", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void W1();
    }

    /* compiled from: NetworkProblemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/NetworkProblemView$c;", "Lcom/avito/android/util/q$b;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends C35872q.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final View f177766a;

        public c(@k View view) {
            this.f177766a = view;
        }

        @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@k Animator animator) {
            this.f177766a.setVisibility(0);
        }
    }

    public NetworkProblemView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(@k String str) {
        TextView textView = this.f177760b;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str);
        View view = this.f177761c;
        if (view == null) {
            view = null;
        }
        c cVar = new c(view);
        View view2 = this.f177761c;
        if (view2 == null) {
            view2 = null;
        }
        view2.animate().alpha(1.0f).setListener(cVar);
        View view3 = this.f177762d;
        if (view3 == null) {
            view3 = null;
        }
        a aVar = new a(view3);
        View view4 = this.f177762d;
        (view4 != null ? view4 : null).animate().alpha(0.0f).setListener(aVar);
    }

    public final void b(@l String str) {
        View view = this.f177761c;
        if (view == null) {
            view = null;
        }
        a aVar = new a(view);
        View view2 = this.f177761c;
        if (view2 == null) {
            view2 = null;
        }
        view2.animate().alpha(0.0f).setListener(aVar);
        TextView textView = this.f177763e;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        View view3 = this.f177762d;
        if (view3 == null) {
            view3 = null;
        }
        c cVar = new c(view3);
        View view4 = this.f177762d;
        (view4 != null ? view4 : null).animate().alpha(1.0f).setListener(cVar);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (isInEditMode()) {
            return;
        }
        View viewFindViewById = findViewById(R.id.error_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f177760b = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.error_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f177761c = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.progress_view);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f177762d = viewFindViewById3;
        this.f177763e = (TextView) findViewById(R.id.progress_message);
        View viewFindViewById4 = findViewById(R.id.retry_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        viewFindViewById4.setOnClickListener(new h(this, 12));
    }

    public final void setListener(@k b onRetryListener) {
        this.f177764f = onRetryListener;
    }
}
