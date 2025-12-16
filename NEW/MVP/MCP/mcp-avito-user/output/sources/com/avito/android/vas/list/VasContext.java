package com.avito.android.vas.list;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VasContext.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas/list/VasContext;", "", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VasContext {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ VasContext[] f319453b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f319454c;

    static {
        VasContext[] vasContextArr = {new VasContext("DEFAULT", 0), new VasContext("WAITING_AD_ACTIVATION", 1), new VasContext("FINISHED_AD_ACTIVATION", 2), new VasContext("AD_EDITING", 3), new VasContext("POST_ACTIVATION", 4), new VasContext("AD_CREATION", 5)};
        f319453b = vasContextArr;
        f319454c = c.a(vasContextArr);
    }

    public VasContext() {
        throw null;
    }

    public static VasContext valueOf(String str) {
        return (VasContext) Enum.valueOf(VasContext.class, str);
    }

    public static VasContext[] values() {
        return (VasContext[]) f319453b.clone();
    }
}
