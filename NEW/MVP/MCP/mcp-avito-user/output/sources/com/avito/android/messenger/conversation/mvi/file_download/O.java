package com.avito.android.messenger.conversation.mvi.file_download;

import com.avito.android.messenger.conversation.mvi.file_download.N;
import com.avito.android.messenger.di.InterfaceC32438g0;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.mvi.rx3.with_monolithic_state.u;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.util.InterfaceC35745a5;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import p41.AbstractC46895b;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileMessageClickInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/O;", "Lcom/avito/android/messenger/conversation/mvi/file_download/N;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/file_download/N$b;", "a", "b", "c", "d", "e", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class O extends AbstractC32892c<N.b> implements N {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final String f190851V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f190852W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_attachment.n f190853X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32038b f190854Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f f190855Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.u f190856a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f190857b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f190858c0;

    /* compiled from: FileMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/O$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/E;", "Lcom/avito/android/messenger/conversation/mvi/file_download/N$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.mvi.rx3.with_monolithic_state.E<N.b> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f190859b = new a();

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.E
        public final boolean a(@Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<N.b> xVar, @Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<N.b> xVar2) {
            b bVar = b.f190860a;
            return kotlin.jvm.internal.L.f(bVar.a(xVar), bVar.a(xVar2));
        }
    }

    /* compiled from: FileMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/O$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/u$b;", "Lcom/avito/android/messenger/conversation/mvi/file_download/N$b;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements u.b<N.b, String> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f190860a = new b();

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.u.b
        @Y61.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String a(@Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<N.b> xVar) {
            if (xVar instanceof c) {
                return "OnBubbleClickAction(localMessageId = " + ((c) xVar).f190861d.getLocalId() + ')';
            }
            if (!(xVar instanceof d)) {
                return null;
            }
            return "OnCancelClickAction(localMessageId = " + ((d) xVar).f190865d.getLocalId() + ')';
        }
    }

    /* compiled from: FileMessageClickInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/O$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/file_download/N$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends C32891b<N.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f190861d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Q1 f190862e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Integer f190863f;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12, @Y61.l Integer num) {
            super(null, "message = " + localMessage + ", metaInfo = " + q12 + ", chunkIndex = " + num, 1, 0 == true ? 1 : 0);
            this.f190861d = localMessage;
            this.f190862e = q12;
            this.f190863f = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final io.reactivex.rxjava3.core.I b(com.avito.android.messenger.conversation.mvi.file_download.N.b r18) {
            /*
                Method dump skipped, instructions count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.file_download.O.c.b(java.lang.Object):io.reactivex.rxjava3.core.I");
        }
    }

    /* compiled from: FileMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/O$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/file_download/N$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends C32891b<N.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f190865d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Q1 f190866e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Integer f190867f;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12, @Y61.l Integer num) {
            super(null, "message = " + localMessage, 1, 0 == true ? 1 : 0);
            this.f190865d = localMessage;
            this.f190866e = q12;
            this.f190867f = num;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final io.reactivex.rxjava3.core.I b(N.b bVar) {
            LocalMessage localMessage = this.f190865d;
            String remoteId = localMessage.getRemoteId();
            O o12 = O.this;
            if (remoteId == null || C43066x.K(remoteId)) {
                return o12.f190855Z.a(o12.f190851V, localMessage.getLocalId(), com.avito.android.messenger.util.i.c(localMessage)).i(new S(o12, this)).v(Boolean.FALSE);
            }
            InterfaceC32038b interfaceC32038b = o12.f190854Y;
            MessengerUserHashInfo messengerUserHashInfoC = com.avito.android.messenger.util.i.c(localMessage);
            String localId = localMessage.getLocalId();
            Q1 q12 = this.f190866e;
            return interfaceC32038b.c(messengerUserHashInfoC, o12.f190851V, localId, q12 != null ? q12.f215303v : null, this.f190867f).l(new T(o12, this)).r().B(G0.f406611a);
        }
    }

    /* compiled from: FileMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/O$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/u$c;", "Lcom/avito/android/messenger/conversation/mvi/file_download/N$b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements u.c<N.b, String> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final io.reactivex.rxjava3.core.H f190869a;

        public e(@Y61.k io.reactivex.rxjava3.core.H h12) {
            this.f190869a = h12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.u.c
        public final io.reactivex.rxjava3.core.z a(Object obj, AbstractC46895b abstractC46895b) {
            return ((String) obj) == null ? abstractC46895b : abstractC46895b.D0(1500L, TimeUnit.MILLISECONDS, this.f190869a);
        }
    }

    public O() {
        throw null;
    }

    @Inject
    public O(@InterfaceC32438g0 @Y61.k String str, @Y61.k com.avito.android.server_time.f fVar, @Y61.k com.avito.android.messenger.conversation.mvi.file_attachment.n nVar, @Y61.k InterfaceC32038b interfaceC32038b, @Y61.k com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f fVar2, @Y61.k com.avito.android.permissions.u uVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super("FileMessageClickInteractor", N.b.f190850a, interfaceC35745a5, a.f190859b, new com.avito.android.mvi.rx3.with_monolithic_state.u(interfaceC35745a5.a(), b.f190860a, new e(interfaceC35745a5.a())), null, null, null, 224, null);
        this.f190851V = str;
        this.f190852W = fVar;
        this.f190853X = nVar;
        this.f190854Y = interfaceC32038b;
        this.f190855Z = fVar2;
        this.f190856a0 = uVar;
        this.f190857b0 = new com.jakewharton.rxrelay3.c();
        this.f190858c0 = new com.jakewharton.rxrelay3.c();
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_download.N
    public final void B7(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12, @Y61.l Integer num) {
        le().s(new d(localMessage, q12, num));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_download.N
    /* renamed from: L5, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF190857b0() {
        return this.f190857b0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_download.N
    /* renamed from: M9, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF190858c0() {
        return this.f190858c0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_download.N
    public final void w6(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12, @Y61.l Integer num) {
        le().s(new c(localMessage, q12, num));
    }
}
