package com.avito.android.advertising.loaders.beduin;

import com.avito.android.advertising.loaders.beduin.H;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: CommercialLoadedAdHolder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/I;", "Lcom/avito/android/advertising/loaders/beduin/H;", "<init>", "()V", "a", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class I implements H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<String, a> f88088a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ConcurrentLinkedQueue<String> f88089b = new ConcurrentLinkedQueue<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z1<H.c> f88090c = p2.a(H.c.a.f88084a);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Z1<H.b> f88091d = p2.a(H.b.C2607b.f88082a);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<String, Z1<H.c>> f88092e = new ConcurrentHashMap<>();

    /* compiled from: CommercialLoadedAdHolder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/I$a;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f88093a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final H.c f88094b;

        public a(@Y61.k String str, @Y61.k H.c cVar) {
            this.f88093a = str;
            this.f88094b = cVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f88093a, aVar.f88093a) && kotlin.jvm.internal.L.f(this.f88094b, aVar.f88094b);
        }

        public final int hashCode() {
            return this.f88094b.hashCode() + (this.f88093a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "Value(bannerCode=" + this.f88093a + ", waterfallState=" + this.f88094b + ')';
        }
    }

    /* compiled from: CommercialLoadedAdHolder.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advertising/loaders/beduin/H$c;", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/advertising/loaders/beduin/H$c;)Z"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advertising.loaders.beduin.CommercialLoadedAdHolderImpl$observe$2", f = "CommercialLoadedAdHolder.kt", i = {0}, l = {100}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super H.c>, H.c, Continuation<? super Boolean>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f88095q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f88096r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ H.c f88097s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super H.c> interfaceC43172j, H.c cVar, Continuation<? super Boolean> continuation) {
            b bVar = new b(3, continuation);
            bVar.f88096r = interfaceC43172j;
            bVar.f88097s = cVar;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            H.c cVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f88095q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f88096r;
                H.c cVar2 = this.f88097s;
                this.f88096r = cVar2;
                this.f88095q = 1;
                if (interfaceC43172j.emit(cVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cVar = cVar2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (H.c) this.f88096r;
                C42729a0.b(obj);
            }
            return Boxing.boxBoolean(cVar instanceof H.c.d);
        }
    }

    @Inject
    public I() {
    }

    @Override // com.avito.android.advertising.loaders.beduin.H
    @Y61.k
    public final InterfaceC43160i<H.c> a(@Y61.k String str) {
        H.c cVar;
        ConcurrentHashMap<String, Z1<H.c>> concurrentHashMap = this.f88092e;
        Z1<H.c> z1A = concurrentHashMap.get(str);
        if (z1A == null) {
            Iterator<Map.Entry<String, a>> it = this.f88088a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                Map.Entry<String, a> next = it.next();
                cVar = next.getValue().f88093a.equals(str) ? next.getValue().f88094b : null;
                if (cVar != null) {
                    break;
                }
            }
            if (cVar == null) {
                cVar = H.c.d.f88087a;
            }
            z1A = p2.a(cVar);
            Z1<H.c> z1PutIfAbsent = concurrentHashMap.putIfAbsent(str, z1A);
            if (z1PutIfAbsent != null) {
                z1A = z1PutIfAbsent;
            }
        }
        return C43175k.Z(z1A, new b(3, null));
    }

    @Override // com.avito.android.advertising.loaders.beduin.H
    public final void b(boolean z12) {
        ConcurrentHashMap<String, Z1<H.c>> concurrentHashMap = this.f88092e;
        Iterator<Map.Entry<String, Z1<H.c>>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Z1<H.c> value = it.next().getValue();
            while (!value.N3(value.getValue(), H.c.a.f88084a)) {
            }
        }
        concurrentHashMap.clear();
        ConcurrentHashMap<String, a> concurrentHashMap2 = this.f88088a;
        if (z12) {
            concurrentHashMap2.clear();
            return;
        }
        Set setP0 = C42745f0.P0(this.f88089b);
        Iterator<Map.Entry<String, a>> it2 = concurrentHashMap2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, a> next = it2.next();
            String key = next.getKey();
            next.getValue();
            if (!setP0.contains(key)) {
                it2.remove();
            }
        }
    }

    @Override // com.avito.android.advertising.loaders.beduin.H
    @Y61.k
    public final InterfaceC43160i<H.c> c() {
        return this.f88090c;
    }

    @Override // com.avito.android.advertising.loaders.beduin.H
    public final void d(@Y61.k H.b bVar) {
        Z1<H.b> z12 = this.f88091d;
        while (!z12.N3(z12.getValue(), bVar)) {
        }
    }

    @Override // com.avito.android.advertising.loaders.beduin.H
    @Y61.k
    public final InterfaceC43160i<H.b> e() {
        return this.f88091d;
    }

    @Override // com.avito.android.advertising.loaders.beduin.H
    public final void f(@Y61.k String str, @Y61.k String str2, @Y61.k H.c cVar, boolean z12) {
        this.f88088a.put(str, new a(str2, cVar));
        Z1<H.c> z13 = this.f88092e.get(str2);
        if (z13 != null) {
            while (!z13.N3(z13.getValue(), cVar)) {
            }
        }
        if (z12) {
            ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.f88089b;
            if (concurrentLinkedQueue.size() >= 10) {
                concurrentLinkedQueue.poll();
            }
            concurrentLinkedQueue.add(str);
        }
        Z1<H.c> z14 = this.f88090c;
        while (!z14.N3(z14.getValue(), cVar)) {
        }
    }

    @Override // com.avito.android.advertising.loaders.beduin.H
    @Y61.l
    public final H.c get(@Y61.k String str) {
        a aVar = this.f88088a.get(str);
        if (aVar != null) {
            return aVar.f88094b;
        }
        return null;
    }
}
