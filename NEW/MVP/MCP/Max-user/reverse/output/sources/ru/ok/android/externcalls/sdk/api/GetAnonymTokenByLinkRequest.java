package ru.ok.android.externcalls.sdk.api;

import android.net.Uri;
import defpackage.gm;
import defpackage.h0;
import defpackage.nm;
import defpackage.om;
import defpackage.os5;
import defpackage.ox7;
import defpackage.tha;
import defpackage.ul;
import defpackage.wm;
import defpackage.xx7;
import defpackage.yl;
import java.io.IOException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonParseException;

/* loaded from: classes2.dex */
public class GetAnonymTokenByLinkRequest extends h0 implements yl {
    private static final ox7 PARSER = new os5(16);
    public final String joinLink;
    public final String name;

    public static final class Response {
        public final String token;
        public final String uid;

        public Response(String str, String str2) {
            this.uid = str;
            this.token = str2;
        }
    }

    public GetAnonymTokenByLinkRequest(String str, String str2) {
        this.joinLink = str;
        this.name = str2;
    }

    public static boolean isAuthRequired(ApiInvocationException apiInvocationException) {
        return apiInvocationException.a == 457;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Response lambda$static$0(xx7 xx7Var) throws JsonParseException, IOException {
        xx7Var.p();
        String strB = null;
        String strB2 = null;
        while (xx7Var.hasNext()) {
            String strName = xx7Var.name();
            strName.getClass();
            if (strName.equals("uid")) {
                strB = xx7Var.B();
            } else if (strName.equals(ApiProtocol.KEY_TOKEN)) {
                strB2 = xx7Var.B();
            } else {
                xx7Var.v();
            }
        }
        xx7Var.n();
        return new Response(strB, strB2);
    }

    @Override // defpackage.yl
    public /* bridge */ /* synthetic */ ul getConfigExtractor() {
        return ul.f;
    }

    @Override // defpackage.yl
    public /* bridge */ /* synthetic */ ox7 getFailParser() {
        return tha.c;
    }

    @Override // defpackage.yl
    public ox7 getOkParser() {
        return PARSER;
    }

    @Override // defpackage.hm
    public /* bridge */ /* synthetic */ int getPriority() {
        return 16;
    }

    @Override // defpackage.hm
    public /* bridge */ /* synthetic */ nm getScope() {
        return nm.d;
    }

    @Override // defpackage.yl
    public /* bridge */ /* synthetic */ om getScopeAfter() {
        return om.a;
    }

    @Override // defpackage.hm
    public Uri getUri() {
        return wm.a("vchat.getAnonymTokenByLink");
    }

    @Override // defpackage.h0
    public void populateParams(gm gmVar) {
        gmVar.b(ApiProtocol.PARAM_JOIN_LINK, this.joinLink);
        gmVar.b("anonymName", this.name);
    }

    @Override // defpackage.hm
    public /* bridge */ /* synthetic */ boolean shouldGzip() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean shouldReport() {
        return true;
    }

    public GetAnonymTokenByLinkRequest(String str) {
        this(str, null);
    }
}
