package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public final /* synthetic */ class lpb implements hu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wpb b;
    public final /* synthetic */ SessionDescription c;

    public /* synthetic */ lpb(wpb wpbVar, SessionDescription sessionDescription, int i) {
        this.a = i;
        this.b = wpbVar;
        this.c = sessionDescription;
    }

    @Override // defpackage.hu3
    public final void accept(Object obj) throws NumberFormatException {
        SessionDescription.Type type;
        SessionDescription.Type type2;
        String strGroup;
        switch (this.a) {
            case 0:
                wpb wpbVar = this.b;
                SessionDescription sessionDescription = this.c;
                PeerConnection peerConnection = (PeerConnection) obj;
                b7d b7dVar = wpbVar.B;
                b7d b7dVar2 = wpbVar.B;
                String str = sessionDescription.description;
                y6d y6dVar = wpbVar.C;
                t4j.d(str, y6dVar);
                String strE = wpbVar.e(str, true);
                if (wpbVar.i) {
                    Object[] objArr = {"opus", "red"};
                    ArrayList arrayList = new ArrayList(2);
                    int i = 0;
                    for (int i2 = 2; i < i2; i2 = 2) {
                        Object obj2 = objArr[i];
                        Objects.requireNonNull(obj2);
                        arrayList.add(obj2);
                        i++;
                    }
                    List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                    n9i n9iVarA = t4j.a(true, strE.split("\r\n"), y6dVar);
                    if (n9iVarA == null || !n9iVarA.d(listUnmodifiableList)) {
                        y6dVar.reportException("PCRTCClient", "SDP has no 'Opus' codec; cannot remove others", new IllegalArgumentException("SDP has no 'Opus' codec; cannot remove others"));
                    } else {
                        strE = t4j.g(strE, true, listUnmodifiableList, null, y6dVar);
                    }
                }
                if (wpbVar.h) {
                    strE = t4j.f(t4j.c(strE, "dred", "100", b7dVar2, y6dVar), Collections.singletonList("opus"), b7dVar, y6dVar);
                }
                Integer num = wpbVar.j;
                if (num != null) {
                    strE = t4j.c(strE, "minptime", String.valueOf(num.intValue()), b7dVar2, y6dVar);
                }
                Integer num2 = wpbVar.k;
                if (num2 != null) {
                    strE = t4j.c(strE, "maxptime", String.valueOf(num2.intValue()), b7dVar2, y6dVar);
                }
                if (wpbVar.f) {
                    strE = t4j.f(strE, Collections.singletonList("red"), b7dVar, y6dVar);
                }
                String strK = u45.k(strE, strE.endsWith("\n") ? "" : "\r\n", "a=animoji:2\r\n");
                if (!wpbVar.g) {
                    strK = t4j.c(strK, "usedtx", String.valueOf(1), b7dVar2, y6dVar);
                }
                SessionDescription sessionDescription2 = new SessionDescription(sessionDescription.type, strK);
                y6dVar.log("PCRTCClient", wpbVar.toString() + ": set local sdp from " + sessionDescription2.type);
                qi1 qi1Var = wpbVar.E;
                if (qi1Var.z) {
                    jda jdaVar = qi1Var.y;
                    if (ue3.A(ve3.j(jda.c, jda.o, jda.Y, jda.s0), jdaVar) && jdaVar != null) {
                        switch (ida.$EnumSwitchMapping$1[jdaVar.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                                type = SessionDescription.Type.OFFER;
                                break;
                            case 4:
                            case 5:
                            case 6:
                                type = SessionDescription.Type.ANSWER;
                                break;
                            case 7:
                            case 8:
                                type = SessionDescription.Type.PRANSWER;
                                break;
                            case 9:
                            case 10:
                                type = SessionDescription.Type.ROLLBACK;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        sessionDescription2 = new SessionDescription(type, "fake sdp");
                    }
                }
                peerConnection.setLocalDescription(new spb(wpbVar, sessionDescription2, 0), sessionDescription2);
                return;
            default:
                wpb wpbVar2 = this.b;
                SessionDescription sessionDescription3 = this.c;
                PeerConnection peerConnection2 = (PeerConnection) obj;
                String str2 = sessionDescription3.description;
                t4j.d(str2, wpbVar2.C);
                if (!wpbVar2.l0 && wpbVar2.a0 != null) {
                    if (wpb.q0.matcher(str2).find()) {
                        wpbVar2.C.log("PCRTCClient", wpbVar2.toString() + ": remote sdp supports h264 decoding");
                    } else {
                        wpbVar2.C.log("PCRTCClient", wpbVar2.toString() + ": remote does not support h264 decoding");
                        wpbVar2.a0.l(Float.valueOf(wpbVar2.m0), Float.valueOf(wpbVar2.n0));
                    }
                }
                SessionDescription sessionDescription4 = new SessionDescription(sessionDescription3.type, wpbVar2.e(str2, false));
                if (wpbVar2.l.c == null) {
                    Matcher matcher = wpb.r0.matcher(sessionDescription3.description);
                    int i3 = 1;
                    if (matcher.find() && (strGroup = matcher.group(1)) != null) {
                        i3 = Integer.parseInt(strGroup);
                    }
                    wpbVar2.D.getClass();
                    int iMin = Math.min(i3, 2);
                    wpbVar2.C.log("PCRTCClient", wpbVar2.toString() + ": set animoji protocol version: " + iMin + "(local: 2, remote: " + i3 + ")");
                    ak akVar = wpbVar2.l;
                    if (akVar.c != null) {
                        Throwable th = new Throwable("Resetting animoji protocol version");
                        y6d y6dVar2 = akVar.a.b;
                        String message = th.getMessage();
                        if (message == null) {
                            message = "animoji error";
                        }
                        y6dVar2.logException("AniSend", message, th);
                    }
                    akVar.c = Integer.valueOf(iMin);
                    pa5 pa5Var = akVar.g;
                    if (pa5Var != null) {
                        pa5Var.a();
                    }
                }
                wpbVar2.C.log("PCRTCClient", wpbVar2.toString() + ": set remote sdp from " + sessionDescription3.type);
                qi1 qi1Var2 = wpbVar2.E;
                if (qi1Var2.z) {
                    jda jdaVar2 = qi1Var2.y;
                    if (ue3.A(ve3.j(jda.d, jda.X, jda.Z, jda.t0), jdaVar2) && jdaVar2 != null) {
                        switch (ida.$EnumSwitchMapping$1[jdaVar2.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                                type2 = SessionDescription.Type.OFFER;
                                break;
                            case 4:
                            case 5:
                            case 6:
                                type2 = SessionDescription.Type.ANSWER;
                                break;
                            case 7:
                            case 8:
                                type2 = SessionDescription.Type.PRANSWER;
                                break;
                            case 9:
                            case 10:
                                type2 = SessionDescription.Type.ROLLBACK;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        sessionDescription4 = new SessionDescription(type2, "fake sdp");
                    }
                }
                peerConnection2.setRemoteDescription(new spb(wpbVar2, sessionDescription4, 1), sessionDescription4);
                return;
        }
    }
}
