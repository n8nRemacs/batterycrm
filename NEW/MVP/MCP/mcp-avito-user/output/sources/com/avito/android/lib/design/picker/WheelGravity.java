package com.avito.android.lib.design.picker;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WheelStyle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/picker/WheelGravity;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WheelGravity {

    /* renamed from: b, reason: collision with root package name */
    public static final WheelGravity f179987b;

    /* renamed from: c, reason: collision with root package name */
    public static final WheelGravity f179988c;

    /* renamed from: d, reason: collision with root package name */
    public static final WheelGravity f179989d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ WheelGravity[] f179990e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f179991f;

    static {
        WheelGravity wheelGravity = new WheelGravity("LEFT", 0);
        f179987b = wheelGravity;
        WheelGravity wheelGravity2 = new WheelGravity("RIGHT", 1);
        f179988c = wheelGravity2;
        WheelGravity wheelGravity3 = new WheelGravity("CENTER", 2);
        f179989d = wheelGravity3;
        WheelGravity[] wheelGravityArr = {wheelGravity, wheelGravity2, wheelGravity3};
        f179990e = wheelGravityArr;
        f179991f = kotlin.enums.c.a(wheelGravityArr);
    }

    public WheelGravity() {
        throw null;
    }

    public static WheelGravity valueOf(String str) {
        return (WheelGravity) Enum.valueOf(WheelGravity.class, str);
    }

    public static WheelGravity[] values() {
        return (WheelGravity[]) f179990e.clone();
    }
}
