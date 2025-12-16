package com.facebook.common.time;

import android.os.SystemClock;
import com.facebook.common.internal.g;
import com.facebook.infer.annotation.Nullsafe;
import yW0.InterfaceC50192c;

@g
@Nullsafe
/* loaded from: classes5.dex */
public class RealtimeSinceBootClock implements InterfaceC50192c {

    /* renamed from: a, reason: collision with root package name */
    public static final RealtimeSinceBootClock f339859a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @g
    public static RealtimeSinceBootClock get() {
        return f339859a;
    }

    @Override // yW0.InterfaceC50192c
    public final long now() {
        return SystemClock.elapsedRealtime();
    }
}
