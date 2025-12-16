package com.avito.android.beduin.common.actionhandler;

import com.avito.android.beduin.common.action.BeduinOpenLocalDeeplinkAction;
import com.avito.android.beduin.common.local_deeplink.a;
import com.avito.android.beduin_models.BeduinAction;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinOpenLocalDeeplinkActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/k0;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/beduin/common/action/BeduinOpenLocalDeeplinkAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.k0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28762k0 implements com.avito.android.beduin_shared.model.action.custom.c<BeduinOpenLocalDeeplinkAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.local_deeplink.b f100270a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.local_deeplink.e f100271b;

    @Inject
    public C28762k0(@Y61.k com.avito.android.beduin.common.local_deeplink.b bVar, @Y61.k com.avito.android.beduin.common.local_deeplink.e eVar) {
        this.f100270a = bVar;
        this.f100271b = eVar;
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        a.C3101a c3101aA = this.f100270a.a(((BeduinOpenLocalDeeplinkAction) beduinAction).getLink());
        if (c3101aA != null) {
            this.f100271b.b(c3101aA);
        }
    }
}
