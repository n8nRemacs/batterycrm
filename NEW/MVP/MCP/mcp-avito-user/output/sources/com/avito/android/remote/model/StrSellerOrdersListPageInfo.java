package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersListResponse.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/StrSellerOrdersListPageInfo;", "Landroid/os/Parcelable;", "", "pageNumber", "", "hasMore", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/StrSellerOrdersListPageInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getPageNumber", "Ljava/lang/Boolean;", "getHasMore", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrSellerOrdersListPageInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<StrSellerOrdersListPageInfo> CREATOR = new Creator();

    @c("hasMore")
    @l
    private final Boolean hasMore;

    @c("pageNumber")
    @l
    private final Integer pageNumber;

    /* compiled from: StrSellerOrdersListResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrSellerOrdersListPageInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerOrdersListPageInfo createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StrSellerOrdersListPageInfo(numValueOf, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerOrdersListPageInfo[] newArray(int i12) {
            return new StrSellerOrdersListPageInfo[i12];
        }
    }

    public StrSellerOrdersListPageInfo(@l Integer num, @l Boolean bool) {
        this.pageNumber = num;
        this.hasMore = bool;
    }

    public static /* synthetic */ StrSellerOrdersListPageInfo copy$default(StrSellerOrdersListPageInfo strSellerOrdersListPageInfo, Integer num, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = strSellerOrdersListPageInfo.pageNumber;
        }
        if ((i12 & 2) != 0) {
            bool = strSellerOrdersListPageInfo.hasMore;
        }
        return strSellerOrdersListPageInfo.copy(num, bool);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Integer getPageNumber() {
        return this.pageNumber;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @k
    public final StrSellerOrdersListPageInfo copy(@l Integer pageNumber, @l Boolean hasMore) {
        return new StrSellerOrdersListPageInfo(pageNumber, hasMore);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrSellerOrdersListPageInfo)) {
            return false;
        }
        StrSellerOrdersListPageInfo strSellerOrdersListPageInfo = (StrSellerOrdersListPageInfo) other;
        return L.f(this.pageNumber, strSellerOrdersListPageInfo.pageNumber) && L.f(this.hasMore, strSellerOrdersListPageInfo.hasMore);
    }

    @l
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @l
    public final Integer getPageNumber() {
        return this.pageNumber;
    }

    public int hashCode() {
        Integer num = this.pageNumber;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.hasMore;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrSellerOrdersListPageInfo(pageNumber=");
        sb2.append(this.pageNumber);
        sb2.append(", hasMore=");
        return C0.g(sb2, this.hasMore, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.pageNumber;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Boolean bool = this.hasMore;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
