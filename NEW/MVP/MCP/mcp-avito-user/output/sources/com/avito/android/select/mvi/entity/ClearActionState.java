package com.avito.android.select.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/mvi/entity/ClearActionState;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClearActionState {

    /* renamed from: b, reason: collision with root package name */
    public static final ClearActionState f265575b;

    /* renamed from: c, reason: collision with root package name */
    public static final ClearActionState f265576c;

    /* renamed from: d, reason: collision with root package name */
    public static final ClearActionState f265577d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ClearActionState[] f265578e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f265579f;

    static {
        ClearActionState clearActionState = new ClearActionState("ACTIVE", 0);
        f265575b = clearActionState;
        ClearActionState clearActionState2 = new ClearActionState("HIDDEN", 1);
        f265576c = clearActionState2;
        ClearActionState clearActionState3 = new ClearActionState("DISABLED", 2);
        f265577d = clearActionState3;
        ClearActionState[] clearActionStateArr = {clearActionState, clearActionState2, clearActionState3};
        f265578e = clearActionStateArr;
        f265579f = c.a(clearActionStateArr);
    }

    public ClearActionState() {
        throw null;
    }

    public static ClearActionState valueOf(String str) {
        return (ClearActionState) Enum.valueOf(ClearActionState.class, str);
    }

    public static ClearActionState[] values() {
        return (ClearActionState[]) f265578e.clone();
    }
}
