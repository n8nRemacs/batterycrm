package com.avito.android.services_portfolio.project.seller.mvi.entity;

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
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kv0.e;

/* compiled from: PortfolioProjectSellerInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "ContentLoaded", "Error", "Loading", "OpenImage", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction$Back;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction$ContentLoaded;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction$Error;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction$Loading;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction$OpenImage;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PortfolioProjectSellerInternalAction extends n {

    /* compiled from: PortfolioProjectSellerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction$Back;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction;", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements PortfolioProjectSellerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f280259b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -413349101;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: PortfolioProjectSellerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction$ContentLoaded;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements PortfolioProjectSellerInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final e f280260b;

        public ContentLoaded(@k e eVar) {
            this.f280260b = eVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
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
            return (obj instanceof ContentLoaded) && L.f(this.f280260b, ((ContentLoaded) obj).f280260b);
        }

        public final int hashCode() {
            return this.f280260b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(projectSeller=" + this.f280260b + ')';
        }
    }

    /* compiled from: PortfolioProjectSellerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction$Error;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements PortfolioProjectSellerInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f280261b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f280262c;

        public Error(@k ApiError apiError) {
            this.f280261b = apiError;
            this.f280262c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
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
            return (obj instanceof Error) && L.f(this.f280261b, ((Error) obj).f280261b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF328632c() {
            return this.f280262c;
        }

        public final int hashCode() {
            return this.f280261b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(error="), this.f280261b, ')');
        }
    }

    /* compiled from: PortfolioProjectSellerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction$Loading;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements PortfolioProjectSellerInternalAction {
    }

    /* compiled from: PortfolioProjectSellerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction$OpenImage;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenImage implements PortfolioProjectSellerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Image> f280263b;

        /* renamed from: c, reason: collision with root package name */
        public final int f280264c;

        public OpenImage(@k List<Image> list, int i12) {
            this.f280263b = list;
            this.f280264c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenImage)) {
                return false;
            }
            OpenImage openImage = (OpenImage) obj;
            return L.f(this.f280263b, openImage.f280263b) && this.f280264c == openImage.f280264c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f280264c) + (this.f280263b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenImage(images=");
            sb2.append(this.f280263b);
            sb2.append(", startPosition=");
            return r.t(sb2, this.f280264c, ')');
        }
    }
}
