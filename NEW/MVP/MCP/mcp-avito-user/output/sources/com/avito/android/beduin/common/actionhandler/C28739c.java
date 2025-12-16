package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinDefaultAction;
import com.avito.android.beduin_models.BeduinAction;
import gj.InterfaceC40691b;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinActionHandlerWrapperWithCustom.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/c;", "LUi/b;", "Lcom/avito/android/beduin_models/BeduinAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28739c implements InterfaceC15523b<BeduinAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<Class<? extends BeduinAction>, InterfaceC15523b<? extends BeduinAction>> f100181a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.context.di.h f100182b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinDefaultAction> f100183c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f100184d;

    @Inject
    public C28739c(@Y61.k Map<Class<? extends BeduinAction>, InterfaceC15523b<? extends BeduinAction>> map, @Y61.k com.avito.android.beduin.context.di.h hVar, @Y61.k InterfaceC15523b<BeduinDefaultAction> interfaceC15523b, @Y61.k InterfaceC40691b interfaceC40691b) {
        this.f100181a = map;
        this.f100182b = hVar;
        this.f100183c = interfaceC15523b;
        this.f100184d = interfaceC40691b;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(@Y61.k BeduinAction beduinAction) {
        InterfaceC15523b<? extends BeduinAction> interfaceC15523b = this.f100181a.get(beduinAction.getClass());
        kotlin.G0 g02 = null;
        InterfaceC15523b<? extends BeduinAction> interfaceC15523b2 = interfaceC15523b instanceof InterfaceC15523b ? interfaceC15523b : null;
        Object obj = this.f100182b.f103585a.get(beduinAction.getClass());
        com.avito.android.beduin_shared.model.action.custom.c cVar = obj instanceof com.avito.android.beduin_shared.model.action.custom.c ? (com.avito.android.beduin_shared.model.action.custom.c) obj : null;
        if (cVar != null) {
            cVar.a(beduinAction, this.f100184d);
            return;
        }
        if (interfaceC15523b2 != null) {
            interfaceC15523b2.o(beduinAction);
            g02 = kotlin.G0.f406611a;
        }
        if (g02 == null) {
            this.f100183c.o(new BeduinDefaultAction());
        }
    }
}
