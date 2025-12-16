package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15522a;
import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinOpenGalleryAction;
import com.avito.android.beduin_models.BeduinAction;
import gF.InterfaceC40577a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinOpenGalleryActionHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/f0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinOpenGalleryAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.f0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28749f0 implements InterfaceC15523b<BeduinOpenGalleryAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40577a f100237a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15522a f100238b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final lj.c f100239c;

    @Inject
    public C28749f0(@Y61.k InterfaceC40577a interfaceC40577a, @Y61.k InterfaceC15522a interfaceC15522a, @Y61.k lj.c cVar) {
        this.f100237a = interfaceC40577a;
        this.f100238b = interfaceC15522a;
        this.f100239c = cVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100238b.b(new C28770o0(4, (BeduinOpenGalleryAction) beduinAction, this));
    }
}
