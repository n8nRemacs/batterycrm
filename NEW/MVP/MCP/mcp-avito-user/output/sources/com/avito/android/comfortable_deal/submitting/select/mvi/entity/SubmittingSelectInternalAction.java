package com.avito.android.comfortable_deal.submitting.select.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import rp.C47701d;
import rp.h;

/* compiled from: SubmittingSelectInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoaded", "NavigateBack", "NavigateNext", "OpenBottomSheetWithDetails", "SelectItem", "Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction$ContentLoaded;", "Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction$NavigateBack;", "Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction$NavigateNext;", "Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction$OpenBottomSheetWithDetails;", "Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction$SelectItem;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface SubmittingSelectInternalAction extends n {

    /* compiled from: SubmittingSelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction$ContentLoaded;", "Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements SubmittingSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final h f123342b;

        public ContentLoaded(@k h hVar) {
            this.f123342b = hVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentLoaded) && L.f(this.f123342b, ((ContentLoaded) obj).f123342b);
        }

        public final int hashCode() {
            return this.f123342b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(submittingSelectBody=" + this.f123342b + ')';
        }
    }

    /* compiled from: SubmittingSelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction$NavigateBack;", "Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements SubmittingSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateBack f123343b = new NavigateBack();

        private NavigateBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return 358826780;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: SubmittingSelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction$NavigateNext;", "Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateNext implements SubmittingSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f123344b;

        public NavigateNext(@l DeepLink deepLink) {
            this.f123344b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateNext) && L.f(this.f123344b, ((NavigateNext) obj).f123344b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f123344b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("NavigateNext(nextDeeplink="), this.f123344b, ')');
        }
    }

    /* compiled from: SubmittingSelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction$OpenBottomSheetWithDetails;", "Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenBottomSheetWithDetails implements SubmittingSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<C47701d> f123345b;

        public OpenBottomSheetWithDetails(@k List<C47701d> list) {
            this.f123345b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenBottomSheetWithDetails) && L.f(this.f123345b, ((OpenBottomSheetWithDetails) obj).f123345b);
        }

        public final int hashCode() {
            return this.f123345b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("OpenBottomSheetWithDetails(items="), this.f123345b, ')');
        }
    }

    /* compiled from: SubmittingSelectInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction$SelectItem;", "Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectItem implements SubmittingSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f123346b;

        public SelectItem(int i12) {
            this.f123346b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectItem) && this.f123346b == ((SelectItem) obj).f123346b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f123346b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("SelectItem(position="), this.f123346b, ')');
        }
    }
}
