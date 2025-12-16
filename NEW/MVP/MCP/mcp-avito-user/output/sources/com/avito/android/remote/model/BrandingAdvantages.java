package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BrandingAdvantages.kt */
@d
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/BrandingAdvantages;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/BrandingAdvantagesDescription;", "description", "", "Lcom/avito/android/remote/model/BrandingAdvantagesItem;", "items", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/BrandingAdvantagesDescription;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/BrandingAdvantagesDescription;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/BrandingAdvantagesDescription;Ljava/util/List;)Lcom/avito/android/remote/model/BrandingAdvantages;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/BrandingAdvantagesDescription;", "getDescription", "Ljava/util/List;", "getItems", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BrandingAdvantages implements Parcelable {

    @k
    public static final Parcelable.Creator<BrandingAdvantages> CREATOR = new Creator();

    @l
    private final BrandingAdvantagesDescription description;

    @l
    private final List<BrandingAdvantagesItem> items;

    @k
    private final String title;

    /* compiled from: BrandingAdvantages.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BrandingAdvantages> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BrandingAdvantages createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            ArrayList arrayList = null;
            BrandingAdvantagesDescription brandingAdvantagesDescriptionCreateFromParcel = parcel.readInt() == 0 ? null : BrandingAdvantagesDescription.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(BrandingAdvantagesItem.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new BrandingAdvantages(string, brandingAdvantagesDescriptionCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BrandingAdvantages[] newArray(int i12) {
            return new BrandingAdvantages[i12];
        }
    }

    public BrandingAdvantages(@k String str, @l BrandingAdvantagesDescription brandingAdvantagesDescription, @l List<BrandingAdvantagesItem> list) {
        this.title = str;
        this.description = brandingAdvantagesDescription;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BrandingAdvantages copy$default(BrandingAdvantages brandingAdvantages, String str, BrandingAdvantagesDescription brandingAdvantagesDescription, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = brandingAdvantages.title;
        }
        if ((i12 & 2) != 0) {
            brandingAdvantagesDescription = brandingAdvantages.description;
        }
        if ((i12 & 4) != 0) {
            list = brandingAdvantages.items;
        }
        return brandingAdvantages.copy(str, brandingAdvantagesDescription, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final BrandingAdvantagesDescription getDescription() {
        return this.description;
    }

    @l
    public final List<BrandingAdvantagesItem> component3() {
        return this.items;
    }

    @k
    public final BrandingAdvantages copy(@k String title, @l BrandingAdvantagesDescription description, @l List<BrandingAdvantagesItem> items) {
        return new BrandingAdvantages(title, description, items);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandingAdvantages)) {
            return false;
        }
        BrandingAdvantages brandingAdvantages = (BrandingAdvantages) other;
        return L.f(this.title, brandingAdvantages.title) && L.f(this.description, brandingAdvantages.description) && L.f(this.items, brandingAdvantages.items);
    }

    @l
    public final BrandingAdvantagesDescription getDescription() {
        return this.description;
    }

    @l
    public final List<BrandingAdvantagesItem> getItems() {
        return this.items;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        BrandingAdvantagesDescription brandingAdvantagesDescription = this.description;
        int iHashCode2 = (iHashCode + (brandingAdvantagesDescription == null ? 0 : brandingAdvantagesDescription.hashCode())) * 31;
        List<BrandingAdvantagesItem> list = this.items;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BrandingAdvantages(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", items=");
        return H.p(sb2, this.items, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        BrandingAdvantagesDescription brandingAdvantagesDescription = this.description;
        if (brandingAdvantagesDescription == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            brandingAdvantagesDescription.writeToParcel(parcel, flags);
        }
        List<BrandingAdvantagesItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((BrandingAdvantagesItem) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
