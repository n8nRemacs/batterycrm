package com.avito.android.comfortable_deal.end_deal.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.comfortable_deal.commission_details.model.CommissionDetailsDialogArguments;
import com.avito.android.comfortable_deal.common.view.CommissionData;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EndDealSavedState.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/model/EndDealSavedState;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EndDealSavedState implements Parcelable {

    @k
    public static final Parcelable.Creator<EndDealSavedState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final CommissionData f122279b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final CommissionDetailsDialogArguments f122280c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Map<String, EndDealField> f122281d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f122282e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final CommissionInfo f122283f;

    /* compiled from: EndDealSavedState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EndDealSavedState> {
        @Override // android.os.Parcelable.Creator
        public final EndDealSavedState createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            CommissionData commissionDataCreateFromParcel = parcel.readInt() == 0 ? null : CommissionData.CREATOR.createFromParcel(parcel);
            CommissionDetailsDialogArguments commissionDetailsDialogArgumentsCreateFromParcel = parcel.readInt() == 0 ? null : CommissionDetailsDialogArguments.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = f.c(EndDealSavedState.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new EndDealSavedState(commissionDataCreateFromParcel, commissionDetailsDialogArgumentsCreateFromParcel, linkedHashMap, (AttributedText) parcel.readParcelable(EndDealSavedState.class.getClassLoader()), parcel.readInt() != 0 ? CommissionInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final EndDealSavedState[] newArray(int i12) {
            return new EndDealSavedState[i12];
        }
    }

    public EndDealSavedState() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndDealSavedState)) {
            return false;
        }
        EndDealSavedState endDealSavedState = (EndDealSavedState) obj;
        return L.f(this.f122279b, endDealSavedState.f122279b) && L.f(this.f122280c, endDealSavedState.f122280c) && L.f(this.f122281d, endDealSavedState.f122281d) && L.f(this.f122282e, endDealSavedState.f122282e) && L.f(this.f122283f, endDealSavedState.f122283f);
    }

    public final int hashCode() {
        CommissionData commissionData = this.f122279b;
        int iHashCode = (commissionData == null ? 0 : commissionData.hashCode()) * 31;
        CommissionDetailsDialogArguments commissionDetailsDialogArguments = this.f122280c;
        int iHashCode2 = (iHashCode + (commissionDetailsDialogArguments == null ? 0 : commissionDetailsDialogArguments.hashCode())) * 31;
        Map<String, EndDealField> map = this.f122281d;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        AttributedText attributedText = this.f122282e;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        CommissionInfo commissionInfo = this.f122283f;
        return iHashCode4 + (commissionInfo != null ? commissionInfo.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "EndDealSavedState(commissionData=" + this.f122279b + ", dialogArguments=" + this.f122280c + ", fields=" + this.f122281d + ", title=" + this.f122282e + ", commissionInfo=" + this.f122283f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        CommissionData commissionData = this.f122279b;
        if (commissionData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commissionData.writeToParcel(parcel, i12);
        }
        CommissionDetailsDialogArguments commissionDetailsDialogArguments = this.f122280c;
        if (commissionDetailsDialogArguments == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commissionDetailsDialogArguments.writeToParcel(parcel, i12);
        }
        Map<String, EndDealField> map = this.f122281d;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeParcelable((Parcelable) entry.getValue(), i12);
            }
        }
        parcel.writeParcelable(this.f122282e, i12);
        CommissionInfo commissionInfo = this.f122283f;
        if (commissionInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commissionInfo.writeToParcel(parcel, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EndDealSavedState(@l CommissionData commissionData, @l CommissionDetailsDialogArguments commissionDetailsDialogArguments, @l Map<String, ? extends EndDealField> map, @l AttributedText attributedText, @l CommissionInfo commissionInfo) {
        this.f122279b = commissionData;
        this.f122280c = commissionDetailsDialogArguments;
        this.f122281d = map;
        this.f122282e = attributedText;
        this.f122283f = commissionInfo;
    }

    public /* synthetic */ EndDealSavedState(CommissionData commissionData, CommissionDetailsDialogArguments commissionDetailsDialogArguments, Map map, AttributedText attributedText, CommissionInfo commissionInfo, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : commissionData, (i12 & 2) != 0 ? null : commissionDetailsDialogArguments, (i12 & 4) != 0 ? null : map, (i12 & 8) != 0 ? null : attributedText, (i12 & 16) != 0 ? null : commissionInfo);
    }
}
