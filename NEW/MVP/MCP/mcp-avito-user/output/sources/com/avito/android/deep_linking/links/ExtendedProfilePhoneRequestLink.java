package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: ExtendedProfilePhoneRequestLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/ExtendedProfilePhoneRequestLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ExtendedProfilePhoneRequestLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfilePhoneRequestLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133319b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133320c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f133321d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133322e;

    /* compiled from: ExtendedProfilePhoneRequestLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/ExtendedProfilePhoneRequestLink$a;", "", "<init>", "()V", "", "ARG_FROM_SPACE", "Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ExtendedProfilePhoneRequestLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ExtendedProfilePhoneRequestLink> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfilePhoneRequestLink createFromParcel(Parcel parcel) {
            return new ExtendedProfilePhoneRequestLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfilePhoneRequestLink[] newArray(int i12) {
            return new ExtendedProfilePhoneRequestLink[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ ExtendedProfilePhoneRequestLink(String str, String str2, boolean z12, String str3, int i12, C42822w c42822w) {
        this(str, str2, z12, (i12 & 8) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfilePhoneRequestLink)) {
            return false;
        }
        ExtendedProfilePhoneRequestLink extendedProfilePhoneRequestLink = (ExtendedProfilePhoneRequestLink) obj;
        return kotlin.jvm.internal.L.f(this.f133319b, extendedProfilePhoneRequestLink.f133319b) && kotlin.jvm.internal.L.f(this.f133320c, extendedProfilePhoneRequestLink.f133320c) && this.f133321d == extendedProfilePhoneRequestLink.f133321d && kotlin.jvm.internal.L.f(this.f133322e, extendedProfilePhoneRequestLink.f133322e);
    }

    public final int hashCode() {
        int iHashCode = this.f133319b.hashCode() * 31;
        String str = this.f133320c;
        int i12 = androidx.appcompat.app.r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f133321d);
        String str2 = this.f133322e;
        return i12 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfilePhoneRequestLink(userKey=");
        sb2.append(this.f133319b);
        sb2.append(", context=");
        sb2.append(this.f133320c);
        sb2.append(", needAuth=");
        sb2.append(this.f133321d);
        sb2.append(", profileSession=");
        return C22026a.c(sb2, this.f133322e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133319b);
        parcel.writeString(this.f133320c);
        parcel.writeInt(this.f133321d ? 1 : 0);
        parcel.writeString(this.f133322e);
    }

    public ExtendedProfilePhoneRequestLink(@Y61.k String str, @Y61.l String str2, boolean z12, @Y61.l String str3) {
        this.f133319b = str;
        this.f133320c = str2;
        this.f133321d = z12;
        this.f133322e = str3;
    }
}
