package com.avito.android.c2c_trx.deepLinks;

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
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: AddAutoToC2CTrxLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/c2c_trx/deepLinks/AddAutoToC2CTrxLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "Arguments", "a", "_avito_c2c-trx_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class AddAutoToC2CTrxLink extends DeepLink {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f113283b = new a(null);

    @k
    public static final Parcelable.Creator<AddAutoToC2CTrxLink> CREATOR = new b();

    /* compiled from: AddAutoToC2CTrxLink.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/c2c_trx/deepLinks/AddAutoToC2CTrxLink$Arguments;", "Landroid/os/Parcelable;", "_avito_c2c-trx_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Arguments implements Parcelable {

        @k
        public static final Parcelable.Creator<Arguments> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f113284b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f113285c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f113286d;

        /* compiled from: AddAutoToC2CTrxLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Arguments> {
            @Override // android.os.Parcelable.Creator
            public final Arguments createFromParcel(Parcel parcel) {
                return new Arguments(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Arguments[] newArray(int i12) {
                return new Arguments[i12];
            }
        }

        public Arguments(@k String str, @k String str2, @k String str3) {
            this.f113284b = str;
            this.f113285c = str2;
            this.f113286d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Arguments)) {
                return false;
            }
            Arguments arguments = (Arguments) obj;
            return L.f(this.f113284b, arguments.f113284b) && L.f(this.f113285c, arguments.f113285c) && L.f(this.f113286d, arguments.f113286d);
        }

        public final int hashCode() {
            return this.f113286d.hashCode() + H.d(this.f113284b.hashCode() * 31, 31, this.f113285c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Arguments(draftId=");
            sb2.append(this.f113284b);
            sb2.append(", serializedAttributes=");
            sb2.append(this.f113285c);
            sb2.append(", serializedSlots=");
            return C22026a.c(sb2, this.f113286d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f113284b);
            parcel.writeString(this.f113285c);
            parcel.writeString(this.f113286d);
        }
    }

    /* compiled from: AddAutoToC2CTrxLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/c2c_trx/deepLinks/AddAutoToC2CTrxLink$a;", "", "<init>", "()V", "", "PUBLISH_DRAFT_ARGUMENTS_KEY", "Ljava/lang/String;", "_avito_c2c-trx_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AddAutoToC2CTrxLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AddAutoToC2CTrxLink> {
        @Override // android.os.Parcelable.Creator
        public final AddAutoToC2CTrxLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new AddAutoToC2CTrxLink();
        }

        @Override // android.os.Parcelable.Creator
        public final AddAutoToC2CTrxLink[] newArray(int i12) {
            return new AddAutoToC2CTrxLink[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
