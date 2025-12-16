package com.avito.android.tariff.cpx.info.sf.menu.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.cpx.info.sf.menu.domain.TariffCpxInfoSfMenuContent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoSfMenuInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/menu/mvi/entity/TariffCpxInfoSfMenuInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseDialog", "HandleDeeplinkWithCloseScreen", "OpenScreen", "Lcom/avito/android/tariff/cpx/info/sf/menu/mvi/entity/TariffCpxInfoSfMenuInternalAction$CloseDialog;", "Lcom/avito/android/tariff/cpx/info/sf/menu/mvi/entity/TariffCpxInfoSfMenuInternalAction$HandleDeeplinkWithCloseScreen;", "Lcom/avito/android/tariff/cpx/info/sf/menu/mvi/entity/TariffCpxInfoSfMenuInternalAction$OpenScreen;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TariffCpxInfoSfMenuInternalAction extends n {

    /* compiled from: TariffCpxInfoSfMenuInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/menu/mvi/entity/TariffCpxInfoSfMenuInternalAction$CloseDialog;", "Lcom/avito/android/tariff/cpx/info/sf/menu/mvi/entity/TariffCpxInfoSfMenuInternalAction;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseDialog implements TariffCpxInfoSfMenuInternalAction {
        static {
            new CloseDialog();
        }

        private CloseDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseDialog);
        }

        public final int hashCode() {
            return 1338423169;
        }

        @k
        public final String toString() {
            return "CloseDialog";
        }
    }

    /* compiled from: TariffCpxInfoSfMenuInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/menu/mvi/entity/TariffCpxInfoSfMenuInternalAction$HandleDeeplinkWithCloseScreen;", "Lcom/avito/android/tariff/cpx/info/sf/menu/mvi/entity/TariffCpxInfoSfMenuInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplinkWithCloseScreen implements TariffCpxInfoSfMenuInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f296804b;

        public HandleDeeplinkWithCloseScreen(@k DeepLink deepLink) {
            this.f296804b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplinkWithCloseScreen) && L.f(this.f296804b, ((HandleDeeplinkWithCloseScreen) obj).f296804b);
        }

        public final int hashCode() {
            return this.f296804b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplinkWithCloseScreen(deeplink="), this.f296804b, ')');
        }
    }

    /* compiled from: TariffCpxInfoSfMenuInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/menu/mvi/entity/TariffCpxInfoSfMenuInternalAction$OpenScreen;", "Lcom/avito/android/tariff/cpx/info/sf/menu/mvi/entity/TariffCpxInfoSfMenuInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenScreen implements TariffCpxInfoSfMenuInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TariffCpxInfoSfMenuContent f296805b;

        public OpenScreen(@k TariffCpxInfoSfMenuContent tariffCpxInfoSfMenuContent) {
            this.f296805b = tariffCpxInfoSfMenuContent;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211483d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenScreen) && L.f(this.f296805b, ((OpenScreen) obj).f296805b);
        }

        public final int hashCode() {
            return this.f296805b.f296784b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenScreen(content=" + this.f296805b + ')';
        }
    }
}
