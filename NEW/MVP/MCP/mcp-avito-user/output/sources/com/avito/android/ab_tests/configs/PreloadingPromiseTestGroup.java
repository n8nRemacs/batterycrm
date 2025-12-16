package com.avito.android.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PreloadingPromiseTestGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_tests/configs/PreloadingPromiseTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PreloadingPromiseTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final PreloadingPromiseTestGroup f67893c;

    /* renamed from: d, reason: collision with root package name */
    public static final PreloadingPromiseTestGroup f67894d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PreloadingPromiseTestGroup[] f67895e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f67896f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67897b;

    static {
        PreloadingPromiseTestGroup preloadingPromiseTestGroup = new PreloadingPromiseTestGroup("NONE", 0, "");
        f67893c = preloadingPromiseTestGroup;
        PreloadingPromiseTestGroup preloadingPromiseTestGroup2 = new PreloadingPromiseTestGroup("CONTROL", 1, "control");
        PreloadingPromiseTestGroup preloadingPromiseTestGroup3 = new PreloadingPromiseTestGroup("TEST", 2, "test");
        f67894d = preloadingPromiseTestGroup3;
        PreloadingPromiseTestGroup[] preloadingPromiseTestGroupArr = {preloadingPromiseTestGroup, preloadingPromiseTestGroup2, preloadingPromiseTestGroup3};
        f67895e = preloadingPromiseTestGroupArr;
        f67896f = c.a(preloadingPromiseTestGroupArr);
    }

    public PreloadingPromiseTestGroup(String str, int i12, String str2) {
        this.f67897b = str2;
    }

    public static PreloadingPromiseTestGroup valueOf(String str) {
        return (PreloadingPromiseTestGroup) Enum.valueOf(PreloadingPromiseTestGroup.class, str);
    }

    public static PreloadingPromiseTestGroup[] values() {
        return (PreloadingPromiseTestGroup[]) f67895e.clone();
    }

    public final boolean a() {
        return this == f67894d;
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67928b() {
        return this.f67897b;
    }
}
