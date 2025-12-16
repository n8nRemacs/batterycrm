package com.avito.android.das_date_picker.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Position.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/model/Position;", "", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Position {

    /* renamed from: b, reason: collision with root package name */
    public static final Position f132354b;

    /* renamed from: c, reason: collision with root package name */
    public static final Position f132355c;

    /* renamed from: d, reason: collision with root package name */
    public static final Position f132356d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Position[] f132357e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f132358f;

    static {
        Position position = new Position("LEFT", 0);
        Position position2 = new Position("RIGHT", 1);
        Position position3 = new Position("SINGLE", 2);
        f132354b = position3;
        Position position4 = new Position("MIDDLE", 3);
        f132355c = position4;
        Position position5 = new Position("DEFAULT", 4);
        f132356d = position5;
        Position[] positionArr = {position, position2, position3, position4, position5};
        f132357e = positionArr;
        f132358f = c.a(positionArr);
    }

    public Position() {
        throw null;
    }

    public static Position valueOf(String str) {
        return (Position) Enum.valueOf(Position.class, str);
    }

    public static Position[] values() {
        return (Position[]) f132357e.clone();
    }
}
