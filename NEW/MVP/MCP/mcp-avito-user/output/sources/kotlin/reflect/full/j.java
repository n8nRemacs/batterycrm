package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.m0;
import kotlin.reflect.r;

/* compiled from: KClasses.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class j extends g0 {
    static {
        new j();
    }

    @Override // kotlin.reflect.p
    @Y61.l
    public final Object get(@Y61.l Object obj) {
        List<r> listC = ((kotlin.reflect.d) obj).C();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            kotlin.reflect.g f406862b = ((r) it.next()).getF406862b();
            kotlin.reflect.d dVar = f406862b instanceof kotlin.reflect.d ? (kotlin.reflect.d) f406862b : null;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
    @Y61.k
    /* renamed from: getName */
    public final String getF407039i() {
        return "superclasses";
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final kotlin.reflect.h getOwner() {
        return m0.f406844a.c(l.class, "kotlin-reflection");
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final String getSignature() {
        return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
    }
}
