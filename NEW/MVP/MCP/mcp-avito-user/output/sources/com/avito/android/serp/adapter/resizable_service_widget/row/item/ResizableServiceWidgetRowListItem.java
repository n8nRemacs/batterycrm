package com.avito.android.serp.adapter.resizable_service_widget.row.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ResizableServiceWidgetRowItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/resizable_service_widget/row/item/ResizableServiceWidgetRowListItem;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ResizableServiceWidgetRowListItem implements Parcelable {

    @k
    public static final Parcelable.Creator<ResizableServiceWidgetRowListItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UniversalImage f270733b;

    /* renamed from: c, reason: collision with root package name */
    public final float f270734c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f270735d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f270736e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f270737f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f270738g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f270739h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final DeepLink f270740i;

    /* compiled from: ResizableServiceWidgetRowItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ResizableServiceWidgetRowListItem> {
        @Override // android.os.Parcelable.Creator
        public final ResizableServiceWidgetRowListItem createFromParcel(Parcel parcel) {
            return new ResizableServiceWidgetRowListItem((UniversalImage) parcel.readParcelable(ResizableServiceWidgetRowListItem.class.getClassLoader()), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ResizableServiceWidgetRowListItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ResizableServiceWidgetRowListItem[] newArray(int i12) {
            return new ResizableServiceWidgetRowListItem[i12];
        }
    }

    public ResizableServiceWidgetRowListItem(@l UniversalImage universalImage, float f12, @k String str, @l String str2, @l String str3, @l String str4, @l String str5, @k DeepLink deepLink) {
        this.f270733b = universalImage;
        this.f270734c = f12;
        this.f270735d = str;
        this.f270736e = str2;
        this.f270737f = str3;
        this.f270738g = str4;
        this.f270739h = str5;
        this.f270740i = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResizableServiceWidgetRowListItem)) {
            return false;
        }
        ResizableServiceWidgetRowListItem resizableServiceWidgetRowListItem = (ResizableServiceWidgetRowListItem) obj;
        return L.f(this.f270733b, resizableServiceWidgetRowListItem.f270733b) && Float.compare(this.f270734c, resizableServiceWidgetRowListItem.f270734c) == 0 && L.f(this.f270735d, resizableServiceWidgetRowListItem.f270735d) && L.f(this.f270736e, resizableServiceWidgetRowListItem.f270736e) && L.f(this.f270737f, resizableServiceWidgetRowListItem.f270737f) && L.f(this.f270738g, resizableServiceWidgetRowListItem.f270738g) && L.f(this.f270739h, resizableServiceWidgetRowListItem.f270739h) && L.f(this.f270740i, resizableServiceWidgetRowListItem.f270740i);
    }

    public final int hashCode() {
        UniversalImage universalImage = this.f270733b;
        int iD2 = H.d(r.d(this.f270734c, (universalImage == null ? 0 : universalImage.hashCode()) * 31, 31), 31, this.f270735d);
        String str = this.f270736e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f270737f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f270738g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f270739h;
        return this.f270740i.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResizableServiceWidgetRowListItem(iconUrls=");
        sb2.append(this.f270733b);
        sb2.append(", weight=");
        sb2.append(this.f270734c);
        sb2.append(", title=");
        sb2.append(this.f270735d);
        sb2.append(", subTitle1=");
        sb2.append(this.f270736e);
        sb2.append(", subTitle2=");
        sb2.append(this.f270737f);
        sb2.append(", backgroundColorKey=");
        sb2.append(this.f270738g);
        sb2.append(", pressedColorKey=");
        sb2.append(this.f270739h);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f270740i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f270733b, i12);
        parcel.writeFloat(this.f270734c);
        parcel.writeString(this.f270735d);
        parcel.writeString(this.f270736e);
        parcel.writeString(this.f270737f);
        parcel.writeString(this.f270738g);
        parcel.writeString(this.f270739h);
        parcel.writeParcelable(this.f270740i, i12);
    }
}
