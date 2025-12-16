package com.avito.android.blueprints.selector_card.multiselect;

import JO.m;
import Y41.p;
import com.avito.android.blueprints.selector_card.multiselect.f;
import com.avito.android.category_parameters.ParameterElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MultiselectSelectorCardGroupPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$E$b;", "option", "", "isSelected", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/category_parameters/ParameterElement$E$b;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements p<ParameterElement.E.b, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f106648l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f106649m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.E f106650n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, LinkedHashMap linkedHashMap, ParameterElement.E e12) {
        super(2);
        this.f106648l = fVar;
        this.f106649m = linkedHashMap;
        this.f106650n = e12;
    }

    @Override // Y41.p
    public final G0 invoke(ParameterElement.E.b bVar, Boolean bool) {
        Object next;
        ParameterElement.E.b bVar2 = bVar;
        boolean zBooleanValue = bool.booleanValue();
        String str = this.f106650n.f117181b;
        f fVar = this.f106648l;
        fVar.getClass();
        boolean z12 = bVar2.f117285d;
        LinkedHashMap linkedHashMap = this.f106649m;
        if (z12) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                f.a aVar = (f.a) entry.getValue();
                Ij.b bVar3 = aVar.f106647b;
                linkedHashMap.put(key, new f.a(aVar.f106646a, new Ij.b(bVar3.f8494a, m.a(bVar3.f8495b, false), bVar3.f8496c)));
            }
        } else {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((f.a) ((Map.Entry) next).getValue()).f106647b.f8495b.f8964e) {
                    break;
                }
            }
            Map.Entry entry2 = (Map.Entry) next;
            if (entry2 != null) {
                String str2 = (String) entry2.getKey();
                f.a aVar2 = (f.a) entry2.getValue();
                if (aVar2.f106646a) {
                    Ij.b bVar4 = aVar2.f106647b;
                    linkedHashMap.put(str2, new f.a(aVar2.f106646a, new Ij.b(bVar4.f8494a, m.a(bVar4.f8495b, false), bVar4.f8496c)));
                }
            }
        }
        String str3 = bVar2.f117286e;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put(bVar2.f117283b, new f.a(z12, new Ij.b(str, new m(bVar2.f117283b, str3, null, zBooleanValue, null, null, null, false, null, null, false, null, null, null, null, null, 65524, null), null, 4, null)));
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList = new ArrayList(C42745f0.q(collectionValues, 10));
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.add(((f.a) it2.next()).f106647b);
        }
        fVar.f106644b.accept(arrayList);
        return G0.f406611a;
    }
}
