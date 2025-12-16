package com.avito.android.messenger.conversation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OpenedFrom.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/OpenedFrom;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OpenedFrom {

    /* renamed from: b, reason: collision with root package name */
    public static final OpenedFrom f189128b;

    /* renamed from: c, reason: collision with root package name */
    public static final OpenedFrom f189129c;

    /* renamed from: d, reason: collision with root package name */
    public static final OpenedFrom f189130d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ OpenedFrom[] f189131e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f189132f;

    static {
        OpenedFrom openedFrom = new OpenedFrom("CHAT_LIST", 0);
        f189128b = openedFrom;
        OpenedFrom openedFrom2 = new OpenedFrom("PUSH", 1);
        f189129c = openedFrom2;
        OpenedFrom openedFrom3 = new OpenedFrom("OTHER", 2);
        f189130d = openedFrom3;
        OpenedFrom[] openedFromArr = {openedFrom, openedFrom2, openedFrom3};
        f189131e = openedFromArr;
        f189132f = kotlin.enums.c.a(openedFromArr);
    }

    public OpenedFrom() {
        throw null;
    }

    public static OpenedFrom valueOf(String str) {
        return (OpenedFrom) Enum.valueOf(OpenedFrom.class, str);
    }

    public static OpenedFrom[] values() {
        return (OpenedFrom[]) f189131e.clone();
    }
}
