package com.avito.android.vas_discount.v2.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import com.avito.android.vas_discount.remote.model.DiscountResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasDiscountV2InternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseDialog", "LoadDataError", "LoadDataSuccess", "Loading", "NavigateToDeepLink", "Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction$CloseDialog;", "Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction$LoadDataError;", "Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction$LoadDataSuccess;", "Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction$Loading;", "Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction$NavigateToDeepLink;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface VasDiscountV2InternalAction extends n {

    /* compiled from: VasDiscountV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction$CloseDialog;", "Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction;", "<init>", "()V", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseDialog implements VasDiscountV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseDialog f319812b = new CloseDialog();

        private CloseDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseDialog);
        }

        public final int hashCode() {
            return -19753996;
        }

        @k
        public final String toString() {
            return "CloseDialog";
        }
    }

    /* compiled from: VasDiscountV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction$LoadDataError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadDataError implements TrackableError, VasDiscountV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f319813b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f319814c;

        public LoadDataError(@k ApiException apiException) {
            this.f319813b = apiException;
            this.f319814c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            return (obj instanceof LoadDataError) && this.f319813b.equals(((LoadDataError) obj).f319813b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF304465c() {
            return this.f319814c;
        }

        public final int hashCode() {
            return this.f319813b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("LoadDataError(error="), this.f319813b, ')');
        }
    }

    /* compiled from: VasDiscountV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction$LoadDataSuccess;", "Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadDataSuccess implements VasDiscountV2InternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DiscountResponse f319815b;

        public LoadDataSuccess(@k DiscountResponse discountResponse) {
            this.f319815b = discountResponse;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            return (obj instanceof LoadDataSuccess) && L.f(this.f319815b, ((LoadDataSuccess) obj).f319815b);
        }

        public final int hashCode() {
            return this.f319815b.hashCode();
        }

        @k
        public final String toString() {
            return "LoadDataSuccess(response=" + this.f319815b + ')';
        }
    }

    /* compiled from: VasDiscountV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction$Loading;", "Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements VasDiscountV2InternalAction {
    }

    /* compiled from: VasDiscountV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction$NavigateToDeepLink;", "Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToDeepLink implements VasDiscountV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f319816b;

        public NavigateToDeepLink(@k DeepLink deepLink) {
            this.f319816b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToDeepLink) && L.f(this.f319816b, ((NavigateToDeepLink) obj).f319816b);
        }

        public final int hashCode() {
            return this.f319816b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("NavigateToDeepLink(deepLink="), this.f319816b, ')');
        }
    }
}
