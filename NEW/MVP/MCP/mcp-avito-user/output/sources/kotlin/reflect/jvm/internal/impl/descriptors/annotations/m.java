package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.s0;

/* compiled from: Annotations.kt */
@s0
/* loaded from: classes8.dex */
public final class m implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f407534b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<kotlin.reflect.jvm.internal.impl.name.c, Boolean> f407535c;

    public m() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@Y61.k g gVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.c, Boolean> lVar) {
        this.f407534b = gVar;
        this.f407535c = lVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @Y61.l
    public final c F(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (this.f407535c.invoke(cVar).booleanValue()) {
            return this.f407534b.F(cVar);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public final boolean i3(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (this.f407535c.invoke(cVar).booleanValue()) {
            return this.f407534b.i3(cVar);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public final boolean isEmpty() {
        g gVar = this.f407534b;
        if ((gVar instanceof Collection) && ((Collection) gVar).isEmpty()) {
            return false;
        }
        Iterator<c> it = gVar.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.name.c cVarD = it.next().d();
            if (cVarD != null && this.f407535c.invoke(cVarD).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<c> iterator() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f407534b) {
            kotlin.reflect.jvm.internal.impl.name.c cVarD = cVar.d();
            if (cVarD != null && this.f407535c.invoke(cVarD).booleanValue()) {
                arrayList.add(cVar);
            }
        }
        return arrayList.iterator();
    }
}
