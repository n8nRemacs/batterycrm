package ru.ok.android.externcalls.sdk.stat.connection;

import defpackage.cm6;
import defpackage.imb;
import defpackage.m81;
import java.util.Locale;
import kotlin.Metadata;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/connection/PeerConnectionChangedStat;", "", "Lkotlin/Function0;", "Lm81;", "getEventualStatSender", "<init>", "(Lcm6;)V", "Lorg/webrtc/PeerConnection$PeerConnectionState;", "state", "Lqqg;", "onStateChanged", "(Lorg/webrtc/PeerConnection$PeerConnectionState;)V", "Lcm6;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PeerConnectionChangedStat {
    private final cm6 getEventualStatSender;

    public PeerConnectionChangedStat(cm6 cm6Var) {
        this.getEventualStatSender = cm6Var;
    }

    public final void onStateChanged(PeerConnection.PeerConnectionState state) {
        m81 m81Var = (m81) this.getEventualStatSender.invoke();
        if (m81Var != null) {
            m81.a(m81Var, "connection_state_changed", null, new EventItemsMap(new imb("connection_state", EventItemValueKt.toEventItemValue(state.name().toLowerCase(Locale.ROOT)))), 2);
        }
    }
}
