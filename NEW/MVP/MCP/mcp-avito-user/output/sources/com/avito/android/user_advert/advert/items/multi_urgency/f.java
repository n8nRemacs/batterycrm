package com.avito.android.user_advert.advert.items.multi_urgency;

import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiUrgencyBlockPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multi_urgency/l;", "type", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_advert/advert/items/multi_urgency/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.l<l, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f309649l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(1);
        this.f309649l = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(l lVar) {
        l lVar2 = lVar;
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f309649l.f309650b;
        if (myAdvertDetailsActivity != null) {
            InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
            if (interfaceC35426j0 == null) {
                interfaceC35426j0 = null;
            }
            interfaceC35426j0.X5(lVar2);
        }
        return G0.f406611a;
    }
}
