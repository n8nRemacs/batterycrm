package com.avito.android.comfortable_deal.paging;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PagingState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/paging/PagingState;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PagingState {

    /* renamed from: b, reason: collision with root package name */
    public static final PagingState f122408b;

    /* renamed from: c, reason: collision with root package name */
    public static final PagingState f122409c;

    /* renamed from: d, reason: collision with root package name */
    public static final PagingState f122410d;

    /* renamed from: e, reason: collision with root package name */
    public static final PagingState f122411e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ PagingState[] f122412f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f122413g;

    static {
        PagingState pagingState = new PagingState("CAN_LOAD_NEXT", 0);
        f122408b = pagingState;
        PagingState pagingState2 = new PagingState("LOADING", 1);
        f122409c = pagingState2;
        PagingState pagingState3 = new PagingState("ERROR", 2);
        f122410d = pagingState3;
        PagingState pagingState4 = new PagingState("END", 3);
        f122411e = pagingState4;
        PagingState[] pagingStateArr = {pagingState, pagingState2, pagingState3, pagingState4};
        f122412f = pagingStateArr;
        f122413g = c.a(pagingStateArr);
    }

    public PagingState() {
        throw null;
    }

    public static PagingState valueOf(String str) {
        return (PagingState) Enum.valueOf(PagingState.class, str);
    }

    public static PagingState[] values() {
        return (PagingState[]) f122412f.clone();
    }
}
