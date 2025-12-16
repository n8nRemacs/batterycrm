package ru.ok.android.externcalls.sdk.stat.negotiation;

import defpackage.cm6;
import defpackage.jda;
import defpackage.kda;
import defpackage.m81;
import defpackage.tk4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.SessionDescription;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/negotiation/NegotiationErrorStat;", "", "Lkotlin/Function0;", "Lm81;", "getEventualStatSender", "<init>", "(Lcm6;)V", "Lorg/webrtc/SessionDescription;", "sdp", "Lorg/json/JSONObject;", "sdpJson", "(Lorg/webrtc/SessionDescription;)Lorg/json/JSONObject;", "Ljda;", "", "toStatName", "(Ljda;)Ljava/lang/String;", "Lkda;", NegotiationErrorStat.KEY_ERROR, "Lqqg;", "onError", "(Lkda;)V", "Lcm6;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NegotiationErrorStat {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_ERROR = "error";
    private final cm6 getEventualStatSender;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/negotiation/NegotiationErrorStat$Companion;", "", "()V", "KEY_ERROR", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[jda.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NegotiationErrorStat(cm6 cm6Var) {
        this.getEventualStatSender = cm6Var;
    }

    private final JSONObject sdpJson(SessionDescription sdp) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sdp", sdp.description);
        jSONObject.put("type", sdp.type);
        return jSONObject;
    }

    private final String toStatName(jda jdaVar) {
        switch (WhenMappings.$EnumSwitchMapping$0[jdaVar.ordinal()]) {
            case 1:
                return "sdp_create_offer";
            case 2:
                return "sdp_create_answer";
            case 3:
                return "sdp_set_local_offer";
            case 4:
                return "sdp_set_remote_offer";
            case 5:
                return "sdp_set_local_answer";
            case 6:
                return "sdp_set_remote_answer";
            case 7:
                return "sdp_set_local_pranswer";
            case 8:
                return "sdp_set_remote_pranswer";
            case 9:
                return "sdp_set_local_rollback";
            case 10:
                return "sdp_set_remote_rollback";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void onError(kda error) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_ERROR, error.b);
        SessionDescription sessionDescription = error.c;
        if (sessionDescription != null) {
            jSONObject.put("local", sdpJson(sessionDescription));
        }
        SessionDescription sessionDescription2 = error.d;
        if (sessionDescription2 != null) {
            jSONObject.put("remote", sdpJson(sessionDescription2));
        }
        m81 m81Var = (m81) this.getEventualStatSender.invoke();
        if (m81Var != null) {
            m81.a(m81Var, toStatName(error.a), EventItemValueKt.toEventItemValue(jSONObject.toString()), null, 4);
        }
    }
}
