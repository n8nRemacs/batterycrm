package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Offers.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJr\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0013J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b3\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b6\u0010\u0015R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b9\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010\u001e¨\u0006<"}, d2 = {"Lcom/avito/android/remote/model/OfferItem;", "Landroid/os/Parcelable;", "", "id", "", "title", "dateTo", "Lcom/avito/android/remote/model/OfferType;", "type", "description", "", "Lcom/avito/android/remote/model/DevelopmentOfferParameter;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "gradient", "Lcom/avito/android/remote/model/ContextButton;", "contextButton", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/OfferType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/ContextButton;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/OfferType;", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "()Lcom/avito/android/remote/model/ContextButton;", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/OfferType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/ContextButton;)Lcom/avito/android/remote/model/OfferItem;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/String;", "getTitle", "getDateTo", "Lcom/avito/android/remote/model/OfferType;", "getType", "getDescription", "Ljava/util/List;", "getParameters", "getGradient", "Lcom/avito/android/remote/model/ContextButton;", "getContextButton", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OfferItem implements Parcelable {

    @k
    public static final Parcelable.Creator<OfferItem> CREATOR = new Creator();

    @c("contextButton")
    @l
    private final ContextButton contextButton;

    @c("dateTo")
    @l
    private final String dateTo;

    @c("description")
    @l
    private final String description;

    @c("gradient")
    @l
    private final String gradient;

    @c("id")
    private final int id;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final List<DevelopmentOfferParameter> parameters;

    @c("title")
    @k
    private final String title;

    @c("type")
    @l
    private final OfferType type;

    /* compiled from: Offers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OfferItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OfferItem createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            int i12 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            OfferType offerTypeValueOf = parcel.readInt() == 0 ? null : OfferType.valueOf(parcel.readString());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = a.c(DevelopmentOfferParameter.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new OfferItem(i12, string, string2, offerTypeValueOf, string3, arrayList, parcel.readString(), parcel.readInt() != 0 ? ContextButton.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OfferItem[] newArray(int i12) {
            return new OfferItem[i12];
        }
    }

    public OfferItem(int i12, @k String str, @l String str2, @l OfferType offerType, @l String str3, @l List<DevelopmentOfferParameter> list, @l String str4, @l ContextButton contextButton) {
        this.id = i12;
        this.title = str;
        this.dateTo = str2;
        this.type = offerType;
        this.description = str3;
        this.parameters = list;
        this.gradient = str4;
        this.contextButton = contextButton;
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getDateTo() {
        return this.dateTo;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final OfferType getType() {
        return this.type;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    public final List<DevelopmentOfferParameter> component6() {
        return this.parameters;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getGradient() {
        return this.gradient;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final ContextButton getContextButton() {
        return this.contextButton;
    }

    @k
    public final OfferItem copy(int id2, @k String title, @l String dateTo, @l OfferType type, @l String description, @l List<DevelopmentOfferParameter> parameters, @l String gradient, @l ContextButton contextButton) {
        return new OfferItem(id2, title, dateTo, type, description, parameters, gradient, contextButton);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferItem)) {
            return false;
        }
        OfferItem offerItem = (OfferItem) other;
        return this.id == offerItem.id && L.f(this.title, offerItem.title) && L.f(this.dateTo, offerItem.dateTo) && this.type == offerItem.type && L.f(this.description, offerItem.description) && L.f(this.parameters, offerItem.parameters) && L.f(this.gradient, offerItem.gradient) && L.f(this.contextButton, offerItem.contextButton);
    }

    @l
    public final ContextButton getContextButton() {
        return this.contextButton;
    }

    @l
    public final String getDateTo() {
        return this.dateTo;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getGradient() {
        return this.gradient;
    }

    public final int getId() {
        return this.id;
    }

    @l
    public final List<DevelopmentOfferParameter> getParameters() {
        return this.parameters;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final OfferType getType() {
        return this.type;
    }

    public int hashCode() {
        int iD2 = H.d(Integer.hashCode(this.id) * 31, 31, this.title);
        String str = this.dateTo;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        OfferType offerType = this.type;
        int iHashCode2 = (iHashCode + (offerType == null ? 0 : offerType.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<DevelopmentOfferParameter> list = this.parameters;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.gradient;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ContextButton contextButton = this.contextButton;
        return iHashCode5 + (contextButton != null ? contextButton.hashCode() : 0);
    }

    @k
    public String toString() {
        return "OfferItem(id=" + this.id + ", title=" + this.title + ", dateTo=" + this.dateTo + ", type=" + this.type + ", description=" + this.description + ", parameters=" + this.parameters + ", gradient=" + this.gradient + ", contextButton=" + this.contextButton + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.dateTo);
        OfferType offerType = this.type;
        if (offerType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(offerType.name());
        }
        parcel.writeString(this.description);
        List<DevelopmentOfferParameter> list = this.parameters;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((DevelopmentOfferParameter) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.gradient);
        ContextButton contextButton = this.contextButton;
        if (contextButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contextButton.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ OfferItem(int i12, String str, String str2, OfferType offerType, String str3, List list, String str4, ContextButton contextButton, int i13, C42822w c42822w) {
        this(i12, str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : offerType, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : list, (i13 & 64) != 0 ? null : str4, (i13 & 128) != 0 ? null : contextButton);
    }
}
