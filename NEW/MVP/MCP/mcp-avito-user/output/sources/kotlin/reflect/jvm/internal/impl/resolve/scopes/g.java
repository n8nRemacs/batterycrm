package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import i51.InterfaceC41228b;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42858b;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;

/* compiled from: GivenFunctionsMemberScope.kt */
@s0
/* loaded from: classes8.dex */
public abstract class g extends k {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f409677d;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC42858b f409678b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f409679c;

    static {
        n0 n0Var = m0.f406844a;
        f409677d = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(g.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public g(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar, @Y61.k AbstractC42858b abstractC42858b) {
        this.f409678b = abstractC42858b;
        this.f409679c = pVar.g(new e(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Collection<a0> d(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        Collection<a0> collection;
        kotlin.reflect.n<Object> nVar = f409677d[0];
        List list = (List) this.f409679c.invoke();
        if (list.isEmpty()) {
            collection = C42784z0.f406748b;
        } else {
            kotlin.reflect.jvm.internal.impl.utils.f fVar2 = new kotlin.reflect.jvm.internal.impl.utils.f();
            for (Object obj : list) {
                if ((obj instanceof a0) && L.f(((a0) obj).getName(), fVar)) {
                    fVar2.add(obj);
                }
            }
            collection = fVar2;
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.k
    public final Collection<InterfaceC42882k> e(@Y61.k d dVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        if (!dVar.a(d.f409664m.f409671b)) {
            return C42784z0.f406748b;
        }
        kotlin.reflect.n<Object> nVar = f409677d[0];
        return (List) this.f409679c.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k NoLookupLocation noLookupLocation) {
        Collection collection;
        kotlin.reflect.n<Object> nVar = f409677d[0];
        List list = (List) this.f409679c.invoke();
        if (list.isEmpty()) {
            collection = C42784z0.f406748b;
        } else {
            kotlin.reflect.jvm.internal.impl.utils.f fVar2 = new kotlin.reflect.jvm.internal.impl.utils.f();
            for (Object obj : list) {
                if ((obj instanceof U) && L.f(((U) obj).getName(), fVar)) {
                    fVar2.add(obj);
                }
            }
            collection = fVar2;
        }
        return collection;
    }

    @Y61.k
    public abstract List<InterfaceC42905x> h();
}
