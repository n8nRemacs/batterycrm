package com.avito.android.master_plan;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: MasterPlanShowLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/master_plan/MasterPlanShowLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_master-plan_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final class MasterPlanShowLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<MasterPlanShowLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f185986b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final MasterPlanLinkData f185987c;

    /* compiled from: MasterPlanShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MasterPlanShowLink> {
        @Override // android.os.Parcelable.Creator
        public final MasterPlanShowLink createFromParcel(Parcel parcel) {
            return new MasterPlanShowLink(parcel.readString(), parcel.readInt() == 0 ? null : MasterPlanLinkData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MasterPlanShowLink[] newArray(int i12) {
            return new MasterPlanShowLink[i12];
        }
    }

    public MasterPlanShowLink(@Y61.l String str, @Y61.l MasterPlanLinkData masterPlanLinkData) {
        this.f185986b = str;
        this.f185987c = masterPlanLinkData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f185986b);
        MasterPlanLinkData masterPlanLinkData = this.f185987c;
        if (masterPlanLinkData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            masterPlanLinkData.writeToParcel(parcel, i12);
        }
    }
}
