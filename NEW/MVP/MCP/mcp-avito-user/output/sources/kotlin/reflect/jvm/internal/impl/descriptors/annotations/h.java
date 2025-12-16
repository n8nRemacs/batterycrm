package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.L;

/* compiled from: AnnotationsImpl.kt */
/* loaded from: classes8.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<c> f407525b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@Y61.k List<? extends c> list) {
        this.f407525b = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @Y61.l
    public final c F(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        c next;
        Iterator<c> it = iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(next.d(), cVar)) {
                break;
            }
        }
        return next;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public final boolean i3(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return F(cVar) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public final boolean isEmpty() {
        return this.f407525b.isEmpty();
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<c> iterator() {
        return this.f407525b.iterator();
    }

    @Y61.k
    public final String toString() {
        return this.f407525b.toString();
    }
}
