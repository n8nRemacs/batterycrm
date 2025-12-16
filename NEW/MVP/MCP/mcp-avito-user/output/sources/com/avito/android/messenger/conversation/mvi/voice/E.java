package com.avito.android.messenger.conversation.mvi.voice;

import android.net.Uri;
import arrow.core.Y0;
import com.avito.android.C30277e1;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_download.InterfaceC32038b;
import com.avito.android.messenger.conversation.mvi.voice.A;
import com.avito.android.messenger.conversation.mvi.voice.N;
import com.avito.android.messenger.di.InterfaceC32438g0;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.mvi.rx3.with_monolithic_state.u;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.persistence.messenger.TransferStatus;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.util.InterfaceC35745a5;
import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;
import p41.AbstractC46895b;

/* compiled from: VoiceMessageClickInteractor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/E;", "Lcom/avito/android/messenger/conversation/mvi/voice/A;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/voice/A$a;", "a", "b", "c", "d", "e", "f", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class E extends AbstractC32892c<A.a> implements A {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final String f195039V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f195040W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_attachment.n f195041X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32038b f195042Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f f195043Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.u f195044a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f195045b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final P f195046c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f195047d0;

    /* compiled from: VoiceMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/E$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/E;", "Lcom/avito/android/messenger/conversation/mvi/voice/A$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.mvi.rx3.with_monolithic_state.E<A.a> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f195048b = new a();

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.E
        public final boolean a(@Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<A.a> xVar, @Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<A.a> xVar2) {
            b bVar = b.f195049a;
            return kotlin.jvm.internal.L.f(bVar.a(xVar), bVar.a(xVar2));
        }
    }

    /* compiled from: VoiceMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/E$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/u$b;", "Lcom/avito/android/messenger/conversation/mvi/voice/A$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements u.b<A.a, String> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f195049a = new b();

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.u.b
        @Y61.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String a(@Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<A.a> xVar) {
            if (!(xVar instanceof c)) {
                return null;
            }
            return "OnBubbleClickAction(localMessageId = " + ((c) xVar).f195050d.getLocalId() + ')';
        }
    }

    /* compiled from: VoiceMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/E$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/voice/A$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends com.avito.android.mvi.rx3.with_monolithic_state.p<A.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f195050d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Q1 f195051e;

        public c(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12) {
            super(null, "message = " + localMessage + ", metaInfo = " + q12, 1, null);
            this.f195050d = localMessage;
            this.f195051e = q12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<A.a> b(A.a aVar) {
            A.a aVar2 = aVar;
            LocalMessage localMessage = this.f195050d;
            String remoteId = localMessage.getRemoteId();
            if (remoteId == null || C43066x.K(remoteId)) {
                return io.reactivex.rxjava3.core.I.q(aVar2);
            }
            Q1 q12 = this.f195051e;
            TransferStatus transferStatus = q12 != null ? q12.f215288g : null;
            TransferStatus transferStatus2 = TransferStatus.IN_PROGRESS;
            E e12 = E.this;
            if (transferStatus == transferStatus2) {
                return e12.f195042Y.c(com.avito.android.messenger.util.i.c(localMessage), e12.f195039V, localMessage.getLocalId(), null, null).l(new F(e12, this)).r().B(aVar2);
            }
            if ((q12 != null ? q12.f215288g : null) != TransferStatus.SUCCESS || !E.me(e12, q12.f215285d)) {
                return e12.f195042Y.a(com.avito.android.messenger.util.i.c(localMessage), localMessage.getChannelId(), localMessage.getLocalId(), e12.f195040W.now(), null, null).l(new G(e12)).B(new A.a.C5762a(localMessage, q12)).v(aVar2);
            }
            e12.f195046c0.f195086a.accept(new N.a(localMessage, q12));
            return io.reactivex.rxjava3.core.I.q(aVar2);
        }
    }

    /* compiled from: VoiceMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/E$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/voice/A$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends C32891b<A.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f195053d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Q1 f195054e;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12) {
            super(null, "message = " + localMessage, 1, 0 == true ? 1 : 0);
            this.f195053d = localMessage;
            this.f195054e = q12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final io.reactivex.rxjava3.core.I b(A.a aVar) {
            LocalMessage localMessage = this.f195053d;
            String remoteId = localMessage.getRemoteId();
            E e12 = E.this;
            if (remoteId == null || C43066x.K(remoteId)) {
                return e12.f195043Z.a(e12.f195039V, localMessage.getLocalId(), com.avito.android.messenger.util.i.c(localMessage)).i(new H(e12, this)).r(I.f195066b).v(G0.f406611a);
            }
            Q1 q12 = this.f195054e;
            if ((q12 != null ? q12.f215288g : null) == TransferStatus.IN_PROGRESS) {
                return e12.f195042Y.c(com.avito.android.messenger.util.i.c(localMessage), e12.f195039V, localMessage.getLocalId(), null, null).l(new J(e12, this)).r().B(G0.f406611a);
            }
            return io.reactivex.rxjava3.core.I.q(G0.f406611a);
        }
    }

    /* compiled from: VoiceMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/E$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/voice/A$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class e extends C32891b<A.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f195056d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Q1 f195057e;

        /* renamed from: f, reason: collision with root package name */
        public final int f195058f;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12, int i12) {
            super(null, "message = " + localMessage + " metaInfo = " + q12 + " progress = " + i12, 1, 0 == true ? 1 : 0);
            this.f195056d = localMessage;
            this.f195057e = q12;
            this.f195058f = i12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final io.reactivex.rxjava3.core.I b(A.a aVar) {
            Q1 q12 = this.f195057e;
            if ((q12 != null ? q12.f215288g : null) == TransferStatus.SUCCESS) {
                String str = q12.f215285d;
                E e12 = E.this;
                if (E.me(e12, str)) {
                    e12.f195046c0.f195086a.accept(new N.b(this.f195056d, q12, this.f195058f));
                }
            }
            return io.reactivex.rxjava3.core.I.q(G0.f406611a);
        }
    }

    /* compiled from: VoiceMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/E$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/u$c;", "Lcom/avito/android/messenger/conversation/mvi/voice/A$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements u.c<A.a, String> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final io.reactivex.rxjava3.core.H f195060a;

        public f(@Y61.k io.reactivex.rxjava3.core.H h12) {
            this.f195060a = h12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.u.c
        public final io.reactivex.rxjava3.core.z a(Object obj, AbstractC46895b abstractC46895b) {
            return ((String) obj) == null ? abstractC46895b : abstractC46895b.D0(300L, TimeUnit.MILLISECONDS, this.f195060a);
        }
    }

    public E() {
        throw null;
    }

    @Inject
    public E(@InterfaceC32438g0 @Y61.k String str, @Y61.k com.avito.android.server_time.f fVar, @Y61.k InterfaceC32038b interfaceC32038b, @Y61.k com.avito.android.messenger.conversation.mvi.file_attachment.n nVar, @Y61.k com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f fVar2, @Y61.k com.avito.android.permissions.u uVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC32024m interfaceC32024m, @Y61.k P p12, @Y61.k C30277e1 c30277e1) {
        super("VoiceMessageClickInteractor", A.a.b.f195034a, interfaceC35745a5, a.f195048b, new com.avito.android.mvi.rx3.with_monolithic_state.u(interfaceC35745a5.a(), b.f195049a, new f(interfaceC35745a5.a())), null, null, null, 224, null);
        this.f195039V = str;
        this.f195040W = fVar;
        this.f195041X = nVar;
        this.f195042Y = interfaceC32038b;
        this.f195043Z = fVar2;
        this.f195044a0 = uVar;
        this.f195045b0 = interfaceC32024m;
        this.f195046c0 = p12;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f195047d0 = cVar;
        if (c30277e1.x().invoke().booleanValue()) {
            cVar.b(this.f207139Q.x0(interfaceC35745a5.a()).k0(A.a.C5762a.class).y0(new D(this)).s0());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean me(E e12, String str) {
        e12.getClass();
        if (str == null) {
            return false;
        }
        if (((com.avito.android.messenger.conversation.mvi.file_attachment.m) ((Y0) e12.f195041X.i(Uri.parse(str), null).u(new androidx.room.rxjava3.b(e12, 13)).e()).c()) == null) {
            return new File(str).exists();
        }
        return true;
    }

    @Override // com.avito.android.messenger.conversation.mvi.voice.A
    public final void J8(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12, int i12) {
        le().s(new e(localMessage, q12, i12));
    }

    @Override // com.avito.android.messenger.conversation.mvi.voice.A
    public final void Pb(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12) {
        le().s(new d(localMessage, q12));
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f195047d0.e();
        super.onCleared();
    }

    @Override // com.avito.android.messenger.conversation.mvi.voice.A
    public final void z6(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12) {
        le().s(new c(localMessage, q12));
    }
}
