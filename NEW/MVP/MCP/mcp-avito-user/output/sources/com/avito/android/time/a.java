package com.avito.android.time;

import android.os.SystemClock;
import kotlin.Metadata;

/* compiled from: AndroidSystemClock.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/time/a;", "Lcom/avito/android/time/b;", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements b {
    @Override // com.avito.android.time.b
    public final long a() {
        return SystemClock.uptimeMillis();
    }
}
