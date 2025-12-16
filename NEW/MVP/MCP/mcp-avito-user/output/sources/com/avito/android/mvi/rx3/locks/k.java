package com.avito.android.mvi.rx3.locks;

import Y41.p;
import Y41.q;
import com.avito.android.C34429s0;
import com.avito.android.util.X2;
import com.avito.android.util.rx3.C35896f0;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.core.C;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.O;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: RxLockImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mvi/rx3/locks/k;", "", "KeyT", "Lcom/avito/android/mvi/rx3/locks/j;", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k<KeyT> implements j<KeyT> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f207060b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mvi.rx3.locks.d<KeyT> f207061c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final q<Long, String, Set<? extends KeyT>, com.avito.android.mvi.rx3.locks.c<KeyT>> f207062d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f207063e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final p<String, String, G0> f207064f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f207065g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f207066h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AtomicLong f207067i;

    /* compiled from: RxLockImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "KeyT", "", "id", "", "name", "", "keys", "Lcom/avito/android/mvi/rx3/locks/c;", "invoke", "(JLjava/lang/String;Ljava/util/Set;)Lcom/avito/android/mvi/rx3/locks/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements q<Long, String, Set<? extends KeyT>, com.avito.android.mvi.rx3.locks.c<KeyT>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f207068l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final Object invoke(Long l12, String str, Object obj) {
            return new com.avito.android.mvi.rx3.locks.c(l12.longValue(), str, (Set) obj);
        }
    }

    /* compiled from: RxLockImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "KeyT", "", "tag", "message", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<String, String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f207069l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, String str2) {
            X2.f318778a.i(str, str2, null);
            return G0.f406611a;
        }
    }

    /* compiled from: Observables.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lio/reactivex/rxjava3/core/B;", "Lj41/e;", "emitter", "Lkotlin/G0;", "subscribe", "(Lio/reactivex/rxjava3/core/B;)V", "com/avito/android/util/rx3/c0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements C {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f207070b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.mvi.rx3.locks.c f207071c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l0.a f207072d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k f207073e;

        public c(Object obj, com.avito.android.mvi.rx3.locks.c cVar, l0.a aVar, k kVar) {
            this.f207070b = obj;
            this.f207071c = cVar;
            this.f207072d = aVar;
            this.f207073e = kVar;
        }

        @Override // io.reactivex.rxjava3.core.C
        public final void f(@Y61.k B<T> b12) {
            if (b12.getF318621e()) {
                return;
            }
            try {
                synchronized (this.f207070b) {
                    try {
                        if (this.f207072d.f406838b) {
                            k kVar = this.f207073e;
                            kVar.a(kVar.f207060b, "Enqueue '" + this.f207071c + "' skipped since it was already finished");
                        } else {
                            k kVar2 = this.f207073e;
                            kVar2.a(kVar2.f207060b, "Enqueue '" + this.f207071c + "' ");
                            this.f207073e.f207061c.r(this.f207071c);
                        }
                        G0 g02 = G0.f406611a;
                    } finally {
                    }
                }
                b12.onNext(this.f207071c);
            } catch (Throwable th2) {
                b12.g(th2);
            }
        }
    }

    /* compiled from: Observables.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T1", "T2", "t2", "t1", "Lkotlin/Q;", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Q;", "com/avito/android/util/rx3/e0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T1, T2, R> f207074b = new d<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            return new Q(obj2, obj);
        }
    }

    /* compiled from: RxLockImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "KeyT", "", "kotlin.jvm.PlatformType", "triggeredOpId", "Lkotlin/G0;", "invoke", "(Ljava/lang/Long;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<Long, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k<KeyT> f207075l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f207076m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(k<KeyT> kVar, String str) {
            super(1);
            this.f207075l = kVar;
            this.f207076m = str;
        }

        @Override // Y41.l
        public final G0 invoke(Long l12) {
            k<KeyT> kVar = this.f207075l;
            kVar.f207064f.invoke(kVar.f207060b, this.f207076m + " listener received trigger=" + l12);
            return G0.f406611a;
        }
    }

    /* compiled from: RxLockImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002^\u0010\u0007\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0001 \u0005*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0001 \u0005*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "T", "KeyT", "Lkotlin/Q;", "Lcom/avito/android/mvi/rx3/locks/c;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Q;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Q<? extends com.avito.android.mvi.rx3.locks.c<KeyT>, ? extends Long>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k<KeyT> f207077l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(k<KeyT> kVar) {
            super(1);
            this.f207077l = kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            Q q12 = (Q) obj;
            com.avito.android.mvi.rx3.locks.c cVar = (com.avito.android.mvi.rx3.locks.c) q12.f406619b;
            Long l12 = (Long) q12.f406620c;
            boolean z12 = l12 != null && cVar.f207039a == l12.longValue();
            Boolean boolValueOf = Boolean.valueOf(z12);
            k<KeyT> kVar = this.f207077l;
            String str = kVar.f207060b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cVar);
            sb2.append(" filter received trigger=");
            sb2.append(l12);
            sb2.append(" => ");
            sb2.append(z12 ? "PASSED" : "didn't pass");
            kVar.a(str, sb2.toString());
            return boolValueOf;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxLockImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00018\u00008\u0000 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\b0\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002^\u0010\u0007\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0001 \u0005*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0001 \u0005*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "T", "KeyT", "Lkotlin/Q;", "Lcom/avito/android/mvi/rx3/locks/c;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "invoke", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> extends N implements Y41.l<Q<? extends com.avito.android.mvi.rx3.locks.c<KeyT>, ? extends Long>, O<? extends T>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k<KeyT> f207078l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ I<T> f207079m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ H f207080n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(k<KeyT> kVar, I<T> i12, H h12) {
            super(1);
            this.f207078l = kVar;
            this.f207079m = i12;
            this.f207080n = h12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final Object invoke(Object obj) {
            com.avito.android.mvi.rx3.locks.c cVar = (com.avito.android.mvi.rx3.locks.c) ((Q) obj).f406619b;
            k<KeyT> kVar = this.f207078l;
            kVar.a(kVar.f207060b, cVar + " triggered");
            return this.f207079m.z(this.f207080n);
        }
    }

    public k() {
        throw null;
    }

    public k(String str, Y41.a aVar, com.avito.android.mvi.rx3.locks.d dVar, q qVar, boolean z12, p pVar, int i12, C42822w c42822w) {
        qVar = (i12 & 8) != 0 ? a.f207068l : qVar;
        z12 = (i12 & 16) != 0 ? false : z12;
        pVar = (i12 & 32) != 0 ? b.f207069l : pVar;
        this.f207060b = str;
        this.f207061c = dVar;
        this.f207062d = qVar;
        this.f207063e = z12;
        this.f207064f = pVar;
        this.f207065g = C42727D.c(new l(aVar));
        this.f207066h = C42727D.c(m.f207114l);
        this.f207067i = new AtomicLong(0L);
    }

    public final void a(String str, String str2) {
        if (this.f207063e) {
            this.f207064f.invoke(str, str2);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f207061c.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f207061c.getF318621e();
    }

    @Override // com.avito.android.mvi.rx3.locks.j
    @Y61.k
    public final <T> I<T> t(@Y61.k I<T> i12, @Y61.k String str, @Y61.k Set<? extends KeyT> set, @Y61.k H h12) {
        com.avito.android.mvi.rx3.locks.c<KeyT> cVarInvoke = this.f207062d.invoke(Long.valueOf(this.f207067i.getAndIncrement()), str, set);
        Object obj = new Object();
        l0.a aVar = new l0.a();
        io.reactivex.rxjava3.internal.operators.observable.C c12 = new io.reactivex.rxjava3.internal.operators.observable.C(new c(obj, cVarInvoke, aVar, this));
        InterfaceC42726C interfaceC42726C = this.f207065g;
        return new C42017o(z.k(C35896f0.c(this.f207061c.C().j0((H) interfaceC42726C.getValue()).x0((H) interfaceC42726C.getValue()), this.f207063e, new e(this, str)), c12.x0((H) interfaceC42726C.getValue()), d.f207074b).x0((H) interfaceC42726C.getValue()).j0((H) this.f207066h.getValue()).N(new AJ.b(11, new f(this))).S().n(new com.avito.android.blueprints.publish.reg_number.d(10, new g(this, i12, h12))), new C34429s0(this, cVarInvoke, obj, aVar, 5));
    }
}
