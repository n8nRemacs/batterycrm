package com.avito.android.search.filter.adapter.category_group;

import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryGroupItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "selectedPosition", "Lcom/avito/android/search/filter/adapter/category_group/C;", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(ILcom/avito/android/search/filter/adapter/category_group/C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class m extends N implements Y41.p<Integer, C, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v.b f262072l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f262073m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f262074n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ParameterElement.v.b bVar, p pVar, s sVar) {
        super(2);
        this.f262072l = bVar;
        this.f262073m = pVar;
        this.f262074n = sVar;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, C c12) {
        int iIntValue = num.intValue();
        ParameterElement.v.b bVar = this.f262072l;
        bVar.f262844g = bVar.f262862t.get(iIntValue);
        p pVar = this.f262073m;
        com.jakewharton.rxrelay3.c<G0> cVar = pVar.f262083h;
        G0 g02 = G0.f406611a;
        cVar.accept(g02);
        pVar.f262080e.accept(bVar);
        this.f262074n.Y3();
        pVar.f262077b = false;
        return g02;
    }
}
