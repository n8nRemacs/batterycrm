package oJ;

import Y61.k;
import Y61.l;
import com.avito.android.iac_analytics.public_module.analytics_models.CallDeliveryType;
import com.avito.android.iac_analytics.public_module.analytics_models.CallEnablingScenario;
import com.avito.android.iac_analytics.public_module.analytics_models.CallsPopupType;
import com.avito.android.iac_analytics.public_module.analytics_models.IacEnablingScenario;
import com.avito.android.iac_analytics.public_module.analytics_models.MicAccessScenario;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: IacClickStreamFieldValue.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoJ/c;", "", "<init>", "()V", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oJ.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44656c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C44656c f419703a = new C44656c();

    /* compiled from: IacClickStreamFieldValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oJ.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f419704a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f419705b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f419706c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f419707d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f419708e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f419709f;

        static {
            int[] iArr = new int[CallDeliveryType.values().length];
            try {
                CallDeliveryType callDeliveryType = CallDeliveryType.f164269b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CallDeliveryType callDeliveryType2 = CallDeliveryType.f164269b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f419704a = iArr;
            int[] iArr2 = new int[IacCallDirection.values().length];
            try {
                iArr2[IacCallDirection.OUTGOING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[IacCallDirection.INCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f419705b = iArr2;
            int[] iArr3 = new int[MicAccessScenario.values().length];
            try {
                MicAccessScenario.a aVar = MicAccessScenario.f164289b;
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MicAccessScenario.a aVar2 = MicAccessScenario.f164289b;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                MicAccessScenario.a aVar3 = MicAccessScenario.f164289b;
                iArr3[4] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                MicAccessScenario.a aVar4 = MicAccessScenario.f164289b;
                iArr3[5] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                MicAccessScenario.a aVar5 = MicAccessScenario.f164289b;
                iArr3[7] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                MicAccessScenario.a aVar6 = MicAccessScenario.f164289b;
                iArr3[8] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                MicAccessScenario.a aVar7 = MicAccessScenario.f164289b;
                iArr3[3] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                MicAccessScenario.a aVar8 = MicAccessScenario.f164289b;
                iArr3[1] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                MicAccessScenario.a aVar9 = MicAccessScenario.f164289b;
                iArr3[11] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                MicAccessScenario.a aVar10 = MicAccessScenario.f164289b;
                iArr3[9] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                MicAccessScenario.a aVar11 = MicAccessScenario.f164289b;
                iArr3[6] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                MicAccessScenario.a aVar12 = MicAccessScenario.f164289b;
                iArr3[10] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            f419706c = iArr3;
            int[] iArr4 = new int[IacEnablingScenario.values().length];
            try {
                IacEnablingScenario iacEnablingScenario = IacEnablingScenario.f164281b;
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                IacEnablingScenario iacEnablingScenario2 = IacEnablingScenario.f164281b;
                iArr4[7] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                IacEnablingScenario iacEnablingScenario3 = IacEnablingScenario.f164281b;
                iArr4[1] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                IacEnablingScenario iacEnablingScenario4 = IacEnablingScenario.f164281b;
                iArr4[2] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                IacEnablingScenario iacEnablingScenario5 = IacEnablingScenario.f164281b;
                iArr4[5] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                IacEnablingScenario iacEnablingScenario6 = IacEnablingScenario.f164281b;
                iArr4[6] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                IacEnablingScenario iacEnablingScenario7 = IacEnablingScenario.f164281b;
                iArr4[8] = 7;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                IacEnablingScenario iacEnablingScenario8 = IacEnablingScenario.f164281b;
                iArr4[9] = 8;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                IacEnablingScenario iacEnablingScenario9 = IacEnablingScenario.f164281b;
                iArr4[10] = 9;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                IacEnablingScenario iacEnablingScenario10 = IacEnablingScenario.f164281b;
                iArr4[3] = 10;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                IacEnablingScenario iacEnablingScenario11 = IacEnablingScenario.f164281b;
                iArr4[4] = 11;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                IacEnablingScenario iacEnablingScenario12 = IacEnablingScenario.f164281b;
                iArr4[11] = 12;
            } catch (NoSuchFieldError unused28) {
            }
            f419707d = iArr4;
            int[] iArr5 = new int[CallsPopupType.values().length];
            try {
                CallsPopupType callsPopupType = CallsPopupType.f164277b;
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                CallsPopupType callsPopupType2 = CallsPopupType.f164277b;
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                CallsPopupType callsPopupType3 = CallsPopupType.f164277b;
                iArr5[2] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            f419708e = iArr5;
            int[] iArr6 = new int[CallEnablingScenario.values().length];
            try {
                CallEnablingScenario callEnablingScenario = CallEnablingScenario.f164273b;
                iArr6[0] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                CallEnablingScenario callEnablingScenario2 = CallEnablingScenario.f164273b;
                iArr6[1] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                CallEnablingScenario callEnablingScenario3 = CallEnablingScenario.f164273b;
                iArr6[2] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            f419709f = iArr6;
        }
    }

    @l
    public static Integer a(@l IacCallDirection iacCallDirection) {
        int i12 = iacCallDirection == null ? -1 : a.f419705b[iacCallDirection.ordinal()];
        if (i12 == -1) {
            return null;
        }
        if (i12 == 1) {
            return 1;
        }
        if (i12 == 2) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @l
    public static String b(@l CallEnablingScenario callEnablingScenario) {
        int i12 = callEnablingScenario == null ? -1 : a.f419709f[callEnablingScenario.ordinal()];
        if (i12 == -1) {
            return null;
        }
        if (i12 == 1) {
            return "item_add";
        }
        if (i12 == 2) {
            return "item_edit";
        }
        if (i12 == 3) {
            return "comm_methods";
        }
        throw new NoWhenBranchMatchedException();
    }

    @l
    public static String c(@l CallsPopupType callsPopupType) {
        int i12 = callsPopupType == null ? -1 : a.f419708e[callsPopupType.ordinal()];
        if (i12 == -1) {
            return null;
        }
        if (i12 == 1) {
            return "mic_regular";
        }
        if (i12 == 2) {
            return "iac_enabler";
        }
        if (i12 == 3) {
            return "mic_settings";
        }
        throw new NoWhenBranchMatchedException();
    }

    @l
    public static String d(@l IacEnablingScenario iacEnablingScenario) {
        switch (iacEnablingScenario == null ? -1 : a.f419707d[iacEnablingScenario.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return "after_item_publish";
            case 2:
                return "item_add";
            case 3:
                return "after_item_edit";
            case 4:
                return "settings";
            case 5:
                return "settings_system_mic_request";
            case 6:
                return "settings_custom_mic_request";
            case 7:
                return "iac_buttons";
            case 8:
                return "iac_settings";
            case 9:
                return "iac_permissions";
            case 10:
                return "order_call";
            case 11:
                return "call_time";
            case 12:
                return "pro_popup";
        }
    }
}
