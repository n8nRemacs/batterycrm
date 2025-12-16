package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/Direction;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Direction {

    /* renamed from: b, reason: collision with root package name */
    public static final Direction f28233b;

    /* renamed from: c, reason: collision with root package name */
    public static final Direction f28234c;

    /* renamed from: d, reason: collision with root package name */
    public static final Direction f28235d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Direction[] f28236e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f28237f;

    static {
        Direction direction = new Direction("Vertical", 0);
        f28233b = direction;
        Direction direction2 = new Direction("Horizontal", 1);
        f28234c = direction2;
        Direction direction3 = new Direction("Both", 2);
        f28235d = direction3;
        Direction[] directionArr = {direction, direction2, direction3};
        f28236e = directionArr;
        f28237f = kotlin.enums.c.a(directionArr);
    }

    public Direction() {
        throw null;
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) f28236e.clone();
    }
}
