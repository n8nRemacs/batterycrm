package com.avito.android.offlinization.analytics.events;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TurnOfflineModeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/analytics/events/OfflineModeAction;", "", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OfflineModeAction {

    /* renamed from: c, reason: collision with root package name */
    public static final OfflineModeAction f208508c;

    /* renamed from: d, reason: collision with root package name */
    public static final OfflineModeAction f208509d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ OfflineModeAction[] f208510e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f208511f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f208512b;

    static {
        OfflineModeAction offlineModeAction = new OfflineModeAction("ON", 0, "on");
        f208508c = offlineModeAction;
        OfflineModeAction offlineModeAction2 = new OfflineModeAction("OFF", 1, "off");
        f208509d = offlineModeAction2;
        OfflineModeAction[] offlineModeActionArr = {offlineModeAction, offlineModeAction2, new OfflineModeAction("OFF_ATTEMPT", 2, "off attempt")};
        f208510e = offlineModeActionArr;
        f208511f = c.a(offlineModeActionArr);
    }

    public OfflineModeAction(String str, int i12, String str2) {
        this.f208512b = str2;
    }

    public static OfflineModeAction valueOf(String str) {
        return (OfflineModeAction) Enum.valueOf(OfflineModeAction.class, str);
    }

    public static OfflineModeAction[] values() {
        return (OfflineModeAction[]) f208510e.clone();
    }
}
