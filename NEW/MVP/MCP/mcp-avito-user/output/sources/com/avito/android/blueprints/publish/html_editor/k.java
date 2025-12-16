package com.avito.android.blueprints.publish.html_editor;

import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HtmlEditorItemViewExtensions.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f106278l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.items.f f106279m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, com.avito.android.items.f fVar) {
        super(0);
        this.f106278l = eVar;
        this.f106279m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        String f92556b = this.f106279m.getF92556b();
        LinkedHashMap linkedHashMap = this.f106278l.f106260a;
        Object cVar = linkedHashMap.get(f92556b);
        if (cVar == null) {
            cVar = new io.reactivex.rxjava3.disposables.c();
            linkedHashMap.put(f92556b, cVar);
        }
        ((io.reactivex.rxjava3.disposables.c) cVar).e();
        return G0.f406611a;
    }
}
