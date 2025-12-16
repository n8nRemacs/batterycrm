package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinCopyTextAction;
import com.avito.android.beduin.common.action.BeduinToastAction;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin_models.BeduinAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinCopyTextActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/A;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinCopyTextAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class A implements InterfaceC15523b<BeduinCopyTextAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.U f100044a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.actionhandler.toast.a f100045b;

    @Inject
    public A(@Y61.k com.avito.android.util.U u12, @Y61.k com.avito.android.beduin.common.actionhandler.toast.a aVar) {
        this.f100044a = u12;
        this.f100045b = aVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinCopyTextAction beduinCopyTextAction = (BeduinCopyTextAction) beduinAction;
        this.f100044a.a(beduinCopyTextAction.getText());
        BeduinComponentTheme beduinComponentTheme = null;
        this.f100045b.f100420a.accept(new BeduinToastAction(beduinComponentTheme, BeduinToastAction.Style.DEFAULT, beduinCopyTextAction.getToastMessage(), null, null, null, null, null, null, null, 1008, null));
    }
}
