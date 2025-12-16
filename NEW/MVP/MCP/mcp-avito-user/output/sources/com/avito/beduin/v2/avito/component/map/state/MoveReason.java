package com.avito.beduin.v2.avito.component.map.state;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MoveReason.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/MoveReason;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MoveReason {

    /* renamed from: c, reason: collision with root package name */
    public static final MoveReason f334631c;

    /* renamed from: d, reason: collision with root package name */
    public static final MoveReason f334632d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ MoveReason[] f334633e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f334634f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f334635b;

    static {
        MoveReason moveReason = new MoveReason("Gesture", 0, "gesture");
        f334631c = moveReason;
        MoveReason moveReason2 = new MoveReason("Develop", 1, "develop");
        f334632d = moveReason2;
        MoveReason[] moveReasonArr = {moveReason, moveReason2};
        f334633e = moveReasonArr;
        f334634f = kotlin.enums.c.a(moveReasonArr);
    }

    public MoveReason(String str, int i12, String str2) {
        this.f334635b = str2;
    }

    public static MoveReason valueOf(String str) {
        return (MoveReason) Enum.valueOf(MoveReason.class, str);
    }

    public static MoveReason[] values() {
        return (MoveReason[]) f334633e.clone();
    }
}
