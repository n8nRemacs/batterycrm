package com.avito.android.mvi.rx3.locks;

import Y41.p;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.util.X2;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: OperationQueue.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mvi/rx3/locks/e;", "", "KeyT", "Lcom/avito/android/mvi/rx3/locks/d;", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e<KeyT> implements com.avito.android.mvi.rx3.locks.d<KeyT> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f207042b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h<KeyT> f207043c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f207044d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final p<String, String, G0> f207045e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final p<String, String, G0> f207046f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<Long> f207047g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final z<Long> f207048h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinkedList<com.avito.android.mvi.rx3.locks.c<KeyT>> f207049i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LinkedList<com.avito.android.mvi.rx3.locks.c<KeyT>> f207050j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final HashSet f207051k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.rx3.concurrent.a f207052l;

    /* compiled from: OperationQueue.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "KeyT", "", "tag", "message", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<String, String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f207053l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, String str2) {
            X2.f318778a.i(str, str2, null);
            return G0.f406611a;
        }
    }

    /* compiled from: OperationQueue.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "KeyT", "", "tag", "message", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<String, String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f207054l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, String str2) {
            X2.f318778a.c(str, str2, null);
            return G0.f406611a;
        }
    }

    /* compiled from: RxExecutor.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/rx3/concurrent/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.mvi.rx3.locks.c f207056c;

        public c(com.avito.android.mvi.rx3.locks.c cVar) {
            this.f207056c = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            boolean z12 = eVar.f207044d;
            com.avito.android.mvi.rx3.locks.c<KeyT> cVar = this.f207056c;
            if (z12) {
                eVar.f207045e.invoke(eVar.f207042b, "addOperation(" + cVar + ')');
            }
            eVar.f207049i.add(cVar);
            eVar.f207052l.execute(new f(eVar));
        }
    }

    /* compiled from: RxExecutor.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/rx3/concurrent/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.mvi.rx3.locks.c f207058c;

        public d(com.avito.android.mvi.rx3.locks.c cVar) {
            this.f207058c = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            p<String, String, G0> pVar = eVar.f207046f;
            StringBuilder sb2 = new StringBuilder("finishOperation(");
            com.avito.android.mvi.rx3.locks.c cVar = this.f207058c;
            sb2.append(cVar);
            sb2.append(')');
            pVar.invoke(eVar.f207042b, sb2.toString());
            eVar.f207051k.remove(cVar);
            eVar.f207050j.remove(cVar);
            eVar.f207049i.remove(cVar);
            eVar.f207052l.execute(new f(eVar));
        }
    }

    public e() {
        throw null;
    }

    public e(String str, Y41.a aVar, h hVar, boolean z12, p pVar, p pVar2, int i12, C42822w c42822w) {
        pVar = (i12 & 16) != 0 ? a.f207053l : pVar;
        pVar2 = (i12 & 32) != 0 ? b.f207054l : pVar2;
        this.f207042b = str;
        this.f207043c = hVar;
        this.f207044d = z12;
        this.f207045e = pVar;
        this.f207046f = pVar2;
        com.jakewharton.rxrelay3.d<Long> dVarM = C31685o.m();
        this.f207047g = dVarM;
        this.f207048h = dVarM;
        this.f207049i = new LinkedList<>();
        this.f207050j = new LinkedList<>();
        this.f207051k = new HashSet();
        this.f207052l = new com.avito.android.util.rx3.concurrent.a(new hu.akarnokd.rxjava3.schedulers.c((H) aVar.invoke()));
    }

    public static final Set a(e eVar) {
        HashSet hashSet = eVar.f207051k;
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C42745f0.h(((com.avito.android.mvi.rx3.locks.c) it.next()).f207041c, arrayList);
        }
        return C42745f0.P0(arrayList);
    }

    @Override // com.avito.android.mvi.rx3.locks.d
    @Y61.k
    public final z<Long> C() {
        return this.f207048h;
    }

    @Override // com.avito.android.mvi.rx3.locks.d
    public final void R(@Y61.k com.avito.android.mvi.rx3.locks.c<KeyT> cVar) {
        this.f207052l.execute(new d(cVar));
    }

    public final boolean b(@Y61.k Set<? extends KeyT> set, @Y61.k Set<? extends KeyT> set2) {
        for (KeyT keyt : set) {
            Iterator<? extends KeyT> it = set2.iterator();
            while (it.hasNext()) {
                if (this.f207043c.a(keyt, it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f207052l.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f207052l.f319018b.getF318621e();
    }

    @Override // com.avito.android.mvi.rx3.locks.d
    public final void r(@Y61.k com.avito.android.mvi.rx3.locks.c<KeyT> cVar) {
        this.f207052l.execute(new c(cVar));
    }
}
