package com.avito.android.remote.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FmpProductsUtil.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/fmp/Background;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Background implements Parcelable {

    @k
    public static final Parcelable.Creator<Background> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f253451b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalColor f253452c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f253453d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f253454e;

    /* compiled from: FmpProductsUtil.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Background> {
        @Override // android.os.Parcelable.Creator
        public final Background createFromParcel(Parcel parcel) {
            return new Background((UniversalColor) parcel.readParcelable(Background.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UniversalImage) parcel.readParcelable(Background.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Background[] newArray(int i12) {
            return new Background[i12];
        }
    }

    public Background(@l UniversalColor universalColor, @l String str, @l Integer num, @l UniversalImage universalImage) {
        this.f253451b = num;
        this.f253452c = universalColor;
        this.f253453d = str;
        this.f253454e = universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Background)) {
            return false;
        }
        Background background = (Background) obj;
        return L.f(this.f253451b, background.f253451b) && L.f(this.f253452c, background.f253452c) && L.f(this.f253453d, background.f253453d) && L.f(this.f253454e, background.f253454e);
    }

    public final int hashCode() {
        Integer num = this.f253451b;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        UniversalColor universalColor = this.f253452c;
        int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        String str = this.f253453d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        UniversalImage universalImage = this.f253454e;
        return iHashCode3 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Background(cornerRadius=");
        sb2.append(this.f253451b);
        sb2.append(", color=");
        sb2.append(this.f253452c);
        sb2.append(", gradient=");
        sb2.append(this.f253453d);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f253454e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.f253451b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f253452c, i12);
        parcel.writeString(this.f253453d);
        parcel.writeParcelable(this.f253454e, i12);
    }
}
