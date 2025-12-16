package com.avito.android.profile_settings_extended.adapter.universal.section;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.android.remote.model.extended.UniversalWidget;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetSectionItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/universal/section/UniversalWidgetSectionItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UniversalWidgetSectionItem implements SettingsListItem, Rb0.d {

    @Y61.k
    public static final Parcelable.Creator<UniversalWidgetSectionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f229914b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f229915c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f229916d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f229917e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f229918f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetSectionModel.Section f229919g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final ModerationStatus f229920h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final UniversalWidget.UniversalWidgetSectionVisibilityStatus f229921i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f229922j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final UniversalWidget.Config f229923k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f229924l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f229925m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final GridElementType.FullWidth f229926n;

    /* compiled from: UniversalWidgetSectionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalWidgetSectionItem> {
        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetSectionItem createFromParcel(Parcel parcel) {
            return new UniversalWidgetSectionItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (UniversalWidgetSectionModel.Section) parcel.readParcelable(UniversalWidgetSectionItem.class.getClassLoader()), (ModerationStatus) parcel.readParcelable(UniversalWidgetSectionItem.class.getClassLoader()), (UniversalWidget.UniversalWidgetSectionVisibilityStatus) parcel.readParcelable(UniversalWidgetSectionItem.class.getClassLoader()), parcel.readInt() != 0, (UniversalWidget.Config) parcel.readParcelable(UniversalWidgetSectionItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetSectionItem[] newArray(int i12) {
            return new UniversalWidgetSectionItem[i12];
        }
    }

    public UniversalWidgetSectionItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.k String str5, @Y61.k UniversalWidgetSectionModel.Section section, @Y61.l ModerationStatus moderationStatus, @Y61.k UniversalWidget.UniversalWidgetSectionVisibilityStatus universalWidgetSectionVisibilityStatus, boolean z12, @Y61.k UniversalWidget.Config config, boolean z13, boolean z14) {
        this.f229914b = str;
        this.f229915c = str2;
        this.f229916d = str3;
        this.f229917e = str4;
        this.f229918f = str5;
        this.f229919g = section;
        this.f229920h = moderationStatus;
        this.f229921i = universalWidgetSectionVisibilityStatus;
        this.f229922j = z12;
        this.f229923k = config;
        this.f229924l = z13;
        this.f229925m = z14;
        this.f229926n = GridElementType.FullWidth.f161209b;
    }

    public static UniversalWidgetSectionItem a(UniversalWidgetSectionItem universalWidgetSectionItem, boolean z12, boolean z13) {
        String str = universalWidgetSectionItem.f229914b;
        String str2 = universalWidgetSectionItem.f229915c;
        String str3 = universalWidgetSectionItem.f229916d;
        String str4 = universalWidgetSectionItem.f229917e;
        String str5 = universalWidgetSectionItem.f229918f;
        UniversalWidgetSectionModel.Section section = universalWidgetSectionItem.f229919g;
        ModerationStatus moderationStatus = universalWidgetSectionItem.f229920h;
        UniversalWidget.UniversalWidgetSectionVisibilityStatus universalWidgetSectionVisibilityStatus = universalWidgetSectionItem.f229921i;
        boolean z14 = universalWidgetSectionItem.f229922j;
        UniversalWidget.Config config = universalWidgetSectionItem.f229923k;
        universalWidgetSectionItem.getClass();
        return new UniversalWidgetSectionItem(str, str2, str3, str4, str5, section, moderationStatus, universalWidgetSectionVisibilityStatus, z14, config, z12, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalWidgetSectionItem)) {
            return false;
        }
        UniversalWidgetSectionItem universalWidgetSectionItem = (UniversalWidgetSectionItem) obj;
        return L.f(this.f229914b, universalWidgetSectionItem.f229914b) && L.f(this.f229915c, universalWidgetSectionItem.f229915c) && L.f(this.f229916d, universalWidgetSectionItem.f229916d) && L.f(this.f229917e, universalWidgetSectionItem.f229917e) && L.f(this.f229918f, universalWidgetSectionItem.f229918f) && L.f(this.f229919g, universalWidgetSectionItem.f229919g) && L.f(this.f229920h, universalWidgetSectionItem.f229920h) && L.f(this.f229921i, universalWidgetSectionItem.f229921i) && this.f229922j == universalWidgetSectionItem.f229922j && L.f(this.f229923k, universalWidgetSectionItem.f229923k) && this.f229924l == universalWidgetSectionItem.f229924l && this.f229925m == universalWidgetSectionItem.f229925m;
    }

    @Override // Rb0.d
    @Y61.l
    /* renamed from: f, reason: from getter */
    public final String getF229087c() {
        return this.f229916d;
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType */
    public final GridElementType getF154209c() {
        return this.f229926n;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83054c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF300101b() {
        return this.f229914b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f229914b.hashCode() * 31, 31, this.f229915c), 31, this.f229916d);
        String str = this.f229917e;
        int iHashCode = (this.f229919g.hashCode() + H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f229918f)) * 31;
        ModerationStatus moderationStatus = this.f229920h;
        return Boolean.hashCode(this.f229925m) + r.i((this.f229923k.hashCode() + r.i((this.f229921i.hashCode() + ((iHashCode + (moderationStatus != null ? moderationStatus.hashCode() : 0)) * 31)) * 31, 31, this.f229922j)) * 31, 31, this.f229924l);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalWidgetSectionItem(stringId=");
        sb2.append(this.f229914b);
        sb2.append(", fieldName=");
        sb2.append(this.f229915c);
        sb2.append(", valueId=");
        sb2.append(this.f229916d);
        sb2.append(", title=");
        sb2.append(this.f229917e);
        sb2.append(", editText=");
        sb2.append(this.f229918f);
        sb2.append(", section=");
        sb2.append(this.f229919g);
        sb2.append(", sectionModerationStatus=");
        sb2.append(this.f229920h);
        sb2.append(", sectionVisibleStatus=");
        sb2.append(this.f229921i);
        sb2.append(", isVisibleByUser=");
        sb2.append(this.f229922j);
        sb2.append(", universalWidgetConfig=");
        sb2.append(this.f229923k);
        sb2.append(", canMoveUp=");
        sb2.append(this.f229924l);
        sb2.append(", canMoveDown=");
        return r.x(sb2, this.f229925m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f229914b);
        parcel.writeString(this.f229915c);
        parcel.writeString(this.f229916d);
        parcel.writeString(this.f229917e);
        parcel.writeString(this.f229918f);
        parcel.writeParcelable(this.f229919g, i12);
        parcel.writeParcelable(this.f229920h, i12);
        parcel.writeParcelable(this.f229921i, i12);
        parcel.writeInt(this.f229922j ? 1 : 0);
        parcel.writeParcelable(this.f229923k, i12);
        parcel.writeInt(this.f229924l ? 1 : 0);
        parcel.writeInt(this.f229925m ? 1 : 0);
    }

    public /* synthetic */ UniversalWidgetSectionItem(String str, String str2, String str3, String str4, String str5, UniversalWidgetSectionModel.Section section, ModerationStatus moderationStatus, UniversalWidget.UniversalWidgetSectionVisibilityStatus universalWidgetSectionVisibilityStatus, boolean z12, UniversalWidget.Config config, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, str5, section, moderationStatus, universalWidgetSectionVisibilityStatus, z12, config, (i12 & 1024) != 0 ? true : z13, (i12 & 2048) != 0 ? true : z14);
    }
}
