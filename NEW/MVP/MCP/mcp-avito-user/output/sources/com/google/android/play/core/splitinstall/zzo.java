package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class zzo implements V {

    /* renamed from: b, reason: collision with root package name */
    public static final zzo f358905b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f358906c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ zzo[] f358907d;

    static {
        zzo zzoVar = new zzo("INSTANCE", 0);
        f358905b = zzoVar;
        f358907d = new zzo[]{zzoVar};
        f358906c = new AtomicReference(null);
    }

    public static zzo[] values() {
        return (zzo[]) f358907d.clone();
    }

    @j.P
    public final W a() {
        return (W) f358906c.get();
    }
}
