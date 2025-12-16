package com.avito.android.reward_program.ab_tests.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShowTicketEntryTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/reward_program/ab_tests/configs/ShowTicketEntryTestGroup;", "", "Lu3/j;", "_avito-discouraged_avito-feature_reward-program"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShowTicketEntryTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final ShowTicketEntryTestGroup f255684c;

    /* renamed from: d, reason: collision with root package name */
    public static final ShowTicketEntryTestGroup f255685d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ShowTicketEntryTestGroup[] f255686e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f255687f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f255688b;

    static {
        ShowTicketEntryTestGroup showTicketEntryTestGroup = new ShowTicketEntryTestGroup("CONTROL", 0, "control");
        f255684c = showTicketEntryTestGroup;
        ShowTicketEntryTestGroup showTicketEntryTestGroup2 = new ShowTicketEntryTestGroup("TEST", 1, "test");
        f255685d = showTicketEntryTestGroup2;
        ShowTicketEntryTestGroup[] showTicketEntryTestGroupArr = {showTicketEntryTestGroup, showTicketEntryTestGroup2};
        f255686e = showTicketEntryTestGroupArr;
        f255687f = c.a(showTicketEntryTestGroupArr);
    }

    public ShowTicketEntryTestGroup(String str, int i12, String str2) {
        this.f255688b = str2;
    }

    public static ShowTicketEntryTestGroup valueOf(String str) {
        return (ShowTicketEntryTestGroup) Enum.valueOf(ShowTicketEntryTestGroup.class, str);
    }

    public static ShowTicketEntryTestGroup[] values() {
        return (ShowTicketEntryTestGroup[]) f255686e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF255688b() {
        return this.f255688b;
    }
}
