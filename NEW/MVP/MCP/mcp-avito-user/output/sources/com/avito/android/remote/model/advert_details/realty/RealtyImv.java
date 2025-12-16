package com.avito.android.remote.model.advert_details.realty;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: RealtyImv.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/advert_details/realty/RealtyImv;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/advert_details/realty/RealtyImvHint;", "hint", "Lcom/avito/android/remote/model/advert_details/realty/RealtyImvPriceRange;", "priceRange", "Lcom/avito/android/remote/model/advert_details/realty/RealtyImvBody;", "body", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/advert_details/realty/RealtyImvHint;Lcom/avito/android/remote/model/advert_details/realty/RealtyImvPriceRange;Lcom/avito/android/remote/model/advert_details/realty/RealtyImvBody;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/advert_details/realty/RealtyImvHint;", "getHint", "()Lcom/avito/android/remote/model/advert_details/realty/RealtyImvHint;", "Lcom/avito/android/remote/model/advert_details/realty/RealtyImvPriceRange;", "getPriceRange", "()Lcom/avito/android/remote/model/advert_details/realty/RealtyImvPriceRange;", "Lcom/avito/android/remote/model/advert_details/realty/RealtyImvBody;", "getBody", "()Lcom/avito/android/remote/model/advert_details/realty/RealtyImvBody;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RealtyImv implements Parcelable {

    @k
    public static final Parcelable.Creator<RealtyImv> CREATOR = new Creator();

    @c("body")
    @k
    private final RealtyImvBody body;

    @c("hint")
    @k
    private final RealtyImvHint hint;

    @c("priceRange")
    @k
    private final RealtyImvPriceRange priceRange;

    @c("title")
    @k
    private final String title;

    /* compiled from: RealtyImv.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RealtyImv> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyImv createFromParcel(@k Parcel parcel) {
            return new RealtyImv(parcel.readString(), RealtyImvHint.CREATOR.createFromParcel(parcel), RealtyImvPriceRange.CREATOR.createFromParcel(parcel), RealtyImvBody.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyImv[] newArray(int i12) {
            return new RealtyImv[i12];
        }
    }

    public RealtyImv(@k String str, @k RealtyImvHint realtyImvHint, @k RealtyImvPriceRange realtyImvPriceRange, @k RealtyImvBody realtyImvBody) {
        this.title = str;
        this.hint = realtyImvHint;
        this.priceRange = realtyImvPriceRange;
        this.body = realtyImvBody;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final RealtyImvBody getBody() {
        return this.body;
    }

    @k
    public final RealtyImvHint getHint() {
        return this.hint;
    }

    @k
    public final RealtyImvPriceRange getPriceRange() {
        return this.priceRange;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        this.hint.writeToParcel(parcel, flags);
        this.priceRange.writeToParcel(parcel, flags);
        this.body.writeToParcel(parcel, flags);
    }
}
