package com.avito.android.passport.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: PhoneLinks.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/deeplinks/PhonesListLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "LLL/a;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final class PhonesListLink extends DeepLink implements LL.a {

    @k
    public static final Parcelable.Creator<PhonesListLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f211135b;

    /* compiled from: PhoneLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhonesListLink> {
        @Override // android.os.Parcelable.Creator
        public final PhonesListLink createFromParcel(Parcel parcel) {
            return new PhonesListLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhonesListLink[] newArray(int i12) {
            return new PhonesListLink[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhonesListLink() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f211135b);
    }

    public /* synthetic */ PhonesListLink(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str);
    }

    public PhonesListLink(@l String str) {
        this.f211135b = str;
    }
}
