package com.avito.android.code_confirmation.code_confirmation.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmedCodeInfo.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/model/ConfirmedCodeInfo;", "Lcom/avito/android/code_confirmation/code_confirmation/model/ConfirmedCodePayload;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ConfirmedCodeInfo implements ConfirmedCodePayload {

    @k
    public static final Parcelable.Creator<ConfirmedCodeInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f119575b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f119576c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119577d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f119578e;

    /* compiled from: ConfirmedCodeInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConfirmedCodeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ConfirmedCodeInfo createFromParcel(Parcel parcel) {
            return new ConfirmedCodeInfo(parcel.readString(), parcel.readString(), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(ConfirmedCodeInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ConfirmedCodeInfo[] newArray(int i12) {
            return new ConfirmedCodeInfo[i12];
        }
    }

    public ConfirmedCodeInfo(@k String str, @k String str2, boolean z12, @l DeepLink deepLink) {
        this.f119575b = str;
        this.f119576c = str2;
        this.f119577d = z12;
        this.f119578e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmedCodeInfo)) {
            return false;
        }
        ConfirmedCodeInfo confirmedCodeInfo = (ConfirmedCodeInfo) obj;
        return L.f(this.f119575b, confirmedCodeInfo.f119575b) && L.f(this.f119576c, confirmedCodeInfo.f119576c) && this.f119577d == confirmedCodeInfo.f119577d && L.f(this.f119578e, confirmedCodeInfo.f119578e);
    }

    public final int hashCode() {
        int i12 = r.i(H.d(this.f119575b.hashCode() * 31, 31, this.f119576c), 31, this.f119577d);
        DeepLink deepLink = this.f119578e;
        return i12 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmedCodeInfo(login=");
        sb2.append(this.f119575b);
        sb2.append(", hash=");
        sb2.append(this.f119576c);
        sb2.append(", isPhoneUsed=");
        sb2.append(this.f119577d);
        sb2.append(", postAuthAction=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f119578e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f119575b);
        parcel.writeString(this.f119576c);
        parcel.writeInt(this.f119577d ? 1 : 0);
        parcel.writeParcelable(this.f119578e, i12);
    }

    public /* synthetic */ ConfirmedCodeInfo(String str, String str2, boolean z12, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, str2, z12, (i12 & 8) != 0 ? null : deepLink);
    }
}
