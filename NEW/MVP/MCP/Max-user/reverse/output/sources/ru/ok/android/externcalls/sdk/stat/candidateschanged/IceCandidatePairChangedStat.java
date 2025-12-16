package ru.ok.android.externcalls.sdk.stat.candidateschanged;

import defpackage.cm6;
import defpackage.m81;
import defpackage.tk4;
import kotlin.Metadata;
import org.json.JSONObject;
import org.webrtc.CandidatePairChangeEvent;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/candidateschanged/IceCandidatePairChangedStat;", "", "Lkotlin/Function0;", "Lm81;", "getEventualStatSender", "<init>", "(Lcm6;)V", "Lorg/webrtc/CandidatePairChangeEvent;", "event", "Lqqg;", "onSelectedCandidatePairChanged", "(Lorg/webrtc/CandidatePairChangeEvent;)V", "Lcm6;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IceCandidatePairChangedStat {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_LAST_DATA_RECEIVED_MS = "lastDataReceivedMs";

    @Deprecated
    public static final String KEY_REASON = "reason";
    private final cm6 getEventualStatSender;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/candidateschanged/IceCandidatePairChangedStat$Companion;", "", "()V", "KEY_LAST_DATA_RECEIVED_MS", "", "KEY_REASON", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    public IceCandidatePairChangedStat(cm6 cm6Var) {
        this.getEventualStatSender = cm6Var;
    }

    public final void onSelectedCandidatePairChanged(CandidatePairChangeEvent event) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_LAST_DATA_RECEIVED_MS, event.lastDataReceivedMs);
        jSONObject.put(KEY_REASON, event.reason);
        jSONObject.put("local", new JSONObject().put("sdp", event.local.sdp));
        jSONObject.put("remote", new JSONObject().put("sdp", event.remote.sdp));
        m81 m81Var = (m81) this.getEventualStatSender.invoke();
        if (m81Var != null) {
            m81.a(m81Var, "ice_candidates_changed", EventItemValueKt.toEventItemValue(jSONObject.toString()), null, 4);
        }
    }
}
