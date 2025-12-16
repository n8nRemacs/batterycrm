package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import ci.InterfaceC27197a;
import com.avito.android.beduin.common.action.BeduinConditionalAction;
import com.avito.android.beduin_models.BeduinAction;
import javax.inject.Inject;
import kotlin.Metadata;
import mj.InterfaceC44087a;

/* compiled from: BeduinConditionalActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/y;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinConditionalAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28788y implements InterfaceC15523b<BeduinConditionalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC27197a> f100516a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100517b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44087a> f100518c;

    @Inject
    public C28788y(@Y61.k h31.e<InterfaceC27197a> eVar, @Y61.k h31.e<InterfaceC15523b<BeduinAction>> eVar2, @Y61.k h31.e<InterfaceC44087a> eVar3) {
        this.f100516a = eVar;
        this.f100517b = eVar2;
        this.f100518c = eVar3;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinConditionalAction beduinConditionalAction = (BeduinConditionalAction) beduinAction;
        com.avito.android.beduin_shared.model.utils.a.a(this.f100517b.get(), beduinConditionalAction.getCondition().check(kotlin.collections.P0.k(this.f100516a.get().b(), this.f100518c.get().b())) ? beduinConditionalAction.getWhenTrueActions() : beduinConditionalAction.getWhenFalseActions());
    }
}
