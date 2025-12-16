package com.yandex.div.internal.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class Position {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Position[] f370167b = {new Position("LEFT", 0), new Position("RIGHT", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    Position EF5;

    public Position() {
        throw null;
    }

    public static Position valueOf(String str) {
        return (Position) Enum.valueOf(Position.class, str);
    }

    public static Position[] values() {
        return (Position[]) f370167b.clone();
    }
}
