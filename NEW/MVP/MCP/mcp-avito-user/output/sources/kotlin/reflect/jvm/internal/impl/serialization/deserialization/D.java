package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: MemberDeserializer.kt */
/* loaded from: classes8.dex */
final class D extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f409727l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ProtoBuf.h f409728m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x f409729n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(z zVar, ProtoBuf.h hVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x xVar) {
        super(0);
        this.f409727l = zVar;
        this.f409728m = hVar;
        this.f409729n = xVar;
    }

    @Override // Y41.a
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> invoke() {
        z zVar = this.f409727l;
        I iA2 = zVar.a(zVar.f409968a.f409938c);
        return zVar.f409968a.f409936a.f409918e.g(iA2, this.f409728m, this.f409729n.getReturnType());
    }
}
