package com.avito.android.beduin.common.actionhandler;

import Hr.InterfaceC14024a;
import Ui.InterfaceC15523b;
import android.net.Uri;
import com.avito.android.beduin.common.action.BeduinOpenUniversalPageV2Action;
import com.avito.android.beduin.common.action.RequestInfo;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.avito.android.beduin_shared.model.action.BeduinOpenDeeplinkAction;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.util.A4;
import com.avito.android.util.C35809h6;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinOpenUniversalPageV2ActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/y0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinOpenUniversalPageV2Action;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.y0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28789y0 implements InterfaceC15523b<BeduinOpenUniversalPageV2Action> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final lj.c f100519a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C28743d0 f100520b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14024a f100521c;

    @Inject
    public C28789y0(@Y61.k lj.c cVar, @Y61.k C28743d0 c28743d0, @Y61.k InterfaceC14024a interfaceC14024a) {
        this.f100519a = cVar;
        this.f100520b = c28743d0;
        this.f100521c = interfaceC14024a;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        String screenName;
        String url;
        BeduinOpenUniversalPageV2Action beduinOpenUniversalPageV2Action = (BeduinOpenUniversalPageV2Action) beduinAction;
        RequestInfo request = beduinOpenUniversalPageV2Action.getRequest();
        LinkedHashMap linkedHashMapA = this.f100519a.a(request != null ? request.getFormParamsMap() : null);
        A4.f318516a.getClass();
        Map mapI = A4.i(linkedHashMapA, true);
        RequestInfo request2 = beduinOpenUniversalPageV2Action.getRequest();
        String string = (request2 == null || (url = request2.getUrl()) == null) ? null : C35809h6.d(Uri.parse(url), mapI).toString();
        ScreenStyle presentationStyle = beduinOpenUniversalPageV2Action.getPresentationStyle();
        String str = presentationStyle != null ? presentationStyle.f133649b : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        BeduinUniversalPageContent content = beduinOpenUniversalPageV2Action.getContent();
        Long lValueOf = content != null ? Long.valueOf(this.f100521c.a(content)) : null;
        String screenName2 = beduinOpenUniversalPageV2Action.getScreenName();
        if (screenName2 == null) {
            BeduinUniversalPageContent content2 = beduinOpenUniversalPageV2Action.getContent();
            screenName = content2 != null ? content2.getScreenName() : null;
        } else {
            screenName = screenName2;
        }
        BeduinUniversalPageLink beduinUniversalPageLink = new BeduinUniversalPageLink(string, str2, screenName, lValueOf, beduinOpenUniversalPageV2Action.getForcedThemeMode(), beduinOpenUniversalPageV2Action.getTheme(), beduinOpenUniversalPageV2Action.getBottomSheetContentPaddings());
        if (string == null && beduinOpenUniversalPageV2Action.getContent() == null) {
            return;
        }
        this.f100520b.f100228a.accept(new BeduinOpenDeeplinkAction(beduinUniversalPageLink).getDeeplink());
    }
}
