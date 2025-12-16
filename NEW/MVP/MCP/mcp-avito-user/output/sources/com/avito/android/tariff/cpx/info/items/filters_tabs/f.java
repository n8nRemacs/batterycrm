package com.avito.android.tariff.cpx.info.items.filters_tabs;

import Y41.l;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCpxInfoFiltersTabsItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "pos", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f296491l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f296492m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, g gVar) {
        super(1);
        this.f296491l = bVar;
        this.f296492m = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        a aVar;
        int iIntValue = num.intValue();
        ArrayList arrayList = this.f296491l.f296486b;
        String str = null;
        if (iIntValue > C42745f0.J(arrayList)) {
            arrayList = null;
        }
        if (arrayList != null && (aVar = (a) arrayList.get(iIntValue)) != null) {
            str = aVar.f296484b;
        }
        this.f296492m.f296493b.invoke(str);
        return G0.f406611a;
    }
}
