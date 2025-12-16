package com.avito.android.saved_searches.presentation.settings.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.TrackablePreloadedContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.android.saved_searches.presentation.settings.SavedSearchSettingsMode;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchSettingsInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeDayOfWeek", "ChangePeriodicity", "ChangeTimeOfDay", "HandleBackButtonClick", "HandleSelectedSettings", "RenderInitialData", "ShowDayOfWeekErrorMessage", "ShowTimeOfDayErrorMessage", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$ChangeDayOfWeek;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$ChangePeriodicity;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$ChangeTimeOfDay;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$HandleBackButtonClick;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$HandleSelectedSettings;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$RenderInitialData;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$ShowDayOfWeekErrorMessage;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$ShowTimeOfDayErrorMessage;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SavedSearchSettingsInternalAction extends n {

    /* compiled from: SavedSearchSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$ChangeDayOfWeek;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeDayOfWeek implements SavedSearchSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f258761b;

        public ChangeDayOfWeek(@k ArrayList arrayList) {
            this.f258761b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeDayOfWeek) && this.f258761b.equals(((ChangeDayOfWeek) obj).f258761b);
        }

        public final int hashCode() {
            return this.f258761b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ChangeDayOfWeek(selectedDayOfWeekIds="), this.f258761b, ')');
        }
    }

    /* compiled from: SavedSearchSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$ChangePeriodicity;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackablePreloadedContent;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangePeriodicity implements SavedSearchSettingsInternalAction, TrackablePreloadedContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f258762b;

        public ChangePeriodicity(@k ArrayList arrayList) {
            this.f258762b = arrayList;
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
            return (obj instanceof ChangePeriodicity) && this.f258762b.equals(((ChangePeriodicity) obj).f258762b);
        }

        public final int hashCode() {
            return this.f258762b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ChangePeriodicity(selectedPeriodicityIds="), this.f258762b, ')');
        }
    }

    /* compiled from: SavedSearchSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$ChangeTimeOfDay;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeTimeOfDay implements SavedSearchSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f258763b;

        public ChangeTimeOfDay(@k ArrayList arrayList) {
            this.f258763b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeTimeOfDay) && this.f258763b.equals(((ChangeTimeOfDay) obj).f258763b);
        }

        public final int hashCode() {
            return this.f258763b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ChangeTimeOfDay(selectedTimeOfDayIds="), this.f258763b, ')');
        }
    }

    /* compiled from: SavedSearchSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$HandleBackButtonClick;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction;", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HandleBackButtonClick implements SavedSearchSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HandleBackButtonClick f258764b = new HandleBackButtonClick();

        private HandleBackButtonClick() {
        }
    }

    /* compiled from: SavedSearchSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$HandleSelectedSettings;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleSelectedSettings implements SavedSearchSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SavedSearchSettingsMode f258765b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SavedSearchData.Settings.SettingsDetails f258766c;

        public HandleSelectedSettings(@k SavedSearchData.Settings.SettingsDetails settingsDetails, @k SavedSearchSettingsMode savedSearchSettingsMode) {
            this.f258765b = savedSearchSettingsMode;
            this.f258766c = settingsDetails;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleSelectedSettings)) {
                return false;
            }
            HandleSelectedSettings handleSelectedSettings = (HandleSelectedSettings) obj;
            return this.f258765b == handleSelectedSettings.f258765b && L.f(this.f258766c, handleSelectedSettings.f258766c);
        }

        public final int hashCode() {
            return this.f258766c.hashCode() + (this.f258765b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "HandleSelectedSettings(mode=" + this.f258765b + ", settingsDetails=" + this.f258766c + ')';
        }
    }

    /* compiled from: SavedSearchSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$RenderInitialData;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackablePreloadedContent;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RenderInitialData implements SavedSearchSettingsInternalAction, TrackablePreloadedContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SavedSearchData.Settings.SettingsDetails f258767b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SavedSearchSettingsMode f258768c;

        public RenderInitialData(@k SavedSearchData.Settings.SettingsDetails settingsDetails, @k SavedSearchSettingsMode savedSearchSettingsMode) {
            this.f258767b = settingsDetails;
            this.f258768c = savedSearchSettingsMode;
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
            if (!(obj instanceof RenderInitialData)) {
                return false;
            }
            RenderInitialData renderInitialData = (RenderInitialData) obj;
            return L.f(this.f258767b, renderInitialData.f258767b) && this.f258768c == renderInitialData.f258768c;
        }

        public final int hashCode() {
            return this.f258768c.hashCode() + (this.f258767b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "RenderInitialData(details=" + this.f258767b + ", mode=" + this.f258768c + ')';
        }
    }

    /* compiled from: SavedSearchSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$ShowDayOfWeekErrorMessage;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction;", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowDayOfWeekErrorMessage implements SavedSearchSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowDayOfWeekErrorMessage f258769b = new ShowDayOfWeekErrorMessage();

        private ShowDayOfWeekErrorMessage() {
        }
    }

    /* compiled from: SavedSearchSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction$ShowTimeOfDayErrorMessage;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction;", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowTimeOfDayErrorMessage implements SavedSearchSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowTimeOfDayErrorMessage f258770b = new ShowTimeOfDayErrorMessage();

        private ShowTimeOfDayErrorMessage() {
        }
    }
}
