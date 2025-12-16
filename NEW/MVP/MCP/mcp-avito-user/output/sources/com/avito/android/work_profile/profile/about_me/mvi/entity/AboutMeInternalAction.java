package com.avito.android.work_profile.profile.about_me.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.remote.error.ApiError;
import kotlin.AbstractC40048c;
import kotlin.Metadata;

/* compiled from: AboutMeInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoaded", "Error", "HandleBeduinEvent", "HandleBeduinState", "StartLoading", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction$ContentLoaded;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction$Error;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction$HandleBeduinEvent;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction$HandleBeduinState;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction$StartLoading;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AboutMeInternalAction extends n {

    /* compiled from: AboutMeInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction$ContentLoaded;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentLoaded implements AboutMeInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f330798b;

        public ContentLoaded(@k String str) {
            this.f330798b = str;
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

    /* compiled from: AboutMeInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction$Error;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error implements AboutMeInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f330799b;

        public Error(@k ApiError apiError) {
            this.f330799b = new J.a(apiError);
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
        public final J.a getF255339c() {
            return this.f330799b;
        }
    }

    /* compiled from: AboutMeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction$HandleBeduinEvent;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HandleBeduinEvent implements AboutMeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent f330800b;

        public HandleBeduinEvent(@k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f330800b = beduinOneTimeEvent;
        }
    }

    /* compiled from: AboutMeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction$HandleBeduinState;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HandleBeduinState implements AboutMeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractC40048c f330801b;

        public HandleBeduinState(@k AbstractC40048c abstractC40048c) {
            this.f330801b = abstractC40048c;
        }
    }

    /* compiled from: AboutMeInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction$StartLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction;", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading extends TrackableLoadingStarted implements AboutMeInternalAction {
    }
}
