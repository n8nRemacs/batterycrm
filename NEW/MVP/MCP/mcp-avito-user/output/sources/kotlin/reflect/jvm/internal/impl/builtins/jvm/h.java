package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.N;

/* compiled from: JvmBuiltIns.kt */
/* loaded from: classes8.dex */
final class h extends N implements Y41.a<l> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JvmBuiltIns f407269l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.f f407270m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(JvmBuiltIns jvmBuiltIns, kotlin.reflect.jvm.internal.impl.storage.f fVar) {
        super(0);
        this.f407269l = jvmBuiltIns;
        this.f407270m = fVar;
    }

    @Override // Y41.a
    public final l invoke() {
        JvmBuiltIns jvmBuiltIns = this.f407269l;
        return new l(jvmBuiltIns.k(), this.f407270m, new g(jvmBuiltIns));
    }
}
