package com.avito.android.promo;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: PromoWidget.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/promo/PromoAnalyticParams;", "Landroid/os/Parcelable;", "", "mcid", "<init>", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "_avito_bx-content_widget_promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PromoAnalyticParams implements Parcelable {

    @k
    public static final Parcelable.Creator<PromoAnalyticParams> CREATOR = new a();

    @c("mcid")
    @l
    private final Long mcid;

    /* compiled from: PromoWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoAnalyticParams> {
        @Override // android.os.Parcelable.Creator
        public final PromoAnalyticParams createFromParcel(Parcel parcel) {
            return new PromoAnalyticParams(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final PromoAnalyticParams[] newArray(int i12) {
            return new PromoAnalyticParams[i12];
        }
    }

    public PromoAnalyticParams(@l Long l12) {
        this.mcid = l12;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getMcid() {
        return this.mcid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.mcid;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }
}
