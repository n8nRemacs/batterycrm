package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import kotlin.collections.C42782y0;
import kotlin.collections.C42784z0;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes8.dex */
final class f implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.c f408331b;

    public f(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        this.f408331b = cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c F(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (cVar.equals(this.f408331b)) {
            return e.f408330a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public final boolean i3(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return F(cVar) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
        C42784z0.f406748b.getClass();
        return C42782y0.f406747b;
    }
}
