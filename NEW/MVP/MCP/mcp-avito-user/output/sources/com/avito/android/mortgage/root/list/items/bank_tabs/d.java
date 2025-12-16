package com.avito.android.mortgage.root.list.items.bank_tabs;

import Y41.p;
import com.avito.android.mortgage.root.list.items.bank_tabs.c;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import f10.InterfaceC40199a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BankTabsPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank_tabs/c$b;", NotificationOpenAtTab.TAB, "", "isSelected", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/mortgage/root/list/items/bank_tabs/c$b;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements p<c.b, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f202423l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(2);
        this.f202423l = eVar;
    }

    @Override // Y41.p
    public final G0 invoke(c.b bVar, Boolean bool) {
        c.b bVar2 = bVar;
        if (bool.booleanValue()) {
            e eVar = this.f202423l;
            eVar.f202424b.invoke(new InterfaceC40199a.N(bVar2.f202418c));
        }
        return G0.f406611a;
    }
}
