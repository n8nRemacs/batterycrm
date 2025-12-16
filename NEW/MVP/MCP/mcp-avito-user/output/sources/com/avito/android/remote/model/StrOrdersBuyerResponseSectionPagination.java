package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersBuyerResponse.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionPagination;", "Landroid/os/Parcelable;", "", "hasMore", "", "limit", "page", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionPagination;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getHasMore", "Ljava/lang/Integer;", "getLimit", "getPage", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrOrdersBuyerResponseSectionPagination implements Parcelable {

    @k
    public static final Parcelable.Creator<StrOrdersBuyerResponseSectionPagination> CREATOR = new Creator();

    @c("hasMore")
    @l
    private final Boolean hasMore;

    @c("limit")
    @l
    private final Integer limit;

    @c("page")
    @l
    private final Integer page;

    /* compiled from: StrOrdersBuyerResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrOrdersBuyerResponseSectionPagination> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrOrdersBuyerResponseSectionPagination createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StrOrdersBuyerResponseSectionPagination(boolValueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrOrdersBuyerResponseSectionPagination[] newArray(int i12) {
            return new StrOrdersBuyerResponseSectionPagination[i12];
        }
    }

    public StrOrdersBuyerResponseSectionPagination(@l Boolean bool, @l Integer num, @l Integer num2) {
        this.hasMore = bool;
        this.limit = num;
        this.page = num2;
    }

    public static /* synthetic */ StrOrdersBuyerResponseSectionPagination copy$default(StrOrdersBuyerResponseSectionPagination strOrdersBuyerResponseSectionPagination, Boolean bool, Integer num, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bool = strOrdersBuyerResponseSectionPagination.hasMore;
        }
        if ((i12 & 2) != 0) {
            num = strOrdersBuyerResponseSectionPagination.limit;
        }
        if ((i12 & 4) != 0) {
            num2 = strOrdersBuyerResponseSectionPagination.page;
        }
        return strOrdersBuyerResponseSectionPagination.copy(bool, num, num2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getPage() {
        return this.page;
    }

    @k
    public final StrOrdersBuyerResponseSectionPagination copy(@l Boolean hasMore, @l Integer limit, @l Integer page) {
        return new StrOrdersBuyerResponseSectionPagination(hasMore, limit, page);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrOrdersBuyerResponseSectionPagination)) {
            return false;
        }
        StrOrdersBuyerResponseSectionPagination strOrdersBuyerResponseSectionPagination = (StrOrdersBuyerResponseSectionPagination) other;
        return L.f(this.hasMore, strOrdersBuyerResponseSectionPagination.hasMore) && L.f(this.limit, strOrdersBuyerResponseSectionPagination.limit) && L.f(this.page, strOrdersBuyerResponseSectionPagination.page);
    }

    @l
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @l
    public final Integer getLimit() {
        return this.limit;
    }

    @l
    public final Integer getPage() {
        return this.page;
    }

    public int hashCode() {
        Boolean bool = this.hasMore;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.limit;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.page;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersBuyerResponseSectionPagination(hasMore=");
        sb2.append(this.hasMore);
        sb2.append(", limit=");
        sb2.append(this.limit);
        sb2.append(", page=");
        return s.j(sb2, this.page, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.hasMore;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Integer num = this.limit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.page;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
    }
}
