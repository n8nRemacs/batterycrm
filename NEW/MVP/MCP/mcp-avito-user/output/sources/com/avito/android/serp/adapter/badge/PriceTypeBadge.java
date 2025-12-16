package com.avito.android.serp.adapter.badge;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import hw.InterfaceC41178c;
import kotlin.Metadata;

/* compiled from: PriceTypeBadge.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/badge/PriceTypeBadge;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/badge/Badge;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41178c
@d
/* loaded from: classes3.dex */
public final class PriceTypeBadge implements Parcelable, Badge {

    @k
    public static final Parcelable.Creator<PriceTypeBadge> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f268989b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UniversalColor f268990c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalColor f268991d;

    /* compiled from: PriceTypeBadge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceTypeBadge> {
        @Override // android.os.Parcelable.Creator
        public final PriceTypeBadge createFromParcel(Parcel parcel) {
            return new PriceTypeBadge(parcel.readString(), (UniversalColor) parcel.readParcelable(PriceTypeBadge.class.getClassLoader()), (UniversalColor) parcel.readParcelable(PriceTypeBadge.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PriceTypeBadge[] newArray(int i12) {
            return new PriceTypeBadge[i12];
        }
    }

    public PriceTypeBadge(@k String str, @k UniversalColor universalColor, @l UniversalColor universalColor2) {
        this.f268989b = str;
        this.f268990c = universalColor;
        this.f268991d = universalColor2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.badge.Badge
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF268989b() {
        return this.f268989b;
    }

    @Override // com.avito.android.remote.model.badge.Badge
    @l
    /* renamed from: getUniversalBackgroundColor, reason: from getter */
    public final UniversalColor getF268991d() {
        return this.f268991d;
    }

    @Override // com.avito.android.remote.model.badge.Badge
    @k
    /* renamed from: getUniversalTitleColor, reason: from getter */
    public final UniversalColor getF268990c() {
        return this.f268990c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f268989b);
        parcel.writeParcelable(this.f268990c, i12);
        parcel.writeParcelable(this.f268991d, i12);
    }
}
