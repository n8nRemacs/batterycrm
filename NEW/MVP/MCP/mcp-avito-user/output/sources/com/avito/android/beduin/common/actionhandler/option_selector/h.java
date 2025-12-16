package com.avito.android.beduin.common.actionhandler.option_selector;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.OpenOptionSelectorAction;
import com.avito.android.beduin_models.BeduinAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OpenOptionSelectorActionHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f100313l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ OpenOptionSelectorAction f100314m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(OpenOptionSelectorAction openOptionSelectorAction, i iVar) {
        super(0);
        this.f100313l = iVar;
        this.f100314m = openOptionSelectorAction;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC15523b<BeduinAction> interfaceC15523b = this.f100313l.f100318d.get();
        OpenOptionSelectorAction.ClearSelected clearSelected = this.f100314m.getScreenSettings().getClearSelected();
        com.avito.android.beduin_shared.model.utils.a.a(interfaceC15523b, clearSelected != null ? clearSelected.c() : null);
        return G0.f406611a;
    }
}
