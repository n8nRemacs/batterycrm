package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.BeduinOpenDeeplinkAction;
import com.avito.android.deep_linking.links.DeepLink;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinOpenDeeplinkActionHandler.kt */
@com.avito.android.di.B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/d0;", "LUi/b;", "Lcom/avito/android/beduin_shared/model/action/BeduinOpenDeeplinkAction;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.d0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28743d0 implements InterfaceC15523b<BeduinOpenDeeplinkAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f100228a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f100229b;

    @Inject
    public C28743d0() {
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f100228a = cVar;
        this.f100229b = new C41981q0(cVar);
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100228a.accept(((BeduinOpenDeeplinkAction) beduinAction).getDeeplink());
    }
}
