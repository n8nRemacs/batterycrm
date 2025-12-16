package com.avito.android.crm_candidates.features.applications_list.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem;
import com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.JobCrmBannerItem;
import com.avito.android.remote.error.ApiError;
import com.avito.conveyor_item.ParcelableItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmApplicationsListInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseBanner", "LoadType", "ShowContent", "ShowError", "ShowLoading", "ShowOptions", "ShowResults", "UpdateItemContents", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction$CloseBanner;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction$ShowContent;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction$ShowError;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction$ShowLoading;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction$ShowOptions;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction$ShowResults;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction$UpdateItemContents;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface JobCrmApplicationsListInternalAction extends n {

    /* compiled from: JobCrmApplicationsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction$CloseBanner;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseBanner implements JobCrmApplicationsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final JobCrmBannerItem f129479b;

        public CloseBanner(@k JobCrmBannerItem jobCrmBannerItem) {
            this.f129479b = jobCrmBannerItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseBanner) && L.f(this.f129479b, ((CloseBanner) obj).f129479b);
        }

        public final int hashCode() {
            return this.f129479b.hashCode();
        }

        @k
        public final String toString() {
            return "CloseBanner(item=" + this.f129479b + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JobCrmApplicationsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction$LoadType;", "", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadType {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadType f129480b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadType f129481c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadType f129482d;

        /* renamed from: e, reason: collision with root package name */
        public static final LoadType f129483e;

        /* renamed from: f, reason: collision with root package name */
        public static final LoadType f129484f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ LoadType[] f129485g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ a f129486h;

        static {
            LoadType loadType = new LoadType("RELOAD", 0);
            f129480b = loadType;
            LoadType loadType2 = new LoadType("REFRESH", 1);
            f129481c = loadType2;
            LoadType loadType3 = new LoadType("PAGING", 2);
            f129482d = loadType3;
            LoadType loadType4 = new LoadType("ITEM", 3);
            f129483e = loadType4;
            LoadType loadType5 = new LoadType("CHANGE_STATUS", 4);
            f129484f = loadType5;
            LoadType[] loadTypeArr = {loadType, loadType2, loadType3, loadType4, loadType5};
            f129485g = loadTypeArr;
            f129486h = c.a(loadTypeArr);
        }

        public LoadType() {
            throw null;
        }

        public static LoadType valueOf(String str) {
            return (LoadType) Enum.valueOf(LoadType.class, str);
        }

        public static LoadType[] values() {
            return (LoadType[]) f129485g.clone();
        }
    }

    /* compiled from: JobCrmApplicationsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction$ShowContent;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements JobCrmApplicationsListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LoadType f129487b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<ParcelableItem> f129488c;

        /* JADX WARN: Multi-variable type inference failed */
        public ShowContent(@k LoadType loadType, @k List<? extends ParcelableItem> list) {
            this.f129487b = loadType;
            this.f129488c = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF288444d() {
            return this.f129487b.name();
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f129487b.name();
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowContent)) {
                return false;
            }
            ShowContent showContent = (ShowContent) obj;
            return this.f129487b == showContent.f129487b && L.f(this.f129488c, showContent.f129488c);
        }

        public final int hashCode() {
            return this.f129488c.hashCode() + (this.f129487b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowContent(type=");
            sb2.append(this.f129487b);
            sb2.append(", candidates=");
            return H.p(sb2, this.f129488c, ')');
        }
    }

    /* compiled from: JobCrmApplicationsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction$ShowError;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements JobCrmApplicationsListInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LoadType f129489b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiError f129490c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f129491d;

        public ShowError(@k LoadType loadType, @k ApiError apiError) {
            this.f129489b = loadType;
            this.f129490c = apiError;
            this.f129491d = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF288444d() {
            return this.f129489b.name();
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f129489b.name();
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowError)) {
                return false;
            }
            ShowError showError = (ShowError) obj;
            return this.f129489b == showError.f129489b && L.f(this.f129490c, showError.f129490c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF93476c() {
            return this.f129491d;
        }

        public final int hashCode() {
            return this.f129490c.hashCode() + (this.f129489b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(type=");
            sb2.append(this.f129489b);
            sb2.append(", error=");
            return AK.c.n(sb2, this.f129490c, ')');
        }
    }

    /* compiled from: JobCrmApplicationsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction$ShowLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoading extends TrackableLoadingStarted implements JobCrmApplicationsListInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final LoadType f129492d;

        public ShowLoading(@k LoadType loadType) {
            this.f129492d = loadType;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF288444d() {
            return this.f129492d.name();
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowLoading) && this.f129492d == ((ShowLoading) obj).f129492d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f129492d.hashCode();
        }

        @k
        public final String toString() {
            return "ShowLoading(type=" + this.f129492d + ')';
        }
    }

    /* compiled from: JobCrmApplicationsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction$ShowOptions;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowOptions implements JobCrmApplicationsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final JobCrmApplicationItem f129493b;

        public ShowOptions(@k JobCrmApplicationItem jobCrmApplicationItem) {
            this.f129493b = jobCrmApplicationItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowOptions) && L.f(this.f129493b, ((ShowOptions) obj).f129493b);
        }

        public final int hashCode() {
            return this.f129493b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowOptions(item=" + this.f129493b + ')';
        }
    }

    /* compiled from: JobCrmApplicationsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction$ShowResults;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowResults implements JobCrmApplicationsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final JobCrmApplicationItem f129494b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f129495c;

        public ShowResults(@k JobCrmApplicationItem jobCrmApplicationItem, boolean z12) {
            this.f129494b = jobCrmApplicationItem;
            this.f129495c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowResults)) {
                return false;
            }
            ShowResults showResults = (ShowResults) obj;
            return L.f(this.f129494b, showResults.f129494b) && this.f129495c == showResults.f129495c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f129495c) + (this.f129494b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowResults(item=");
            sb2.append(this.f129494b);
            sb2.append(", isChatbot=");
            return r.x(sb2, this.f129495c, ')');
        }
    }

    /* compiled from: JobCrmApplicationsListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction$UpdateItemContents;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateItemContents implements JobCrmApplicationsListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final JobCrmApplicationItem f129496b;

        public UpdateItemContents(@k JobCrmApplicationItem jobCrmApplicationItem) {
            this.f129496b = jobCrmApplicationItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateItemContents) && L.f(this.f129496b, ((UpdateItemContents) obj).f129496b);
        }

        public final int hashCode() {
            return this.f129496b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateItemContents(item=" + this.f129496b + ')';
        }
    }
}
