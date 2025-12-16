package com.avito.android.deep_linking.links.auth;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: SafetyLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PhoneUnavailableReasonLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class PhoneUnavailableReasonLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PhoneUnavailableReasonLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AutoRecoveryLink.Source f133948b;

    /* compiled from: SafetyLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneUnavailableReasonLink> {
        @Override // android.os.Parcelable.Creator
        public final PhoneUnavailableReasonLink createFromParcel(Parcel parcel) {
            return new PhoneUnavailableReasonLink(AutoRecoveryLink.Source.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneUnavailableReasonLink[] newArray(int i12) {
            return new PhoneUnavailableReasonLink[i12];
        }
    }

    /* compiled from: SafetyLinks.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PhoneUnavailableReasonLink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/deep_linking/links/auth/PhoneUnavailableReasonLink$b$a;", "Lcom/avito/android/deep_linking/links/auth/PhoneUnavailableReasonLink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: SafetyLinks.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PhoneUnavailableReasonLink$b$a;", "Lcom/avito/android/deep_linking/links/auth/PhoneUnavailableReasonLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f133949b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1478905984;
            }

            @k
            public final String toString() {
                return "Cancel";
            }
        }

        /* compiled from: SafetyLinks.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PhoneUnavailableReasonLink$b$b;", "Lcom/avito/android/deep_linking/links/auth/PhoneUnavailableReasonLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.auth.PhoneUnavailableReasonLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4028b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4028b f133950b = new C4028b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C4028b);
            }

            public final int hashCode() {
                return 1572187801;
            }

            @k
            public final String toString() {
                return "Finish";
            }
        }
    }

    public PhoneUnavailableReasonLink(@k AutoRecoveryLink.Source source) {
        this.f133948b = source;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhoneUnavailableReasonLink) && this.f133948b == ((PhoneUnavailableReasonLink) obj).f133948b;
    }

    public final int hashCode() {
        return this.f133948b.hashCode();
    }

    @k
    public final String toString() {
        return "PhoneUnavailableReasonLink(source=" + this.f133948b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f133948b.name());
    }
}
