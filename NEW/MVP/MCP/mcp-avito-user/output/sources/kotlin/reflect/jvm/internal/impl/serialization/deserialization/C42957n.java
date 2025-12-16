package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.s0;

/* compiled from: DeserializedClassDataFinder.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42957n implements InterfaceC42951h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.O f409945a;

    public C42957n(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.O o12) {
        this.f409945a = o12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42951h
    @Y61.l
    public final C42950g a(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar) {
        C42950g c42950gA;
        kotlin.reflect.jvm.internal.impl.name.c cVarG = bVar.g();
        kotlin.reflect.jvm.internal.impl.descriptors.O o12 = this.f409945a;
        ArrayList arrayList = new ArrayList();
        kotlin.reflect.jvm.internal.impl.descriptors.N.a(o12, cVarG, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.K k12 = (kotlin.reflect.jvm.internal.impl.descriptors.K) it.next();
            if ((k12 instanceof AbstractC42958o) && (c42950gA = ((AbstractC42958o) k12).n0().a(bVar)) != null) {
                return c42950gA;
            }
        }
        return null;
    }
}
