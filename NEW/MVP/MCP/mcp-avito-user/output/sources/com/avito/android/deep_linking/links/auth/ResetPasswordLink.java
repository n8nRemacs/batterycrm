package com.avito.android.deep_linking.links.auth;

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

/* compiled from: SafetyLinks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/ResetPasswordLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ResetPasswordLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ResetPasswordLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f133953b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f133954c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f133955d;

    /* compiled from: SafetyLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ResetPasswordLink> {
        @Override // android.os.Parcelable.Creator
        public final ResetPasswordLink createFromParcel(Parcel parcel) {
            return new ResetPasswordLink(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ResetPasswordLink[] newArray(int i12) {
            return new ResetPasswordLink[i12];
        }
    }

    public ResetPasswordLink(@k String str, boolean z12, @l String str2) {
        this.f133953b = str;
        this.f133954c = z12;
        this.f133955d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f133953b);
        parcel.writeInt(this.f133954c ? 1 : 0);
        parcel.writeString(this.f133955d);
    }

    public /* synthetic */ ResetPasswordLink(String str, boolean z12, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? false : z12, str2);
    }
}
