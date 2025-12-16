package com.vk.id.captcha.sensors.a;

import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Sensors.kt */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f366810a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f366811b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f366812c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ b[] f366813d;

    static {
        b bVar = new b("ACCELEROMETER", 0);
        f366810a = bVar;
        b bVar2 = new b("GYROSCOPE", 1);
        f366811b = bVar2;
        b bVar3 = new b("MOTION", 2);
        f366812c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f366813d = bVarArr;
        c.a(bVarArr);
    }

    private b(String str, int i12) {
    }

    public static b[] a() {
        return (b[]) f366813d.clone();
    }
}
