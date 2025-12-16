package ld0;

import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.promo.PromoActionStyle;
import com.avito.android.promo.PromoStyle;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PromoUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lld0/b;", "", "<init>", "()V", "_avito_bx-content_widget_promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ld0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C43731b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C43731b f413953a = new C43731b();

    /* compiled from: PromoUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ld0.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f413954a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f413955b;

        static {
            int[] iArr = new int[PromoStyle.values().length];
            try {
                iArr[PromoStyle.WHITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PromoStyle.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PromoStyle.GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PromoStyle.RED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PromoStyle.ORANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PromoStyle.BEIGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PromoStyle.VIOLET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PromoStyle.WARMGRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalBlueGreen.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalBlueOrange.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalBlueRed.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalBlueViolet.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalBlueYellow.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalGreenBlue.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalGreenOrange.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalGreenRed.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalGreenViolet.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalGreenYellow.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalOrangeBlue.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalOrangeGreen.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalOrangeRed.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalOrangeViolet.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalOrangeYellow.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalRedBlue.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalRedGreen.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalRedOrange.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalRedViolet.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalRedYellow.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalVioletBlue.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalVioletGreen.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalVioletOrange.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalVioletRed.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalVioletYellow.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalYellowBlue.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalYellowGreen.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalYellowOrange.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalYellowRed.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[PromoStyle.MixedHorizontalYellowViolet.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[PromoStyle.MixedVerticalBlueGreen.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[PromoStyle.MixedVerticalBlueOrange.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[PromoStyle.MixedVerticalBlueRed.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[PromoStyle.MixedVerticalBlueViolet.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[PromoStyle.MixedVerticalBlueYellow.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[PromoStyle.MixedVerticalGreenBlue.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[PromoStyle.MixedVerticalGreenOrange.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[PromoStyle.MixedVerticalGreenRed.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[PromoStyle.MixedVerticalGreenViolet.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[PromoStyle.MixedVerticalGreenYellow.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[PromoStyle.MixedVerticalOrangeBlue.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[PromoStyle.MixedVerticalOrangeGreen.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[PromoStyle.MixedVerticalOrangeRed.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[PromoStyle.MixedVerticalOrangeViolet.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[PromoStyle.MixedVerticalOrangeYellow.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[PromoStyle.MixedVerticalRedBlue.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[PromoStyle.MixedVerticalRedGreen.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[PromoStyle.MixedVerticalRedOrange.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[PromoStyle.MixedVerticalRedViolet.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[PromoStyle.MixedVerticalRedYellow.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[PromoStyle.MixedVerticalVioletBlue.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[PromoStyle.MixedVerticalVioletGreen.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[PromoStyle.MixedVerticalVioletOrange.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[PromoStyle.MixedVerticalVioletRed.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[PromoStyle.MixedVerticalVioletYellow.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[PromoStyle.MixedVerticalYellowBlue.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[PromoStyle.MixedVerticalYellowGreen.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[PromoStyle.MixedVerticalYellowOrange.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[PromoStyle.MixedVerticalYellowRed.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[PromoStyle.MixedVerticalYellowViolet.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[PromoStyle.MonoHorizontalBeige.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[PromoStyle.MonoHorizontalBlue.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[PromoStyle.MonoHorizontalGreen.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[PromoStyle.MonoHorizontalOrange.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[PromoStyle.MonoHorizontalRed.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[PromoStyle.MonoHorizontalViolet.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[PromoStyle.MonoHorizontalWarmgray.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[PromoStyle.MonoHorizontalYellow.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[PromoStyle.MonoVerticalBeige.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[PromoStyle.MonoVerticalBlue.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[PromoStyle.MonoVerticalGreen.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[PromoStyle.MonoVerticalOrange.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[PromoStyle.MonoVerticalRed.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[PromoStyle.MonoVerticalViolet.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[PromoStyle.MonoVerticalWarmgray.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[PromoStyle.MonoVerticalYellow.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            f413954a = iArr;
            int[] iArr2 = new int[PromoActionStyle.values().length];
            try {
                iArr2[PromoActionStyle.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr2[PromoActionStyle.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr2[PromoActionStyle.ACCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr2[PromoActionStyle.ACCENT_SECONDARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr2[PromoActionStyle.OVERLAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr2[PromoActionStyle.OVERLAY_SECONDARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr2[PromoActionStyle.PAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr2[PromoActionStyle.PAY_SECONDARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr2[PromoActionStyle.SUCCESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr2[PromoActionStyle.DANGER.ordinal()] = 10;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr2[PromoActionStyle.INVERSE.ordinal()] = 11;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr2[PromoActionStyle.INVERSE_SECONDARY.ordinal()] = 12;
            } catch (NoSuchFieldError unused96) {
            }
            f413955b = iArr2;
        }
    }

    @InterfaceC42150f
    public static int a(@k PromoStyle promoStyle) {
        switch (a.f413954a[promoStyle.ordinal()]) {
            case 1:
                return R.attr.bannerWhite;
            case 2:
                return R.attr.bannerBlue;
            case 3:
                return R.attr.bannerGreen;
            case 4:
                return R.attr.bannerRed;
            case 5:
                return R.attr.bannerOrange;
            case 6:
                return R.attr.bannerBeige;
            case 7:
                return R.attr.bannerViolet;
            default:
                return R.attr.bannerWarmgray;
        }
    }

    @l
    public static C43730a b(@k PromoStyle promoStyle) {
        switch (a.f413954a[promoStyle.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 9:
                return new C43730a(R.attr.bannerBlue, R.attr.gradientLinearMixedHorizontalBlueGreen);
            case 10:
                return new C43730a(R.attr.bannerBlue, R.attr.gradientLinearMixedHorizontalBlueOrange);
            case 11:
                return new C43730a(R.attr.bannerBlue, R.attr.gradientLinearMixedHorizontalBlueRed);
            case 12:
                return new C43730a(R.attr.bannerBlue, R.attr.gradientLinearMixedHorizontalBlueViolet);
            case 13:
                return new C43730a(R.attr.bannerBlue, R.attr.gradientLinearMixedHorizontalBlueYellow);
            case 14:
                return new C43730a(R.attr.bannerGreen, R.attr.gradientLinearMixedHorizontalGreenBlue);
            case 15:
                return new C43730a(R.attr.bannerGreen, R.attr.gradientLinearMixedHorizontalGreenOrange);
            case 16:
                return new C43730a(R.attr.bannerGreen, R.attr.gradientLinearMixedHorizontalGreenRed);
            case 17:
                return new C43730a(R.attr.bannerGreen, R.attr.gradientLinearMixedHorizontalGreenViolet);
            case 18:
                return new C43730a(R.attr.bannerGreen, R.attr.gradientLinearMixedHorizontalGreenYellow);
            case 19:
                return new C43730a(R.attr.bannerOrange, R.attr.gradientLinearMixedHorizontalOrangeBlue);
            case 20:
                return new C43730a(R.attr.bannerOrange, R.attr.gradientLinearMixedHorizontalOrangeGreen);
            case 21:
                return new C43730a(R.attr.bannerOrange, R.attr.gradientLinearMixedHorizontalOrangeRed);
            case 22:
                return new C43730a(R.attr.bannerOrange, R.attr.gradientLinearMixedHorizontalOrangeViolet);
            case 23:
                return new C43730a(R.attr.bannerOrange, R.attr.gradientLinearMixedHorizontalOrangeYellow);
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                return new C43730a(R.attr.bannerRed, R.attr.gradientLinearMixedHorizontalRedBlue);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new C43730a(R.attr.bannerRed, R.attr.gradientLinearMixedHorizontalRedGreen);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new C43730a(R.attr.bannerRed, R.attr.gradientLinearMixedHorizontalRedOrange);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new C43730a(R.attr.bannerRed, R.attr.gradientLinearMixedHorizontalRedViolet);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new C43730a(R.attr.bannerRed, R.attr.gradientLinearMixedHorizontalRedYellow);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                return new C43730a(R.attr.bannerViolet, R.attr.gradientLinearMixedHorizontalVioletBlue);
            case 30:
                return new C43730a(R.attr.bannerViolet, R.attr.gradientLinearMixedHorizontalVioletGreen);
            case 31:
                return new C43730a(R.attr.bannerViolet, R.attr.gradientLinearMixedHorizontalVioletOrange);
            case 32:
                return new C43730a(R.attr.bannerViolet, R.attr.gradientLinearMixedHorizontalVioletRed);
            case 33:
                return new C43730a(R.attr.bannerViolet, R.attr.gradientLinearMixedHorizontalVioletYellow);
            case 34:
                return new C43730a(R.attr.bannerBeige, R.attr.gradientLinearMixedHorizontalYellowBlue);
            case 35:
                return new C43730a(R.attr.bannerBeige, R.attr.gradientLinearMixedHorizontalYellowGreen);
            case 36:
                return new C43730a(R.attr.bannerBeige, R.attr.gradientLinearMixedHorizontalYellowOrange);
            case 37:
                return new C43730a(R.attr.bannerBeige, R.attr.gradientLinearMixedHorizontalYellowRed);
            case 38:
                return new C43730a(R.attr.bannerBeige, R.attr.gradientLinearMixedHorizontalYellowViolet);
            case 39:
                return new C43730a(R.attr.bannerBlue, R.attr.gradientLinearMixedVerticalBlueGreen);
            case 40:
                return new C43730a(R.attr.bannerBlue, R.attr.gradientLinearMixedVerticalBlueOrange);
            case 41:
                return new C43730a(R.attr.bannerBlue, R.attr.gradientLinearMixedVerticalBlueRed);
            case 42:
                return new C43730a(R.attr.bannerBlue, R.attr.gradientLinearMixedVerticalBlueViolet);
            case 43:
                return new C43730a(R.attr.bannerBlue, R.attr.gradientLinearMixedVerticalBlueYellow);
            case 44:
                return new C43730a(R.attr.bannerGreen, R.attr.gradientLinearMixedVerticalGreenBlue);
            case 45:
                return new C43730a(R.attr.bannerGreen, R.attr.gradientLinearMixedVerticalGreenOrange);
            case 46:
                return new C43730a(R.attr.bannerGreen, R.attr.gradientLinearMixedVerticalGreenRed);
            case 47:
                return new C43730a(R.attr.bannerGreen, R.attr.gradientLinearMixedVerticalGreenViolet);
            case 48:
                return new C43730a(R.attr.bannerGreen, R.attr.gradientLinearMixedVerticalGreenYellow);
            case 49:
                return new C43730a(R.attr.bannerOrange, R.attr.gradientLinearMixedVerticalOrangeBlue);
            case 50:
                return new C43730a(R.attr.bannerOrange, R.attr.gradientLinearMixedVerticalOrangeGreen);
            case 51:
                return new C43730a(R.attr.bannerOrange, R.attr.gradientLinearMixedVerticalOrangeRed);
            case 52:
                return new C43730a(R.attr.bannerOrange, R.attr.gradientLinearMixedVerticalOrangeViolet);
            case 53:
                return new C43730a(R.attr.bannerOrange, R.attr.gradientLinearMixedVerticalOrangeYellow);
            case 54:
                return new C43730a(R.attr.bannerRed, R.attr.gradientLinearMixedVerticalRedBlue);
            case 55:
                return new C43730a(R.attr.bannerRed, R.attr.gradientLinearMixedVerticalRedGreen);
            case 56:
                return new C43730a(R.attr.bannerRed, R.attr.gradientLinearMixedVerticalRedOrange);
            case 57:
                return new C43730a(R.attr.bannerRed, R.attr.gradientLinearMixedVerticalRedViolet);
            case 58:
                return new C43730a(R.attr.bannerRed, R.attr.gradientLinearMixedVerticalRedYellow);
            case 59:
                return new C43730a(R.attr.bannerViolet, R.attr.gradientLinearMixedVerticalVioletBlue);
            case 60:
                return new C43730a(R.attr.bannerViolet, R.attr.gradientLinearMixedVerticalVioletGreen);
            case 61:
                return new C43730a(R.attr.bannerViolet, R.attr.gradientLinearMixedVerticalVioletOrange);
            case 62:
                return new C43730a(R.attr.bannerViolet, R.attr.gradientLinearMixedVerticalVioletRed);
            case 63:
                return new C43730a(R.attr.bannerViolet, R.attr.gradientLinearMixedVerticalVioletYellow);
            case 64:
                return new C43730a(R.attr.bannerBeige, R.attr.gradientLinearMixedVerticalYellowBlue);
            case 65:
                return new C43730a(R.attr.bannerBeige, R.attr.gradientLinearMixedVerticalYellowGreen);
            case 66:
                return new C43730a(R.attr.bannerBeige, R.attr.gradientLinearMixedVerticalYellowOrange);
            case 67:
                return new C43730a(R.attr.bannerBeige, R.attr.gradientLinearMixedVerticalYellowRed);
            case 68:
                return new C43730a(R.attr.bannerBeige, R.attr.gradientLinearMixedVerticalYellowViolet);
            case 69:
                return new C43730a(R.attr.bannerBeige, R.attr.gradientLinearMonoHorizontalBeige);
            case 70:
                return new C43730a(R.attr.bannerBlue, R.attr.gradientLinearMonoHorizontalBlue);
            case 71:
                return new C43730a(R.attr.bannerGreen, R.attr.gradientLinearMonoHorizontalGreen);
            case 72:
                return new C43730a(R.attr.bannerOrange, R.attr.gradientLinearMonoHorizontalOrange);
            case 73:
                return new C43730a(R.attr.bannerRed, R.attr.gradientLinearMonoHorizontalRed);
            case 74:
                return new C43730a(R.attr.bannerViolet, R.attr.gradientLinearMonoHorizontalViolet);
            case 75:
                return new C43730a(R.attr.bannerWarmgray, R.attr.gradientLinearMonoHorizontalWarmgray);
            case 76:
                return new C43730a(R.attr.bannerBeige, R.attr.gradientLinearMonoHorizontalYellow);
            case 77:
                return new C43730a(R.attr.bannerBeige, R.attr.gradientLinearMonoVerticalBeige);
            case 78:
                return new C43730a(R.attr.bannerBlue, R.attr.gradientLinearMonoVerticalBlue);
            case 79:
                return new C43730a(R.attr.bannerGreen, R.attr.gradientLinearMonoVerticalGreen);
            case 80:
                return new C43730a(R.attr.bannerOrange, R.attr.gradientLinearMonoVerticalOrange);
            case 81:
                return new C43730a(R.attr.bannerRed, R.attr.gradientLinearMonoVerticalRed);
            case 82:
                return new C43730a(R.attr.bannerViolet, R.attr.gradientLinearMonoVerticalViolet);
            case 83:
                return new C43730a(R.attr.bannerWarmgray, R.attr.gradientLinearMonoVerticalWarmgray);
            case 84:
                return new C43730a(R.attr.bannerBeige, R.attr.gradientLinearMonoVerticalYellow);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
