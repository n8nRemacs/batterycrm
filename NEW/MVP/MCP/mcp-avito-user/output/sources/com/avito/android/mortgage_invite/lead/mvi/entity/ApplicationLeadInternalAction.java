package com.avito.android.mortgage_invite.lead.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationLeadInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "CloseWithDismissed", "OpenDeeplink", "SelectLead", "Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction$Close;", "Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction$CloseWithDismissed;", "Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction$OpenDeeplink;", "Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction$SelectLead;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ApplicationLeadInternalAction extends n {

    /* compiled from: ApplicationLeadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction$Close;", "Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements ApplicationLeadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f205906b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1591526961;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ApplicationLeadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction$CloseWithDismissed;", "Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseWithDismissed implements ApplicationLeadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseWithDismissed f205907b = new CloseWithDismissed();

        private CloseWithDismissed() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseWithDismissed);
        }

        public final int hashCode() {
            return -657001518;
        }

        @k
        public final String toString() {
            return "CloseWithDismissed";
        }
    }

    /* compiled from: ApplicationLeadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction$OpenDeeplink;", "Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements ApplicationLeadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f205908b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f205908b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f205908b, ((OpenDeeplink) obj).f205908b);
        }

        public final int hashCode() {
            return this.f205908b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f205908b, ')');
        }
    }

    /* compiled from: ApplicationLeadInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction$SelectLead;", "Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectLead implements ApplicationLeadInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LeadType f205909b;

        public SelectLead(@k LeadType leadType) {
            this.f205909b = leadType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectLead) && this.f205909b == ((SelectLead) obj).f205909b;
        }

        public final int hashCode() {
            return this.f205909b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectLead(leadType=" + this.f205909b + ')';
        }
    }
}
