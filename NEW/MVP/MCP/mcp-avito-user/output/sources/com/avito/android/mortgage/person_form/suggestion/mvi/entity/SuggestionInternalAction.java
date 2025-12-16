package com.avito.android.mortgage.person_form.suggestion.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.TrackablePreloadedContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestionInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BackClicked", "Error", "FillByHandsClicked", "Init", "Loading", "SuggestApplied", "SuggestionsLoaded", "ValueChanged", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$BackClicked;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$Error;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$FillByHandsClicked;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$Init;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$Loading;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$SuggestApplied;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$SuggestionsLoaded;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$ValueChanged;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SuggestionInternalAction extends n {

    /* compiled from: SuggestionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$BackClicked;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BackClicked implements SuggestionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201464b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f201465c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final SuggestionContainer<? extends Suggestion> f201466d;

        public BackClicked(@k String str, @k String str2, @l SuggestionContainer<? extends Suggestion> suggestionContainer) {
            this.f201464b = str;
            this.f201465c = str2;
            this.f201466d = suggestionContainer;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BackClicked)) {
                return false;
            }
            BackClicked backClicked = (BackClicked) obj;
            return L.f(this.f201464b, backClicked.f201464b) && L.f(this.f201465c, backClicked.f201465c) && L.f(this.f201466d, backClicked.f201466d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f201464b.hashCode() * 31, 31, this.f201465c);
            SuggestionContainer<? extends Suggestion> suggestionContainer = this.f201466d;
            return iD2 + (suggestionContainer == null ? 0 : suggestionContainer.hashCode());
        }

        @k
        public final String toString() {
            return "BackClicked(fieldId=" + this.f201464b + ", fieldValue=" + this.f201465c + ", lastSuggestion=" + this.f201466d + ')';
        }
    }

    /* compiled from: SuggestionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$Error;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements SuggestionInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f201467b;

        public Error(@k ApiError apiError) {
            this.f201467b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            return (obj instanceof Error) && L.f(this.f201467b, ((Error) obj).f201467b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF183997c() {
            return new J.a(this.f201467b);
        }

        public final int hashCode() {
            return this.f201467b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(error="), this.f201467b, ')');
        }
    }

    /* compiled from: SuggestionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$FillByHandsClicked;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FillByHandsClicked implements SuggestionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201468b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final SuggestionContainer<? extends Suggestion> f201469c;

        public FillByHandsClicked(@k String str, @l SuggestionContainer<? extends Suggestion> suggestionContainer) {
            this.f201468b = str;
            this.f201469c = suggestionContainer;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FillByHandsClicked)) {
                return false;
            }
            FillByHandsClicked fillByHandsClicked = (FillByHandsClicked) obj;
            return L.f(this.f201468b, fillByHandsClicked.f201468b) && L.f(this.f201469c, fillByHandsClicked.f201469c);
        }

        public final int hashCode() {
            int iHashCode = this.f201468b.hashCode() * 31;
            SuggestionContainer<? extends Suggestion> suggestionContainer = this.f201469c;
            return iHashCode + (suggestionContainer == null ? 0 : suggestionContainer.hashCode());
        }

        @k
        public final String toString() {
            return "FillByHandsClicked(fieldId=" + this.f201468b + ", lastAppliedSuggestion=" + this.f201469c + ')';
        }
    }

    /* compiled from: SuggestionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$Init;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackablePreloadedContent;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements SuggestionInternalAction, TrackablePreloadedContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Init f201470b = new Init();

        private Init() {
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Init);
        }

        public final int hashCode() {
            return -599213331;
        }

        @k
        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: SuggestionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$Loading;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements SuggestionInternalAction {
    }

    /* compiled from: SuggestionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$SuggestApplied;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuggestApplied implements SuggestionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SuggestionContainer<? extends Suggestion> f201471b;

        public SuggestApplied(@k SuggestionContainer<? extends Suggestion> suggestionContainer) {
            this.f201471b = suggestionContainer;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestApplied) && L.f(this.f201471b, ((SuggestApplied) obj).f201471b);
        }

        public final int hashCode() {
            return this.f201471b.hashCode();
        }

        @k
        public final String toString() {
            return "SuggestApplied(suggestion=" + this.f201471b + ')';
        }
    }

    /* compiled from: SuggestionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$SuggestionsLoaded;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuggestionsLoaded implements SuggestionInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f201472b;

        public SuggestionsLoaded(@k ArrayList arrayList) {
            this.f201472b = arrayList;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            return (obj instanceof SuggestionsLoaded) && this.f201472b.equals(((SuggestionsLoaded) obj).f201472b);
        }

        public final int hashCode() {
            return this.f201472b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("SuggestionsLoaded(suggestions="), this.f201472b, ')');
        }
    }

    /* compiled from: SuggestionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction$ValueChanged;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ValueChanged implements SuggestionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201473b;

        public ValueChanged(@k String str) {
            this.f201473b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ValueChanged) && L.f(this.f201473b, ((ValueChanged) obj).f201473b);
        }

        public final int hashCode() {
            return this.f201473b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ValueChanged(value="), this.f201473b, ')');
        }
    }
}
