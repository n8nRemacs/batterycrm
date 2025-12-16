package com.avito.android.remote.model.gig;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigShifts.kt */
@d
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b+\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0013¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/gig/GigShiftItem;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/gig/GigNavigationItem;", "navigation", "Lcom/avito/android/remote/model/gig/GigSeller;", "seller", "", "duties", "Lcom/avito/android/remote/model/gig/GigShiftPersonalInfo;", "personalInfo", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/gig/GigSeller;Ljava/util/List;Lcom/avito/android/remote/model/gig/GigShiftPersonalInfo;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/gig/GigSeller;", "component3", "component4", "()Lcom/avito/android/remote/model/gig/GigShiftPersonalInfo;", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/gig/GigSeller;Ljava/util/List;Lcom/avito/android/remote/model/gig/GigShiftPersonalInfo;)Lcom/avito/android/remote/model/gig/GigShiftItem;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getNavigation", "Lcom/avito/android/remote/model/gig/GigSeller;", "getSeller", "getDuties", "Lcom/avito/android/remote/model/gig/GigShiftPersonalInfo;", "getPersonalInfo", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GigShiftItem implements Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftItem> CREATOR = new Creator();

    @c("duties")
    @k
    private final List<String> duties;

    @c("navigation")
    @k
    private final List<GigNavigationItem> navigation;

    @c("personalV2")
    @l
    private final GigShiftPersonalInfo personalInfo;

    @c("seller")
    @k
    private final GigSeller seller;

    /* compiled from: GigShifts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GigShiftItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GigShiftItem createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(GigNavigationItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new GigShiftItem(arrayList, GigSeller.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : GigShiftPersonalInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GigShiftItem[] newArray(int i12) {
            return new GigShiftItem[i12];
        }
    }

    public GigShiftItem(@k List<GigNavigationItem> list, @k GigSeller gigSeller, @k List<String> list2, @l GigShiftPersonalInfo gigShiftPersonalInfo) {
        this.navigation = list;
        this.seller = gigSeller;
        this.duties = list2;
        this.personalInfo = gigShiftPersonalInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GigShiftItem copy$default(GigShiftItem gigShiftItem, List list, GigSeller gigSeller, List list2, GigShiftPersonalInfo gigShiftPersonalInfo, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = gigShiftItem.navigation;
        }
        if ((i12 & 2) != 0) {
            gigSeller = gigShiftItem.seller;
        }
        if ((i12 & 4) != 0) {
            list2 = gigShiftItem.duties;
        }
        if ((i12 & 8) != 0) {
            gigShiftPersonalInfo = gigShiftItem.personalInfo;
        }
        return gigShiftItem.copy(list, gigSeller, list2, gigShiftPersonalInfo);
    }

    @k
    public final List<GigNavigationItem> component1() {
        return this.navigation;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final GigSeller getSeller() {
        return this.seller;
    }

    @k
    public final List<String> component3() {
        return this.duties;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final GigShiftPersonalInfo getPersonalInfo() {
        return this.personalInfo;
    }

    @k
    public final GigShiftItem copy(@k List<GigNavigationItem> navigation2, @k GigSeller seller, @k List<String> duties, @l GigShiftPersonalInfo personalInfo) {
        return new GigShiftItem(navigation2, seller, duties, personalInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GigShiftItem)) {
            return false;
        }
        GigShiftItem gigShiftItem = (GigShiftItem) other;
        return L.f(this.navigation, gigShiftItem.navigation) && L.f(this.seller, gigShiftItem.seller) && L.f(this.duties, gigShiftItem.duties) && L.f(this.personalInfo, gigShiftItem.personalInfo);
    }

    @k
    public final List<String> getDuties() {
        return this.duties;
    }

    @k
    public final List<GigNavigationItem> getNavigation() {
        return this.navigation;
    }

    @l
    public final GigShiftPersonalInfo getPersonalInfo() {
        return this.personalInfo;
    }

    @k
    public final GigSeller getSeller() {
        return this.seller;
    }

    public int hashCode() {
        int iE2 = H.e((this.seller.hashCode() + (this.navigation.hashCode() * 31)) * 31, 31, this.duties);
        GigShiftPersonalInfo gigShiftPersonalInfo = this.personalInfo;
        return iE2 + (gigShiftPersonalInfo == null ? 0 : gigShiftPersonalInfo.hashCode());
    }

    @k
    public String toString() {
        return "GigShiftItem(navigation=" + this.navigation + ", seller=" + this.seller + ", duties=" + this.duties + ", personalInfo=" + this.personalInfo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.navigation, parcel);
        while (itJ.hasNext()) {
            ((GigNavigationItem) itJ.next()).writeToParcel(parcel, flags);
        }
        this.seller.writeToParcel(parcel, flags);
        parcel.writeStringList(this.duties);
        GigShiftPersonalInfo gigShiftPersonalInfo = this.personalInfo;
        if (gigShiftPersonalInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gigShiftPersonalInfo.writeToParcel(parcel, flags);
        }
    }
}
