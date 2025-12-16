package kotlinx.coroutines.selects;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.X;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.InterfaceC43268o0;
import kotlinx.coroutines.InterfaceC43269p;
import kotlinx.coroutines.InterfaceC43271q;
import kotlinx.coroutines.internal.a0;

/* compiled from: Select.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\bR\u0011\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/selects/o;", "R", "Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/selects/s;", "Lkotlinx/atomicfu/AtomicRef;", "", VoiceInfo.STATE, "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes8.dex */
public class o<R> implements InterfaceC43269p, e<R>, s<R> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f412214g = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "state$volatile");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f412215b;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Object f412217d;
    private volatile /* synthetic */ Object state$volatile = t.f412237b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public ArrayList f412216c = new ArrayList(2);

    /* renamed from: e, reason: collision with root package name */
    public int f412218e = -1;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Object f412219f = t.f412240e;

    /* compiled from: Select.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/selects/o$a;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final Object f412220a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Y41.q<Object, r<?>, Object, G0> f412221b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.q<Object, Object, Object, Object> f412222c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final a0 f412223d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final InterfaceC43072x f412224e;

        /* renamed from: f, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final Y41.q<r<?>, Object, Object, Y41.l<Throwable, G0>> f412225f;

        /* renamed from: g, reason: collision with root package name */
        @X41.f
        @Y61.l
        public Object f412226g;

        /* renamed from: h, reason: collision with root package name */
        @X41.f
        public int f412227h = -1;

        public a(@Y61.k Object obj, @Y61.k Y41.q qVar, @Y61.k Y41.q qVar2, @Y61.l a0 a0Var, @Y61.k InterfaceC43072x interfaceC43072x, @Y61.l Y41.q qVar3) {
            this.f412220a = obj;
            this.f412221b = qVar;
            this.f412222c = qVar2;
            this.f412223d = a0Var;
            this.f412224e = interfaceC43072x;
            this.f412225f = qVar3;
        }

        public final void a() {
            Object obj = this.f412226g;
            if (obj instanceof kotlinx.coroutines.internal.X) {
                ((kotlinx.coroutines.internal.X) obj).h(this.f412227h, o.this.f412215b);
                return;
            }
            InterfaceC43268o0 interfaceC43268o0 = obj instanceof InterfaceC43268o0 ? (InterfaceC43268o0) obj : null;
            if (interfaceC43268o0 != null) {
                interfaceC43268o0.dispose();
            }
        }
    }

    public o(@Y61.k CoroutineContext coroutineContext) {
        this.f412215b = coroutineContext;
    }

    @Override // kotlinx.coroutines.InterfaceC43269p
    public final void a(@Y61.l Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f412214g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == t.f412238c) {
                return;
            }
            a0 a0Var = t.f412239d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f412216c;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
            this.f412219f = t.f412240e;
            this.f412216c = null;
            return;
        }
    }

    @Override // kotlinx.coroutines.selects.r
    public final void b(@Y61.k InterfaceC43268o0 interfaceC43268o0) {
        this.f412217d = interfaceC43268o0;
    }

    @Override // kotlinx.coroutines.H1
    public final void c(@Y61.k kotlinx.coroutines.internal.X<?> x12, int i12) {
        this.f412217d = x12;
        this.f412218e = i12;
    }

    @Override // kotlinx.coroutines.selects.r
    public final void d(@Y61.l Object obj) {
        this.f412219f = obj;
    }

    @Override // kotlinx.coroutines.selects.r
    public final boolean e(@Y61.k Object obj, @Y61.l Object obj2) {
        return m(obj, obj2) == 0;
    }

    public final Object f(ContinuationImpl continuationImpl) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f412214g;
        a aVar = (a) atomicReferenceFieldUpdater.get(this);
        Object obj = this.f412219f;
        ArrayList arrayList = this.f412216c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2 != aVar) {
                    aVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, t.f412238c);
            this.f412219f = t.f412240e;
            this.f412216c = null;
        }
        Object objInvoke = aVar.f412222c.invoke(aVar.f412220a, aVar.f412223d, obj);
        a0 a0Var = t.f412241f;
        InterfaceC43072x interfaceC43072x = aVar.f412224e;
        return aVar.f412223d == a0Var ? ((Y41.l) interfaceC43072x).invoke(continuationImpl) : ((Y41.p) interfaceC43072x).invoke(objInvoke, continuationImpl);
    }

    @Y61.l
    @X
    public Object g(@Y61.k Continuation<? super R> continuation) {
        return f412214g.get(this) instanceof a ? f((ContinuationImpl) continuation) : h((ContinuationImpl) continuation);
    }

    @Override // kotlinx.coroutines.selects.r
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final CoroutineContext getF412215b() {
        return this.f412215b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.o.h(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final o<R>.a i(Object obj) {
        ArrayList arrayList = this.f412216c;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f412220a == obj) {
                obj2 = next;
                break;
            }
        }
        o<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public <Q> void j(@Y61.k j<? extends Q> jVar, @Y61.k Y41.p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar) {
        k(new a(jVar.getF412202a(), jVar.b(), jVar.d(), null, pVar, jVar.a()), false);
    }

    @X41.i
    public final void k(@Y61.k o<R>.a aVar, boolean z12) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f412214g;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        Object obj = aVar.f412220a;
        if (!z12 && ((arrayList = this.f412216c) == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).f412220a == obj) {
                    throw new IllegalStateException(androidx.camera.view.k.a(obj, "Cannot use select clauses on the same object: ").toString());
                }
            }
        }
        aVar.f412221b.invoke(obj, this, aVar.f412223d);
        if (this.f412219f != t.f412240e) {
            atomicReferenceFieldUpdater.set(this, aVar);
            return;
        }
        if (!z12) {
            this.f412216c.add(aVar);
        }
        aVar.f412226g = this.f412217d;
        aVar.f412227h = this.f412218e;
        this.f412217d = null;
        this.f412218e = -1;
    }

    @Y61.k
    public final TrySelectDetailedResult l(@Y61.k Object obj, @Y61.l G0 g02) {
        int iM2 = m(obj, g02);
        Y41.q<Object, Object, Object, Object> qVar = t.f412236a;
        if (iM2 == 0) {
            return TrySelectDetailedResult.f412192b;
        }
        if (iM2 == 1) {
            return TrySelectDetailedResult.f412193c;
        }
        if (iM2 == 2) {
            return TrySelectDetailedResult.f412194d;
        }
        if (iM2 == 3) {
            return TrySelectDetailedResult.f412195e;
        }
        throw new IllegalStateException(("Unexpected internal result: " + iM2).toString());
    }

    public final int m(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f412214g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            boolean z12 = false;
            if (obj3 instanceof InterfaceC43271q) {
                o<R>.a aVarI = i(obj);
                if (aVarI != null) {
                    Y41.q<r<?>, Object, Object, Y41.l<Throwable, G0>> qVar = aVarI.f412225f;
                    Y41.l<Throwable, G0> lVarInvoke = qVar != null ? qVar.invoke(this, aVarI.f412223d, obj2) : null;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, aVarI)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    InterfaceC43271q interfaceC43271q = (InterfaceC43271q) obj3;
                    this.f412219f = obj2;
                    Y41.q<Object, Object, Object, Object> qVar2 = t.f412236a;
                    a0 a0VarT = interfaceC43271q.t(lVarInvoke, G0.f406611a);
                    if (a0VarT == null) {
                        this.f412219f = t.f412240e;
                        return 2;
                    }
                    interfaceC43271q.I(a0VarT);
                    return 0;
                }
                continue;
            } else {
                if (L.f(obj3, t.f412238c) ? true : obj3 instanceof a) {
                    return 3;
                }
                if (L.f(obj3, t.f412239d)) {
                    return 2;
                }
                if (L.f(obj3, t.f412237b)) {
                    List listSingletonList = Collections.singletonList(obj);
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, listSingletonList)) {
                            z12 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    if (z12) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    ArrayList arrayListI0 = C42745f0.i0(obj, (Collection) obj3);
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListI0)) {
                            z12 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    if (z12) {
                        return 1;
                    }
                }
            }
        }
    }
}
