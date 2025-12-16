package com.avito.android.remote.model.rating_details_mvi;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ReviewActionsResult.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0007\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewActionsResult;", "", "button", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewActionsResult$ReviewActionsButton;", "(Lcom/avito/android/remote/model/rating_details_mvi/ReviewActionsResult$ReviewActionsButton;)V", "getButton", "()Lcom/avito/android/remote/model/rating_details_mvi/ReviewActionsResult$ReviewActionsButton;", "ReviewActionsBottomSheet", "ReviewActionsButton", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReviewActionsResult {

    @c("button")
    @k
    private final ReviewActionsButton button;

    /* compiled from: ReviewActionsResult.kt */
    @d
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewActionsResult$ReviewActionsBottomSheet;", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewActionsResult$ReviewActionsButton;", "", "title", "", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action;", "actions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReviewActionsBottomSheet implements ReviewActionsButton {

        @k
        public static final Parcelable.Creator<ReviewActionsBottomSheet> CREATOR = new Creator();

        @c("actions")
        @k
        private final List<ReviewEntry.Action> actions;

        @c("title")
        @k
        private final String title;

        /* compiled from: ReviewActionsResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ReviewActionsBottomSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ReviewActionsBottomSheet createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(ReviewEntry.Action.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new ReviewActionsBottomSheet(string, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ReviewActionsBottomSheet[] newArray(int i12) {
                return new ReviewActionsBottomSheet[i12];
            }
        }

        public ReviewActionsBottomSheet(@k String str, @k List<ReviewEntry.Action> list) {
            this.title = str;
            this.actions = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final List<ReviewEntry.Action> getActions() {
            return this.actions;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            Iterator itJ = C0.j(this.actions, parcel);
            while (itJ.hasNext()) {
                ((ReviewEntry.Action) itJ.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: ReviewActionsResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewActionsResult$ReviewActionsButton;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewActionsResult$ReviewActionsBottomSheet;", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ReviewActionsButton extends Parcelable {
    }

    public ReviewActionsResult(@k ReviewActionsButton reviewActionsButton) {
        this.button = reviewActionsButton;
    }

    @k
    public final ReviewActionsButton getButton() {
        return this.button;
    }
}
