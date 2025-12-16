package ru.ok.android.externcalls.sdk.api;

import defpackage.az1;
import defpackage.hd5;
import defpackage.n2c;
import defpackage.ox7;
import defpackage.tk4;
import defpackage.xtd;
import defpackage.xx7;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0015\u001a\u00020\u0016R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/api/CallInfo;", "", ApiProtocol.KEY_ENDPOINT, "", "wtEndpoint", "id", ApiProtocol.KEY_TOKEN, "clientType", ApiProtocol.PARAM_JOIN_LINK, "isConcurrent", "", "turnServer", "", "Lorg/webrtc/PeerConnection$IceServer;", "stunServer", "isP2PForbidden", "deviceIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;ZI)V", "getFormattedJoinLink", "route", "toParams", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final ox7 PARSER;
    public final String clientType;
    public final int deviceIndex;
    public final String endpoint;
    public final String id;
    public final boolean isConcurrent;
    public final boolean isP2PForbidden;
    public final String joinLink;
    public final List<PeerConnection.IceServer> stunServer;
    public final String token;
    public final List<PeerConnection.IceServer> turnServer;
    public final String wtEndpoint;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ok/android/externcalls/sdk/api/CallInfo$Companion;", "", "<init>", "()V", "Lxx7;", "reader", "Lru/ok/android/externcalls/sdk/api/CallInfo;", "parse", "(Lxx7;)Lru/ok/android/externcalls/sdk/api/CallInfo;", "", ApiProtocol.PARAM_CONVERSATION_ID, "startConversationDelegateResultParse", "(Lxx7;Ljava/lang/String;)Lru/ok/android/externcalls/sdk/api/CallInfo;", "Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate$Result$Success;", "result", "createFromStartConversationDelegateResult$calls_sdk_release", "(Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate$Result$Success;)Lru/ok/android/externcalls/sdk/api/CallInfo;", "createFromStartConversationDelegateResult", "Lox7;", "PARSER", "Lox7;", "getPARSER", "()Lox7;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CallInfo parse(xx7 reader) throws JsonTypeMismatchException, IOException {
            reader.p();
            String strB = null;
            String strB2 = null;
            String strB3 = null;
            String strB4 = null;
            String strB5 = null;
            String strB6 = null;
            boolean zW = false;
            boolean zW2 = false;
            int iX = 0;
            List<PeerConnection.IceServer> turn = hd5.a;
            List<PeerConnection.IceServer> stun = turn;
            while (reader.hasNext()) {
                String strName = reader.name();
                switch (strName.hashCode()) {
                    case -494324241:
                        if (!strName.equals(ApiProtocol.KEY_JOIN_LINK)) {
                            reader.v();
                            break;
                        } else {
                            strB6 = reader.B();
                            break;
                        }
                    case -173671634:
                        if (!strName.equals(ApiProtocol.KEY_CLIENT_TYPE)) {
                            reader.v();
                            break;
                        } else {
                            strB5 = reader.B();
                            break;
                        }
                    case -17633304:
                        if (!strName.equals(ApiProtocol.KEY_P2P_FORBIDDEN)) {
                            reader.v();
                            break;
                        } else {
                            zW2 = reader.W();
                            break;
                        }
                    case 3355:
                        if (!strName.equals("id")) {
                            reader.v();
                            break;
                        } else {
                            strB3 = reader.B();
                            break;
                        }
                    case 110541305:
                        if (!strName.equals(ApiProtocol.KEY_TOKEN)) {
                            reader.v();
                            break;
                        } else {
                            strB4 = reader.B();
                            break;
                        }
                    case 781502804:
                        if (!strName.equals(ApiProtocol.KEY_DEVICE_IDX)) {
                            reader.v();
                            break;
                        } else {
                            iX = reader.x();
                            break;
                        }
                    case 828977132:
                        if (!strName.equals(ApiProtocol.KEY_IS_CONCURRENT)) {
                            reader.v();
                            break;
                        } else {
                            zW = reader.W();
                            break;
                        }
                    case 836670789:
                        if (!strName.equals(ApiProtocol.KEY_TURN_SERVER)) {
                            reader.v();
                            break;
                        } else {
                            turn = TurnStunParser.parseTurn(reader);
                            break;
                        }
                    case 1422043319:
                        if (!strName.equals(ApiProtocol.KEY_WT_ENDPOINT)) {
                            reader.v();
                            break;
                        } else {
                            strB2 = reader.B();
                            break;
                        }
                    case 1702739560:
                        if (!strName.equals(ApiProtocol.KEY_STUN_SERVER)) {
                            reader.v();
                            break;
                        } else {
                            stun = TurnStunParser.parseStun(reader);
                            break;
                        }
                    case 1741102485:
                        if (!strName.equals(ApiProtocol.KEY_ENDPOINT)) {
                            reader.v();
                            break;
                        } else {
                            strB = reader.B();
                            break;
                        }
                    default:
                        reader.v();
                        break;
                }
            }
            reader.n();
            return new CallInfo(strB, strB2, strB3, strB4, strB5, strB6, zW, turn, stun, zW2, iX);
        }

        private final CallInfo startConversationDelegateResultParse(xx7 reader, String conversationId) throws JsonTypeMismatchException, IOException {
            reader.p();
            String strB = null;
            String strB2 = null;
            String strB3 = null;
            boolean zW = false;
            int iX = 0;
            List<PeerConnection.IceServer> turn = hd5.a;
            List<PeerConnection.IceServer> stun = turn;
            while (reader.hasNext()) {
                String strName = reader.name();
                switch (strName.hashCode()) {
                    case 3541178:
                        if (!strName.equals("stun")) {
                            reader.v();
                            break;
                        } else {
                            stun = TurnStunParser.parseStun(reader);
                            break;
                        }
                    case 3571837:
                        if (!strName.equals("turn")) {
                            reader.v();
                            break;
                        } else {
                            turn = TurnStunParser.parseTurn(reader);
                            break;
                        }
                    case 25188487:
                        if (!strName.equals("deviceIdx")) {
                            reader.v();
                            break;
                        } else {
                            iX = reader.x();
                            break;
                        }
                    case 684155794:
                        if (!strName.equals("wtEndpoint")) {
                            reader.v();
                            break;
                        } else {
                            strB2 = reader.B();
                            break;
                        }
                    case 694870657:
                        if (!strName.equals("isConcurrent")) {
                            reader.v();
                            break;
                        } else {
                            zW = reader.W();
                            break;
                        }
                    case 1102453157:
                        if (!strName.equals("clientType")) {
                            reader.v();
                            break;
                        } else {
                            strB3 = reader.B();
                            break;
                        }
                    case 1741102485:
                        if (!strName.equals(ApiProtocol.KEY_ENDPOINT)) {
                            reader.v();
                            break;
                        } else {
                            strB = reader.B();
                            break;
                        }
                    default:
                        reader.v();
                        break;
                }
            }
            reader.n();
            return new CallInfo(strB, strB2, conversationId, null, strB3, null, zW, turn, stun, false, iX);
        }

        public final CallInfo createFromStartConversationDelegateResult$calls_sdk_release(StartConversationDelegate.Result.Success result) {
            return startConversationDelegateResultParse(new n2c(result.getInternalCallerParams()), result.getConversationId());
        }

        public final ox7 getPARSER() {
            return CallInfo.PARSER;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        PARSER = new xtd(12, companion);
    }

    public CallInfo() {
        this(null, null, null, null, null, null, false, null, null, false, 0, 2047, null);
    }

    private static final CallInfo parse(xx7 xx7Var) throws JsonTypeMismatchException, IOException {
        return INSTANCE.parse(xx7Var);
    }

    public final String getFormattedJoinLink(String route) {
        return az1.i(route, this.joinLink);
    }

    public final ConversationParams toParams() {
        ConversationParams conversationParams = new ConversationParams();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.turnServer);
        linkedList.addAll(this.stunServer);
        conversationParams.id = this.id;
        conversationParams.clientType = this.clientType;
        conversationParams.endpoint = this.endpoint;
        conversationParams.token = this.token;
        conversationParams.stunTurnServers = linkedList;
        return conversationParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallInfo(String str, String str2, String str3, String str4, String str5, String str6, boolean z, List<? extends PeerConnection.IceServer> list, List<? extends PeerConnection.IceServer> list2, boolean z2, int i) {
        this.endpoint = str;
        this.wtEndpoint = str2;
        this.id = str3;
        this.token = str4;
        this.clientType = str5;
        this.joinLink = str6;
        this.isConcurrent = z;
        this.turnServer = list;
        this.stunServer = list2;
        this.isP2PForbidden = z2;
        this.deviceIndex = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CallInfo(String str, String str2, String str3, String str4, String str5, String str6, boolean z, List list, List list2, boolean z2, int i, int i2, tk4 tk4Var) {
        str = (i2 & 1) != 0 ? null : str;
        str2 = (i2 & 2) != 0 ? null : str2;
        str3 = (i2 & 4) != 0 ? null : str3;
        str4 = (i2 & 8) != 0 ? null : str4;
        str5 = (i2 & 16) != 0 ? null : str5;
        str6 = (i2 & 32) != 0 ? null : str6;
        z = (i2 & 64) != 0 ? false : z;
        int i3 = i2 & 128;
        hd5 hd5Var = hd5.a;
        this(str, str2, str3, str4, str5, str6, z, i3 != 0 ? hd5Var : list, (i2 & 256) != 0 ? hd5Var : list2, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? 0 : i);
    }
}
