package com.avito.android.cpx_promo.impl.interactor.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: CpxPromoInputSheet.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromoInputSheet;", "Landroid/os/Parcelable;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CpxPromoInputSheet implements Parcelable {

    @k
    public static final Parcelable.Creator<CpxPromoInputSheet> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f127036b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f127037c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f127038d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f127039e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f127040f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f127041g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f127042h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f127043i;

    /* compiled from: CpxPromoInputSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxPromoInputSheet> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromoInputSheet createFromParcel(Parcel parcel) {
            return new CpxPromoInputSheet(parcel.readString(), (DeepLink) parcel.readParcelable(CpxPromoInputSheet.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromoInputSheet[] newArray(int i12) {
            return new CpxPromoInputSheet[i12];
        }
    }

    public CpxPromoInputSheet(@k String str, @k DeepLink deepLink, @l String str2, @l String str3, @k String str4, @l String str5, @l String str6, @l String str7) {
        this.f127036b = str;
        this.f127037c = str2;
        this.f127038d = str3;
        this.f127039e = str4;
        this.f127040f = deepLink;
        this.f127041g = str5;
        this.f127042h = str6;
        this.f127043i = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f127036b);
        parcel.writeString(this.f127037c);
        parcel.writeString(this.f127038d);
        parcel.writeString(this.f127039e);
        parcel.writeParcelable(this.f127040f, i12);
        parcel.writeString(this.f127041g);
        parcel.writeString(this.f127042h);
        parcel.writeString(this.f127043i);
    }
}
