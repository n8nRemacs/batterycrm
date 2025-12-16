package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import defpackage.gy7;
import defpackage.km;
import defpackage.nm;
import defpackage.nua;
import defpackage.om;
import defpackage.ox7;
import defpackage.q4j;
import defpackage.r4j;
import defpackage.tha;
import defpackage.ul;
import defpackage.uy0;
import defpackage.wm;
import defpackage.xx7;
import defpackage.yl;
import java.io.IOException;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonSerializeException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/ClientSupportedCodecs;", "", "()V", "Companion", "Request", "Response", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ClientSupportedCodecs {
    public static final String METHOD_NAME = "vchat.clientSupportedCodecs";

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/ClientSupportedCodecs$Request;", "Lkm;", "Lnua;", "Lyl;", "Lru/ok/android/externcalls/sdk/api/request/ClientSupportedCodecs$Response;", "Lorg/json/JSONObject;", "json", "<init>", "(Lorg/json/JSONObject;)V", "", "shouldPost", "()Z", "shouldGzip", "shouldReport", "canRepeat", "Lgy7;", "writer", "Lqqg;", "writeParams", "(Lgy7;)V", "", "handleInterruptedIO", "()Ljava/lang/Object;", "Lorg/json/JSONObject;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Lnm;", "getScope", "()Lnm;", "scope", "", "getPriority", "()I", LogFactory.PRIORITY_KEY, "Lox7;", "getOkParser", "()Lox7;", "okParser", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Request implements km, nua, yl {
        private final JSONObject json;

        public Request(JSONObject jSONObject) {
            this.json = jSONObject;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Response _get_okParser_$lambda$0(xx7 xx7Var) {
            return new Response(q4j.b(xx7Var).optBoolean("success", false));
        }

        public boolean canRepeat() {
            return true;
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
            return new uy0(29);
        }

        @Override // defpackage.hm
        public int getPriority() {
            return 2;
        }

        @Override // defpackage.hm
        public nm getScope() {
            return nm.c;
        }

        @Override // defpackage.yl
        public /* bridge */ /* synthetic */ om getScopeAfter() {
            return om.a;
        }

        @Override // defpackage.hm
        public Uri getUri() {
            return wm.a(ClientSupportedCodecs.METHOD_NAME);
        }

        @Override // defpackage.nua
        public Object handleInterruptedIO() {
            return new Response(false);
        }

        @Override // defpackage.hm
        public boolean shouldGzip() {
            return true;
        }

        @Override // defpackage.hm
        public boolean shouldPost() {
            return true;
        }

        public boolean shouldReport() {
            return false;
        }

        @Override // defpackage.hm
        public /* bridge */ /* synthetic */ boolean willWriteParams() {
            return true;
        }

        @Override // defpackage.hm
        public /* bridge */ /* synthetic */ boolean willWriteSupplyParams() {
            return false;
        }

        @Override // defpackage.hm
        public void writeParams(gy7 writer) throws JsonSerializeException, IOException {
            writer.b0("data");
            r4j.c(writer, this.json);
        }

        @Override // defpackage.hm
        public /* bridge */ /* synthetic */ void writeSupplyParams(gy7 gy7Var) throws JsonSerializeException, IOException {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/ClientSupportedCodecs$Response;", "", "success", "", "(Z)V", "getSuccess", "()Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Response {
        private final boolean success;

        public Response(boolean z) {
            this.success = z;
        }

        public final boolean getSuccess() {
            return this.success;
        }
    }
}
