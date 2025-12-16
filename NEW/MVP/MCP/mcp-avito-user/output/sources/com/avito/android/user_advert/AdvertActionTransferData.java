package com.avito.android.user_advert;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertActionTransferData.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/AdvertActionTransferData;", "Landroid/os/Parcelable;", "Type", "_avito_user-advert_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdvertActionTransferData implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertActionTransferData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f308186b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f308187c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f308188d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Type f308189e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertActionTransferData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/AdvertActionTransferData$Type;", "", "_avito_user-advert_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f308190b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f308191c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f308192d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f308193e;

        static {
            Type type = new Type("ACTIVATE", 0);
            f308190b = type;
            Type type2 = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1);
            f308191c = type2;
            Type[] typeArr = {type, type2};
            f308192d = typeArr;
            f308193e = c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f308192d.clone();
        }
    }

    /* compiled from: AdvertActionTransferData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertActionTransferData> {
        @Override // android.os.Parcelable.Creator
        public final AdvertActionTransferData createFromParcel(Parcel parcel) {
            return new AdvertActionTransferData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertActionTransferData[] newArray(int i12) {
            return new AdvertActionTransferData[i12];
        }
    }

    public AdvertActionTransferData() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertActionTransferData)) {
            return false;
        }
        AdvertActionTransferData advertActionTransferData = (AdvertActionTransferData) obj;
        return L.f(this.f308186b, advertActionTransferData.f308186b) && L.f(this.f308187c, advertActionTransferData.f308187c) && L.f(this.f308188d, advertActionTransferData.f308188d) && this.f308189e == advertActionTransferData.f308189e;
    }

    public final int hashCode() {
        String str = this.f308186b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f308187c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f308188d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Type type = this.f308189e;
        return iHashCode3 + (type != null ? type.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AdvertActionTransferData(soaAdvertId=" + this.f308186b + ", message=" + this.f308187c + ", categoryId=" + this.f308188d + ", actionType=" + this.f308189e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f308186b);
        parcel.writeString(this.f308187c);
        parcel.writeString(this.f308188d);
        Type type = this.f308189e;
        if (type == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(type.name());
        }
    }

    public AdvertActionTransferData(@l String str, @l String str2, @l String str3, @l Type type) {
        this.f308186b = str;
        this.f308187c = str2;
        this.f308188d = str3;
        this.f308189e = type;
    }

    public /* synthetic */ AdvertActionTransferData(String str, String str2, String str3, Type type, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? Type.f308191c : type);
    }
}
