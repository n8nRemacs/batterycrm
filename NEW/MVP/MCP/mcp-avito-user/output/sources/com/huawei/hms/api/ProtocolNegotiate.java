package com.huawei.hms.api;

import androidx.media3.exoplayer.analytics.m;
import java.util.List;

/* loaded from: classes7.dex */
public class ProtocolNegotiate {

    /* renamed from: b, reason: collision with root package name */
    private static ProtocolNegotiate f363323b = new ProtocolNegotiate();

    /* renamed from: a, reason: collision with root package name */
    private int f363324a = 1;

    public static ProtocolNegotiate getInstance() {
        return f363323b;
    }

    public int getVersion() {
        return this.f363324a;
    }

    public int negotiate(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            this.f363324a = 1;
            return 1;
        }
        if (list.contains(2)) {
            this.f363324a = 2;
        } else {
            this.f363324a = ((Integer) m.h(1, list)).intValue();
        }
        return this.f363324a;
    }
}
