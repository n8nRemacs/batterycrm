package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersListBody.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/StrOrdersListSectionBody;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/StrOrdersListPageInfoBody;", "pageInfo", "", "selectedFilterIds", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/StrOrdersListPageInfoBody;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/StrOrdersListPageInfoBody;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/StrOrdersListPageInfoBody;Ljava/util/List;)Lcom/avito/android/remote/model/StrOrdersListSectionBody;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/StrOrdersListPageInfoBody;", "getPageInfo", "Ljava/util/List;", "getSelectedFilterIds", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrOrdersListSectionBody implements Parcelable {

    @k
    public static final Parcelable.Creator<StrOrdersListSectionBody> CREATOR = new Creator();

    @c("id")
    @k
    private final String id;

    @c("pageInfo")
    @k
    private final StrOrdersListPageInfoBody pageInfo;

    @c("selectedFilterIds")
    @k
    private final List<String> selectedFilterIds;

    /* compiled from: StrOrdersListBody.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrOrdersListSectionBody> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrOrdersListSectionBody createFromParcel(@k Parcel parcel) {
            return new StrOrdersListSectionBody(parcel.readString(), StrOrdersListPageInfoBody.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrOrdersListSectionBody[] newArray(int i12) {
            return new StrOrdersListSectionBody[i12];
        }
    }

    public StrOrdersListSectionBody(@k String str, @k StrOrdersListPageInfoBody strOrdersListPageInfoBody, @k List<String> list) {
        this.id = str;
        this.pageInfo = strOrdersListPageInfoBody;
        this.selectedFilterIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrOrdersListSectionBody copy$default(StrOrdersListSectionBody strOrdersListSectionBody, String str, StrOrdersListPageInfoBody strOrdersListPageInfoBody, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = strOrdersListSectionBody.id;
        }
        if ((i12 & 2) != 0) {
            strOrdersListPageInfoBody = strOrdersListSectionBody.pageInfo;
        }
        if ((i12 & 4) != 0) {
            list = strOrdersListSectionBody.selectedFilterIds;
        }
        return strOrdersListSectionBody.copy(str, strOrdersListPageInfoBody, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final StrOrdersListPageInfoBody getPageInfo() {
        return this.pageInfo;
    }

    @k
    public final List<String> component3() {
        return this.selectedFilterIds;
    }

    @k
    public final StrOrdersListSectionBody copy(@k String id2, @k StrOrdersListPageInfoBody pageInfo, @k List<String> selectedFilterIds) {
        return new StrOrdersListSectionBody(id2, pageInfo, selectedFilterIds);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrOrdersListSectionBody)) {
            return false;
        }
        StrOrdersListSectionBody strOrdersListSectionBody = (StrOrdersListSectionBody) other;
        return L.f(this.id, strOrdersListSectionBody.id) && L.f(this.pageInfo, strOrdersListSectionBody.pageInfo) && L.f(this.selectedFilterIds, strOrdersListSectionBody.selectedFilterIds);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final StrOrdersListPageInfoBody getPageInfo() {
        return this.pageInfo;
    }

    @k
    public final List<String> getSelectedFilterIds() {
        return this.selectedFilterIds;
    }

    public int hashCode() {
        return this.selectedFilterIds.hashCode() + ((this.pageInfo.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersListSectionBody(id=");
        sb2.append(this.id);
        sb2.append(", pageInfo=");
        sb2.append(this.pageInfo);
        sb2.append(", selectedFilterIds=");
        return H.p(sb2, this.selectedFilterIds, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        this.pageInfo.writeToParcel(parcel, flags);
        parcel.writeStringList(this.selectedFilterIds);
    }
}
