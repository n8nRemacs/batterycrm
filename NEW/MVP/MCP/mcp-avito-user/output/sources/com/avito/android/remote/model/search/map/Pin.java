package com.avito.android.remote.model.search.map;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.ServiceTypeKt;
import com.avito.android.remote.model.search.map.Marker;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Pin.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b\n\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b/\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b3\u0010\u001e¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/search/map/Pin;", "Lcom/avito/android/remote/model/search/map/Marker;", "", "id", "", "itemsCount", "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "price", "", "isFavorite", "favoritesIds", "Lcom/avito/android/remote/model/search/map/Highlight;", ServiceTypeKt.SERVICE_HIGHLIGHT, "Lcom/avito/android/remote/model/search/map/Form;", "form", "context", "Lcom/avito/android/remote/model/search/map/Brand;", "brand", "icon", "<init>", "(Ljava/lang/String;ILcom/avito/android/remote/model/Coordinates;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/search/map/Highlight;Lcom/avito/android/remote/model/search/map/Form;Ljava/lang/String;Lcom/avito/android/remote/model/search/map/Brand;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "I", "getItemsCount", "()I", "Lcom/avito/android/remote/model/Coordinates;", "getCoordinates", "()Lcom/avito/android/remote/model/Coordinates;", "getPrice", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getFavoritesIds", "Lcom/avito/android/remote/model/search/map/Highlight;", "getHighlight", "()Lcom/avito/android/remote/model/search/map/Highlight;", "Lcom/avito/android/remote/model/search/map/Form;", "getForm", "()Lcom/avito/android/remote/model/search/map/Form;", "getContext", "Lcom/avito/android/remote/model/search/map/Brand;", "getBrand", "()Lcom/avito/android/remote/model/search/map/Brand;", "getIcon", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Pin implements Marker {

    @k
    public static final Parcelable.Creator<Pin> CREATOR = new Creator();

    @c("brand")
    @l
    private final Brand brand;

    @c("context")
    @l
    private final String context;

    @c("coords")
    @k
    private final Coordinates coordinates;

    @c("favoritesIds")
    @l
    private final String favoritesIds;

    @c("form")
    @l
    private final Form form;

    @c(ServiceTypeKt.SERVICE_HIGHLIGHT)
    @l
    private final Highlight highlight;

    @c("icon")
    @l
    private final String icon;

    @c("id")
    @k
    private final String id;

    @c("isFavorite")
    @l
    private final Boolean isFavorite;

    @c("itemsCount")
    private final int itemsCount;

    @c("price")
    @l
    private final String price;

    /* compiled from: Pin.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Pin> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Pin createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            Coordinates coordinatesCreateFromParcel = Coordinates.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Pin(string, i12, coordinatesCreateFromParcel, string2, boolValueOf, parcel.readString(), parcel.readInt() == 0 ? null : Highlight.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Form.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? Brand.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Pin[] newArray(int i12) {
            return new Pin[i12];
        }
    }

    public Pin(@k String str, int i12, @k Coordinates coordinates, @l String str2, @l Boolean bool, @l String str3, @l Highlight highlight, @l Form form, @l String str4, @l Brand brand, @l String str5) {
        this.id = str;
        this.itemsCount = i12;
        this.coordinates = coordinates;
        this.price = str2;
        this.isFavorite = bool;
        this.favoritesIds = str3;
        this.highlight = highlight;
        this.form = form;
        this.context = str4;
        this.brand = brand;
        this.icon = str5;
    }

    @Override // com.avito.android.remote.model.search.map.Marker, android.os.Parcelable
    public int describeContents() {
        return Marker.DefaultImpls.describeContents(this);
    }

    @l
    public final Brand getBrand() {
        return this.brand;
    }

    @l
    public final String getContext() {
        return this.context;
    }

    @k
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @l
    public final String getFavoritesIds() {
        return this.favoritesIds;
    }

    @l
    public final Form getForm() {
        return this.form;
    }

    @l
    public final Highlight getHighlight() {
        return this.highlight;
    }

    @l
    public final String getIcon() {
        return this.icon;
    }

    @k
    public final String getId() {
        return this.id;
    }

    public final int getItemsCount() {
        return this.itemsCount;
    }

    @l
    public final String getPrice() {
        return this.price;
    }

    @l
    /* renamed from: isFavorite, reason: from getter */
    public final Boolean getIsFavorite() {
        return this.isFavorite;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeInt(this.itemsCount);
        this.coordinates.writeToParcel(parcel, flags);
        parcel.writeString(this.price);
        Boolean bool = this.isFavorite;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.favoritesIds);
        Highlight highlight = this.highlight;
        if (highlight == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(highlight.name());
        }
        Form form = this.form;
        if (form == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(form.name());
        }
        parcel.writeString(this.context);
        Brand brand = this.brand;
        if (brand == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            brand.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.icon);
    }

    public /* synthetic */ Pin(String str, int i12, Coordinates coordinates, String str2, Boolean bool, String str3, Highlight highlight, Form form, String str4, Brand brand, String str5, int i13, C42822w c42822w) {
        this(str, i12, coordinates, str2, bool, str3, (i13 & 64) != 0 ? null : highlight, (i13 & 128) != 0 ? null : form, (i13 & 256) != 0 ? null : str4, (i13 & 512) != 0 ? null : brand, (i13 & 1024) != 0 ? null : str5);
    }
}
