package com.fasterxml.jackson.core.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class MatchStrength {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ MatchStrength[] f341140b = {new MatchStrength("NO_MATCH", 0), new MatchStrength("INCONCLUSIVE", 1), new MatchStrength("WEAK_MATCH", 2), new MatchStrength("SOLID_MATCH", 3), new MatchStrength("FULL_MATCH", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    MatchStrength EF5;

    public MatchStrength() {
        throw null;
    }

    public static MatchStrength valueOf(String str) {
        return (MatchStrength) Enum.valueOf(MatchStrength.class, str);
    }

    public static MatchStrength[] values() {
        return (MatchStrength[]) f341140b.clone();
    }
}
