package com.avito.android.messenger.conversation.mvi.send;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.avito.android.B2;
import com.avito.android.C30277e1;
import com.avito.android.R;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.messenger.input.MessageInput;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: SendMessageView.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/Q0;", "Lcom/avito/android/messenger/conversation/mvi/send/P0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Q0 implements P0 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<kotlin.G0> f194348A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<kotlin.G0> f194349B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194350C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194351D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194352E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194353F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194354G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> f194355H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194356I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194357J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194358K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194359L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194360M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194361N;

    /* renamed from: O, reason: collision with root package name */
    public int f194362O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f194363P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f194364Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f194365R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f194366S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public SendMessagePresenter.State f194367T;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f194368a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f194369b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final B2 f194370c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f194371d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f194372e;

    /* renamed from: f, reason: collision with root package name */
    public final View f194373f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f194374g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final MessageInput f194375h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewGroup f194376i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.adapter.quote.b f194377j;

    /* renamed from: k, reason: collision with root package name */
    public final View f194378k;

    /* renamed from: l, reason: collision with root package name */
    public final ImageView f194379l;

    /* renamed from: m, reason: collision with root package name */
    public final ImageView f194380m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f194381n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.o f194382o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<kotlin.G0> f194383p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<kotlin.G0> f194384q;

    /* renamed from: r, reason: collision with root package name */
    public final int f194385r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<String> f194386s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.T0 f194387t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<kotlin.G0> f194388u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<kotlin.G0> f194389v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<kotlin.G0> f194390w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<kotlin.G0> f194391x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<kotlin.G0> f194392y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<kotlin.G0> f194393z;

    /* compiled from: SendMessageView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            Q0 q02 = Q0.this;
            if (!q02.f194363P) {
                return true;
            }
            q02.f194363P = false;
            return false;
        }
    }

    /* compiled from: SendMessageView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Animator> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Animator invoke() {
            return com.avito.android.messenger.util.a.a(Q0.this.f194380m);
        }
    }

    /* compiled from: SendMessageView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "elapsedSeconds", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            long jLongValue = ((Number) obj).longValue();
            MessageInput messageInput = Q0.this.f194375h;
            LY.a.f9975a.getClass();
            messageInput.d(LY.a.d(jLongValue), false);
        }
    }

    /* compiled from: SendMessageView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T, R> f194398b = new e<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: SendMessageView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T, R> f194399b = new f<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.FALSE;
        }
    }

    public Q0(@Y61.k ViewGroup viewGroup, @Y61.k C30277e1 c30277e1, @Y61.k B2 b22) {
        this.f194368a = viewGroup;
        this.f194369b = c30277e1;
        this.f194370c = b22;
        this.f194371d = viewGroup.getContext();
        this.f194372e = viewGroup.getContext().getResources();
        View viewFindViewById = viewGroup.findViewById(R.id.input_container);
        this.f194373f = viewFindViewById;
        c30277e1.getClass();
        kotlin.reflect.n<Object>[] nVarArr = C30277e1.f144946d1;
        kotlin.reflect.n<Object> nVar = nVarArr[43];
        this.f194374g = ((Boolean) c30277e1.f144979Q.a().invoke()).booleanValue() && c30277e1.x().invoke().booleanValue();
        MessageInput.a aVar = MessageInput.f196374T1;
        kotlin.reflect.n<Object> nVar2 = nVarArr[94];
        boolean zBooleanValue = ((Boolean) c30277e1.f144976O0.a().invoke()).booleanValue();
        aVar.getClass();
        MessageInput messageInputA = MessageInput.a.a(viewFindViewById, zBooleanValue);
        this.f194375h = messageInputA;
        this.f194376i = (ViewGroup) viewGroup.findViewById(R.id.message_quote_panel);
        this.f194377j = new com.avito.android.messenger.conversation.adapter.quote.b(viewGroup.findViewById(R.id.message_quote_compose));
        this.f194378k = viewGroup.findViewById(R.id.close_quote_button);
        this.f194379l = (ImageView) viewGroup.findViewById(R.id.attachment_button_onboarding_static_dot);
        this.f194380m = (ImageView) viewGroup.findViewById(R.id.attachment_button_onboarding_dynamic_dot);
        this.f194381n = C42727D.c(new c());
        com.jakewharton.rxrelay3.d<kotlin.G0> dVarM = C31685o.m();
        this.f194383p = dVarM;
        com.jakewharton.rxrelay3.d<kotlin.G0> dVarM2 = C31685o.m();
        this.f194384q = dVarM2;
        this.f194385r = viewFindViewById.getHeight();
        this.f194386s = messageInputA.getF196389C();
        this.f194388u = messageInputA.f();
        this.f194389v = messageInputA.h();
        this.f194390w = messageInputA.q();
        this.f194391x = messageInputA.u();
        this.f194392y = messageInputA.t();
        this.f194393z = messageInputA.k();
        io.reactivex.rxjava3.core.z<kotlin.G0> zVarA = messageInputA.a();
        zVarA.getClass();
        this.f194348A = io.reactivex.rxjava3.core.z.g0(zVarA, dVarM);
        this.f194349B = messageInputA.getF196390D();
        this.f194350C = new com.jakewharton.rxrelay3.c();
        this.f194351D = new com.jakewharton.rxrelay3.c();
        this.f194352E = new com.jakewharton.rxrelay3.c();
        this.f194353F = new com.jakewharton.rxrelay3.c();
        this.f194354G = new com.jakewharton.rxrelay3.c();
        this.f194355H = io.reactivex.rxjava3.core.z.g0(messageInputA.i().d0(e.f194398b), dVarM2.d0(f.f194399b));
        this.f194356I = new com.jakewharton.rxrelay3.c();
        this.f194357J = new com.jakewharton.rxrelay3.c();
        this.f194358K = new com.jakewharton.rxrelay3.c();
        this.f194359L = new com.jakewharton.rxrelay3.c();
        this.f194360M = new com.jakewharton.rxrelay3.c();
        this.f194361N = new com.jakewharton.rxrelay3.c();
        this.f194362O = -1;
        this.f194364Q = new io.reactivex.rxjava3.disposables.c();
        this.f194387t = messageInputA.p().N(new a()).d0(new l41.o() { // from class: com.avito.android.messenger.conversation.mvi.send.Q0.b
            @Override // l41.o
            public final Object apply(Object obj) {
                return ((CharSequence) obj).toString();
            }
        }).p0();
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new Y0(this));
    }

    public final void a() {
        com.avito.android.lib.design.modal.a aVar = this.f194365R;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f194365R = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@Y61.k com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter.State r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.send.Q0.b(com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter$State, boolean):void");
    }
}
