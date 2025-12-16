package com.avito.android.auto_evidence_request_public;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: AutoEvidenceRequestDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_evidence_request_public/AutoEvidenceRequestDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_auto-evidence-request_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class AutoEvidenceRequestDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<AutoEvidenceRequestDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f95285b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f95286c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f95287d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f95288e;

    /* compiled from: AutoEvidenceRequestDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoEvidenceRequestDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final AutoEvidenceRequestDeepLink createFromParcel(Parcel parcel) {
            return new AutoEvidenceRequestDeepLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoEvidenceRequestDeepLink[] newArray(int i12) {
            return new AutoEvidenceRequestDeepLink[i12];
        }
    }

    /* compiled from: AutoEvidenceRequestDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_evidence_request_public/AutoEvidenceRequestDeepLink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/auto_evidence_request_public/AutoEvidenceRequestDeepLink$b$a;", "Lcom/avito/android/auto_evidence_request_public/AutoEvidenceRequestDeepLink$b$b;", "_avito_auto-evidence-request_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: AutoEvidenceRequestDeepLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_evidence_request_public/AutoEvidenceRequestDeepLink$b$a;", "Lcom/avito/android/auto_evidence_request_public/AutoEvidenceRequestDeepLink$b;", "<init>", "()V", "_avito_auto-evidence-request_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f95289b = new a();
        }

        /* compiled from: AutoEvidenceRequestDeepLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_evidence_request_public/AutoEvidenceRequestDeepLink$b$b;", "Lcom/avito/android/auto_evidence_request_public/AutoEvidenceRequestDeepLink$b;", "_avito_auto-evidence-request_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.auto_evidence_request_public.AutoEvidenceRequestDeepLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C2825b implements b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f95290b;

            public C2825b(@l String str) {
                this.f95290b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2825b) && L.f(this.f95290b, ((C2825b) obj).f95290b);
            }

            public final int hashCode() {
                String str = this.f95290b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Success(message="), this.f95290b, ')');
            }
        }
    }

    public AutoEvidenceRequestDeepLink(@k String str, @l String str2, @k String str3, @k String str4) {
        this.f95285b = str;
        this.f95286c = str2;
        this.f95287d = str3;
        this.f95288e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoEvidenceRequestDeepLink)) {
            return false;
        }
        AutoEvidenceRequestDeepLink autoEvidenceRequestDeepLink = (AutoEvidenceRequestDeepLink) obj;
        return L.f(this.f95285b, autoEvidenceRequestDeepLink.f95285b) && L.f(this.f95286c, autoEvidenceRequestDeepLink.f95286c) && L.f(this.f95287d, autoEvidenceRequestDeepLink.f95287d) && L.f(this.f95288e, autoEvidenceRequestDeepLink.f95288e);
    }

    public final int hashCode() {
        int iHashCode = this.f95285b.hashCode() * 31;
        String str = this.f95286c;
        return this.f95288e.hashCode() + H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f95287d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoEvidenceRequestDeepLink(appealId=");
        sb2.append(this.f95285b);
        sb2.append(", appealUrl=");
        sb2.append(this.f95286c);
        sb2.append(", itemId=");
        sb2.append(this.f95287d);
        sb2.append(", proofType=");
        return C22026a.c(sb2, this.f95288e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f95285b);
        parcel.writeString(this.f95286c);
        parcel.writeString(this.f95287d);
        parcel.writeString(this.f95288e);
    }
}
