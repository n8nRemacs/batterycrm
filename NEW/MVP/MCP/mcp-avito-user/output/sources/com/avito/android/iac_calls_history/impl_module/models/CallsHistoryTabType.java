package com.avito.android.iac_calls_history.impl_module.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallsHistoryTabType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/models/CallsHistoryTabType;", "", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CallsHistoryTabType {

    /* renamed from: b, reason: collision with root package name */
    public static final CallsHistoryTabType f164755b;

    /* renamed from: c, reason: collision with root package name */
    public static final CallsHistoryTabType f164756c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CallsHistoryTabType[] f164757d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f164758e;

    static {
        CallsHistoryTabType callsHistoryTabType = new CallsHistoryTabType("ALL", 0);
        f164755b = callsHistoryTabType;
        CallsHistoryTabType callsHistoryTabType2 = new CallsHistoryTabType("MISSED", 1);
        f164756c = callsHistoryTabType2;
        CallsHistoryTabType[] callsHistoryTabTypeArr = {callsHistoryTabType, callsHistoryTabType2};
        f164757d = callsHistoryTabTypeArr;
        f164758e = c.a(callsHistoryTabTypeArr);
    }

    public CallsHistoryTabType() {
        throw null;
    }

    public static CallsHistoryTabType valueOf(String str) {
        return (CallsHistoryTabType) Enum.valueOf(CallsHistoryTabType.class, str);
    }

    public static CallsHistoryTabType[] values() {
        return (CallsHistoryTabType[]) f164757d.clone();
    }
}
