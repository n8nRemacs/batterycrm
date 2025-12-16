package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ExtendedProfileCategoryAdverts.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileCategoryAdverts;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/SerpElement;", "adverts", "Lcom/avito/android/remote/model/ExtendedProfileAdvertsNextPage;", "nextPage", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/ExtendedProfileAdvertsNextPage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getAdverts", "()Ljava/util/List;", "Lcom/avito/android/remote/model/ExtendedProfileAdvertsNextPage;", "getNextPage", "()Lcom/avito/android/remote/model/ExtendedProfileAdvertsNextPage;", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExtendedProfileCategoryAdverts implements Parcelable {

    @k
    public static final Parcelable.Creator<ExtendedProfileCategoryAdverts> CREATOR = new Creator();

    @c("list")
    @l
    private final List<SerpElement> adverts;

    @c("nextPage")
    @l
    private final ExtendedProfileAdvertsNextPage nextPage;

    /* compiled from: ExtendedProfileCategoryAdverts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileCategoryAdverts> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileCategoryAdverts createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(ExtendedProfileCategoryAdverts.class, parcel, arrayList, iL2, 1);
                }
            }
            return new ExtendedProfileCategoryAdverts(arrayList, parcel.readInt() != 0 ? ExtendedProfileAdvertsNextPage.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileCategoryAdverts[] newArray(int i12) {
            return new ExtendedProfileCategoryAdverts[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedProfileCategoryAdverts(@l List<? extends SerpElement> list, @l ExtendedProfileAdvertsNextPage extendedProfileAdvertsNextPage) {
        this.adverts = list;
        this.nextPage = extendedProfileAdvertsNextPage;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<SerpElement> getAdverts() {
        return this.adverts;
    }

    @l
    public final ExtendedProfileAdvertsNextPage getNextPage() {
        return this.nextPage;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<SerpElement> list = this.adverts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        ExtendedProfileAdvertsNextPage extendedProfileAdvertsNextPage = this.nextPage;
        if (extendedProfileAdvertsNextPage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            extendedProfileAdvertsNextPage.writeToParcel(parcel, flags);
        }
    }
}
