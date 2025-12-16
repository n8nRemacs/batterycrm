package com.avito.android.remote.model.rating_details_legacy;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.rating_details_legacy.RatingDetailsElement;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: RatingDetailsElement.kt */
@d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/rating_details_legacy/ButtonElement;", "Lcom/avito/android/remote/model/rating_details_legacy/RatingDetailsElement;", "Lcom/avito/android/remote/model/Action;", "action", "<init>", "(Lcom/avito/android/remote/model/Action;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ButtonElement implements RatingDetailsElement {

    @k
    public static final Parcelable.Creator<ButtonElement> CREATOR = new Creator();

    @c("action")
    @k
    private final Action action;

    /* compiled from: RatingDetailsElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ButtonElement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ButtonElement createFromParcel(@k Parcel parcel) {
            return new ButtonElement((Action) parcel.readParcelable(ButtonElement.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ButtonElement[] newArray(int i12) {
            return new ButtonElement[i12];
        }
    }

    public ButtonElement(@k Action action) {
        this.action = action;
    }

    @Override // com.avito.android.remote.model.rating_details_legacy.RatingDetailsElement, android.os.Parcelable
    public int describeContents() {
        return RatingDetailsElement.DefaultImpls.describeContents(this);
    }

    @k
    public final Action getAction() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.action, flags);
    }
}
