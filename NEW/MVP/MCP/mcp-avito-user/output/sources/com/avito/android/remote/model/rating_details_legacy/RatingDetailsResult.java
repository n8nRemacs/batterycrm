package com.avito.android.remote.model.rating_details_legacy;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Action;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RatingDetailsResult.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/rating_details_legacy/RatingDetailsResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/rating_details_legacy/RatingDetailsElement;", "elements", "Landroid/net/Uri;", "nextPage", "Lcom/avito/android/remote/model/Action;", "action", "<init>", "(Ljava/util/List;Landroid/net/Uri;Lcom/avito/android/remote/model/Action;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "Landroid/net/Uri;", "getNextPage", "()Landroid/net/Uri;", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RatingDetailsResult implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingDetailsResult> CREATOR = new Creator();

    @c("action")
    @l
    private final Action action;

    @c("entries")
    @l
    private final List<RatingDetailsElement> elements;

    @c("nextPage")
    @l
    private final Uri nextPage;

    /* compiled from: RatingDetailsResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingDetailsResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingDetailsResult createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(RatingDetailsResult.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new RatingDetailsResult(arrayList, (Uri) parcel.readParcelable(RatingDetailsResult.class.getClassLoader()), (Action) parcel.readParcelable(RatingDetailsResult.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingDetailsResult[] newArray(int i12) {
            return new RatingDetailsResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RatingDetailsResult(@l List<? extends RatingDetailsElement> list, @l Uri uri, @l Action action) {
        this.elements = list;
        this.nextPage = uri;
        this.action = action;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @l
    public final List<RatingDetailsElement> getElements() {
        return this.elements;
    }

    @l
    public final Uri getNextPage() {
        return this.nextPage;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<RatingDetailsElement> list = this.elements;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeParcelable(this.nextPage, flags);
        parcel.writeParcelable(this.action, flags);
    }
}
