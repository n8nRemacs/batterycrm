package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.G0;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.utils.b;

/* compiled from: LazyJavaStaticClassScope.kt */
/* loaded from: classes8.dex */
public final class y extends b.AbstractC11701b<InterfaceC42851d, G0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f408238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f408239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f408240c;

    /* JADX WARN: Multi-variable type inference failed */
    public y(f fVar, LinkedHashSet linkedHashSet, Y41.l lVar) {
        this.f408238a = fVar;
        this.f408239b = linkedHashSet;
        this.f408240c = (N) lVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
    public final /* bridge */ /* synthetic */ Object a() {
        return G0.f406611a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC11701b, kotlin.reflect.jvm.internal.impl.utils.b.e
    public final boolean b(Object obj) {
        InterfaceC42851d interfaceC42851d = (InterfaceC42851d) obj;
        if (interfaceC42851d == this.f408238a) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarP = interfaceC42851d.P();
        if (!(jVarP instanceof A)) {
            return true;
        }
        this.f408239b.addAll((Collection) this.f408240c.invoke(jVarP));
        return false;
    }
}
