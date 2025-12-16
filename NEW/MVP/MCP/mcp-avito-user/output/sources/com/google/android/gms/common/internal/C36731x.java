package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.internal.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36731x {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public static C36731x f349474b;

    /* renamed from: c, reason: collision with root package name */
    public static final RootTelemetryConfiguration f349475c = new RootTelemetryConfiguration(0, 0, 0, false, false);

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public RootTelemetryConfiguration f349476a;

    @j.N
    @RX0.a
    public static synchronized C36731x a() {
        try {
            if (f349474b == null) {
                f349474b = new C36731x();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f349474b;
    }
}
