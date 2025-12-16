package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import i51.InterfaceC41228b;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;

/* compiled from: StaticScopeForKotlinEnum.kt */
@s0
/* loaded from: classes8.dex */
public final class p extends k {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f409690f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e f409691b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f409692c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f409693d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f409694e;

    static {
        n0 n0Var = m0.f406844a;
        f409690f = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(p.class), "functions", "getFunctions()Ljava/util/List;")), n0Var.i(new h0(n0Var.b(p.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public p(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar, @Y61.k kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e eVar, boolean z12) {
        this.f409691b = eVar;
        this.f409692c = z12;
        ClassKind classKind = ClassKind.f407413b;
        this.f409693d = pVar.g(new n(this));
        this.f409694e = pVar.g(new o(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    public final Collection d(kotlin.reflect.jvm.internal.impl.name.f fVar, InterfaceC41228b interfaceC41228b) {
        kotlin.reflect.n<Object> nVar = f409690f[0];
        List list = (List) this.f409693d.invoke();
        kotlin.reflect.jvm.internal.impl.utils.f fVar2 = new kotlin.reflect.jvm.internal.impl.utils.f();
        for (Object obj : list) {
            if (L.f(((a0) obj).getName(), fVar)) {
                fVar2.add(obj);
            }
        }
        return fVar2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    public final Collection e(d dVar, Y41.l lVar) {
        kotlin.reflect.n<Object>[] nVarArr = f409690f;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        List list = (List) this.f409693d.invoke();
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        return C42745f0.h0((List) this.f409694e.invoke(), list);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k NoLookupLocation noLookupLocation) {
        kotlin.reflect.n<Object> nVar = f409690f[1];
        List list = (List) this.f409694e.invoke();
        kotlin.reflect.jvm.internal.impl.utils.f fVar2 = new kotlin.reflect.jvm.internal.impl.utils.f();
        for (Object obj : list) {
            if (L.f(((U) obj).getName(), fVar)) {
                fVar2.add(obj);
            }
        }
        return fVar2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    public final /* bridge */ /* synthetic */ InterfaceC42853f g(kotlin.reflect.jvm.internal.impl.name.f fVar, InterfaceC41228b interfaceC41228b) {
        return null;
    }
}
