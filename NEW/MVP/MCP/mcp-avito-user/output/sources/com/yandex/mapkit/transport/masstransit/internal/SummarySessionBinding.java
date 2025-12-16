package com.yandex.mapkit.transport.masstransit.internal;

import com.yandex.mapkit.transport.masstransit.SummarySession;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class SummarySessionBinding implements SummarySession {
    private final NativeObject nativeObject;

    public SummarySessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.SummarySession
    public native void cancel();

    @Override // com.yandex.mapkit.transport.masstransit.SummarySession
    public native void retry(@N SummarySession.SummaryListener summaryListener);
}
