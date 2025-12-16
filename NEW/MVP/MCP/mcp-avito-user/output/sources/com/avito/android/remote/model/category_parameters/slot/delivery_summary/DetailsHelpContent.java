package com.avito.android.remote.model.category_parameters.slot.delivery_summary;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: DeliverySummarySlotConfig.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsHelpContent;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsBottomSheetAction;", "action", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsBottomSheetDescription;", "description", "<init>", "(Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsBottomSheetAction;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsBottomSheetDescription;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsBottomSheetAction;", "getAction", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsBottomSheetAction;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsBottomSheetDescription;", "getDescription", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DetailsBottomSheetDescription;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DetailsHelpContent implements Parcelable {

    @k
    public static final Parcelable.Creator<DetailsHelpContent> CREATOR = new Creator();

    @c("action")
    @k
    private final DetailsBottomSheetAction action;

    @c("description")
    @k
    private final DetailsBottomSheetDescription description;

    /* compiled from: DeliverySummarySlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DetailsHelpContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DetailsHelpContent createFromParcel(@k Parcel parcel) {
            return new DetailsHelpContent(DetailsBottomSheetAction.CREATOR.createFromParcel(parcel), DetailsBottomSheetDescription.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DetailsHelpContent[] newArray(int i12) {
            return new DetailsHelpContent[i12];
        }
    }

    public DetailsHelpContent(@k DetailsBottomSheetAction detailsBottomSheetAction, @k DetailsBottomSheetDescription detailsBottomSheetDescription) {
        this.action = detailsBottomSheetAction;
        this.description = detailsBottomSheetDescription;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final DetailsBottomSheetAction getAction() {
        return this.action;
    }

    @k
    public final DetailsBottomSheetDescription getDescription() {
        return this.description;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.action.writeToParcel(parcel, flags);
        this.description.writeToParcel(parcel, flags);
    }
}
