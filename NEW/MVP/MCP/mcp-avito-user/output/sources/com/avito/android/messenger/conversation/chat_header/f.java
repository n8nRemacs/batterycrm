package com.avito.android.messenger.conversation.chat_header;

import Y61.l;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.C23503n;
import androidx.transition.L;
import androidx.transition.Q;
import androidx.transition.T;
import com.avito.android.R;
import com.avito.android.component.user_hat.items.C29574b;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.util.q;
import com.avito.android.messenger.conversation.chat_header.a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.header.HeaderTitleButton;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.Q5;
import com.avito.android.util.R5;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.H0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ChatHeaderRedesign.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/chat_header/f;", "Lcom/avito/android/messenger/conversation/chat_header/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements com.avito.android.messenger.conversation.chat_header.a {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f189444A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f189445B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final H0 f189446C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final H0 f189447D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final z<G0> f189448E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final z<G0> f189449F;

    /* renamed from: G, reason: collision with root package name */
    @l
    public final Drawable f189450G;

    /* renamed from: H, reason: collision with root package name */
    @l
    public final Drawable f189451H;

    /* renamed from: I, reason: collision with root package name */
    @l
    public final Drawable f189452I;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f189453b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f189454c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f189455d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f189456e;

    /* renamed from: f, reason: collision with root package name */
    public final View f189457f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f189458g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f189459h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f189460i;

    /* renamed from: j, reason: collision with root package name */
    public final SimpleDraweeView f189461j;

    /* renamed from: k, reason: collision with root package name */
    public final SimpleDraweeView f189462k;

    /* renamed from: l, reason: collision with root package name */
    public final SimpleDraweeView f189463l;

    /* renamed from: m, reason: collision with root package name */
    public final View f189464m;

    /* renamed from: n, reason: collision with root package name */
    public final View f189465n;

    /* renamed from: o, reason: collision with root package name */
    public final View f189466o;

    /* renamed from: p, reason: collision with root package name */
    public final View f189467p;

    /* renamed from: q, reason: collision with root package name */
    public final ImageView f189468q;

    /* renamed from: r, reason: collision with root package name */
    public final View f189469r;

    /* renamed from: s, reason: collision with root package name */
    public final View f189470s;

    /* renamed from: t, reason: collision with root package name */
    public final View f189471t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public a.d f189472u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.tooltip.k f189473v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public AnimatorSet f189474w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f189475x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f189476y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f189477z;

    /* compiled from: ChatHeaderRedesign.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/Q5;", "Landroidx/transition/n;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/Q5;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Q5<C23503n>, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Q5<C23503n> q52) {
            Q5<C23503n> q53 = q52;
            f fVar = f.this;
            q53.b(fVar.f189455d);
            q53.b(fVar.f189470s);
            return G0.f406611a;
        }
    }

    /* compiled from: ChatHeaderRedesign.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/conversation/chat_header/f$c", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(@Y61.k MotionEvent motionEvent) {
            f.this.f189444A.accept(G0.f406611a);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(@Y61.k MotionEvent motionEvent) {
            f.this.f189445B.accept(G0.f406611a);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(@Y61.k MotionEvent motionEvent) {
            f.this.f189444A.accept(G0.f406611a);
            return true;
        }
    }

    public f(@Y61.k ViewGroup viewGroup) {
        this.f189453b = viewGroup;
        Context context = viewGroup.getContext();
        this.f189454c = context;
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.title_container);
        this.f189455d = constraintLayout;
        this.f189456e = (TextView) viewGroup.findViewById(R.id.title_name);
        this.f189457f = viewGroup.findViewById(R.id.title_item_view);
        this.f189458g = (TextView) viewGroup.findViewById(R.id.title_item);
        this.f189459h = (TextView) viewGroup.findViewById(R.id.title_price);
        this.f189460i = (TextView) viewGroup.findViewById(R.id.online_status);
        this.f189461j = (SimpleDraweeView) viewGroup.findViewById(R.id.item_image);
        this.f189462k = (SimpleDraweeView) viewGroup.findViewById(R.id.item_avatar);
        this.f189463l = (SimpleDraweeView) viewGroup.findViewById(R.id.item_big_avatar);
        this.f189464m = viewGroup.findViewById(R.id.tooltip_anchor);
        this.f189465n = viewGroup.findViewById(R.id.item_avatar_border);
        View viewFindViewById = viewGroup.findViewById(R.id.back_button);
        this.f189466o = viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.iac_call_button);
        this.f189467p = viewFindViewById2;
        this.f189468q = (ImageView) viewGroup.findViewById(R.id.header_title_button);
        this.f189469r = viewGroup.findViewById(R.id.online_status_indicator);
        this.f189470s = viewGroup.findViewById(R.id.connection_indicator);
        this.f189471t = viewGroup.findViewById(R.id.subtitle_view);
        new com.jakewharton.rxrelay3.c();
        new com.jakewharton.rxrelay3.c();
        this.f189475x = new com.jakewharton.rxrelay3.c<>();
        this.f189476y = new com.jakewharton.rxrelay3.c<>();
        this.f189477z = new com.jakewharton.rxrelay3.c();
        this.f189444A = new com.jakewharton.rxrelay3.c<>();
        this.f189445B = new com.jakewharton.rxrelay3.c<>();
        H0 h02 = H0.f403644b;
        this.f189446C = h02;
        this.f189447D = h02;
        this.f189448E = C37722i.a(viewFindViewById);
        this.f189449F = C37722i.a(viewFindViewById2);
        this.f189450G = context.getDrawable(R.drawable.ic_messenger_avatar_placeholder_48);
        this.f189451H = context.getDrawable(R.drawable.ic_messenger_avatar_placeholder_24);
        this.f189452I = context.getDrawable(R.drawable.ic_messenger_item_placeholder_48);
        constraintLayout.setOnTouchListener(new com.avito.android.messenger.conversation.chat_header.b(new GestureDetector(context, new c()), 1));
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    /* renamed from: Y9, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF189444A() {
        return this.f189444A;
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    @Y61.k
    /* renamed from: Z9, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF189477z() {
        return this.f189477z;
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    @Y61.k
    public final z<G0> aa() {
        return this.f189446C;
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    /* renamed from: ba, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF189476y() {
        return this.f189476y;
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    @Y61.k
    public final z<G0> ca() {
        return C37722i.a(this.f189468q);
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    /* renamed from: da, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF189475x() {
        return this.f189475x;
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    public final void ea() {
        com.avito.android.lib.design.tooltip.k kVar = this.f189473v;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f189473v = null;
        AnimatorSet animatorSet = this.f189474w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    public final void fa(@Y61.k a.d dVar) {
        ConstraintLayout constraintLayout;
        Uri uriB;
        Integer numA;
        if (dVar.equals(this.f189472u)) {
            return;
        }
        R5 r52 = new R5(new T());
        r52.f318733e.Q(0);
        a.d dVar2 = this.f189472u;
        boolean z12 = dVar.f189390h;
        if (dVar2 == null || dVar2.f189390h != z12) {
            r52.e(new C23503n(), new a());
        }
        L lC2 = r52.c();
        ViewGroup viewGroup = this.f189453b;
        Q.a(viewGroup, lC2);
        View view = this.f189470s;
        TextView textView = this.f189460i;
        TextView textView2 = this.f189456e;
        ConstraintLayout constraintLayout2 = this.f189455d;
        if (z12) {
            D6.g(constraintLayout2);
            D6.H(view);
        } else {
            D6.w(view);
            D6.H(constraintLayout2);
            String str = dVar.f189383a;
            if (str.length() == 0) {
                D6.g(textView2);
            } else {
                D6.H(textView2);
                textView2.setText(str);
                if (dVar.f189386d) {
                    com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(this.f189454c, 0, 0, 6, null);
                    int i12 = kVar.f181229o;
                    kVar.f181228n = -2;
                    kVar.f181229o = i12;
                    r.a aVar = new r.a(new i.a(new b.a()));
                    aVar.j(0);
                    kVar.f181224j = aVar;
                    p.a(kVar, new g(this));
                    this.f189473v = kVar.f(this.f189464m);
                    this.f189475x.accept(G0.f406611a);
                }
            }
            textView.setText(dVar.f189384b);
        }
        View view2 = this.f189469r;
        boolean z13 = dVar.f189391i;
        if (z13) {
            D6.H(view2);
        } else {
            D6.g(view2);
        }
        boolean z14 = dVar.f189392j;
        View view3 = this.f189467p;
        if (z14 || dVar.f189393k) {
            constraintLayout = constraintLayout2;
            D6.f(constraintLayout, 0, 0, 0, 0, 11);
            D6.H(view3);
        } else {
            constraintLayout = constraintLayout2;
            D6.f(constraintLayout2, 0, 0, viewGroup.getResources().getDimensionPixelSize(R.dimen.messenger_channel_right_padding), 0, 11);
            D6.w(view3);
        }
        ImageView imageView = this.f189468q;
        HeaderTitleButton headerTitleButton = dVar.f189397o;
        if (headerTitleButton != null) {
            String iconMobile = headerTitleButton.getIconMobile();
            imageView.setImageDrawable(C35835l0.h((iconMobile == null || (numA = q.a(iconMobile)) == null) ? R.attr.ic_help24 : numA.intValue(), this.f189454c));
            D6.H(imageView);
        } else {
            D6.w(imageView);
        }
        a.b.C5583a c5583a = a.b.C5583a.f189378a;
        a.b bVar = dVar.f189385c;
        boolean zF2 = kotlin.jvm.internal.L.f(bVar, c5583a);
        View view4 = this.f189457f;
        Image image = dVar.f189389g;
        if (zF2) {
            D6.w(view4);
            View view5 = this.f189471t;
            String str2 = dVar.f189396n;
            if (str2 == null || C43066x.K(str2)) {
                D6.w(view5);
                D6.w(textView);
            } else {
                D6.H(view5);
                D6.H(textView);
            }
            SimpleDraweeView simpleDraweeView = this.f189463l;
            D6.H(simpleDraweeView);
            C35949t5.c(simpleDraweeView, (image == null || (uriB = C35829k2.c(image, simpleDraweeView, 1, 22).b()) == null) ? null : new com.avito.android.image_loader.p(uriB), this.f189450G, null, null, 12);
            if (!dVar.f189394l) {
                C29574b.a(simpleDraweeView);
            }
            if (textView2.getText().length() > 0 && (str2 == null || C43066x.K(str2))) {
                androidx.constraintlayout.widget.d dVar3 = new androidx.constraintlayout.widget.d();
                dVar3.g(constraintLayout);
                dVar3.j(textView2.getId(), 3, 0, 3, 0);
                dVar3.j(textView2.getId(), 4, 0, 4, 0);
                dVar3.c(constraintLayout);
                D6.f(constraintLayout, 0, 0, 0, 0, 13);
            }
        } else if (bVar instanceof a.b.C5584b) {
            D6.H(this.f189465n);
            SimpleDraweeView simpleDraweeView2 = this.f189461j;
            D6.H(simpleDraweeView2);
            SimpleDraweeView simpleDraweeView3 = this.f189462k;
            D6.H(simpleDraweeView3);
            StringBuilder sb2 = new StringBuilder(" · ");
            a.b.C5584b c5584b = (a.b.C5584b) bVar;
            sb2.append(c5584b.f189380b);
            String string = sb2.toString();
            this.f189458g.setText(c5584b.f189379a);
            this.f189459h.setText(string);
            if (z13) {
                if (!c5584b.a()) {
                    D6.H(view4);
                }
                D6.w(textView);
            } else if (this.f189474w == null && !c5584b.a()) {
                D6.w(view4);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f, 0.0f);
                objectAnimatorOfFloat.setDuration(250L);
                objectAnimatorOfFloat.setStartDelay(1000L);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view4, (Property<View, Float>) property, 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                animatorSet.addListener(new b());
                animatorSet.start();
                this.f189474w = animatorSet;
            } else if (c5584b.a()) {
                D6.w(view4);
                D6.H(textView);
            }
            C35949t5.c(simpleDraweeView2, c5584b.f189381c, this.f189452I, null, null, 12);
            C35949t5.c(simpleDraweeView3, image != null ? com.avito.android.image_loader.b.b(image) : null, this.f189451H, null, null, 12);
        }
        this.f189472u = dVar;
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    @Y61.k
    public final z<G0> ha() {
        return this.f189448E;
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    @Y61.k
    public final z<G0> ia() {
        return this.f189447D;
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    @Y61.k
    public final z<G0> ja() {
        return this.f189449F;
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    public final void show() {
        D6.H(this.f189453b);
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    public final void j2() {
    }

    /* compiled from: ChatHeaderRedesign.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/conversation/chat_header/f$b", "Landroid/animation/Animator$AnimatorListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@Y61.k Animator animator) {
            f fVar = f.this;
            D6.H(fVar.f189457f);
            D6.w(fVar.f189460i);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@Y61.k Animator animator) {
            f fVar = f.this;
            D6.w(fVar.f189457f);
            D6.H(fVar.f189460i);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@Y61.k Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@Y61.k Animator animator) {
        }
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    public final void ga(boolean z12) {
    }
}
