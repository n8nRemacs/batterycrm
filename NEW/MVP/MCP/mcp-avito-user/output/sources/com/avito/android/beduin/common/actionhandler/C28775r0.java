package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15522a;
import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinOpenSearchFiltersAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.SearchParamsConverter;
import hi.C40942b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinOpenSearchFiltersActionHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/r0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.r0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28775r0 implements InterfaceC15523b<BeduinOpenSearchFiltersAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15522a f100368a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C40942b f100369b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.form.store.b f100370c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f100371d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100372e;

    @Inject
    public C28775r0(@Y61.k InterfaceC15522a interfaceC15522a, @Y61.k C40942b c40942b, @Y61.k com.avito.android.beduin.common.form.store.b bVar, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k h31.e<InterfaceC15523b<BeduinAction>> eVar) {
        this.f100368a = interfaceC15522a;
        this.f100369b = c40942b;
        this.f100370c = bVar;
        this.f100371d = searchParamsConverter;
        this.f100372e = eVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100368a.b(new C28770o0(0, this, (BeduinOpenSearchFiltersAction) beduinAction));
    }
}
