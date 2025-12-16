package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.advert_details.realty.DevelopmentsAdvice;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoritesResult.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011JB\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b+\u0010\u0011¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/FavoritesResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/FavoriteElement;", "items", "Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdvice;", "developmentsAdvice", "", "nextPage", "xHash", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdvice;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdvice;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdvice;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/FavoritesResult;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getItems", "Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdvice;", "getDevelopmentsAdvice", "Ljava/lang/String;", "getNextPage", "getXHash", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FavoritesResult implements Parcelable {

    @k
    public static final Parcelable.Creator<FavoritesResult> CREATOR = new Creator();

    @c("developmentsAdvice")
    @l
    private final DevelopmentsAdvice developmentsAdvice;

    @c("items")
    @k
    private final List<FavoriteElement> items;

    @c("nextPage")
    @l
    private final String nextPage;

    @c("xHash")
    @k
    private final String xHash;

    /* compiled from: FavoritesResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavoritesResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoritesResult createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(FavoritesResult.class, parcel, arrayList, iL2, 1);
            }
            return new FavoritesResult(arrayList, (DevelopmentsAdvice) parcel.readParcelable(FavoritesResult.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoritesResult[] newArray(int i12) {
            return new FavoritesResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FavoritesResult(@k List<? extends FavoriteElement> list, @l DevelopmentsAdvice developmentsAdvice, @l String str, @k String str2) {
        this.items = list;
        this.developmentsAdvice = developmentsAdvice;
        this.nextPage = str;
        this.xHash = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoritesResult copy$default(FavoritesResult favoritesResult, List list, DevelopmentsAdvice developmentsAdvice, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = favoritesResult.items;
        }
        if ((i12 & 2) != 0) {
            developmentsAdvice = favoritesResult.developmentsAdvice;
        }
        if ((i12 & 4) != 0) {
            str = favoritesResult.nextPage;
        }
        if ((i12 & 8) != 0) {
            str2 = favoritesResult.xHash;
        }
        return favoritesResult.copy(list, developmentsAdvice, str, str2);
    }

    @k
    public final List<FavoriteElement> component1() {
        return this.items;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DevelopmentsAdvice getDevelopmentsAdvice() {
        return this.developmentsAdvice;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getNextPage() {
        return this.nextPage;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getXHash() {
        return this.xHash;
    }

    @k
    public final FavoritesResult copy(@k List<? extends FavoriteElement> items, @l DevelopmentsAdvice developmentsAdvice, @l String nextPage, @k String xHash) {
        return new FavoritesResult(items, developmentsAdvice, nextPage, xHash);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoritesResult)) {
            return false;
        }
        FavoritesResult favoritesResult = (FavoritesResult) other;
        return L.f(this.items, favoritesResult.items) && L.f(this.developmentsAdvice, favoritesResult.developmentsAdvice) && L.f(this.nextPage, favoritesResult.nextPage) && L.f(this.xHash, favoritesResult.xHash);
    }

    @l
    public final DevelopmentsAdvice getDevelopmentsAdvice() {
        return this.developmentsAdvice;
    }

    @k
    public final List<FavoriteElement> getItems() {
        return this.items;
    }

    @l
    public final String getNextPage() {
        return this.nextPage;
    }

    @k
    public final String getXHash() {
        return this.xHash;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        DevelopmentsAdvice developmentsAdvice = this.developmentsAdvice;
        int iHashCode2 = (iHashCode + (developmentsAdvice == null ? 0 : developmentsAdvice.hashCode())) * 31;
        String str = this.nextPage;
        return this.xHash.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FavoritesResult(items=");
        sb2.append(this.items);
        sb2.append(", developmentsAdvice=");
        sb2.append(this.developmentsAdvice);
        sb2.append(", nextPage=");
        sb2.append(this.nextPage);
        sb2.append(", xHash=");
        return C22026a.c(sb2, this.xHash, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        parcel.writeParcelable(this.developmentsAdvice, flags);
        parcel.writeString(this.nextPage);
        parcel.writeString(this.xHash);
    }
}
