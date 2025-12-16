package org.koin.core.logger;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lorg/koin/core/logger/Level;", "", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Level {

    /* renamed from: b, reason: collision with root package name */
    public static final Level f421465b;

    /* renamed from: c, reason: collision with root package name */
    public static final Level f421466c;

    /* renamed from: d, reason: collision with root package name */
    public static final Level f421467d;

    /* renamed from: e, reason: collision with root package name */
    public static final Level f421468e;

    /* renamed from: f, reason: collision with root package name */
    public static final Level f421469f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Level[] f421470g;

    static {
        Level level = new Level("DEBUG", 0);
        f421465b = level;
        Level level2 = new Level("INFO", 1);
        f421466c = level2;
        Level level3 = new Level("WARNING", 2);
        f421467d = level3;
        Level level4 = new Level("ERROR", 3);
        f421468e = level4;
        Level level5 = new Level("NONE", 4);
        f421469f = level5;
        f421470g = new Level[]{level, level2, level3, level4, level5};
    }

    public Level() {
        throw null;
    }

    public static Level valueOf(String str) {
        return (Level) Enum.valueOf(Level.class, str);
    }

    public static Level[] values() {
        return (Level[]) f421470g.clone();
    }
}
