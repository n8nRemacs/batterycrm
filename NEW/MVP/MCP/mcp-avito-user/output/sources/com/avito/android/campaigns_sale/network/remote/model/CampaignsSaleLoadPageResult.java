package com.avito.android.campaigns_sale.network.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinModel;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleLoadPageResult.kt */
@d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleLoadPageResult;", "Landroid/os/Parcelable;", "", "mainFormId", "", "Lcom/avito/android/beduin_models/BeduinModel;", "mainComponents", "Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleBlock;", "blocks", "Lcom/avito/android/campaigns_sale/network/remote/model/Meta;", Constants.REFERRER_API_META, "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/campaigns_sale/network/remote/model/Meta;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Lcom/avito/android/campaigns_sale/network/remote/model/Meta;", "f", "()Lcom/avito/android/campaigns_sale/network/remote/model/Meta;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CampaignsSaleLoadPageResult implements Parcelable {

    @k
    public static final Parcelable.Creator<CampaignsSaleLoadPageResult> CREATOR = new a();

    @c("blocks")
    @k
    private final List<CampaignsSaleBlock> blocks;

    @c("mainComponents")
    @k
    private final List<BeduinModel> mainComponents;

    @c("mainFormId")
    @k
    private final String mainFormId;

    @c(Constants.REFERRER_API_META)
    @k
    private final Meta meta;

    /* compiled from: CampaignsSaleLoadPageResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CampaignsSaleLoadPageResult> {
        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleLoadPageResult createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(CampaignsSaleLoadPageResult.class, parcel, arrayList, iL2, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(CampaignsSaleBlock.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new CampaignsSaleLoadPageResult(string, arrayList, arrayList2, Meta.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleLoadPageResult[] newArray(int i12) {
            return new CampaignsSaleLoadPageResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CampaignsSaleLoadPageResult(@k String str, @k List<? extends BeduinModel> list, @k List<CampaignsSaleBlock> list2, @k Meta meta) {
        this.mainFormId = str;
        this.mainComponents = list;
        this.blocks = list2;
        this.meta = meta;
    }

    @k
    public final List<CampaignsSaleBlock> c() {
        return this.blocks;
    }

    @k
    public final List<BeduinModel> d() {
        return this.mainComponents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getMainFormId() {
        return this.mainFormId;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignsSaleLoadPageResult)) {
            return false;
        }
        CampaignsSaleLoadPageResult campaignsSaleLoadPageResult = (CampaignsSaleLoadPageResult) obj;
        return L.f(this.mainFormId, campaignsSaleLoadPageResult.mainFormId) && L.f(this.mainComponents, campaignsSaleLoadPageResult.mainComponents) && L.f(this.blocks, campaignsSaleLoadPageResult.blocks) && L.f(this.meta, campaignsSaleLoadPageResult.meta);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    public final int hashCode() {
        return this.meta.hashCode() + H.e(H.e(this.mainFormId.hashCode() * 31, 31, this.mainComponents), 31, this.blocks);
    }

    @k
    public final String toString() {
        return "CampaignsSaleLoadPageResult(mainFormId=" + this.mainFormId + ", mainComponents=" + this.mainComponents + ", blocks=" + this.blocks + ", meta=" + this.meta + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.mainFormId);
        Iterator itJ = C0.j(this.mainComponents, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        Iterator itJ2 = C0.j(this.blocks, parcel);
        while (itJ2.hasNext()) {
            ((CampaignsSaleBlock) itJ2.next()).writeToParcel(parcel, i12);
        }
        this.meta.writeToParcel(parcel, i12);
    }
}
