package com.avito.android.auto_loans_cabinet.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.auto_loans_cabinet.domain.e;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoLoansCabinetInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "CloseLoanDetailsBottomSheet", "Content", "Error", "Loading", "OpenDeeplink", "OpenLoanDetailsBottomSheet", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction$Back;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction$CloseLoanDetailsBottomSheet;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction$Content;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction$Error;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction$Loading;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction$OpenDeeplink;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction$OpenLoanDetailsBottomSheet;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AutoLoansCabinetInternalAction extends n {

    /* compiled from: AutoLoansCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction$Back;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction;", "<init>", "()V", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements AutoLoansCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f95441b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 561705912;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: AutoLoansCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction$CloseLoanDetailsBottomSheet;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction;", "<init>", "()V", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseLoanDetailsBottomSheet implements AutoLoansCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseLoanDetailsBottomSheet f95442b = new CloseLoanDetailsBottomSheet();

        private CloseLoanDetailsBottomSheet() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseLoanDetailsBottomSheet);
        }

        public final int hashCode() {
            return -493557367;
        }

        @k
        public final String toString() {
            return "CloseLoanDetailsBottomSheet";
        }
    }

    /* compiled from: AutoLoansCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction$Content;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements AutoLoansCabinetInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final e f95443b;

        public Content(@k e eVar) {
            this.f95443b = eVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF267993e() {
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
            return (obj instanceof Content) && L.f(this.f95443b, ((Content) obj).f95443b);
        }

        public final int hashCode() {
            return this.f95443b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(blankStatus=" + this.f95443b + ')';
        }
    }

    /* compiled from: AutoLoansCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction$Error;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements AutoLoansCabinetInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f95444b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f95445c;

        public Error(@k Throwable th2) {
            this.f95444b = th2;
            this.f95445c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF267993e() {
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
            return (obj instanceof Error) && L.f(this.f95444b, ((Error) obj).f95444b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF136700c() {
            return this.f95445c;
        }

        public final int hashCode() {
            return this.f95444b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f95444b, ')');
        }
    }

    /* compiled from: AutoLoansCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction$Loading;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements AutoLoansCabinetInternalAction {
    }

    /* compiled from: AutoLoansCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction$OpenDeeplink;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements AutoLoansCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f95446b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f95446b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f95446b, ((OpenDeeplink) obj).f95446b);
        }

        public final int hashCode() {
            return this.f95446b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f95446b, ')');
        }
    }

    /* compiled from: AutoLoansCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction$OpenLoanDetailsBottomSheet;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction;", "<init>", "()V", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenLoanDetailsBottomSheet implements AutoLoansCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenLoanDetailsBottomSheet f95447b = new OpenLoanDetailsBottomSheet();

        private OpenLoanDetailsBottomSheet() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenLoanDetailsBottomSheet);
        }

        public final int hashCode() {
            return 1268244061;
        }

        @k
        public final String toString() {
            return "OpenLoanDetailsBottomSheet";
        }
    }
}
