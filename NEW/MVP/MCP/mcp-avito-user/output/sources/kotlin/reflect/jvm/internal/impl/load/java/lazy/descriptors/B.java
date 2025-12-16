package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42883l;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42859c;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: LazyJavaTypeParameterDescriptor.kt */
@s0
/* loaded from: classes8.dex */
public final class B extends AbstractC42859c {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.h f408101l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final k51.y f408102m;

    /* JADX WARN: Illegal instructions before constructor call */
    public B(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, @Y61.k k51.y yVar, int i12, @Y61.k InterfaceC42883l interfaceC42883l) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
        super(cVar.f408076a, interfaceC42883l, new kotlin.reflect.jvm.internal.impl.load.java.lazy.e(hVar, yVar, false, 4, null), yVar.getName(), Variance.f410069d, false, i12, b0.f407539a, cVar.f408088m);
        this.f408101l = hVar;
        this.f408102m = yVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42864h
    @Y61.k
    public final List<O> G0() {
        Collection<k51.j> upperBounds = this.f408102m.getUpperBounds();
        boolean zIsEmpty = upperBounds.isEmpty();
        kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = this.f408101l;
        if (zIsEmpty) {
            return Collections.singletonList(P.c(hVar.f408253a.f408090o.m().e(), hVar.f408253a.f408090o.m().n()));
        }
        Collection<k51.j> collection = upperBounds;
        ArrayList arrayList = new ArrayList(C42745f0.q(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(hVar.f408257e.d((k51.j) it.next(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.a(TypeUsage.f410066c, false, this, 3)));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42864h
    @Y61.k
    public final List<O> n0(@Y61.k List<? extends O> list) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = this.f408101l;
        return hVar.f408253a.f408093r.e(this, list, hVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42864h
    public final void F0(@Y61.k O o12) {
    }
}
