package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DefinitionBinding.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"koin-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: z71.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C50383a {
    /* JADX WARN: Multi-variable type inference failed */
    @t71.e
    @Y61.k
    public static final void a(@Y61.k org.koin.core.definition.e eVar, @Y61.k kotlin.reflect.d dVar) {
        org.koin.core.instance.e<R> eVar2 = eVar.f421456b;
        org.koin.core.definition.a<T> aVar = eVar2.f421460a;
        aVar.f421451f = C42745f0.i0(dVar, aVar.f421451f);
        eVar.f421455a.f439153d.put(org.koin.core.definition.b.a(dVar, aVar.f421448c, aVar.f421446a), eVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t71.e
    @Y61.k
    public static final void b(@Y61.k org.koin.core.definition.e eVar, @Y61.k kotlin.reflect.d[] dVarArr) {
        org.koin.core.instance.e<R> eVar2 = eVar.f421456b;
        org.koin.core.definition.a<T> aVar = eVar2.f421460a;
        List<? extends kotlin.reflect.d<?>> list = aVar.f421451f;
        ArrayList arrayList = new ArrayList(list.size() + dVarArr.length);
        arrayList.addAll(list);
        C42745f0.i(arrayList, dVarArr);
        aVar.f421451f = arrayList;
        for (kotlin.reflect.d dVar : dVarArr) {
            eVar.f421455a.f439153d.put(org.koin.core.definition.b.a(dVar, aVar.f421448c, aVar.f421446a), eVar2);
        }
    }
}
