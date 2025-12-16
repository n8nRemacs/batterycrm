package com.avito.android.campaigns_sale.view.images_row;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImagesRowItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale/view/images_row/ImagesRowItem;", "Landroid/os/Parcelable;", "Overlay", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ImagesRowItem implements Parcelable {

    @k
    public static final Parcelable.Creator<ImagesRowItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Image f114425b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Size f114426c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Overlay f114427d;

    /* renamed from: e, reason: collision with root package name */
    public final int f114428e;

    /* renamed from: f, reason: collision with root package name */
    public final int f114429f;

    /* compiled from: ImagesRowItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImagesRowItem> {
        @Override // android.os.Parcelable.Creator
        public final ImagesRowItem createFromParcel(Parcel parcel) {
            return new ImagesRowItem((Image) parcel.readParcelable(ImagesRowItem.class.getClassLoader()), (Size) parcel.readParcelable(ImagesRowItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Overlay.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImagesRowItem[] newArray(int i12) {
            return new ImagesRowItem[i12];
        }
    }

    public ImagesRowItem(@k Image image, @k Size size, @l Overlay overlay, int i12, @InterfaceC42156l int i13) {
        this.f114425b = image;
        this.f114426c = size;
        this.f114427d = overlay;
        this.f114428e = i12;
        this.f114429f = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagesRowItem)) {
            return false;
        }
        ImagesRowItem imagesRowItem = (ImagesRowItem) obj;
        return L.f(this.f114425b, imagesRowItem.f114425b) && L.f(this.f114426c, imagesRowItem.f114426c) && L.f(this.f114427d, imagesRowItem.f114427d) && this.f114428e == imagesRowItem.f114428e && this.f114429f == imagesRowItem.f114429f;
    }

    public final int hashCode() {
        int iHashCode = (this.f114426c.hashCode() + (this.f114425b.hashCode() * 31)) * 31;
        Overlay overlay = this.f114427d;
        return Integer.hashCode(this.f114429f) + r.e(this.f114428e, (iHashCode + (overlay == null ? 0 : overlay.hashCode())) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImagesRowItem(image=");
        sb2.append(this.f114425b);
        sb2.append(", viewSize=");
        sb2.append(this.f114426c);
        sb2.append(", overlay=");
        sb2.append(this.f114427d);
        sb2.append(", interCellSpacing=");
        sb2.append(this.f114428e);
        sb2.append(", placeholderColor=");
        return r.t(sb2, this.f114429f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f114425b, i12);
        parcel.writeParcelable(this.f114426c, i12);
        Overlay overlay = this.f114427d;
        if (overlay == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            overlay.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f114428e);
        parcel.writeInt(this.f114429f);
    }

    /* compiled from: ImagesRowItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/view/images_row/ImagesRowItem$Overlay;", "Landroid/os/Parcelable;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Overlay implements Parcelable {

        @k
        public static final Parcelable.Creator<Overlay> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f114430b;

        /* renamed from: c, reason: collision with root package name */
        public final float f114431c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f114432d;

        /* compiled from: ImagesRowItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Overlay> {
            @Override // android.os.Parcelable.Creator
            public final Overlay createFromParcel(Parcel parcel) {
                return new Overlay(parcel.readFloat(), parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Overlay[] newArray(int i12) {
                return new Overlay[i12];
            }
        }

        public Overlay(float f12, @l String str, @InterfaceC42156l int i12) {
            this.f114430b = i12;
            this.f114431c = f12;
            this.f114432d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Overlay)) {
                return false;
            }
            Overlay overlay = (Overlay) obj;
            return this.f114430b == overlay.f114430b && Float.compare(this.f114431c, overlay.f114431c) == 0 && L.f(this.f114432d, overlay.f114432d);
        }

        public final int hashCode() {
            int iD2 = r.d(this.f114431c, Integer.hashCode(this.f114430b) * 31, 31);
            String str = this.f114432d;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Overlay(color=");
            sb2.append(this.f114430b);
            sb2.append(", alpha=");
            sb2.append(this.f114431c);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f114432d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f114430b);
            parcel.writeFloat(this.f114431c);
            parcel.writeString(this.f114432d);
        }

        public /* synthetic */ Overlay(int i12, float f12, String str, int i13, C42822w c42822w) {
            this(f12, (i13 & 4) != 0 ? null : str, i12);
        }
    }

    public /* synthetic */ ImagesRowItem(Image image, Size size, Overlay overlay, int i12, int i13, int i14, C42822w c42822w) {
        this(image, size, (i14 & 4) != 0 ? null : overlay, i12, i13);
    }
}
