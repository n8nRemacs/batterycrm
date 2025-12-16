package com.avito.android.comfortable_deal.api.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SortInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/Direction;", "", "(Ljava/lang/String;I)V", "ASC", "DESC", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Direction {

    @c("asc")
    public static final Direction ASC;

    @c("desc")
    public static final Direction DESC;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Direction[] f119765b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f119766c;

    static {
        Direction direction = new Direction("ASC", 0);
        ASC = direction;
        Direction direction2 = new Direction("DESC", 1);
        DESC = direction2;
        Direction[] directionArr = {direction, direction2};
        f119765b = directionArr;
        f119766c = kotlin.enums.c.a(directionArr);
    }

    private Direction(String str, int i12) {
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) f119765b.clone();
    }
}
