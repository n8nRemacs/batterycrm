package com.avito.android.tariff_lf.bar;

import Y61.l;
import com.avito.android.paid_services.routing.ProgressState;
import com.avito.android.paid_services.routing.TariffCountStatus;
import com.avito.android.tariff.remote.model.bar.BarDescriptionState;
import com.avito.android.tariff.remote.model.bar.BarProgressState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffBarConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf/bar/j;", "Lcom/avito/android/tariff_lf/bar/i;", "<init>", "()V", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements i {

    /* compiled from: TariffBarConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f298737a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f298738b;

        static {
            int[] iArr = new int[BarDescriptionState.values().length];
            try {
                iArr[BarDescriptionState.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f298737a = iArr;
            int[] iArr2 = new int[BarProgressState.values().length];
            try {
                iArr2[BarProgressState.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f298738b = iArr2;
        }
    }

    @Inject
    public j() {
    }

    @Override // com.avito.android.tariff_lf.bar.i
    @Y61.k
    public final TariffCountStatus a(@l BarDescriptionState barDescriptionState) {
        return (barDescriptionState == null ? -1 : a.f298737a[barDescriptionState.ordinal()]) == 1 ? TariffCountStatus.f210628c : TariffCountStatus.f210627b;
    }

    @Override // com.avito.android.tariff_lf.bar.i
    @Y61.k
    public final ProgressState b(@l BarProgressState barProgressState) {
        return (barProgressState == null ? -1 : a.f298738b[barProgressState.ordinal()]) == 1 ? ProgressState.f210624c : ProgressState.f210623b;
    }
}
