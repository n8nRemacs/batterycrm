package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;

/* compiled from: ScopesHolderForClass.kt */
/* loaded from: classes8.dex */
public final class Y<T extends kotlin.reflect.jvm.internal.impl.resolve.scopes.j> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f407448e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f407449f;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42851d f407450a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<kotlin.reflect.jvm.internal.impl.types.checker.i, T> f407451b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.types.checker.i f407452c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f407453d;

    /* compiled from: ScopesHolderForClass.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ScopesHolderForClass.kt */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<T> {
        @Override // Y41.a
        public final Object invoke() {
            throw null;
        }
    }

    static {
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        f407449f = new kotlin.reflect.n[]{n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(Y.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
        f407448e = new a(null);
    }

    public Y() {
        throw null;
    }

    public Y(InterfaceC42851d interfaceC42851d, kotlin.reflect.jvm.internal.impl.storage.p pVar, Y41.l lVar, kotlin.reflect.jvm.internal.impl.types.checker.i iVar, C42822w c42822w) {
        this.f407450a = interfaceC42851d;
        this.f407451b = lVar;
        this.f407452c = iVar;
        this.f407453d = pVar.g(new Z(this));
    }

    @Y61.k
    public final T a(@Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
        kotlin.reflect.jvm.internal.impl.resolve.j.d(this.f407450a);
        iVar.getClass();
        kotlin.reflect.n<Object> nVar = f407449f[0];
        return (T) this.f407453d.invoke();
    }
}
