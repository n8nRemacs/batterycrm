package defpackage;

import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;

/* loaded from: classes2.dex */
public enum q9i {
    TCP_RELAY("tcp_relay"),
    UDP_RELAY("udp_relay"),
    SRFLX(CandidateTypeHintConfig.TYPE_SRFLX);

    public final String a;

    q9i(String str) {
        this.a = str;
    }
}
