package com.avito.android.tariff_lf_publication.region.mvi.entity;

import AK.c;
import SD0.a;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffLfPublicationRegionInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeNextButtonLoading", "ChangeRegion", "Close", "Content", "Error", "HandleDeeplink", "Loading", "ShowSimpleDeeplinkLoading", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$ChangeNextButtonLoading;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$ChangeRegion;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$Close;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$Content;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$Error;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$Loading;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$ShowSimpleDeeplinkLoading;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TariffLfPublicationRegionInternalAction extends n {

    /* compiled from: TariffLfPublicationRegionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$ChangeNextButtonLoading;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeNextButtonLoading implements TariffLfPublicationRegionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f301102b;

        public ChangeNextButtonLoading(boolean z12) {
            this.f301102b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeNextButtonLoading) && this.f301102b == ((ChangeNextButtonLoading) obj).f301102b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f301102b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ChangeNextButtonLoading(isLoading="), this.f301102b, ')');
        }
    }

    /* compiled from: TariffLfPublicationRegionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$ChangeRegion;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeRegion implements TariffLfPublicationRegionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f301103b;

        public ChangeRegion(@k String str) {
            this.f301103b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeRegion) && L.f(this.f301103b, ((ChangeRegion) obj).f301103b);
        }

        public final int hashCode() {
            return this.f301103b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangeRegion(regionId="), this.f301103b, ')');
        }
    }

    /* compiled from: TariffLfPublicationRegionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$Close;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements TariffLfPublicationRegionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f301104b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 2134675653;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TariffLfPublicationRegionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$Content;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TariffLfPublicationRegionInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f301105b;

        public Content(@k a aVar) {
            this.f301105b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF294761d() {
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
            return (obj instanceof Content) && L.f(this.f301105b, ((Content) obj).f301105b);
        }

        public final int hashCode() {
            return this.f301105b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f301105b + ')';
        }
    }

    /* compiled from: TariffLfPublicationRegionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$Error;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TariffLfPublicationRegionInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f301106b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f301107c;

        public Error(@k ApiException apiException) {
            this.f301106b = apiException;
            this.f301107c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF294761d() {
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
            return (obj instanceof Error) && this.f301106b.equals(((Error) obj).f301106b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF298642c() {
            return this.f301107c;
        }

        public final int hashCode() {
            return this.f301106b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f301106b, ')');
        }
    }

    /* compiled from: TariffLfPublicationRegionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TariffLfPublicationRegionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f301108b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f301109c;

        public HandleDeeplink(@k DeepLink deepLink, @l Bundle bundle) {
            this.f301108b = deepLink;
            this.f301109c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f301108b, handleDeeplink.f301108b) && L.f(this.f301109c, handleDeeplink.f301109c);
        }

        public final int hashCode() {
            int iHashCode = this.f301108b.hashCode() * 31;
            Bundle bundle = this.f301109c;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f301108b);
            sb2.append(", args=");
            return H.m(sb2, this.f301109c, ')');
        }
    }

    /* compiled from: TariffLfPublicationRegionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$Loading;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements TariffLfPublicationRegionInternalAction {
    }

    /* compiled from: TariffLfPublicationRegionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction$ShowSimpleDeeplinkLoading;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSimpleDeeplinkLoading implements TariffLfPublicationRegionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f301110b;

        public ShowSimpleDeeplinkLoading(boolean z12) {
            this.f301110b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowSimpleDeeplinkLoading) && this.f301110b == ((ShowSimpleDeeplinkLoading) obj).f301110b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f301110b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShowSimpleDeeplinkLoading(isLoading="), this.f301110b, ')');
        }
    }
}
