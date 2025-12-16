package com.avito.android.silent_update.permissions.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PermissionsState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update/permissions/mvi/entity/RequestState;", "", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequestState {

    /* renamed from: b, reason: collision with root package name */
    public static final RequestState f283737b;

    /* renamed from: c, reason: collision with root package name */
    public static final RequestState f283738c;

    /* renamed from: d, reason: collision with root package name */
    public static final RequestState f283739d;

    /* renamed from: e, reason: collision with root package name */
    public static final RequestState f283740e;

    /* renamed from: f, reason: collision with root package name */
    public static final RequestState f283741f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ RequestState[] f283742g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f283743h;

    static {
        RequestState requestState = new RequestState("INITIAL", 0);
        f283737b = requestState;
        RequestState requestState2 = new RequestState("STORAGE", 1);
        f283738c = requestState2;
        RequestState requestState3 = new RequestState("DOZE", 2);
        f283739d = requestState3;
        RequestState requestState4 = new RequestState("INSTALL", 3);
        f283740e = requestState4;
        RequestState requestState5 = new RequestState("FIN", 4);
        f283741f = requestState5;
        RequestState[] requestStateArr = {requestState, requestState2, requestState3, requestState4, requestState5};
        f283742g = requestStateArr;
        f283743h = c.a(requestStateArr);
    }

    public RequestState() {
        throw null;
    }

    public static RequestState valueOf(String str) {
        return (RequestState) Enum.valueOf(RequestState.class, str);
    }

    public static RequestState[] values() {
        return (RequestState[]) f283742g.clone();
    }
}
