package com.avito.android.ab_tests.configs;

import Y61.k;
import com.avito.android.ab_tests.QuicTuningAB;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlin.time.g;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QuicTuningTestGroup.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/configs/QuicTuningTestGroup;", "", "Lu3/j;", "Lcom/avito/android/ab_tests/QuicTuningAB;", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class QuicTuningTestGroup implements j, QuicTuningAB {

    /* renamed from: c, reason: collision with root package name */
    public static final QuicTuningTestGroup f67913c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ QuicTuningTestGroup[] f67914d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f67915e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f67916b;

    /* compiled from: QuicTuningTestGroup.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[QuicTuningTestGroup.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                QuicTuningTestGroup quicTuningTestGroup = QuicTuningTestGroup.f67913c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                QuicTuningTestGroup quicTuningTestGroup2 = QuicTuningTestGroup.f67913c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                QuicTuningTestGroup quicTuningTestGroup3 = QuicTuningTestGroup.f67913c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                QuicTuningTestGroup quicTuningTestGroup4 = QuicTuningTestGroup.f67913c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                QuicTuningTestGroup quicTuningTestGroup5 = QuicTuningTestGroup.f67913c;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                QuicTuningTestGroup quicTuningTestGroup6 = QuicTuningTestGroup.f67913c;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                QuicTuningTestGroup quicTuningTestGroup7 = QuicTuningTestGroup.f67913c;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                QuicTuningTestGroup quicTuningTestGroup8 = QuicTuningTestGroup.f67913c;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                QuicTuningTestGroup quicTuningTestGroup9 = QuicTuningTestGroup.f67913c;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                QuicTuningTestGroup quicTuningTestGroup10 = QuicTuningTestGroup.f67913c;
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                QuicTuningTestGroup quicTuningTestGroup11 = QuicTuningTestGroup.f67913c;
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                QuicTuningTestGroup quicTuningTestGroup12 = QuicTuningTestGroup.f67913c;
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                QuicTuningTestGroup quicTuningTestGroup13 = QuicTuningTestGroup.f67913c;
                iArr[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                QuicTuningTestGroup quicTuningTestGroup14 = QuicTuningTestGroup.f67913c;
                iArr[14] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    static {
        QuicTuningTestGroup quicTuningTestGroup = new QuicTuningTestGroup("NONE", 0, "");
        f67913c = quicTuningTestGroup;
        QuicTuningTestGroup[] quicTuningTestGroupArr = {quicTuningTestGroup, new QuicTuningTestGroup("CONTROL_MOBILE", 1, "control_mobile"), new QuicTuningTestGroup("CONTROL_WIFI", 2, "control_wifi"), new QuicTuningTestGroup("TEST_3H_TCPRST_MOBILE", 3, "test_3h_tcprst_mobile"), new QuicTuningTestGroup("TEST_3H_TCPRST_WIFI", 4, "test_3h_tcprst_wifi"), new QuicTuningTestGroup("TEST_3H_TCPRSTQUIC_MOBILE", 5, "test_3h_tcprstquic_mobile"), new QuicTuningTestGroup("TEST_3H_TCPRSTQUIC_WIFI", 6, "test_3h_tcprstquic_wifi"), new QuicTuningTestGroup("TEST_3D_TCPRST_MOBILE", 7, "test_3d_tcprst_mobile"), new QuicTuningTestGroup("TEST_3D_TCPRST_WIFI", 8, "test_3d_tcprst_wifi"), new QuicTuningTestGroup("TEST_3D_TCPRSTQUIC_MOBILE", 9, "test_3d_tcprstquic_mobile"), new QuicTuningTestGroup("TEST_3D_TCPRSTQUIC_WIFI", 10, "test_3d_tcprstquic_wifi"), new QuicTuningTestGroup("TEST_7D_TCPRST_MOBILE", 11, "test_7d_tcprst_mobile"), new QuicTuningTestGroup("TEST_7D_TCPRST_WIFI", 12, "test_7d_tcprst_wifi"), new QuicTuningTestGroup("TEST_7D_TCPRSTQUIC_MOBILE", 13, "test_7d_tcprstquic_mobile"), new QuicTuningTestGroup("TEST_7D_TCPRSTQUIC_WIFI", 14, "test_7d_tcprstquic_wifi")};
        f67914d = quicTuningTestGroupArr;
        f67915e = c.a(quicTuningTestGroupArr);
    }

    public QuicTuningTestGroup(String str, int i12, String str2) {
        this.f67916b = str2;
    }

    public static QuicTuningTestGroup valueOf(String str) {
        return (QuicTuningTestGroup) Enum.valueOf(QuicTuningTestGroup.class, str);
    }

    public static QuicTuningTestGroup[] values() {
        return (QuicTuningTestGroup[]) f67914d.clone();
    }

    @Override // com.avito.android.ab_tests.QuicTuningAB
    public final boolean a() {
        switch (ordinal()) {
            case 0:
            case 1:
            case 2:
                return false;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.avito.android.ab_tests.QuicTuningAB
    public final boolean b() {
        return this != f67913c;
    }

    @Override // com.avito.android.ab_tests.QuicTuningAB
    public final boolean c() {
        switch (ordinal()) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                return false;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.avito.android.ab_tests.QuicTuningAB
    @k
    public final List<QuicTuningAB.ErrorType> d() {
        switch (ordinal()) {
            case 0:
                return C42784z0.f406748b;
            case 1:
                return C42784z0.f406748b;
            case 2:
                return C42784z0.f406748b;
            case 3:
                return Collections.singletonList(QuicTuningAB.ErrorType.f67734b);
            case 4:
                return Collections.singletonList(QuicTuningAB.ErrorType.f67734b);
            case 5:
                return C42745f0.U(QuicTuningAB.ErrorType.f67734b, QuicTuningAB.ErrorType.f67735c);
            case 6:
                return C42745f0.U(QuicTuningAB.ErrorType.f67734b, QuicTuningAB.ErrorType.f67735c);
            case 7:
                return Collections.singletonList(QuicTuningAB.ErrorType.f67734b);
            case 8:
                return Collections.singletonList(QuicTuningAB.ErrorType.f67734b);
            case 9:
                return C42745f0.U(QuicTuningAB.ErrorType.f67734b, QuicTuningAB.ErrorType.f67735c);
            case 10:
                return C42745f0.U(QuicTuningAB.ErrorType.f67734b, QuicTuningAB.ErrorType.f67735c);
            case 11:
                return Collections.singletonList(QuicTuningAB.ErrorType.f67734b);
            case 12:
                return Collections.singletonList(QuicTuningAB.ErrorType.f67734b);
            case 13:
                return C42745f0.U(QuicTuningAB.ErrorType.f67734b, QuicTuningAB.ErrorType.f67735c);
            case 14:
                return C42745f0.U(QuicTuningAB.ErrorType.f67734b, QuicTuningAB.ErrorType.f67735c);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.avito.android.ab_tests.QuicTuningAB
    public final boolean e() {
        switch (ordinal()) {
            case 0:
            case 1:
            case 2:
                return false;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.avito.android.ab_tests.QuicTuningAB
    public final boolean f() {
        switch (ordinal()) {
            case 0:
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
                return false;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.avito.android.ab_tests.QuicTuningAB
    public final long h() {
        switch (ordinal()) {
            case 0:
                e.f410651c.getClass();
                return 0L;
            case 1:
                e.f410651c.getClass();
                return 0L;
            case 2:
                e.f410651c.getClass();
                return 0L;
            case 3:
                return g.g(3, DurationUnit.f410636h);
            case 4:
                return g.g(3, DurationUnit.f410636h);
            case 5:
                return g.g(3, DurationUnit.f410636h);
            case 6:
                return g.g(3, DurationUnit.f410636h);
            case 7:
                return g.g(3, DurationUnit.f410637i);
            case 8:
                return g.g(3, DurationUnit.f410637i);
            case 9:
                return g.g(3, DurationUnit.f410637i);
            case 10:
                return g.g(3, DurationUnit.f410637i);
            case 11:
                return g.g(7, DurationUnit.f410637i);
            case 12:
                return g.g(7, DurationUnit.f410637i);
            case 13:
                return g.g(7, DurationUnit.f410637i);
            case 14:
                return g.g(7, DurationUnit.f410637i);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF67916b() {
        return this.f67916b;
    }
}
