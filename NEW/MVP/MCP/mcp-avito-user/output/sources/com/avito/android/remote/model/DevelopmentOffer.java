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

/* compiled from: DevelopmentOffers.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0001<Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJv\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u0017J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010$J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010/R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b4\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b5\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b8\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b9\u0010\u0017R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010\u001f¨\u0006="}, d2 = {"Lcom/avito/android/remote/model/DevelopmentOffer;", "Landroid/os/Parcelable;", "", "id", "", "title", "dateTo", "gradient", "Lcom/avito/android/remote/model/UniversalImage;", "universalImage", "type", "description", "", "Lcom/avito/android/remote/model/DevelopmentOfferParameter;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "isMoznoteka", "()Z", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/UniversalImage;", "component6", "component7", "component8", "()Ljava/util/List;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/DevelopmentOffer;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getId", "Ljava/lang/String;", "getTitle", "getDateTo", "getGradient", "Lcom/avito/android/remote/model/UniversalImage;", "getUniversalImage", "getType", "getDescription", "Ljava/util/List;", "getParameters", "Companion", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DevelopmentOffer implements Parcelable {

    @k
    public static final String MOZNOTEKA_TYPE = "moznoteka";

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
    @l
    private final Integer id;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final List<DevelopmentOfferParameter> parameters;

    @c("title")
    @l
    private final String title;

    @c("type")
    @l
    private final String type;

    @c("image")
    @l
    private final UniversalImage universalImage;

    @k
    public static final Parcelable.Creator<DevelopmentOffer> CREATOR = new Creator();

    /* compiled from: DevelopmentOffers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DevelopmentOffer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DevelopmentOffer createFromParcel(@k Parcel parcel) {
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(DevelopmentOffer.class.getClassLoader());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(DevelopmentOfferParameter.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new DevelopmentOffer(numValueOf, string, string2, string3, universalImage, string4, string5, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DevelopmentOffer[] newArray(int i12) {
            return new DevelopmentOffer[i12];
        }
    }

    public DevelopmentOffer() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @l
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
    public final String getGradient() {
        return this.gradient;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    public final List<DevelopmentOfferParameter> component8() {
        return this.parameters;
    }

    @k
    public final DevelopmentOffer copy(@l Integer id2, @l String title, @l String dateTo, @l String gradient, @l UniversalImage universalImage, @l String type, @l String description, @l List<DevelopmentOfferParameter> parameters) {
        return new DevelopmentOffer(id2, title, dateTo, gradient, universalImage, type, description, parameters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevelopmentOffer)) {
            return false;
        }
        DevelopmentOffer developmentOffer = (DevelopmentOffer) other;
        return L.f(this.id, developmentOffer.id) && L.f(this.title, developmentOffer.title) && L.f(this.dateTo, developmentOffer.dateTo) && L.f(this.gradient, developmentOffer.gradient) && L.f(this.universalImage, developmentOffer.universalImage) && L.f(this.type, developmentOffer.type) && L.f(this.description, developmentOffer.description) && L.f(this.parameters, developmentOffer.parameters);
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

    @l
    public final Integer getId() {
        return this.id;
    }

    @l
    public final List<DevelopmentOfferParameter> getParameters() {
        return this.parameters;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getType() {
        return this.type;
    }

    @l
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dateTo;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gradient;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UniversalImage universalImage = this.universalImage;
        int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str4 = this.type;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<DevelopmentOfferParameter> list = this.parameters;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isMoznoteka() {
        return L.f(this.type, MOZNOTEKA_TYPE);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DevelopmentOffer(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", dateTo=");
        sb2.append(this.dateTo);
        sb2.append(", gradient=");
        sb2.append(this.gradient);
        sb2.append(", universalImage=");
        sb2.append(this.universalImage);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", parameters=");
        return H.p(sb2, this.parameters, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.dateTo);
        parcel.writeString(this.gradient);
        parcel.writeParcelable(this.universalImage, flags);
        parcel.writeString(this.type);
        parcel.writeString(this.description);
        List<DevelopmentOfferParameter> list = this.parameters;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((DevelopmentOfferParameter) itA.next()).writeToParcel(parcel, flags);
        }
    }

    public DevelopmentOffer(@l Integer num, @l String str, @l String str2, @l String str3, @l UniversalImage universalImage, @l String str4, @l String str5, @l List<DevelopmentOfferParameter> list) {
        this.id = num;
        this.title = str;
        this.dateTo = str2;
        this.gradient = str3;
        this.universalImage = universalImage;
        this.type = str4;
        this.description = str5;
        this.parameters = list;
    }

    public /* synthetic */ DevelopmentOffer(Integer num, String str, String str2, String str3, UniversalImage universalImage, String str4, String str5, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : universalImage, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5, (i12 & 128) == 0 ? list : null);
    }
}
