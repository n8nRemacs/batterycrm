package com.avito.android.comfortable_deal.submitting.success.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import rp.i;

/* compiled from: SubmittingSuccessInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/success/mvi/entity/SubmittingSuccessInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoaded", "OpenDeepLink", "Lcom/avito/android/comfortable_deal/submitting/success/mvi/entity/SubmittingSuccessInternalAction$ContentLoaded;", "Lcom/avito/android/comfortable_deal/submitting/success/mvi/entity/SubmittingSuccessInternalAction$OpenDeepLink;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface SubmittingSuccessInternalAction extends n {

    /* compiled from: SubmittingSuccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/success/mvi/entity/SubmittingSuccessInternalAction$ContentLoaded;", "Lcom/avito/android/comfortable_deal/submitting/success/mvi/entity/SubmittingSuccessInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements SubmittingSuccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final i f123421b;

        public ContentLoaded(@k i iVar) {
            this.f123421b = iVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentLoaded) && L.f(this.f123421b, ((ContentLoaded) obj).f123421b);
        }

        public final int hashCode() {
            return this.f123421b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(content=" + this.f123421b + ')';
        }
    }

    /* compiled from: SubmittingSuccessInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/success/mvi/entity/SubmittingSuccessInternalAction$OpenDeepLink;", "Lcom/avito/android/comfortable_deal/submitting/success/mvi/entity/SubmittingSuccessInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements SubmittingSuccessInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f123422b;

        public OpenDeepLink(@k DeepLink deepLink) {
            this.f123422b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f123422b, ((OpenDeepLink) obj).f123422b);
        }

        public final int hashCode() {
            return this.f123422b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f123422b, ')');
        }
    }
}
