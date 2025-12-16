package com.avito.android.remote.model.carousel_items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CarouselItemsResult.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/carousel_items/CarouselItemsResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/SerpElement;", "items", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "<init>", "(Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/carousel_items/CarouselItemsResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getItems", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CarouselItemsResult implements Parcelable {

    @k
    public static final Parcelable.Creator<CarouselItemsResult> CREATOR = new Creator();

    @c("items")
    @k
    private final List<SerpElement> items;

    @c("titleActionUri")
    @l
    private final DeepLink link;

    /* compiled from: CarouselItemsResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CarouselItemsResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CarouselItemsResult createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(CarouselItemsResult.class, parcel, arrayList, iL2, 1);
            }
            return new CarouselItemsResult(arrayList, (DeepLink) parcel.readParcelable(CarouselItemsResult.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CarouselItemsResult[] newArray(int i12) {
            return new CarouselItemsResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CarouselItemsResult(@k List<? extends SerpElement> list, @l DeepLink deepLink) {
        this.items = list;
        this.link = deepLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CarouselItemsResult copy$default(CarouselItemsResult carouselItemsResult, List list, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = carouselItemsResult.items;
        }
        if ((i12 & 2) != 0) {
            deepLink = carouselItemsResult.link;
        }
        return carouselItemsResult.copy(list, deepLink);
    }

    @k
    public final List<SerpElement> component1() {
        return this.items;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeepLink getLink() {
        return this.link;
    }

    @k
    public final CarouselItemsResult copy(@k List<? extends SerpElement> items, @l DeepLink link) {
        return new CarouselItemsResult(items, link);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselItemsResult)) {
            return false;
        }
        CarouselItemsResult carouselItemsResult = (CarouselItemsResult) other;
        return L.f(this.items, carouselItemsResult.items) && L.f(this.link, carouselItemsResult.link);
    }

    @k
    public final List<SerpElement> getItems() {
        return this.items;
    }

    @l
    public final DeepLink getLink() {
        return this.link;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        DeepLink deepLink = this.link;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CarouselItemsResult(items=");
        sb2.append(this.items);
        sb2.append(", link=");
        return a.v(sb2, this.link, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        parcel.writeParcelable(this.link, flags);
    }
}
