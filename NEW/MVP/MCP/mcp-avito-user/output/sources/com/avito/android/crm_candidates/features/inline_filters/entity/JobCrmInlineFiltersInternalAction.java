package com.avito.android.crm_candidates.features.inline_filters.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmInlineFiltersInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "OpenFilterInput", "ShowError", "ShowFilters", "ShowLoading", "Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction$OpenFilterInput;", "Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction$ShowError;", "Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction$ShowFilters;", "Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction$ShowLoading;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface JobCrmInlineFiltersInternalAction extends n {

    /* compiled from: JobCrmInlineFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction$OpenFilterInput;", "Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenFilterInput implements JobCrmInlineFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final JobCrmInlineFilterItem f129627b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<JobCrmInlineFilterItem> f129628c;

        public OpenFilterInput(@k JobCrmInlineFilterItem jobCrmInlineFilterItem, @k List<JobCrmInlineFilterItem> list) {
            this.f129627b = jobCrmInlineFilterItem;
            this.f129628c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenFilterInput)) {
                return false;
            }
            OpenFilterInput openFilterInput = (OpenFilterInput) obj;
            return L.f(this.f129627b, openFilterInput.f129627b) && L.f(this.f129628c, openFilterInput.f129628c);
        }

        public final int hashCode() {
            return this.f129628c.hashCode() + (this.f129627b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenFilterInput(item=");
            sb2.append(this.f129627b);
            sb2.append(", filters=");
            return H.p(sb2, this.f129628c, ')');
        }
    }

    /* compiled from: JobCrmInlineFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction$ShowError;", "Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements JobCrmInlineFiltersInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f129629b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f129630c;

        public ShowError(@k ApiError apiError) {
            this.f129629b = apiError;
            this.f129630c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof ShowError) && L.f(this.f129629b, ((ShowError) obj).f129629b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF97886c() {
            return this.f129630c;
        }

        public final int hashCode() {
            return this.f129629b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowError(error="), this.f129629b, ')');
        }
    }

    /* compiled from: JobCrmInlineFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction$ShowFilters;", "Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowFilters implements JobCrmInlineFiltersInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<JobCrmInlineFilterItem> f129631b;

        public ShowFilters(@k List<JobCrmInlineFilterItem> list) {
            this.f129631b = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof ShowFilters) && L.f(this.f129631b, ((ShowFilters) obj).f129631b);
        }

        public final int hashCode() {
            return this.f129631b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ShowFilters(filters="), this.f129631b, ')');
        }
    }

    /* compiled from: JobCrmInlineFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction$ShowLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersInternalAction;", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements JobCrmInlineFiltersInternalAction {
    }
}
