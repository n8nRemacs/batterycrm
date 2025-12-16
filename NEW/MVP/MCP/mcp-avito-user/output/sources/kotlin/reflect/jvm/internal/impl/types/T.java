package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes8.dex */
public final class T extends K0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.p f410048c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f410049d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k<O> f410050e;

    /* JADX WARN: Multi-variable type inference failed */
    public T(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar, @Y61.k Y41.a<? extends O> aVar) {
        this.f410048c = pVar;
        this.f410049d = (kotlin.jvm.internal.N) aVar;
        this.f410050e = pVar.g(aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    /* renamed from: J0 */
    public final O M0(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return new T(this.f410048c, new S(iVar, this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.K0
    @Y61.k
    public final O L0() {
        return this.f410050e.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.K0
    public final boolean M0() {
        return this.f410050e.k();
    }
}
