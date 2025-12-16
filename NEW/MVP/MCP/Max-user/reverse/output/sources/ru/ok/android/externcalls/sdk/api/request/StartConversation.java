package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import defpackage.gy7;
import defpackage.km;
import defpackage.nm;
import defpackage.nua;
import defpackage.om;
import defpackage.ox7;
import defpackage.tha;
import defpackage.tl0;
import defpackage.ul;
import defpackage.ul0;
import defpackage.wm;
import defpackage.wm6;
import defpackage.wo7;
import defpackage.yl;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/StartConversation;", "", "()V", "Companion", "Request", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StartConversation {
    private static final String LOG_TAG = "StartConversation";
    public static final String METHOD_NAME = "vchat.startConversation";

    @Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003Bµ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00120\u0010\u0016\u001a,\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012j\u0002`\u0015\u00120\u0010\u0018\u001a,\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012j\u0002`\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0018\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b&\u0010%J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040*8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001c\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00020/0.8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u001c\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040.8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00101R\u0014\u00108\u001a\u0002058VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/StartConversation$Request;", "Lkm;", "Lnua;", "Lyl;", "Lru/ok/android/externcalls/sdk/api/CallInfo;", "", "servers", "cid", "", "createLink", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "opponent", "", "", "opponentInternalIds", "opponentExternalIds", "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "params", "Lkotlin/Function4;", "Ltl0;", "Lqqg;", "Lru/ok/android/externcalls/sdk/api/request/AddParamsCallback;", "addParamsCallback", "Lru/ok/android/externcalls/sdk/api/request/AddParamsByExternalOpponentIdsCallback;", "addParamsByExternalOpponentIdsCallback", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lwm6;Lwm6;)V", "canRepeat", "()Z", "shouldGzip", "shouldPost", "shouldReport", "willWriteParams", "willWriteSupplyParams", "Lgy7;", "writer", "writeParams", "(Lgy7;)V", "writeSupplyParams", "", "handleInterruptedIO", "()Ljava/lang/Object;", "Lul;", "getConfigExtractor", "()Lul;", "configExtractor", "Lox7;", "Lru/ok/android/api/core/ApiInvocationException;", "getFailParser", "()Lox7;", "failParser", "getOkParser", "okParser", "", "getPriority", "()I", LogFactory.PRIORITY_KEY, "Lnm;", "getScope", "()Lnm;", "scope", "Lom;", "getScopeAfter", "()Lom;", "scopeAfter", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Request implements km, nua, yl {
        private final /* synthetic */ ul0 $$delegate_0;

        public Request(String str, String str2, boolean z, ConversationParticipant conversationParticipant, List<Long> list, List<String> list2, StartCallApiParams startCallApiParams, wm6 wm6Var, wm6 wm6Var2) {
            tl0 tl0Var = new tl0(wm.a(StartConversation.METHOD_NAME));
            tl0Var.b = nm.c;
            tl0Var.c(ApiProtocol.PARAM_IS_VIDEO, startCallApiParams.getIsVideo());
            tl0Var.b(ApiProtocol.PARAM_TURN_SERVERS, str);
            tl0Var.b(ApiProtocol.PARAM_CONVERSATION_ID, str2);
            tl0Var.c(ApiProtocol.PARAM_CREATE_JOIN_LINK, z);
            if (startCallApiParams.getIsMultipleDevicesEnabled()) {
                GlobalRTCLogger.log(StartConversation.LOG_TAG, "FEATURE_VOIP_MULTIPLE_DEVICES: Using protocolVersion = 6");
                tl0Var.c.a(new wo7(ApiProtocol.PARAM_PROTOCOL_VERSION, 6));
            }
            String domainId = startCallApiParams.getDomainId();
            if (domainId != null) {
                tl0Var.b(ApiProtocol.PARAM_DOMAIN_ID, domainId);
            }
            String payload = startCallApiParams.getPayload();
            if (payload != null) {
                tl0Var.b(ApiProtocol.PARAM_PAYLOAD, payload);
            }
            if (list != null) {
                wm6Var.invoke(conversationParticipant, list, startCallApiParams, tl0Var);
            }
            if (list2 != null) {
                wm6Var2.invoke(conversationParticipant, list2, startCallApiParams, tl0Var);
            }
            tl0Var.c(ApiProtocol.PARAM_ONLY_ADMIN_CAN_SHARE_MOVIE, !startCallApiParams.getIsWatchTogetherEnabledForAll());
            this.$$delegate_0 = tl0Var.a(CallInfo.INSTANCE.getPARSER());
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
            return new CallInfo(null, null, null, null, null, null, false, null, null, false, 0, 2047, null);
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
}
