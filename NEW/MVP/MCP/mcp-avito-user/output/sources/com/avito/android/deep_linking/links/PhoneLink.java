package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: PhoneLink.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/PhoneLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Call", "a", "Lcom/avito/android/deep_linking/links/PhoneLink$Call;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PhoneLink extends DeepLink {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133573b;

    /* compiled from: PhoneLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PhoneLink$Call;", "Lcom/avito/android/deep_linking/links/PhoneLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final /* data */ class Call extends PhoneLink {

        @Y61.k
        public static final Parcelable.Creator<Call> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f133574c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f133575d;

        /* compiled from: PhoneLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Call> {
            @Override // android.os.Parcelable.Creator
            public final Call createFromParcel(Parcel parcel) {
                return new Call(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Call[] newArray(int i12) {
                return new Call[i12];
            }
        }

        public Call(@Y61.k String str, @Y61.l String str2) {
            super(str, null);
            this.f133574c = str;
            this.f133575d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Call)) {
                return false;
            }
            Call call = (Call) obj;
            return kotlin.jvm.internal.L.f(this.f133574c, call.f133574c) && kotlin.jvm.internal.L.f(this.f133575d, call.f133575d);
        }

        @Override // com.avito.android.deep_linking.links.PhoneLink
        @Y61.k
        /* renamed from: f, reason: from getter */
        public final String getF133573b() {
            return this.f133574c;
        }

        public final int hashCode() {
            int iHashCode = this.f133574c.hashCode() * 31;
            String str = this.f133575d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Call(phone=");
            sb2.append(this.f133574c);
            sb2.append(", context=");
            return C22026a.c(sb2, this.f133575d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133574c);
            parcel.writeString(this.f133575d);
        }

        public /* synthetic */ Call(String str, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2);
        }
    }

    /* compiled from: PhoneLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/PhoneLink$a;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f133576b = new a();
    }

    public PhoneLink(String str, C42822w c42822w) {
        this.f133573b = str;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public String getF133573b() {
        return this.f133573b;
    }
}
