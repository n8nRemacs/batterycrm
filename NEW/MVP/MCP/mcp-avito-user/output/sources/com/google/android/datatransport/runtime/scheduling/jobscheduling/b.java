package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14Impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f343182b;

    public /* synthetic */ b(int i12) {
        this.f343182b = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f343182b) {
            case 0:
                int i12 = AlarmManagerSchedulerBroadcastReceiver.f343174a;
                break;
            case 1:
                EglBase10Impl.EglConnection.lambda$new$1();
                break;
            default:
                EglBase14Impl.EglConnection.lambda$new$1();
                break;
        }
    }
}
