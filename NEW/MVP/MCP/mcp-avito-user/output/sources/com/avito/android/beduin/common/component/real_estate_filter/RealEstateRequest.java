package com.avito.android.beduin.common.component.real_estate_filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRealEstateFilterModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017Jj\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u0014R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u0017R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b3\u0010\u0017¨\u00064"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequest;", "Landroid/os/Parcelable;", "", "path", "pageId", "session", "", "limit", "offset", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onLoadingActions", "onFailActions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequest;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPath", "getPageId", "getSession", "Ljava/lang/Integer;", "getLimit", "getOffset", "Ljava/util/List;", "getOnLoadingActions", "getOnFailActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RealEstateRequest implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RealEstateRequest> CREATOR = new a();

    @Y61.l
    private final Integer limit;

    @Y61.l
    private final Integer offset;

    @Y61.l
    private final List<BeduinAction> onFailActions;

    @Y61.l
    private final List<BeduinAction> onLoadingActions;

    @Y61.k
    private final String pageId;

    @Y61.k
    private final String path;

    @Y61.k
    private final String session;

    /* compiled from: BeduinRealEstateFilterModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealEstateRequest> {
        @Override // android.os.Parcelable.Creator
        public final RealEstateRequest createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList arrayList2 = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(RealEstateRequest.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(RealEstateRequest.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new RealEstateRequest(string, string2, string3, numValueOf, numValueOf2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final RealEstateRequest[] newArray(int i12) {
            return new RealEstateRequest[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealEstateRequest(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l List<? extends BeduinAction> list, @Y61.l List<? extends BeduinAction> list2) {
        this.path = str;
        this.pageId = str2;
        this.session = str3;
        this.limit = num;
        this.offset = num2;
        this.onLoadingActions = list;
        this.onFailActions = list2;
    }

    public static /* synthetic */ RealEstateRequest copy$default(RealEstateRequest realEstateRequest, String str, String str2, String str3, Integer num, Integer num2, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = realEstateRequest.path;
        }
        if ((i12 & 2) != 0) {
            str2 = realEstateRequest.pageId;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = realEstateRequest.session;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            num = realEstateRequest.limit;
        }
        Integer num3 = num;
        if ((i12 & 16) != 0) {
            num2 = realEstateRequest.offset;
        }
        Integer num4 = num2;
        if ((i12 & 32) != 0) {
            list = realEstateRequest.onLoadingActions;
        }
        List list3 = list;
        if ((i12 & 64) != 0) {
            list2 = realEstateRequest.onFailActions;
        }
        return realEstateRequest.copy(str, str4, str5, num3, num4, list3, list2);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    @Y61.k
    /* renamed from: component3, reason: from getter */
    public final String getSession() {
        return this.session;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    @Y61.l
    /* renamed from: component5, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    @Y61.l
    public final List<BeduinAction> component6() {
        return this.onLoadingActions;
    }

    @Y61.l
    public final List<BeduinAction> component7() {
        return this.onFailActions;
    }

    @Y61.k
    public final RealEstateRequest copy(@Y61.k String path, @Y61.k String pageId, @Y61.k String session, @Y61.l Integer limit, @Y61.l Integer offset, @Y61.l List<? extends BeduinAction> onLoadingActions, @Y61.l List<? extends BeduinAction> onFailActions) {
        return new RealEstateRequest(path, pageId, session, limit, offset, onLoadingActions, onFailActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealEstateRequest)) {
            return false;
        }
        RealEstateRequest realEstateRequest = (RealEstateRequest) other;
        return L.f(this.path, realEstateRequest.path) && L.f(this.pageId, realEstateRequest.pageId) && L.f(this.session, realEstateRequest.session) && L.f(this.limit, realEstateRequest.limit) && L.f(this.offset, realEstateRequest.offset) && L.f(this.onLoadingActions, realEstateRequest.onLoadingActions) && L.f(this.onFailActions, realEstateRequest.onFailActions);
    }

    @Y61.l
    public final Integer getLimit() {
        return this.limit;
    }

    @Y61.l
    public final Integer getOffset() {
        return this.offset;
    }

    @Y61.l
    public final List<BeduinAction> getOnFailActions() {
        return this.onFailActions;
    }

    @Y61.l
    public final List<BeduinAction> getOnLoadingActions() {
        return this.onLoadingActions;
    }

    @Y61.k
    public final String getPageId() {
        return this.pageId;
    }

    @Y61.k
    public final String getPath() {
        return this.path;
    }

    @Y61.k
    public final String getSession() {
        return this.session;
    }

    public int hashCode() {
        int iD2 = H.d(H.d(this.path.hashCode() * 31, 31, this.pageId), 31, this.session);
        Integer num = this.limit;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.offset;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<BeduinAction> list = this.onLoadingActions;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.onFailActions;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RealEstateRequest(path=");
        sb2.append(this.path);
        sb2.append(", pageId=");
        sb2.append(this.pageId);
        sb2.append(", session=");
        sb2.append(this.session);
        sb2.append(", limit=");
        sb2.append(this.limit);
        sb2.append(", offset=");
        sb2.append(this.offset);
        sb2.append(", onLoadingActions=");
        sb2.append(this.onLoadingActions);
        sb2.append(", onFailActions=");
        return H.p(sb2, this.onFailActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.path);
        parcel.writeString(this.pageId);
        parcel.writeString(this.session);
        Integer num = this.limit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.offset;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        List<BeduinAction> list = this.onLoadingActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.onFailActions;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }
}
