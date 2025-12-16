package ru.avito.messenger.internal.jsonrpc;

import Oq.InterfaceC14725a;
import Y41.l;
import Y61.k;
import com.avito.android.util.InterfaceC35745a5;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.T;
import io.reactivex.rxjava3.internal.operators.single.U;
import io.reactivex.rxjava3.kotlin.w1;
import j91.C42223a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import l41.o;
import m91.InterfaceC43936c;
import ru.avito.messenger.C0;
import ru.avito.messenger.D0;
import ru.avito.messenger.H0;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcCallException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcParsingException;
import ru.avito.messenger.l0;

/* compiled from: HttpJsonRpcClient.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/jsonrpc/c;", "Lcom/avito/android/jsonrpc/client/b;", "Lcom/google/gson/i;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c implements com.avito.android.jsonrpc.client.b<com.google.gson.i> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ru.avito.messenger.internal.jsonrpc.b f431711a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C0 f431712b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f431713c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f431714d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final D0 f431715e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final H0 f431716f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f431717g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinkedHashMap f431718h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC43936c f431719i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f431720j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC14725a f431721k;

    /* compiled from: HttpJsonRpcClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "R", "Lj91/c;", "response", "Lkotlin/G0;", "accept", "(Lj91/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            c.this.f431719i.a("Messenger", "JsonRpc response = " + ((j91.c) obj), null);
        }
    }

    /* compiled from: HttpJsonRpcClient.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "R", "", "error", "Lio/reactivex/rxjava3/core/O;", "Lj91/c;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.jsonrpc.client.e f431723b;

        public b(com.avito.android.jsonrpc.client.e eVar) {
            this.f431723b = eVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            StringBuilder sb2 = new StringBuilder("Failed to execute JsonRpc request ");
            com.avito.android.jsonrpc.client.e eVar = this.f431723b;
            sb2.append(eVar);
            return I.l(new MessengerJsonRpcCallException(-1, sb2.toString(), (Throwable) obj, String.valueOf(eVar.f174730a), null, null, 48, null));
        }
    }

    /* compiled from: HttpJsonRpcClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "R", "Lj91/c;", "response", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lj91/c;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.jsonrpc.c$c, reason: collision with other inner class name */
    public static final class C12409c<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.jsonrpc.client.e f431724b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f431725c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<com.google.gson.i, R> f431726d;

        /* JADX WARN: Multi-variable type inference failed */
        public C12409c(com.avito.android.jsonrpc.client.e eVar, c cVar, l<? super com.google.gson.i, ? extends R> lVar) {
            this.f431724b = eVar;
            this.f431725c = cVar;
            this.f431726d = lVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            j91.c cVar = (j91.c) obj;
            C42223a error = cVar.getError();
            com.avito.android.jsonrpc.client.e eVar = this.f431724b;
            c cVar2 = this.f431725c;
            if (error == null) {
                try {
                    return I.q(this.f431726d.invoke(cVar.getResult()));
                } catch (Throwable th2) {
                    InterfaceC14725a.C0808a.a(cVar2.f431721k, new MessengerJsonRpcParsingException(null, th2, cVar.getRequestId(), cVar.getRpcId(), eVar.f174731b, 1, null), P0.g(new Q("request", eVar), new Q("response", cVar)), 2);
                    return I.l(th2);
                }
            }
            MessengerJsonRpcCallException messengerJsonRpcCallException = new MessengerJsonRpcCallException(cVar.getError().getCode(), cVar.getError().getMessage(), null, cVar.getRequestId(), cVar.getRpcId(), eVar.f174731b, 4, null);
            InterfaceC14725a.C0808a.a(cVar2.f431721k, messengerJsonRpcCallException, P0.g(new Q("request", eVar), new Q("response", cVar)), 2);
            if (cVar.getError().getCode() == -32077) {
                cVar2.f431716f.a();
            }
            return I.l(messengerJsonRpcCallException);
        }
    }

    public c(@k ru.avito.messenger.internal.jsonrpc.b bVar, @k C0 c02, @k String str, boolean z12, @k D0 d02, @k H0 h02, @k String str2, @k LinkedHashMap linkedHashMap, @k InterfaceC43936c interfaceC43936c, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC14725a interfaceC14725a) {
        this.f431711a = bVar;
        this.f431712b = c02;
        this.f431713c = str;
        this.f431714d = z12;
        this.f431715e = d02;
        this.f431716f = h02;
        this.f431717g = str2;
        this.f431718h = linkedHashMap;
        this.f431719i = interfaceC43936c;
        this.f431720j = interfaceC35745a5;
        this.f431721k = interfaceC14725a;
    }

    public static final Map b(c cVar, LinkedHashMap linkedHashMap, l0 l0Var) {
        cVar.getClass();
        Map mapL = com.avito.android.authorization.auto_recovery.phone_confirm.b.l("my_hash_id", l0Var.getF431824b(), P0.l(linkedHashMap, new Q("id_version", "v2")));
        if (l0Var instanceof l0.b) {
            return mapL;
        }
        if (l0Var instanceof l0.d) {
            l0.d dVar = (l0.d) l0Var;
            return P0.k(mapL, P0.g(new Q("employee_id", dVar.f431821d), new Q("private_company_session_id", dVar.f431820c)));
        }
        if (l0Var instanceof l0.e) {
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.l(HiAnalyticsConstant.BI_KEY_APP_ID, "pro_employee", mapL);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.jsonrpc.client.b
    @k
    public final <R> I<R> a(@k com.avito.android.jsonrpc.client.e eVar, @k l<? super com.google.gson.i, ? extends R> lVar) {
        j91.b bVar = new j91.b(eVar.f174730a, eVar.f174731b, eVar.f174732c);
        w1 w1Var = w1.f404856a;
        U uD2 = this.f431712b.d();
        z<l0> zVarA = this.f431715e.a();
        l0.f431814O2.getClass();
        T tP2 = zVarA.P(l0.a.f431816b);
        w1Var.getClass();
        return w1.a(uD2, tP2).n(new d(this, bVar)).k(new a()).t(new b(eVar)).n(new C12409c(eVar, this, lVar));
    }
}
