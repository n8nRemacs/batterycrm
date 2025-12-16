package com.avito.android.remote.model.messenger.geo;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GeoMarker.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0012¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/messenger/geo/GeoMarker;", "Landroid/os/Parcelable;", "", "latitude", "longitude", "", "title", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "<init>", "(DDLjava/lang/String;Ljava/util/List;)V", "component1", "()D", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(DDLjava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/messenger/geo/GeoMarker;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "D", "getLatitude", "getLongitude", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getDescription", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GeoMarker implements Parcelable {

    @k
    public static final Parcelable.Creator<GeoMarker> CREATOR = new Creator();

    @c("description")
    @l
    private final List<AttributedText> description;

    @c("lat")
    private final double latitude;

    @c(MessageBody.Location.LONGITUDE)
    private final double longitude;

    @c("title")
    @l
    private final String title;

    /* compiled from: GeoMarker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GeoMarker> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GeoMarker createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            double d12 = parcel.readDouble();
            double d13 = parcel.readDouble();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(GeoMarker.class, parcel, arrayList, iL2, 1);
                }
            }
            return new GeoMarker(d12, d13, string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GeoMarker[] newArray(int i12) {
            return new GeoMarker[i12];
        }
    }

    public GeoMarker(double d12, double d13, @l String str, @l List<AttributedText> list) {
        this.latitude = d12;
        this.longitude = d13;
        this.title = str;
        this.description = list;
    }

    public static /* synthetic */ GeoMarker copy$default(GeoMarker geoMarker, double d12, double d13, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            d12 = geoMarker.latitude;
        }
        double d14 = d12;
        if ((i12 & 2) != 0) {
            d13 = geoMarker.longitude;
        }
        double d15 = d13;
        if ((i12 & 4) != 0) {
            str = geoMarker.title;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            list = geoMarker.description;
        }
        return geoMarker.copy(d14, d15, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<AttributedText> component4() {
        return this.description;
    }

    @k
    public final GeoMarker copy(double latitude, double longitude, @l String title, @l List<AttributedText> description) {
        return new GeoMarker(latitude, longitude, title, description);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeoMarker)) {
            return false;
        }
        GeoMarker geoMarker = (GeoMarker) other;
        return Double.compare(this.latitude, geoMarker.latitude) == 0 && Double.compare(this.longitude, geoMarker.longitude) == 0 && L.f(this.title, geoMarker.title) && L.f(this.description, geoMarker.description);
    }

    @l
    public final List<AttributedText> getDescription() {
        return this.description;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = e.d(Double.hashCode(this.latitude) * 31, 31, this.longitude);
        String str = this.title;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        List<AttributedText> list = this.description;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GeoMarker(latitude=");
        sb2.append(this.latitude);
        sb2.append(", longitude=");
        sb2.append(this.longitude);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        return H.p(sb2, this.description, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeString(this.title);
        List<AttributedText> list = this.description;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }

    public /* synthetic */ GeoMarker(double d12, double d13, String str, List list, int i12, C42822w c42822w) {
        this(d12, d13, str, (i12 & 8) != 0 ? null : list);
    }
}
