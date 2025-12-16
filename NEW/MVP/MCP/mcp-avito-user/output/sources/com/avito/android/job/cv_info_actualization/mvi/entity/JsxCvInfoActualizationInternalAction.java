package com.avito.android.job.cv_info_actualization.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.job.cv_info_actualization.mvi.domain.a;
import kotlin.Metadata;

/* compiled from: JsxCvInfoActualizationInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "FormSentFailure", "FormSentSuccess", "InitialInfoLoadedFailure", "InitialInfoLoadedSuccess", "LoadingInitialInfo", "OnCheckboxClick", "OnChipsClick", "OnRadioButtonClick", "OnToolbarNavigationClick", "SendingForm", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$FormSentFailure;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$FormSentSuccess;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$InitialInfoLoadedFailure;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$InitialInfoLoadedSuccess;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$LoadingInitialInfo;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$OnCheckboxClick;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$OnChipsClick;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$OnRadioButtonClick;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$OnToolbarNavigationClick;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$SendingForm;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface JsxCvInfoActualizationInternalAction extends n {

    /* compiled from: JsxCvInfoActualizationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$FormSentFailure;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FormSentFailure implements JsxCvInfoActualizationInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f174161b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f174162c;

        public FormSentFailure(@k J.a aVar, @k String str) {
            this.f174161b = aVar;
            this.f174162c = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314462e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF314423d() {
            return this.f174161b;
        }
    }

    /* compiled from: JsxCvInfoActualizationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$FormSentSuccess;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "()V", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FormSentSuccess implements JsxCvInfoActualizationInternalAction, TrackableContent {
        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314462e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }
    }

    /* compiled from: JsxCvInfoActualizationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$InitialInfoLoadedFailure;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InitialInfoLoadedFailure implements JsxCvInfoActualizationInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f174163b;

        public InitialInfoLoadedFailure(@k J.a aVar) {
            this.f174163b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314462e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF314423d() {
            return this.f174163b;
        }
    }

    /* compiled from: JsxCvInfoActualizationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$InitialInfoLoadedSuccess;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InitialInfoLoadedSuccess implements JsxCvInfoActualizationInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f174164b;

        public InitialInfoLoadedSuccess(@k a aVar) {
            this.f174164b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314462e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }
    }

    /* compiled from: JsxCvInfoActualizationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$LoadingInitialInfo;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "()V", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingInitialInfo extends TrackableLoadingStarted implements JsxCvInfoActualizationInternalAction {
    }

    /* compiled from: JsxCvInfoActualizationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$OnCheckboxClick;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnCheckboxClick implements JsxCvInfoActualizationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f174165b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f174166c;

        public OnCheckboxClick(@k String str, @k String str2) {
            this.f174165b = str;
            this.f174166c = str2;
        }
    }

    /* compiled from: JsxCvInfoActualizationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$OnChipsClick;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnChipsClick implements JsxCvInfoActualizationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f174167b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f174168c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f174169d;

        public OnChipsClick(@k String str, @k String str2, boolean z12) {
            this.f174167b = str;
            this.f174168c = str2;
            this.f174169d = z12;
        }
    }

    /* compiled from: JsxCvInfoActualizationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$OnRadioButtonClick;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnRadioButtonClick implements JsxCvInfoActualizationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f174170b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f174171c;

        public OnRadioButtonClick(@k String str, @k String str2) {
            this.f174170b = str;
            this.f174171c = str2;
        }
    }

    /* compiled from: JsxCvInfoActualizationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$OnToolbarNavigationClick;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "()V", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnToolbarNavigationClick implements JsxCvInfoActualizationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnToolbarNavigationClick f174172b = new OnToolbarNavigationClick();

        private OnToolbarNavigationClick() {
        }
    }

    /* compiled from: JsxCvInfoActualizationInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction$SendingForm;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "()V", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SendingForm extends TrackableLoadingStarted implements JsxCvInfoActualizationInternalAction {
    }
}
