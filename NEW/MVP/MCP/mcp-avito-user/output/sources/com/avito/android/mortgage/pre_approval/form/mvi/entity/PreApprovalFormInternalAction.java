package com.avito.android.mortgage.pre_approval.form.mvi.entity;

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
import com.avito.android.mortgage.api.model.DictionariesResult;
import com.avito.android.mortgage.pre_approval.form.list.items.chips.c;
import com.avito.android.mortgage.pre_approval.form.list.items.select.SelectItem;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import com.avito.android.remote.error.ApiError;
import com.avito.android.select.Arguments;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: PreApprovalFormInternalAction.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ApplyBusinessRules", "CloseFlow", "InitLoadingCompleted", "InitLoadingFailed", "InitLoadingStarted", "NextScreen", "NextStep", "OpenAuthorization", "PreviousStep", "SelectOptionsClick", "UpdateChipsValue", "UpdateInputByPredefined", "UpdateInputBySlider", "UpdateInputValue", "UpdateSelectValue", "UpdateValidationResult", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$ApplyBusinessRules;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$CloseFlow;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$InitLoadingCompleted;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$InitLoadingFailed;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$InitLoadingStarted;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$NextScreen;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$NextStep;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$OpenAuthorization;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$PreviousStep;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$SelectOptionsClick;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$UpdateChipsValue;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$UpdateInputByPredefined;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$UpdateInputBySlider;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$UpdateInputValue;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$UpdateSelectValue;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$UpdateValidationResult;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PreApprovalFormInternalAction extends n {

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$ApplyBusinessRules;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplyBusinessRules implements PreApprovalFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201915b;

        public ApplyBusinessRules(@k String str) {
            this.f201915b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplyBusinessRules) && L.f(this.f201915b, ((ApplyBusinessRules) obj).f201915b);
        }

        public final int hashCode() {
            return this.f201915b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ApplyBusinessRules(stringId="), this.f201915b, ')');
        }
    }

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$CloseFlow;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseFlow implements PreApprovalFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseFlow f201916b = new CloseFlow();

        private CloseFlow() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseFlow);
        }

        public final int hashCode() {
            return 677409626;
        }

        @k
        public final String toString() {
            return "CloseFlow";
        }
    }

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$InitLoadingCompleted;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitLoadingCompleted implements PreApprovalFormInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PreApprovalArguments f201917b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DictionariesResult f201918c;

        public InitLoadingCompleted(@k PreApprovalArguments preApprovalArguments, @k DictionariesResult dictionariesResult) {
            this.f201917b = preApprovalArguments;
            this.f201918c = dictionariesResult;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
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
            if (!(obj instanceof InitLoadingCompleted)) {
                return false;
            }
            InitLoadingCompleted initLoadingCompleted = (InitLoadingCompleted) obj;
            return L.f(this.f201917b, initLoadingCompleted.f201917b) && L.f(this.f201918c, initLoadingCompleted.f201918c);
        }

        public final int hashCode() {
            return this.f201918c.hashCode() + (this.f201917b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "InitLoadingCompleted(arguments=" + this.f201917b + ", dictionaries=" + this.f201918c + ')';
        }
    }

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$InitLoadingFailed;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitLoadingFailed implements PreApprovalFormInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f201919b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f201920c;

        public InitLoadingFailed(@k ApiError apiError) {
            this.f201919b = apiError;
            this.f201920c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
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
            return (obj instanceof InitLoadingFailed) && L.f(this.f201919b, ((InitLoadingFailed) obj).f201919b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF247372d() {
            return this.f201920c;
        }

        public final int hashCode() {
            return this.f201919b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("InitLoadingFailed(error="), this.f201919b, ')');
        }
    }

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$InitLoadingStarted;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InitLoadingStarted extends TrackableLoadingStarted implements PreApprovalFormInternalAction {
    }

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$NextScreen;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NextScreen implements PreApprovalFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PreApprovalArguments f201921b;

        public NextScreen(@k PreApprovalArguments preApprovalArguments) {
            this.f201921b = preApprovalArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NextScreen) && L.f(this.f201921b, ((NextScreen) obj).f201921b);
        }

        public final int hashCode() {
            return this.f201921b.hashCode();
        }

        @k
        public final String toString() {
            return "NextScreen(arguments=" + this.f201921b + ')';
        }
    }

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$NextStep;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NextStep implements PreApprovalFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NextStep f201922b = new NextStep();

        private NextStep() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NextStep);
        }

        public final int hashCode() {
            return 1877452235;
        }

        @k
        public final String toString() {
            return "NextStep";
        }
    }

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$OpenAuthorization;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAuthorization implements PreApprovalFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenAuthorization f201923b = new OpenAuthorization();

        private OpenAuthorization() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenAuthorization);
        }

        public final int hashCode() {
            return 155482723;
        }

        @k
        public final String toString() {
            return "OpenAuthorization";
        }
    }

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$PreviousStep;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PreviousStep implements PreApprovalFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PreviousStep f201924b = new PreviousStep();

        private PreviousStep() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof PreviousStep);
        }

        public final int hashCode() {
            return -347497009;
        }

        @k
        public final String toString() {
            return "PreviousStep";
        }
    }

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$SelectOptionsClick;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectOptionsClick implements PreApprovalFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Arguments f201925b;

        public SelectOptionsClick(@k Arguments arguments) {
            this.f201925b = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectOptionsClick) && L.f(this.f201925b, ((SelectOptionsClick) obj).f201925b);
        }

        public final int hashCode() {
            return this.f201925b.hashCode();
        }

        @k
        public final String toString() {
            return c.p(new StringBuilder("SelectOptionsClick(args="), this.f201925b, ')');
        }
    }

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$UpdateChipsValue;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateChipsValue implements PreApprovalFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201926b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final c.a f201927c;

        public UpdateChipsValue(@k String str, @k c.a aVar) {
            this.f201926b = str;
            this.f201927c = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateChipsValue)) {
                return false;
            }
            UpdateChipsValue updateChipsValue = (UpdateChipsValue) obj;
            return L.f(this.f201926b, updateChipsValue.f201926b) && L.f(this.f201927c, updateChipsValue.f201927c);
        }

        public final int hashCode() {
            return this.f201927c.hashCode() + (this.f201926b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "UpdateChipsValue(stringId=" + this.f201926b + ", value=" + this.f201927c + ')';
        }
    }

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$UpdateInputByPredefined;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateInputByPredefined implements PreApprovalFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201928b;

        /* renamed from: c, reason: collision with root package name */
        public final int f201929c;

        public UpdateInputByPredefined(@k String str, int i12) {
            this.f201928b = str;
            this.f201929c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateInputByPredefined)) {
                return false;
            }
            UpdateInputByPredefined updateInputByPredefined = (UpdateInputByPredefined) obj;
            return L.f(this.f201928b, updateInputByPredefined.f201928b) && this.f201929c == updateInputByPredefined.f201929c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f201929c) + (this.f201928b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateInputByPredefined(stringId=");
            sb2.append(this.f201928b);
            sb2.append(", value=");
            return r.t(sb2, this.f201929c, ')');
        }
    }

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$UpdateInputBySlider;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateInputBySlider implements PreApprovalFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201930b;

        /* renamed from: c, reason: collision with root package name */
        public final float f201931c;

        public UpdateInputBySlider(@k String str, float f12) {
            this.f201930b = str;
            this.f201931c = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateInputBySlider)) {
                return false;
            }
            UpdateInputBySlider updateInputBySlider = (UpdateInputBySlider) obj;
            return L.f(this.f201930b, updateInputBySlider.f201930b) && Float.compare(this.f201931c, updateInputBySlider.f201931c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f201931c) + (this.f201930b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateInputBySlider(stringId=");
            sb2.append(this.f201930b);
            sb2.append(", value=");
            return r.k(')', this.f201931c, sb2);
        }
    }

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$UpdateInputValue;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateInputValue implements PreApprovalFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201932b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f201933c;

        public UpdateInputValue(@k String str, @k String str2) {
            this.f201932b = str;
            this.f201933c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateInputValue)) {
                return false;
            }
            UpdateInputValue updateInputValue = (UpdateInputValue) obj;
            return L.f(this.f201932b, updateInputValue.f201932b) && L.f(this.f201933c, updateInputValue.f201933c);
        }

        public final int hashCode() {
            return this.f201933c.hashCode() + (this.f201932b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateInputValue(stringId=");
            sb2.append(this.f201932b);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f201933c, ')');
        }
    }

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$UpdateSelectValue;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSelectValue implements PreApprovalFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201934b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SelectItem.Option f201935c;

        public UpdateSelectValue(@k String str, @k SelectItem.Option option) {
            this.f201934b = str;
            this.f201935c = option;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateSelectValue)) {
                return false;
            }
            UpdateSelectValue updateSelectValue = (UpdateSelectValue) obj;
            return L.f(this.f201934b, updateSelectValue.f201934b) && L.f(this.f201935c, updateSelectValue.f201935c);
        }

        public final int hashCode() {
            return this.f201935c.hashCode() + (this.f201934b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "UpdateSelectValue(stringId=" + this.f201934b + ", value=" + this.f201935c + ')';
        }
    }

    /* compiled from: PreApprovalFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction$UpdateValidationResult;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateValidationResult implements PreApprovalFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LinkedHashMap f201936b;

        public UpdateValidationResult(@k LinkedHashMap linkedHashMap) {
            this.f201936b = linkedHashMap;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateValidationResult) && this.f201936b.equals(((UpdateValidationResult) obj).f201936b);
        }

        public final int hashCode() {
            return this.f201936b.hashCode();
        }

        @k
        public final String toString() {
            return h.e(new StringBuilder("UpdateValidationResult(validationResult="), this.f201936b, ')');
        }
    }
}
