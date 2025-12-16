package com.avito.android.lib.design.map.state;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MoveTo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/map/state/MoveReason;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MoveReason {

    /* renamed from: b, reason: collision with root package name */
    public static final MoveReason f179644b;

    /* renamed from: c, reason: collision with root package name */
    public static final MoveReason f179645c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ MoveReason[] f179646d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f179647e;

    static {
        MoveReason moveReason = new MoveReason("GESTURE", 0);
        f179644b = moveReason;
        MoveReason moveReason2 = new MoveReason("DEVELOP", 1);
        f179645c = moveReason2;
        MoveReason[] moveReasonArr = {moveReason, moveReason2};
        f179646d = moveReasonArr;
        f179647e = c.a(moveReasonArr);
    }

    public MoveReason() {
        throw null;
    }

    public static MoveReason valueOf(String str) {
        return (MoveReason) Enum.valueOf(MoveReason.class, str);
    }

    public static MoveReason[] values() {
        return (MoveReason[]) f179646d.clone();
    }
}
