package com.avito.android.work_profile.profile.applies.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kQ0.InterfaceC42620a;
import kotlin.Metadata;

/* compiled from: AppliesToVacancyInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AppliesDataLoaded", "LoadedListFailedResult", "Loading", "Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction$AppliesDataLoaded;", "Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction$LoadedListFailedResult;", "Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction$Loading;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AppliesToVacancyInternalAction extends n {

    /* compiled from: AppliesToVacancyInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction$AppliesDataLoaded;", "Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AppliesDataLoaded implements AppliesToVacancyInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Object f330890b;

        public AppliesDataLoaded(@k List<? extends InterfaceC42620a> list) {
            this.f330890b = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }
    }

    /* compiled from: AppliesToVacancyInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction$LoadedListFailedResult;", "Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadedListFailedResult implements AppliesToVacancyInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f330891b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f330892c;

        public LoadedListFailedResult(@k ApiError apiError) {
            this.f330891b = apiError;
            this.f330892c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF330799b() {
            return this.f330892c;
        }
    }

    /* compiled from: AppliesToVacancyInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements AppliesToVacancyInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Loader f330893d;

        public Loading(@k Loader loader) {
            this.f330893d = loader;
        }
    }
}
