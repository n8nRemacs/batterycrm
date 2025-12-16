package com.avito.android.calendar_select.presentation.view.konveyor.items.day;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Position.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/konveyor/items/day/Position;", "", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Position {

    /* renamed from: b, reason: collision with root package name */
    public static final Position f113505b;

    /* renamed from: c, reason: collision with root package name */
    public static final Position f113506c;

    /* renamed from: d, reason: collision with root package name */
    public static final Position f113507d;

    /* renamed from: e, reason: collision with root package name */
    public static final Position f113508e;

    /* renamed from: f, reason: collision with root package name */
    public static final Position f113509f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Position[] f113510g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f113511h;

    static {
        Position position = new Position("SINGLE", 0);
        f113505b = position;
        Position position2 = new Position("DEFAULT", 1);
        f113506c = position2;
        Position position3 = new Position("LEFT", 2);
        f113507d = position3;
        Position position4 = new Position("RIGHT", 3);
        f113508e = position4;
        Position position5 = new Position("MIDDLE", 4);
        f113509f = position5;
        Position[] positionArr = {position, position2, position3, position4, position5};
        f113510g = positionArr;
        f113511h = kotlin.enums.c.a(positionArr);
    }

    public Position() {
        throw null;
    }

    public static Position valueOf(String str) {
        return (Position) Enum.valueOf(Position.class, str);
    }

    public static Position[] values() {
        return (Position[]) f113510g.clone();
    }
}
