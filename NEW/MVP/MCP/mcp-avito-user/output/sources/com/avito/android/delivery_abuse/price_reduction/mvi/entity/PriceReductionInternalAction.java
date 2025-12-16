package com.avito.android.delivery_abuse.price_reduction.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PriceReductionInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Dismiss", "Error", "Loading", "SelectPrice", "Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction$Content;", "Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction$Dismiss;", "Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction$Error;", "Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction$Loading;", "Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction$SelectPrice;", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PriceReductionInternalAction extends n {

    /* compiled from: PriceReductionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction$Content;", "Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements PriceReductionInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        public final long f134897b;

        /* renamed from: c, reason: collision with root package name */
        public final long f134898c;

        /* renamed from: d, reason: collision with root package name */
        public final long f134899d;

        public Content(long j12, long j13, long j14) {
            this.f134897b = j12;
            this.f134898c = j13;
            this.f134899d = j14;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.f134897b == content.f134897b && this.f134898c == content.f134898c && this.f134899d == content.f134899d;
        }

        public final int hashCode() {
            return Long.hashCode(this.f134899d) + r.g(Long.hashCode(this.f134897b) * 31, 31, this.f134898c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(itemId=");
            sb2.append(this.f134897b);
            sb2.append(", oldPrice=");
            sb2.append(this.f134898c);
            sb2.append(", newPrice=");
            return r.u(sb2, this.f134899d, ')');
        }
    }

    /* compiled from: PriceReductionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction$Dismiss;", "Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction;", "<init>", "()V", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Dismiss implements PriceReductionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Dismiss f134900b = new Dismiss();

        private Dismiss() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return -1018707235;
        }

        @k
        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: PriceReductionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction$Error;", "Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements PriceReductionInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f134901b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f134902c;

        public Error(@k ApiError apiError) {
            this.f134901b = apiError;
            this.f134902c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f134901b, ((Error) obj).f134901b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF129429c() {
            return this.f134902c;
        }

        public final int hashCode() {
            return this.f134901b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(apiError="), this.f134901b, ')');
        }
    }

    /* compiled from: PriceReductionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction$Loading;", "Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction;", "<init>", "()V", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements PriceReductionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f134903b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1941238159;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: PriceReductionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction$SelectPrice;", "Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction;", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectPrice implements PriceReductionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f134904b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f134905c;

        public SelectPrice(long j12, boolean z12) {
            this.f134904b = j12;
            this.f134905c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectPrice)) {
                return false;
            }
            SelectPrice selectPrice = (SelectPrice) obj;
            return this.f134904b == selectPrice.f134904b && this.f134905c == selectPrice.f134905c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f134905c) + (Long.hashCode(this.f134904b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectPrice(price=");
            sb2.append(this.f134904b);
            sb2.append(", isNew=");
            return r.x(sb2, this.f134905c, ')');
        }
    }
}
