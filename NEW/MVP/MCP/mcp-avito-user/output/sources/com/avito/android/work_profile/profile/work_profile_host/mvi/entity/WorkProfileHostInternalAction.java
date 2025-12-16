package com.avito.android.work_profile.profile.work_profile_host.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.work_profile.intent_factory.WorkProfileTab;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: WorkProfileHostInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "LoadedWithError", "LoadedWithSuccess", "Loading", "NewTabSelected", "Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction$LoadedWithError;", "Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction$LoadedWithSuccess;", "Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction$Loading;", "Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction$NewTabSelected;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface WorkProfileHostInternalAction extends n {

    /* compiled from: WorkProfileHostInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction$LoadedWithError;", "Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadedWithError implements WorkProfileHostInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f331277b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f331278c;

        public LoadedWithError(@k ApiError apiError) {
            this.f331277b = apiError;
            this.f331278c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211747d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF277368c() {
            return this.f331278c;
        }
    }

    /* compiled from: WorkProfileHostInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction$LoadedWithSuccess;", "Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadedWithSuccess implements WorkProfileHostInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f331279b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final WorkProfileTab f331280c;

        public LoadedWithSuccess(@k ArrayList arrayList, @k WorkProfileTab workProfileTab) {
            this.f331279b = arrayList;
            this.f331280c = workProfileTab;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211747d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }
    }

    /* compiled from: WorkProfileHostInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction$Loading;", "Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements WorkProfileHostInternalAction {
    }

    /* compiled from: WorkProfileHostInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction$NewTabSelected;", "Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NewTabSelected implements WorkProfileHostInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final WorkProfileTab f331281b;

        public NewTabSelected(@k WorkProfileTab workProfileTab) {
            this.f331281b = workProfileTab;
        }
    }
}
