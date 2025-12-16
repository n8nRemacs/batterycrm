package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k51.u;
import kotlin.C43074z;
import kotlin.InterfaceC42830m;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.O;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.m;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
/* loaded from: classes8.dex */
public final class g implements O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f408249a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.a<kotlin.reflect.jvm.internal.impl.name.c, n> f408250b;

    /* compiled from: LazyJavaPackageFragmentProvider.kt */
    public static final class a extends N implements Y41.a<n> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ u f408252m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u uVar) {
            super(0);
            this.f408252m = uVar;
        }

        @Override // Y41.a
        public final n invoke() {
            return new n(g.this.f408249a, this.f408252m);
        }
    }

    public g(@Y61.k c cVar) {
        this.f408249a = new h(cVar, m.a.f408265a, new C43074z(null));
        this.f408250b = cVar.f408076a.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.L
    @Y61.k
    @InterfaceC42830m
    public final List<n> a(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return C42745f0.V(d(cVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.O
    public final boolean b(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        this.f408249a.f408253a.f408077b.a(cVar);
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.O
    public final void c(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar, @Y61.k ArrayList arrayList) {
        kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, d(cVar));
    }

    public final n d(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return (n) this.f408250b.a(new a(this.f408249a.f408253a.f408077b.a(cVar)), cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.L
    public final Collection j(kotlin.reflect.jvm.internal.impl.name.c cVar, Y41.l lVar) {
        n nVarD = d(cVar);
        List<kotlin.reflect.jvm.internal.impl.name.c> listInvoke = nVarD != null ? nVarD.f408180m.invoke() : null;
        if (listInvoke == null) {
            listInvoke = C42784z0.f406748b;
        }
        return listInvoke;
    }

    @Y61.k
    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f408249a.f408253a.f408090o;
    }
}
