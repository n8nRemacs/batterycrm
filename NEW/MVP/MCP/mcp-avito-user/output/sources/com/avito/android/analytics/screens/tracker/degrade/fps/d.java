package com.avito.android.analytics.screens.tracker.degrade.fps;

import Y61.k;
import Y61.l;
import com.avito.android.ab_tests.configs.DegradeScrollTestGroup;
import com.avito.android.analytics.screens.tracker.fps.ScreenFpsContext;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: DegradeScreenScrollStrategyActualDegradation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/degrade/fps/d;", "Lcom/avito/android/analytics/screens/tracker/degrade/fps/c;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final long f90819a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f90820b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Double f90821c;

    /* compiled from: DegradeScreenScrollStrategyActualDegradation.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DegradeScrollTestGroup.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup = DegradeScrollTestGroup.f67806c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup2 = DegradeScrollTestGroup.f67806c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup3 = DegradeScrollTestGroup.f67806c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup4 = DegradeScrollTestGroup.f67806c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup5 = DegradeScrollTestGroup.f67806c;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup6 = DegradeScrollTestGroup.f67806c;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup7 = DegradeScrollTestGroup.f67806c;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup8 = DegradeScrollTestGroup.f67806c;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup9 = DegradeScrollTestGroup.f67806c;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup10 = DegradeScrollTestGroup.f67806c;
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup11 = DegradeScrollTestGroup.f67806c;
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup12 = DegradeScrollTestGroup.f67806c;
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup13 = DegradeScrollTestGroup.f67806c;
                iArr[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup14 = DegradeScrollTestGroup.f67806c;
                iArr[14] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup15 = DegradeScrollTestGroup.f67806c;
                iArr[15] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup16 = DegradeScrollTestGroup.f67806c;
                iArr[16] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup17 = DegradeScrollTestGroup.f67806c;
                iArr[17] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup18 = DegradeScrollTestGroup.f67806c;
                iArr[18] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup19 = DegradeScrollTestGroup.f67806c;
                iArr[19] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup20 = DegradeScrollTestGroup.f67806c;
                iArr[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup21 = DegradeScrollTestGroup.f67806c;
                iArr[21] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup22 = DegradeScrollTestGroup.f67806c;
                iArr[22] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup23 = DegradeScrollTestGroup.f67806c;
                iArr[23] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup24 = DegradeScrollTestGroup.f67806c;
                iArr[24] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup25 = DegradeScrollTestGroup.f67806c;
                iArr[25] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup26 = DegradeScrollTestGroup.f67806c;
                iArr[26] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup27 = DegradeScrollTestGroup.f67806c;
                iArr[27] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                DegradeScrollTestGroup degradeScrollTestGroup28 = DegradeScrollTestGroup.f67806c;
                iArr[28] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    public d(long j12, DegradeScrollTestGroup degradeScrollTestGroup, i iVar, int i12, C42822w c42822w) {
        iVar = (i12 & 4) != 0 ? new i() : iVar;
        this.f90819a = j12;
        this.f90820b = iVar;
        Double dValueOf = null;
        switch (degradeScrollTestGroup.ordinal()) {
            case 0:
            case 1:
                break;
            case 2:
                dValueOf = Double.valueOf(0.03d);
                break;
            case 3:
                dValueOf = Double.valueOf(0.05d);
                break;
            case 4:
                dValueOf = Double.valueOf(0.1d);
                break;
            case 5:
                dValueOf = Double.valueOf(0.15d);
                break;
            case 6:
                dValueOf = Double.valueOf(0.2d);
                break;
            case 7:
                dValueOf = Double.valueOf(0.25d);
                break;
            case 8:
                dValueOf = Double.valueOf(0.3d);
                break;
            case 9:
                dValueOf = Double.valueOf(0.35d);
                break;
            case 10:
                dValueOf = Double.valueOf(0.4d);
                break;
            case 11:
                dValueOf = Double.valueOf(0.5d);
                break;
            case 12:
                dValueOf = Double.valueOf(1.0d);
                break;
            case 13:
                dValueOf = Double.valueOf(1.25d);
                break;
            case 14:
                dValueOf = Double.valueOf(1.5d);
                break;
            case 15:
                dValueOf = Double.valueOf(1.75d);
                break;
            case 16:
                dValueOf = Double.valueOf(2.0d);
                break;
            case 17:
                dValueOf = Double.valueOf(2.25d);
                break;
            case 18:
                dValueOf = Double.valueOf(2.5d);
                break;
            case 19:
                dValueOf = Double.valueOf(2.75d);
                break;
            case 20:
                dValueOf = Double.valueOf(3.0d);
                break;
            case 21:
                dValueOf = Double.valueOf(3.25d);
                break;
            case 22:
                dValueOf = Double.valueOf(3.5d);
                break;
            case 23:
                dValueOf = Double.valueOf(3.75d);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                dValueOf = Double.valueOf(4.0d);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                dValueOf = Double.valueOf(4.5d);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                dValueOf = Double.valueOf(5.0d);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                dValueOf = Double.valueOf(5.5d);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                dValueOf = Double.valueOf(6.0d);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f90821c = dValueOf;
    }

    @Override // com.avito.android.analytics.screens.tracker.degrade.fps.c
    public final void a() throws InterruptedException {
        Double d12 = this.f90821c;
        if (d12 != null) {
            long j12 = this.f90819a;
            if (j12 != 0) {
                long jDoubleValue = (long) (d12.doubleValue() * j12);
                this.f90820b.getClass();
                Thread.sleep(jDoubleValue);
            }
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.degrade.fps.c
    public final void b(@k com.avito.android.fps.a aVar, @k ScreenFpsContext screenFpsContext) {
    }
}
