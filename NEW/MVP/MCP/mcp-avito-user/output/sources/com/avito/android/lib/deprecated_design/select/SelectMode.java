package com.avito.android.lib.deprecated_design.select;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectMode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/select/SelectMode;", "", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SelectMode {

    /* renamed from: b, reason: collision with root package name */
    public static final SelectMode f178088b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ SelectMode[] f178089c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f178090d;

    static {
        SelectMode selectMode = new SelectMode("INPUT", 0);
        f178088b = selectMode;
        SelectMode[] selectModeArr = {selectMode, new SelectMode("SELECT", 1)};
        f178089c = selectModeArr;
        f178090d = kotlin.enums.c.a(selectModeArr);
    }

    public SelectMode() {
        throw null;
    }

    public static SelectMode valueOf(String str) {
        return (SelectMode) Enum.valueOf(SelectMode.class, str);
    }

    public static SelectMode[] values() {
        return (SelectMode[]) f178089c.clone();
    }
}
