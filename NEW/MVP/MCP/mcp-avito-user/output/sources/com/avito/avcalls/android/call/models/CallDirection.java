package com.avito.avcalls.android.call.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallDirection.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/call/models/CallDirection;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CallDirection {

    /* renamed from: b, reason: collision with root package name */
    public static final CallDirection f331535b;

    /* renamed from: c, reason: collision with root package name */
    public static final CallDirection f331536c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CallDirection[] f331537d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f331538e;

    static {
        CallDirection callDirection = new CallDirection("OUTGOING", 0);
        f331535b = callDirection;
        CallDirection callDirection2 = new CallDirection("INCOMING", 1);
        f331536c = callDirection2;
        CallDirection[] callDirectionArr = {callDirection, callDirection2};
        f331537d = callDirectionArr;
        f331538e = c.a(callDirectionArr);
    }

    public CallDirection() {
        throw null;
    }

    public static CallDirection valueOf(String str) {
        return (CallDirection) Enum.valueOf(CallDirection.class, str);
    }

    public static CallDirection[] values() {
        return (CallDirection[]) f331537d.clone();
    }
}
