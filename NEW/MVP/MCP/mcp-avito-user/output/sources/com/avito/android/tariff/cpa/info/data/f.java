package com.avito.android.tariff.cpa.info.data;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.tariff.remote.model.edit.TariffBanner;
import j.InterfaceC42150f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PromoBlockStyleConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpa/info/data/f;", "Lcom/avito/android/tariff/cpa/info/data/e;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements e {

    /* compiled from: PromoBlockStyleConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f294626a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f294627b;

        static {
            int[] iArr = new int[TariffBanner.State.values().length];
            try {
                iArr[TariffBanner.State.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TariffBanner.State.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TariffBanner.State.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TariffBanner.State.DANGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f294626a = iArr;
            int[] iArr2 = new int[TariffBanner.IconType.values().length];
            try {
                iArr2[TariffBanner.IconType.CHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TariffBanner.IconType.CLOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TariffBanner.IconType.EXCLAIM.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f294627b = iArr2;
        }
    }

    @Inject
    public f() {
    }

    @Override // com.avito.android.tariff.cpa.info.data.e
    @InterfaceC42150f
    public final int a(@k TariffBanner.State state) {
        int i12 = a.f294626a[state.ordinal()];
        if (i12 == 1) {
            return R.attr.bannerGreen;
        }
        if (i12 == 2) {
            return R.attr.bannerBeige;
        }
        if (i12 == 3) {
            return R.attr.bannerOrange;
        }
        if (i12 == 4) {
            return R.attr.bannerRed;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.tariff.cpa.info.data.e
    @l
    public final Integer b(@l TariffBanner.IconType iconType) {
        int i12 = iconType == null ? -1 : a.f294627b[iconType.ordinal()];
        if (i12 == 1) {
            return Integer.valueOf(R.attr.ic_checkBold24);
        }
        if (i12 == 2) {
            return Integer.valueOf(R.attr.ic_timeBoldOutline24);
        }
        if (i12 != 3) {
            return null;
        }
        return Integer.valueOf(R.attr.ic_attentionRound24);
    }
}
