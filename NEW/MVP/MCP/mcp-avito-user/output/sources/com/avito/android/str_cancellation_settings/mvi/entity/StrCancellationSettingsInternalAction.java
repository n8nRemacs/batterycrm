package com.avito.android.str_cancellation_settings.mvi.entity;

import AK.c;
import Ry0.h;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.str_cancellation_settings.analytics.FromPageLabel;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrCancellationSettingsInternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ApplyRequestLoadingError", "ApplyRequestStartLoading", "ApplyRequestSuccess", "ChangeDiscountEnabledValue", "ChangeDiscountInputValue", "ChangeFreeCancellationEnabledValue", "ChangeFreeCancellationOptionId", "ChangeKeyboardVisibleValue", "CloseScreen", "ContentLoaded", "Init", "LoadingError", "ShowDiscountInputError", "StartLoading", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ApplyRequestLoadingError;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ApplyRequestStartLoading;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ApplyRequestSuccess;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ChangeDiscountEnabledValue;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ChangeDiscountInputValue;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ChangeFreeCancellationEnabledValue;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ChangeFreeCancellationOptionId;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ChangeKeyboardVisibleValue;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$CloseScreen;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ContentLoaded;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$Init;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$LoadingError;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ShowDiscountInputError;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$StartLoading;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrCancellationSettingsInternalAction extends n {

    /* compiled from: StrCancellationSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ApplyRequestLoadingError;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplyRequestLoadingError implements StrCancellationSettingsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f288441b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f288442c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f288443d = "applyRequest";

        public ApplyRequestLoadingError(@k ApiError apiError) {
            this.f288441b = apiError;
            this.f288442c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF315372f() {
            return this.f288443d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f288443d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplyRequestLoadingError) && L.f(this.f288441b, ((ApplyRequestLoadingError) obj).f288441b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF258123c() {
            return this.f288442c;
        }

        public final int hashCode() {
            return this.f288441b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ApplyRequestLoadingError(apiError="), this.f288441b, ')');
        }
    }

    /* compiled from: StrCancellationSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ApplyRequestStartLoading;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ApplyRequestStartLoading extends TrackableLoadingStarted implements StrCancellationSettingsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f288444d = "applyRequest";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF315372f() {
            return this.f288444d;
        }
    }

    /* compiled from: StrCancellationSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ApplyRequestSuccess;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplyRequestSuccess implements StrCancellationSettingsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f288445b;

        public ApplyRequestSuccess(@k String str) {
            this.f288445b = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF315372f() {
            return "applyRequest";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "applyRequest";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplyRequestSuccess) && L.f(this.f288445b, ((ApplyRequestSuccess) obj).f288445b);
        }

        public final int hashCode() {
            return this.f288445b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ApplyRequestSuccess(newSettingSubtitle="), this.f288445b, ')');
        }
    }

    /* compiled from: StrCancellationSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ChangeDiscountEnabledValue;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeDiscountEnabledValue implements StrCancellationSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f288446b;

        public ChangeDiscountEnabledValue(boolean z12) {
            this.f288446b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeDiscountEnabledValue) && this.f288446b == ((ChangeDiscountEnabledValue) obj).f288446b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f288446b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ChangeDiscountEnabledValue(isEnabled="), this.f288446b, ')');
        }
    }

    /* compiled from: StrCancellationSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ChangeDiscountInputValue;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeDiscountInputValue implements StrCancellationSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f288447b;

        public ChangeDiscountInputValue(@k String str) {
            this.f288447b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeDiscountInputValue) && L.f(this.f288447b, ((ChangeDiscountInputValue) obj).f288447b);
        }

        public final int hashCode() {
            return this.f288447b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangeDiscountInputValue(newValue="), this.f288447b, ')');
        }
    }

    /* compiled from: StrCancellationSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ChangeFreeCancellationEnabledValue;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeFreeCancellationEnabledValue implements StrCancellationSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f288448b;

        public ChangeFreeCancellationEnabledValue(boolean z12) {
            this.f288448b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeFreeCancellationEnabledValue) && this.f288448b == ((ChangeFreeCancellationEnabledValue) obj).f288448b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f288448b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ChangeFreeCancellationEnabledValue(isEnabled="), this.f288448b, ')');
        }
    }

    /* compiled from: StrCancellationSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ChangeFreeCancellationOptionId;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeFreeCancellationOptionId implements StrCancellationSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f288449b;

        public ChangeFreeCancellationOptionId(int i12) {
            this.f288449b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeFreeCancellationOptionId) && this.f288449b == ((ChangeFreeCancellationOptionId) obj).f288449b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f288449b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ChangeFreeCancellationOptionId(newId="), this.f288449b, ')');
        }
    }

    /* compiled from: StrCancellationSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ChangeKeyboardVisibleValue;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeKeyboardVisibleValue implements StrCancellationSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f288450b;

        public ChangeKeyboardVisibleValue(boolean z12) {
            this.f288450b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeKeyboardVisibleValue) && this.f288450b == ((ChangeKeyboardVisibleValue) obj).f288450b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f288450b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ChangeKeyboardVisibleValue(isVisible="), this.f288450b, ')');
        }
    }

    /* compiled from: StrCancellationSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$CloseScreen;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements StrCancellationSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f288451b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -1049357493;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: StrCancellationSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ContentLoaded;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements StrCancellationSettingsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final h f288452b;

        public ContentLoaded(@k h hVar) {
            this.f288452b = hVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentLoaded) && L.f(this.f288452b, ((ContentLoaded) obj).f288452b);
        }

        public final int hashCode() {
            return this.f288452b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(response=" + this.f288452b + ')';
        }
    }

    /* compiled from: StrCancellationSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$Init;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements StrCancellationSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f288453b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Date f288454c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Date f288455d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final FromPageLabel f288456e;

        public Init(long j12, @l Date date, @l Date date2, @l FromPageLabel fromPageLabel) {
            this.f288453b = j12;
            this.f288454c = date;
            this.f288455d = date2;
            this.f288456e = fromPageLabel;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Init)) {
                return false;
            }
            Init init = (Init) obj;
            return this.f288453b == init.f288453b && L.f(this.f288454c, init.f288454c) && L.f(this.f288455d, init.f288455d) && this.f288456e == init.f288456e;
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f288453b) * 31;
            Date date = this.f288454c;
            int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
            Date date2 = this.f288455d;
            int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
            FromPageLabel fromPageLabel = this.f288456e;
            return iHashCode3 + (fromPageLabel != null ? fromPageLabel.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Init(itemId=" + this.f288453b + ", startDate=" + this.f288454c + ", endDate=" + this.f288455d + ", fromPageLabel=" + this.f288456e + ')';
        }
    }

    /* compiled from: StrCancellationSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$LoadingError;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements StrCancellationSettingsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f288457b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f288458c;

        public LoadingError(@k ApiError apiError) {
            this.f288457b = apiError;
            this.f288458c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF315372f() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingError) && L.f(this.f288457b, ((LoadingError) obj).f288457b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF258123c() {
            return this.f288458c;
        }

        public final int hashCode() {
            return this.f288457b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingError(apiError="), this.f288457b, ')');
        }
    }

    /* compiled from: StrCancellationSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$ShowDiscountInputError;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDiscountInputError implements StrCancellationSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f288459b;

        public ShowDiscountInputError(@l String str) {
            this.f288459b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowDiscountInputError) && L.f(this.f288459b, ((ShowDiscountInputError) obj).f288459b);
        }

        public final int hashCode() {
            String str = this.f288459b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowDiscountInputError(message="), this.f288459b, ')');
        }
    }

    /* compiled from: StrCancellationSettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction$StartLoading;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading extends TrackableLoadingStarted implements StrCancellationSettingsInternalAction {
    }
}
