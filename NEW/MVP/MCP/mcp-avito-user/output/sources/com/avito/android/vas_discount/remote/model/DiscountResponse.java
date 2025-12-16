package com.avito.android.vas_discount.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.UserAdvert;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DiscountResponse.kt */
@d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/vas_discount/remote/model/DiscountResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/vas_discount/remote/model/DiscountInfo;", "discountInfo", "Lcom/avito/android/remote/model/Action;", "action", "", "advertsTitle", "", "Lcom/avito/android/remote/model/UserAdvert;", "adverts", "<init>", "(Lcom/avito/android/vas_discount/remote/model/DiscountInfo;Lcom/avito/android/remote/model/Action;Ljava/lang/String;Ljava/util/List;)V", "Lcom/avito/android/vas_discount/remote/model/DiscountInfo;", "e", "()Lcom/avito/android/vas_discount/remote/model/DiscountInfo;", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DiscountResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<DiscountResponse> CREATOR = new a();

    @c("action")
    @l
    private final Action action;

    @c("advertisements")
    @k
    private final List<UserAdvert> adverts;

    @c("advertisementsTitle")
    @l
    private final String advertsTitle;

    @c("discountInfo")
    @k
    private final DiscountInfo discountInfo;

    /* compiled from: DiscountResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DiscountResponse> {
        @Override // android.os.Parcelable.Creator
        public final DiscountResponse createFromParcel(Parcel parcel) {
            DiscountInfo discountInfoCreateFromParcel = DiscountInfo.CREATOR.createFromParcel(parcel);
            Action action = (Action) parcel.readParcelable(DiscountResponse.class.getClassLoader());
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(DiscountResponse.class, parcel, arrayList, iL2, 1);
            }
            return new DiscountResponse(discountInfoCreateFromParcel, action, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DiscountResponse[] newArray(int i12) {
            return new DiscountResponse[i12];
        }
    }

    public DiscountResponse(@k DiscountInfo discountInfo, @l Action action, @l String str, @k List<UserAdvert> list) {
        this.discountInfo = discountInfo;
        this.action = action;
        this.advertsTitle = str;
        this.adverts = list;
    }

    @k
    public final List<UserAdvert> c() {
        return this.adverts;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getAdvertsTitle() {
        return this.advertsTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final DiscountInfo getDiscountInfo() {
        return this.discountInfo;
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.discountInfo.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.action, i12);
        parcel.writeString(this.advertsTitle);
        Iterator itJ = C0.j(this.adverts, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
