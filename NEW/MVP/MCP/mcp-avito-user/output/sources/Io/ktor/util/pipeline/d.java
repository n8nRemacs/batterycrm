package io.ktor.util.pipeline;

import io.ktor.util.C41592e;
import io.ktor.util.InterfaceC41588c;
import io.ktor.util.pipeline.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;

/* compiled from: Pipeline.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Lio/ktor/util/pipeline/d;", "", "TSubject", "TContext", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class d<TSubject, TContext> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f400524b;

    /* renamed from: c, reason: collision with root package name */
    public int f400525c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f400526d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public k f400527e;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41588c f400523a = C41592e.a();

    @Y61.k
    private volatile /* synthetic */ Object _interceptors = null;

    public d(@Y61.k k... kVarArr) {
        this.f400524b = C42745f0.e0(Arrays.copyOf(kVarArr, kVarArr.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.Object r13, @Y61.k java.lang.Object r14, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r12 = this;
            kotlin.coroutines.CoroutineContext r0 = r15.getF410748d()
            java.lang.Object r1 = r12._interceptors
            java.util.List r1 = (java.util.List) r1
            r2 = 1
            if (r1 != 0) goto L94
            int r1 = r12.f400525c
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L1b
            kotlin.collections.z0 r1 = kotlin.collections.C42784z0.f406748b
            r12._interceptors = r1
            r12.f400526d = r4
            r12.f400527e = r3
            goto L94
        L1b:
            java.util.ArrayList r5 = r12.f400524b
            if (r1 != r2) goto L4f
            int r1 = kotlin.collections.C42745f0.J(r5)
            if (r1 < 0) goto L4f
            r6 = r4
        L26:
            java.lang.Object r7 = r5.get(r6)
            boolean r8 = r7 instanceof io.ktor.util.pipeline.c
            if (r8 == 0) goto L31
            io.ktor.util.pipeline.c r7 = (io.ktor.util.pipeline.c) r7
            goto L32
        L31:
            r7 = r3
        L32:
            if (r7 != 0) goto L35
            goto L4a
        L35:
            java.util.List<Y41.q<io.ktor.util.pipeline.e<TSubject, Call>, TSubject, kotlin.coroutines.Continuation<? super kotlin.G0>, java.lang.Object>> r8 = r7.f400521c
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L4a
            java.util.List<Y41.q<io.ktor.util.pipeline.e<TSubject, Call>, TSubject, kotlin.coroutines.Continuation<? super kotlin.G0>, java.lang.Object>> r1 = r7.f400521c
            r7.f400522d = r2
            r12._interceptors = r1
            r12.f400526d = r4
            io.ktor.util.pipeline.k r1 = r7.f400519a
            r12.f400527e = r1
            goto L94
        L4a:
            if (r6 == r1) goto L4f
            int r6 = r6 + 1
            goto L26
        L4f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r6 = kotlin.collections.C42745f0.J(r5)
            if (r6 < 0) goto L8e
            r7 = r4
        L5b:
            java.lang.Object r8 = r5.get(r7)
            boolean r9 = r8 instanceof io.ktor.util.pipeline.c
            if (r9 == 0) goto L66
            io.ktor.util.pipeline.c r8 = (io.ktor.util.pipeline.c) r8
            goto L67
        L66:
            r8 = r3
        L67:
            if (r8 != 0) goto L6a
            goto L89
        L6a:
            java.util.List<Y41.q<io.ktor.util.pipeline.e<TSubject, Call>, TSubject, kotlin.coroutines.Continuation<? super kotlin.G0>, java.lang.Object>> r8 = r8.f400521c
            int r9 = r1.size()
            int r10 = r8.size()
            int r10 = r10 + r9
            r1.ensureCapacity(r10)
            int r9 = r8.size()
            r10 = r4
        L7d:
            if (r10 >= r9) goto L89
            java.lang.Object r11 = r8.get(r10)
            r1.add(r11)
            int r10 = r10 + 1
            goto L7d
        L89:
            if (r7 == r6) goto L8e
            int r7 = r7 + 1
            goto L5b
        L8e:
            r12._interceptors = r1
            r12.f400526d = r4
            r12.f400527e = r3
        L94:
            r12.f400526d = r2
            java.lang.Object r1 = r12._interceptors
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r12.getF399798f()
            boolean r3 = io.ktor.util.pipeline.g.f400529a
            if (r3 != 0) goto Lab
            if (r2 == 0) goto La5
            goto Lab
        La5:
            io.ktor.util.pipeline.q r0 = new io.ktor.util.pipeline.q
            r0.<init>(r14, r13, r1)
            goto Lb1
        Lab:
            io.ktor.util.pipeline.a r2 = new io.ktor.util.pipeline.a
            r2.<init>(r13, r1, r14, r0)
            r0 = r2
        Lb1:
            java.lang.Object r13 = r0.b(r14, r15)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.d.a(java.lang.Object, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final c<TSubject, TContext> b(k kVar) {
        ArrayList arrayList = this.f400524b;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = arrayList.get(i12);
            if (obj == kVar) {
                c<TSubject, TContext> cVar = new c<>(kVar, l.c.f400533a);
                arrayList.set(i12, cVar);
                return cVar;
            }
            if (obj instanceof c) {
                c<TSubject, TContext> cVar2 = (c) obj;
                if (cVar2.f400519a == kVar) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    public final int c(k kVar) {
        ArrayList arrayList = this.f400524b;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = arrayList.get(i12);
            if (obj == kVar || ((obj instanceof c) && ((c) obj).f400519a == kVar)) {
                return i12;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public boolean getF399798f() {
        return false;
    }

    public final boolean e(k kVar) {
        ArrayList arrayList = this.f400524b;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = arrayList.get(i12);
            if (obj == kVar) {
                return true;
            }
            if ((obj instanceof c) && ((c) obj).f400519a == kVar) {
                return true;
            }
        }
        return false;
    }

    public final void f(@Y61.k k kVar, @Y61.k k kVar2) throws b {
        l lVar;
        k kVar3;
        if (e(kVar2)) {
            return;
        }
        int iC2 = c(kVar);
        if (iC2 == -1) {
            throw new b("Phase " + kVar + " was not registered for this pipeline");
        }
        int i12 = iC2 + 1;
        ArrayList arrayList = this.f400524b;
        int iJ2 = C42745f0.J(arrayList);
        if (i12 <= iJ2) {
            while (true) {
                Object obj = arrayList.get(i12);
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null && (lVar = cVar.f400520b) != null) {
                    l.a aVar = lVar instanceof l.a ? (l.a) lVar : null;
                    if (aVar != null && (kVar3 = aVar.f400532a) != null && kVar3.equals(kVar)) {
                        iC2 = i12;
                    }
                    if (i12 == iJ2) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    break;
                }
            }
        }
        arrayList.add(iC2 + 1, new c(kVar2, new l.a(kVar)));
    }

    public final void g(@Y61.k k kVar, @Y61.k Y41.q<? super e<TSubject, TContext>, ? super TSubject, ? super Continuation<? super G0>, ? extends Object> qVar) {
        c<TSubject, TContext> cVarB = b(kVar);
        if (cVarB == null) {
            throw new b("Phase " + kVar + " was not registered for this pipeline");
        }
        v0.e(3, qVar);
        List list = (List) this._interceptors;
        if (!this.f400524b.isEmpty() && list != null && !this.f400526d && v0.g(list)) {
            if (L.f(this.f400527e, kVar)) {
                list.add(qVar);
            } else if (L.f(kVar, C42745f0.Q(this.f400524b)) || c(kVar) == C42745f0.J(this.f400524b)) {
                c<TSubject, TContext> cVarB2 = b(kVar);
                if (cVarB2.f400522d) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(cVarB2.f400521c);
                    cVarB2.f400521c = arrayList;
                    cVarB2.f400522d = false;
                }
                cVarB2.f400521c.add(qVar);
                list.add(qVar);
            }
            this.f400525c++;
            return;
        }
        if (cVarB.f400522d) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(cVarB.f400521c);
            cVarB.f400521c = arrayList2;
            cVarB.f400522d = false;
        }
        cVarB.f400521c.add(qVar);
        this.f400525c++;
        this._interceptors = null;
        this.f400526d = false;
        this.f400527e = null;
    }
}
