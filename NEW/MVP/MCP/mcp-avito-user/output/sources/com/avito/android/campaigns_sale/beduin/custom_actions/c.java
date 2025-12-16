package com.avito.android.campaigns_sale.beduin.custom_actions;

import Y61.k;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.di.B;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinSetChosenItemsActionHandler.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/campaigns_sale/beduin/custom_actions/c;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/campaigns_sale/beduin/custom_actions/BeduinSetChosenItemsAction;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.beduin_shared.model.action.custom.c<BeduinSetChosenItemsAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<BeduinSetChosenItemsAction> f113859a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C41981q0 f113860b;

    @Inject
    public c() {
        com.jakewharton.rxrelay3.c<BeduinSetChosenItemsAction> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f113859a = cVar;
        this.f113860b = new C41981q0(cVar);
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        this.f113859a.accept((BeduinSetChosenItemsAction) beduinAction);
    }
}
