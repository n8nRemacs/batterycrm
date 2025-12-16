package com.avito.android.mortgage_invite.client_search.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClientSearchState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/mvi/entity/PagingState;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PagingState {

    /* renamed from: b, reason: collision with root package name */
    public static final PagingState f205437b;

    /* renamed from: c, reason: collision with root package name */
    public static final PagingState f205438c;

    /* renamed from: d, reason: collision with root package name */
    public static final PagingState f205439d;

    /* renamed from: e, reason: collision with root package name */
    public static final PagingState f205440e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ PagingState[] f205441f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f205442g;

    static {
        PagingState pagingState = new PagingState("Loading", 0);
        f205437b = pagingState;
        PagingState pagingState2 = new PagingState("Error", 1);
        f205438c = pagingState2;
        PagingState pagingState3 = new PagingState("CanLoadMore", 2);
        f205439d = pagingState3;
        PagingState pagingState4 = new PagingState("End", 3);
        f205440e = pagingState4;
        PagingState[] pagingStateArr = {pagingState, pagingState2, pagingState3, pagingState4};
        f205441f = pagingStateArr;
        f205442g = c.a(pagingStateArr);
    }

    public PagingState() {
        throw null;
    }

    public static PagingState valueOf(String str) {
        return (PagingState) Enum.valueOf(PagingState.class, str);
    }

    public static PagingState[] values() {
        return (PagingState[]) f205441f.clone();
    }
}
