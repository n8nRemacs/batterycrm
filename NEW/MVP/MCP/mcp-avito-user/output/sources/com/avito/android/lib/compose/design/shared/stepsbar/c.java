package com.avito.android.lib.compose.design.shared.stepsbar;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StepsBarContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/compose/design/shared/stepsbar/c;", "", "_design-modules_compose_shared_stepsbar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c[] f177706b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f177707c;

    static {
        c[] cVarArr = {new c("PROGRESS_NONE", 0), new c("PROGRESS_CURRENT", 1), new c("PROGRESS_FINAL", 2), new c("PROGRESS_DONE", 3)};
        f177706b = cVarArr;
        f177707c = kotlin.enums.c.a(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f177706b.clone();
    }
}
