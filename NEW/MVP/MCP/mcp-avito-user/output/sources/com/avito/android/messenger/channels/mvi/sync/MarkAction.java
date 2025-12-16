package com.avito.android.messenger.channels.mvi.sync;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessengerReadStatusSyncAgent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/MarkAction;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MarkAction {

    /* renamed from: b, reason: collision with root package name */
    public static final MarkAction f188362b;

    /* renamed from: c, reason: collision with root package name */
    public static final MarkAction f188363c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ MarkAction[] f188364d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f188365e;

    static {
        MarkAction markAction = new MarkAction("AS_READ", 0);
        f188362b = markAction;
        MarkAction markAction2 = new MarkAction("AS_UNREAD", 1);
        f188363c = markAction2;
        MarkAction[] markActionArr = {markAction, markAction2};
        f188364d = markActionArr;
        f188365e = kotlin.enums.c.a(markActionArr);
    }

    public MarkAction() {
        throw null;
    }

    public static MarkAction valueOf(String str) {
        return (MarkAction) Enum.valueOf(MarkAction.class, str);
    }

    public static MarkAction[] values() {
        return (MarkAction[]) f188364d.clone();
    }
}
