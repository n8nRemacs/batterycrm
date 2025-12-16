package com.avito.android.saved_searches.presentation.settings.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchSettingsState.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsViewState;", "Landroid/os/Parcelable;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavedSearchSettingsViewState implements Parcelable {

    @k
    public static final Parcelable.Creator<SavedSearchSettingsViewState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f258778b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<ParcelableItem> f258779c;

    /* compiled from: SavedSearchSettingsState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SavedSearchSettingsViewState> {
        @Override // android.os.Parcelable.Creator
        public final SavedSearchSettingsViewState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SavedSearchSettingsViewState.class, parcel, arrayList, iL2, 1);
            }
            return new SavedSearchSettingsViewState(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SavedSearchSettingsViewState[] newArray(int i12) {
            return new SavedSearchSettingsViewState[i12];
        }
    }

    public SavedSearchSettingsViewState() {
        this(null, null, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedSearchSettingsViewState)) {
            return false;
        }
        SavedSearchSettingsViewState savedSearchSettingsViewState = (SavedSearchSettingsViewState) obj;
        return L.f(this.f258778b, savedSearchSettingsViewState.f258778b) && L.f(this.f258779c, savedSearchSettingsViewState.f258779c);
    }

    public final int hashCode() {
        String str = this.f258778b;
        return this.f258779c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SavedSearchSettingsViewState(title=");
        sb2.append(this.f258778b);
        sb2.append(", items=");
        return H.p(sb2, this.f258779c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f258778b);
        Iterator itJ = C0.j(this.f258779c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedSearchSettingsViewState(@l String str, @k List<? extends ParcelableItem> list) {
        this.f258778b = str;
        this.f258779c = list;
    }

    public SavedSearchSettingsViewState(String str, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? C42784z0.f406748b : list);
    }
}
