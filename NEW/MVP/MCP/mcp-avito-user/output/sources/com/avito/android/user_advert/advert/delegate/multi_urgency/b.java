package com.avito.android.user_advert.advert.delegate.multi_urgency;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.urgency.MultiUrgencyBlockResponse;
import com.avito.android.remote.model.urgency.MultiUrgencyType;
import com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.k;
import com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.q;
import com.avito.android.user_advert.advert.items.multi_urgency.l;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MultiUrgencyConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multi_urgency/b;", "Lcom/avito/android/user_advert/advert/delegate/multi_urgency/a;", "Lcom/avito/android/user_advert/advert/delegate/multi_urgency/use_case/k;", "Lcom/avito/android/user_advert/advert/delegate/multi_urgency/use_case/q;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a, k, q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f308683a;

    @Inject
    public b(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f308683a = interfaceC35863o4;
    }

    @Override // com.avito.android.user_advert.advert.delegate.multi_urgency.a
    @Y61.k
    public final com.avito.android.user_advert.advert.items.multi_urgency.c a(@Y61.k String str, @Y61.k MultiUrgencyBlockResponse multiUrgencyBlockResponse) {
        String strA = this.f308683a.a();
        long categoryId = multiUrgencyBlockResponse.getEvent().getCategoryId();
        long microCategoryId = multiUrgencyBlockResponse.getEvent().getMicroCategoryId();
        long urgencyId = multiUrgencyBlockResponse.getUrgencyId();
        AttributedText title = multiUrgencyBlockResponse.getTitle();
        AttributedText subtitle = multiUrgencyBlockResponse.getSubtitle();
        boolean zIsSwitchOn = multiUrgencyBlockResponse.isSwitchOn();
        List<MultiUrgencyType> types = multiUrgencyBlockResponse.getTypes();
        ArrayList arrayList = new ArrayList(C42745f0.q(types, 10));
        for (MultiUrgencyType multiUrgencyType : types) {
            arrayList.add(new l(multiUrgencyType.getUrgencyId(), multiUrgencyType.getTitle(), multiUrgencyType.getSubtitle(), multiUrgencyBlockResponse.getUrgencyId() == multiUrgencyType.getUrgencyId(), multiUrgencyBlockResponse.isSwitchOn()));
        }
        return new com.avito.android.user_advert.advert.items.multi_urgency.c(strA, str, categoryId, microCategoryId, urgencyId, title, subtitle, arrayList, false, zIsSwitchOn);
    }

    @Override // com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.k
    @Y61.k
    public final com.avito.android.user_advert.advert.items.multi_urgency.c b(@Y61.k com.avito.android.user_advert.advert.items.multi_urgency.c cVar, boolean z12) {
        List<l> list = cVar.f309645i;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (l lVar : list) {
            arrayList.add(l.b(lVar, cVar.f309642f == lVar.f309665b, z12, 7));
        }
        return com.avito.android.user_advert.advert.items.multi_urgency.c.a(cVar, 0L, arrayList, z12, 383);
    }

    @Override // com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.q
    @Y61.k
    public final com.avito.android.user_advert.advert.items.multi_urgency.c c(@Y61.k com.avito.android.user_advert.advert.items.multi_urgency.c cVar, @Y61.k l lVar) {
        List<l> list = cVar.f309645i;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (l lVar2 : list) {
            arrayList.add(l.b(lVar2, lVar2.f309665b == lVar.f309665b, false, 23));
        }
        return com.avito.android.user_advert.advert.items.multi_urgency.c.a(cVar, lVar.f309665b, arrayList, false, 879);
    }
}
