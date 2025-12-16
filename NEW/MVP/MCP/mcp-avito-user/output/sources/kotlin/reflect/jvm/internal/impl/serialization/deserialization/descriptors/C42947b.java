package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;

/* compiled from: DeserializedAnnotations.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42947b implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f409793c;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f409794b;

    static {
        n0 n0Var = m0.f406844a;
        f409793c = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(C42947b.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C42947b(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar, @Y61.k Y41.a<? extends List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> aVar) {
        this.f409794b = pVar.g(aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c F(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c next;
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it = iterator();
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
    public boolean isEmpty() {
        kotlin.reflect.n<Object> nVar = f409793c[0];
        return ((List) this.f409794b.invoke()).isEmpty();
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
        kotlin.reflect.n<Object> nVar = f409793c[0];
        return ((List) this.f409794b.invoke()).iterator();
    }
}
