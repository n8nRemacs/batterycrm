package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FavoriteSellersResult.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/FavoriteSellersResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/FavoriteSellersResultItem;", "list", "Landroid/net/Uri;", "nextPage", "", "totalCount", "", "xHash", "<init>", "(Ljava/util/List;Landroid/net/Uri;ILjava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getList", "()Ljava/util/List;", "Landroid/net/Uri;", "getNextPage", "()Landroid/net/Uri;", "I", "getTotalCount", "Ljava/lang/String;", "getXHash", "()Ljava/lang/String;", "_avito-discouraged_avito-api_favorite-sellers"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FavoriteSellersResult implements Parcelable {

    @k
    public static final Parcelable.Creator<FavoriteSellersResult> CREATOR = new Creator();

    @c("list")
    @l
    private final List<FavoriteSellersResultItem> list;

    @c("nextPage")
    @l
    private final Uri nextPage;

    @c("totalCount")
    private final int totalCount;

    @c("xHash")
    @l
    private final String xHash;

    /* compiled from: FavoriteSellersResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavoriteSellersResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoriteSellersResult createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(FavoriteSellersResult.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new FavoriteSellersResult(arrayList, (Uri) parcel.readParcelable(FavoriteSellersResult.class.getClassLoader()), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoriteSellersResult[] newArray(int i12) {
            return new FavoriteSellersResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FavoriteSellersResult(@l List<? extends FavoriteSellersResultItem> list, @l Uri uri, int i12, @l String str) {
        this.list = list;
        this.nextPage = uri;
        this.totalCount = i12;
        this.xHash = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<FavoriteSellersResultItem> getList() {
        return this.list;
    }

    @l
    public final Uri getNextPage() {
        return this.nextPage;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    @l
    public final String getXHash() {
        return this.xHash;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<FavoriteSellersResultItem> list = this.list;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeParcelable(this.nextPage, flags);
        parcel.writeInt(this.totalCount);
        parcel.writeString(this.xHash);
    }
}
