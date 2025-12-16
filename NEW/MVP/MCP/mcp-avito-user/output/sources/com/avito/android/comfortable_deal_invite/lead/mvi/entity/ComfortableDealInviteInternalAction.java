package com.avito.android.comfortable_deal_invite.lead.mvi.entity;

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
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealInviteInternalAction.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0018\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u0082\u0001\u0018\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01¨\u00062"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "CommentValueChanged", "CommissionInputIsEmpty", "CommissionInputValueChanged", "ContractSignedChecked", "ContractSignedIsEmpty", "HasMinorOwnersChecked", "HasMinorOwnersIsEmpty", "HasRestrictionsChecked", "HasRestrictionsIsEmpty", "IsCallConfirmedChecked", "IsCallConfirmedEmpty", "IsTermsConfirmedChecked", "IsTermsConfirmedEmpty", "LeadCreated", "LinkInputErrorValueChange", "LinkInputValueChange", "OnFailure", "OnLinkInputFailure", "OpenDeeplink", "ResponsibleAgentIsEmpty", "ResponsibleAgentValueChanged", "SaveClientData", "StartLoading", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$Close;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$CommentValueChanged;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$CommissionInputIsEmpty;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$CommissionInputValueChanged;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$ContractSignedChecked;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$ContractSignedIsEmpty;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$HasMinorOwnersChecked;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$HasMinorOwnersIsEmpty;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$HasRestrictionsChecked;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$HasRestrictionsIsEmpty;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$IsCallConfirmedChecked;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$IsCallConfirmedEmpty;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$IsTermsConfirmedChecked;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$IsTermsConfirmedEmpty;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$LeadCreated;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$LinkInputErrorValueChange;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$LinkInputValueChange;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$OnFailure;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$OnLinkInputFailure;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$OpenDeeplink;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$ResponsibleAgentIsEmpty;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$ResponsibleAgentValueChanged;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$SaveClientData;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$StartLoading;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ComfortableDealInviteInternalAction extends n {

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$Close;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "<init>", "()V", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements ComfortableDealInviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f123686b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -443167977;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$CommentValueChanged;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CommentValueChanged implements ComfortableDealInviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f123687b;

        public CommentValueChanged(@k String str) {
            this.f123687b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CommentValueChanged) && L.f(this.f123687b, ((CommentValueChanged) obj).f123687b);
        }

        public final int hashCode() {
            return this.f123687b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CommentValueChanged(value="), this.f123687b, ')');
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$CommissionInputIsEmpty;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CommissionInputIsEmpty implements ComfortableDealInviteInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommissionInputIsEmpty)) {
                return false;
            }
            ((CommissionInputIsEmpty) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        @k
        public final String toString() {
            return "CommissionInputIsEmpty(value=true)";
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$CommissionInputValueChanged;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CommissionInputValueChanged implements ComfortableDealInviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f123688b;

        public CommissionInputValueChanged(@k String str) {
            this.f123688b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CommissionInputValueChanged) && L.f(this.f123688b, ((CommissionInputValueChanged) obj).f123688b);
        }

        public final int hashCode() {
            return this.f123688b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CommissionInputValueChanged(value="), this.f123688b, ')');
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$ContractSignedChecked;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContractSignedChecked implements ComfortableDealInviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f123689b;

        public ContractSignedChecked(boolean z12) {
            this.f123689b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContractSignedChecked) && this.f123689b == ((ContractSignedChecked) obj).f123689b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f123689b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ContractSignedChecked(value="), this.f123689b, ')');
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$ContractSignedIsEmpty;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContractSignedIsEmpty implements ComfortableDealInviteInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContractSignedIsEmpty)) {
                return false;
            }
            ((ContractSignedIsEmpty) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        @k
        public final String toString() {
            return "ContractSignedIsEmpty(value=true)";
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$HasMinorOwnersChecked;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HasMinorOwnersChecked implements ComfortableDealInviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f123690b;

        public HasMinorOwnersChecked(boolean z12) {
            this.f123690b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HasMinorOwnersChecked) && this.f123690b == ((HasMinorOwnersChecked) obj).f123690b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f123690b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("HasMinorOwnersChecked(value="), this.f123690b, ')');
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$HasMinorOwnersIsEmpty;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HasMinorOwnersIsEmpty implements ComfortableDealInviteInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HasMinorOwnersIsEmpty)) {
                return false;
            }
            ((HasMinorOwnersIsEmpty) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        @k
        public final String toString() {
            return "HasMinorOwnersIsEmpty(value=true)";
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$HasRestrictionsChecked;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HasRestrictionsChecked implements ComfortableDealInviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f123691b;

        public HasRestrictionsChecked(boolean z12) {
            this.f123691b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HasRestrictionsChecked) && this.f123691b == ((HasRestrictionsChecked) obj).f123691b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f123691b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("HasRestrictionsChecked(value="), this.f123691b, ')');
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$HasRestrictionsIsEmpty;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HasRestrictionsIsEmpty implements ComfortableDealInviteInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HasRestrictionsIsEmpty)) {
                return false;
            }
            ((HasRestrictionsIsEmpty) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        @k
        public final String toString() {
            return "HasRestrictionsIsEmpty(value=true)";
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$IsCallConfirmedChecked;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IsCallConfirmedChecked implements ComfortableDealInviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f123692b;

        public IsCallConfirmedChecked(boolean z12) {
            this.f123692b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IsCallConfirmedChecked) && this.f123692b == ((IsCallConfirmedChecked) obj).f123692b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f123692b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("IsCallConfirmedChecked(value="), this.f123692b, ')');
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$IsCallConfirmedEmpty;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IsCallConfirmedEmpty implements ComfortableDealInviteInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IsCallConfirmedEmpty)) {
                return false;
            }
            ((IsCallConfirmedEmpty) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        @k
        public final String toString() {
            return "IsCallConfirmedEmpty(value=true)";
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$IsTermsConfirmedChecked;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IsTermsConfirmedChecked implements ComfortableDealInviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f123693b;

        public IsTermsConfirmedChecked(boolean z12) {
            this.f123693b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IsTermsConfirmedChecked) && this.f123693b == ((IsTermsConfirmedChecked) obj).f123693b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f123693b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("IsTermsConfirmedChecked(value="), this.f123693b, ')');
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$IsTermsConfirmedEmpty;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IsTermsConfirmedEmpty implements ComfortableDealInviteInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IsTermsConfirmedEmpty)) {
                return false;
            }
            ((IsTermsConfirmedEmpty) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        @k
        public final String toString() {
            return "IsTermsConfirmedEmpty(value=true)";
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$LeadCreated;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LeadCreated implements ComfortableDealInviteInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LeadCreated f123694b = new LeadCreated();

        private LeadCreated() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LeadCreated);
        }

        public final int hashCode() {
            return 290132427;
        }

        @k
        public final String toString() {
            return "LeadCreated";
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$LinkInputErrorValueChange;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LinkInputErrorValueChange implements ComfortableDealInviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f123695b;

        public LinkInputErrorValueChange(@k PrintableText printableText) {
            this.f123695b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinkInputErrorValueChange) && L.f(this.f123695b, ((LinkInputErrorValueChange) obj).f123695b);
        }

        public final int hashCode() {
            return this.f123695b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("LinkInputErrorValueChange(value="), this.f123695b, ')');
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$LinkInputValueChange;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LinkInputValueChange implements ComfortableDealInviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f123696b;

        public LinkInputValueChange(@k String str) {
            this.f123696b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinkInputValueChange) && L.f(this.f123696b, ((LinkInputValueChange) obj).f123696b);
        }

        public final int hashCode() {
            return this.f123696b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LinkInputValueChange(value="), this.f123696b, ')');
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$OnFailure;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnFailure implements ComfortableDealInviteInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Exception f123697b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f123698c;

        public OnFailure(@k Exception exc) {
            this.f123697b = exc;
            this.f123698c = new J.a(exc);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
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
            return (obj instanceof OnFailure) && this.f123697b.equals(((OnFailure) obj).f123697b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF326865c() {
            return this.f123698c;
        }

        public final int hashCode() {
            return this.f123697b.hashCode();
        }

        @k
        public final String toString() {
            return "OnFailure(throwable=" + this.f123697b + ')';
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$OnLinkInputFailure;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnLinkInputFailure implements ComfortableDealInviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f123699b;

        public OnLinkInputFailure(@k String str) {
            this.f123699b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnLinkInputFailure) && L.f(this.f123699b, ((OnLinkInputFailure) obj).f123699b);
        }

        public final int hashCode() {
            return this.f123699b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnLinkInputFailure(errorMessage="), this.f123699b, ')');
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$OpenDeeplink;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements ComfortableDealInviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f123700b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f123701c;

        public OpenDeeplink(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            str = (i12 & 2) != 0 ? null : str;
            this.f123700b = deepLink;
            this.f123701c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeeplink)) {
                return false;
            }
            OpenDeeplink openDeeplink = (OpenDeeplink) obj;
            return L.f(this.f123700b, openDeeplink.f123700b) && L.f(this.f123701c, openDeeplink.f123701c);
        }

        public final int hashCode() {
            int iHashCode = this.f123700b.hashCode() * 31;
            String str = this.f123701c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deeplink=");
            sb2.append(this.f123700b);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f123701c, ')');
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$ResponsibleAgentIsEmpty;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResponsibleAgentIsEmpty implements ComfortableDealInviteInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResponsibleAgentIsEmpty)) {
                return false;
            }
            ((ResponsibleAgentIsEmpty) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        @k
        public final String toString() {
            return "ResponsibleAgentIsEmpty(value=true)";
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$ResponsibleAgentValueChanged;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResponsibleAgentValueChanged implements ComfortableDealInviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f123702b;

        public ResponsibleAgentValueChanged(@k String str) {
            this.f123702b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResponsibleAgentValueChanged) && L.f(this.f123702b, ((ResponsibleAgentValueChanged) obj).f123702b);
        }

        public final int hashCode() {
            return this.f123702b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ResponsibleAgentValueChanged(value="), this.f123702b, ')');
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$SaveClientData;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveClientData implements ComfortableDealInviteInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f123703b;

        public SaveClientData(@k String str) {
            this.f123703b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveClientData) && L.f(this.f123703b, ((SaveClientData) obj).f123703b);
        }

        public final int hashCode() {
            return this.f123703b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SaveClientData(clientId="), this.f123703b, ')');
        }
    }

    /* compiled from: ComfortableDealInviteInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction$StartLoading;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading extends TrackableLoadingStarted implements ComfortableDealInviteInternalAction {
    }
}
