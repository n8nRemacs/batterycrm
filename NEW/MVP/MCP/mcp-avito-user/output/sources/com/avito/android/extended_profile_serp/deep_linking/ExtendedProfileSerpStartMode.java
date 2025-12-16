package com.avito.android.extended_profile_serp.deep_linking;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExtendedProfileStartMode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/deep_linking/ExtendedProfileSerpStartMode;", "", "_avito_extended-profile-serp_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedProfileSerpStartMode {

    /* renamed from: b, reason: collision with root package name */
    public static final ExtendedProfileSerpStartMode f152656b;

    /* renamed from: c, reason: collision with root package name */
    public static final ExtendedProfileSerpStartMode f152657c;

    /* renamed from: d, reason: collision with root package name */
    public static final ExtendedProfileSerpStartMode f152658d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ExtendedProfileSerpStartMode[] f152659e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f152660f;

    static {
        ExtendedProfileSerpStartMode extendedProfileSerpStartMode = new ExtendedProfileSerpStartMode("DEFAULT", 0);
        f152656b = extendedProfileSerpStartMode;
        ExtendedProfileSerpStartMode extendedProfileSerpStartMode2 = new ExtendedProfileSerpStartMode("OPEN_FILTERS", 1);
        f152657c = extendedProfileSerpStartMode2;
        ExtendedProfileSerpStartMode extendedProfileSerpStartMode3 = new ExtendedProfileSerpStartMode("OPEN_GEO_FILTERS", 2);
        f152658d = extendedProfileSerpStartMode3;
        ExtendedProfileSerpStartMode[] extendedProfileSerpStartModeArr = {extendedProfileSerpStartMode, extendedProfileSerpStartMode2, extendedProfileSerpStartMode3};
        f152659e = extendedProfileSerpStartModeArr;
        f152660f = c.a(extendedProfileSerpStartModeArr);
    }

    public ExtendedProfileSerpStartMode() {
        throw null;
    }

    public static ExtendedProfileSerpStartMode valueOf(String str) {
        return (ExtendedProfileSerpStartMode) Enum.valueOf(ExtendedProfileSerpStartMode.class, str);
    }

    public static ExtendedProfileSerpStartMode[] values() {
        return (ExtendedProfileSerpStartMode[]) f152659e.clone();
    }
}
