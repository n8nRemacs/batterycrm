package com.avito.android.remote.model.category_parameters.slot.car_body_condition;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.InterfaceC29679e;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CarBodyConditionSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b*\u0010\u0010R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0013¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/car_body_condition/CarBodySide;", "Lcom/avito/android/deep_linking/links/e;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/Image;", "icon", "layout", "", "Lcom/avito/android/remote/model/category_parameters/slot/car_body_condition/CarBodySidePoint;", "points", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/slot/car_body_condition/CarBodySide;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/Image;", "getIcon", "getLayout", "Ljava/util/List;", "getPoints", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CarBodySide implements InterfaceC29679e, Parcelable {

    @k
    public static final Parcelable.Creator<CarBodySide> CREATOR = new Creator();

    @c("icon")
    @k
    private final Image icon;

    @c("layout")
    @k
    private final Image layout;

    @c("points")
    @k
    private final List<CarBodySidePoint> points;

    @c("title")
    @k
    private final String title;

    /* compiled from: CarBodyConditionSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CarBodySide> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CarBodySide createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            Image image = (Image) parcel.readParcelable(CarBodySide.class.getClassLoader());
            Image image2 = (Image) parcel.readParcelable(CarBodySide.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(CarBodySidePoint.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CarBodySide(string, image, image2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CarBodySide[] newArray(int i12) {
            return new CarBodySide[i12];
        }
    }

    public CarBodySide(@k String str, @k Image image, @k Image image2, @k List<CarBodySidePoint> list) {
        this.title = str;
        this.icon = image;
        this.layout = image2;
        this.points = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CarBodySide copy$default(CarBodySide carBodySide, String str, Image image, Image image2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = carBodySide.title;
        }
        if ((i12 & 2) != 0) {
            image = carBodySide.icon;
        }
        if ((i12 & 4) != 0) {
            image2 = carBodySide.layout;
        }
        if ((i12 & 8) != 0) {
            list = carBodySide.points;
        }
        return carBodySide.copy(str, image, image2, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Image getLayout() {
        return this.layout;
    }

    @k
    public final List<CarBodySidePoint> component4() {
        return this.points;
    }

    @k
    public final CarBodySide copy(@k String title, @k Image icon, @k Image layout, @k List<CarBodySidePoint> points) {
        return new CarBodySide(title, icon, layout, points);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarBodySide)) {
            return false;
        }
        CarBodySide carBodySide = (CarBodySide) other;
        return L.f(this.title, carBodySide.title) && L.f(this.icon, carBodySide.icon) && L.f(this.layout, carBodySide.layout) && L.f(this.points, carBodySide.points);
    }

    @Override // com.avito.android.deep_linking.links.InterfaceC29679e
    @k
    public Image getIcon() {
        return this.icon;
    }

    @Override // com.avito.android.deep_linking.links.InterfaceC29679e
    @k
    public Image getLayout() {
        return this.layout;
    }

    @Override // com.avito.android.deep_linking.links.InterfaceC29679e
    @k
    public List<CarBodySidePoint> getPoints() {
        return this.points;
    }

    @Override // com.avito.android.deep_linking.links.InterfaceC29679e
    @k
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.points.hashCode() + a.g(this.layout, a.g(this.icon, this.title.hashCode() * 31, 31), 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CarBodySide(title=");
        sb2.append(this.title);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", layout=");
        sb2.append(this.layout);
        sb2.append(", points=");
        return H.p(sb2, this.points, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.icon, flags);
        parcel.writeParcelable(this.layout, flags);
        Iterator itJ = C0.j(this.points, parcel);
        while (itJ.hasNext()) {
            ((CarBodySidePoint) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
