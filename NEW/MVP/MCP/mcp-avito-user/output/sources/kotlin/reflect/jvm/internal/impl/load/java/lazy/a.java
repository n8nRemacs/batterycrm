package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42852e;
import kotlin.reflect.jvm.internal.impl.load.java.A;

/* compiled from: context.kt */
/* loaded from: classes8.dex */
final class a extends N implements Y41.a<A> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f408072l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42852e f408073m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, InterfaceC42852e interfaceC42852e) {
        super(0);
        this.f408072l = hVar;
        this.f408073m = interfaceC42852e;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.a
    public final A invoke() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = this.f408073m.getAnnotations();
        h hVar = this.f408072l;
        c cVar = hVar.f408253a;
        return cVar.f408092q.b((A) hVar.f408256d.getValue(), annotations);
    }
}
