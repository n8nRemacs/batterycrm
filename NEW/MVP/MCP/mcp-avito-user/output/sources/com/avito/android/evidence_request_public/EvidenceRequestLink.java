package com.avito.android.evidence_request_public;

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

/* compiled from: EvidenceRequestLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request_public/EvidenceRequestLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_evidence-request_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class EvidenceRequestLink extends DeepLink {

    @k
    public static final Parcelable.Creator<EvidenceRequestLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f149211b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f149212c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f149213d;

    /* compiled from: EvidenceRequestLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EvidenceRequestLink> {
        @Override // android.os.Parcelable.Creator
        public final EvidenceRequestLink createFromParcel(Parcel parcel) {
            return new EvidenceRequestLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EvidenceRequestLink[] newArray(int i12) {
            return new EvidenceRequestLink[i12];
        }
    }

    /* compiled from: EvidenceRequestLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/evidence_request_public/EvidenceRequestLink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/evidence_request_public/EvidenceRequestLink$b$a;", "Lcom/avito/android/evidence_request_public/EvidenceRequestLink$b$b;", "_avito_evidence-request_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: EvidenceRequestLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request_public/EvidenceRequestLink$b$a;", "Lcom/avito/android/evidence_request_public/EvidenceRequestLink$b;", "<init>", "()V", "_avito_evidence-request_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f149214b = new a();
        }

        /* compiled from: EvidenceRequestLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request_public/EvidenceRequestLink$b$b;", "Lcom/avito/android/evidence_request_public/EvidenceRequestLink$b;", "_avito_evidence-request_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.evidence_request_public.EvidenceRequestLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4379b implements b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f149215b;

            public C4379b(@l String str) {
                this.f149215b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4379b) && L.f(this.f149215b, ((C4379b) obj).f149215b);
            }

            public final int hashCode() {
                String str = this.f149215b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Success(message="), this.f149215b, ')');
            }
        }
    }

    public EvidenceRequestLink(@k String str, @k String str2, @l String str3) {
        this.f149211b = str;
        this.f149212c = str2;
        this.f149213d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f149211b);
        parcel.writeString(this.f149212c);
        parcel.writeString(this.f149213d);
    }
}
