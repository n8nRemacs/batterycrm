package com.avito.android.photo_cache;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotoUpload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_cache/EnhanceState;", "", "_avito_photo-cache_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EnhanceState {

    /* renamed from: c, reason: collision with root package name */
    public static final EnhanceState f216287c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnhanceState f216288d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnhanceState f216289e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnhanceState[] f216290f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f216291g;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f216292b;

    static {
        EnhanceState enhanceState = new EnhanceState("NOT_ENHANCED", 0, false);
        f216287c = enhanceState;
        EnhanceState enhanceState2 = new EnhanceState("ENHANCED", 1, true);
        f216288d = enhanceState2;
        EnhanceState enhanceState3 = new EnhanceState("ENHANCED_CHANGE_NOT_ALLOWED", 2, true);
        f216289e = enhanceState3;
        EnhanceState[] enhanceStateArr = {enhanceState, enhanceState2, enhanceState3};
        f216290f = enhanceStateArr;
        f216291g = kotlin.enums.c.a(enhanceStateArr);
    }

    public EnhanceState(String str, int i12, boolean z12) {
        this.f216292b = z12;
    }

    public static EnhanceState valueOf(String str) {
        return (EnhanceState) Enum.valueOf(EnhanceState.class, str);
    }

    public static EnhanceState[] values() {
        return (EnhanceState[]) f216290f.clone();
    }
}
