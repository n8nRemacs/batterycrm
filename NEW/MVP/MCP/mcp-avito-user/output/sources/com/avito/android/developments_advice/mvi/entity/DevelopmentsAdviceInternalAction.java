package com.avito.android.developments_advice.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_advice.remote.model.CallInterval;
import com.avito.android.developments_advice.remote.model.ContactInfoResponse;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ConsultationFormData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentsAdviceInternalAction.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BackWithAction", "BackWithToast", "CloseScreen", "InitialFormData", "LoadingComplete", "LoadingError", "NameInputError", "OpenDeeplink", "PhoneInputError", "PhoneNeedVerification", "QuestionInputError", "RequestError", "StartLoading", "StopLoading", "UpdatePhoneField", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$BackWithAction;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$BackWithToast;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$CloseScreen;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$InitialFormData;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$LoadingComplete;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$LoadingError;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$NameInputError;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$OpenDeeplink;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$PhoneInputError;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$PhoneNeedVerification;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$QuestionInputError;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$RequestError;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$StartLoading;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$StopLoading;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$UpdatePhoneField;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DevelopmentsAdviceInternalAction extends n {

    /* compiled from: DevelopmentsAdviceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$BackWithAction;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BackWithAction implements DevelopmentsAdviceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f136144b;

        public BackWithAction(@k DeepLink deepLink) {
            this.f136144b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BackWithAction) && L.f(this.f136144b, ((BackWithAction) obj).f136144b);
        }

        public final int hashCode() {
            return this.f136144b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("BackWithAction(deeplink="), this.f136144b, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$BackWithToast;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BackWithToast implements DevelopmentsAdviceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f136145b;

        public BackWithToast(@l String str) {
            this.f136145b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BackWithToast) && L.f(this.f136145b, ((BackWithToast) obj).f136145b);
        }

        public final int hashCode() {
            String str = this.f136145b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("BackWithToast(message="), this.f136145b, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$CloseScreen;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "()V", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements DevelopmentsAdviceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f136146b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: DevelopmentsAdviceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$InitialFormData;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitialFormData implements DevelopmentsAdviceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ConsultationFormData f136147b;

        public InitialFormData(@k ConsultationFormData consultationFormData) {
            this.f136147b = consultationFormData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialFormData) && L.f(this.f136147b, ((InitialFormData) obj).f136147b);
        }

        public final int hashCode() {
            return this.f136147b.hashCode();
        }

        @k
        public final String toString() {
            return "InitialFormData(formData=" + this.f136147b + ')';
        }
    }

    /* compiled from: DevelopmentsAdviceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$LoadingComplete;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingComplete implements DevelopmentsAdviceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ContactInfoResponse f136148b;

        public LoadingComplete(@k ContactInfoResponse contactInfoResponse) {
            this.f136148b = contactInfoResponse;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingComplete) && L.f(this.f136148b, ((LoadingComplete) obj).f136148b);
        }

        public final int hashCode() {
            return this.f136148b.hashCode();
        }

        @k
        public final String toString() {
            return "LoadingComplete(response=" + this.f136148b + ')';
        }
    }

    /* compiled from: DevelopmentsAdviceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$LoadingError;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements DevelopmentsAdviceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f136149b;

        public LoadingError(@k ApiError apiError) {
            this.f136149b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingError) && L.f(this.f136149b, ((LoadingError) obj).f136149b);
        }

        public final int hashCode() {
            return this.f136149b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingError(error="), this.f136149b, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$NameInputError;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NameInputError implements DevelopmentsAdviceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f136150b;

        public NameInputError(@l String str) {
            this.f136150b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NameInputError) && L.f(this.f136150b, ((NameInputError) obj).f136150b);
        }

        public final int hashCode() {
            String str = this.f136150b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("NameInputError(text="), this.f136150b, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$OpenDeeplink;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements DevelopmentsAdviceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f136151b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f136151b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f136151b, ((OpenDeeplink) obj).f136151b);
        }

        public final int hashCode() {
            return this.f136151b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f136151b, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$PhoneInputError;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneInputError implements DevelopmentsAdviceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f136152b;

        public PhoneInputError(@l String str) {
            this.f136152b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PhoneInputError) && L.f(this.f136152b, ((PhoneInputError) obj).f136152b);
        }

        public final int hashCode() {
            String str = this.f136152b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PhoneInputError(text="), this.f136152b, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$PhoneNeedVerification;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneNeedVerification implements DevelopmentsAdviceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f136153b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f136154c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f136155d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final CallInterval f136156e;

        public PhoneNeedVerification(@l String str, @k String str2, @l String str3, @l CallInterval callInterval) {
            this.f136153b = str;
            this.f136154c = str2;
            this.f136155d = str3;
            this.f136156e = callInterval;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhoneNeedVerification)) {
                return false;
            }
            PhoneNeedVerification phoneNeedVerification = (PhoneNeedVerification) obj;
            return L.f(this.f136153b, phoneNeedVerification.f136153b) && L.f(this.f136154c, phoneNeedVerification.f136154c) && L.f(this.f136155d, phoneNeedVerification.f136155d) && L.f(this.f136156e, phoneNeedVerification.f136156e);
        }

        public final int hashCode() {
            String str = this.f136153b;
            int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f136154c);
            String str2 = this.f136155d;
            int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            CallInterval callInterval = this.f136156e;
            return iHashCode + (callInterval != null ? callInterval.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "PhoneNeedVerification(name=" + this.f136153b + ", phone=" + this.f136154c + ", question=" + this.f136155d + ", callInterval=" + this.f136156e + ')';
        }
    }

    /* compiled from: DevelopmentsAdviceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$QuestionInputError;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class QuestionInputError implements DevelopmentsAdviceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f136157b;

        public QuestionInputError(@l String str) {
            this.f136157b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuestionInputError) && L.f(this.f136157b, ((QuestionInputError) obj).f136157b);
        }

        public final int hashCode() {
            String str = this.f136157b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("QuestionInputError(text="), this.f136157b, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$RequestError;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestError implements DevelopmentsAdviceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f136158b;

        public RequestError(@k String str) {
            this.f136158b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequestError) && L.f(this.f136158b, ((RequestError) obj).f136158b);
        }

        public final int hashCode() {
            return this.f136158b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RequestError(message="), this.f136158b, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$StartLoading;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "()V", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading implements DevelopmentsAdviceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StartLoading f136159b = new StartLoading();

        private StartLoading() {
        }
    }

    /* compiled from: DevelopmentsAdviceInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$StopLoading;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "()V", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StopLoading implements DevelopmentsAdviceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StopLoading f136160b = new StopLoading();

        private StopLoading() {
        }
    }

    /* compiled from: DevelopmentsAdviceInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction$UpdatePhoneField;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePhoneField implements DevelopmentsAdviceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f136161b;

        public UpdatePhoneField(@k String str) {
            this.f136161b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePhoneField) && L.f(this.f136161b, ((UpdatePhoneField) obj).f136161b);
        }

        public final int hashCode() {
            return this.f136161b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdatePhoneField(phone="), this.f136161b, ')');
        }
    }
}
