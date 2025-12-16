package com.avito.android.tariff_lf_publication.count.mvi.entity;

import AK.c;
import LD0.a;
import QD0.b;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffLfPublicationCountInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeCount", "ChangeNextButtonLoading", "Close", "Content", "HandleDeeplink", "Loading", "OnScreenError", "ScreenError", "ShowSimpleDeeplinkLoading", "UpdatePriceInfo", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$ChangeCount;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$ChangeNextButtonLoading;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$Close;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$Content;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$Loading;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$OnScreenError;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$ScreenError;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$ShowSimpleDeeplinkLoading;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$UpdatePriceInfo;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TariffLfPublicationCountInternalAction extends n {

    /* compiled from: TariffLfPublicationCountInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$ChangeCount;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeCount implements TariffLfPublicationCountInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f300824b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final a f300825c;

        public ChangeCount(long j12, @l a aVar) {
            this.f300824b = j12;
            this.f300825c = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeCount)) {
                return false;
            }
            ChangeCount changeCount = (ChangeCount) obj;
            return this.f300824b == changeCount.f300824b && L.f(this.f300825c, changeCount.f300825c);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f300824b) * 31;
            a aVar = this.f300825c;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @k
        public final String toString() {
            return "ChangeCount(countId=" + this.f300824b + ", priceInfo=" + this.f300825c + ')';
        }
    }

    /* compiled from: TariffLfPublicationCountInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$ChangeNextButtonLoading;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeNextButtonLoading implements TariffLfPublicationCountInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f300826b;

        public ChangeNextButtonLoading(boolean z12) {
            this.f300826b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeNextButtonLoading) && this.f300826b == ((ChangeNextButtonLoading) obj).f300826b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f300826b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ChangeNextButtonLoading(isLoading="), this.f300826b, ')');
        }
    }

    /* compiled from: TariffLfPublicationCountInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$Close;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements TariffLfPublicationCountInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f300827b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1372869435;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TariffLfPublicationCountInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$Content;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TariffLfPublicationCountInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PD0.a f300828b;

        public Content(@k PD0.a aVar) {
            this.f300828b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF206205d() {
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
            return (obj instanceof Content) && L.f(this.f300828b, ((Content) obj).f300828b);
        }

        public final int hashCode() {
            return this.f300828b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f300828b + ')';
        }
    }

    /* compiled from: TariffLfPublicationCountInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TariffLfPublicationCountInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f300829b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f300830c;

        public HandleDeeplink(@k DeepLink deepLink, @l Bundle bundle) {
            this.f300829b = deepLink;
            this.f300830c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f300829b, handleDeeplink.f300829b) && L.f(this.f300830c, handleDeeplink.f300830c);
        }

        public final int hashCode() {
            int iHashCode = this.f300829b.hashCode() * 31;
            Bundle bundle = this.f300830c;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f300829b);
            sb2.append(", args=");
            return H.m(sb2, this.f300830c, ')');
        }
    }

    /* compiled from: TariffLfPublicationCountInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$Loading;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements TariffLfPublicationCountInternalAction {
    }

    /* compiled from: TariffLfPublicationCountInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$OnScreenError;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnScreenError implements TariffLfPublicationCountInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f300831b;

        /* renamed from: c, reason: collision with root package name */
        public final long f300832c;

        public OnScreenError(@k ApiException apiException, long j12) {
            this.f300831b = apiException;
            this.f300832c = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnScreenError)) {
                return false;
            }
            OnScreenError onScreenError = (OnScreenError) obj;
            return this.f300831b.equals(onScreenError.f300831b) && this.f300832c == onScreenError.f300832c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f300832c) + (this.f300831b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnScreenError(throwable=");
            sb2.append(this.f300831b);
            sb2.append(", countId=");
            return r.u(sb2, this.f300832c, ')');
        }
    }

    /* compiled from: TariffLfPublicationCountInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$ScreenError;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScreenError implements TariffLfPublicationCountInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f300833b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f300834c;

        public ScreenError(@k ApiException apiException) {
            this.f300833b = apiException;
            this.f300834c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF206205d() {
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
            return (obj instanceof ScreenError) && this.f300833b.equals(((ScreenError) obj).f300833b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF99367c() {
            return this.f300834c;
        }

        public final int hashCode() {
            return this.f300833b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ScreenError(throwable="), this.f300833b, ')');
        }
    }

    /* compiled from: TariffLfPublicationCountInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$ShowSimpleDeeplinkLoading;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSimpleDeeplinkLoading implements TariffLfPublicationCountInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f300835b;

        public ShowSimpleDeeplinkLoading(boolean z12) {
            this.f300835b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowSimpleDeeplinkLoading) && this.f300835b == ((ShowSimpleDeeplinkLoading) obj).f300835b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f300835b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShowSimpleDeeplinkLoading(isLoading="), this.f300835b, ')');
        }
    }

    /* compiled from: TariffLfPublicationCountInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction$UpdatePriceInfo;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePriceInfo implements TariffLfPublicationCountInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f300836b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final b f300837c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AttributedText f300838d;

        public UpdatePriceInfo(long j12, @k b bVar, @k AttributedText attributedText) {
            this.f300836b = j12;
            this.f300837c = bVar;
            this.f300838d = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdatePriceInfo)) {
                return false;
            }
            UpdatePriceInfo updatePriceInfo = (UpdatePriceInfo) obj;
            return this.f300836b == updatePriceInfo.f300836b && L.f(this.f300837c, updatePriceInfo.f300837c) && L.f(this.f300838d, updatePriceInfo.f300838d);
        }

        public final int hashCode() {
            return this.f300838d.hashCode() + ((this.f300837c.hashCode() + (Long.hashCode(this.f300836b) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdatePriceInfo(countId=");
            sb2.append(this.f300836b);
            sb2.append(", priceInfo=");
            sb2.append(this.f300837c);
            sb2.append(", description=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f300838d, ')');
        }
    }
}
