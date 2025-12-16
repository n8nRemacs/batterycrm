package com.avito.android.ab_tests.configs;

import Y61.k;
import com.avito.android.ab_tests.Q;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QuicApiRequestsTestGroup.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/configs/QuicApiRequestsTestGroup;", "", "Lu3/j;", "Lcom/avito/android/ab_tests/Q;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class QuicApiRequestsTestGroup implements j, Q {

    /* renamed from: c, reason: collision with root package name */
    public static final QuicApiRequestsTestGroup f67898c;

    /* renamed from: d, reason: collision with root package name */
    public static final QuicApiRequestsTestGroup f67899d;

    /* renamed from: e, reason: collision with root package name */
    public static final QuicApiRequestsTestGroup f67900e;

    /* renamed from: f, reason: collision with root package name */
    public static final QuicApiRequestsTestGroup f67901f;

    /* renamed from: g, reason: collision with root package name */
    public static final QuicApiRequestsTestGroup f67902g;

    /* renamed from: h, reason: collision with root package name */
    public static final QuicApiRequestsTestGroup f67903h;

    /* renamed from: i, reason: collision with root package name */
    public static final QuicApiRequestsTestGroup f67904i;

    /* renamed from: j, reason: collision with root package name */
    public static final QuicApiRequestsTestGroup f67905j;

    /* renamed from: k, reason: collision with root package name */
    public static final QuicApiRequestsTestGroup f67906k;

    /* renamed from: l, reason: collision with root package name */
    public static final QuicApiRequestsTestGroup f67907l;

    /* renamed from: m, reason: collision with root package name */
    public static final QuicApiRequestsTestGroup f67908m;

    /* renamed from: n, reason: collision with root package name */
    public static final QuicApiRequestsTestGroup f67909n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ QuicApiRequestsTestGroup[] f67910o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ a f67911p;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67912b;

    static {
        QuicApiRequestsTestGroup quicApiRequestsTestGroup = new QuicApiRequestsTestGroup("NONE", 0, "");
        f67898c = quicApiRequestsTestGroup;
        QuicApiRequestsTestGroup quicApiRequestsTestGroup2 = new QuicApiRequestsTestGroup("CONTROL_ALL_NETWORKS", 1, "control_all_networks");
        f67899d = quicApiRequestsTestGroup2;
        QuicApiRequestsTestGroup quicApiRequestsTestGroup3 = new QuicApiRequestsTestGroup("TEST_ALL_NETWORKS", 2, "test_all_networks");
        f67900e = quicApiRequestsTestGroup3;
        QuicApiRequestsTestGroup quicApiRequestsTestGroup4 = new QuicApiRequestsTestGroup("CONTROL_MOBILE_NETWORKS", 3, "control_mobile_networks");
        f67901f = quicApiRequestsTestGroup4;
        QuicApiRequestsTestGroup quicApiRequestsTestGroup5 = new QuicApiRequestsTestGroup("TEST_MOBILE_NETWORKS", 4, "test_mobile_networks");
        f67902g = quicApiRequestsTestGroup5;
        QuicApiRequestsTestGroup quicApiRequestsTestGroup6 = new QuicApiRequestsTestGroup("CONTROL_MOBILE_NETWORKS_OPERATORS_FILTRATION", 5, "control_mobile_networks_operators_filtration");
        QuicApiRequestsTestGroup quicApiRequestsTestGroup7 = new QuicApiRequestsTestGroup("TEST_MOBILE_NETWORKS_OPERATORS_FILTRATION", 6, "test_mobile_networks_operators_filtration");
        f67903h = quicApiRequestsTestGroup7;
        QuicApiRequestsTestGroup quicApiRequestsTestGroup8 = new QuicApiRequestsTestGroup("CONTROL_WIFI", 7, "control_wifi");
        f67904i = quicApiRequestsTestGroup8;
        QuicApiRequestsTestGroup quicApiRequestsTestGroup9 = new QuicApiRequestsTestGroup("TEST_WIFI", 8, "test_wifi");
        f67905j = quicApiRequestsTestGroup9;
        QuicApiRequestsTestGroup quicApiRequestsTestGroup10 = new QuicApiRequestsTestGroup("CONTROL_NO_QUIC", 9, "control_no_quic");
        f67906k = quicApiRequestsTestGroup10;
        QuicApiRequestsTestGroup quicApiRequestsTestGroup11 = new QuicApiRequestsTestGroup("TEST_NO_QUIC_ALL_NETWORKS", 10, "test_no_quic_all_networks");
        f67907l = quicApiRequestsTestGroup11;
        QuicApiRequestsTestGroup quicApiRequestsTestGroup12 = new QuicApiRequestsTestGroup("TEST_NO_QUIC_MOBILE_NETWORKS", 11, "test_no_quic_mobile_networks");
        f67908m = quicApiRequestsTestGroup12;
        QuicApiRequestsTestGroup quicApiRequestsTestGroup13 = new QuicApiRequestsTestGroup("TEST_NO_QUIC_MOBILE_NETWORKS_OPERATORS_FILTRATION", 12, "test_no_quic_mobile_networks_operators_filtration");
        f67909n = quicApiRequestsTestGroup13;
        QuicApiRequestsTestGroup[] quicApiRequestsTestGroupArr = {quicApiRequestsTestGroup, quicApiRequestsTestGroup2, quicApiRequestsTestGroup3, quicApiRequestsTestGroup4, quicApiRequestsTestGroup5, quicApiRequestsTestGroup6, quicApiRequestsTestGroup7, quicApiRequestsTestGroup8, quicApiRequestsTestGroup9, quicApiRequestsTestGroup10, quicApiRequestsTestGroup11, quicApiRequestsTestGroup12, quicApiRequestsTestGroup13};
        f67910o = quicApiRequestsTestGroupArr;
        f67911p = c.a(quicApiRequestsTestGroupArr);
    }

    public QuicApiRequestsTestGroup(String str, int i12, String str2) {
        this.f67912b = str2;
    }

    public static QuicApiRequestsTestGroup valueOf(String str) {
        return (QuicApiRequestsTestGroup) Enum.valueOf(QuicApiRequestsTestGroup.class, str);
    }

    public static QuicApiRequestsTestGroup[] values() {
        return (QuicApiRequestsTestGroup[]) f67910o.clone();
    }

    @Override // com.avito.android.ab_tests.Q
    public final boolean a() {
        return e() || k() || this == f67903h || o() || f() || i() || m();
    }

    @Override // com.avito.android.ab_tests.Q
    public final boolean b() {
        return this != f67898c;
    }

    @Override // com.avito.android.ab_tests.Q
    public final boolean c() {
        return this == f67904i;
    }

    @Override // com.avito.android.ab_tests.Q
    public final boolean d() {
        return this == f67899d;
    }

    @Override // com.avito.android.ab_tests.Q
    public final boolean e() {
        return this == f67900e;
    }

    @Override // com.avito.android.ab_tests.Q
    public final boolean f() {
        return this == f67907l;
    }

    @Override // com.avito.android.ab_tests.Q
    @k
    /* renamed from: h, reason: from getter */
    public final String getF67912b() {
        return this.f67912b;
    }

    @Override // com.avito.android.ab_tests.Q
    public final boolean i() {
        return this == f67908m;
    }

    @Override // com.avito.android.ab_tests.Q
    public final boolean k() {
        return this == f67902g;
    }

    @Override // com.avito.android.ab_tests.Q
    public final boolean l() {
        return this == f67901f;
    }

    @Override // com.avito.android.ab_tests.Q
    public final boolean m() {
        return this == f67909n;
    }

    @Override // u3.j
    @k
    /* renamed from: n */
    public final String getF106999b() {
        return this.f67912b;
    }

    @Override // com.avito.android.ab_tests.Q
    public final boolean o() {
        return this == f67905j;
    }

    @Override // com.avito.android.ab_tests.Q
    public final boolean p() {
        return this == f67906k;
    }
}
