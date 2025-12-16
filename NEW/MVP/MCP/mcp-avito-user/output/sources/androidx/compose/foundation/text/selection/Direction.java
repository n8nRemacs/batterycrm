package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/Direction;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Direction {

    /* renamed from: b, reason: collision with root package name */
    public static final Direction f31836b;

    /* renamed from: c, reason: collision with root package name */
    public static final Direction f31837c;

    /* renamed from: d, reason: collision with root package name */
    public static final Direction f31838d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Direction[] f31839e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f31840f;

    static {
        Direction direction = new Direction("BEFORE", 0);
        f31836b = direction;
        Direction direction2 = new Direction("ON", 1);
        f31837c = direction2;
        Direction direction3 = new Direction("AFTER", 2);
        f31838d = direction3;
        Direction[] directionArr = {direction, direction2, direction3};
        f31839e = directionArr;
        f31840f = kotlin.enums.c.a(directionArr);
    }

    public Direction() {
        throw null;
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) f31839e.clone();
    }
}
