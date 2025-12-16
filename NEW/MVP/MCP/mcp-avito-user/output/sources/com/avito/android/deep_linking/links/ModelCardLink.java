package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ModelCardLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/ModelCardLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "FromTab", "c", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ModelCardLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ModelCardLink> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133441b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133442c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133443d;

    /* compiled from: ModelCardLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/ModelCardLink$FromTab;", "Landroid/os/Parcelable;", "ParametersTab", "ReviewTab", "Lcom/avito/android/deep_linking/links/ModelCardLink$FromTab$ParametersTab;", "Lcom/avito/android/deep_linking/links/ModelCardLink$FromTab$ReviewTab;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface FromTab extends Parcelable {

        /* compiled from: ModelCardLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ModelCardLink$FromTab$ParametersTab;", "Lcom/avito/android/deep_linking/links/ModelCardLink$FromTab;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ParametersTab implements FromTab {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final ParametersTab f133444b = new ParametersTab();

            @Y61.k
            public static final Parcelable.Creator<ParametersTab> CREATOR = new a();

            /* compiled from: ModelCardLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ParametersTab> {
                @Override // android.os.Parcelable.Creator
                public final ParametersTab createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return ParametersTab.f133444b;
                }

                @Override // android.os.Parcelable.Creator
                public final ParametersTab[] newArray(int i12) {
                    return new ParametersTab[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof ParametersTab);
            }

            public final int hashCode() {
                return -2128273238;
            }

            @Y61.k
            public final String toString() {
                return "ParametersTab";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ModelCardLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ModelCardLink$FromTab$ReviewTab;", "Lcom/avito/android/deep_linking/links/ModelCardLink$FromTab;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ReviewTab implements FromTab {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final ReviewTab f133445b = new ReviewTab();

            @Y61.k
            public static final Parcelable.Creator<ReviewTab> CREATOR = new a();

            /* compiled from: ModelCardLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ReviewTab> {
                @Override // android.os.Parcelable.Creator
                public final ReviewTab createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return ReviewTab.f133445b;
                }

                @Override // android.os.Parcelable.Creator
                public final ReviewTab[] newArray(int i12) {
                    return new ReviewTab[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof ReviewTab);
            }

            public final int hashCode() {
                return -749579268;
            }

            @Y61.k
            public final String toString() {
                return "ReviewTab";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: ModelCardLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ModelCardLink$a;", "LJu/c$a;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final FromTab f133446b;

        public a(@Y61.l FromTab fromTab) {
            this.f133446b = fromTab;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f133446b, ((a) obj).f133446b);
        }

        public final int hashCode() {
            FromTab fromTab = this.f133446b;
            if (fromTab == null) {
                return 0;
            }
            return fromTab.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Canceled(fromTab=" + this.f133446b + ')';
        }
    }

    /* compiled from: ModelCardLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ModelCardLink> {
        @Override // android.os.Parcelable.Creator
        public final ModelCardLink createFromParcel(Parcel parcel) {
            return new ModelCardLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ModelCardLink[] newArray(int i12) {
            return new ModelCardLink[i12];
        }
    }

    /* compiled from: ModelCardLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ModelCardLink$c;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f133447b = new c();
    }

    public ModelCardLink(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.f133441b = str;
        this.f133442c = str2;
        this.f133443d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133441b);
        parcel.writeString(this.f133442c);
        parcel.writeString(this.f133443d);
    }
}
