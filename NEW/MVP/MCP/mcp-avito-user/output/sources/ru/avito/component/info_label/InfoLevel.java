package ru.avito.component.info_label;

import hw.InterfaceC41178c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InfoLevel.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/info_label/InfoLevel;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InfoLevel {

    /* renamed from: b, reason: collision with root package name */
    public static final InfoLevel f430349b;

    /* renamed from: c, reason: collision with root package name */
    public static final InfoLevel f430350c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ InfoLevel[] f430351d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f430352e;

    static {
        InfoLevel infoLevel = new InfoLevel("INFO", 0);
        f430349b = infoLevel;
        InfoLevel infoLevel2 = new InfoLevel("WARNING", 1);
        InfoLevel infoLevel3 = new InfoLevel("ERROR", 2);
        f430350c = infoLevel3;
        InfoLevel[] infoLevelArr = {infoLevel, infoLevel2, infoLevel3};
        f430351d = infoLevelArr;
        f430352e = kotlin.enums.c.a(infoLevelArr);
    }

    public InfoLevel() {
        throw null;
    }

    public static InfoLevel valueOf(String str) {
        return (InfoLevel) Enum.valueOf(InfoLevel.class, str);
    }

    public static InfoLevel[] values() {
        return (InfoLevel[]) f430351d.clone();
    }
}
