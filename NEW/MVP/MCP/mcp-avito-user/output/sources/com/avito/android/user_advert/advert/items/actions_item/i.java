package com.avito.android.user_advert.advert.items.actions_item;

import com.avito.android.user_advert.advert.items.actions_item.ActionsItem;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ActionsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$Action;", "T", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_advert/advert/items/actions_item/ActionsItem$Action;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class i extends N implements Y41.l<Object, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f309044l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ArrayList arrayList) {
        super(1);
        this.f309044l = arrayList;
    }

    @Override // Y41.l
    public final G0 invoke(Object obj) {
        this.f309044l.add(C42745f0.e0((ActionsItem.Action) obj));
        return G0.f406611a;
    }
}
