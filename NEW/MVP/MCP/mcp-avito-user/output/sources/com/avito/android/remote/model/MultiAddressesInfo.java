package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.user_address_public.api.AdditionalInfo;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiAddresses.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJD\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b+\u0010\r¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/MultiAddressesInfo;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/user_address_public/api/MultiAddressesItem;", "addresses", "Lcom/avito/android/user_address_public/api/AdditionalInfo;", "additionalInfo", "showMapButtonTitle", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/user_address_public/api/AdditionalInfo;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/user_address_public/api/AdditionalInfo;", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/user_address_public/api/AdditionalInfo;Ljava/lang/String;)Lcom/avito/android/remote/model/MultiAddressesInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getAddresses", "Lcom/avito/android/user_address_public/api/AdditionalInfo;", "getAdditionalInfo", "getShowMapButtonTitle", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MultiAddressesInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<MultiAddressesInfo> CREATOR = new Creator();

    @c("additionalInfo")
    @l
    private final AdditionalInfo additionalInfo;

    @c("addresses")
    @k
    private final List<MultiAddressesItem> addresses;

    @c("showMapButtonTitle")
    @l
    private final String showMapButtonTitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: MultiAddresses.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MultiAddressesInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultiAddressesInfo createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(MultiAddressesInfo.class, parcel, arrayList, iL2, 1);
            }
            return new MultiAddressesInfo(string, arrayList, (AdditionalInfo) parcel.readParcelable(MultiAddressesInfo.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultiAddressesInfo[] newArray(int i12) {
            return new MultiAddressesInfo[i12];
        }
    }

    public MultiAddressesInfo(@l String str, @k List<MultiAddressesItem> list, @l AdditionalInfo additionalInfo, @l String str2) {
        this.title = str;
        this.addresses = list;
        this.additionalInfo = additionalInfo;
        this.showMapButtonTitle = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiAddressesInfo copy$default(MultiAddressesInfo multiAddressesInfo, String str, List list, AdditionalInfo additionalInfo, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = multiAddressesInfo.title;
        }
        if ((i12 & 2) != 0) {
            list = multiAddressesInfo.addresses;
        }
        if ((i12 & 4) != 0) {
            additionalInfo = multiAddressesInfo.additionalInfo;
        }
        if ((i12 & 8) != 0) {
            str2 = multiAddressesInfo.showMapButtonTitle;
        }
        return multiAddressesInfo.copy(str, list, additionalInfo, str2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final List<MultiAddressesItem> component2() {
        return this.addresses;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getShowMapButtonTitle() {
        return this.showMapButtonTitle;
    }

    @k
    public final MultiAddressesInfo copy(@l String title, @k List<MultiAddressesItem> addresses, @l AdditionalInfo additionalInfo, @l String showMapButtonTitle) {
        return new MultiAddressesInfo(title, addresses, additionalInfo, showMapButtonTitle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiAddressesInfo)) {
            return false;
        }
        MultiAddressesInfo multiAddressesInfo = (MultiAddressesInfo) other;
        return L.f(this.title, multiAddressesInfo.title) && L.f(this.addresses, multiAddressesInfo.addresses) && L.f(this.additionalInfo, multiAddressesInfo.additionalInfo) && L.f(this.showMapButtonTitle, multiAddressesInfo.showMapButtonTitle);
    }

    @l
    public final AdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    @k
    public final List<MultiAddressesItem> getAddresses() {
        return this.addresses;
    }

    @l
    public final String getShowMapButtonTitle() {
        return this.showMapButtonTitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iE2 = H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.addresses);
        AdditionalInfo additionalInfo = this.additionalInfo;
        int iHashCode = (iE2 + (additionalInfo == null ? 0 : additionalInfo.hashCode())) * 31;
        String str2 = this.showMapButtonTitle;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MultiAddressesInfo(title=");
        sb2.append(this.title);
        sb2.append(", addresses=");
        sb2.append(this.addresses);
        sb2.append(", additionalInfo=");
        sb2.append(this.additionalInfo);
        sb2.append(", showMapButtonTitle=");
        return C22026a.c(sb2, this.showMapButtonTitle, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.addresses, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        parcel.writeParcelable(this.additionalInfo, flags);
        parcel.writeString(this.showMapButtonTitle);
    }
}
