package com.avito.android.mvi.rx3.with_monolithic_state;

import androidx.view.M0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.X2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BaseMviEntityWithMonolithicState.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "", "StateT", "LS20/a;", "Landroidx/lifecycle/M0;", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mvi.rx3.with_monolithic_state.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC32892c<StateT> extends M0 implements S20.a<StateT> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f207131E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final StateT f207132J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f207133K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final E<StateT> f207134L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f207135M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f207136N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f207137O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<StateT> f207138P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<StateT> f207139Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final hu.akarnokd.rxjava3.schedulers.c f207140R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f207141S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f207142T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<String, AtomicLong> f207143U;

    /* compiled from: BaseMviEntityWithMonolithicState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "StateT", "", "message", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mvi.rx3.with_monolithic_state.c$a */
    public static final class a extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f207144l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f207144l = str;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            X2.f318778a.i(this.f207144l, str, null);
            return G0.f406611a;
        }
    }

    /* compiled from: BaseMviEntityWithMonolithicState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "StateT", "", "message", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mvi.rx3.with_monolithic_state.c$b */
    public static final class b extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f207145l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f207145l = str;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            X2.f318778a.c(this.f207145l, str, null);
            return G0.f406611a;
        }
    }

    /* compiled from: BaseMviEntityWithMonolithicState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "StateT", "", "message", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mvi.rx3.with_monolithic_state.c$c, reason: collision with other inner class name */
    public static final class C6177c extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f207146l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6177c(String str) {
            super(1);
            this.f207146l = str;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            X2.f318778a.g(this.f207146l, str);
            return G0.f406611a;
        }
    }

    public AbstractC32892c() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC32892c(String str, Object obj, InterfaceC35745a5 interfaceC35745a5, E e12, t tVar, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, int i12, C42822w c42822w) {
        if ((i12 & 8) != 0) {
            int i13 = E.f207117a;
            e12 = new D();
        }
        tVar = (i12 & 16) != 0 ? new F(interfaceC35745a5.a(), null, 2, 0 == true ? 1 : 0) : tVar;
        lVar = (i12 & 32) != 0 ? new a(str) : lVar;
        lVar2 = (i12 & 64) != 0 ? new b(str) : lVar2;
        lVar3 = (i12 & 128) != 0 ? new C6177c(str) : lVar3;
        this.f207131E = str;
        this.f207132J = obj;
        this.f207133K = interfaceC35745a5;
        this.f207134L = e12;
        this.f207135M = lVar;
        this.f207136N = lVar2;
        this.f207137O = lVar3;
        com.jakewharton.rxrelay3.d<StateT> dVar = (com.jakewharton.rxrelay3.d<StateT>) com.jakewharton.rxrelay3.b.N0(obj).M0();
        this.f207138P = dVar;
        this.f207139Q = dVar;
        this.f207140R = new hu.akarnokd.rxjava3.schedulers.c(interfaceC35745a5.a());
        this.f207141S = C42727D.c(new m(this, tVar));
        this.f207143U = new ConcurrentHashMap<>();
    }

    @Override // S20.a
    @Y61.k
    public final io.reactivex.rxjava3.core.z<StateT> M0() {
        return this.f207139Q;
    }

    public final long ke(@Y61.k String str) {
        AtomicLong atomicLongPutIfAbsent;
        ConcurrentHashMap<String, AtomicLong> concurrentHashMap = this.f207143U;
        AtomicLong atomicLong = concurrentHashMap.get(str);
        if (atomicLong == null && (atomicLongPutIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicLong = new AtomicLong(0L)))) != null) {
            atomicLong = atomicLongPutIfAbsent;
        }
        return atomicLong.getAndIncrement();
    }

    @Override // S20.a
    @Y61.k
    public final StateT l9() {
        return (StateT) this.f207138P.P(this.f207132J).e();
    }

    @Y61.k
    public final t<StateT> le() {
        return (t) this.f207141S.getValue();
    }

    @Override // androidx.view.M0
    public void onCleared() {
        le().dispose();
        io.reactivex.rxjava3.internal.observers.y yVar = this.f207142T;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f207142T = null;
        this.f207140R.g();
    }
}
