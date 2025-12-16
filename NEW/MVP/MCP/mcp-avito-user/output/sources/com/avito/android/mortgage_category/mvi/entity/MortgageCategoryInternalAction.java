package com.avito.android.mortgage_category.mvi.entity;

import AK.c;
import O10.b;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageCategoryInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "HandleDeeplink", "MortgageCategoryLoadingCompleted", "MortgageCategoryLoadingFailed", "MortgageCategoryLoadingStarted", "SetArchivedLoadingCompleted", "SetArchivedLoadingFailed", "SetArchivedLoadingStarted", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction$HandleDeeplink;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction$MortgageCategoryLoadingCompleted;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction$MortgageCategoryLoadingFailed;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction$MortgageCategoryLoadingStarted;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction$SetArchivedLoadingCompleted;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction$SetArchivedLoadingFailed;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction$SetArchivedLoadingStarted;", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MortgageCategoryInternalAction extends n {

    /* compiled from: MortgageCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction$HandleDeeplink;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction;", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements MortgageCategoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f204947b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f204947b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f204947b, ((HandleDeeplink) obj).f204947b);
        }

        public final int hashCode() {
            return this.f204947b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f204947b, ')');
        }
    }

    /* compiled from: MortgageCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction$MortgageCategoryLoadingCompleted;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction;", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MortgageCategoryLoadingCompleted implements TrackableContent, MortgageCategoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b f204948b;

        public MortgageCategoryLoadingCompleted(@k b bVar) {
            this.f204948b = bVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF316246d() {
            return "MortgageCategory";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "MortgageCategory";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MortgageCategoryLoadingCompleted) && L.f(this.f204948b, ((MortgageCategoryLoadingCompleted) obj).f204948b);
        }

        public final int hashCode() {
            return this.f204948b.hashCode();
        }

        @k
        public final String toString() {
            return "MortgageCategoryLoadingCompleted(content=" + this.f204948b + ')';
        }
    }

    /* compiled from: MortgageCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction$MortgageCategoryLoadingFailed;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction;", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MortgageCategoryLoadingFailed implements TrackableError, MortgageCategoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f204949b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f204950c;

        public MortgageCategoryLoadingFailed(@k ApiError apiError) {
            this.f204949b = apiError;
            this.f204950c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF316246d() {
            return "MortgageCategory";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "MortgageCategory";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MortgageCategoryLoadingFailed) && L.f(this.f204949b, ((MortgageCategoryLoadingFailed) obj).f204949b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF203476c() {
            return this.f204950c;
        }

        public final int hashCode() {
            return this.f204949b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("MortgageCategoryLoadingFailed(error="), this.f204949b, ')');
        }
    }

    /* compiled from: MortgageCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction$MortgageCategoryLoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction;", "<init>", "()V", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MortgageCategoryLoadingStarted extends TrackableLoadingStarted implements MortgageCategoryInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f204951d = "MortgageCategory";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF316246d() {
            return this.f204951d;
        }
    }

    /* compiled from: MortgageCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction$SetArchivedLoadingCompleted;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction;", "<init>", "()V", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetArchivedLoadingCompleted implements TrackableContent, MortgageCategoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SetArchivedLoadingCompleted f204952b = new SetArchivedLoadingCompleted();

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f204953c = "SetArchived";

        private SetArchivedLoadingCompleted() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF316246d() {
            return f204953c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return f204953c;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SetArchivedLoadingCompleted);
        }

        public final int hashCode() {
            return 1096359127;
        }

        @k
        public final String toString() {
            return "SetArchivedLoadingCompleted";
        }
    }

    /* compiled from: MortgageCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction$SetArchivedLoadingFailed;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction;", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetArchivedLoadingFailed implements TrackableError, MortgageCategoryInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f204954b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f204955c;

        public SetArchivedLoadingFailed(@k ApiError apiError) {
            this.f204954b = apiError;
            this.f204955c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF316246d() {
            return "SetArchived";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "SetArchived";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetArchivedLoadingFailed) && L.f(this.f204954b, ((SetArchivedLoadingFailed) obj).f204954b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF203476c() {
            return this.f204955c;
        }

        public final int hashCode() {
            return this.f204954b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("SetArchivedLoadingFailed(error="), this.f204954b, ')');
        }
    }

    /* compiled from: MortgageCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction$SetArchivedLoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction;", "<init>", "()V", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SetArchivedLoadingStarted extends TrackableLoadingStarted implements MortgageCategoryInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f204956d = "SetArchived";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF316246d() {
            return this.f204956d;
        }
    }
}
