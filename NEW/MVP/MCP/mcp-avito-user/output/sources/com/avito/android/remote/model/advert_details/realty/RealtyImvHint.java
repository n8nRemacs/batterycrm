package com.avito.android.remote.model.advert_details.realty;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: RealtyImvHint.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/advert_details/realty/RealtyImvHint;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", MessageBody.SystemMessageBody.Platform.Bubble.Item.EXTENDED, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", "getExtended", "()Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RealtyImvHint implements Parcelable {

    @k
    public static final Parcelable.Creator<RealtyImvHint> CREATOR = new Creator();

    @c(MessageBody.SystemMessageBody.Platform.Bubble.Item.EXTENDED)
    @k
    private final DetailsSheetLinkBody extended;

    @c("title")
    @k
    private final String title;

    /* compiled from: RealtyImvHint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RealtyImvHint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyImvHint createFromParcel(@k Parcel parcel) {
            return new RealtyImvHint(parcel.readString(), DetailsSheetLinkBody.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyImvHint[] newArray(int i12) {
            return new RealtyImvHint[i12];
        }
    }

    public RealtyImvHint(@k String str, @k DetailsSheetLinkBody detailsSheetLinkBody) {
        this.title = str;
        this.extended = detailsSheetLinkBody;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final DetailsSheetLinkBody getExtended() {
        return this.extended;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        this.extended.writeToParcel(parcel, flags);
    }
}
