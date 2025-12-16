package com.avito.android.vas_discount.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: DiscountInfo.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/vas_discount/remote/model/DiscountInfo;", "Landroid/os/Parcelable;", "", "title", "description", "", "dueDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DiscountInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<DiscountInfo> CREATOR = new a();

    @c("description")
    @k
    private final String description;

    @c("dueDate")
    @l
    private final Long dueDate;

    @c("title")
    @k
    private final String title;

    /* compiled from: DiscountInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DiscountInfo> {
        @Override // android.os.Parcelable.Creator
        public final DiscountInfo createFromParcel(Parcel parcel) {
            return new DiscountInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final DiscountInfo[] newArray(int i12) {
            return new DiscountInfo[i12];
        }
    }

    public DiscountInfo(@k String str, @k String str2, @l Long l12) {
        this.title = str;
        this.description = str2;
        this.dueDate = l12;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getDueDate() {
        return this.dueDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Long l12 = this.dueDate;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }
}
