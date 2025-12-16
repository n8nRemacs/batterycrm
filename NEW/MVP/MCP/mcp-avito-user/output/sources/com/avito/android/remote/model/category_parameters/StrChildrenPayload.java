package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrPayload.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JL\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0012¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/StrChildrenPayload;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/category_parameters/StrAgeVariant;", "fromAges", "toAges", "", "addButtonTitle", "Lcom/avito/android/remote/model/category_parameters/StrExtraGuestTitleVariants;", "extraGuestTitleVariants", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/StrExtraGuestTitleVariants;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/avito/android/remote/model/category_parameters/StrExtraGuestTitleVariants;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/StrExtraGuestTitleVariants;)Lcom/avito/android/remote/model/category_parameters/StrChildrenPayload;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getFromAges", "getToAges", "Ljava/lang/String;", "getAddButtonTitle", "Lcom/avito/android/remote/model/category_parameters/StrExtraGuestTitleVariants;", "getExtraGuestTitleVariants", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrChildrenPayload implements Parcelable {

    @k
    public static final Parcelable.Creator<StrChildrenPayload> CREATOR = new Creator();

    @c("addButtonTitle")
    @l
    private final String addButtonTitle;

    @c("extraGuestFeeTitle")
    @l
    private final StrExtraGuestTitleVariants extraGuestTitleVariants;

    @c("fromAges")
    @l
    private final List<StrAgeVariant> fromAges;

    @c("toAges")
    @l
    private final List<StrAgeVariant> toAges;

    /* compiled from: StrPayload.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrChildrenPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrChildrenPayload createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(StrAgeVariant.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(StrAgeVariant.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new StrChildrenPayload(arrayList, arrayList2, parcel.readString(), parcel.readInt() != 0 ? StrExtraGuestTitleVariants.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrChildrenPayload[] newArray(int i12) {
            return new StrChildrenPayload[i12];
        }
    }

    public StrChildrenPayload(@l List<StrAgeVariant> list, @l List<StrAgeVariant> list2, @l String str, @l StrExtraGuestTitleVariants strExtraGuestTitleVariants) {
        this.fromAges = list;
        this.toAges = list2;
        this.addButtonTitle = str;
        this.extraGuestTitleVariants = strExtraGuestTitleVariants;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrChildrenPayload copy$default(StrChildrenPayload strChildrenPayload, List list, List list2, String str, StrExtraGuestTitleVariants strExtraGuestTitleVariants, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = strChildrenPayload.fromAges;
        }
        if ((i12 & 2) != 0) {
            list2 = strChildrenPayload.toAges;
        }
        if ((i12 & 4) != 0) {
            str = strChildrenPayload.addButtonTitle;
        }
        if ((i12 & 8) != 0) {
            strExtraGuestTitleVariants = strChildrenPayload.extraGuestTitleVariants;
        }
        return strChildrenPayload.copy(list, list2, str, strExtraGuestTitleVariants);
    }

    @l
    public final List<StrAgeVariant> component1() {
        return this.fromAges;
    }

    @l
    public final List<StrAgeVariant> component2() {
        return this.toAges;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getAddButtonTitle() {
        return this.addButtonTitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final StrExtraGuestTitleVariants getExtraGuestTitleVariants() {
        return this.extraGuestTitleVariants;
    }

    @k
    public final StrChildrenPayload copy(@l List<StrAgeVariant> fromAges, @l List<StrAgeVariant> toAges, @l String addButtonTitle, @l StrExtraGuestTitleVariants extraGuestTitleVariants) {
        return new StrChildrenPayload(fromAges, toAges, addButtonTitle, extraGuestTitleVariants);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrChildrenPayload)) {
            return false;
        }
        StrChildrenPayload strChildrenPayload = (StrChildrenPayload) other;
        return L.f(this.fromAges, strChildrenPayload.fromAges) && L.f(this.toAges, strChildrenPayload.toAges) && L.f(this.addButtonTitle, strChildrenPayload.addButtonTitle) && L.f(this.extraGuestTitleVariants, strChildrenPayload.extraGuestTitleVariants);
    }

    @l
    public final String getAddButtonTitle() {
        return this.addButtonTitle;
    }

    @l
    public final StrExtraGuestTitleVariants getExtraGuestTitleVariants() {
        return this.extraGuestTitleVariants;
    }

    @l
    public final List<StrAgeVariant> getFromAges() {
        return this.fromAges;
    }

    @l
    public final List<StrAgeVariant> getToAges() {
        return this.toAges;
    }

    public int hashCode() {
        List<StrAgeVariant> list = this.fromAges;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<StrAgeVariant> list2 = this.toAges;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.addButtonTitle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        StrExtraGuestTitleVariants strExtraGuestTitleVariants = this.extraGuestTitleVariants;
        return iHashCode3 + (strExtraGuestTitleVariants != null ? strExtraGuestTitleVariants.hashCode() : 0);
    }

    @k
    public String toString() {
        return "StrChildrenPayload(fromAges=" + this.fromAges + ", toAges=" + this.toAges + ", addButtonTitle=" + this.addButtonTitle + ", extraGuestTitleVariants=" + this.extraGuestTitleVariants + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<StrAgeVariant> list = this.fromAges;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((StrAgeVariant) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<StrAgeVariant> list2 = this.toAges;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((StrAgeVariant) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.addButtonTitle);
        StrExtraGuestTitleVariants strExtraGuestTitleVariants = this.extraGuestTitleVariants;
        if (strExtraGuestTitleVariants == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strExtraGuestTitleVariants.writeToParcel(parcel, flags);
        }
    }
}
