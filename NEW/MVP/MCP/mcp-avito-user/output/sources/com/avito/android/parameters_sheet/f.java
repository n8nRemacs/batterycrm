package com.avito.android.parameters_sheet;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: ParametersListDialogPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f210813b;

    public f(g gVar) {
        this.f210813b = gVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        g gVar = this.f210813b;
        Collection collectionValues = gVar.f210823j.values();
        LinkedHashMap linkedHashMap = gVar.f210824k;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((Map) entry.getValue()).values());
        }
        gVar.f210817d.a(new com.avito.android.category_parameters.i(collectionValues, linkedHashMap2, gVar.f210825l.values()));
        d dVar = gVar.f210820g;
        if (dVar != null) {
            dVar.dismiss();
        }
    }
}
