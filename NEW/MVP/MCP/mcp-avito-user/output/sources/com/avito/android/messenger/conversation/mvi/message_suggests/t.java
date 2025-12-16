package com.avito.android.messenger.conversation.mvi.message_suggests;

import androidx.compose.runtime.internal.P;
import com.avito.android.C30277e1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32232q;
import com.avito.android.messenger.di.InterfaceC32438g0;
import com.avito.android.multi_message_send.ab_test.MultiMessageSendTestGroup;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.L;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import t3.InterfaceC48483n;

/* compiled from: MessageSuggestsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0006\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/t;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/s;", "Lcom/avito/android/messenger/conversation/mvi/common/d;", "a", "b", "c", "d", "e", "f", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t extends AbstractC32892c<MessageSuggestsView.b> implements s, com.avito.android.messenger.conversation.mvi.common.d {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32119a f191998V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.platform_actions.A f191999W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.common.a f192000X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32232q f192001Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final CY.o f192002Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final CY.m f192003a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final CY.n f192004b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final String f192005c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f192006d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f192007e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final u3.g<SimpleTestGroupWithNone> f192008f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f192009g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f192010h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f192011i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final C31667x f192012j0;

    /* compiled from: MessageSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/t$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.o<MessageSuggestsView.b> {
        public a() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final MessageSuggestsView.b d(MessageSuggestsView.b bVar) {
            MessageSuggestsView.b bVar2 = bVar;
            if (bVar2.equals(MessageSuggestsView.b.C5670b.f191933b)) {
                return MessageSuggestsView.b.a.f191932b;
            }
            boolean z12 = bVar2 instanceof MessageSuggestsView.b.d;
            t tVar = t.this;
            if (z12) {
                if (((MessageSuggestsView.b.d) bVar2).f191939d) {
                    tVar.f191998V.b();
                }
                tVar.f192004b0.b();
                return MessageSuggestsView.b.a.f191932b;
            }
            if (!(bVar2 instanceof MessageSuggestsView.b.c)) {
                if (bVar2.equals(MessageSuggestsView.b.a.f191932b)) {
                    return bVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (((MessageSuggestsView.b.c) bVar2).f191936d) {
                tVar.f191998V.b();
            }
            tVar.f192004b0.b();
            return MessageSuggestsView.b.a.f191932b;
        }
    }

    /* compiled from: MessageSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/t$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.o<MessageSuggestsView.b> {

        /* compiled from: MessageSuggestsPresenter.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "oldState", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;)Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.l<MessageSuggestsView.b, MessageSuggestsView.b> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ t f192014l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t tVar) {
                super(1);
                this.f192014l = tVar;
            }

            @Override // Y41.l
            public final MessageSuggestsView.b invoke(MessageSuggestsView.b bVar) {
                MessageSuggestsView.b bVar2 = bVar;
                MessageSuggestsView.b cVar = MessageSuggestsView.b.C5670b.f191933b;
                if (bVar2.equals(cVar)) {
                    return bVar2;
                }
                if (bVar2 instanceof MessageSuggestsView.b.c) {
                    C30277e1 c30277e1 = this.f192014l.f192007e0;
                    c30277e1.getClass();
                    kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[104];
                    if (((Boolean) c30277e1.f144996Y0.a().invoke()).booleanValue()) {
                        cVar = new MessageSuggestsView.b.c(null, C42784z0.f406748b, ((MessageSuggestsView.b.c) bVar2).f191935c);
                    }
                } else if (!(bVar2 instanceof MessageSuggestsView.b.d)) {
                    if (bVar2.equals(MessageSuggestsView.b.a.f191932b)) {
                        return bVar2;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return cVar;
            }
        }

        public b(t tVar) {
            super(null, null, new a(tVar), 3, null);
        }
    }

    /* compiled from: MessageSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/t$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends com.avito.android.mvi.rx3.with_monolithic_state.o<MessageSuggestsView.b> {
        public c() {
            throw null;
        }
    }

    /* compiled from: MessageSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/t$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends com.avito.android.mvi.rx3.with_monolithic_state.o<MessageSuggestsView.b> {
        public d() {
            throw null;
        }
    }

    /* compiled from: MessageSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/t$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class e extends com.avito.android.mvi.rx3.with_monolithic_state.o<MessageSuggestsView.b> {
        public e() {
            throw null;
        }
    }

    /* compiled from: MessageSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/t$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class f extends com.avito.android.mvi.rx3.with_monolithic_state.o<MessageSuggestsView.b> {
        public f(boolean z12) {
            super(null, null, new x(z12), 3, null);
        }
    }

    public t() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public t(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC32119a interfaceC32119a, @Y61.k com.avito.android.messenger.conversation.mvi.platform_actions.A a12, @Y61.k com.avito.android.messenger.conversation.mvi.common.a aVar, @Y61.k InterfaceC32232q interfaceC32232q, @Y61.k CY.o oVar, @Y61.k CY.m mVar, @Y61.k CY.n nVar, @Y61.k InterfaceC28373a interfaceC28373a, @InterfaceC32438g0 @Y61.k String str, @Y61.k C30277e1 c30277e1, @Y61.k @InterfaceC48483n u3.g<SimpleTestGroupWithNone> gVar, @x20.d @Y61.k u3.l<MultiMessageSendTestGroup> lVar) {
        super("MessageSuggestsPresenter", MessageSuggestsView.b.C5670b.f191933b, interfaceC35745a5, null, new com.avito.android.mvi.rx3.with_monolithic_state.F(interfaceC35745a5.a(), null, 2, 0 == true ? 1 : 0), null, null, null, 232, null);
        this.f191998V = interfaceC32119a;
        this.f191999W = a12;
        this.f192000X = aVar;
        this.f192001Y = interfaceC32232q;
        this.f192002Z = oVar;
        this.f192003a0 = mVar;
        this.f192004b0 = nVar;
        this.f192005c0 = str;
        this.f192006d0 = interfaceC28373a;
        this.f192007e0 = c30277e1;
        this.f192008f0 = gVar;
        com.avito.android.util.architecture_components.D<String> d12 = new com.avito.android.util.architecture_components.D<>();
        this.f192009g0 = d12;
        this.f192010h0 = d12;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f192011i0 = cVar;
        this.f192012j0 = new C31667x(interfaceC28373a, c30277e1);
        kotlin.reflect.n<Object> nVar2 = C30277e1.f144946d1[51];
        if (((Boolean) c30277e1.f144995Y.a().invoke()).booleanValue()) {
            aVar.c(this);
            cVar.b(interfaceC32119a.getF191953h().t0(new z(this)));
            if (lVar.f439745a.f439749b.a()) {
                cVar.b(aVar.getF190155c().N(A.f191887b).t0(new B(this)));
                cVar.b(aVar.getF190157e().N(new C(this)).t0(new D(this)));
            } else {
                cVar.b(a12.m8().t0(new E(this)));
            }
            cVar.b(interfaceC32232q.h().t0(new F(this)));
        }
    }

    public static final ArrayList me(t tVar, List list) {
        tVar.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            MessageSuggest messageSuggest = (MessageSuggest) obj;
            String previewText = messageSuggest.getPreviewText();
            String messageText = messageSuggest.getMessageText();
            int id2 = messageSuggest.getId();
            RawJson intent = messageSuggest.getIntent();
            arrayList.add(new MessageSuggestsView.SuggestItem(id2, i12, previewText, messageText, intent != null ? intent.getValue() : null));
            i12 = i13;
        }
        return arrayList;
    }

    @Override // com.avito.android.messenger.conversation.mvi.common.d
    @Y61.k
    public final L Ga() {
        return this.f207139Q.d0(y.f192021b).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_suggests.s
    public final void S2(@Y61.k MessageSuggestsView.SuggestItem suggestItem) {
        le().s(new e(null, null, new w(this, suggestItem), 3, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_suggests.s
    /* renamed from: g3, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF192010h0() {
        return this.f192010h0;
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f192011i0.e();
        this.f191998V.destroy();
        this.f192000X.b(this);
        super.onCleared();
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_suggests.s
    public final void s3() {
        le().s(new a());
    }
}
