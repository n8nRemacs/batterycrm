package com.avito.android.deep_linking.links;

import Hu.InterfaceC14033a;
import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ServiceTypeKt;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.my_advert.CloseReason;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47204b;

/* compiled from: MyAdvertLink.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Activate", "ActivateV2", "Allow", "Deactivate", "DeactivateBySoa", "DeactivateV2", "Delete", "Edit", "EditLink", "EditV1", "Restore", "RestoreV2", "UpdateReservation", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Activate;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$ActivateV2;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Allow;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Deactivate;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$DeactivateBySoa;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$DeactivateV2;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Delete;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$EditLink;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Restore;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$RestoreV2;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$UpdateReservation;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class MyAdvertLink extends DeepLink {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133462b;

    /* compiled from: MyAdvertLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$Activate;", "Lcom/avito/android/deep_linking/links/MyAdvertLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class Activate extends MyAdvertLink {

        @Y61.k
        public static final Parcelable.Creator<Activate> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f133463c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f133464d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f133465e;

        /* compiled from: MyAdvertLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Activate> {
            @Override // android.os.Parcelable.Creator
            public final Activate createFromParcel(Parcel parcel) {
                return new Activate(parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Activate[] newArray(int i12) {
                return new Activate[i12];
            }
        }

        public Activate(@Y61.k String str, boolean z12, @Y61.l String str2) {
            super(str, null);
            this.f133463c = str;
            this.f133464d = z12;
            this.f133465e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertLink
        @Y61.k
        /* renamed from: getItemId */
        public final String getF133462b() {
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133463c);
            parcel.writeInt(this.f133464d ? 1 : 0);
            parcel.writeString(this.f133465e);
        }
    }

    /* compiled from: MyAdvertLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$ActivateV2;", "Lcom/avito/android/deep_linking/links/MyAdvertLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class ActivateV2 extends MyAdvertLink {

        @Y61.k
        public static final Parcelable.Creator<ActivateV2> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f133466c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f133467d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f133468e;

        /* compiled from: MyAdvertLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ActivateV2> {
            @Override // android.os.Parcelable.Creator
            public final ActivateV2 createFromParcel(Parcel parcel) {
                return new ActivateV2(parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActivateV2[] newArray(int i12) {
                return new ActivateV2[i12];
            }
        }

        /* compiled from: MyAdvertLink.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$ActivateV2$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/deep_linking/links/MyAdvertLink$ActivateV2$b$a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$ActivateV2$b$b;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$ActivateV2$b$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class b {

            /* compiled from: MyAdvertLink.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$ActivateV2$b$a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$ActivateV2$b;", "LJu/c$b;", "LJu/a$a;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a extends b implements InterfaceC14249c.b, InterfaceC14247a.InterfaceC0545a {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final String f133469b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final ApiError f133470c;

                public a(@Y61.k ApiError apiError, @Y61.k String str) {
                    super(null);
                    this.f133469b = str;
                    this.f133470c = apiError;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return kotlin.jvm.internal.L.f(this.f133469b, aVar.f133469b) && kotlin.jvm.internal.L.f(this.f133470c, aVar.f133470c);
                }

                public final int hashCode() {
                    return this.f133470c.hashCode() + (this.f133469b.hashCode() * 31);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Failure(advertId=");
                    sb2.append(this.f133469b);
                    sb2.append(", error=");
                    return AK.c.n(sb2, this.f133470c, ')');
                }
            }

            /* compiled from: MyAdvertLink.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$ActivateV2$b$b;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$ActivateV2$b;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.deep_linking.links.MyAdvertLink$ActivateV2$b$b, reason: collision with other inner class name */
            public static final class C4005b extends b implements InterfaceC14249c.a {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final C4005b f133471b = new C4005b();

                public C4005b() {
                    super(null);
                }
            }

            /* compiled from: MyAdvertLink.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$ActivateV2$b$c;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$ActivateV2$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class c extends b implements InterfaceC14249c.b {

                /* renamed from: b, reason: collision with root package name */
                @Y61.l
                public final String f133472b;

                /* JADX WARN: Multi-variable type inference failed */
                public c() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f133472b, ((c) obj).f133472b);
                }

                public final int hashCode() {
                    String str = this.f133472b;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return C22026a.c(new StringBuilder("Success(message="), this.f133472b, ')');
                }

                public c(@Y61.l String str) {
                    super(null);
                    this.f133472b = str;
                }

                public /* synthetic */ c(String str, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : str);
                }
            }

            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        public ActivateV2(@Y61.k String str, boolean z12, @Y61.l String str2) {
            super(str, null);
            this.f133466c = str;
            this.f133467d = z12;
            this.f133468e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertLink
        @Y61.k
        /* renamed from: getItemId */
        public final String getF133462b() {
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133466c);
            parcel.writeInt(this.f133467d ? 1 : 0);
            parcel.writeString(this.f133468e);
        }
    }

    /* compiled from: MyAdvertLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$Allow;", "Lcom/avito/android/deep_linking/links/MyAdvertLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class Allow extends MyAdvertLink {

        @Y61.k
        public static final Parcelable.Creator<Allow> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f133473c;

        /* compiled from: MyAdvertLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Allow> {
            @Override // android.os.Parcelable.Creator
            public final Allow createFromParcel(Parcel parcel) {
                return new Allow(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Allow[] newArray(int i12) {
                return new Allow[i12];
            }
        }

        public Allow(@Y61.k String str) {
            super(str, null);
            this.f133473c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertLink
        @Y61.k
        /* renamed from: getItemId */
        public final String getF133462b() {
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133473c);
        }
    }

    /* compiled from: MyAdvertLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$Deactivate;", "Lcom/avito/android/deep_linking/links/MyAdvertLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final /* data */ class Deactivate extends MyAdvertLink {

        @Y61.k
        public static final Parcelable.Creator<Deactivate> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f133474c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f133475d;

        /* compiled from: MyAdvertLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Deactivate> {
            @Override // android.os.Parcelable.Creator
            public final Deactivate createFromParcel(Parcel parcel) {
                return new Deactivate(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Deactivate[] newArray(int i12) {
                return new Deactivate[i12];
            }
        }

        /* compiled from: MyAdvertLink.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$Deactivate$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Deactivate$b$a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Deactivate$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class b {

            /* compiled from: MyAdvertLink.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$Deactivate$b$a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Deactivate$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a extends b implements InterfaceC14249c.b {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final ApiError f133476b;

                public a(@Y61.k ApiError apiError) {
                    super(null);
                    this.f133476b = apiError;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f133476b, ((a) obj).f133476b);
                }

                public final int hashCode() {
                    return this.f133476b.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return AK.c.n(new StringBuilder("Failure(error="), this.f133476b, ')');
                }
            }

            /* compiled from: MyAdvertLink.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$Deactivate$b$b;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Deactivate$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.deep_linking.links.MyAdvertLink$Deactivate$b$b, reason: collision with other inner class name */
            public static final /* data */ class C4006b extends b implements InterfaceC14249c.b {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final String f133477b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final List<CloseReason> f133478c;

                public C4006b(@Y61.k String str, @Y61.k List<CloseReason> list) {
                    super(null);
                    this.f133477b = str;
                    this.f133478c = list;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4006b)) {
                        return false;
                    }
                    C4006b c4006b = (C4006b) obj;
                    return kotlin.jvm.internal.L.f(this.f133477b, c4006b.f133477b) && kotlin.jvm.internal.L.f(this.f133478c, c4006b.f133478c);
                }

                public final int hashCode() {
                    return this.f133478c.hashCode() + (this.f133477b.hashCode() * 31);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Success(advertId=");
                    sb2.append(this.f133477b);
                    sb2.append(", reasons=");
                    return androidx.compose.foundation.H.p(sb2, this.f133478c, ')');
                }
            }

            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        public /* synthetic */ Deactivate(String str, boolean z12, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? false : z12);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Deactivate)) {
                return false;
            }
            Deactivate deactivate = (Deactivate) obj;
            return kotlin.jvm.internal.L.f(this.f133474c, deactivate.f133474c) && this.f133475d == deactivate.f133475d;
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertLink
        @Y61.k
        /* renamed from: getItemId */
        public final String getF133462b() {
            throw null;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f133475d) + (this.f133474c.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Deactivate(itemId=");
            sb2.append(this.f133474c);
            sb2.append(", showLoading=");
            return androidx.appcompat.app.r.x(sb2, this.f133475d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133474c);
            parcel.writeInt(this.f133475d ? 1 : 0);
        }

        public Deactivate(@Y61.k String str, boolean z12) {
            super(str, null);
            this.f133474c = str;
            this.f133475d = z12;
        }
    }

    /* compiled from: MyAdvertLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$DeactivateBySoa;", "Lcom/avito/android/deep_linking/links/MyAdvertLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC14033a
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class DeactivateBySoa extends MyAdvertLink {

        @Y61.k
        public static final Parcelable.Creator<DeactivateBySoa> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f133479c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f133480d;

        /* compiled from: MyAdvertLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DeactivateBySoa> {
            @Override // android.os.Parcelable.Creator
            public final DeactivateBySoa createFromParcel(Parcel parcel) {
                return new DeactivateBySoa(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DeactivateBySoa[] newArray(int i12) {
                return new DeactivateBySoa[i12];
            }
        }

        public DeactivateBySoa(@Y61.k String str, @Y61.k String str2) {
            super(str, null);
            this.f133479c = str;
            this.f133480d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertLink
        @Y61.k
        /* renamed from: getItemId */
        public final String getF133462b() {
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133479c);
            parcel.writeString(this.f133480d);
        }
    }

    /* compiled from: MyAdvertLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$DeactivateV2;", "Lcom/avito/android/deep_linking/links/MyAdvertLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final /* data */ class DeactivateV2 extends MyAdvertLink {

        @Y61.k
        public static final Parcelable.Creator<DeactivateV2> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f133481c;

        /* compiled from: MyAdvertLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DeactivateV2> {
            @Override // android.os.Parcelable.Creator
            public final DeactivateV2 createFromParcel(Parcel parcel) {
                return new DeactivateV2(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DeactivateV2[] newArray(int i12) {
                return new DeactivateV2[i12];
            }
        }

        /* compiled from: MyAdvertLink.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$DeactivateV2$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/deep_linking/links/MyAdvertLink$DeactivateV2$b$a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$DeactivateV2$b$b;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$DeactivateV2$b$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class b {

            /* compiled from: MyAdvertLink.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$DeactivateV2$b$a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$DeactivateV2$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a extends b implements InterfaceC14249c.b {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final a f133482b = new a();

                public a() {
                    super(null);
                }

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 1480707166;
                }

                @Y61.k
                public final String toString() {
                    return "Cancel";
                }
            }

            /* compiled from: MyAdvertLink.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$DeactivateV2$b$b;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$DeactivateV2$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.deep_linking.links.MyAdvertLink$DeactivateV2$b$b, reason: collision with other inner class name */
            public static final /* data */ class C4007b extends b implements InterfaceC14249c.b {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final ApiError f133483b;

                public C4007b(@Y61.k ApiError apiError) {
                    super(null);
                    this.f133483b = apiError;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C4007b) && kotlin.jvm.internal.L.f(this.f133483b, ((C4007b) obj).f133483b);
                }

                public final int hashCode() {
                    return this.f133483b.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return AK.c.n(new StringBuilder("Failure(error="), this.f133483b, ')');
                }
            }

            /* compiled from: MyAdvertLink.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$DeactivateV2$b$c;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$DeactivateV2$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class c extends b implements InterfaceC14249c.b {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final String f133484b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.l
                public final String f133485c;

                public c(@Y61.k String str, @Y61.l String str2) {
                    super(null);
                    this.f133484b = str;
                    this.f133485c = str2;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return kotlin.jvm.internal.L.f(this.f133484b, cVar.f133484b) && kotlin.jvm.internal.L.f(this.f133485c, cVar.f133485c);
                }

                public final int hashCode() {
                    int iHashCode = this.f133484b.hashCode() * 31;
                    String str = this.f133485c;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Success(advertId=");
                    sb2.append(this.f133484b);
                    sb2.append(", message=");
                    return C22026a.c(sb2, this.f133485c, ')');
                }
            }

            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        public DeactivateV2(@Y61.k String str) {
            super(str, null);
            this.f133481c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeactivateV2) && kotlin.jvm.internal.L.f(this.f133481c, ((DeactivateV2) obj).f133481c);
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertLink
        @Y61.k
        /* renamed from: getItemId */
        public final String getF133462b() {
            throw null;
        }

        public final int hashCode() {
            return this.f133481c.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("DeactivateV2(itemId="), this.f133481c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133481c);
        }
    }

    /* compiled from: MyAdvertLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$Delete;", "Lcom/avito/android/deep_linking/links/MyAdvertLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class Delete extends MyAdvertLink {

        @Y61.k
        public static final Parcelable.Creator<Delete> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f133486c;

        /* compiled from: MyAdvertLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Delete> {
            @Override // android.os.Parcelable.Creator
            public final Delete createFromParcel(Parcel parcel) {
                return new Delete(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Delete[] newArray(int i12) {
                return new Delete[i12];
            }
        }

        /* compiled from: MyAdvertLink.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$Delete$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Delete$b$a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Delete$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class b {

            /* compiled from: MyAdvertLink.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$Delete$b$a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Delete$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a extends b implements InterfaceC14249c.b {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final ApiError f133487b;

                public a(@Y61.k ApiError apiError) {
                    super(null);
                    this.f133487b = apiError;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f133487b, ((a) obj).f133487b);
                }

                public final int hashCode() {
                    return this.f133487b.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return AK.c.n(new StringBuilder("Failure(error="), this.f133487b, ')');
                }
            }

            /* compiled from: MyAdvertLink.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$Delete$b$b;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Delete$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.deep_linking.links.MyAdvertLink$Delete$b$b, reason: collision with other inner class name */
            public static final /* data */ class C4008b extends b implements InterfaceC14249c.b {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final SuccessResult f133488b;

                public C4008b(@Y61.k SuccessResult successResult) {
                    super(null);
                    this.f133488b = successResult;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C4008b) && kotlin.jvm.internal.L.f(this.f133488b, ((C4008b) obj).f133488b);
                }

                public final int hashCode() {
                    return this.f133488b.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return "Success(data=" + this.f133488b + ')';
                }
            }

            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        public Delete(@Y61.k String str) {
            super(str, null);
            this.f133486c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertLink
        @Y61.k
        /* renamed from: getItemId */
        public final String getF133462b() {
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133486c);
        }
    }

    /* compiled from: MyAdvertLink.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$Edit;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$EditLink;", "Result", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class Edit extends EditLink {

        @Y61.k
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f133489c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final DeepLink f133490d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f133491e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f133492f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f133493g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f133494h;

        /* compiled from: MyAdvertLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Edit> {
            @Override // android.os.Parcelable.Creator
            public final Edit createFromParcel(Parcel parcel) {
                return new Edit((DeepLink) parcel.readParcelable(Edit.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Edit[] newArray(int i12) {
                return new Edit[i12];
            }
        }

        public /* synthetic */ Edit(String str, DeepLink deepLink, String str2, boolean z12, String str3, String str4, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : deepLink, str, (i12 & 4) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) == 0 ? str4 : null, (i12 & 8) != 0 ? false : z12);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertLink.EditLink
        public final boolean f() {
            DeepLink deepLink = this.f133490d;
            if (deepLink == null) {
                return false;
            }
            if (deepLink instanceof ActivateV2) {
                return true;
            }
            if (deepLink instanceof ConditionChainLink) {
                return ((ConditionChainLink) deepLink).f133112b instanceof ActivateV2;
            }
            return false;
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertLink
        @Y61.k
        /* renamed from: getItemId, reason: from getter */
        public final String getF133462b() {
            return this.f133489c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133489c);
            parcel.writeParcelable(this.f133490d, i12);
            parcel.writeString(this.f133491e);
            parcel.writeInt(this.f133492f ? 1 : 0);
            parcel.writeString(this.f133493g);
            parcel.writeString(this.f133494h);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Edit(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, boolean z12) {
            super(str, null, 2, 0 == true ? 1 : 0);
            this.f133489c = str;
            this.f133490d = deepLink;
            this.f133491e = str2;
            this.f133492f = z12;
            this.f133493g = str3;
            this.f133494h = str4;
        }

        /* compiled from: MyAdvertLink.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$Edit$Result;", "LJu/c$b;", "a", "Success", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Edit$Result$a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Edit$Result$Success;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface Result extends InterfaceC14249c.b {

            /* compiled from: MyAdvertLink.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$Edit$Result$a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Edit$Result;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Result {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final a f133498b = new a();
            }

            /* compiled from: MyAdvertLink.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$Edit$Result$Success;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Edit$Result;", "Landroid/os/Parcelable;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Success implements Result, Parcelable {

                @Y61.k
                public static final Parcelable.Creator<Success> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @Y61.l
                public final String f133495b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.l
                public final DeepLink f133496c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.l
                public final String f133497d;

                /* compiled from: MyAdvertLink.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Success> {
                    @Override // android.os.Parcelable.Creator
                    public final Success createFromParcel(Parcel parcel) {
                        return new Success(parcel.readString(), (DeepLink) parcel.readParcelable(Success.class.getClassLoader()), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Success[] newArray(int i12) {
                        return new Success[i12];
                    }
                }

                public Success(@Y61.l String str, @Y61.l DeepLink deepLink, @Y61.l String str2) {
                    this.f133495b = str;
                    this.f133496c = deepLink;
                    this.f133497d = str2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Success)) {
                        return false;
                    }
                    Success success = (Success) obj;
                    return kotlin.jvm.internal.L.f(this.f133495b, success.f133495b) && kotlin.jvm.internal.L.f(this.f133496c, success.f133496c) && kotlin.jvm.internal.L.f(this.f133497d, success.f133497d);
                }

                public final int hashCode() {
                    String str = this.f133495b;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    DeepLink deepLink = this.f133496c;
                    int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                    String str2 = this.f133497d;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Success(advertId=");
                    sb2.append(this.f133495b);
                    sb2.append(", postAction=");
                    sb2.append(this.f133496c);
                    sb2.append(", message=");
                    return C22026a.c(sb2, this.f133497d, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeString(this.f133495b);
                    parcel.writeParcelable(this.f133496c, i12);
                    parcel.writeString(this.f133497d);
                }

                public /* synthetic */ Success(String str, DeepLink deepLink, String str2, int i12, C42822w c42822w) {
                    this(str, (i12 & 2) != 0 ? null : deepLink, str2);
                }
            }
        }
    }

    /* compiled from: MyAdvertLink.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$EditLink;", "Lcom/avito/android/deep_linking/links/MyAdvertLink;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Edit;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$EditV1;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class EditLink extends MyAdvertLink {
        public /* synthetic */ EditLink(String str, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, null);
        }

        public abstract boolean f();

        public EditLink(String str, String str2, C42822w c42822w) {
            super(str, null);
        }
    }

    /* compiled from: MyAdvertLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$EditV1;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$EditLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class EditV1 extends EditLink {

        @Y61.k
        public static final Parcelable.Creator<EditV1> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f133499c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f133500d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f133501e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f133502f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f133503g;

        /* compiled from: MyAdvertLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EditV1> {
            @Override // android.os.Parcelable.Creator
            public final EditV1 createFromParcel(Parcel parcel) {
                return new EditV1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final EditV1[] newArray(int i12) {
                return new EditV1[i12];
            }
        }

        /* compiled from: MyAdvertLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$EditV1$b;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f133504b = new b();
        }

        public /* synthetic */ EditV1(String str, String str2, String str3, boolean z12, String str4, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 8) != 0 ? false : z12);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertLink.EditLink
        public final boolean f() {
            return kotlin.jvm.internal.L.f(this.f133500d, ServiceTypeKt.SERVICE_ACTIVATION);
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertLink
        @Y61.k
        /* renamed from: getItemId, reason: from getter */
        public final String getF133462b() {
            return this.f133499c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133499c);
            parcel.writeString(this.f133500d);
            parcel.writeString(this.f133501e);
            parcel.writeInt(this.f133502f ? 1 : 0);
            parcel.writeString(this.f133503g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EditV1(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, boolean z12) {
            super(str, null, 2, 0 == true ? 1 : 0);
            this.f133499c = str;
            this.f133500d = str2;
            this.f133501e = str3;
            this.f133502f = z12;
            this.f133503g = str4;
        }
    }

    /* compiled from: MyAdvertLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$Restore;", "Lcom/avito/android/deep_linking/links/MyAdvertLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class Restore extends MyAdvertLink {

        @Y61.k
        public static final Parcelable.Creator<Restore> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f133505c;

        /* compiled from: MyAdvertLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Restore> {
            @Override // android.os.Parcelable.Creator
            public final Restore createFromParcel(Parcel parcel) {
                return new Restore(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Restore[] newArray(int i12) {
                return new Restore[i12];
            }
        }

        public Restore(@Y61.k String str) {
            super(str, null);
            this.f133505c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertLink
        @Y61.k
        /* renamed from: getItemId */
        public final String getF133462b() {
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133505c);
        }
    }

    /* compiled from: MyAdvertLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$RestoreV2;", "Lcom/avito/android/deep_linking/links/MyAdvertLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class RestoreV2 extends MyAdvertLink {

        @Y61.k
        public static final Parcelable.Creator<RestoreV2> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f133506c;

        /* compiled from: MyAdvertLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RestoreV2> {
            @Override // android.os.Parcelable.Creator
            public final RestoreV2 createFromParcel(Parcel parcel) {
                return new RestoreV2(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RestoreV2[] newArray(int i12) {
                return new RestoreV2[i12];
            }
        }

        /* compiled from: MyAdvertLink.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$RestoreV2$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/deep_linking/links/MyAdvertLink$RestoreV2$b$a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$RestoreV2$b$b;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$RestoreV2$b$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class b {

            /* compiled from: MyAdvertLink.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$RestoreV2$b$a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$RestoreV2$b;", "LJu/c$b;", "LJu/a$a;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a extends b implements InterfaceC14249c.b, InterfaceC14247a.InterfaceC0545a {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final String f133507b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final ApiError f133508c;

                public a(@Y61.k ApiError apiError, @Y61.k String str) {
                    super(null);
                    this.f133507b = str;
                    this.f133508c = apiError;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return kotlin.jvm.internal.L.f(this.f133507b, aVar.f133507b) && kotlin.jvm.internal.L.f(this.f133508c, aVar.f133508c);
                }

                public final int hashCode() {
                    return this.f133508c.hashCode() + (this.f133507b.hashCode() * 31);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Failure(advertId=");
                    sb2.append(this.f133507b);
                    sb2.append(", error=");
                    return AK.c.n(sb2, this.f133508c, ')');
                }
            }

            /* compiled from: MyAdvertLink.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$RestoreV2$b$b;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$RestoreV2$b;", "LJu/c$b;", "LJu/a$a;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.deep_linking.links.MyAdvertLink$RestoreV2$b$b, reason: collision with other inner class name */
            public static final /* data */ class C4009b extends b implements InterfaceC14249c.b, InterfaceC14247a.InterfaceC0545a {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final String f133509b;

                public C4009b(@Y61.k String str) {
                    super(null);
                    this.f133509b = str;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C4009b) && kotlin.jvm.internal.L.f(this.f133509b, ((C4009b) obj).f133509b);
                }

                public final int hashCode() {
                    return this.f133509b.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return C22026a.c(new StringBuilder("Forbidden(message="), this.f133509b, ')');
                }
            }

            /* compiled from: MyAdvertLink.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$RestoreV2$b$c;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$RestoreV2$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class c extends b implements InterfaceC14249c.b {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final String f133510b;

                public c(@Y61.k String str) {
                    super(null);
                    this.f133510b = str;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f133510b, ((c) obj).f133510b);
                }

                public final int hashCode() {
                    return this.f133510b.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return C22026a.c(new StringBuilder("Success(message="), this.f133510b, ')');
                }
            }

            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        public RestoreV2(@Y61.k String str) {
            super(str, null);
            this.f133506c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertLink
        @Y61.k
        /* renamed from: getItemId */
        public final String getF133462b() {
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133506c);
        }
    }

    /* compiled from: MyAdvertLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertLink$UpdateReservation;", "Lcom/avito/android/deep_linking/links/MyAdvertLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class UpdateReservation extends MyAdvertLink {

        @Y61.k
        public static final Parcelable.Creator<UpdateReservation> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f133511c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f133512d;

        /* compiled from: MyAdvertLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UpdateReservation> {
            @Override // android.os.Parcelable.Creator
            public final UpdateReservation createFromParcel(Parcel parcel) {
                return new UpdateReservation(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final UpdateReservation[] newArray(int i12) {
                return new UpdateReservation[i12];
            }
        }

        public UpdateReservation(@Y61.k String str, @Y61.k String str2) {
            super(str, null);
            this.f133511c = str;
            this.f133512d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertLink
        @Y61.k
        /* renamed from: getItemId */
        public final String getF133462b() {
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133511c);
            parcel.writeString(this.f133512d);
        }
    }

    public MyAdvertLink(String str, C42822w c42822w) {
        this.f133462b = str;
    }

    @Y61.k
    /* renamed from: getItemId, reason: from getter */
    public String getF133462b() {
        return this.f133462b;
    }
}
