package com.avito.android.tariff_lf.edit_info.viewmodel;

import com.avito.android.R;
import com.avito.android.tariff.remote.model.edit.TariffBanner;
import j.InterfaceC42150f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PromoBlockStyleConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/viewmodel/G;", "Lcom/avito/android/tariff_lf/edit_info/viewmodel/F;", "<init>", "()V", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class G implements F {

    /* compiled from: PromoBlockStyleConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f299083a;

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
            f299083a = iArr;
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
        }
    }

    @Inject
    public G() {
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.F
    @InterfaceC42150f
    public final int a(@Y61.k TariffBanner.State state) {
        int i12 = a.f299083a[state.ordinal()];
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
}
