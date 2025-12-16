package com.avito.android.search.filter.adapter.keywords;

import com.avito.android.search.filter.converter.ParameterElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: KeywordsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f262464l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f262465m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.p f262466n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, g gVar, ParameterElement.p pVar) {
        super(1);
        this.f262464l = qVar;
        this.f262465m = gVar;
        this.f262466n = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        q qVar = this.f262464l;
        g gVar = this.f262465m;
        gVar.y0("");
        q.k(gVar, "");
        ParameterElement.p pVar = this.f262466n;
        List<String> list = pVar.f262804e;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).toLowerCase(Locale.ROOT));
        }
        if (!arrayList.contains(str2.toLowerCase(Locale.ROOT)) && str2.length() != 0) {
            ArrayList arrayList2 = new ArrayList(pVar.f262804e);
            arrayList2.add(str2);
            pVar.f262804e = arrayList2;
            qVar.f262478b.accept(pVar);
            gVar.B(arrayList2);
            gVar.YY(arrayList2.size() < gVar.getF262462h());
        }
        return G0.f406611a;
    }
}
