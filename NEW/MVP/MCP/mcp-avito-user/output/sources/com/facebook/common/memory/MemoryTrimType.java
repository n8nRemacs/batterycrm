package com.facebook.common.memory;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe
/* loaded from: classes5.dex */
public enum MemoryTrimType {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("OnCloseToDalvikHeapLimit"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("OnSystemMemoryCriticallyLowWhileAppInForeground"),
    f339829c("OnSystemLowMemoryWhileAppInForeground"),
    f339830d("OnSystemLowMemoryWhileAppInBackground"),
    f339831e("OnAppBackgrounded");


    /* renamed from: b, reason: collision with root package name */
    public final double f339833b;

    MemoryTrimType(String str) {
        this.f339833b = d;
    }
}
