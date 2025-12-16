package com.avito.android.select.bottom_sheet_pagination.blueprints;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaginationEventAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet_pagination/blueprints/PaginationState;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaginationState {

    /* renamed from: b, reason: collision with root package name */
    public static final PaginationState f265329b;

    /* renamed from: c, reason: collision with root package name */
    public static final PaginationState f265330c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ PaginationState[] f265331d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f265332e;

    static {
        PaginationState paginationState = new PaginationState("ON_LOADING_BIND", 0);
        f265329b = paginationState;
        PaginationState paginationState2 = new PaginationState("ON_ERROR_ACTION_CLICK", 1);
        f265330c = paginationState2;
        PaginationState[] paginationStateArr = {paginationState, paginationState2};
        f265331d = paginationStateArr;
        f265332e = c.a(paginationStateArr);
    }

    public PaginationState() {
        throw null;
    }

    public static PaginationState valueOf(String str) {
        return (PaginationState) Enum.valueOf(PaginationState.class, str);
    }

    public static PaginationState[] values() {
        return (PaginationState[]) f265331d.clone();
    }
}
