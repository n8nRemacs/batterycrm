package com.avito.android.cv_actualization.view.phone_input.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: JsxCvActualizationPhoneInputInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "OnToolbarNavigationClick", "OpenCodeScreen", "ShowBusinessError", "ShowErrorToast", "ShowInputValidationError", "ShowLoading", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction$OnToolbarNavigationClick;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction$OpenCodeScreen;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction$ShowBusinessError;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction$ShowErrorToast;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction$ShowInputValidationError;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction$ShowLoading;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface JsxCvActualizationPhoneInputInternalAction extends n {

    /* compiled from: JsxCvActualizationPhoneInputInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction$OnToolbarNavigationClick;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction;", "()V", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnToolbarNavigationClick implements JsxCvActualizationPhoneInputInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnToolbarNavigationClick f131293b = new OnToolbarNavigationClick();

        private OnToolbarNavigationClick() {
        }
    }

    /* compiled from: JsxCvActualizationPhoneInputInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction$OpenCodeScreen;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenCodeScreen implements JsxCvActualizationPhoneInputInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        public final long f131294b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f131295c;

        public OpenCodeScreen(long j12, @k String str) {
            this.f131294b = j12;
            this.f131295c = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }
    }

    /* compiled from: JsxCvActualizationPhoneInputInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction$ShowBusinessError;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowBusinessError implements JsxCvActualizationPhoneInputInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f131296b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f131297c;

        public ShowBusinessError(@k J.a aVar, @k PrintableText printableText) {
            this.f131296b = aVar;
            this.f131297c = printableText;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
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
        public final J.a getF114737c() {
            return this.f131296b;
        }
    }

    /* compiled from: JsxCvActualizationPhoneInputInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction$ShowErrorToast;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowErrorToast implements JsxCvActualizationPhoneInputInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f131298b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f131299c;

        public ShowErrorToast(@k J.a aVar, @k String str) {
            this.f131298b = aVar;
            this.f131299c = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
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
        public final J.a getF114737c() {
            return this.f131298b;
        }
    }

    /* compiled from: JsxCvActualizationPhoneInputInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction$ShowInputValidationError;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowInputValidationError implements JsxCvActualizationPhoneInputInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f131300b;

        public ShowInputValidationError(@k PrintableText printableText) {
            this.f131300b = printableText;
        }
    }

    /* compiled from: JsxCvActualizationPhoneInputInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction$ShowLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction;", "()V", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements JsxCvActualizationPhoneInputInternalAction {
    }
}
