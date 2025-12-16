package com.avito.android.beduin.common.component.albums.items;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.component.albums.AlbumElement;
import com.avito.android.beduin.common.component.image.OverlayStyle;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: AlbumItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/albums/items/AlbumItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AlbumItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AlbumItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f100641b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AlbumElement f100642c;

    /* renamed from: d, reason: collision with root package name */
    public final int f100643d;

    /* renamed from: e, reason: collision with root package name */
    public final int f100644e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final OverlayStyle f100645f;

    /* compiled from: AlbumItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AlbumItem> {
        @Override // android.os.Parcelable.Creator
        public final AlbumItem createFromParcel(Parcel parcel) {
            return new AlbumItem(parcel.readString(), AlbumElement.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : OverlayStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumItem[] newArray(int i12) {
            return new AlbumItem[i12];
        }
    }

    public AlbumItem(@k String str, @k AlbumElement albumElement, int i12, int i13, @l OverlayStyle overlayStyle) {
        this.f100641b = str;
        this.f100642c = albumElement;
        this.f100643d = i12;
        this.f100644e = i13;
        this.f100645f = overlayStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79005b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF100641b() {
        return this.f100641b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f100641b);
        this.f100642c.writeToParcel(parcel, i12);
        parcel.writeInt(this.f100643d);
        parcel.writeInt(this.f100644e);
        OverlayStyle overlayStyle = this.f100645f;
        if (overlayStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            overlayStyle.writeToParcel(parcel, i12);
        }
    }
}
