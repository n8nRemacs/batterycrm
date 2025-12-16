package com.avito.android.profile_settings_extended.adapter.gallery.gallery_header;

import Rb0.InterfaceC15025a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GalleryHeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/gallery/gallery_header/GalleryHeaderItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GalleryHeaderItem implements SettingsListItem, InterfaceC15025a {

    @k
    public static final Parcelable.Creator<GalleryHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229403b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f229404c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f229405d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f229406e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229407f;

    /* compiled from: GalleryHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GalleryHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final GalleryHeaderItem createFromParcel(Parcel parcel) {
            return new GalleryHeaderItem((AttributedText) parcel.readParcelable(GalleryHeaderItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryHeaderItem[] newArray(int i12) {
            return new GalleryHeaderItem[i12];
        }
    }

    public GalleryHeaderItem(@l AttributedText attributedText, @k String str, @k String str2, boolean z12) {
        this.f229403b = str;
        this.f229404c = str2;
        this.f229405d = attributedText;
        this.f229406e = z12;
        this.f229407f = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryHeaderItem)) {
            return false;
        }
        GalleryHeaderItem galleryHeaderItem = (GalleryHeaderItem) obj;
        return L.f(this.f229403b, galleryHeaderItem.f229403b) && L.f(this.f229404c, galleryHeaderItem.f229404c) && L.f(this.f229405d, galleryHeaderItem.f229405d) && this.f229406e == galleryHeaderItem.f229406e;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154919c() {
        return this.f229407f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223403b() {
        return this.f229403b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f229403b.hashCode() * 31, 31, this.f229404c);
        AttributedText attributedText = this.f229405d;
        return Boolean.hashCode(this.f229406e) + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryHeaderItem(stringId=");
        sb2.append(this.f229403b);
        sb2.append(", title=");
        sb2.append(this.f229404c);
        sb2.append(", subtitle=");
        sb2.append(this.f229405d);
        sb2.append(", isActive=");
        return r.x(sb2, this.f229406e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229403b);
        parcel.writeString(this.f229404c);
        parcel.writeParcelable(this.f229405d, i12);
        parcel.writeInt(this.f229406e ? 1 : 0);
    }

    public /* synthetic */ GalleryHeaderItem(String str, String str2, AttributedText attributedText, boolean z12, int i12, C42822w c42822w) {
        this(attributedText, (i12 & 1) != 0 ? "gallery_header_item" : str, str2, z12);
    }
}
