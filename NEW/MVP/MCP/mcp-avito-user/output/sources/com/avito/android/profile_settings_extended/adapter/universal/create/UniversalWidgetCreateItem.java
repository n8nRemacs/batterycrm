package com.avito.android.profile_settings_extended.adapter.universal.create;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetCreateArguments;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetCreateItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/universal/create/UniversalWidgetCreateItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UniversalWidgetCreateItem implements SettingsListItem {

    @k
    public static final Parcelable.Creator<UniversalWidgetCreateItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229886b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f229887c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalWidgetCreateArguments f229888d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229889e;

    /* compiled from: UniversalWidgetCreateItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalWidgetCreateItem> {
        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetCreateItem createFromParcel(Parcel parcel) {
            return new UniversalWidgetCreateItem(parcel.readString(), parcel.readString(), (UniversalWidgetCreateArguments) parcel.readParcelable(UniversalWidgetCreateItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetCreateItem[] newArray(int i12) {
            return new UniversalWidgetCreateItem[i12];
        }
    }

    public UniversalWidgetCreateItem(@k String str, @l String str2, @k UniversalWidgetCreateArguments universalWidgetCreateArguments) {
        this.f229886b = str;
        this.f229887c = str2;
        this.f229888d = universalWidgetCreateArguments;
        this.f229889e = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalWidgetCreateItem)) {
            return false;
        }
        UniversalWidgetCreateItem universalWidgetCreateItem = (UniversalWidgetCreateItem) obj;
        return L.f(this.f229886b, universalWidgetCreateItem.f229886b) && L.f(this.f229887c, universalWidgetCreateItem.f229887c) && L.f(this.f229888d, universalWidgetCreateItem.f229888d);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154626c() {
        return this.f229889e;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229492b() {
        return this.f229886b;
    }

    public final int hashCode() {
        int iHashCode = this.f229886b.hashCode() * 31;
        String str = this.f229887c;
        return this.f229888d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "UniversalWidgetCreateItem(stringId=" + this.f229886b + ", text=" + this.f229887c + ", createArguments=" + this.f229888d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229886b);
        parcel.writeString(this.f229887c);
        parcel.writeParcelable(this.f229888d, i12);
    }

    public /* synthetic */ UniversalWidgetCreateItem(String str, String str2, UniversalWidgetCreateArguments universalWidgetCreateArguments, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "universal_widget_create_item" : str, str2, universalWidgetCreateArguments);
    }
}
