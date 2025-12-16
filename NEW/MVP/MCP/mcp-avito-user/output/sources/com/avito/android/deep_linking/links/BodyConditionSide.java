package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BodyConditionBottomSheetLink.kt */
@K51.d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/deep_linking/links/BodyConditionSide;", "Lcom/avito/android/deep_linking/links/e;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/Image;", "icon", "layout", "", "Lcom/avito/android/deep_linking/links/BodyConditionPoint;", "points", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "getIcon", "()Lcom/avito/android/remote/model/Image;", "getLayout", "Ljava/util/List;", "getPoints", "()Ljava/util/List;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BodyConditionSide implements InterfaceC29679e, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BodyConditionSide> CREATOR = new a();

    @com.google.gson.annotations.c("icon")
    @Y61.k
    private final Image icon;

    @com.google.gson.annotations.c("layout")
    @Y61.k
    private final Image layout;

    @com.google.gson.annotations.c("points")
    @Y61.k
    private final List<BodyConditionPoint> points;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    /* compiled from: BodyConditionBottomSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BodyConditionSide> {
        @Override // android.os.Parcelable.Creator
        public final BodyConditionSide createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Image image = (Image) parcel.readParcelable(BodyConditionSide.class.getClassLoader());
            Image image2 = (Image) parcel.readParcelable(BodyConditionSide.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(BodyConditionPoint.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new BodyConditionSide(string, image, image2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BodyConditionSide[] newArray(int i12) {
            return new BodyConditionSide[i12];
        }
    }

    public BodyConditionSide(@Y61.k String str, @Y61.k Image image, @Y61.k Image image2, @Y61.k List<BodyConditionPoint> list) {
        this.title = str;
        this.icon = image;
        this.layout = image2;
        this.points = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BodyConditionSide)) {
            return false;
        }
        BodyConditionSide bodyConditionSide = (BodyConditionSide) obj;
        return kotlin.jvm.internal.L.f(this.title, bodyConditionSide.title) && kotlin.jvm.internal.L.f(this.icon, bodyConditionSide.icon) && kotlin.jvm.internal.L.f(this.layout, bodyConditionSide.layout) && kotlin.jvm.internal.L.f(this.points, bodyConditionSide.points);
    }

    @Override // com.avito.android.deep_linking.links.InterfaceC29679e
    @Y61.k
    public final Image getIcon() {
        return this.icon;
    }

    @Override // com.avito.android.deep_linking.links.InterfaceC29679e
    @Y61.k
    public final Image getLayout() {
        return this.layout;
    }

    @Override // com.avito.android.deep_linking.links.InterfaceC29679e
    @Y61.k
    public final List<BodyConditionPoint> getPoints() {
        return this.points;
    }

    @Override // com.avito.android.deep_linking.links.InterfaceC29679e
    @Y61.k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.points.hashCode() + com.avito.android.actions_sheet.a.g(this.layout, com.avito.android.actions_sheet.a.g(this.icon, this.title.hashCode() * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BodyConditionSide(title=");
        sb2.append(this.title);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", layout=");
        sb2.append(this.layout);
        sb2.append(", points=");
        return androidx.compose.foundation.H.p(sb2, this.points, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.icon, i12);
        parcel.writeParcelable(this.layout, i12);
        Iterator itJ = C0.j(this.points, parcel);
        while (itJ.hasNext()) {
            ((BodyConditionPoint) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
