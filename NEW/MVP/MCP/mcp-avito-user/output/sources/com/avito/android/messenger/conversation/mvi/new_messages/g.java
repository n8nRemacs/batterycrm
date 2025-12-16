package com.avito.android.messenger.conversation.mvi.new_messages;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import com.avito.android.C30277e1;
import com.avito.android.messenger.channels.mvi.sync.E0;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.new_messages.k;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.mvi.rx3.with_monolithic_state.o;
import com.avito.android.mvi.rx3.with_monolithic_state.t;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.M0;
import j.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: NewMessagesPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0007\b\t\n\u000b\f\r\u000eJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/new_messages/g;", "Lcom/avito/android/messenger/conversation/mvi/new_messages/a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b;", "Lkotlin/G0;", "onStart", "()V", "onStop", "a", "b", "c", "d", "e", "f", "g", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends AbstractC32892c<k.b> implements com.avito.android.messenger.conversation.mvi.new_messages.a {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final String f193776V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f193777W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final E0 f193778X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f193779Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f193780Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f193781a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f193782b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final D f193783c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final D f193784d0;

    /* compiled from: NewMessagesPresenter.kt */
    @P
    @k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/new_messages/g$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends o<k.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f193785d;

        public a(@Y61.k Y41.a aVar) {
            super("InitialScrollPerformedMutator", null, 2, null);
            this.f193785d = aVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final k.b d(k.b bVar) {
            k.b bVar2 = bVar;
            if (bVar2 instanceof k.b.a) {
                return bVar2;
            }
            if (!(bVar2 instanceof k.b.C5730b)) {
                throw new NoWhenBranchMatchedException();
            }
            k.b.C5730b c5730b = (k.b.C5730b) bVar2;
            if (c5730b.f193812c) {
                return (k.b.C5730b) bVar2;
            }
            if (L.f(c5730b.f193811b, Boolean.TRUE)) {
                ((h) this.f193785d).invoke();
            }
            return k.b.C5730b.g((k.b.C5730b) bVar2, null, null, 0, 0, null, null, 123);
        }
    }

    /* compiled from: NewMessagesPresenter.kt */
    @P
    @k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/new_messages/g$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends C32891b<k.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f193786d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final InterfaceC32024m f193787e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final E0 f193788f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final H f193789g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.server_time.f f193790h;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k String str, @Y61.k InterfaceC32024m interfaceC32024m, @Y61.k E0 e02, @Y61.k H h12, @Y61.k com.avito.android.server_time.f fVar) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            this.f193786d = str;
            this.f193787e = interfaceC32024m;
            this.f193788f = e02;
            this.f193789g = h12;
            this.f193790h = fVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final I b(k.b bVar) {
            k.b bVar2 = bVar;
            if (bVar2.getF193810a().f430682d.length() <= 0) {
                return I.q(G0.f406611a);
            }
            long jNow = this.f193790h.now();
            MessengerUserHashInfo f193810a = bVar2.getF193810a();
            InterfaceC32024m interfaceC32024m = this.f193787e;
            String str = this.f193786d;
            return interfaceC32024m.k(jNow, str, f193810a).g(this.f193788f.c(str, bVar2.getF193810a())).x(this.f193789g).l(com.avito.android.messenger.conversation.mvi.new_messages.h.f193806b).r().B(G0.f406611a);
        }
    }

    /* compiled from: NewMessagesPresenter.kt */
    @P
    @k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/new_messages/g$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends C32890a<k.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final T1 f193791d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final T1 f193792e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f193793f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final D f193794g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final D f193795h;

        public c(@Y61.k T1 t12, @Y61.k T1 t13, boolean z12, @Y61.k D d12, @Y61.k D d13) {
            super("OnNewListItemsAction(oldBottomItem = " + t12 + ", newBottomItem = " + t13 + ')', null, 2, null);
            this.f193791d = t12;
            this.f193792e = t13;
            this.f193793f = z12;
            this.f193794g = d12;
            this.f193795h = d13;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(k.b bVar) {
            k.b bVar2 = bVar;
            boolean f193812c = bVar2.getF193812c();
            String str = this.f207125a;
            if (!f193812c) {
                V2.f318762a.i("NewMessagesPresenter", str + ":\n\t initialScrollPerformed == false \n\t => Don't scroll to bottom", null);
                return;
            }
            boolean z12 = this.f193791d instanceof T1.h;
            D d12 = this.f193794g;
            T1 t12 = this.f193792e;
            if (!z12 && (t12 instanceof T1.d) && ((T1.d) t12).f189172g) {
                V2.f318762a.i("NewMessagesPresenter", str + ":\n\t newBottomItem is ChannelItem.Message && newBottomItem.isMy \n\t => Scroll to bottom", null);
                d12.postValue(G0.f406611a);
                return;
            }
            Boolean f193811b = bVar2.getF193811b();
            Boolean bool = Boolean.TRUE;
            if (L.f(f193811b, bool) && !z12 && (t12 instanceof T1.d) && this.f193793f) {
                V2 v22 = V2.f318762a;
                StringBuilder sbZ = r.z(str, ":\n\t new incoming message while at bottom \n\t => Scroll new message to top ");
                sbZ.append(bVar2.getF193813d());
                v22.i("NewMessagesPresenter", sbZ.toString(), null);
                MessageBody body = ((T1.d) t12).f189180o.getBody();
                this.f193795h.postValue(Integer.valueOf(body instanceof MessageBody.SystemMessageBody.Platform ? ((MessageBody.SystemMessageBody.Platform) body).getChunks().size() : 1));
                return;
            }
            if (!L.f(bVar2.getF193811b(), bool)) {
                V2.f318762a.i("NewMessagesPresenter", str + ":\n\t (newBottomItem !is ChannelItem.Message || !newBottomItem.isMy) && !curState.isScrolledToBottom \n\t => Don't scroll to bottom", null);
                return;
            }
            V2.f318762a.i("NewMessagesPresenter", str + ":\n\t (newBottomItem !is ChannelItem.Message || !newBottomItem.isMy) && curState.isScrolledToBottom \n\t => Scroll to bottom", null);
            d12.postValue(G0.f406611a);
        }
    }

    /* compiled from: NewMessagesPresenter.kt */
    @P
    @k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/new_messages/g$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends o<k.b> {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f193796d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f193797e;

        public d(@Y61.k Y41.a aVar, boolean z12) {
            super("OnScrolledToBottomChangedMutator(isScrolledToBottom=" + z12 + ')', null, 2, null);
            this.f193796d = z12;
            this.f193797e = aVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final k.b d(k.b bVar) {
            k.b bVar2 = bVar;
            if (!(bVar2 instanceof k.b.C5730b)) {
                if (bVar2 instanceof k.b.a) {
                    return bVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            boolean z12 = this.f193796d;
            k.b.C5730b c5730b = (k.b.C5730b) bVar2;
            boolean zEquals = Boolean.valueOf(z12).equals(c5730b.f193811b);
            if (z12 && c5730b.f193812c && (!zEquals || c5730b.f193813d > 0)) {
                ((i) this.f193797e).invoke();
            }
            return !zEquals ? k.b.C5730b.g((k.b.C5730b) bVar2, null, Boolean.valueOf(z12), 0, 0, null, null, 125) : (k.b.C5730b) bVar2;
        }
    }

    /* compiled from: NewMessagesPresenter.kt */
    @P
    @k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/new_messages/g$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends o<k.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final D f193798d;

        public e(@Y61.k D d12) {
            super("ScrollToNewMessages()", null, 2, null);
            this.f193798d = d12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final k.b d(k.b bVar) {
            k.b bVar2 = bVar;
            this.f193798d.postValue(Integer.valueOf(bVar2.getF193814e()));
            if (bVar2 instanceof k.b.a) {
                return bVar2;
            }
            if (bVar2 instanceof k.b.C5730b) {
                return k.b.C5730b.g((k.b.C5730b) bVar2, null, null, 0, 0, ((k.b.C5730b) bVar2).f193816g, null, 79);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: NewMessagesPresenter.kt */
    @P
    @k0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/new_messages/g$g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.new_messages.g$g, reason: collision with other inner class name */
    public static final class C5729g extends o<k.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f193803d;

        public C5729g(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
            super(null, null, 3, null);
            this.f193803d = messengerUserHashInfo;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final k.b d(k.b bVar) {
            k.b bVar2 = bVar;
            if (this.f193803d.f430682d.length() == 0) {
                return new k.b.a(bVar2.getF193811b());
            }
            if (bVar2 instanceof k.b.a) {
                return new k.b.C5730b(this.f193803d, ((k.b.a) bVar2).f193808a, false, 0, 0, null, null, 124, null);
            }
            if (bVar2 instanceof k.b.C5730b) {
                return k.b.C5730b.g((k.b.C5730b) bVar2, this.f193803d, null, 0, 0, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: NewMessagesPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.me(g.this);
            return G0.f406611a;
        }
    }

    /* compiled from: NewMessagesPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.me(g.this);
            return G0.f406611a;
        }
    }

    public g(@Y61.k String str, @Y61.k InterfaceC32024m interfaceC32024m, @Y61.k E0 e02, @Y61.k com.avito.android.server_time.f fVar, @Y61.k C30277e1 c30277e1, @Y61.k InterfaceC31987a interfaceC31987a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k k.b.a aVar) {
        super("NewMessagesPresenter", aVar, interfaceC35745a5, null, null, null, null, null, 248, null);
        this.f193776V = str;
        this.f193777W = interfaceC32024m;
        this.f193778X = e02;
        this.f193779Y = fVar;
        this.f193780Z = c30277e1;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f193781a0 = cVar;
        this.f193782b0 = new AtomicBoolean(false);
        this.f193783c0 = new D();
        this.f193784d0 = new D();
        B0 b0D0 = interfaceC31987a.M0().j0(interfaceC35745a5.c()).d0(com.avito.android.messenger.conversation.mvi.new_messages.i.f193807b);
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        M0 m02 = new M0(b0D0.D(oVar));
        cVar.b(m02.t0(new com.avito.android.messenger.conversation.mvi.new_messages.b(this)));
        cVar.b(m02.y0(new com.avito.android.messenger.conversation.mvi.new_messages.c(this, interfaceC35745a5)).q0(1L).D(oVar).v0(new com.avito.android.messenger.conversation.mvi.new_messages.e(this), new com.avito.android.messenger.conversation.mvi.new_messages.f(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
        cVar.b(m02.N0());
    }

    public static final void me(g gVar) {
        t<k.b> tVarLe = gVar.le();
        H hA2 = gVar.f207133K.a();
        tVarLe.s(new b(gVar.f193776V, gVar.f193777W, gVar.f193778X, hA2, gVar.f193779Y));
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_START)
    private final void onStart() {
        this.f193782b0.set(true);
        V2.f318762a.i(this.f207131E, "onStart()", null);
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_STOP)
    private final void onStop() {
        this.f193782b0.set(false);
        V2.f318762a.i(this.f207131E, "onStop()", null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.new_messages.a
    public final void N40() {
        le().s(new a(new h()));
    }

    @Override // com.avito.android.messenger.conversation.mvi.new_messages.a
    public final void V10(@Y61.k T1 t12, @Y61.k T1 t13) {
        t<k.b> tVarLe = le();
        C30277e1 c30277e1 = this.f193780Z;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[86];
        tVarLe.s(new c(t12, t13, ((Boolean) c30277e1.f144960G0.a().invoke()).booleanValue(), this.f193783c0, this.f193784d0));
    }

    @Override // com.avito.android.messenger.conversation.mvi.new_messages.a
    /* renamed from: eO, reason: from getter */
    public final D getF193784d0() {
        return this.f193784d0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.new_messages.a
    public final void h60(boolean z12) {
        le().s(new d(new i(), z12));
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f193781a0.dispose();
        super.onCleared();
    }

    @Override // com.avito.android.messenger.conversation.mvi.new_messages.a
    /* renamed from: tx, reason: from getter */
    public final D getF193783c0() {
        return this.f193783c0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.new_messages.a
    public final void vg() {
        le().s(new e(this.f193784d0));
    }

    /* compiled from: NewMessagesPresenter.kt */
    @P
    @k0
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/new_messages/g$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/new_messages/k$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends o<k.b> {

        /* renamed from: d, reason: collision with root package name */
        public final int f193799d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f193800e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final AtomicBoolean f193801f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final List<LocalMessage> f193802g;

        public f(int i12, Y41.a aVar, AtomicBoolean atomicBoolean, List list, int i13, C42822w c42822w) {
            this(i12, aVar, atomicBoolean, (i13 & 8) != 0 ? C42784z0.f406748b : list);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final k.b d(k.b bVar) {
            k.b bVar2 = bVar;
            List<LocalMessage> list = this.f193802g;
            LocalMessage localMessage = (LocalMessage) C42745f0.G(list);
            Long lValueOf = localMessage != null ? Long.valueOf(localMessage.getCreated()) : null;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                long created = ((LocalMessage) obj).getCreated();
                Long f193815f = bVar2.getF193815f();
                if (created > (f193815f != null ? f193815f.longValue() : 0L)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            int size = 0;
            while (it.hasNext()) {
                MessageBody body = ((LocalMessage) it.next()).getBody();
                size += body instanceof MessageBody.SystemMessageBody.Platform ? ((MessageBody.SystemMessageBody.Platform) body).getChunks().size() : 1;
            }
            if (!(bVar2 instanceof k.b.C5730b)) {
                if (bVar2 instanceof k.b.a) {
                    return bVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            k.b.C5730b c5730b = (k.b.C5730b) bVar2;
            if (L.f(c5730b.f193811b, Boolean.TRUE) && c5730b.f193812c && this.f193799d > 0 && this.f193801f.get()) {
                this.f193800e.invoke();
            }
            return k.b.C5730b.g((k.b.C5730b) bVar2, null, null, this.f193799d, size, null, lValueOf, 39);
        }

        public f(int i12, @Y61.k Y41.a<G0> aVar, @Y61.k AtomicBoolean atomicBoolean, @Y61.k List<LocalMessage> list) {
            super(r.p("UnreadMessageCountChangedMutator(unreadMessageCount=", i12, ')'), null, 2, null);
            this.f193799d = i12;
            this.f193800e = aVar;
            this.f193801f = atomicBoolean;
            this.f193802g = list;
        }
    }
}
