package com.avito.android.ai_assistant.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppendDirection.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/model/AppendDirection;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AppendDirection {

    /* renamed from: b, reason: collision with root package name */
    public static final AppendDirection f89103b;

    /* renamed from: c, reason: collision with root package name */
    public static final AppendDirection f89104c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AppendDirection[] f89105d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f89106e;

    static {
        AppendDirection appendDirection = new AppendDirection("START", 0);
        f89103b = appendDirection;
        AppendDirection appendDirection2 = new AppendDirection("END", 1);
        f89104c = appendDirection2;
        AppendDirection[] appendDirectionArr = {appendDirection, appendDirection2};
        f89105d = appendDirectionArr;
        f89106e = kotlin.enums.c.a(appendDirectionArr);
    }

    public AppendDirection() {
        throw null;
    }

    public static AppendDirection valueOf(String str) {
        return (AppendDirection) Enum.valueOf(AppendDirection.class, str);
    }

    public static AppendDirection[] values() {
        return (AppendDirection[]) f89105d.clone();
    }
}
