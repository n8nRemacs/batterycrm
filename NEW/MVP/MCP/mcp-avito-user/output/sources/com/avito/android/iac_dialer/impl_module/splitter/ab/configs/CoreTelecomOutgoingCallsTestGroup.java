package com.avito.android.iac_dialer.impl_module.splitter.ab.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CoreTelecomOutgoingCalls.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/splitter/ab/configs/CoreTelecomOutgoingCallsTestGroup;", "", "Lu3/j;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CoreTelecomOutgoingCallsTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final CoreTelecomOutgoingCallsTestGroup f166385c;

    /* renamed from: d, reason: collision with root package name */
    public static final CoreTelecomOutgoingCallsTestGroup f166386d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CoreTelecomOutgoingCallsTestGroup[] f166387e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f166388f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f166389b;

    static {
        CoreTelecomOutgoingCallsTestGroup coreTelecomOutgoingCallsTestGroup = new CoreTelecomOutgoingCallsTestGroup("NONE", 0, "");
        f166385c = coreTelecomOutgoingCallsTestGroup;
        CoreTelecomOutgoingCallsTestGroup coreTelecomOutgoingCallsTestGroup2 = new CoreTelecomOutgoingCallsTestGroup("CONTROL", 1, "control");
        CoreTelecomOutgoingCallsTestGroup coreTelecomOutgoingCallsTestGroup3 = new CoreTelecomOutgoingCallsTestGroup("TEST", 2, "test");
        f166386d = coreTelecomOutgoingCallsTestGroup3;
        CoreTelecomOutgoingCallsTestGroup[] coreTelecomOutgoingCallsTestGroupArr = {coreTelecomOutgoingCallsTestGroup, coreTelecomOutgoingCallsTestGroup2, coreTelecomOutgoingCallsTestGroup3};
        f166387e = coreTelecomOutgoingCallsTestGroupArr;
        f166388f = c.a(coreTelecomOutgoingCallsTestGroupArr);
    }

    public CoreTelecomOutgoingCallsTestGroup(String str, int i12, String str2) {
        this.f166389b = str2;
    }

    public static CoreTelecomOutgoingCallsTestGroup valueOf(String str) {
        return (CoreTelecomOutgoingCallsTestGroup) Enum.valueOf(CoreTelecomOutgoingCallsTestGroup.class, str);
    }

    public static CoreTelecomOutgoingCallsTestGroup[] values() {
        return (CoreTelecomOutgoingCallsTestGroup[]) f166387e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF166389b() {
        return this.f166389b;
    }
}
