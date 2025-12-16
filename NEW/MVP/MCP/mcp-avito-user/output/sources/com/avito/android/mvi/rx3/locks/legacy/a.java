package com.avito.android.mvi.rx3.locks.legacy;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.mvi.rx3.locks.h;
import com.avito.android.mvi.rx3.locks.j;
import com.avito.android.util.X2;
import com.avito.android.util.rx3.C35896f0;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.core.C;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.O;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LegacyRxLockImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mvi/rx3/locks/legacy/a;", "", "KeyT", "Lcom/avito/android/mvi/rx3/locks/j;", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a<KeyT> implements j<KeyT> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f207082b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h<KeyT> f207083c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f207084d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final p<String, String, G0> f207085e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final p<String, String, G0> f207086f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinkedList<com.avito.android.mvi.rx3.locks.c<KeyT>> f207087g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinkedList<Set<KeyT>> f207088h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final HashSet f207089i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.util.rx3.concurrent.a f207090j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC42726C f207091k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final InterfaceC42726C f207092l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final AtomicLong f207093m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.d<Long> f207094n;

    /* compiled from: LegacyRxLockImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "KeyT", "", "tag", "message", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mvi.rx3.locks.legacy.a$a, reason: collision with other inner class name */
    public static final class C6175a extends N implements p<String, String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6175a f207095l = new C6175a();

        public C6175a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, String str2) {
            X2.f318778a.i(str, str2, null);
            return G0.f406611a;
        }
    }

    /* compiled from: LegacyRxLockImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "KeyT", "", "tag", "message", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<String, String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f207096l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, String str2) {
            X2.f318778a.c(str, str2, null);
            return G0.f406611a;
        }
    }

    /* compiled from: Observables.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lio/reactivex/rxjava3/core/B;", "Lj41/e;", "emitter", "Lkotlin/G0;", "subscribe", "(Lio/reactivex/rxjava3/core/B;)V", "com/avito/android/util/rx3/c0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements C {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f207098c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Set f207099d;

        public c(String str, Set set) {
            this.f207098c = str;
            this.f207099d = set;
        }

        @Override // io.reactivex.rxjava3.core.C
        public final void f(@k B<T> b12) {
            a aVar = a.this;
            if (b12.getF318621e()) {
                return;
            }
            try {
                com.avito.android.mvi.rx3.locks.c cVar = new com.avito.android.mvi.rx3.locks.c(aVar.f207093m.getAndIncrement(), this.f207098c, this.f207099d);
                if (aVar.f207084d) {
                    aVar.f207085e.invoke(aVar.f207082b, "Enqueue '" + cVar + "' ");
                }
                aVar.f207090j.execute(new com.avito.android.mvi.rx3.locks.legacy.b(aVar, cVar));
                b12.onNext(cVar);
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
        public static final d<T1, T2, R> f207100b = new d<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            return new Q(obj2, obj);
        }
    }

    /* compiled from: LegacyRxLockImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "KeyT", "", "kotlin.jvm.PlatformType", "triggeredOpId", "Lkotlin/G0;", "invoke", "(Ljava/lang/Long;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<Long, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a<KeyT> f207101l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f207102m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a<KeyT> aVar, String str) {
            super(1);
            this.f207101l = aVar;
            this.f207102m = str;
        }

        @Override // Y41.l
        public final G0 invoke(Long l12) {
            a<KeyT> aVar = this.f207101l;
            aVar.f207085e.invoke(aVar.f207082b, this.f207102m + " listener received trigger=" + l12);
            return G0.f406611a;
        }
    }

    /* compiled from: LegacyRxLockImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002^\u0010\u0007\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0001 \u0005*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0001 \u0005*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "T", "KeyT", "Lkotlin/Q;", "Lcom/avito/android/mvi/rx3/locks/c;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Q;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements l<Q<? extends com.avito.android.mvi.rx3.locks.c<KeyT>, ? extends Long>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a<KeyT> f207103l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a<KeyT> aVar) {
            super(1);
            this.f207103l = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            Q q12 = (Q) obj;
            com.avito.android.mvi.rx3.locks.c cVar = (com.avito.android.mvi.rx3.locks.c) q12.f406619b;
            Long l12 = (Long) q12.f406620c;
            boolean z12 = l12 != null && cVar.f207039a == l12.longValue();
            Boolean boolValueOf = Boolean.valueOf(z12);
            a<KeyT> aVar = this.f207103l;
            if (aVar.f207084d) {
                String str = aVar.f207082b;
                p<String, String, G0> pVar = aVar.f207085e;
                if (z12) {
                    pVar.invoke(str, cVar + " filter received trigger=" + l12 + " => PASSED");
                } else {
                    pVar.invoke(str, cVar + " filter received trigger=" + l12 + " => didn't pass");
                }
            }
            return boolValueOf;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LegacyRxLockImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00018\u00008\u0000 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\b0\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002^\u0010\u0007\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0001 \u0005*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0001 \u0005*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "T", "KeyT", "Lkotlin/Q;", "Lcom/avito/android/mvi/rx3/locks/c;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "invoke", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> extends N implements l<Q<? extends com.avito.android.mvi.rx3.locks.c<KeyT>, ? extends Long>, O<? extends T>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a<KeyT> f207104l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ I<T> f207105m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ H f207106n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a<KeyT> aVar, I<T> i12, H h12) {
            super(1);
            this.f207104l = aVar;
            this.f207105m = i12;
            this.f207106n = h12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final Object invoke(Object obj) {
            com.avito.android.mvi.rx3.locks.c cVar = (com.avito.android.mvi.rx3.locks.c) ((Q) obj).f406619b;
            a<KeyT> aVar = this.f207104l;
            if (aVar.f207084d) {
                aVar.f207085e.invoke(aVar.f207082b, cVar + " triggered");
            }
            return new C42017o(this.f207105m, new GL.a(15, aVar, cVar)).z(this.f207106n);
        }
    }

    public a() {
        throw null;
    }

    public a(String str, Y41.a aVar, h hVar, boolean z12, p pVar, p pVar2, int i12, C42822w c42822w) {
        z12 = (i12 & 8) != 0 ? false : z12;
        pVar = (i12 & 16) != 0 ? C6175a.f207095l : pVar;
        pVar2 = (i12 & 32) != 0 ? b.f207096l : pVar2;
        this.f207082b = str;
        this.f207083c = hVar;
        this.f207084d = z12;
        this.f207085e = pVar;
        this.f207086f = pVar2;
        this.f207087g = new LinkedList<>();
        this.f207088h = new LinkedList<>();
        this.f207089i = new HashSet();
        this.f207090j = new com.avito.android.util.rx3.concurrent.a(new hu.akarnokd.rxjava3.schedulers.c((H) aVar.invoke()));
        this.f207091k = C42727D.c(new com.avito.android.mvi.rx3.locks.legacy.c(aVar));
        this.f207092l = C42727D.c(com.avito.android.mvi.rx3.locks.legacy.f.f207113l);
        this.f207093m = new AtomicLong(0L);
        this.f207094n = C31685o.m();
    }

    public final boolean a(@k Set<? extends KeyT> set, @k Set<? extends KeyT> set2) {
        for (KeyT keyt : set) {
            Iterator<? extends KeyT> it = set2.iterator();
            while (it.hasNext()) {
                if (this.f207083c.a(keyt, it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f207090j.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f207090j.f319018b.getF318621e();
    }

    @Override // com.avito.android.mvi.rx3.locks.j
    @k
    public final <T> I<T> t(@k I<T> i12, @k String str, @k Set<? extends KeyT> set, @k H h12) {
        io.reactivex.rxjava3.internal.operators.observable.C c12 = new io.reactivex.rxjava3.internal.operators.observable.C(new c(str, set));
        InterfaceC42726C interfaceC42726C = this.f207091k;
        return z.k(C35896f0.c(this.f207094n.j0((H) interfaceC42726C.getValue()).x0((H) interfaceC42726C.getValue()), this.f207084d, new e(this, str)), c12.x0((H) interfaceC42726C.getValue()), d.f207100b).x0((H) interfaceC42726C.getValue()).j0((H) this.f207092l.getValue()).N(new AJ.b(12, new f(this))).S().n(new com.avito.android.blueprints.publish.reg_number.d(11, new g(this, i12, h12)));
    }
}
