package com.avito.android.advert.item.ownership_cost.dialogs.region_select;

import com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.RegionSelectItem;
import com.avito.android.util.D6;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: RegionSelectViewPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f77920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f77921c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f77922d;

    public h(i iVar, ArrayList arrayList, f fVar) {
        this.f77920b = iVar;
        this.f77921c = arrayList;
        this.f77922d = fVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str = (String) obj;
        this.f77920b.getClass();
        boolean zK2 = C43066x.K(C43066x.A0(str).toString());
        ArrayList arrayList = this.f77921c;
        if (!zK2) {
            ArrayList arrayList2 = new ArrayList();
            for (T t12 : arrayList) {
                if (C43066x.q(((RegionSelectItem) t12).f77925c.getLabel(), str, true)) {
                    arrayList2.add(t12);
                }
            }
            arrayList = arrayList2;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        f fVar = this.f77922d;
        if (!zIsEmpty) {
            fVar.a(arrayList);
        } else {
            D6.w(fVar.f77917c);
            D6.H(fVar.f77918d);
        }
    }
}
