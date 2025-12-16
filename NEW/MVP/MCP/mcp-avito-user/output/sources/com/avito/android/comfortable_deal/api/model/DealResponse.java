package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/DealResponse;", "Landroid/os/Parcelable;", "", "id", "actionTitle", "type", "Lcom/avito/android/comfortable_deal/api/model/Stage;", "stage", "Lcom/avito/android/comfortable_deal/api/model/Client;", "client", "Lcom/avito/android/comfortable_deal/api/model/RealtyItem;", "item", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/comfortable_deal/api/model/Stage;Lcom/avito/android/comfortable_deal/api/model/Client;Lcom/avito/android/comfortable_deal/api/model/RealtyItem;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getActionTitle", "getType", "Lcom/avito/android/comfortable_deal/api/model/Stage;", "e", "()Lcom/avito/android/comfortable_deal/api/model/Stage;", "Lcom/avito/android/comfortable_deal/api/model/Client;", "c", "()Lcom/avito/android/comfortable_deal/api/model/Client;", "Lcom/avito/android/comfortable_deal/api/model/RealtyItem;", "d", "()Lcom/avito/android/comfortable_deal/api/model/RealtyItem;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DealResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<DealResponse> CREATOR = new a();

    @c("actionTitle")
    @k
    private final String actionTitle;

    @c("client")
    @k
    private final Client client;

    @c("id")
    @k
    private final String id;

    @c("realtyObject")
    @k
    private final RealtyItem item;

    @c("stage")
    @k
    private final Stage stage;

    @c("type")
    @k
    private final String type;

    /* compiled from: DealResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DealResponse> {
        @Override // android.os.Parcelable.Creator
        public final DealResponse createFromParcel(Parcel parcel) {
            return new DealResponse(parcel.readString(), parcel.readString(), parcel.readString(), Stage.CREATOR.createFromParcel(parcel), Client.CREATOR.createFromParcel(parcel), RealtyItem.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DealResponse[] newArray(int i12) {
            return new DealResponse[i12];
        }
    }

    public DealResponse(@k String str, @k String str2, @k String str3, @k Stage stage, @k Client client, @k RealtyItem realtyItem) {
        this.id = str;
        this.actionTitle = str2;
        this.type = str3;
        this.stage = stage;
        this.client = client;
        this.item = realtyItem;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Client getClient() {
        return this.client;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final RealtyItem getItem() {
        return this.item;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final Stage getStage() {
        return this.stage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DealResponse)) {
            return false;
        }
        DealResponse dealResponse = (DealResponse) obj;
        return L.f(this.id, dealResponse.id) && L.f(this.actionTitle, dealResponse.actionTitle) && L.f(this.type, dealResponse.type) && L.f(this.stage, dealResponse.stage) && L.f(this.client, dealResponse.client) && L.f(this.item, dealResponse.item);
    }

    @k
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.item.hashCode() + ((this.client.hashCode() + ((this.stage.hashCode() + H.d(H.d(this.id.hashCode() * 31, 31, this.actionTitle), 31, this.type)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "DealResponse(id=" + this.id + ", actionTitle=" + this.actionTitle + ", type=" + this.type + ", stage=" + this.stage + ", client=" + this.client + ", item=" + this.item + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.actionTitle);
        parcel.writeString(this.type);
        this.stage.writeToParcel(parcel, i12);
        this.client.writeToParcel(parcel, i12);
        this.item.writeToParcel(parcel, i12);
    }
}
