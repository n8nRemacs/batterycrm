package com.avito.android.serp_list;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Mode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp_list/Mode;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Mode {

    /* renamed from: b, reason: collision with root package name */
    public static final Mode f273992b;

    /* renamed from: c, reason: collision with root package name */
    public static final Mode f273993c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Mode[] f273994d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f273995e;

    static {
        Mode mode = new Mode("INLINE_ACTIONS_BAR", 0);
        f273992b = mode;
        Mode mode2 = new Mode("SERP_HEADER", 1);
        f273993c = mode2;
        Mode[] modeArr = {mode, mode2};
        f273994d = modeArr;
        f273995e = c.a(modeArr);
    }

    public Mode() {
        throw null;
    }

    public static Mode valueOf(String str) {
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public static Mode[] values() {
        return (Mode[]) f273994d.clone();
    }
}
