package com.avito.android.adaptive.image.ab_test;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdaptiveImageLoadingAbTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/adaptive/image/ab_test/AdaptiveImageLoadingAbTestGroup;", "", "Lu3/j;", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdaptiveImageLoadingAbTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final AdaptiveImageLoadingAbTestGroup f68485c;

    /* renamed from: d, reason: collision with root package name */
    public static final AdaptiveImageLoadingAbTestGroup f68486d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AdaptiveImageLoadingAbTestGroup[] f68487e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f68488f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f68489b;

    static {
        AdaptiveImageLoadingAbTestGroup adaptiveImageLoadingAbTestGroup = new AdaptiveImageLoadingAbTestGroup("NONE", 0, "");
        f68485c = adaptiveImageLoadingAbTestGroup;
        AdaptiveImageLoadingAbTestGroup adaptiveImageLoadingAbTestGroup2 = new AdaptiveImageLoadingAbTestGroup("TEST", 1, "test");
        f68486d = adaptiveImageLoadingAbTestGroup2;
        AdaptiveImageLoadingAbTestGroup[] adaptiveImageLoadingAbTestGroupArr = {adaptiveImageLoadingAbTestGroup, adaptiveImageLoadingAbTestGroup2, new AdaptiveImageLoadingAbTestGroup("CONTROL", 2, "control")};
        f68487e = adaptiveImageLoadingAbTestGroupArr;
        f68488f = c.a(adaptiveImageLoadingAbTestGroupArr);
    }

    public AdaptiveImageLoadingAbTestGroup(String str, int i12, String str2) {
        this.f68489b = str2;
    }

    public static AdaptiveImageLoadingAbTestGroup valueOf(String str) {
        return (AdaptiveImageLoadingAbTestGroup) Enum.valueOf(AdaptiveImageLoadingAbTestGroup.class, str);
    }

    public static AdaptiveImageLoadingAbTestGroup[] values() {
        return (AdaptiveImageLoadingAbTestGroup[]) f68487e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF68489b() {
        return this.f68489b;
    }
}
