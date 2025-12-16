package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: MemberDeserializer.kt */
/* loaded from: classes8.dex */
final class E extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.jvm.internal.impl.storage.l<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f409730l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ProtoBuf.h f409731m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x f409732n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(z zVar, ProtoBuf.h hVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x xVar) {
        super(0);
        this.f409730l = zVar;
        this.f409731m = hVar;
        this.f409732n = xVar;
    }

    @Override // Y41.a
    public final kotlin.reflect.jvm.internal.impl.storage.l<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> invoke() {
        z zVar = this.f409730l;
        return zVar.f409968a.f409936a.f409914a.f(new D(zVar, this.f409731m, this.f409732n));
    }
}
