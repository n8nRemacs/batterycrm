package com.avito.android.remote.model.rating_details_mvi;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RatingDetailsResult.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b(\u0010!¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEntry;", "entries", "Landroid/net/Uri;", "nextPage", "Lcom/avito/android/remote/model/Action;", "action", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEmptyState;", "emptyState", "Lcom/avito/android/deep_linking/links/DeepLink;", "emptyStateAction", "requestReviewAction", "<init>", "(Ljava/util/List;Landroid/net/Uri;Lcom/avito/android/remote/model/Action;Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEmptyState;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Action;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getEntries", "()Ljava/util/List;", "Landroid/net/Uri;", "getNextPage", "()Landroid/net/Uri;", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEmptyState;", "getEmptyState", "()Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEmptyState;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getEmptyStateAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getRequestReviewAction", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RatingDetailsResult implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingDetailsResult> CREATOR = new Creator();

    @c("action")
    @l
    private final Action action;

    @c("emptyState")
    @l
    private final RatingDetailsEmptyState emptyState;

    @c("emptyStateAction")
    @l
    private final DeepLink emptyStateAction;

    @c("entries")
    @l
    private final List<RatingDetailsEntry> entries;

    @c("nextPage")
    @l
    private final Uri nextPage;

    @c("requestReviewAction")
    @l
    private final Action requestReviewAction;

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
            return new RatingDetailsResult(arrayList, (Uri) parcel.readParcelable(RatingDetailsResult.class.getClassLoader()), (Action) parcel.readParcelable(RatingDetailsResult.class.getClassLoader()), parcel.readInt() != 0 ? RatingDetailsEmptyState.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(RatingDetailsResult.class.getClassLoader()), (Action) parcel.readParcelable(RatingDetailsResult.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingDetailsResult[] newArray(int i12) {
            return new RatingDetailsResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RatingDetailsResult(@l List<? extends RatingDetailsEntry> list, @l Uri uri, @l Action action, @l RatingDetailsEmptyState ratingDetailsEmptyState, @l DeepLink deepLink, @l Action action2) {
        this.entries = list;
        this.nextPage = uri;
        this.action = action;
        this.emptyState = ratingDetailsEmptyState;
        this.emptyStateAction = deepLink;
        this.requestReviewAction = action2;
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
    public final RatingDetailsEmptyState getEmptyState() {
        return this.emptyState;
    }

    @l
    public final DeepLink getEmptyStateAction() {
        return this.emptyStateAction;
    }

    @l
    public final List<RatingDetailsEntry> getEntries() {
        return this.entries;
    }

    @l
    public final Uri getNextPage() {
        return this.nextPage;
    }

    @l
    public final Action getRequestReviewAction() {
        return this.requestReviewAction;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<RatingDetailsEntry> list = this.entries;
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
        RatingDetailsEmptyState ratingDetailsEmptyState = this.emptyState;
        if (ratingDetailsEmptyState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ratingDetailsEmptyState.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.emptyStateAction, flags);
        parcel.writeParcelable(this.requestReviewAction, flags);
    }
}
