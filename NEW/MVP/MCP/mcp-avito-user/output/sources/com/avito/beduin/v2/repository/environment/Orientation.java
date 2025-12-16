package com.avito.beduin.v2.repository.environment;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Environment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/repository/environment/Orientation;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Orientation {

    /* renamed from: b, reason: collision with root package name */
    public static final Orientation f338201b;

    /* renamed from: c, reason: collision with root package name */
    public static final Orientation f338202c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Orientation[] f338203d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f338204e;

    static {
        Orientation orientation = new Orientation("Horizontal", 0);
        f338201b = orientation;
        Orientation orientation2 = new Orientation("Vertical", 1);
        f338202c = orientation2;
        Orientation[] orientationArr = {orientation, orientation2};
        f338203d = orientationArr;
        f338204e = kotlin.enums.c.a(orientationArr);
    }

    public Orientation() {
        throw null;
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) f338203d.clone();
    }
}
