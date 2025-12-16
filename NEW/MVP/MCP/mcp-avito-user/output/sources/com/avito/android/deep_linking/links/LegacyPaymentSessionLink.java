package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.PaymentSessionLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: PaymentSessionLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/LegacyPaymentSessionLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class LegacyPaymentSessionLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<LegacyPaymentSessionLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133422b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133423c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133424d;

    /* compiled from: PaymentSessionLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LegacyPaymentSessionLink> {
        @Override // android.os.Parcelable.Creator
        public final LegacyPaymentSessionLink createFromParcel(Parcel parcel) {
            return new LegacyPaymentSessionLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LegacyPaymentSessionLink[] newArray(int i12) {
            return new LegacyPaymentSessionLink[i12];
        }
    }

    /* compiled from: PaymentSessionLink.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/LegacyPaymentSessionLink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/deep_linking/links/LegacyPaymentSessionLink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: PaymentSessionLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/LegacyPaymentSessionLink$b$a;", "Lcom/avito/android/deep_linking/links/PaymentSessionLink$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends PaymentSessionLink.b {
            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return kotlin.jvm.internal.L.f(null, null);
            }

            public final int hashCode() {
                return 0;
            }

            @Y61.k
            public final String toString() {
                return "Cancelled(title=null)";
            }
        }

        /* compiled from: PaymentSessionLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/LegacyPaymentSessionLink$b$b;", "Lcom/avito/android/deep_linking/links/LegacyPaymentSessionLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.LegacyPaymentSessionLink$b$b, reason: collision with other inner class name */
        public static final class C4003b extends b {
            static {
                new C4003b();
            }

            public C4003b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public LegacyPaymentSessionLink(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        this.f133422b = str;
        this.f133423c = str2;
        this.f133424d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133422b);
        parcel.writeString(this.f133423c);
        parcel.writeString(this.f133424d);
    }
}
