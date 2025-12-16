package com.avito.android.messenger.conversation.mvi.messages;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.view.C22977J;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.messenger.conversation.X1;
import com.avito.android.messenger.conversation.mvi.messages.MessageListScrollEvent;
import com.avito.android.messenger.conversation.mvi.messages.g0;
import com.avito.android.remote.model.messenger.context.ChatReplyTime;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.R0;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jakewharton.rxbinding4.view.C37722i;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.p2;

/* compiled from: MessageListView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0005²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/q0;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0;", "Lcom/avito/android/progress_overlay/g;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$c;", VoiceInfo.STATE, "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
@F3
/* loaded from: classes15.dex */
public final class q0 implements g0, com.avito.android.progress_overlay.g {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f193093A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f193094B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f193095C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f193096D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f193097E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f193098F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> f193099G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f193100H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f193101I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public Object f193102J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final v0 f193103K;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f193104b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g0.b f193105c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C22977J f193106d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.messages.utils.p f193107e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.messages.utils.d f193108f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final kotlin.jvm.internal.N f193109g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final R0 f193110h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f193111i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f193112j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.analytics.g f193113k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final X1 f193114l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Z1<g0.c> f193115m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final e2 f193116n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final ComposeView f193117o;

    /* renamed from: p, reason: collision with root package name */
    public final int f193118p;

    /* renamed from: q, reason: collision with root package name */
    public final ViewGroup f193119q;

    /* renamed from: r, reason: collision with root package name */
    public final ImageView f193120r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f193121s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewGroup f193122t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f193123u;

    /* renamed from: v, reason: collision with root package name */
    public final Button f193124v;

    /* renamed from: w, reason: collision with root package name */
    public final SimpleDraweeView f193125w;

    /* renamed from: x, reason: collision with root package name */
    public final Space f193126x;

    /* renamed from: y, reason: collision with root package name */
    public final Space f193127y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f193128z;

    /* compiled from: MessageListView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f193129a;

        static {
            int[] iArr = new int[ChatReplyTime.ActionType.values().length];
            try {
                iArr[ChatReplyTime.ActionType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatReplyTime.ActionType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f193129a = iArr;
        }
    }

    /* compiled from: MessageListView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.MessageListViewImpl$scrollItemToTop$1", f = "MessageListView.kt", i = {}, l = {420}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f193130q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f193132s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f193132s = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return q0.this.new b(this.f193132s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f193130q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = q0.this.f193116n;
                MessageListScrollEvent.a aVar = new MessageListScrollEvent.a(this.f193132s, MessageListScrollEvent.ScrollAlignment.f192083b);
                this.f193130q = 1;
                if (e2Var.emit(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q0(@Y61.k ViewGroup viewGroup, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.messenger.conversation.analytics.b bVar, boolean z12, @Y61.k g0.b bVar2, @Y61.k C22977J c22977j, @Y61.k com.avito.android.messenger.conversation.mvi.messages.utils.p pVar, @Y61.k com.avito.android.messenger.conversation.mvi.messages.utils.d dVar, @Y61.l Y41.a aVar, @Y61.k R0 r02, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k com.avito.android.util.text.a aVar2) {
        this.f193104b = z12;
        this.f193105c = bVar2;
        this.f193106d = c22977j;
        this.f193107e = pVar;
        this.f193108f = dVar;
        this.f193109g = (kotlin.jvm.internal.N) aVar;
        this.f193110h = r02;
        this.f193111i = xVar;
        this.f193112j = aVar2;
        this.f193113k = new com.avito.android.messenger.conversation.analytics.g(bVar);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.channel_screen_root);
        X1 x12 = new X1(viewGroup2, interfaceC28373a);
        this.f193114l = x12;
        g0.c.f192968d.getClass();
        this.f193115m = p2.a(g0.c.f192969e);
        this.f193116n = f2.b(0, 0, null, 7);
        this.f193118p = viewGroup.getResources().getDimensionPixelSize(R.dimen.messenger_hide_keyboard_scroll_threshold);
        this.f193119q = (ViewGroup) viewGroup.findViewById(R.id.reply_time_overlay);
        this.f193120r = (ImageView) viewGroup.findViewById(R.id.reply_time_icon);
        this.f193121s = (TextView) viewGroup.findViewById(R.id.reply_time_text);
        this.f193122t = (ViewGroup) viewGroup.findViewById(R.id.reply_time_overlay_redesign);
        this.f193123u = (TextView) viewGroup.findViewById(R.id.reply_time_redesign_text);
        this.f193124v = (Button) viewGroup.findViewById(R.id.reply_time_redesign_action);
        this.f193125w = (SimpleDraweeView) viewGroup.findViewById(R.id.reply_time_redesign_img);
        this.f193126x = (Space) viewGroup.findViewById(R.id.top_space_for_reply_time_button);
        this.f193127y = (Space) viewGroup.findViewById(R.id.top_space_for_reply_time_text);
        this.f193128z = new com.jakewharton.rxrelay3.c();
        this.f193093A = new com.jakewharton.rxrelay3.c();
        this.f193094B = new com.jakewharton.rxrelay3.c();
        this.f193095C = new com.jakewharton.rxrelay3.c();
        this.f193096D = new com.jakewharton.rxrelay3.b();
        this.f193097E = new com.jakewharton.rxrelay3.b();
        this.f193098F = new com.jakewharton.rxrelay3.c();
        this.f193102J = s0.f193545l;
        this.f193103K = new v0(this);
        viewGroup2.setBackgroundColor(C35835l0.d(R.attr.white, viewGroup2.getContext()));
        ComposeView composeView = (ComposeView) viewGroup.findViewById(R.id.message_list_compose_view);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        composeView.setContent(new C22096n(-669140469, new p0(composeView, this), true));
        D6.H(composeView);
        this.f193117o = composeView;
        this.f193099G = C37722i.b(composeView);
        x12.h(this);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.g0
    public final boolean a(int i12) {
        InterfaceC22204y1 interfaceC22204y1 = this.f193105c.f192967a;
        if (((Number) ((C22082i3) interfaceC22204y1).getF42167b()).intValue() == i12) {
            return true;
        }
        ((C22082i3) interfaceC22204y1).setValue(Integer.valueOf(i12));
        return false;
    }

    public final void b(int i12) {
        C43259k.d(this.f193106d, null, null, new b(i12, null), 3);
    }

    public final void c(int i12) {
        C43259k.d(this.f193106d, null, null, new t0(this, i12, null), 3);
    }

    @Override // com.avito.android.progress_overlay.g
    public final void j0() {
        this.f193128z.accept(G0.f406611a);
    }
}
