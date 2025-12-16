package ru.ok.android.externcalls.sdk.api.log;

import android.net.Uri;
import defpackage.gke;
import defpackage.hm;
import defpackage.ho7;
import defpackage.imb;
import defpackage.jm;
import defpackage.km;
import defpackage.o2c;
import defpackage.qm;
import defpackage.rm;
import defpackage.sl;
import defpackage.tk4;
import defpackage.tl;
import defpackage.wy1;
import defpackage.xx7;
import defpackage.y6d;
import defpackage.yx7;
import java.io.IOException;
import java.io.StringWriter;
import kotlin.Metadata;
import org.json.JSONException;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 12\u00020\u0001:\u00011B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010$\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J'\u0010'\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010&\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ok/android/externcalls/sdk/api/log/LoggingApiRequestDebugger;", "Ljm;", "Ly6d;", "log", "Lrm;", "sessionStore", "<init>", "(Ly6d;Lrm;)V", "Landroid/net/Uri;", "requestUri", "", "transformUriForLog", "(Landroid/net/Uri;)Ljava/lang/String;", "uriString", "Limb;", "extractHostAndScheme", "(Ljava/lang/String;)Limb;", "Lhm;", "request", "getParams", "(Lhm;)Ljava/lang/String;", "jsonString", "eraseSecrets", "(Ljava/lang/String;)Ljava/lang/String;", "getRawParams", "Lsl;", "engine", "Ltl;", "config", "Lqqg;", "debugApiRequest", "(Lsl;Lhm;Ltl;)V", "Lxx7;", "reader", "debugApiResponseOk", "(Lsl;Lhm;Lxx7;)Lxx7;", "debugApiResponseFail", "Lru/ok/android/api/core/ApiException;", "exception", "debugApiException", "(Lsl;Lhm;Lru/ok/android/api/core/ApiException;)V", "Ljava/io/IOException;", "debugIoException", "(Lsl;Lhm;Ljava/io/IOException;)V", "Ly6d;", "Lrm;", "Lru/ok/android/externcalls/sdk/api/log/RequestSecretEraser;", "secretEraser", "Lru/ok/android/externcalls/sdk/api/log/RequestSecretEraser;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LoggingApiRequestDebugger implements jm {
    private static final Companion Companion = new Companion(null);
    private static final String ERASED_SECRET = "<ERASED_SECRET>";
    private static final String TAG = "CallsApiDebug";
    private final y6d log;
    private final RequestSecretEraser secretEraser = new RequestSecretEraser(gke.h(ApiProtocol.KEY_TOKEN, "auth_data", "credential", "auth_token", "session_data"), ERASED_SECRET);
    private final rm sessionStore;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/api/log/LoggingApiRequestDebugger$Companion;", "", "()V", "ERASED_SECRET", "", "TAG", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    public LoggingApiRequestDebugger(y6d y6dVar, rm rmVar) {
        this.log = y6dVar;
        this.sessionStore = rmVar;
    }

    private final String eraseSecrets(String jsonString) {
        try {
            return this.secretEraser.eraseSecrets(jsonString);
        } catch (JSONException e) {
            this.log.logException(TAG, "can't erase secrets from json", e);
            return ERASED_SECRET;
        }
    }

    private final imb extractHostAndScheme(String uriString) {
        Uri uri = Uri.parse(uriString);
        return new imb(uri.getScheme(), uri.getHost());
    }

    private final String getParams(hm request) {
        return eraseSecrets(getRawParams(request));
    }

    private final String getRawParams(hm request) {
        StringWriter stringWriter = new StringWriter();
        o2c o2cVar = new o2c(stringWriter);
        try {
            o2cVar.p();
            request.writeParams(o2cVar);
            o2cVar.n();
            o2cVar.flush();
        } catch (Exception unused) {
            this.log.log(TAG, "failed to log request params");
        }
        return stringWriter.toString();
    }

    private final String transformUriForLog(Uri requestUri) {
        qm sessionInfo;
        rm rmVar = this.sessionStore;
        String str = (rmVar == null || (sessionInfo = rmVar.getSessionInfo()) == null) ? null : sessionInfo.c;
        if (str == null) {
            return requestUri.toString();
        }
        imb imbVarExtractHostAndScheme = extractHostAndScheme(str);
        String str2 = (String) imbVarExtractHostAndScheme.a;
        String str3 = (String) imbVarExtractHostAndScheme.b;
        return (str2 == null || str3 == null) ? requestUri.toString() : requestUri.buildUpon().scheme(str2).authority(str3).build().toString();
    }

    @Override // defpackage.jm
    public void debugApiException(sl engine, hm request, ApiException exception) throws IOException {
        this.log.logException(TAG, ho7.i("API request ", transformUriForLog(request.getUri()), " failed with API Exception"), exception);
    }

    @Override // defpackage.jm
    public void debugApiRequest(sl engine, hm request, tl config) throws IOException {
        this.log.log(TAG, wy1.i("API request ", transformUriForLog(request.getUri()), " ", request instanceof km ? wy1.h("start with params ", getParams(request)) : ""));
    }

    @Override // defpackage.jm
    public xx7 debugApiResponseFail(sl engine, hm request, xx7 reader) throws IOException {
        String strR = reader.R();
        this.log.log(TAG, wy1.i("API request ", transformUriForLog(request.getUri()), " failed with response ", eraseSecrets(strR)));
        return yx7.d(strR);
    }

    @Override // defpackage.jm
    public xx7 debugApiResponseOk(sl engine, hm request, xx7 reader) throws IOException {
        String strR = reader.R();
        this.log.log(TAG, wy1.i("API request ", transformUriForLog(request.getUri()), " success ", request instanceof km ? wy1.h("with response ", eraseSecrets(strR)) : ""));
        return yx7.d(strR);
    }

    @Override // defpackage.jm
    public void debugIoException(sl engine, hm request, IOException exception) throws IOException {
        this.log.logException(TAG, ho7.i("API request ", transformUriForLog(request.getUri()), " failed with IO Exception"), exception);
    }
}
