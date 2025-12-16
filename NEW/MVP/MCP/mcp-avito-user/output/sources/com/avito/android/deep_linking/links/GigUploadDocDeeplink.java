package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: GigUploadDocDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "FlowType", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class GigUploadDocDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<GigUploadDocDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FlowType f133335b;

    /* compiled from: GigUploadDocDeeplink.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType;", "Landroid/os/Parcelable;", "Certificate", "Default", "FioChange", "MedicalDocument", "MedicalDocumentAttestation", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType$Certificate;", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType$Default;", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType$FioChange;", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType$MedicalDocument;", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType$MedicalDocumentAttestation;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static abstract class FlowType implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f133336b;

        /* compiled from: GigUploadDocDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType$Certificate;", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Certificate extends FlowType {

            @Y61.k
            public static final Parcelable.Creator<Certificate> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f133337c;

            /* compiled from: GigUploadDocDeeplink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Certificate> {
                @Override // android.os.Parcelable.Creator
                public final Certificate createFromParcel(Parcel parcel) {
                    return new Certificate(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Certificate[] newArray(int i12) {
                    return new Certificate[i12];
                }
            }

            public Certificate(@Y61.k String str) {
                super(str, null);
                this.f133337c = str;
            }

            @Override // com.avito.android.deep_linking.links.GigUploadDocDeeplink.FlowType
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final String getF133336b() {
                return this.f133337c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Certificate) && kotlin.jvm.internal.L.f(this.f133337c, ((Certificate) obj).f133337c);
            }

            public final int hashCode() {
                return this.f133337c.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Certificate(flow="), this.f133337c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f133337c);
            }
        }

        /* compiled from: GigUploadDocDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType$Default;", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Default extends FlowType {

            @Y61.k
            public static final Parcelable.Creator<Default> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f133338c;

            /* compiled from: GigUploadDocDeeplink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Default> {
                @Override // android.os.Parcelable.Creator
                public final Default createFromParcel(Parcel parcel) {
                    return new Default(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Default[] newArray(int i12) {
                    return new Default[i12];
                }
            }

            public Default(@Y61.k String str) {
                super(str, null);
                this.f133338c = str;
            }

            @Override // com.avito.android.deep_linking.links.GigUploadDocDeeplink.FlowType
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final String getF133336b() {
                return this.f133338c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Default) && kotlin.jvm.internal.L.f(this.f133338c, ((Default) obj).f133338c);
            }

            public final int hashCode() {
                return this.f133338c.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Default(flow="), this.f133338c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f133338c);
            }
        }

        /* compiled from: GigUploadDocDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType$FioChange;", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FioChange extends FlowType {

            @Y61.k
            public static final Parcelable.Creator<FioChange> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f133339c;

            /* compiled from: GigUploadDocDeeplink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<FioChange> {
                @Override // android.os.Parcelable.Creator
                public final FioChange createFromParcel(Parcel parcel) {
                    return new FioChange(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final FioChange[] newArray(int i12) {
                    return new FioChange[i12];
                }
            }

            public FioChange(@Y61.k String str) {
                super(str, null);
                this.f133339c = str;
            }

            @Override // com.avito.android.deep_linking.links.GigUploadDocDeeplink.FlowType
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final String getF133336b() {
                return this.f133339c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FioChange) && kotlin.jvm.internal.L.f(this.f133339c, ((FioChange) obj).f133339c);
            }

            public final int hashCode() {
                return this.f133339c.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("FioChange(flow="), this.f133339c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f133339c);
            }
        }

        /* compiled from: GigUploadDocDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType$MedicalDocument;", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MedicalDocument extends FlowType {

            @Y61.k
            public static final Parcelable.Creator<MedicalDocument> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f133340c;

            /* compiled from: GigUploadDocDeeplink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<MedicalDocument> {
                @Override // android.os.Parcelable.Creator
                public final MedicalDocument createFromParcel(Parcel parcel) {
                    return new MedicalDocument(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final MedicalDocument[] newArray(int i12) {
                    return new MedicalDocument[i12];
                }
            }

            public MedicalDocument(@Y61.k String str) {
                super(str, null);
                this.f133340c = str;
            }

            @Override // com.avito.android.deep_linking.links.GigUploadDocDeeplink.FlowType
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final String getF133336b() {
                return this.f133340c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MedicalDocument) && kotlin.jvm.internal.L.f(this.f133340c, ((MedicalDocument) obj).f133340c);
            }

            public final int hashCode() {
                return this.f133340c.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("MedicalDocument(flow="), this.f133340c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f133340c);
            }
        }

        /* compiled from: GigUploadDocDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType$MedicalDocumentAttestation;", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$FlowType;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MedicalDocumentAttestation extends FlowType {

            @Y61.k
            public static final Parcelable.Creator<MedicalDocumentAttestation> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f133341c;

            /* compiled from: GigUploadDocDeeplink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<MedicalDocumentAttestation> {
                @Override // android.os.Parcelable.Creator
                public final MedicalDocumentAttestation createFromParcel(Parcel parcel) {
                    return new MedicalDocumentAttestation(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final MedicalDocumentAttestation[] newArray(int i12) {
                    return new MedicalDocumentAttestation[i12];
                }
            }

            public MedicalDocumentAttestation(@Y61.k String str) {
                super(str, null);
                this.f133341c = str;
            }

            @Override // com.avito.android.deep_linking.links.GigUploadDocDeeplink.FlowType
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final String getF133336b() {
                return this.f133341c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MedicalDocumentAttestation) && kotlin.jvm.internal.L.f(this.f133341c, ((MedicalDocumentAttestation) obj).f133341c);
            }

            public final int hashCode() {
                return this.f133341c.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("MedicalDocumentAttestation(flow="), this.f133341c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f133341c);
            }
        }

        public FlowType(String str, C42822w c42822w) {
            this.f133336b = str;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public String getF133336b() {
            return this.f133336b;
        }
    }

    /* compiled from: GigUploadDocDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigUploadDocDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final GigUploadDocDeeplink createFromParcel(Parcel parcel) {
            return new GigUploadDocDeeplink((FlowType) parcel.readParcelable(GigUploadDocDeeplink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GigUploadDocDeeplink[] newArray(int i12) {
            return new GigUploadDocDeeplink[i12];
        }
    }

    /* compiled from: GigUploadDocDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$b$a;", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: GigUploadDocDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$b$a;", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133342b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1870332460;
            }

            @Y61.k
            public final String toString() {
                return "Failure";
            }
        }

        /* compiled from: GigUploadDocDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$b$b;", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.GigUploadDocDeeplink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4002b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4002b f133343b = new C4002b();

            public C4002b() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C4002b);
            }

            public final int hashCode() {
                return 1089736869;
            }

            @Y61.k
            public final String toString() {
                return "Success";
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public GigUploadDocDeeplink(@Y61.k FlowType flowType) {
        this.f133335b = flowType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f133335b, i12);
    }
}
