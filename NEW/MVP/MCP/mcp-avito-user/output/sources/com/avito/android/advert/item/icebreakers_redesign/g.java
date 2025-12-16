package com.avito.android.advert.item.icebreakers_redesign;

import com.avito.android.remote.model.IceBreaker;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: IceBreakersRedesignPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newText", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f76531l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f76532m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, l lVar) {
        super(1);
        this.f76531l = lVar;
        this.f76532m = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        boolean z12 = str2.length() >= 1000;
        l lVar = this.f76531l;
        lVar.jo(z12);
        i iVar = this.f76532m;
        iVar.f76542j = str2;
        iVar.f76539g.put(-1, str2);
        if (C43066x.K(str2)) {
            if (iVar.f76541i) {
                iVar.f76541i = false;
                ArrayList arrayList = iVar.f76540h;
                arrayList.clear();
                lVar.JG();
                lVar.y0("");
                lVar.W();
                List<IceBreaker> list = iVar.f76543k;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
                for (IceBreaker iceBreaker : list) {
                    arrayList2.add(new IcebreakerRedesignChips(iceBreaker.getId(), iceBreaker.getPreviewText(), null, false, 12, null));
                }
                lVar.hv(arrayList2, arrayList, false);
            }
        } else if (!str2.equals(iVar.k()) && !iVar.f76541i) {
            iVar.f76541i = true;
            lVar.h70();
        }
        return G0.f406611a;
    }
}
