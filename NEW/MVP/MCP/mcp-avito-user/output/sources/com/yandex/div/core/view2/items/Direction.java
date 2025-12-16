package com.yandex.div.core.view2.items;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DivViewWithItems.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/items/Direction;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class Direction {

    /* renamed from: b, reason: collision with root package name */
    public static final Direction f369118b;

    /* renamed from: c, reason: collision with root package name */
    public static final Direction f369119c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Direction[] f369120d;

    static {
        Direction direction = new Direction("NEXT", 0);
        f369118b = direction;
        Direction direction2 = new Direction("PREVIOUS", 1);
        f369119c = direction2;
        f369120d = new Direction[]{direction, direction2};
    }

    public Direction() {
        throw null;
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) f369120d.clone();
    }
}
