package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class AsyncUpdates {

    /* renamed from: b, reason: collision with root package name */
    public static final AsyncUpdates f59010b;

    /* renamed from: c, reason: collision with root package name */
    public static final AsyncUpdates f59011c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AsyncUpdates[] f59012d;

    static {
        AsyncUpdates asyncUpdates = new AsyncUpdates("AUTOMATIC", 0);
        f59010b = asyncUpdates;
        AsyncUpdates asyncUpdates2 = new AsyncUpdates("ENABLED", 1);
        f59011c = asyncUpdates2;
        f59012d = new AsyncUpdates[]{asyncUpdates, asyncUpdates2, new AsyncUpdates("DISABLED", 2)};
    }

    public AsyncUpdates() {
        throw null;
    }

    public static AsyncUpdates valueOf(String str) {
        return (AsyncUpdates) Enum.valueOf(AsyncUpdates.class, str);
    }

    public static AsyncUpdates[] values() {
        return (AsyncUpdates[]) f59012d.clone();
    }
}
