package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.x0;

/* compiled from: NewCapturedType.kt */
/* loaded from: classes8.dex */
public final class m implements kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x0 f410108a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Y41.a<? extends List<? extends J0>> f410109b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final m f410110c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final g0 f410111d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f410112e;

    /* compiled from: NewCapturedType.kt */
    public static final class a extends N implements Y41.a<List<? extends J0>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends J0> invoke() {
            Y41.a<? extends List<? extends J0>> aVar = m.this.f410109b;
            if (aVar != null) {
                return aVar.invoke();
            }
            return null;
        }
    }

    /* compiled from: NewCapturedType.kt */
    @s0
    final class b extends N implements Y41.a<List<? extends J0>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ i f410115m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar) {
            super(0);
            this.f410115m = iVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final List<? extends J0> invoke() {
            Iterable iterable = (List) m.this.f410112e.getValue();
            if (iterable == null) {
                iterable = C42784z0.f406748b;
            }
            Iterable iterable2 = iterable;
            ArrayList arrayList = new ArrayList(C42745f0.q(iterable2, 10));
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                arrayList.add(((J0) it.next()).J0(this.f410115m));
            }
            return arrayList;
        }
    }

    public m() {
        throw null;
    }

    public m(@Y61.k x0 x0Var, @Y61.l Y41.a<? extends List<? extends J0>> aVar, @Y61.l m mVar, @Y61.l g0 g0Var) {
        this.f410108a = x0Var;
        this.f410109b = aVar;
        this.f410110c = mVar;
        this.f410111d = g0Var;
        this.f410112e = C42727D.b(LazyThreadSafetyMode.f406615c, new a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    public final Collection C() {
        Collection collection = (List) this.f410112e.getValue();
        if (collection == null) {
            collection = C42784z0.f406748b;
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.l
    public final InterfaceC42853f b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    public final boolean c() {
        return false;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m mVar = (m) obj;
        m mVar2 = this.f410110c;
        if (mVar2 == null) {
            mVar2 = this;
        }
        m mVar3 = mVar.f410110c;
        if (mVar3 != null) {
            mVar = mVar3;
        }
        return mVar2 == mVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    public final List<g0> getParameters() {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b
    @Y61.k
    public final x0 h() {
        return this.f410108a;
    }

    public final int hashCode() {
        m mVar = this.f410110c;
        return mVar != null ? mVar.hashCode() : super.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.builtins.k m() {
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.e(this.f410108a.getType());
    }

    @Y61.k
    public final String toString() {
        return "CapturedType(" + this.f410108a + ')';
    }

    public /* synthetic */ m(x0 x0Var, Y41.a aVar, m mVar, g0 g0Var, int i12, C42822w c42822w) {
        this(x0Var, (i12 & 2) != 0 ? null : aVar, (i12 & 4) != 0 ? null : mVar, (i12 & 8) != 0 ? null : g0Var);
    }

    public m(x0 x0Var, List list, m mVar, int i12, C42822w c42822w) {
        this(x0Var, new l(list), (i12 & 4) != 0 ? null : mVar, null, 8, null);
    }
}
