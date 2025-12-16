package com.avito.android.mortgage.consultation.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageConsultationInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "FullNameUpdated", "PhoneUpdated", "SlotAssignLoadingCompleted", "SlotAssignLoadingFailed", "SlotAssignLoadingStarted", "SlotsLoadingCompleted", "SlotsLoadingFailed", "SlotsLoadingStarted", "UpdateDaySlot", "UpdateTimeSlot", "ValidationUpdate", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$FullNameUpdated;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$PhoneUpdated;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$SlotAssignLoadingCompleted;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$SlotAssignLoadingFailed;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$SlotAssignLoadingStarted;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$SlotsLoadingCompleted;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$SlotsLoadingFailed;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$SlotsLoadingStarted;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$UpdateDaySlot;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$UpdateTimeSlot;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$ValidationUpdate;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MortgageConsultationInternalAction extends n {

    /* compiled from: MortgageConsultationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$FullNameUpdated;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FullNameUpdated implements MortgageConsultationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f198615b;

        public FullNameUpdated(@k String str) {
            this.f198615b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FullNameUpdated) && L.f(this.f198615b, ((FullNameUpdated) obj).f198615b);
        }

        public final int hashCode() {
            return this.f198615b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("FullNameUpdated(fullName="), this.f198615b, ')');
        }
    }

    /* compiled from: MortgageConsultationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$PhoneUpdated;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneUpdated implements MortgageConsultationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f198616b;

        public PhoneUpdated(@k String str) {
            this.f198616b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PhoneUpdated) && L.f(this.f198616b, ((PhoneUpdated) obj).f198616b);
        }

        public final int hashCode() {
            return this.f198616b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PhoneUpdated(phone="), this.f198616b, ')');
        }
    }

    /* compiled from: MortgageConsultationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$SlotAssignLoadingCompleted;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SlotAssignLoadingCompleted implements MortgageConsultationInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f198617b;

        public SlotAssignLoadingCompleted(boolean z12) {
            this.f198617b = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF107656d() {
            return "SLOTS_ASSIGN_LOADING_CONTENT_TYPE";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "SLOTS_ASSIGN_LOADING_CONTENT_TYPE";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SlotAssignLoadingCompleted) && this.f198617b == ((SlotAssignLoadingCompleted) obj).f198617b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f198617b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SlotAssignLoadingCompleted(success="), this.f198617b, ')');
        }
    }

    /* compiled from: MortgageConsultationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$SlotAssignLoadingFailed;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SlotAssignLoadingFailed implements MortgageConsultationInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f198618b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f198619c;

        public SlotAssignLoadingFailed(@k ApiError apiError) {
            this.f198618b = apiError;
            this.f198619c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF107656d() {
            return "SLOTS_ASSIGN_LOADING_CONTENT_TYPE";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "SLOTS_ASSIGN_LOADING_CONTENT_TYPE";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SlotAssignLoadingFailed) && L.f(this.f198618b, ((SlotAssignLoadingFailed) obj).f198618b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF108003d() {
            return this.f198619c;
        }

        public final int hashCode() {
            return this.f198618b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("SlotAssignLoadingFailed(apiError="), this.f198618b, ')');
        }
    }

    /* compiled from: MortgageConsultationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$SlotAssignLoadingStarted;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SlotAssignLoadingStarted extends TrackableLoadingStarted implements MortgageConsultationInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f198620d = "SLOTS_ASSIGN_LOADING_CONTENT_TYPE";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF107656d() {
            return this.f198620d;
        }
    }

    /* compiled from: MortgageConsultationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$SlotsLoadingCompleted;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SlotsLoadingCompleted implements MortgageConsultationInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final WZ.c f198621b;

        public SlotsLoadingCompleted(@k WZ.c cVar) {
            this.f198621b = cVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF107656d() {
            return "SLOTS_LOADING_CONTENT_TYPE";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "SLOTS_LOADING_CONTENT_TYPE";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SlotsLoadingCompleted) && L.f(this.f198621b, ((SlotsLoadingCompleted) obj).f198621b);
        }

        public final int hashCode() {
            return this.f198621b.hashCode();
        }

        @k
        public final String toString() {
            return "SlotsLoadingCompleted(form=" + this.f198621b + ')';
        }
    }

    /* compiled from: MortgageConsultationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$SlotsLoadingFailed;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SlotsLoadingFailed implements MortgageConsultationInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f198622b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f198623c;

        public SlotsLoadingFailed(@k ApiError apiError) {
            this.f198622b = apiError;
            this.f198623c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF107656d() {
            return "SLOTS_LOADING_CONTENT_TYPE";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "SLOTS_LOADING_CONTENT_TYPE";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SlotsLoadingFailed) && L.f(this.f198622b, ((SlotsLoadingFailed) obj).f198622b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF108003d() {
            return this.f198623c;
        }

        public final int hashCode() {
            return this.f198622b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("SlotsLoadingFailed(apiError="), this.f198622b, ')');
        }
    }

    /* compiled from: MortgageConsultationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$SlotsLoadingStarted;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SlotsLoadingStarted extends TrackableLoadingStarted implements MortgageConsultationInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f198624d = "SLOTS_LOADING_CONTENT_TYPE";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF107656d() {
            return this.f198624d;
        }
    }

    /* compiled from: MortgageConsultationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$UpdateDaySlot;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateDaySlot implements MortgageConsultationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f198625b;

        public UpdateDaySlot(@k String str) {
            this.f198625b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateDaySlot) && L.f(this.f198625b, ((UpdateDaySlot) obj).f198625b);
        }

        public final int hashCode() {
            return this.f198625b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateDaySlot(slot="), this.f198625b, ')');
        }
    }

    /* compiled from: MortgageConsultationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$UpdateTimeSlot;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateTimeSlot implements MortgageConsultationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f198626b;

        public UpdateTimeSlot(@k String str) {
            this.f198626b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateTimeSlot) && L.f(this.f198626b, ((UpdateTimeSlot) obj).f198626b);
        }

        public final int hashCode() {
            return this.f198626b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateTimeSlot(slot="), this.f198626b, ')');
        }
    }

    /* compiled from: MortgageConsultationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction$ValidationUpdate;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ValidationUpdate implements MortgageConsultationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f198627b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f198628c;

        public ValidationUpdate(boolean z12, boolean z13) {
            this.f198627b = z12;
            this.f198628c = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidationUpdate)) {
                return false;
            }
            ValidationUpdate validationUpdate = (ValidationUpdate) obj;
            return this.f198627b == validationUpdate.f198627b && this.f198628c == validationUpdate.f198628c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f198628c) + (Boolean.hashCode(this.f198627b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ValidationUpdate(isPhoneInvalid=");
            sb2.append(this.f198627b);
            sb2.append(", isFullNameInvalid=");
            return r.x(sb2, this.f198628c, ')');
        }
    }
}
