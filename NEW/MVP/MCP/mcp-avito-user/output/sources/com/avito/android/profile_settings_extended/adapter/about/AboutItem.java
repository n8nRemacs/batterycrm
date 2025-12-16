package com.avito.android.profile_settings_extended.adapter.about;

import Rb0.InterfaceC15025a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_management_core.edit_text_field.AboutPopup;
import com.avito.android.profile_management_core.edit_text_field.FormattedAlertSettings;
import com.avito.android.profile_management_core.edit_text_field.NotSavedAlertSettings;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AboutItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/about/AboutItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "LRb0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AboutItem implements SettingsListItem, InterfaceC15025a, Rb0.d {

    @k
    public static final Parcelable.Creator<AboutItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229086b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f229087c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f229088d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f229089e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f229090f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f229091g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f229092h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f229093i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Integer f229094j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f229095k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final ModerationStatus f229096l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f229097m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f229098n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final NotSavedAlertSettings f229099o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final FormattedAlertSettings f229100p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final AboutPopup f229101q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final String f229102r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f229103s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229104t;

    /* compiled from: AboutItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AboutItem> {
        @Override // android.os.Parcelable.Creator
        public final AboutItem createFromParcel(Parcel parcel) {
            return new AboutItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), (ModerationStatus) parcel.readParcelable(AboutItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, (NotSavedAlertSettings) parcel.readParcelable(AboutItem.class.getClassLoader()), (FormattedAlertSettings) parcel.readParcelable(AboutItem.class.getClassLoader()), (AboutPopup) parcel.readParcelable(AboutItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AboutItem[] newArray(int i12) {
            return new AboutItem[i12];
        }
    }

    public AboutItem(@k String str, @l String str2, @k String str3, @l String str4, @k String str5, @k String str6, @l String str7, @l Integer num, @l Integer num2, @l String str8, @l ModerationStatus moderationStatus, @l String str9, boolean z12, @l NotSavedAlertSettings notSavedAlertSettings, @l FormattedAlertSettings formattedAlertSettings, @l AboutPopup aboutPopup, @l String str10, boolean z13) {
        this.f229086b = str;
        this.f229087c = str2;
        this.f229088d = str3;
        this.f229089e = str4;
        this.f229090f = str5;
        this.f229091g = str6;
        this.f229092h = str7;
        this.f229093i = num;
        this.f229094j = num2;
        this.f229095k = str8;
        this.f229096l = moderationStatus;
        this.f229097m = str9;
        this.f229098n = z12;
        this.f229099o = notSavedAlertSettings;
        this.f229100p = formattedAlertSettings;
        this.f229101q = aboutPopup;
        this.f229102r = str10;
        this.f229103s = z13;
        this.f229104t = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AboutItem)) {
            return false;
        }
        AboutItem aboutItem = (AboutItem) obj;
        return L.f(this.f229086b, aboutItem.f229086b) && L.f(this.f229087c, aboutItem.f229087c) && L.f(this.f229088d, aboutItem.f229088d) && L.f(this.f229089e, aboutItem.f229089e) && L.f(this.f229090f, aboutItem.f229090f) && L.f(this.f229091g, aboutItem.f229091g) && L.f(this.f229092h, aboutItem.f229092h) && L.f(this.f229093i, aboutItem.f229093i) && L.f(this.f229094j, aboutItem.f229094j) && L.f(this.f229095k, aboutItem.f229095k) && L.f(this.f229096l, aboutItem.f229096l) && L.f(this.f229097m, aboutItem.f229097m) && this.f229098n == aboutItem.f229098n && L.f(this.f229099o, aboutItem.f229099o) && L.f(this.f229100p, aboutItem.f229100p) && L.f(this.f229101q, aboutItem.f229101q) && L.f(this.f229102r, aboutItem.f229102r) && this.f229103s == aboutItem.f229103s;
    }

    @Override // Rb0.d
    @l
    /* renamed from: f, reason: from getter */
    public final String getF229358c() {
        return this.f229087c;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154248c() {
        return this.f229104t;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223291b() {
        return this.f229086b;
    }

    public final int hashCode() {
        int iHashCode = this.f229086b.hashCode() * 31;
        String str = this.f229087c;
        int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f229088d);
        String str2 = this.f229089e;
        int iD3 = H.d(H.d((iD2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f229090f), 31, this.f229091g);
        String str3 = this.f229092h;
        int iHashCode2 = (iD3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f229093i;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f229094j;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f229095k;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ModerationStatus moderationStatus = this.f229096l;
        int iHashCode6 = (iHashCode5 + (moderationStatus == null ? 0 : moderationStatus.hashCode())) * 31;
        String str5 = this.f229097m;
        int i12 = r.i((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f229098n);
        NotSavedAlertSettings notSavedAlertSettings = this.f229099o;
        int iHashCode7 = (i12 + (notSavedAlertSettings == null ? 0 : notSavedAlertSettings.hashCode())) * 31;
        FormattedAlertSettings formattedAlertSettings = this.f229100p;
        int iHashCode8 = (iHashCode7 + (formattedAlertSettings == null ? 0 : formattedAlertSettings.hashCode())) * 31;
        AboutPopup aboutPopup = this.f229101q;
        int iHashCode9 = (iHashCode8 + (aboutPopup == null ? 0 : aboutPopup.f226608b.hashCode())) * 31;
        String str6 = this.f229102r;
        return Boolean.hashCode(this.f229103s) + ((iHashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AboutItem(stringId=");
        sb2.append(this.f229086b);
        sb2.append(", widgetName=");
        sb2.append(this.f229087c);
        sb2.append(", title=");
        sb2.append(this.f229088d);
        sb2.append(", placeholder=");
        sb2.append(this.f229089e);
        sb2.append(", fieldName=");
        sb2.append(this.f229090f);
        sb2.append(", valueId=");
        sb2.append(this.f229091g);
        sb2.append(", valueText=");
        sb2.append(this.f229092h);
        sb2.append(", maxLength=");
        sb2.append(this.f229093i);
        sb2.append(", showMoreLinesCount=");
        sb2.append(this.f229094j);
        sb2.append(", showMoreTitle=");
        sb2.append(this.f229095k);
        sb2.append(", moderationStatus=");
        sb2.append(this.f229096l);
        sb2.append(", defaultSaveErrorMessage=");
        sb2.append(this.f229097m);
        sb2.append(", isCollapsed=");
        sb2.append(this.f229098n);
        sb2.append(", alertDialogSettings=");
        sb2.append(this.f229099o);
        sb2.append(", formattedAlertSettings=");
        sb2.append(this.f229100p);
        sb2.append(", popup=");
        sb2.append(this.f229101q);
        sb2.append(", popupTitle=");
        sb2.append(this.f229102r);
        sb2.append(", isActive=");
        return r.x(sb2, this.f229103s, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229086b);
        parcel.writeString(this.f229087c);
        parcel.writeString(this.f229088d);
        parcel.writeString(this.f229089e);
        parcel.writeString(this.f229090f);
        parcel.writeString(this.f229091g);
        parcel.writeString(this.f229092h);
        Integer num = this.f229093i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f229094j;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeString(this.f229095k);
        parcel.writeParcelable(this.f229096l, i12);
        parcel.writeString(this.f229097m);
        parcel.writeInt(this.f229098n ? 1 : 0);
        parcel.writeParcelable(this.f229099o, i12);
        parcel.writeParcelable(this.f229100p, i12);
        parcel.writeParcelable(this.f229101q, i12);
        parcel.writeString(this.f229102r);
        parcel.writeInt(this.f229103s ? 1 : 0);
    }

    public /* synthetic */ AboutItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, ModerationStatus moderationStatus, String str9, boolean z12, NotSavedAlertSettings notSavedAlertSettings, FormattedAlertSettings formattedAlertSettings, AboutPopup aboutPopup, String str10, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "about_item" : str, str2, str3, str4, str5, str6, str7, num, num2, str8, moderationStatus, str9, (i12 & 4096) != 0 ? true : z12, notSavedAlertSettings, formattedAlertSettings, aboutPopup, str10, z13);
    }
}
