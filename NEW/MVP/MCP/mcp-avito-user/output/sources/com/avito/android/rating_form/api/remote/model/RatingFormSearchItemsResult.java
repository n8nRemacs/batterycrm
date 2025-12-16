package com.avito.android.rating_form.api.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RatingFormSearchItemsResult.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormSearchItemsResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormSearchItemsResult$RatingFormSearchItem;", "items", "Landroid/net/Uri;", "nextPage", "<init>", "(Ljava/util/List;Landroid/net/Uri;)V", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "RatingFormSearchItem", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingFormSearchItemsResult implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingFormSearchItemsResult> CREATOR = new a();

    @c("items")
    @l
    private final List<RatingFormSearchItem> items;

    @c("nextPage")
    @l
    private final Uri nextPage;

    /* compiled from: RatingFormSearchItemsResult.kt */
    @d
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormSearchItemsResult$RatingFormSearchItem;", "Landroid/os/Parcelable;", "", "itemId", "", "title", "titleCaption", "price", "status", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "J", "c", "()J", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "d", "getPrice", "getStatus", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RatingFormSearchItem implements Parcelable {

        @k
        public static final Parcelable.Creator<RatingFormSearchItem> CREATOR = new a();

        @c("image")
        @l
        private final Image image;

        @c("id")
        private final long itemId;

        @c("price")
        @l
        private final String price;

        @c("status")
        @k
        private final String status;

        @c("title")
        @l
        private final String title;

        @c("titleCaption")
        @l
        private final String titleCaption;

        /* compiled from: RatingFormSearchItemsResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RatingFormSearchItem> {
            @Override // android.os.Parcelable.Creator
            public final RatingFormSearchItem createFromParcel(Parcel parcel) {
                return new RatingFormSearchItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(RatingFormSearchItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final RatingFormSearchItem[] newArray(int i12) {
                return new RatingFormSearchItem[i12];
            }
        }

        public RatingFormSearchItem(long j12, @l String str, @l String str2, @l String str3, @k String str4, @l Image image) {
            this.itemId = j12;
            this.title = str;
            this.titleCaption = str2;
            this.price = str3;
            this.status = str4;
            this.image = image;
        }

        /* renamed from: c, reason: from getter */
        public final long getItemId() {
            return this.itemId;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getTitleCaption() {
            return this.titleCaption;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        @l
        public final String getPrice() {
            return this.price;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.itemId);
            parcel.writeString(this.title);
            parcel.writeString(this.titleCaption);
            parcel.writeString(this.price);
            parcel.writeString(this.status);
            parcel.writeParcelable(this.image, i12);
        }
    }

    /* compiled from: RatingFormSearchItemsResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingFormSearchItemsResult> {
        @Override // android.os.Parcelable.Creator
        public final RatingFormSearchItemsResult createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(RatingFormSearchItem.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new RatingFormSearchItemsResult(arrayList, (Uri) parcel.readParcelable(RatingFormSearchItemsResult.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RatingFormSearchItemsResult[] newArray(int i12) {
            return new RatingFormSearchItemsResult[i12];
        }
    }

    public RatingFormSearchItemsResult(@l List<RatingFormSearchItem> list, @l Uri uri) {
        this.items = list;
        this.nextPage = uri;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Uri getNextPage() {
        return this.nextPage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<RatingFormSearchItem> getItems() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<RatingFormSearchItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((RatingFormSearchItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.nextPage, i12);
    }
}
