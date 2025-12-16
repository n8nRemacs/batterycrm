package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlinx.serialization.KSerializer;

/* compiled from: Caching.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/s;", "T", "Lkotlinx/serialization/internal/Q0;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.internal.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43426s<T> implements Q0<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f412906a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43434w<C43415m<T>> f412907b = new C43434w<>();

    /* compiled from: Caching.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "kotlinx/serialization/internal/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.serialization.internal.s$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<T> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlin.reflect.d f412909m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.reflect.d dVar) {
            super(0);
            this.f412909m = dVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final T invoke() {
            return (T) new C43415m((KSerializer) C43426s.this.f412906a.invoke(this.f412909m));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43426s(@Y61.k Y41.l<? super kotlin.reflect.d<?>, ? extends KSerializer<T>> lVar) {
        this.f412906a = (kotlin.jvm.internal.N) lVar;
    }

    @Override // kotlinx.serialization.internal.Q0
    @Y61.l
    public final KSerializer<T> a(@Y61.k kotlin.reflect.d<Object> dVar) {
        C43420o0 c43420o0 = (C43420o0) this.f412907b.get(((InterfaceC42819t) dVar).f());
        T t12 = c43420o0.f412900a.get();
        if (t12 == null) {
            t12 = (T) c43420o0.a(new a(dVar));
        }
        return t12.f412889a;
    }
}
