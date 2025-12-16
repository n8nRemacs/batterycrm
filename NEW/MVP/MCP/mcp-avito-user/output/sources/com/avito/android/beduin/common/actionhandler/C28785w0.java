package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import android.net.Uri;
import com.avito.android.beduin.common.action.BeduinOpenUniversalPageAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.BeduinOpenDeeplinkAction;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.util.A4;
import com.avito.android.util.C35809h6;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinOpenUniversalPageActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/w0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinOpenUniversalPageAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.w0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28785w0 implements InterfaceC15523b<BeduinOpenUniversalPageAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final lj.c f100509a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C28743d0 f100510b;

    @Inject
    public C28785w0(@Y61.k lj.c cVar, @Y61.k C28743d0 c28743d0) {
        this.f100509a = cVar;
        this.f100510b = c28743d0;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinOpenUniversalPageAction beduinOpenUniversalPageAction = (BeduinOpenUniversalPageAction) beduinAction;
        LinkedHashMap linkedHashMapA = this.f100509a.a(beduinOpenUniversalPageAction.getFormParamsMap());
        A4.f318516a.getClass();
        Map mapI = A4.i(linkedHashMapA, true);
        String requestUrl = beduinOpenUniversalPageAction.getRequestUrl();
        if (requestUrl == null) {
            requestUrl = "";
        }
        String string = C35809h6.d(Uri.parse(requestUrl), mapI).toString();
        ScreenStyle presentationStyle = beduinOpenUniversalPageAction.getPresentationStyle();
        String str = presentationStyle != null ? presentationStyle.f133649b : null;
        this.f100510b.f100228a.accept(new BeduinOpenDeeplinkAction(new BeduinUniversalPageLink(string, str == null ? "" : str, beduinOpenUniversalPageAction.getScreenName(), null, beduinOpenUniversalPageAction.getForcedThemeMode(), beduinOpenUniversalPageAction.getTheme(), null, 72, null)).getDeeplink());
    }
}
