package com.avito.android.saved_searches.presentation.settings.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.android.saved_searches.presentation.settings.SavedSearchSettingsMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchSettingsState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "a", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavedSearchSettingsState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SavedSearchData.Settings.SettingsDetails f258773b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SavedSearchSettingsMode f258774c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f258775d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f258776e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SavedSearchSettingsViewState f258777f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f258771g = new a(null);

    @k
    public static final Parcelable.Creator<SavedSearchSettingsState> CREATOR = new b();

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final SavedSearchSettingsState f258772h = new SavedSearchSettingsState(new SavedSearchData.Settings.SettingsDetails(null, null, null, null, null), SavedSearchSettingsMode.f258740b, false, false, new SavedSearchSettingsViewState(null, null, 3, null));

    /* compiled from: SavedSearchSettingsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsState$a;", "", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SavedSearchSettingsState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SavedSearchSettingsState> {
        @Override // android.os.Parcelable.Creator
        public final SavedSearchSettingsState createFromParcel(Parcel parcel) {
            return new SavedSearchSettingsState((SavedSearchData.Settings.SettingsDetails) parcel.readParcelable(SavedSearchSettingsState.class.getClassLoader()), SavedSearchSettingsMode.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, SavedSearchSettingsViewState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SavedSearchSettingsState[] newArray(int i12) {
            return new SavedSearchSettingsState[i12];
        }
    }

    public SavedSearchSettingsState(@k SavedSearchData.Settings.SettingsDetails settingsDetails, @k SavedSearchSettingsMode savedSearchSettingsMode, boolean z12, boolean z13, @k SavedSearchSettingsViewState savedSearchSettingsViewState) {
        this.f258773b = settingsDetails;
        this.f258774c = savedSearchSettingsMode;
        this.f258775d = z12;
        this.f258776e = z13;
        this.f258777f = savedSearchSettingsViewState;
    }

    public static SavedSearchSettingsState a(SavedSearchSettingsState savedSearchSettingsState, SavedSearchData.Settings.SettingsDetails settingsDetails, SavedSearchSettingsMode savedSearchSettingsMode, boolean z12, boolean z13, SavedSearchSettingsViewState savedSearchSettingsViewState, int i12) {
        if ((i12 & 1) != 0) {
            settingsDetails = savedSearchSettingsState.f258773b;
        }
        SavedSearchData.Settings.SettingsDetails settingsDetails2 = settingsDetails;
        if ((i12 & 2) != 0) {
            savedSearchSettingsMode = savedSearchSettingsState.f258774c;
        }
        SavedSearchSettingsMode savedSearchSettingsMode2 = savedSearchSettingsMode;
        if ((i12 & 4) != 0) {
            z12 = savedSearchSettingsState.f258775d;
        }
        boolean z14 = z12;
        if ((i12 & 8) != 0) {
            z13 = savedSearchSettingsState.f258776e;
        }
        boolean z15 = z13;
        if ((i12 & 16) != 0) {
            savedSearchSettingsViewState = savedSearchSettingsState.f258777f;
        }
        savedSearchSettingsState.getClass();
        return new SavedSearchSettingsState(settingsDetails2, savedSearchSettingsMode2, z14, z15, savedSearchSettingsViewState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedSearchSettingsState)) {
            return false;
        }
        SavedSearchSettingsState savedSearchSettingsState = (SavedSearchSettingsState) obj;
        return L.f(this.f258773b, savedSearchSettingsState.f258773b) && this.f258774c == savedSearchSettingsState.f258774c && this.f258775d == savedSearchSettingsState.f258775d && this.f258776e == savedSearchSettingsState.f258776e && L.f(this.f258777f, savedSearchSettingsState.f258777f);
    }

    public final int hashCode() {
        return this.f258777f.hashCode() + r.i(r.i((this.f258774c.hashCode() + (this.f258773b.hashCode() * 31)) * 31, 31, this.f258775d), 31, this.f258776e);
    }

    @k
    public final String toString() {
        return "SavedSearchSettingsState(details=" + this.f258773b + ", mode=" + this.f258774c + ", showDayOfWeekErrorMessage=" + this.f258775d + ", showTimeOfDayErrorMessage=" + this.f258776e + ", viewState=" + this.f258777f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f258773b, i12);
        this.f258774c.writeToParcel(parcel, i12);
        parcel.writeInt(this.f258775d ? 1 : 0);
        parcel.writeInt(this.f258776e ? 1 : 0);
        this.f258777f.writeToParcel(parcel, i12);
    }
}
