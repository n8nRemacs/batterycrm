package com.avito.android.cv_actualization.view.phone_select.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.model.user_profile.Phone;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvActualizationPhoneSelectInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoaded", "ErrorLoadedContent", "PhoneUpdateFailure", "PhoneUpdatedSuccess", "ShowInitialLoading", "ShowPhoneInput", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction$ContentLoaded;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction$ErrorLoadedContent;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction$PhoneUpdateFailure;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction$PhoneUpdatedSuccess;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction$ShowInitialLoading;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction$ShowPhoneInput;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface JsxCvActualizationPhoneSelectInternalAction extends n {

    /* compiled from: JsxCvActualizationPhoneSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction$ContentLoaded;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements JsxCvActualizationPhoneSelectInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Phone> f131361b;

        public ContentLoaded(@k List<Phone> list) {
            this.f131361b = list;
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

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentLoaded) && L.f(this.f131361b, ((ContentLoaded) obj).f131361b);
        }

        public final int hashCode() {
            return this.f131361b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ContentLoaded(phones="), this.f131361b, ')');
        }
    }

    /* compiled from: JsxCvActualizationPhoneSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction$ErrorLoadedContent;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ErrorLoadedContent implements JsxCvActualizationPhoneSelectInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f131362b;

        public ErrorLoadedContent(@k J.a aVar) {
            this.f131362b = aVar;
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
        public final J.a getF330892c() {
            return this.f131362b;
        }
    }

    /* compiled from: JsxCvActualizationPhoneSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction$PhoneUpdateFailure;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction;", "()V", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PhoneUpdateFailure implements JsxCvActualizationPhoneSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PhoneUpdateFailure f131363b = new PhoneUpdateFailure();

        private PhoneUpdateFailure() {
        }
    }

    /* compiled from: JsxCvActualizationPhoneSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction$PhoneUpdatedSuccess;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PhoneUpdatedSuccess implements JsxCvActualizationPhoneSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f131364b;

        public PhoneUpdatedSuccess(@k String str) {
            this.f131364b = str;
        }
    }

    /* compiled from: JsxCvActualizationPhoneSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction$ShowInitialLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction;", "()V", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowInitialLoading extends TrackableLoadingStarted implements JsxCvActualizationPhoneSelectInternalAction {
    }

    /* compiled from: JsxCvActualizationPhoneSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction$ShowPhoneInput;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowPhoneInput implements JsxCvActualizationPhoneSelectInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f131365b;

        public ShowPhoneInput(boolean z12) {
            this.f131365b = z12;
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
}
