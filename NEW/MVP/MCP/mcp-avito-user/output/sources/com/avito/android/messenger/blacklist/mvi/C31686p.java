package com.avito.android.messenger.blacklist.mvi;

import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.messenger.blacklist.mvi.F;
import com.avito.android.messenger.blacklist.mvi.InterfaceC31683m;
import com.avito.android.messenger.w0;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.InterfaceC43543a;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.api.entity.BlockedUser;

/* compiled from: BlacklistInteractor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\b\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/p;", "Lcom/avito/android/messenger/blacklist/mvi/m;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "a", "b", "c", "d", "e", "f", "g", "h", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.blacklist.mvi.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31686p extends AbstractC32892c<InterfaceC31683m.a> implements InterfaceC31683m {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final w0 f186483V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f186484W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<Throwable> f186485X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f186486Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f186487Z;

    /* compiled from: BlacklistInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/p$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/E;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.blacklist.mvi.p$a */
    public static final class a implements com.avito.android.mvi.rx3.with_monolithic_state.E<InterfaceC31683m.a> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f186488b = new a();

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.E
        public final boolean a(@Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a> xVar, @Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a> xVar2) {
            if (xVar instanceof b.a) {
                return true;
            }
            if (xVar instanceof g.a) {
                if (xVar2 instanceof g.a ? true : xVar2 instanceof f ? true : xVar2 instanceof c.b ? true : xVar2 instanceof c.a ? true : xVar2 instanceof e) {
                    return true;
                }
            } else if (xVar instanceof c.b) {
                if (xVar2 instanceof c.b) {
                    return true;
                }
            } else if (xVar instanceof h.a) {
                if (xVar2 instanceof h.a) {
                    return kotlin.jvm.internal.L.f(((h.a) xVar).f186511d, ((h.a) xVar2).f186511d);
                }
            } else if (xVar instanceof e) {
                if (xVar2 instanceof e) {
                    return kotlin.jvm.internal.L.f(((e) xVar).f186501d, ((e) xVar2).f186501d);
                }
                if (xVar2 instanceof h.a) {
                    return kotlin.jvm.internal.L.f(((e) xVar).f186501d, ((h.a) xVar2).f186511d);
                }
            }
            return false;
        }
    }

    /* compiled from: BlacklistInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/p$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/n;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.blacklist.mvi.p$b */
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.n<InterfaceC31683m.a> {

        /* renamed from: d, reason: collision with root package name */
        public final long f186489d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>>> f186490e;

        /* compiled from: BlacklistInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/p$b$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.blacklist.mvi.p$b$a */
        public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC31683m.a> {
            public a() {
                throw null;
            }
        }

        /* compiled from: BlacklistInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger.blacklist.mvi.p$b$b, reason: collision with other inner class name */
        public static final class C5472b extends kotlin.jvm.internal.N implements Y41.a<List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>>> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ C31686p f186492m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5472b(C31686p c31686p) {
                super(0);
                this.f186492m = c31686p;
            }

            @Override // Y41.a
            public final List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>> invoke() {
                StringBuilder sb2 = new StringBuilder();
                b bVar = b.this;
                String strS = AK.c.s(sb2, bVar.f207165a, ".SetInProgressMutator");
                C31687q c31687q = new C31687q(bVar);
                String str = bVar.f207166b;
                return C42745f0.U(new a(c31687q, strS, str), this.f186492m.new f(bVar.f207165a, str));
            }
        }

        public b(C31686p c31686p, long j12) {
            super("InitialDataRequestComposite", C21030p.a(j12, "id = "), null, 4, null);
            this.f186489d = j12;
            this.f186490e = new C5472b(c31686p);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.n
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>>> b() {
            return this.f186490e;
        }
    }

    /* compiled from: BlacklistInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/p$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/n;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.blacklist.mvi.p$c */
    public final class c extends com.avito.android.mvi.rx3.with_monolithic_state.n<InterfaceC31683m.a> {

        /* renamed from: d, reason: collision with root package name */
        public final long f186493d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>>> f186494e;

        /* compiled from: BlacklistInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/p$c$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.blacklist.mvi.p$c$a */
        public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.p<InterfaceC31683m.a> {
            public a() {
                super(AK.c.s(new StringBuilder(), c.this.f207165a, ".SetInProgressMutator"), c.this.f207166b);
            }

            @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
            public final io.reactivex.rxjava3.core.I<InterfaceC31683m.a> b(InterfaceC31683m.a aVar) {
                InterfaceC31683m.a aVar2 = aVar;
                InterfaceC31683m.a.b bVar = aVar2.f186473c;
                boolean z12 = bVar instanceof InterfaceC31683m.a.b.c;
                c cVar = c.this;
                if (z12 && ((InterfaceC31683m.a.b.c) bVar).f186479a == cVar.f186493d) {
                    C31686p c31686p = C31686p.this;
                    return c31686p.f186484W.getBlacklist(aVar2.f186474d.size(), 10).r(new s(aVar2)).u(new r(c31686p, aVar2));
                }
                V2 v22 = V2.f318762a;
                String str = C31686p.this.f207131E;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[" + Thread.currentThread().getName() + ']');
                sb2.append(' ');
                sb2.append(this);
                sb2.append(": oldState.nextPageLoadingState = ");
                sb2.append(bVar);
                sb2.append(" => do nothing");
                v22.i(str, sb2.toString(), null);
                return io.reactivex.rxjava3.core.I.q(aVar2);
            }
        }

        /* compiled from: BlacklistInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/p$c$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.blacklist.mvi.p$c$b */
        public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC31683m.a> {
            public b() {
                super(AK.c.s(new StringBuilder(), c.this.f207165a, ".SetInProgressMutator"), c.this.f207166b);
            }

            @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
            public final InterfaceC31683m.a d(InterfaceC31683m.a aVar) {
                InterfaceC31683m.a aVar2 = aVar;
                return (!aVar2.f186475e || !(aVar2.f186471a instanceof InterfaceC31683m.a.b.C5471b) || (aVar2.f186472b instanceof InterfaceC31683m.a.b.c) || (aVar2.f186473c instanceof InterfaceC31683m.a.b.c)) ? aVar2 : InterfaceC31683m.a.a(aVar2, null, null, new InterfaceC31683m.a.b.c(c.this.f186493d), null, false, null, 59);
            }
        }

        /* compiled from: BlacklistInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger.blacklist.mvi.p$c$c, reason: collision with other inner class name */
        public static final class C5473c extends kotlin.jvm.internal.N implements Y41.a<List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>>> {
            public C5473c() {
                super(0);
            }

            @Override // Y41.a
            public final List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>> invoke() {
                c cVar = c.this;
                return C42745f0.U(cVar.new b(), cVar.new a());
            }
        }

        public c(long j12) {
            super("NextPageRequest", C21030p.a(j12, "id = "), null, 4, null);
            this.f186493d = j12;
            this.f186494e = new C5473c();
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.n
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>>> b() {
            return this.f186494e;
        }
    }

    /* compiled from: BlacklistInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/p$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.blacklist.mvi.p$d */
    public final class d extends C32890a<InterfaceC31683m.a> {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f186499d;

        public d(boolean z12) {
            super("OnReconnectAction", com.avito.android.bxcontent.mvi.entity.f.l("notificationQueueWasRestored = ", z12));
            this.f186499d = z12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(InterfaceC31683m.a aVar) {
            InterfaceC31683m.a aVar2 = aVar;
            boolean z12 = aVar2.f186471a instanceof InterfaceC31683m.a.b.C5471b;
            C31686p c31686p = C31686p.this;
            if (!z12) {
                c31686p.N1();
                return;
            }
            if (!(aVar2.f186472b instanceof InterfaceC31683m.a.b.C5471b) || !this.f186499d) {
                c31686p.p0();
            } else if (aVar2.f186473c instanceof InterfaceC31683m.a.b.C5470a) {
                c31686p.J();
            }
        }
    }

    /* compiled from: BlacklistInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/p$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.blacklist.mvi.p$e */
    public final class e extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC31683m.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f186501d;

        public e(@Y61.k String str) {
            super("OnRemovedFromBlacklistMutator", "userId = ".concat(str));
            this.f186501d = str;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final InterfaceC31683m.a d(InterfaceC31683m.a aVar) {
            InterfaceC31683m.a aVar2 = aVar;
            List<BlockedUser> list = aVar2.f186474d;
            Iterator<BlockedUser> it = list.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (kotlin.jvm.internal.L.f(it.next().getUser().getId(), this.f186501d)) {
                    break;
                }
                i12++;
            }
            if (i12 < 0) {
                return aVar2;
            }
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(i12);
            G0 g02 = G0.f406611a;
            return InterfaceC31683m.a.a(aVar2, null, null, null, arrayList, false, null, 55);
        }
    }

    /* compiled from: BlacklistInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/p$g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/n;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.blacklist.mvi.p$g */
    public final class g extends com.avito.android.mvi.rx3.with_monolithic_state.n<InterfaceC31683m.a> {

        /* renamed from: d, reason: collision with root package name */
        public final long f186503d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>>> f186504e;

        /* compiled from: BlacklistInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/p$g$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.blacklist.mvi.p$g$a */
        public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC31683m.a> {
            public a() {
                throw null;
            }
        }

        /* compiled from: BlacklistInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger.blacklist.mvi.p$g$b */
        public static final class b extends kotlin.jvm.internal.N implements Y41.a<List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>>> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ C31686p f186506m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C31686p c31686p) {
                super(0);
                this.f186506m = c31686p;
            }

            @Override // Y41.a
            public final List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>> invoke() {
                StringBuilder sb2 = new StringBuilder();
                g gVar = g.this;
                String strS = AK.c.s(sb2, gVar.f207165a, ".SetInProgressMutator");
                u uVar = new u(gVar);
                String str = gVar.f207166b;
                return C42745f0.U(new a(uVar, strS, str), this.f186506m.new f(gVar.f207165a, str));
            }
        }

        public g(C31686p c31686p, long j12) {
            super("RefreshComposite", C21030p.a(j12, "id = "), null, 4, null);
            this.f186503d = j12;
            this.f186504e = new b(c31686p);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.n
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>>> b() {
            return this.f186504e;
        }
    }

    /* compiled from: BlacklistInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/p$h;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/n;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.blacklist.mvi.p$h */
    public final class h extends com.avito.android.mvi.rx3.with_monolithic_state.n<InterfaceC31683m.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f186507d;

        /* renamed from: e, reason: collision with root package name */
        public final long f186508e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>>> f186509f;

        /* compiled from: BlacklistInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/p$h$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.blacklist.mvi.p$h$a */
        public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC31683m.a> {

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f186511d;

            public a() {
                super(AK.c.s(new StringBuilder(), h.this.f207165a, ".SetInProgressMutator"), h.this.f207166b);
                this.f186511d = h.this.f186507d;
            }

            @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
            public final InterfaceC31683m.a d(InterfaceC31683m.a aVar) {
                InterfaceC31683m.a aVar2 = aVar;
                Map<String, Long> map = aVar2.f186476f;
                Set<String> setKeySet = map.keySet();
                String str = this.f186511d;
                return !setKeySet.contains(str) ? InterfaceC31683m.a.a(aVar2, null, null, null, null, false, P0.l(map, new kotlin.Q(str, Long.valueOf(h.this.f186508e))), 31) : aVar2;
            }
        }

        /* compiled from: BlacklistInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/p$h$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.blacklist.mvi.p$h$b */
        public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.p<InterfaceC31683m.a> {
            public b() {
                super(AK.c.s(new StringBuilder(), h.this.f207165a, ".UnblockUserMutator"), h.this.f207166b);
            }

            @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
            public final io.reactivex.rxjava3.core.I<InterfaceC31683m.a> b(InterfaceC31683m.a aVar) {
                InterfaceC31683m.a aVar2 = aVar;
                h hVar = h.this;
                Long l12 = aVar2.f186476f.get(hVar.f186507d);
                if (l12 == null || l12.longValue() != hVar.f186508e) {
                    return io.reactivex.rxjava3.core.I.q(aVar2);
                }
                C31686p c31686p = C31686p.this;
                return c31686p.f186484W.s(hVar.f186507d).r(new x(aVar2, hVar)).u(new v(c31686p, aVar2, hVar, 0));
            }
        }

        /* compiled from: BlacklistInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger.blacklist.mvi.p$h$c */
        public static final class c extends kotlin.jvm.internal.N implements Y41.a<List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>>> {
            public c() {
                super(0);
            }

            @Override // Y41.a
            public final List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>> invoke() {
                h hVar = h.this;
                return C42745f0.U(hVar.new a(), hVar.new b());
            }
        }

        public h(@Y61.k String str, long j12) {
            super("UnblockUserComposite", "userId = " + str + ", id = " + j12, null, 4, null);
            this.f186507d = str;
            this.f186508e = j12;
            this.f186509f = new c();
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.n
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31683m.a>>> b() {
            return this.f186509f;
        }
    }

    public C31686p() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public C31686p(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k w0 w0Var, @Y61.k InterfaceC47842z interfaceC47842z) {
        com.avito.android.mvi.rx3.with_monolithic_state.F f12 = new com.avito.android.mvi.rx3.with_monolithic_state.F(interfaceC35745a5.a(), null, 2, 0 == true ? 1 : 0);
        InterfaceC31683m.a.f186469g.getClass();
        super("BlacklistInteractor", InterfaceC31683m.a.f186470h, interfaceC35745a5, a.f186488b, f12, null, null, null, 224, null);
        this.f186483V = w0Var;
        this.f186484W = interfaceC47842z;
        this.f186485X = C31685o.m();
        this.f186486Y = new io.reactivex.rxjava3.disposables.c();
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f186487Z = cVar;
        hu.akarnokd.rxjava3.schedulers.c cVar2 = new hu.akarnokd.rxjava3.schedulers.c(this.f207133K.a());
        cVar.b(io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar2, 0)));
        I0 i0J0 = interfaceC47842z.A().x0(cVar2).j0(cVar2);
        A a12 = new A(this);
        F.a aVar = new F.a(new y(this, "client.allReconnects()"));
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        cVar.b(i0J0.v0(a12, aVar, interfaceC43543a));
        cVar.b(com.avito.android.util.rx3.arrow.b.a(w0Var.g().j0(cVar2).d0(C.f186347b)).D(io.reactivex.rxjava3.internal.functions.a.f401991a).v0(new D(this), new F.a(new y(this, "userIdInteractor.currentUserIdToken")), interfaceC43543a));
    }

    @Override // com.avito.android.messenger.blacklist.mvi.InterfaceC31683m
    public final void J() {
        le().s(new c(ke("NextPageRequestComposite")));
    }

    @Override // com.avito.android.messenger.blacklist.mvi.InterfaceC31683m
    public final void N1() {
        le().s(new b(this, ke("InitialDataRequestComposite")));
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f186487Z.e();
        super.onCleared();
    }

    @Override // com.avito.android.messenger.blacklist.mvi.InterfaceC31683m
    public final void p0() {
        le().s(new g(this, ke("RefreshComposite")));
    }

    @Override // com.avito.android.messenger.blacklist.mvi.InterfaceC31683m
    public final void sc(@Y61.k String str) {
        le().s(new h(str, ke("UnblockUserComposite")));
    }

    /* compiled from: BlacklistInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/p$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.blacklist.mvi.p$f */
    public final class f extends com.avito.android.mvi.rx3.with_monolithic_state.p<InterfaceC31683m.a> {
        /* JADX WARN: Illegal instructions before constructor call */
        public f(@Y61.l String str, @Y61.l String str2) {
            String strConcat;
            String strF = "";
            String strConcat2 = ((str == null || (strConcat = str.concat(".")) == null) ? "" : strConcat).concat("PerformRefreshMutator");
            if (str2 != null && !C43066x.K(str2)) {
                strF = androidx.camera.camera2.internal.G.f("parentParams = ", str2);
            }
            super(strConcat2, strF);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<InterfaceC31683m.a> b(InterfaceC31683m.a aVar) {
            InterfaceC31683m.a aVar2 = aVar;
            C31686p c31686p = C31686p.this;
            int iG2 = c31686p.f186486Y.g();
            InterfaceC47842z interfaceC47842z = c31686p.f186484W;
            if (iG2 == 0) {
                InterfaceC35745a5 interfaceC35745a5 = c31686p.f207133K;
                hu.akarnokd.rxjava3.schedulers.c cVar = new hu.akarnokd.rxjava3.schedulers.c(interfaceC35745a5.a());
                io.reactivex.rxjava3.disposables.d dVarQ = io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar, 0));
                io.reactivex.rxjava3.disposables.c cVar2 = c31686p.f186486Y;
                cVar2.b(dVarQ);
                C41982q1 c41982q1X0 = interfaceC47842z.C(X81.a.class).y(500L, TimeUnit.MILLISECONDS, interfaceC35745a5.c()).j0(cVar).x0(cVar);
                z zVar = new z(c31686p);
                F.a aVar3 = new F.a(new y(c31686p, "BlacklistInfo"));
                InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
                cVar2.b(c41982q1X0.v0(zVar, aVar3, interfaceC43543a));
                cVar2.b(interfaceC47842z.C(X81.b.class).j0(cVar).x0(cVar).v0(new B(c31686p), new F.a(new y(c31686p, "BlacklistRemoveEvent")), interfaceC43543a));
                c31686p.f186487Z.b(cVar2);
            }
            int size = aVar2.f186474d.size();
            if (size < 10) {
                size = 10;
            }
            return interfaceC47842z.getBlacklist(0, Integer.valueOf(size)).r(new t(aVar2, size)).u(new r(aVar2, c31686p));
        }

        public /* synthetic */ f(C31686p c31686p, String str, String str2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
        }
    }
}
