package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15522a;
import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinShowFiltersAction;
import com.avito.android.beduin_models.BeduinAction;
import javax.inject.Inject;
import kotlin.Metadata;
import lj.InterfaceC43780b;

/* compiled from: BeduinShowFiltersActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/n1;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinShowFiltersAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n1 implements InterfaceC15523b<BeduinShowFiltersAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15522a f100288a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43780b f100289b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100290c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f100291d;

    @Inject
    public n1(@Y61.k InterfaceC15522a interfaceC15522a, @Y61.k InterfaceC43780b interfaceC43780b, @Y61.k h31.e<InterfaceC15523b<BeduinAction>> eVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f100288a = interfaceC15522a;
        this.f100289b = interfaceC43780b;
        this.f100290c = eVar;
        this.f100291d = aVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100288a.b(new C28770o0(2, (BeduinShowFiltersAction) beduinAction, this));
    }
}
