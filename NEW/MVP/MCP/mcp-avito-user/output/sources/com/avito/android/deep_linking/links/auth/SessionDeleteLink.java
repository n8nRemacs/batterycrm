package com.avito.android.deep_linking.links.auth;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ProfileLinks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/SessionDeleteLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class SessionDeleteLink extends DeepLink {

    @k
    public static final Parcelable.Creator<SessionDeleteLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f133959b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f133960c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f133961d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Boolean f133962e;

    /* compiled from: ProfileLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SessionDeleteLink> {
        @Override // android.os.Parcelable.Creator
        public final SessionDeleteLink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SessionDeleteLink(string, string2, string3, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SessionDeleteLink[] newArray(int i12) {
            return new SessionDeleteLink[i12];
        }
    }

    public SessionDeleteLink(@l String str, @l String str2, @l String str3, @l Boolean bool) {
        this.f133959b = str;
        this.f133960c = str2;
        this.f133961d = str3;
        this.f133962e = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f133959b);
        parcel.writeString(this.f133960c);
        parcel.writeString(this.f133961d);
        Boolean bool = this.f133962e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
