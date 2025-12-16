package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public enum xs {
    f391799b("NO_ERROR"),
    f391800c("PROTOCOL_ERROR"),
    f391801d("INTERNAL_ERROR"),
    f391802e("FLOW_CONTROL_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("SETTINGS_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("STREAM_CLOSED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("FRAME_SIZE_ERROR"),
    f391803f("REFUSED_STREAM"),
    f391804g("CANCEL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF91("COMPRESSION_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF100("CONNECT_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF109("ENHANCE_YOUR_CALM"),
    /* JADX INFO: Fake field, exist only in values array */
    EF118("INADEQUATE_SECURITY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF127("HTTP_1_1_REQUIRED");


    /* renamed from: a, reason: collision with root package name */
    private final int f391806a;

    public static final class a {
        @Y61.l
        public static xs a(int i12) {
            for (xs xsVar : xs.values()) {
                if (xsVar.a() == i12) {
                    return xsVar;
                }
            }
            return null;
        }
    }

    xs(String str) {
        this.f391806a = i;
    }

    public final int a() {
        return this.f391806a;
    }
}
