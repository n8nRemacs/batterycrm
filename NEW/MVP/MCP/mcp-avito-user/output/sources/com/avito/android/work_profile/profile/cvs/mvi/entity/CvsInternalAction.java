package com.avito.android.work_profile.profile.cvs.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.work_profile.domain.entity.CvsAction;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CvsInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/work_profile/profile/cvs/mvi/entity/CvsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "LoadedWithError", "LoadedWithSuccess", "Loading", "Lcom/avito/android/work_profile/profile/cvs/mvi/entity/CvsInternalAction$LoadedWithError;", "Lcom/avito/android/work_profile/profile/cvs/mvi/entity/CvsInternalAction$LoadedWithSuccess;", "Lcom/avito/android/work_profile/profile/cvs/mvi/entity/CvsInternalAction$Loading;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CvsInternalAction extends n {

    /* compiled from: CvsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/cvs/mvi/entity/CvsInternalAction$LoadedWithError;", "Lcom/avito/android/work_profile/profile/cvs/mvi/entity/CvsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadedWithError implements CvsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f331050b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f331051c;

        public LoadedWithError(@k ApiError apiError) {
            this.f331050b = apiError;
            this.f331051c = new J.a(apiError);
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

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF325098c() {
            return this.f331051c;
        }
    }

    /* compiled from: CvsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/cvs/mvi/entity/CvsInternalAction$LoadedWithSuccess;", "Lcom/avito/android/work_profile/profile/cvs/mvi/entity/CvsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadedWithSuccess implements CvsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f331052b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final CvsAction f331053c;

        public LoadedWithSuccess(@k ArrayList arrayList, @k CvsAction cvsAction) {
            this.f331052b = arrayList;
            this.f331053c = cvsAction;
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
    }

    /* compiled from: CvsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/cvs/mvi/entity/CvsInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/work_profile/profile/cvs/mvi/entity/CvsInternalAction;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements CvsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f331054d;

        public Loading() {
            this(false, 1, null);
        }

        public /* synthetic */ Loading(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? true : z12);
        }

        public Loading(boolean z12) {
            this.f331054d = z12;
        }
    }
}
