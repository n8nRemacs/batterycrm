package com.avito.android.deep_linking.links.auth;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: SafetyLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/EmailUnavailableReasonLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class EmailUnavailableReasonLink extends DeepLink {

    @k
    public static final Parcelable.Creator<EmailUnavailableReasonLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f133911b;

    /* compiled from: SafetyLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmailUnavailableReasonLink> {
        @Override // android.os.Parcelable.Creator
        public final EmailUnavailableReasonLink createFromParcel(Parcel parcel) {
            return new EmailUnavailableReasonLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EmailUnavailableReasonLink[] newArray(int i12) {
            return new EmailUnavailableReasonLink[i12];
        }
    }

    /* compiled from: SafetyLinks.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/EmailUnavailableReasonLink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/deep_linking/links/auth/EmailUnavailableReasonLink$b$a;", "Lcom/avito/android/deep_linking/links/auth/EmailUnavailableReasonLink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: SafetyLinks.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/EmailUnavailableReasonLink$b$a;", "Lcom/avito/android/deep_linking/links/auth/EmailUnavailableReasonLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f133912b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -3103854;
            }

            @k
            public final String toString() {
                return "Cancel";
            }
        }

        /* compiled from: SafetyLinks.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/EmailUnavailableReasonLink$b$b;", "Lcom/avito/android/deep_linking/links/auth/EmailUnavailableReasonLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.auth.EmailUnavailableReasonLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4025b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4025b f133913b = new C4025b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C4025b);
            }

            public final int hashCode() {
                return 90177963;
            }

            @k
            public final String toString() {
                return "Finish";
            }
        }
    }

    public EmailUnavailableReasonLink(@k String str) {
        this.f133911b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmailUnavailableReasonLink) && L.f(this.f133911b, ((EmailUnavailableReasonLink) obj).f133911b);
    }

    public final int hashCode() {
        return this.f133911b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("EmailUnavailableReasonLink(source="), this.f133911b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f133911b);
    }
}
