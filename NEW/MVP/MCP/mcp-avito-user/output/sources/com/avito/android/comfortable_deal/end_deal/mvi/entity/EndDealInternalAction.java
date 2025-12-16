package com.avito.android.comfortable_deal.end_deal.mvi.entity;

import AK.c;
import Lp.C14426a;
import Op.C14722a;
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
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import com.avito.android.comfortable_deal.end_deal.model.EndDealResult;
import com.avito.android.comfortable_deal.end_deal.model.EndDealSavedState;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import java.time.LocalDate;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EndDealInternalAction.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0082\u0001\u0014\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "CommissionLoaded", "CommissionLoadingFailure", "Content", "Error", "InvalidForm", "Loading", "LoadingCommission", "OpenCalendarClicked", "OpenDeeplink", "RestoreState", "SubmitForm", "SubmitFormError", "SubmitFormFinished", "UpdateCalendarValue", "UpdateChipValue", "UpdateCommentValue", "UpdateDataValue", "UpdateForm", "UpdateInputValue", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$Close;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$CommissionLoaded;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$CommissionLoadingFailure;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$Content;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$Error;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$InvalidForm;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$Loading;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$LoadingCommission;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$OpenCalendarClicked;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$OpenDeeplink;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$RestoreState;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$SubmitForm;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$SubmitFormError;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$SubmitFormFinished;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$UpdateCalendarValue;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$UpdateChipValue;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$UpdateCommentValue;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$UpdateDataValue;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$UpdateForm;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$UpdateInputValue;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface EndDealInternalAction extends n {

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$Close;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final EndDealResult f122311b;

        public Close(@k EndDealResult endDealResult) {
            this.f122311b = endDealResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Close) && L.f(this.f122311b, ((Close) obj).f122311b);
        }

        public final int hashCode() {
            return this.f122311b.hashCode();
        }

        @k
        public final String toString() {
            return "Close(result=" + this.f122311b + ')';
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$CommissionLoaded;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CommissionLoaded implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C14426a f122312b;

        public CommissionLoaded(@k C14426a c14426a) {
            this.f122312b = c14426a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CommissionLoaded) && L.f(this.f122312b, ((CommissionLoaded) obj).f122312b);
        }

        public final int hashCode() {
            return this.f122312b.hashCode();
        }

        @k
        public final String toString() {
            return "CommissionLoaded(commissionApiResponse=" + this.f122312b + ')';
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$CommissionLoadingFailure;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CommissionLoadingFailure implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f122313b;

        public CommissionLoadingFailure(@k ApiError apiError) {
            this.f122313b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CommissionLoadingFailure) && L.f(this.f122313b, ((CommissionLoadingFailure) obj).f122313b);
        }

        public final int hashCode() {
            return this.f122313b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("CommissionLoadingFailure(apiError="), this.f122313b, ')');
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$Content;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements EndDealInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C14722a f122314b;

        public Content(@k C14722a c14722a) {
            this.f122314b = c14722a;
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
            return (obj instanceof Content) && L.f(this.f122314b, ((Content) obj).f122314b);
        }

        public final int hashCode() {
            return this.f122314b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f122314b + ')';
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$Error;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements EndDealInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f122315b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f122316c;

        public Error(@k ApiError apiError) {
            this.f122315b = apiError;
            this.f122316c = new J.a(apiError);
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
            return (obj instanceof Error) && L.f(this.f122315b, ((Error) obj).f122315b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF331051c() {
            return this.f122316c;
        }

        public final int hashCode() {
            return this.f122315b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(error="), this.f122315b, ')');
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$InvalidForm;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InvalidForm implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InvalidForm f122317b = new InvalidForm();

        private InvalidForm() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof InvalidForm);
        }

        public final int hashCode() {
            return -2044735990;
        }

        @k
        public final String toString() {
            return "InvalidForm";
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$Loading;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements EndDealInternalAction {
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$LoadingCommission;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingCommission implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadingCommission f122318b = new LoadingCommission();

        private LoadingCommission() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LoadingCommission);
        }

        public final int hashCode() {
            return -1866002762;
        }

        @k
        public final String toString() {
            return "LoadingCommission";
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$OpenCalendarClicked;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenCalendarClicked implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final LocalDate f122319b;

        public OpenCalendarClicked(@l LocalDate localDate) {
            this.f122319b = localDate;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenCalendarClicked) && L.f(this.f122319b, ((OpenCalendarClicked) obj).f122319b);
        }

        public final int hashCode() {
            LocalDate localDate = this.f122319b;
            if (localDate == null) {
                return 0;
            }
            return localDate.hashCode();
        }

        @k
        public final String toString() {
            return c.t(new StringBuilder("OpenCalendarClicked(date="), this.f122319b, ')');
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$OpenDeeplink;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f122320b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f122321c;

        public OpenDeeplink(@k DeepLink deepLink, @l Bundle bundle) {
            this.f122320b = deepLink;
            this.f122321c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeeplink)) {
                return false;
            }
            OpenDeeplink openDeeplink = (OpenDeeplink) obj;
            return L.f(this.f122320b, openDeeplink.f122320b) && L.f(this.f122321c, openDeeplink.f122321c);
        }

        public final int hashCode() {
            int iHashCode = this.f122320b.hashCode() * 31;
            Bundle bundle = this.f122321c;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deeplink=");
            sb2.append(this.f122320b);
            sb2.append(", args=");
            return H.m(sb2, this.f122321c, ')');
        }

        public /* synthetic */ OpenDeeplink(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : bundle);
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$RestoreState;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RestoreState implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final EndDealSavedState f122322b;

        public RestoreState(@k EndDealSavedState endDealSavedState) {
            this.f122322b = endDealSavedState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RestoreState) && L.f(this.f122322b, ((RestoreState) obj).f122322b);
        }

        public final int hashCode() {
            return this.f122322b.hashCode();
        }

        @k
        public final String toString() {
            return "RestoreState(savedState=" + this.f122322b + ')';
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$SubmitForm;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitForm implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SubmitForm f122323b = new SubmitForm();

        private SubmitForm() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SubmitForm);
        }

        public final int hashCode() {
            return -311315347;
        }

        @k
        public final String toString() {
            return "SubmitForm";
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$SubmitFormError;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitFormError implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f122324b;

        public SubmitFormError(@k ApiError apiError) {
            this.f122324b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitFormError) && L.f(this.f122324b, ((SubmitFormError) obj).f122324b);
        }

        public final int hashCode() {
            return this.f122324b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("SubmitFormError(apiError="), this.f122324b, ')');
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$SubmitFormFinished;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitFormFinished implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SubmitFormFinished f122325b = new SubmitFormFinished();

        private SubmitFormFinished() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SubmitFormFinished);
        }

        public final int hashCode() {
            return 122952703;
        }

        @k
        public final String toString() {
            return "SubmitFormFinished";
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$UpdateCalendarValue;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateCalendarValue implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LocalDate f122326b;

        public UpdateCalendarValue(@k LocalDate localDate) {
            this.f122326b = localDate;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateCalendarValue)) {
                return false;
            }
            UpdateCalendarValue updateCalendarValue = (UpdateCalendarValue) obj;
            updateCalendarValue.getClass();
            return this.f122326b.equals(updateCalendarValue.f122326b);
        }

        public final int hashCode() {
            return this.f122326b.hashCode() - 1375339258;
        }

        @k
        public final String toString() {
            return c.t(new StringBuilder("UpdateCalendarValue(id=dealDate, date="), this.f122326b, ')');
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$UpdateChipValue;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateChipValue implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f122327b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f122328c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f122329d;

        public UpdateChipValue(@k String str, @k String str2, boolean z12) {
            this.f122327b = str;
            this.f122328c = str2;
            this.f122329d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateChipValue)) {
                return false;
            }
            UpdateChipValue updateChipValue = (UpdateChipValue) obj;
            return L.f(this.f122327b, updateChipValue.f122327b) && L.f(this.f122328c, updateChipValue.f122328c) && this.f122329d == updateChipValue.f122329d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f122329d) + H.d(this.f122327b.hashCode() * 31, 31, this.f122328c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateChipValue(id=");
            sb2.append(this.f122327b);
            sb2.append(", chipId=");
            sb2.append(this.f122328c);
            sb2.append(", isPreviousSelected=");
            return r.x(sb2, this.f122329d, ')');
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$UpdateCommentValue;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateCommentValue implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f122330b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f122331c;

        public UpdateCommentValue(@k String str, @k String str2) {
            this.f122330b = str;
            this.f122331c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateCommentValue)) {
                return false;
            }
            UpdateCommentValue updateCommentValue = (UpdateCommentValue) obj;
            return L.f(this.f122330b, updateCommentValue.f122330b) && L.f(this.f122331c, updateCommentValue.f122331c);
        }

        public final int hashCode() {
            return this.f122331c.hashCode() + (this.f122330b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateCommentValue(id=");
            sb2.append(this.f122330b);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f122331c, ')');
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$UpdateDataValue;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateDataValue implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f122332b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f122333c;

        public UpdateDataValue(@k String str, @k String str2) {
            this.f122332b = str;
            this.f122333c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateDataValue)) {
                return false;
            }
            UpdateDataValue updateDataValue = (UpdateDataValue) obj;
            return L.f(this.f122332b, updateDataValue.f122332b) && L.f(this.f122333c, updateDataValue.f122333c);
        }

        public final int hashCode() {
            return this.f122333c.hashCode() + (this.f122332b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateDataValue(id=");
            sb2.append(this.f122332b);
            sb2.append(", chipId=");
            return C22026a.c(sb2, this.f122333c, ')');
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$UpdateForm;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateForm implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, EndDealField> f122334b;

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateForm(@k Map<String, ? extends EndDealField> map) {
            this.f122334b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateForm) && L.f(this.f122334b, ((UpdateForm) obj).f122334b);
        }

        public final int hashCode() {
            return this.f122334b.hashCode();
        }

        @k
        public final String toString() {
            return r.w(new StringBuilder("UpdateForm(form="), this.f122334b, ')');
        }
    }

    /* compiled from: EndDealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction$UpdateInputValue;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateInputValue implements EndDealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f122335b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f122336c;

        public UpdateInputValue(@k String str, @k String str2) {
            this.f122335b = str;
            this.f122336c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateInputValue)) {
                return false;
            }
            UpdateInputValue updateInputValue = (UpdateInputValue) obj;
            return L.f(this.f122335b, updateInputValue.f122335b) && L.f(this.f122336c, updateInputValue.f122336c);
        }

        public final int hashCode() {
            return this.f122336c.hashCode() + (this.f122335b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateInputValue(id=");
            sb2.append(this.f122335b);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f122336c, ')');
        }
    }
}
