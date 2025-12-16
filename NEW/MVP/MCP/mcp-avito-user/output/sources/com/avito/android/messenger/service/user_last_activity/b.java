package com.avito.android.messenger.service.user_last_activity;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.C30277e1;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.messenger.channels.mvi.data.f0;
import com.avito.android.messenger.channels.mvi.sync.z0;
import com.avito.android.messenger.service.user_last_activity.b.g;
import com.avito.android.messenger.w0;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.mvi.rx3.with_monolithic_state.E;
import com.avito.android.mvi.rx3.with_monolithic_state.u;
import com.avito.android.mvi.rx3.with_monolithic_state.x;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.M0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import p41.AbstractC46895b;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: UserLastActivitySyncAgent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/messenger/service/user_last_activity/b;", "Lcom/avito/android/messenger/service/user_last_activity/a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/service/user_last_activity/b$e;", "a", "b", "c", "d", "e", "f", "g", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends AbstractC32892c<e> implements com.avito.android.messenger.service.user_last_activity.a {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final w0 f197303V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f197304W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final f0 f197305X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f197306Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f197307Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final z0 f197308a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f197309b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f197310c0;

    /* compiled from: UserLastActivitySyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/service/user_last_activity/b$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/E;", "Lcom/avito/android/messenger/service/user_last_activity/b$e;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements E<e> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f197311b = new a();

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.E
        public final boolean a(@Y61.k x<e> xVar, @Y61.k x<e> xVar2) {
            if (xVar instanceof d) {
                if (xVar2 instanceof d) {
                    return L.f(((d) xVar).f197314d, ((d) xVar2).f197314d);
                }
                return false;
            }
            if ((xVar instanceof g) && (xVar2 instanceof g)) {
                return L.f(((g) xVar).f197320d, ((g) xVar2).f197320d);
            }
            return false;
        }
    }

    /* compiled from: UserLastActivitySyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/service/user_last_activity/b$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/u$b;", "Lcom/avito/android/messenger/service/user_last_activity/b$e;", "", "Lcom/avito/android/messenger/service/user_last_activity/RequestId;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.service.user_last_activity.b$b, reason: collision with other inner class name */
    public static final class C5810b implements u.b<e, String> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C5810b f197312a = new C5810b();

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.u.b
        public final String a(x xVar) {
            if (xVar instanceof d) {
                return ((d) xVar).f197314d;
            }
            return null;
        }
    }

    /* compiled from: UserLastActivitySyncAgent.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/service/user_last_activity/b$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/service/user_last_activity/b$e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends C32891b<e> {
        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final I b(e eVar) {
            Set setKeySet = eVar.f197317a.keySet();
            b bVar = b.this;
            f0 f0Var = bVar.f197305X;
            z<List<String>> zVarD = f0Var.d(com.avito.android.server_time.i.a(bVar.f197306Y) - 135, setKeySet);
            hu.akarnokd.rxjava3.schedulers.c cVar = bVar.f207140R;
            return zVarD.j0(cVar).S().u(new com.avito.android.messenger.service.user_last_activity.e(bVar, setKeySet)).n(new p(bVar)).o(new q(f0Var)).q(cVar).B(G0.f406611a).z(cVar);
        }
    }

    /* compiled from: UserLastActivitySyncAgent.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/service/user_last_activity/b$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/service/user_last_activity/b$e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends com.avito.android.mvi.rx3.with_monolithic_state.p<e> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f197314d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Set<String> f197315e;

        public d(@Y61.k String str, @Y61.k Set<String> set) {
            super("RequestMutator", "requestId=" + str + ", userIds=" + set);
            this.f197314d = str;
            this.f197315e = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final I<e> b(e eVar) {
            G0 g02;
            G0 g03;
            e eVar2 = eVar;
            ?? r12 = eVar2.f197318b;
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) r12);
            Set<String> set = this.f197315e;
            boolean zIsEmpty = set.isEmpty();
            String str = this.f197314d;
            if (zIsEmpty) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, set);
            }
            ?? r122 = eVar2.f197317a;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) r122);
            Set set2 = (Set) r12.get(str);
            if (set2 == null) {
                for (String str2 : set) {
                    Set set3 = (Set) linkedHashMap2.get(str2);
                    if (set3 != null) {
                        linkedHashMap2.put(str2, b1.i(set3, str));
                        g03 = G0.f406611a;
                    } else {
                        g03 = null;
                    }
                    if (g03 == null) {
                        linkedHashMap2.put(str2, b1.c(str));
                    }
                }
            } else {
                for (String str3 : b1.f(set2, set)) {
                    Set set4 = (Set) linkedHashMap2.get(str3);
                    if (set4 != null) {
                        if (set4.size() > 1) {
                            linkedHashMap2.put(str3, b1.e(set4, str));
                        } else {
                            linkedHashMap2.remove(str3);
                        }
                    }
                }
                for (String str4 : b1.f(set, set2)) {
                    Set set5 = (Set) linkedHashMap2.get(str4);
                    if (set5 != null) {
                        linkedHashMap2.put(str4, b1.i(set5, str));
                        g02 = G0.f406611a;
                    } else {
                        g02 = null;
                    }
                    if (g02 == null) {
                        linkedHashMap2.put(str4, b1.c(str));
                    }
                }
            }
            boolean zIsEmpty2 = linkedHashMap.isEmpty();
            b bVar = b.this;
            if (zIsEmpty2) {
                bVar.f197309b0.e();
                return I.q((e) bVar.f207132J);
            }
            if (r122.isEmpty() && bVar.f197309b0.g() == 0) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                InterfaceC35745a5 interfaceC35745a5 = bVar.f207133K;
                bVar.f197309b0.b(z.a0(15L, 15L, timeUnit, interfaceC35745a5.c()).j0(interfaceC35745a5.a()).t0(new com.avito.android.messenger.service.user_last_activity.c(bVar)));
            }
            Set setKeySet = linkedHashMap2.keySet();
            f0 f0Var = bVar.f197305X;
            z<List<String>> zVarD = f0Var.d(com.avito.android.server_time.i.a(bVar.f197306Y) - 135, setKeySet);
            hu.akarnokd.rxjava3.schedulers.c cVar = bVar.f207140R;
            return zVarD.j0(cVar).S().u(new com.avito.android.messenger.service.user_last_activity.e(bVar, setKeySet)).n(new p(bVar)).o(new q(f0Var)).q(cVar).B(new e(linkedHashMap2, linkedHashMap)).z(cVar);
        }
    }

    /* compiled from: UserLastActivitySyncAgent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/service/user_last_activity/b$e;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Object f197317a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Object f197318b;

        public e(@Y61.k Map<String, ? extends Set<String>> map, @Y61.k Map<String, ? extends Set<String>> map2) {
            this.f197317a = map;
            this.f197318b = map2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f197317a.equals(eVar.f197317a) && this.f197318b.equals(eVar.f197318b);
        }

        public final int hashCode() {
            return this.f197318b.hashCode() + (this.f197317a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(requestIdsByUserId=");
            sb2.append(this.f197317a);
            sb2.append(", userIdsByRequestId=");
            return H.n(sb2, this.f197318b, ')');
        }
    }

    /* compiled from: UserLastActivitySyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/service/user_last_activity/b$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/u$c;", "Lcom/avito/android/messenger/service/user_last_activity/b$e;", "", "Lcom/avito/android/messenger/service/user_last_activity/RequestId;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements u.c<e, String> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final io.reactivex.rxjava3.core.H f197319a;

        public f(@Y61.k io.reactivex.rxjava3.core.H h12) {
            this.f197319a = h12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.u.c
        public final z a(Object obj, AbstractC46895b abstractC46895b) {
            return ((String) obj) == null ? abstractC46895b : abstractC46895b.D0(5000L, TimeUnit.MILLISECONDS, this.f197319a);
        }
    }

    /* compiled from: UserLastActivitySyncAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/service/user_last_activity/b$g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/service/user_last_activity/b$e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class g extends C32891b<e> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f197320d;

        /* renamed from: e, reason: collision with root package name */
        public final long f197321e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Long f197322f;

        public g(@Y61.k String str, long j12, @Y61.l Long l12) {
            super("ChatTypingAction", "typingUserId = " + str + ", timestampInSeconds = " + j12);
            this.f197320d = str;
            this.f197321e = j12;
            this.f197322f = l12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final I b(e eVar) {
            b bVar = b.this;
            return bVar.f197305X.c(Long.valueOf(this.f197321e), 0L, this.f197320d).g(bVar.f197308a0.f(this.f197322f)).B(G0.f406611a);
        }
    }

    public b() {
        throw null;
    }

    @Inject
    public b(@Y61.k w0 w0Var, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k f0 f0Var, @Y61.k com.avito.android.server_time.h hVar, @Y61.k C30277e1 c30277e1, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k z0 z0Var) {
        super("UserLastActivitySyncAgent", new e(P0.c(), P0.c()), interfaceC35745a5, a.f197311b, new u(interfaceC35745a5.a(), C5810b.f197312a, new f(interfaceC35745a5.c())), null, null, null, 224, null);
        this.f197303V = w0Var;
        this.f197304W = interfaceC47842z;
        this.f197305X = f0Var;
        this.f197306Y = hVar;
        this.f197307Z = c30277e1;
        this.f197308a0 = z0Var;
        this.f197309b0 = new io.reactivex.rxjava3.disposables.c();
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f197310c0 = cVar;
        cVar.e();
        hu.akarnokd.rxjava3.schedulers.c cVar2 = new hu.akarnokd.rxjava3.schedulers.c(this.f207133K.a());
        cVar.b(io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar2, 0)));
        M0 m02 = new M0(com.avito.android.util.rx3.arrow.b.a(w0Var.e().d0(o.f197337b).x0(cVar2).j0(cVar2)));
        cVar.b(m02.y0(new m(this)).j0(cVar2).Z(new j()).T(new k(), Integer.MAX_VALUE).x0(cVar2).t0(new l41.g() { // from class: com.avito.android.messenger.service.user_last_activity.n
            @Override // l41.g
            public final void accept(Object obj) {
                X81.i iVar = (X81.i) obj;
                b bVar = this.f197336b;
                bVar.le().s(bVar.new g(iVar.getFromId(), com.avito.android.server_time.i.a(bVar.f197306Y), iVar.getInitActionTimestamp()));
            }
        }));
        cVar.b(m02.N0());
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f197309b0.e();
        this.f197310c0.e();
        super.onCleared();
    }

    @Override // com.avito.android.messenger.service.user_last_activity.a
    public final void u8(@Y61.k String str, @Y61.k Set<String> set) {
        le().s(new d(str, set));
    }
}
