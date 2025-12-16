package com.vk.api.sdk.auth;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VKScope.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/api/sdk/auth/VKScope;", "", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class VKScope {

    /* renamed from: b, reason: collision with root package name */
    public static final VKScope f366528b;

    /* renamed from: c, reason: collision with root package name */
    public static final VKScope f366529c;

    /* renamed from: d, reason: collision with root package name */
    public static final VKScope f366530d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ VKScope[] f366531e;

    /* JADX INFO: Fake field, exist only in values array */
    VKScope EF0;

    static {
        VKScope vKScope = new VKScope("NOTIFY", 0);
        VKScope vKScope2 = new VKScope("FRIENDS", 1);
        VKScope vKScope3 = new VKScope("PHOTOS", 2);
        f366528b = vKScope3;
        VKScope vKScope4 = new VKScope("AUDIO", 3);
        VKScope vKScope5 = new VKScope("VIDEO", 4);
        VKScope vKScope6 = new VKScope("STORIES", 5);
        VKScope vKScope7 = new VKScope("PAGES", 6);
        VKScope vKScope8 = new VKScope("STATUS", 7);
        VKScope vKScope9 = new VKScope("NOTES", 8);
        VKScope vKScope10 = new VKScope("MESSAGES", 9);
        VKScope vKScope11 = new VKScope("WALL", 10);
        VKScope vKScope12 = new VKScope("ADS", 11);
        VKScope vKScope13 = new VKScope("OFFLINE", 12);
        f366529c = vKScope13;
        VKScope vKScope14 = new VKScope("DOCS", 13);
        VKScope vKScope15 = new VKScope("GROUPS", 14);
        VKScope vKScope16 = new VKScope("NOTIFICATIONS", 15);
        VKScope vKScope17 = new VKScope("STATS", 16);
        VKScope vKScope18 = new VKScope("EMAIL", 17);
        f366530d = vKScope18;
        f366531e = new VKScope[]{vKScope, vKScope2, vKScope3, vKScope4, vKScope5, vKScope6, vKScope7, vKScope8, vKScope9, vKScope10, vKScope11, vKScope12, vKScope13, vKScope14, vKScope15, vKScope16, vKScope17, vKScope18, new VKScope("MARKET", 18), new VKScope("PHONE", 19)};
    }

    public VKScope() {
        throw null;
    }

    public static VKScope valueOf(String str) {
        return (VKScope) Enum.valueOf(VKScope.class, str);
    }

    public static VKScope[] values() {
        return (VKScope[]) f366531e.clone();
    }
}
