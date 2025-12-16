package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15522a;
import Ui.InterfaceC15523b;
import android.net.Uri;
import com.avito.android.beduin.common.action.BeduinOpenLinkAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.util.A4;
import com.avito.android.util.C35809h6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinOpenLinkActionHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/i0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinOpenLinkAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.i0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28758i0 implements InterfaceC15523b<BeduinOpenLinkAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f100253a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15522a f100254b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final lj.c f100255c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f100256d;

    @Inject
    public C28758i0(@Y61.k com.avito.android.deep_linking.x xVar, @Y61.k InterfaceC15522a interfaceC15522a, @Y61.k lj.c cVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f100253a = xVar;
        this.f100254b = interfaceC15522a;
        this.f100255c = cVar;
        this.f100256d = aVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinOpenLinkAction beduinOpenLinkAction = (BeduinOpenLinkAction) beduinAction;
        DeepLink deepLinkE = this.f100253a.e(C35809h6.d(Uri.parse(beduinOpenLinkAction.getLink()), A4.j(A4.f318516a, this.f100255c.a(beduinOpenLinkAction.getFormParamsMap()))));
        if (!(deepLinkE instanceof NoMatchLink)) {
            b.a.a(this.f100256d, deepLinkE, null, null, 6);
        } else {
            this.f100254b.b(new Ae0.c(beduinOpenLinkAction, 28));
        }
    }
}
