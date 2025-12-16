package com.avito.android.promo_snippet.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: GigPromoSnippetWidget.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/promo_snippet/models/MotivationItemProgressItem;", "Landroid/os/Parcelable;", "", "value", "<init>", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MotivationItemProgressItem implements Parcelable {

    @k
    public static final Parcelable.Creator<MotivationItemProgressItem> CREATOR = new a();

    @c("value")
    @l
    private final Double value;

    /* compiled from: GigPromoSnippetWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MotivationItemProgressItem> {
        @Override // android.os.Parcelable.Creator
        public final MotivationItemProgressItem createFromParcel(Parcel parcel) {
            return new MotivationItemProgressItem(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final MotivationItemProgressItem[] newArray(int i12) {
            return new MotivationItemProgressItem[i12];
        }
    }

    public MotivationItemProgressItem(@l Double d12) {
        this.value = d12;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Double d12 = this.value;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
    }
}
