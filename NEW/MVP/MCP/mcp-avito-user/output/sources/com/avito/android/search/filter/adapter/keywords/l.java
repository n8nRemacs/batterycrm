package com.avito.android.search.filter.adapter.keywords;

import com.avito.android.search.filter.converter.ParameterElement;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: KeywordsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f262467l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f262468m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.p f262469n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, g gVar, ParameterElement.p pVar) {
        super(1);
        this.f262467l = qVar;
        this.f262468m = gVar;
        this.f262469n = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        q qVar = this.f262467l;
        g gVar = this.f262468m;
        gVar.YY(true);
        ParameterElement.p pVar = this.f262469n;
        ArrayList arrayList = new ArrayList(pVar.f262804e);
        if (iIntValue >= 0 && iIntValue < arrayList.size()) {
            arrayList.remove(iIntValue);
        }
        pVar.f262804e = arrayList;
        qVar.f262478b.accept(pVar);
        gVar.B(arrayList);
        return G0.f406611a;
    }
}
