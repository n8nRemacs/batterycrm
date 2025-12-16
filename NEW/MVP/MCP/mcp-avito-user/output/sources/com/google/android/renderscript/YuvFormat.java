package com.google.android.renderscript;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Toolkit.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/android/renderscript/YuvFormat;", "", "_design-modules_renderscript-toolkit"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class YuvFormat {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ YuvFormat[] f358947b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f358948c;

    static {
        YuvFormat[] yuvFormatArr = {new YuvFormat("NV21", 0, 17), new YuvFormat("YV12", 1, 842094169)};
        f358947b = yuvFormatArr;
        f358948c = c.a(yuvFormatArr);
    }

    public YuvFormat(String str, int i12, int i13) {
    }

    public static YuvFormat valueOf(String str) {
        return (YuvFormat) Enum.valueOf(YuvFormat.class, str);
    }

    public static YuvFormat[] values() {
        return (YuvFormat[]) f358947b.clone();
    }
}
