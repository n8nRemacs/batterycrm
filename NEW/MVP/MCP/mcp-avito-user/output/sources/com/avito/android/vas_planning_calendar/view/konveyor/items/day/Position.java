package com.avito.android.vas_planning_calendar.view.konveyor.items.day;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Position.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_calendar/view/konveyor/items/day/Position;", "", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Position {

    /* renamed from: b, reason: collision with root package name */
    public static final Position f322695b;

    /* renamed from: c, reason: collision with root package name */
    public static final Position f322696c;

    /* renamed from: d, reason: collision with root package name */
    public static final Position f322697d;

    /* renamed from: e, reason: collision with root package name */
    public static final Position f322698e;

    /* renamed from: f, reason: collision with root package name */
    public static final Position f322699f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Position[] f322700g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f322701h;

    static {
        Position position = new Position("LEFT", 0);
        f322695b = position;
        Position position2 = new Position("RIGHT", 1);
        f322696c = position2;
        Position position3 = new Position("SINGLE", 2);
        f322697d = position3;
        Position position4 = new Position("MIDDLE", 3);
        f322698e = position4;
        Position position5 = new Position("DEFAULT", 4);
        f322699f = position5;
        Position[] positionArr = {position, position2, position3, position4, position5};
        f322700g = positionArr;
        f322701h = kotlin.enums.c.a(positionArr);
    }

    public Position() {
        throw null;
    }

    public static Position valueOf(String str) {
        return (Position) Enum.valueOf(Position.class, str);
    }

    public static Position[] values() {
        return (Position[]) f322700g.clone();
    }
}
