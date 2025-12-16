package com.yandex.div.core;

import android.net.Uri;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.DivAction;
import com.yandex.div2.w8;
import j.InterfaceC42153i;
import org.json.JSONObject;
import t21.InterfaceC48467b;

/* compiled from: DivActionHandler.java */
@InterfaceC48467b
/* renamed from: com.yandex.div.core.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37916k {
    private static final String AUTHORITY_HIDE_TOOLTIP = "hide_tooltip";
    private static final String AUTHORITY_SET_VARIABLE = "set_variable";
    private static final String AUTHORITY_SHOW_TOOLTIP = "show_tooltip";
    private static final String AUTHORITY_SWITCH_STATE = "set_state";
    private static final String AUTHORITY_TIMER = "timer";
    private static final String AUTHORITY_VIDEO = "video";
    private static final String PARAM_ACTION = "action";
    private static final String PARAM_ID = "id";
    private static final String PARAM_STATE_ID = "state_id";
    private static final String PARAM_TEMPORARY = "temporary";
    private static final String PARAM_VARIABLE_NAME = "name";
    private static final String PARAM_VARIABLE_VALUE = "value";
    private static final String SCHEME_DIV_ACTION = "div-action";

    public boolean getUseActionUid() {
        return false;
    }

    @InterfaceC42153i
    public boolean handleAction(@j.N DivAction divAction, @j.N n0 n0Var) {
        com.yandex.div.json.expressions.b<Uri> bVar = divAction.f371220e;
        Uri uriA = bVar != null ? bVar.a(n0Var.getExpressionResolver()) : null;
        if (!com.yandex.div.core.downloader.e.a(uriA, n0Var)) {
            return handleActionUrl(uriA, n0Var);
        }
        C38029k c38029k = (C38029k) n0Var;
        com.yandex.div.json.expressions.b<Uri> bVar2 = divAction.f371220e;
        Uri uriA2 = bVar2 != null ? bVar2.a(c38029k.getExpressionResolver()) : null;
        if (uriA2 == null) {
            return false;
        }
        com.yandex.div.core.downloader.e.f367428a.getClass();
        if (uriA2.getQueryParameter(ContextActionHandler.Link.URL) == null) {
            return false;
        }
        c38029k.h(c38029k.getDiv2Component().c().a());
        return true;
    }

    public final boolean handleActionUrl(@j.P Uri uri, @j.N n0 n0Var) {
        if (uri != null && SCHEME_DIV_ACTION.equals(uri.getScheme())) {
            return handleAction(uri, n0Var);
        }
        return false;
    }

    @InterfaceC42153i
    @Deprecated
    public boolean handleUri(@j.N Uri uri, @j.N n0 n0Var) {
        return handleActionUrl(uri, n0Var);
    }

    @InterfaceC42153i
    public boolean handleAction(@j.N DivAction divAction, @j.N n0 n0Var, @j.N String str) {
        return handleAction(divAction, n0Var);
    }

    @InterfaceC42153i
    public boolean handleAction(@j.N w8 w8Var, @j.N n0 n0Var) {
        com.yandex.div.json.expressions.b<Uri> bVar = w8Var.f376955e;
        Uri uriA = bVar != null ? bVar.a(n0Var.getExpressionResolver()) : null;
        if (com.yandex.div.core.downloader.e.a(uriA, n0Var)) {
            C38029k c38029k = (C38029k) n0Var;
            com.yandex.div.json.expressions.b<Uri> bVar2 = w8Var.f376955e;
            Uri uriA2 = bVar2 != null ? bVar2.a(c38029k.getExpressionResolver()) : null;
            if (uriA2 == null) {
                return false;
            }
            com.yandex.div.core.downloader.e.f367428a.getClass();
            if (uriA2.getQueryParameter(ContextActionHandler.Link.URL) == null) {
                return false;
            }
            c38029k.h(c38029k.getDiv2Component().c().a());
            return true;
        }
        return handleActionUrl(uriA, n0Var);
    }

    @InterfaceC42153i
    public boolean handleAction(@j.N w8 w8Var, @j.N n0 n0Var, @j.N String str) {
        return handleAction(w8Var, n0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x035d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean handleAction(@j.N android.net.Uri r13, @j.N com.yandex.div.core.n0 r14) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.C37916k.handleAction(android.net.Uri, com.yandex.div.core.n0):boolean");
    }

    public void handlePayload(@j.N JSONObject jSONObject) {
    }
}
