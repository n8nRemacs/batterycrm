package com.avito.android.comparison;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GestureDetectorListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/Direction;", "", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Direction {

    /* renamed from: b, reason: collision with root package name */
    public static final Direction f123806b;

    /* renamed from: c, reason: collision with root package name */
    public static final Direction f123807c;

    /* renamed from: d, reason: collision with root package name */
    public static final Direction f123808d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Direction[] f123809e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f123810f;

    static {
        Direction direction = new Direction("HORIZONTAL", 0);
        f123806b = direction;
        Direction direction2 = new Direction("VERTICAL", 1);
        f123807c = direction2;
        Direction direction3 = new Direction(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        f123808d = direction3;
        Direction[] directionArr = {direction, direction2, direction3};
        f123809e = directionArr;
        f123810f = kotlin.enums.c.a(directionArr);
    }

    public Direction() {
        throw null;
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) f123809e.clone();
    }
}
