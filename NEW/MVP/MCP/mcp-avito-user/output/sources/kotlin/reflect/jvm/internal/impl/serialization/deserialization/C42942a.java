package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42942a extends kotlin.jvm.internal.N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.K> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC42943b f409773l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42942a(AbstractC42943b abstractC42943b) {
        super(1);
        this.f409773l = abstractC42943b;
    }

    @Override // Y41.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.K invoke(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        AbstractC42943b abstractC42943b = this.f409773l;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d dVarD = abstractC42943b.d(cVar);
        if (dVarD == null) {
            return null;
        }
        C42954k c42954k = abstractC42943b.f409777d;
        dVarD.F0(c42954k != null ? c42954k : null);
        return dVarD;
    }
}
