package com.avito.android.beduin.common.actionhandler.tooltip;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin.common.action.BeduinTooltipAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.di.B;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinTooltipActionHandler.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/tooltip/a;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinTooltipAction;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC15523b<BeduinTooltipAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<BeduinTooltipAction> f100440a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C41981q0 f100441b;

    @Inject
    public a() {
        com.jakewharton.rxrelay3.c<BeduinTooltipAction> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f100440a = cVar;
        this.f100441b = new C41981q0(cVar);
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100440a.accept((BeduinTooltipAction) beduinAction);
    }
}
