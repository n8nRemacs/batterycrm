package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes8.dex */
final class F extends kotlin.jvm.internal.N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.P> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G f407551l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(G g12) {
        super(1);
        this.f407551l = g12;
    }

    @Override // Y41.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.P invoke(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        G g12 = this.f407551l;
        kotlin.reflect.jvm.internal.impl.storage.p pVar = g12.f407552d;
        return g12.f407555g.a(g12, cVar, pVar);
    }
}
