package com.avito.avcalls.android.video;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CameraPosition.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/video/CameraPosition;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CameraPosition {

    /* renamed from: b, reason: collision with root package name */
    public static final CameraPosition f332471b;

    /* renamed from: c, reason: collision with root package name */
    public static final CameraPosition f332472c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CameraPosition[] f332473d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f332474e;

    static {
        CameraPosition cameraPosition = new CameraPosition("FRONT", 0);
        f332471b = cameraPosition;
        CameraPosition cameraPosition2 = new CameraPosition("BACK", 1);
        f332472c = cameraPosition2;
        CameraPosition[] cameraPositionArr = {cameraPosition, cameraPosition2};
        f332473d = cameraPositionArr;
        f332474e = kotlin.enums.c.a(cameraPositionArr);
    }

    public CameraPosition() {
        throw null;
    }

    public static CameraPosition valueOf(String str) {
        return (CameraPosition) Enum.valueOf(CameraPosition.class, str);
    }

    public static CameraPosition[] values() {
        return (CameraPosition[]) f332473d.clone();
    }
}
