package com.avito.beduin.v2.avito.component.text.state;

import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoWebViewStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "messageBody", "Lkotlin/G0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class v extends N implements Y41.l<Map<String, ? extends String>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.beduin.v2.engine.field.m, G0> f335385l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f335386m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(Y41.l<? super com.avito.beduin.v2.engine.field.m, G0> lVar, AbstractC36250j.b bVar) {
        super(1);
        this.f335385l = lVar;
        this.f335386m = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(Map<String, ? extends String> map) {
        Map<String, ? extends String> map2 = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            AbstractC36250j.b bVar = this.f335386m;
            if (!zHasNext) {
                this.f335385l.invoke(com.avito.beduin.v2.engine.field.entity.n.b(linkedHashMap));
                return G0.f406611a;
            }
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), C36273j.e(bVar, (String) entry.getValue()));
        }
    }
}
