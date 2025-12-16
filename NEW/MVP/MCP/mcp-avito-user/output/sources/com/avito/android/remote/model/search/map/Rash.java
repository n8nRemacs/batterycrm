package com.avito.android.remote.model.search.map;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.ServiceTypeKt;
import com.avito.android.remote.model.search.map.Marker;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Rash.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\t\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b*\u0010\u001a¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/search/map/Rash;", "Lcom/avito/android/remote/model/search/map/Marker;", "", "id", "", "itemsCount", "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "", "isFavorite", "favoritesIds", "Lcom/avito/android/remote/model/search/map/Highlight;", ServiceTypeKt.SERVICE_HIGHLIGHT, "Lcom/avito/android/remote/model/search/map/Form;", "form", "context", "<init>", "(Ljava/lang/String;ILcom/avito/android/remote/model/Coordinates;ZLjava/lang/String;Lcom/avito/android/remote/model/search/map/Highlight;Lcom/avito/android/remote/model/search/map/Form;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "I", "getItemsCount", "()I", "Lcom/avito/android/remote/model/Coordinates;", "getCoordinates", "()Lcom/avito/android/remote/model/Coordinates;", "Z", "()Z", "getFavoritesIds", "Lcom/avito/android/remote/model/search/map/Highlight;", "getHighlight", "()Lcom/avito/android/remote/model/search/map/Highlight;", "Lcom/avito/android/remote/model/search/map/Form;", "getForm", "()Lcom/avito/android/remote/model/search/map/Form;", "getContext", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Rash implements Marker {

    @k
    public static final Parcelable.Creator<Rash> CREATOR = new Creator();

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

    @c("id")
    @k
    private final String id;

    @c("isFavorite")
    private final boolean isFavorite;

    @c("itemsCount")
    private final int itemsCount;

    /* compiled from: Rash.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Rash> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Rash createFromParcel(@k Parcel parcel) {
            return new Rash(parcel.readString(), parcel.readInt(), Coordinates.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Highlight.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Form.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Rash[] newArray(int i12) {
            return new Rash[i12];
        }
    }

    public Rash(@k String str, int i12, @k Coordinates coordinates, boolean z12, @l String str2, @l Highlight highlight, @l Form form, @l String str3) {
        this.id = str;
        this.itemsCount = i12;
        this.coordinates = coordinates;
        this.isFavorite = z12;
        this.favoritesIds = str2;
        this.highlight = highlight;
        this.form = form;
        this.context = str3;
    }

    @Override // com.avito.android.remote.model.search.map.Marker, android.os.Parcelable
    public int describeContents() {
        return Marker.DefaultImpls.describeContents(this);
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

    @k
    public final String getId() {
        return this.id;
    }

    public final int getItemsCount() {
        return this.itemsCount;
    }

    /* renamed from: isFavorite, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeInt(this.itemsCount);
        this.coordinates.writeToParcel(parcel, flags);
        parcel.writeInt(this.isFavorite ? 1 : 0);
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
    }

    public /* synthetic */ Rash(String str, int i12, Coordinates coordinates, boolean z12, String str2, Highlight highlight, Form form, String str3, int i13, C42822w c42822w) {
        this(str, i12, coordinates, (i13 & 8) != 0 ? false : z12, str2, (i13 & 32) != 0 ? null : highlight, (i13 & 64) != 0 ? null : form, (i13 & 128) != 0 ? null : str3);
    }
}
