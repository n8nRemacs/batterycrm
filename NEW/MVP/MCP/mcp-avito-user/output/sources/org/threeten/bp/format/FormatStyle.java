package org.threeten.bp.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class FormatStyle {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ FormatStyle[] f421952b = {new FormatStyle("FULL", 0), new FormatStyle("LONG", 1), new FormatStyle("MEDIUM", 2), new FormatStyle("SHORT", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    FormatStyle EF5;

    public FormatStyle() {
        throw null;
    }

    public static FormatStyle valueOf(String str) {
        return (FormatStyle) Enum.valueOf(FormatStyle.class, str);
    }

    public static FormatStyle[] values() {
        return (FormatStyle[]) f421952b.clone();
    }
}
