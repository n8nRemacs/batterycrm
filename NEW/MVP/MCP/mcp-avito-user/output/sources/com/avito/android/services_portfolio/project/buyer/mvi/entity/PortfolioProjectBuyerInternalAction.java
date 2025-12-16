package com.avito.android.services_portfolio.project.buyer.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.Image;
import iv0.C42118d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PortfolioProjectBuyerInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "ContentLoaded", "Error", "Loading", "OpenImage", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction$Back;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction$ContentLoaded;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction$Error;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction$Loading;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction$OpenImage;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PortfolioProjectBuyerInternalAction extends n {

    /* compiled from: PortfolioProjectBuyerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction$Back;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction;", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements PortfolioProjectBuyerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f280039b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -543612495;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: PortfolioProjectBuyerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction$ContentLoaded;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements PortfolioProjectBuyerInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C42118d f280040b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AdvertAction.Messenger f280041c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AdvertAction.Phone f280042d;

        public ContentLoaded(@k C42118d c42118d, @l AdvertAction.Messenger messenger, @l AdvertAction.Phone phone) {
            this.f280040b = c42118d;
            this.f280041c = messenger;
            this.f280042d = phone;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
            if (!(obj instanceof ContentLoaded)) {
                return false;
            }
            ContentLoaded contentLoaded = (ContentLoaded) obj;
            return L.f(this.f280040b, contentLoaded.f280040b) && L.f(this.f280041c, contentLoaded.f280041c) && L.f(this.f280042d, contentLoaded.f280042d);
        }

        public final int hashCode() {
            int iHashCode = this.f280040b.hashCode() * 31;
            AdvertAction.Messenger messenger = this.f280041c;
            int iHashCode2 = (iHashCode + (messenger == null ? 0 : messenger.hashCode())) * 31;
            AdvertAction.Phone phone = this.f280042d;
            return iHashCode2 + (phone != null ? phone.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ContentLoaded(projectBuyer=" + this.f280040b + ", messageAction=" + this.f280041c + ", phoneAction=" + this.f280042d + ')';
        }
    }

    /* compiled from: PortfolioProjectBuyerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction$Error;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements PortfolioProjectBuyerInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f280043b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f280044c;

        public Error(@k ApiError apiError) {
            this.f280043b = apiError;
            this.f280044c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
            return (obj instanceof Error) && L.f(this.f280043b, ((Error) obj).f280043b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF247372d() {
            return this.f280044c;
        }

        public final int hashCode() {
            return this.f280043b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(error="), this.f280043b, ')');
        }
    }

    /* compiled from: PortfolioProjectBuyerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction$Loading;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements PortfolioProjectBuyerInternalAction {
    }

    /* compiled from: PortfolioProjectBuyerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction$OpenImage;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenImage implements PortfolioProjectBuyerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Image> f280045b;

        /* renamed from: c, reason: collision with root package name */
        public final int f280046c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AdvertAction.Phone f280047d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AdvertAction.Messenger f280048e;

        public OpenImage(@k List<Image> list, int i12, @l AdvertAction.Phone phone, @l AdvertAction.Messenger messenger) {
            this.f280045b = list;
            this.f280046c = i12;
            this.f280047d = phone;
            this.f280048e = messenger;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenImage)) {
                return false;
            }
            OpenImage openImage = (OpenImage) obj;
            return L.f(this.f280045b, openImage.f280045b) && this.f280046c == openImage.f280046c && L.f(this.f280047d, openImage.f280047d) && L.f(this.f280048e, openImage.f280048e);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f280046c, this.f280045b.hashCode() * 31, 31);
            AdvertAction.Phone phone = this.f280047d;
            int iHashCode = (iE2 + (phone == null ? 0 : phone.hashCode())) * 31;
            AdvertAction.Messenger messenger = this.f280048e;
            return iHashCode + (messenger != null ? messenger.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OpenImage(images=" + this.f280045b + ", startPosition=" + this.f280046c + ", phone=" + this.f280047d + ", message=" + this.f280048e + ')';
        }
    }
}
