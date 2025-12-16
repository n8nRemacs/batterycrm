package com.avito.android.iac_dialer.impl_module.splitter.ab.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CoreTelecomIncomingCalls.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/splitter/ab/configs/CoreTelecomIncomingCallsTestGroup;", "", "Lu3/j;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CoreTelecomIncomingCallsTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final CoreTelecomIncomingCallsTestGroup f166380c;

    /* renamed from: d, reason: collision with root package name */
    public static final CoreTelecomIncomingCallsTestGroup f166381d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CoreTelecomIncomingCallsTestGroup[] f166382e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f166383f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f166384b;

    static {
        CoreTelecomIncomingCallsTestGroup coreTelecomIncomingCallsTestGroup = new CoreTelecomIncomingCallsTestGroup("NONE", 0, "");
        f166380c = coreTelecomIncomingCallsTestGroup;
        CoreTelecomIncomingCallsTestGroup coreTelecomIncomingCallsTestGroup2 = new CoreTelecomIncomingCallsTestGroup("CONTROL", 1, "control");
        CoreTelecomIncomingCallsTestGroup coreTelecomIncomingCallsTestGroup3 = new CoreTelecomIncomingCallsTestGroup("TEST", 2, "test");
        f166381d = coreTelecomIncomingCallsTestGroup3;
        CoreTelecomIncomingCallsTestGroup[] coreTelecomIncomingCallsTestGroupArr = {coreTelecomIncomingCallsTestGroup, coreTelecomIncomingCallsTestGroup2, coreTelecomIncomingCallsTestGroup3};
        f166382e = coreTelecomIncomingCallsTestGroupArr;
        f166383f = c.a(coreTelecomIncomingCallsTestGroupArr);
    }

    public CoreTelecomIncomingCallsTestGroup(String str, int i12, String str2) {
        this.f166384b = str2;
    }

    public static CoreTelecomIncomingCallsTestGroup valueOf(String str) {
        return (CoreTelecomIncomingCallsTestGroup) Enum.valueOf(CoreTelecomIncomingCallsTestGroup.class, str);
    }

    public static CoreTelecomIncomingCallsTestGroup[] values() {
        return (CoreTelecomIncomingCallsTestGroup[]) f166382e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF166389b() {
        return this.f166384b;
    }
}
