package com.avito.android.user_adverts.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertActionAttentionInfo.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertActionAttentionInfo;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertActionAttentionInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertActionAttentionInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f312146b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f312147c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f312148d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f312149e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AttributedText f312150f;

    /* compiled from: UserAdvertActionAttentionInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertActionAttentionInfo> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertActionAttentionInfo createFromParcel(Parcel parcel) {
            return new UserAdvertActionAttentionInfo((AttributedText) parcel.readParcelable(UserAdvertActionAttentionInfo.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertActionAttentionInfo[] newArray(int i12) {
            return new UserAdvertActionAttentionInfo[i12];
        }
    }

    public UserAdvertActionAttentionInfo(@k AttributedText attributedText, @k String str, @k String str2, @k String str3, boolean z12) {
        this.f312146b = str;
        this.f312147c = z12;
        this.f312148d = str2;
        this.f312149e = str3;
        this.f312150f = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdvertActionAttentionInfo)) {
            return false;
        }
        UserAdvertActionAttentionInfo userAdvertActionAttentionInfo = (UserAdvertActionAttentionInfo) obj;
        return L.f(this.f312146b, userAdvertActionAttentionInfo.f312146b) && this.f312147c == userAdvertActionAttentionInfo.f312147c && L.f(this.f312148d, userAdvertActionAttentionInfo.f312148d) && L.f(this.f312149e, userAdvertActionAttentionInfo.f312149e) && L.f(this.f312150f, userAdvertActionAttentionInfo.f312150f);
    }

    public final int hashCode() {
        return this.f312150f.hashCode() + H.d(H.d(r.i(this.f312146b.hashCode() * 31, 31, this.f312147c), 31, this.f312148d), 31, this.f312149e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertActionAttentionInfo(title=");
        sb2.append(this.f312146b);
        sb2.append(", showAdvertCounter=");
        sb2.append(this.f312147c);
        sb2.append(", primaryActionTitle=");
        sb2.append(this.f312148d);
        sb2.append(", secondaryActionTitle=");
        sb2.append(this.f312149e);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f312150f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f312146b);
        parcel.writeInt(this.f312147c ? 1 : 0);
        parcel.writeString(this.f312148d);
        parcel.writeString(this.f312149e);
        parcel.writeParcelable(this.f312150f, i12);
    }
}
