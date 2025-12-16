package com.avito.android.cart_snippet_actions.utils;

import Y41.l;
import Y41.q;
import io.reactivex.rxjava3.core.E;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.o;
import yn.C50271a;

/* compiled from: ItemQuantityChanges.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Response", "", "", "Lcom/avito/android/cart_snippet_actions/utils/Change;", "acc", "Lio/reactivex/rxjava3/core/E;", "apply", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f116292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f116293c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f116294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N f116295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.beduin_v2.repository.domain.cart_items.h f116296f;

    /* JADX WARN: Multi-variable type inference failed */
    public g(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, q qVar, l lVar, com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar) {
        this.f116292b = linkedHashMap;
        this.f116293c = linkedHashMap2;
        this.f116294d = (N) qVar;
        this.f116295e = (N) lVar;
        this.f116296f = hVar;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [Y41.q, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // l41.o
    public final Object apply(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj);
        LinkedHashMap linkedHashMap2 = this.f116292b;
        linkedHashMap2.clear();
        LinkedHashMap linkedHashMap3 = this.f116293c;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap3);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Change change = (Change) entry.getValue();
            final d dVar = d.f116282l;
            linkedHashMap4.merge(str, change, new BiFunction() { // from class: com.avito.android.cart_snippet_actions.utils.c
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj2, Object obj3) {
                    return (Change) dVar.invoke(obj2, obj3);
                }
            });
        }
        linkedHashMap3.clear();
        linkedHashMap3.putAll(linkedHashMap4);
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(new C50271a((String) entry2.getKey(), ((Change) entry2.getValue()).f116278c.f176568b));
        }
        io.reactivex.rxjava3.subjects.e eVar = new io.reactivex.rxjava3.subjects.e();
        return z.g0(eVar, (E) this.f116294d.invoke(arrayList, new e(eVar, this.f116295e, linkedHashMap4, linkedHashMap2, linkedHashMap3), new f(eVar, linkedHashMap3, linkedHashMap, this.f116296f)));
    }
}
