package com.avito.android.util.coroutines;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Delays.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/coroutines/Delays;", "", "_common_coroutines_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Delays {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Delays[] f318856b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f318857c;

    static {
        Delays[] delaysArr = {new Delays()};
        f318856b = delaysArr;
        f318857c = c.a(delaysArr);
    }

    public static Delays valueOf(String str) {
        return (Delays) Enum.valueOf(Delays.class, str);
    }

    public static Delays[] values() {
        return (Delays[]) f318856b.clone();
    }
}
