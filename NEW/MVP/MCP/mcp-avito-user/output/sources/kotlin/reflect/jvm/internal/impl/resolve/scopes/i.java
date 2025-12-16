package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: LazyScopeAdapter.kt */
/* loaded from: classes8.dex */
public final class i extends kotlin.reflect.jvm.internal.impl.resolve.scopes.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k<j> f409681b;

    /* compiled from: LazyScopeAdapter.kt */
    public static final class a extends N implements Y41.a<j> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<j> f409682l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<? extends j> aVar) {
            super(0);
            this.f409682l = aVar;
        }

        @Override // Y41.a
        public final j invoke() {
            j jVarInvoke = this.f409682l.invoke();
            return jVarInvoke instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.a ? ((kotlin.reflect.jvm.internal.impl.resolve.scopes.a) jVarInvoke).h() : jVarInvoke;
        }
    }

    @X41.j
    public i() {
        throw null;
    }

    public /* synthetic */ i(kotlin.reflect.jvm.internal.impl.storage.p pVar, Y41.a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? kotlin.reflect.jvm.internal.impl.storage.f.f409976e : pVar, aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a
    @Y61.k
    public final j i() {
        return this.f409681b.invoke();
    }

    @X41.j
    public i(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar, @Y61.k Y41.a<? extends j> aVar) {
        this.f409681b = pVar.g(new a(aVar));
    }
}
