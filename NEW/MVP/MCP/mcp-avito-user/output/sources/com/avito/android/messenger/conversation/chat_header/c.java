package com.avito.android.messenger.conversation.chat_header;

import Y61.l;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.C23494e;
import androidx.transition.C23503n;
import androidx.transition.L;
import androidx.transition.Q;
import androidx.transition.T;
import com.avito.android.R;
import com.avito.android.image_loader.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.util.q;
import com.avito.android.messenger.conversation.chat_header.a;
import com.avito.android.remote.model.messenger.header.HeaderTitleButton;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.Q5;
import com.avito.android.util.R5;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.O;
import java.util.Arrays;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ChatHeader.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/chat_header/c;", "Lcom/avito/android/messenger/conversation/chat_header/a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class c implements com.avito.android.messenger.conversation.chat_header.a {

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f189400K = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.image_loader.d f189401A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f189402B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f189403C;

    /* renamed from: D, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.tooltip.k f189404D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<View> f189405E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<View> f189406F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f189407G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f189408H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f189409I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final O f189410J;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f189411b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f189412c;

    /* renamed from: d, reason: collision with root package name */
    public final View f189413d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f189414e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f189415f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f189416g;

    /* renamed from: h, reason: collision with root package name */
    public final View f189417h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f189418i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f189419j;

    /* renamed from: k, reason: collision with root package name */
    public final Button f189420k;

    /* renamed from: l, reason: collision with root package name */
    public final ImageView f189421l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f189422m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f189423n;

    /* renamed from: o, reason: collision with root package name */
    public final SimpleDraweeView f189424o;

    /* renamed from: p, reason: collision with root package name */
    public final View f189425p;

    /* renamed from: q, reason: collision with root package name */
    public final View f189426q;

    /* renamed from: r, reason: collision with root package name */
    public final View f189427r;

    /* renamed from: s, reason: collision with root package name */
    public final View f189428s;

    /* renamed from: t, reason: collision with root package name */
    public final View f189429t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f189430u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final AccelerateDecelerateInterpolator f189431v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public final Drawable f189432w;

    /* renamed from: x, reason: collision with root package name */
    @l
    public a.d f189433x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f189434y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f189435z;

    /* compiled from: ChatHeader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/chat_header/c$a;", "", "<init>", "()V", "", "RATING_COUNT_FORMATTER", "Ljava/lang/String;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ChatHeader.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/transition/L;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/transition/L;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<L, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(L l12) {
            c cVar = c.this;
            D6.g(cVar.f189414e);
            cVar.f189405E.accept(cVar.f189411b);
            return G0.f406611a;
        }
    }

    /* compiled from: ChatHeader.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.chat_header.c$c, reason: collision with other inner class name */
    public static final class C5585c<T> implements l41.g {
        public C5585c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            c cVar = c.this;
            if (cVar.f189428s.isShown()) {
                a.d dVar = cVar.f189433x;
                if (dVar != null && dVar.f189392j) {
                    cVar.f189408H.accept(G0.f406611a);
                } else {
                    if (dVar == null || !dVar.f189393k) {
                        return;
                    }
                    cVar.f189409I.accept(G0.f406611a);
                }
            }
        }
    }

    /* compiled from: ChatHeader.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Animator> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Animator invoke() {
            return com.avito.android.messenger.util.a.a(c.this.f189429t);
        }
    }

    /* compiled from: ChatHeader.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/Q5;", "Landroidx/transition/n;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/Q5;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<Q5<C23503n>, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Q5<C23503n> q52) {
            Q5<C23503n> q53 = q52;
            c cVar = c.this;
            q53.b(cVar.f189419j);
            q53.b(cVar.f189416g);
            q53.b(cVar.f189423n);
            q53.b(cVar.f189414e);
            return G0.f406611a;
        }
    }

    /* compiled from: ChatHeader.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/Q5;", "Landroidx/transition/n;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/Q5;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Q5<C23503n>, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Q5<C23503n> q52) {
            Q5<C23503n> q53 = q52;
            c cVar = c.this;
            q53.b(cVar.f189413d);
            q53.b(cVar.f189426q);
            return G0.f406611a;
        }
    }

    /* compiled from: ChatHeader.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/conversation/chat_header/c$g", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g extends GestureDetector.SimpleOnGestureListener {
        public g() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(@Y61.k MotionEvent motionEvent) {
            c.this.f189402B.accept(G0.f406611a);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(@Y61.k MotionEvent motionEvent) {
            c.this.f189403C.accept(G0.f406611a);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(@Y61.k MotionEvent motionEvent) {
            c.this.f189402B.accept(G0.f406611a);
            return true;
        }
    }

    static {
        new a(null);
    }

    public c(@Y61.k ConstraintLayout constraintLayout) {
        this.f189411b = constraintLayout;
        Context context = constraintLayout.getContext();
        this.f189412c = context;
        View viewFindViewById = constraintLayout.findViewById(R.id.title_container);
        this.f189413d = viewFindViewById;
        this.f189414e = (ViewGroup) constraintLayout.findViewById(R.id.item_container);
        this.f189415f = (TextView) constraintLayout.findViewById(R.id.name);
        this.f189416g = (ViewGroup) constraintLayout.findViewById(R.id.chat_title_row);
        this.f189417h = constraintLayout.findViewById(R.id.title_arrow);
        this.f189418i = (TextView) constraintLayout.findViewById(R.id.chat_rating);
        this.f189419j = (TextView) constraintLayout.findViewById(R.id.item_title);
        this.f189420k = (Button) constraintLayout.findViewById(R.id.header_button);
        this.f189421l = (ImageView) constraintLayout.findViewById(R.id.header_title_button);
        this.f189422m = (TextView) constraintLayout.findViewById(R.id.item_price);
        this.f189423n = (TextView) constraintLayout.findViewById(R.id.online_status);
        this.f189424o = (SimpleDraweeView) constraintLayout.findViewById(R.id.item_image);
        this.f189425p = constraintLayout.findViewById(R.id.back_button);
        this.f189426q = constraintLayout.findViewById(R.id.connection_indicator);
        View viewFindViewById2 = constraintLayout.findViewById(R.id.iac_call_button);
        this.f189427r = viewFindViewById2;
        this.f189428s = constraintLayout.findViewById(R.id.iac_button_onboarding_static_dot);
        this.f189429t = constraintLayout.findViewById(R.id.iac_button_onboarding_dynamic_dot);
        this.f189430u = C42727D.c(new d());
        this.f189431v = new AccelerateDecelerateInterpolator();
        this.f189432w = context.getDrawable(R.drawable.ic_messenger_item_no_image);
        this.f189401A = new com.avito.android.image_loader.e().a(context);
        this.f189402B = new com.jakewharton.rxrelay3.c<>();
        this.f189403C = new com.jakewharton.rxrelay3.c<>();
        this.f189405E = new com.jakewharton.rxrelay3.c<>();
        this.f189406F = new com.jakewharton.rxrelay3.c<>();
        this.f189407G = new com.jakewharton.rxrelay3.c<>();
        this.f189408H = new com.jakewharton.rxrelay3.c<>();
        this.f189409I = new com.jakewharton.rxrelay3.c<>();
        this.f189410J = C37722i.a(viewFindViewById2).K(new C5585c());
        viewFindViewById.setOnTouchListener(new com.avito.android.messenger.conversation.chat_header.b(new GestureDetector(context, new g()), 0));
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    @Y61.k
    /* renamed from: Y9, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF189444A() {
        return this.f189402B;
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    /* renamed from: Z9, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF189477z() {
        return this.f189409I;
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    @Y61.k
    public final z<G0> aa() {
        return C37722i.a(this.f189420k);
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    /* renamed from: ba, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF189476y() {
        return this.f189408H;
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    @Y61.k
    public final z<G0> ca() {
        return C37722i.a(this.f189421l);
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    /* renamed from: da, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF189475x() {
        return this.f189407G;
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    public final void ea() {
        com.avito.android.lib.design.tooltip.k kVar = this.f189404D;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f189404D = null;
        ((Animator) this.f189430u.getValue()).cancel();
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    public final void fa(@Y61.k a.d dVar) {
        Integer numA;
        if (dVar.equals(this.f189433x)) {
            return;
        }
        R5 r52 = new R5(new T());
        r52.f318733e.Q(0);
        r52.e(new C23503n(), new e());
        a.d dVar2 = this.f189433x;
        boolean z12 = dVar.f189390h;
        if (dVar2 == null || dVar2.f189390h != z12) {
            r52.e(new C23503n(), new f());
        }
        L lC2 = r52.c();
        ConstraintLayout constraintLayout = this.f189411b;
        Q.a(constraintLayout, lC2);
        Context context = this.f189412c;
        ImageView imageView = this.f189421l;
        HeaderTitleButton headerTitleButton = dVar.f189397o;
        if (headerTitleButton != null) {
            String iconMobile = headerTitleButton.getIconMobile();
            imageView.setImageDrawable(C35835l0.h((iconMobile == null || (numA = q.a(iconMobile)) == null) ? R.attr.ic_help24 : numA.intValue(), context));
            D6.H(imageView);
        } else {
            D6.w(imageView);
        }
        View view = this.f189426q;
        View view2 = this.f189413d;
        if (z12) {
            D6.g(view2);
            D6.H(view);
        } else {
            D6.w(view);
            D6.H(view2);
            String str = dVar.f189383a;
            int length = str.length();
            ViewGroup viewGroup = this.f189416g;
            if (length == 0) {
                D6.g(viewGroup);
            } else {
                D6.H(viewGroup);
                this.f189415f.setText(str);
                if (dVar.f189386d) {
                    com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(this.f189412c, 0, 0, 6, null);
                    int i12 = kVar.f181229o;
                    kVar.f181228n = -2;
                    kVar.f181229o = i12;
                    kVar.f181224j = new r.a(new i.c(new b.a()));
                    p.a(kVar, new com.avito.android.messenger.conversation.chat_header.e(this));
                    kVar.e(this.f189417h);
                    this.f189404D = kVar;
                    this.f189407G.accept(G0.f406611a);
                }
            }
            I5.a(this.f189423n, dVar.f189384b, false);
        }
        a.b.C5583a c5583a = a.b.C5583a.f189378a;
        a.b bVar = dVar.f189385c;
        if (kotlin.jvm.internal.L.f(bVar, c5583a)) {
            ga(false);
            this.f189435z = true;
        } else if (bVar instanceof a.b.C5584b) {
            this.f189435z = false;
            a.b.C5584b c5584b = (a.b.C5584b) bVar;
            String str2 = c5584b.f189379a;
            String str3 = c5584b.f189380b;
            I5.a(this.f189419j, str2, false);
            I5.a(this.f189422m, str3, false);
            com.avito.android.lib.design.button.b.a(this.f189420k, c5584b.f189382d, false);
            if (c5584b.f189382d != null) {
                D6.w(imageView);
            }
            com.avito.android.image_loader.k kVar2 = c5584b.f189381c;
            C35949t5.c(this.f189424o, kVar2, this.f189432w, null, d.a.a(this.f189401A, context, kVar2, null, null, 28), 4);
        }
        View view3 = this.f189427r;
        boolean z13 = dVar.f189393k;
        boolean z14 = dVar.f189392j;
        if (z14 || z13) {
            D6.H(view3);
            androidx.constraintlayout.widget.d dVar3 = new androidx.constraintlayout.widget.d();
            dVar3.g(constraintLayout);
            dVar3.i(R.id.title_container, 7, R.id.iac_call_button, 6);
            dVar3.c(constraintLayout);
            InterfaceC42726C interfaceC42726C = this.f189430u;
            View view4 = this.f189429t;
            View view5 = this.f189428s;
            if ((z14 && dVar.f189387e) || (z13 && dVar.f189388f)) {
                D6.H(view5);
                if (!view4.isShown()) {
                    D6.H(view4);
                }
                if (!((Animator) interfaceC42726C.getValue()).isStarted()) {
                    ((Animator) interfaceC42726C.getValue()).start();
                }
            } else {
                if (((Animator) interfaceC42726C.getValue()).isStarted()) {
                    ((Animator) interfaceC42726C.getValue()).cancel();
                }
                D6.w(view5);
                D6.w(view4);
            }
        } else {
            D6.w(view3);
        }
        Float f12 = dVar.f189395m;
        if (f12 != null) {
            I5.a(this.f189418i, String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f12.floatValue())}, 1)), false);
        }
        this.f189433x = dVar;
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    public final void ga(boolean z12) {
        if (this.f189435z || this.f189434y) {
            return;
        }
        this.f189434y = true;
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        ConstraintLayout constraintLayout = this.f189411b;
        dVar.g(constraintLayout);
        dVar.f(R.id.item_container, 3);
        dVar.i(R.id.item_container, 4, R.id.title_container, 4);
        dVar.c(constraintLayout);
        ViewGroup viewGroup = this.f189414e;
        D6.H(viewGroup);
        ViewParent parent = constraintLayout.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (!z12 || viewGroup2 == null) {
            D6.g(viewGroup);
            this.f189405E.accept(constraintLayout);
            return;
        }
        Q5 q52 = new Q5(new C23494e());
        q52.f318729d = this.f189431v;
        q52.b(viewGroup);
        q52.b(constraintLayout);
        q52.f318728c = new b();
        Q.a(viewGroup2, q52.c());
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    @Y61.k
    public final z<G0> ha() {
        return C37722i.a(this.f189425p);
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    @Y61.k
    public final z<G0> ia() {
        return C37722i.a(this.f189414e);
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    public final void j2() {
        if (this.f189435z) {
            return;
        }
        this.f189434y = false;
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        ConstraintLayout constraintLayout = this.f189411b;
        dVar.g(constraintLayout);
        dVar.f(R.id.item_container, 4);
        dVar.i(R.id.item_container, 3, R.id.title_container, 4);
        dVar.c(constraintLayout);
        ViewGroup viewGroup = this.f189414e;
        D6.H(viewGroup);
        ViewParent parent = constraintLayout.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null) {
            this.f189406F.accept(constraintLayout);
            return;
        }
        Q5 q52 = new Q5(new C23494e());
        q52.f318729d = this.f189431v;
        q52.b(viewGroup);
        q52.b(constraintLayout);
        q52.f318728c = new com.avito.android.messenger.conversation.chat_header.d(this);
        Q.a(viewGroup2, q52.c());
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    @Y61.k
    public final z<G0> ja() {
        return this.f189410J;
    }

    @Override // com.avito.android.messenger.conversation.chat_header.a
    public final void show() {
        D6.H(this.f189411b);
    }
}
