package ru.ok.android.externcalls.sdk.api;

import defpackage.ho7;
import defpackage.os5;
import defpackage.ox7;
import defpackage.xx7;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.externcalls.sdk.rate.RateCallData;

/* loaded from: classes2.dex */
public final class JoinByLinkResponse {
    public static final ox7 PARSER = new os5(24);
    public final String clientType;
    public final int deviceIndex;
    public final String endpoint;
    public final String id;
    public final boolean isP2PForbidden;
    public final List<PeerConnection.IceServer> stun;
    public final String token;
    public final List<PeerConnection.IceServer> turn;
    public final String wtEndpoint;

    public JoinByLinkResponse(String str, List<PeerConnection.IceServer> list, List<PeerConnection.IceServer> list2, String str2, String str3, String str4, String str5, boolean z, int i) {
        this.id = str;
        this.deviceIndex = i;
        this.turn = list;
        this.endpoint = str2;
        this.wtEndpoint = str3;
        this.token = str4;
        this.isP2PForbidden = z;
        this.stun = list2;
        this.clientType = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JoinByLinkResponse lambda$static$0(xx7 xx7Var) throws JsonParseException, IOException {
        List<PeerConnection.IceServer> list = Collections.EMPTY_LIST;
        xx7Var.p();
        List<PeerConnection.IceServer> turn = list;
        List<PeerConnection.IceServer> stun = turn;
        String strB = null;
        String strB2 = null;
        String strB3 = null;
        String strB4 = null;
        String strB5 = null;
        boolean zW = false;
        int iX = 0;
        while (xx7Var.hasNext()) {
            String strName = xx7Var.name();
            strName.getClass();
            switch (strName) {
                case "client_type":
                    strB5 = xx7Var.B();
                    break;
                case "p2p_forbidden":
                    zW = xx7Var.W();
                    break;
                case "id":
                    strB = xx7Var.B();
                    break;
                case "token":
                    strB4 = xx7Var.B();
                    break;
                case "device_idx":
                    iX = xx7Var.x();
                    break;
                case "turn_server":
                    turn = TurnStunParser.parseTurn(xx7Var);
                    break;
                case "wt_endpoint":
                    strB3 = xx7Var.B();
                    break;
                case "stun_server":
                    stun = TurnStunParser.parseStun(xx7Var);
                    break;
                case "endpoint":
                    strB2 = xx7Var.B();
                    break;
                default:
                    xx7Var.v();
                    break;
            }
        }
        xx7Var.n();
        return new JoinByLinkResponse(strB, turn, stun, strB2, strB3, strB4, strB5, zW, iX);
    }

    public ConversationParams toParams(ConversationParams conversationParams) {
        ConversationParams conversationParams2 = new ConversationParams();
        LinkedList linkedList = new LinkedList(this.turn);
        if (conversationParams != null) {
            conversationParams2.rateCallData = conversationParams.rateCallData;
            linkedList.addAll(conversationParams.stunTurnServers);
        } else {
            conversationParams2.rateCallData = new RateCallData(0, Collections.EMPTY_LIST);
        }
        conversationParams2.endpoint = this.endpoint;
        conversationParams2.deviceIndex = this.deviceIndex;
        conversationParams2.token = this.token;
        conversationParams2.stunTurnServers = linkedList;
        return conversationParams2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JoinByLinkResponse{id='");
        sb.append(this.id);
        sb.append("', deviceIndex='");
        sb.append(this.deviceIndex);
        sb.append("', turn=");
        sb.append(this.turn);
        sb.append(", endpoint='");
        sb.append(this.endpoint);
        sb.append("', wtEndpoint='");
        sb.append(this.wtEndpoint);
        sb.append("', token='");
        return ho7.l(sb, this.token, "'}");
    }

    public ConversationParams toParams() {
        ConversationParams conversationParams = new ConversationParams();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.turn);
        linkedList.addAll(this.stun);
        conversationParams.id = this.id;
        conversationParams.clientType = this.clientType;
        conversationParams.endpoint = this.endpoint;
        conversationParams.wtEndpoint = this.wtEndpoint;
        conversationParams.deviceIndex = this.deviceIndex;
        conversationParams.token = this.token;
        conversationParams.stunTurnServers = linkedList;
        conversationParams.isP2PForbidden = this.isP2PForbidden;
        return conversationParams;
    }
}
