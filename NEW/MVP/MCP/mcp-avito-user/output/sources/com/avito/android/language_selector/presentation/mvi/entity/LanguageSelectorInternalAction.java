package com.avito.android.language_selector.presentation.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.core.os.q;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.language_selector.presentation.Language;
import com.avito.android.util.ApiException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LanguageSelectorInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BackButtonClickHappened", "Init", "SaveNewLanguage", "SelectLanguage", "ShowSelectLanguageConfirmationDialog", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$BackButtonClickHappened;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$Init;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$SaveNewLanguage;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$SelectLanguage;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$ShowSelectLanguageConfirmationDialog;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface LanguageSelectorInternalAction extends n {

    /* compiled from: LanguageSelectorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$BackButtonClickHappened;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction;", "<init>", "()V", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BackButtonClickHappened implements LanguageSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final BackButtonClickHappened f174979b = new BackButtonClickHappened();

        private BackButtonClickHappened() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof BackButtonClickHappened);
        }

        public final int hashCode() {
            return 1975841416;
        }

        @k
        public final String toString() {
            return "BackButtonClickHappened";
        }
    }

    /* compiled from: LanguageSelectorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$Init;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements LanguageSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final q f174980b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Locale f174981c;

        public Init(@k q qVar, @k Locale locale) {
            this.f174980b = qVar;
            this.f174981c = locale;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Init)) {
                return false;
            }
            Init init = (Init) obj;
            return L.f(this.f174980b, init.f174980b) && L.f(this.f174981c, init.f174981c);
        }

        public final int hashCode() {
            return this.f174981c.hashCode() + (this.f174980b.f44805a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Init(locales=" + this.f174980b + ", currentLocal=" + this.f174981c + ')';
        }
    }

    /* compiled from: LanguageSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$SaveNewLanguage;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction;", "Failed", "Started", "Success", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$SaveNewLanguage$Failed;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$SaveNewLanguage$Started;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$SaveNewLanguage$Success;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SaveNewLanguage extends LanguageSelectorInternalAction {

        /* compiled from: LanguageSelectorInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$SaveNewLanguage$Failed;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$SaveNewLanguage;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Failed implements SaveNewLanguage, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiException f174982b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final J.a f174983c;

            public Failed(@k ApiException apiException) {
                this.f174982b = apiException;
                this.f174983c = new J.a(apiException);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF303161d() {
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
                return (obj instanceof Failed) && this.f174982b.equals(((Failed) obj).f174982b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF303157e() {
                return this.f174983c;
            }

            public final int hashCode() {
                return this.f174982b.hashCode();
            }

            @k
            public final String toString() {
                return c.q(new StringBuilder("Failed(error="), this.f174982b, ')');
            }
        }

        /* compiled from: LanguageSelectorInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$SaveNewLanguage$Started;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$SaveNewLanguage;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Started extends TrackableLoadingStarted implements SaveNewLanguage {
        }

        /* compiled from: LanguageSelectorInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$SaveNewLanguage$Success;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$SaveNewLanguage;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Success implements SaveNewLanguage, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Language f174984b;

            public Success(@k Language language) {
                this.f174984b = language;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF303161d() {
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
                return (obj instanceof Success) && this.f174984b == ((Success) obj).f174984b;
            }

            public final int hashCode() {
                return this.f174984b.hashCode();
            }

            @k
            public final String toString() {
                return "Success(newLanguage=" + this.f174984b + ')';
            }
        }
    }

    /* compiled from: LanguageSelectorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$SelectLanguage;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectLanguage implements LanguageSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Language f174985b;

        public SelectLanguage(@k Language language) {
            this.f174985b = language;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectLanguage) && this.f174985b == ((SelectLanguage) obj).f174985b;
        }

        public final int hashCode() {
            return this.f174985b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectLanguage(selectedLanguage=" + this.f174985b + ')';
        }
    }

    /* compiled from: LanguageSelectorInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction$ShowSelectLanguageConfirmationDialog;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSelectLanguageConfirmationDialog implements LanguageSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f174986b;

        public ShowSelectLanguageConfirmationDialog(boolean z12) {
            this.f174986b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowSelectLanguageConfirmationDialog) && this.f174986b == ((ShowSelectLanguageConfirmationDialog) obj).f174986b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f174986b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShowSelectLanguageConfirmationDialog(show="), this.f174986b, ')');
        }
    }
}
