package com.avito.android.iac_avcalls_network_test.impl_module.splitter.ab.configs;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkTestOnForegroundTest.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls_network_test/impl_module/splitter/ab/configs/NetworkTestOnForegroundTestGroup;", "", "Lu3/j;", "_avito_iac-avcalls-network-test_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NetworkTestOnForegroundTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final NetworkTestOnForegroundTestGroup f164676c;

    /* renamed from: d, reason: collision with root package name */
    public static final NetworkTestOnForegroundTestGroup f164677d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ NetworkTestOnForegroundTestGroup[] f164678e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f164679f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f164680b;

    static {
        NetworkTestOnForegroundTestGroup networkTestOnForegroundTestGroup = new NetworkTestOnForegroundTestGroup("NONE", 0, "");
        f164676c = networkTestOnForegroundTestGroup;
        NetworkTestOnForegroundTestGroup networkTestOnForegroundTestGroup2 = new NetworkTestOnForegroundTestGroup("CONTROL", 1, "control");
        NetworkTestOnForegroundTestGroup networkTestOnForegroundTestGroup3 = new NetworkTestOnForegroundTestGroup("TEST", 2, "test");
        f164677d = networkTestOnForegroundTestGroup3;
        NetworkTestOnForegroundTestGroup[] networkTestOnForegroundTestGroupArr = {networkTestOnForegroundTestGroup, networkTestOnForegroundTestGroup2, networkTestOnForegroundTestGroup3};
        f164678e = networkTestOnForegroundTestGroupArr;
        f164679f = c.a(networkTestOnForegroundTestGroupArr);
    }

    public NetworkTestOnForegroundTestGroup(String str, int i12, String str2) {
        this.f164680b = str2;
    }

    public static NetworkTestOnForegroundTestGroup valueOf(String str) {
        return (NetworkTestOnForegroundTestGroup) Enum.valueOf(NetworkTestOnForegroundTestGroup.class, str);
    }

    public static NetworkTestOnForegroundTestGroup[] values() {
        return (NetworkTestOnForegroundTestGroup[]) f164678e.clone();
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF164680b() {
        return this.f164680b;
    }
}
