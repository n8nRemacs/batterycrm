package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import defpackage.gm;
import defpackage.gy7;
import defpackage.km;
import defpackage.nm;
import defpackage.nua;
import defpackage.om;
import defpackage.os5;
import defpackage.ox7;
import defpackage.sm6;
import defpackage.tha;
import defpackage.tk4;
import defpackage.tl0;
import defpackage.ul;
import defpackage.ul0;
import defpackage.wm;
import defpackage.wo7;
import defpackage.xx7;
import defpackage.yl;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/JoinConversation;", "", "()V", "Companion", "Request", "Response", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JoinConversation {
    private static final String LOG_TAG = "JoinConversation";
    public static final String METHOD_NAME = "vchat.joinConversation";

    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040!8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0%8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040%8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0014\u0010/\u001a\u00020,8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/JoinConversation$Request;", "Lkm;", "Lnua;", "Lyl;", "Lru/ok/android/externcalls/sdk/api/request/JoinConversation$Response;", "", "cid", "", ApiProtocol.PARAM_PEER_ID, "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "params", "Lkotlin/Function2;", "Ltl0;", "Lqqg;", "callback", "<init>", "(Ljava/lang/String;JLru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lsm6;)V", "", "canRepeat", "()Z", "shouldGzip", "shouldPost", "shouldReport", "willWriteParams", "willWriteSupplyParams", "Lgy7;", "writer", "writeParams", "(Lgy7;)V", "writeSupplyParams", "", "handleInterruptedIO", "()Ljava/lang/Object;", "Lul;", "getConfigExtractor", "()Lul;", "configExtractor", "Lox7;", "Lru/ok/android/api/core/ApiInvocationException;", "getFailParser", "()Lox7;", "failParser", "getOkParser", "okParser", "", "getPriority", "()I", LogFactory.PRIORITY_KEY, "Lnm;", "getScope", "()Lnm;", "scope", "Lom;", "getScopeAfter", "()Lom;", "scopeAfter", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Request implements km, nua, yl {
        private final /* synthetic */ ul0 $$delegate_0;

        public Request(String str, long j, StartCallApiParams startCallApiParams, sm6 sm6Var) {
            tl0 tl0Var = new tl0(wm.a(JoinConversation.METHOD_NAME));
            tl0Var.b = nm.c;
            tl0Var.b(ApiProtocol.PARAM_CONVERSATION_ID, str);
            wo7 wo7Var = new wo7(ApiProtocol.PARAM_PEER_ID, j);
            gm gmVar = tl0Var.c;
            gmVar.a(wo7Var);
            tl0Var.c(ApiProtocol.PARAM_IS_VIDEO, startCallApiParams.getIsVideo());
            Long chatId = startCallApiParams.getChatId();
            if (chatId != null) {
                gmVar.a(new wo7(ApiProtocol.PARAM_CHAT_ID, chatId.longValue()));
            }
            if (startCallApiParams.getIsMultipleDevicesEnabled()) {
                GlobalRTCLogger.log(JoinConversation.LOG_TAG, "FEATURE_VOIP_MULTIPLE_DEVICES: Using protocolVersion = 6");
                gmVar.a(new wo7(ApiProtocol.PARAM_PROTOCOL_VERSION, 6));
            }
            sm6Var.invoke(startCallApiParams, tl0Var);
            this.$$delegate_0 = tl0Var.a(Response.INSTANCE.getPARSER());
        }

        public boolean canRepeat() {
            return this.$$delegate_0.c.b;
        }

        @Override // defpackage.yl
        public ul getConfigExtractor() {
            this.$$delegate_0.getClass();
            return ul.f;
        }

        @Override // defpackage.yl
        public ox7 getFailParser() {
            this.$$delegate_0.getClass();
            return tha.c;
        }

        @Override // defpackage.yl
        public ox7 getOkParser() {
            return this.$$delegate_0.d;
        }

        @Override // defpackage.hm
        public int getPriority() {
            this.$$delegate_0.getClass();
            return 16;
        }

        @Override // defpackage.hm
        public nm getScope() {
            return this.$$delegate_0.b;
        }

        @Override // defpackage.yl
        public om getScopeAfter() {
            this.$$delegate_0.getClass();
            return om.a;
        }

        @Override // defpackage.hm
        public Uri getUri() {
            return this.$$delegate_0.a;
        }

        @Override // defpackage.nua
        public Object handleInterruptedIO() {
            return new Response(false, "", "", 0);
        }

        @Override // defpackage.hm
        public boolean shouldGzip() {
            this.$$delegate_0.getClass();
            return false;
        }

        @Override // defpackage.hm
        public boolean shouldPost() {
            return this.$$delegate_0.c.c;
        }

        public boolean shouldReport() {
            this.$$delegate_0.getClass();
            return true;
        }

        @Override // defpackage.hm
        public boolean willWriteParams() {
            return this.$$delegate_0.c.d;
        }

        @Override // defpackage.hm
        public boolean willWriteSupplyParams() {
            return this.$$delegate_0.c.e;
        }

        @Override // defpackage.hm
        public void writeParams(gy7 writer) {
            this.$$delegate_0.writeParams(writer);
        }

        @Override // defpackage.hm
        public void writeSupplyParams(gy7 writer) {
            this.$$delegate_0.writeSupplyParams(writer);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/JoinConversation$Response;", "", "p2pForbidden", "", ApiProtocol.KEY_ENDPOINT, "", "wtEndpoint", "deviceIndex", "", "(ZLjava/lang/String;Ljava/lang/String;I)V", "getDeviceIndex", "()I", "getEndpoint", "()Ljava/lang/String;", "getP2pForbidden", "()Z", "getWtEndpoint", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Response {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final ox7 PARSER = new os5(25);
        private final int deviceIndex;
        private final String endpoint;
        private final boolean p2pForbidden;
        private final String wtEndpoint;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/JoinConversation$Response$Companion;", "", "<init>", "()V", "Lox7;", "Lru/ok/android/externcalls/sdk/api/request/JoinConversation$Response;", "kotlin.jvm.PlatformType", "PARSER", "Lox7;", "getPARSER", "()Lox7;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(tk4 tk4Var) {
                this();
            }

            public final ox7 getPARSER() {
                return Response.PARSER;
            }

            private Companion() {
            }
        }

        public Response(boolean z, String str, String str2, int i) {
            this.p2pForbidden = z;
            this.endpoint = str;
            this.wtEndpoint = str2;
            this.deviceIndex = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Response PARSER$lambda$0(xx7 xx7Var) {
            xx7Var.p();
            boolean zW = false;
            String strB = "";
            String strB2 = strB;
            int iX = 0;
            while (xx7Var.hasNext()) {
                String strName = xx7Var.name();
                switch (strName.hashCode()) {
                    case -17633304:
                        if (!strName.equals(ApiProtocol.KEY_P2P_FORBIDDEN)) {
                            xx7Var.B();
                            break;
                        } else {
                            zW = xx7Var.W();
                            break;
                        }
                    case 781502804:
                        if (!strName.equals(ApiProtocol.KEY_DEVICE_IDX)) {
                            xx7Var.B();
                            break;
                        } else {
                            iX = xx7Var.x();
                            break;
                        }
                    case 1422043319:
                        if (!strName.equals(ApiProtocol.KEY_WT_ENDPOINT)) {
                            xx7Var.B();
                            break;
                        } else {
                            strB2 = xx7Var.B();
                            break;
                        }
                    case 1741102485:
                        if (!strName.equals(ApiProtocol.KEY_ENDPOINT)) {
                            xx7Var.B();
                            break;
                        } else {
                            strB = xx7Var.B();
                            break;
                        }
                    default:
                        xx7Var.B();
                        break;
                }
            }
            xx7Var.n();
            return new Response(zW, strB, strB2, iX);
        }

        public final int getDeviceIndex() {
            return this.deviceIndex;
        }

        public final String getEndpoint() {
            return this.endpoint;
        }

        public final boolean getP2pForbidden() {
            return this.p2pForbidden;
        }

        public final String getWtEndpoint() {
            return this.wtEndpoint;
        }
    }
}
