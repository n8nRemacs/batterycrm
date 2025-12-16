package com.avito.android.photo_gallery.realty_layouts;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.advert.item.delivery_suggests.l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RealtyDelegateState.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/realty_layouts/RealtyDelegateState;", "Landroid/os/Parcelable;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RealtyDelegateState implements Parcelable {

    @k
    public static final Parcelable.Creator<RealtyDelegateState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f217650b;

    /* renamed from: c, reason: collision with root package name */
    public final int f217651c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f217652d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f217653e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f217654f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f217655g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ArrayList f217656h;

    /* compiled from: RealtyDelegateState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealtyDelegateState> {
        @Override // android.os.Parcelable.Creator
        public final RealtyDelegateState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int iD2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            while (iD2 != i14) {
                iD2 = l.d(parcel, arrayList, iD2, 1);
            }
            return new RealtyDelegateState(i12, i13, z12, z13, z14, z15, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RealtyDelegateState[] newArray(int i12) {
            return new RealtyDelegateState[i12];
        }
    }

    public RealtyDelegateState(int i12, int i13, boolean z12, boolean z13, boolean z14, boolean z15, @k ArrayList arrayList) {
        this.f217650b = i12;
        this.f217651c = i13;
        this.f217652d = z12;
        this.f217653e = z13;
        this.f217654f = z14;
        this.f217655g = z15;
        this.f217656h = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtyDelegateState)) {
            return false;
        }
        RealtyDelegateState realtyDelegateState = (RealtyDelegateState) obj;
        return this.f217650b == realtyDelegateState.f217650b && this.f217651c == realtyDelegateState.f217651c && this.f217652d == realtyDelegateState.f217652d && this.f217653e == realtyDelegateState.f217653e && this.f217654f == realtyDelegateState.f217654f && this.f217655g == realtyDelegateState.f217655g && L.f(this.f217656h, realtyDelegateState.f217656h);
    }

    public final int hashCode() {
        return this.f217656h.hashCode() + r.i(r.i(r.i(r.i(r.e(this.f217651c, Integer.hashCode(this.f217650b) * 31, 31), 31, this.f217652d), 31, this.f217653e), 31, this.f217654f), 31, this.f217655g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RealtyDelegateState(beforeRealtyWasPosition=");
        sb2.append(this.f217650b);
        sb2.append(", currentPosition=");
        sb2.append(this.f217651c);
        sb2.append(", realtyIconClicked=");
        sb2.append(this.f217652d);
        sb2.append(", startInRealtyLayoutsMode=");
        sb2.append(this.f217653e);
        sb2.append(", startedInRealtyLayoutsMode=");
        sb2.append(this.f217654f);
        sb2.append(", realtyAiIconClicked=");
        sb2.append(this.f217655g);
        sb2.append(", realtyAiImagesDownloadList=");
        return e.p(sb2, this.f217656h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f217650b);
        parcel.writeInt(this.f217651c);
        parcel.writeInt(this.f217652d ? 1 : 0);
        parcel.writeInt(this.f217653e ? 1 : 0);
        parcel.writeInt(this.f217654f ? 1 : 0);
        parcel.writeInt(this.f217655g ? 1 : 0);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f217656h, parcel);
        while (itZ.hasNext()) {
            parcel.writeInt(((Number) itZ.next()).intValue());
        }
    }
}
