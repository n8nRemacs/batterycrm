package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.InterfaceC32291u0;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MissingUsersSyncAgent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/v0;", "Lcom/avito/android/messenger/conversation/mvi/sync/u0;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/sync/u0$a;", "a", "b", "c", "d", "e", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.v0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32293v0 extends AbstractC32892c<InterfaceC32291u0.a> implements InterfaceC32291u0 {

    /* renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f194852a0 = 0;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.A f194853V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.B f194854W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.data.f0 f194855X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.w0 f194856Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<c> f194857Z;

    /* compiled from: MissingUsersSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/v0$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/E;", "Lcom/avito/android/messenger/conversation/mvi/sync/u0$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.sync.v0$a */
    public static final class a implements com.avito.android.mvi.rx3.with_monolithic_state.E<InterfaceC32291u0.a> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f194858b = new a();

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.E
        public final boolean a(@Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC32291u0.a> xVar, @Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC32291u0.a> xVar2) {
            return (xVar instanceof d) && (xVar2 instanceof d) && !kotlin.jvm.internal.L.f(((d) xVar).f194862d, ((d) xVar2).f194862d);
        }
    }

    /* compiled from: MissingUsersSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/v0$b;", "", "<init>", "()V", "", "REQUEST_THROTTLE_MS", "J", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.sync.v0$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: MissingUsersSyncAgent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/v0$c;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.sync.v0$c */
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f194859a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f194860b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final List<LocalMessage> f194861c;

        public c(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k List<LocalMessage> list) {
            this.f194859a = messengerUserHashInfo;
            this.f194860b = str;
            this.f194861c = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.L.f(this.f194859a, cVar.f194859a) && kotlin.jvm.internal.L.f(this.f194860b, cVar.f194860b) && kotlin.jvm.internal.L.f(this.f194861c, cVar.f194861c);
        }

        public final int hashCode() {
            return this.f194861c.hashCode() + androidx.compose.foundation.H.d(this.f194859a.hashCode() * 31, 31, this.f194860b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RequestMissingUsers(userInfo=");
            sb2.append(this.f194859a);
            sb2.append(", channelId=");
            sb2.append(this.f194860b);
            sb2.append(", messages=");
            return androidx.compose.foundation.H.p(sb2, this.f194861c, ')');
        }
    }

    /* compiled from: MissingUsersSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/v0$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/sync/u0$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.sync.v0$d */
    public final class d extends C32891b<InterfaceC32291u0.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f194862d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f194863e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Set<String> f194864f;

        public d(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k Set<String> set) {
            StringBuilder sb2 = new StringBuilder();
            androidx.media3.exoplayer.analytics.m.p(sb2, com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]), ", channelId = ", str, ", messages=");
            sb2.append(set);
            super("RequestMissingUsersAction", sb2.toString());
            this.f194862d = messengerUserHashInfo;
            this.f194863e = str;
            this.f194864f = set;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final io.reactivex.rxjava3.core.I b(InterfaceC32291u0.a aVar) {
            V2 v22 = V2.f318762a;
            int i12 = C32293v0.f194852a0;
            C32293v0 c32293v0 = C32293v0.this;
            String str = c32293v0.f207131E;
            StringBuilder sb2 = new StringBuilder("users to check avatars for = ");
            Set<String> set = this.f194864f;
            sb2.append(set);
            v22.c(str, sb2.toString(), null);
            return c32293v0.f194855X.e(this.f194862d, this.f194863e, set).o(new C32297x0(c32293v0, this)).l(new C32299y0(c32293v0)).r().B(kotlin.G0.f406611a);
        }
    }

    /* compiled from: MissingUsersSyncAgent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/v0$e;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.sync.v0$e */
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        public final long f194866a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Set<String> f194867b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Set<String> f194868c;

        public e(long j12, @Y61.k Set<String> set, @Y61.k Set<String> set2) {
            this.f194866a = j12;
            this.f194867b = set;
            this.f194868c = set2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f194866a == eVar.f194866a && kotlin.jvm.internal.L.f(this.f194867b, eVar.f194867b) && kotlin.jvm.internal.L.f(this.f194868c, eVar.f194868c);
        }

        public final int hashCode() {
            return this.f194868c.hashCode() + androidx.media3.exoplayer.analytics.m.g(this.f194867b, Long.hashCode(this.f194866a) * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ThrottleState(timestamp=");
            sb2.append(this.f194866a);
            sb2.append(", alreadyRequestedIds=");
            sb2.append(this.f194867b);
            sb2.append(", idsToRequest=");
            return AK.c.u(sb2, this.f194868c, ')');
        }
    }

    static {
        new b(null);
    }

    public C32293v0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public C32293v0(@Y61.k ru.avito.messenger.A a12, @Y61.k com.avito.android.messenger.B b12, @Y61.k com.avito.android.messenger.channels.mvi.data.f0 f0Var, @Y61.k com.avito.android.messenger.w0 w0Var, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super("MissingUsersSyncAgent", InterfaceC32291u0.a.f194850a, interfaceC35745a5, a.f194858b, new com.avito.android.mvi.rx3.with_monolithic_state.F(interfaceC35745a5.a(), null, 2, 0 == true ? 1 : 0), null, null, null, 224, null);
        this.f194853V = a12;
        this.f194854W = b12;
        this.f194855X = f0Var;
        this.f194856Y = w0Var;
        this.f194857Z = new com.jakewharton.rxrelay3.c<>();
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        cVar.e();
        io.reactivex.rxjava3.core.z<R> zVarY0 = w0Var.g().j0(this.f207133K.a()).y0(new J0(this));
        K0 k02 = new K0(this);
        l41.g<? super Throwable> l02 = new L0<>(this);
        zVarY0.getClass();
        cVar.b(zVarY0.v0(k02, l02, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.messenger.conversation.mvi.sync.InterfaceC32291u0
    public final void C6(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k List<LocalMessage> list) {
        this.f194857Z.accept(new c(messengerUserHashInfo, str, list));
    }
}
