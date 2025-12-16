package com.avito.android.gig_apply.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: GigApplyErrorOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/ui/GigApplyErrorOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigApplyErrorOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<GigApplyErrorOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f159851b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f159852c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f159853d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final DeepLink f159854e;

    /* compiled from: GigApplyErrorOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigApplyErrorOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final GigApplyErrorOpenParams createFromParcel(Parcel parcel) {
            return new GigApplyErrorOpenParams(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(GigApplyErrorOpenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GigApplyErrorOpenParams[] newArray(int i12) {
            return new GigApplyErrorOpenParams[i12];
        }
    }

    public GigApplyErrorOpenParams(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l DeepLink deepLink) {
        this.f159851b = str;
        this.f159852c = str2;
        this.f159853d = str3;
        this.f159854e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f159851b);
        parcel.writeString(this.f159852c);
        parcel.writeString(this.f159853d);
        parcel.writeParcelable(this.f159854e, i12);
    }
}
