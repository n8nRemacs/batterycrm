package com.avito.android.analytics.screens.tracker.degrade;

import Y61.k;
import com.avito.android.ab_tests.configs.DegradeSomeScreensTestGroup;
import com.avito.android.analytics.screens.Screen;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: DegradeScreenSteps.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/degrade/a;", "", "a", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<Screen> f90805a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C2681a f90806b;

    /* compiled from: DegradeScreenSteps.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/degrade/a$a;", "", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.screens.tracker.degrade.a$a, reason: collision with other inner class name */
    public static final class C2681a {

        /* renamed from: a, reason: collision with root package name */
        public final float f90807a;

        /* renamed from: b, reason: collision with root package name */
        public final float f90808b;

        /* renamed from: c, reason: collision with root package name */
        public final float f90809c;

        public C2681a() {
            this(0.0f, 0.0f, 0.0f, 7, null);
        }

        public C2681a(float f12, float f13, float f14) {
            this.f90807a = f12;
            this.f90808b = f13;
            this.f90809c = f14;
        }

        public /* synthetic */ C2681a(float f12, float f13, float f14, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? 0.0f : f12, (i12 & 2) != 0 ? 0.0f : f13, (i12 & 4) != 0 ? 0.0f : f14);
        }
    }

    /* compiled from: DegradeScreenSteps.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[DegradeSomeScreensTestGroup.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup = DegradeSomeScreensTestGroup.f67811c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup2 = DegradeSomeScreensTestGroup.f67811c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup3 = DegradeSomeScreensTestGroup.f67811c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup4 = DegradeSomeScreensTestGroup.f67811c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup5 = DegradeSomeScreensTestGroup.f67811c;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup6 = DegradeSomeScreensTestGroup.f67811c;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup7 = DegradeSomeScreensTestGroup.f67811c;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup8 = DegradeSomeScreensTestGroup.f67811c;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup9 = DegradeSomeScreensTestGroup.f67811c;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup10 = DegradeSomeScreensTestGroup.f67811c;
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup11 = DegradeSomeScreensTestGroup.f67811c;
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup12 = DegradeSomeScreensTestGroup.f67811c;
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup13 = DegradeSomeScreensTestGroup.f67811c;
                iArr[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup14 = DegradeSomeScreensTestGroup.f67811c;
                iArr[14] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup15 = DegradeSomeScreensTestGroup.f67811c;
                iArr[15] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup16 = DegradeSomeScreensTestGroup.f67811c;
                iArr[16] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup17 = DegradeSomeScreensTestGroup.f67811c;
                iArr[17] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup18 = DegradeSomeScreensTestGroup.f67811c;
                iArr[18] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup19 = DegradeSomeScreensTestGroup.f67811c;
                iArr[19] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup20 = DegradeSomeScreensTestGroup.f67811c;
                iArr[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup21 = DegradeSomeScreensTestGroup.f67811c;
                iArr[21] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup22 = DegradeSomeScreensTestGroup.f67811c;
                iArr[22] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup23 = DegradeSomeScreensTestGroup.f67811c;
                iArr[23] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup24 = DegradeSomeScreensTestGroup.f67811c;
                iArr[24] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                DegradeSomeScreensTestGroup degradeSomeScreensTestGroup25 = DegradeSomeScreensTestGroup.f67811c;
                iArr[25] = 26;
            } catch (NoSuchFieldError unused26) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k List<? extends Screen> list, @k DegradeSomeScreensTestGroup degradeSomeScreensTestGroup) {
        C2681a c2681a;
        this.f90805a = list;
        switch (degradeSomeScreensTestGroup.ordinal()) {
            case 0:
                c2681a = new C2681a(0.0f, 0.0f, 0.0f, 7, null);
                break;
            case 1:
                c2681a = new C2681a(0.0f, 0.0f, 0.0f, 7, null);
                break;
            case 2:
                c2681a = new C2681a(0.05f, 0.0f, 0.0f, 6, null);
                break;
            case 3:
                c2681a = new C2681a(0.1f, 0.0f, 0.0f, 6, null);
                break;
            case 4:
                c2681a = new C2681a(0.15f, 0.0f, 0.0f, 6, null);
                break;
            case 5:
                c2681a = new C2681a(0.2f, 0.0f, 0.0f, 6, null);
                break;
            case 6:
                c2681a = new C2681a(0.25f, 0.0f, 0.0f, 6, null);
                break;
            case 7:
                c2681a = new C2681a(0.0f, 0.05f, 0.0f, 5, null);
                break;
            case 8:
                c2681a = new C2681a(0.0f, 0.1f, 0.0f, 5, null);
                break;
            case 9:
                c2681a = new C2681a(0.0f, 0.15f, 0.0f, 5, null);
                break;
            case 10:
                c2681a = new C2681a(0.0f, 0.2f, 0.0f, 5, null);
                break;
            case 11:
                c2681a = new C2681a(0.0f, 0.25f, 0.0f, 5, null);
                break;
            case 12:
                c2681a = new C2681a(0.0f, 0.0f, 0.05f, 3, null);
                break;
            case 13:
                c2681a = new C2681a(0.0f, 0.0f, 0.1f, 3, null);
                break;
            case 14:
                c2681a = new C2681a(0.0f, 0.0f, 0.15f, 3, null);
                break;
            case 15:
                c2681a = new C2681a(0.0f, 0.0f, 0.2f, 3, null);
                break;
            case 16:
                c2681a = new C2681a(0.0f, 0.0f, 0.25f, 3, null);
                break;
            case 17:
                c2681a = new C2681a(0.03f, 0.06f, 0.03f);
                break;
            case 18:
                c2681a = new C2681a(0.05f, 0.1f, 0.05f);
                break;
            case 19:
                c2681a = new C2681a(0.07f, 0.14f, 0.07f);
                break;
            case 20:
                c2681a = new C2681a(0.1f, 0.2f, 0.1f);
                break;
            case 21:
                c2681a = new C2681a(0.15f, 0.3f, 0.15f);
                break;
            case 22:
                c2681a = new C2681a(0.2f, 0.4f, 0.2f);
                break;
            case 23:
                c2681a = new C2681a(0.25f, 0.5f, 0.25f);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                c2681a = new C2681a(0.3f, 0.6f, 0.3f);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                c2681a = new C2681a(0.35f, 0.7f, 0.35f);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f90806b = c2681a;
    }

    public /* synthetic */ a(List list, DegradeSomeScreensTestGroup degradeSomeScreensTestGroup, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? DegradeSomeScreensTestGroup.f67812d : degradeSomeScreensTestGroup);
    }
}
