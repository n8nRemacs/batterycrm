package com.avito.android.gig_snippet.models;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: GigShiftsWidgetItem.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/gig_snippet/models/GigShiftsWidgetShiftData;", "Landroid/os/Parcelable;", "", "title", "totalPrice", "date", "startTime", "endTime", AddressParameter.TYPE, "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotSeller;", "seller", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotSeller;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "g", "getDate", "f", "d", "c", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotSeller;", "e", "()Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotSeller;", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftsWidgetShiftData implements Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftsWidgetShiftData> CREATOR = new a();

    @c(AddressParameter.TYPE)
    @k
    private final String address;

    @c("date")
    @k
    private final String date;

    @c("endTime")
    @k
    private final String endTime;

    @c("seller")
    @k
    private final GigShiftsWidgetSlotSeller seller;

    @c("startTime")
    @k
    private final String startTime;

    @c("title")
    @k
    private final String title;

    @c("totalPrice")
    @k
    private final String totalPrice;

    /* compiled from: GigShiftsWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftsWidgetShiftData> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetShiftData createFromParcel(Parcel parcel) {
            return new GigShiftsWidgetShiftData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), GigShiftsWidgetSlotSeller.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetShiftData[] newArray(int i12) {
            return new GigShiftsWidgetShiftData[i12];
        }
    }

    public GigShiftsWidgetShiftData(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k String str6, @k GigShiftsWidgetSlotSeller gigShiftsWidgetSlotSeller) {
        this.title = str;
        this.totalPrice = str2;
        this.date = str3;
        this.startTime = str4;
        this.endTime = str5;
        this.address = str6;
        this.seller = gigShiftsWidgetSlotSeller;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final GigShiftsWidgetSlotSeller getSeller() {
        return this.seller;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.totalPrice);
        parcel.writeString(this.date);
        parcel.writeString(this.startTime);
        parcel.writeString(this.endTime);
        parcel.writeString(this.address);
        this.seller.writeToParcel(parcel, i12);
    }
}
