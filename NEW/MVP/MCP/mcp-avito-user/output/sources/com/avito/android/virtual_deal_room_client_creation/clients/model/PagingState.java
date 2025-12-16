package com.avito.android.virtual_deal_room_client_creation.clients.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PagingState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/clients/model/PagingState;", "", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PagingState {

    /* renamed from: b, reason: collision with root package name */
    public static final PagingState f326628b;

    /* renamed from: c, reason: collision with root package name */
    public static final PagingState f326629c;

    /* renamed from: d, reason: collision with root package name */
    public static final PagingState f326630d;

    /* renamed from: e, reason: collision with root package name */
    public static final PagingState f326631e;

    /* renamed from: f, reason: collision with root package name */
    public static final PagingState f326632f;

    /* renamed from: g, reason: collision with root package name */
    public static final PagingState f326633g;

    /* renamed from: h, reason: collision with root package name */
    public static final PagingState f326634h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ PagingState[] f326635i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a f326636j;

    static {
        PagingState pagingState = new PagingState("End", 0);
        f326628b = pagingState;
        PagingState pagingState2 = new PagingState("InitialLoading", 1);
        f326629c = pagingState2;
        PagingState pagingState3 = new PagingState("AdditionLoading", 2);
        f326630d = pagingState3;
        PagingState pagingState4 = new PagingState("Empty", 3);
        f326631e = pagingState4;
        PagingState pagingState5 = new PagingState("NotFound", 4);
        f326632f = pagingState5;
        PagingState pagingState6 = new PagingState("Loaded", 5);
        f326633g = pagingState6;
        PagingState pagingState7 = new PagingState("Error", 6);
        f326634h = pagingState7;
        PagingState[] pagingStateArr = {pagingState, pagingState2, pagingState3, pagingState4, pagingState5, pagingState6, pagingState7};
        f326635i = pagingStateArr;
        f326636j = c.a(pagingStateArr);
    }

    public PagingState() {
        throw null;
    }

    public static PagingState valueOf(String str) {
        return (PagingState) Enum.valueOf(PagingState.class, str);
    }

    public static PagingState[] values() {
        return (PagingState[]) f326635i.clone();
    }
}
