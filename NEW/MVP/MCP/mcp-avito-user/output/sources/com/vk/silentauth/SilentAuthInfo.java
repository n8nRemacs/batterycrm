package com.vk.silentauth;

import AK.c;
import X41.f;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: SilentAuthInfo.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/silentauth/SilentAuthInfo;", "Landroid/os/Parcelable;", "b", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SilentAuthInfo implements Parcelable {

    @f
    @k
    public static final Parcelable.Creator<SilentAuthInfo> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UserId f367186b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f367187c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f367188d;

    /* renamed from: e, reason: collision with root package name */
    public final long f367189e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f367190f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f367191g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f367192h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f367193i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f367194j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f367195k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f367196l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Bundle f367197m;

    /* renamed from: n, reason: collision with root package name */
    public final int f367198n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final String f367199o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final String f367200p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final List<SilentTokenProviderInfo> f367201q;

    /* renamed from: r, reason: collision with root package name */
    public final int f367202r;

    /* compiled from: SilentAuthInfo.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/vk/silentauth/SilentAuthInfo$a", "Landroid/os/Parcelable$Creator;", "Lcom/vk/silentauth/SilentAuthInfo;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SilentAuthInfo> {
        @Override // android.os.Parcelable.Creator
        public final SilentAuthInfo createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j12 = parcel.readLong();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Bundle bundle = (Bundle) parcel.readParcelable(Bundle.class.getClassLoader());
            int i13 = parcel.readInt();
            String string10 = parcel.readString();
            if (string10 == null) {
                string10 = "";
            }
            String str = string10;
            String string11 = parcel.readString();
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, SilentTokenProviderInfo.class.getClassLoader());
            G0 g02 = G0.f406611a;
            return new SilentAuthInfo(i12, string, string2, j12, string3, string4, string5, string6, string7, string8, string9, bundle, i13, str, string11, arrayList, (UserId) parcel.readParcelable(UserId.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SilentAuthInfo[] newArray(int i12) {
            return new SilentAuthInfo[i12];
        }
    }

    /* compiled from: SilentAuthInfo.kt */
    @s0
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/vk/silentauth/SilentAuthInfo$b;", "", "<init>", "()V", "", "EMPTY_USER_HASH", "Ljava/lang/String;", "KEY_IS_EXCHANGE_USER", "KEY_SERVICE", "KEY_SERVICE_NAME", "KEY_USER", "KEY_ID", "KEY_FIRST_NAME", "KEY_LAST_NAME", "KEY_AVATAR", "KEY_PHONE", "KEY_TOKEN", "KEY_UUID", "KEY_TTL", "Landroid/os/Parcelable$Creator;", "Lcom/vk/silentauth/SilentAuthInfo;", "CREATOR", "Landroid/os/Parcelable$Creator;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public SilentAuthInfo(@k UserId userId, @k String str, @k String str2, long j12, @k String str3, @l String str4, @l String str5, @l String str6, @k String str7, @l String str8, @l String str9, @l Bundle bundle, int i12, @k String str10, @l String str11, @k List<SilentTokenProviderInfo> list, int i13) {
        this.f367186b = userId;
        this.f367187c = str;
        this.f367188d = str2;
        this.f367189e = j12;
        this.f367190f = str3;
        this.f367191g = str4;
        this.f367192h = str5;
        this.f367193i = str6;
        this.f367194j = str7;
        this.f367195k = str8;
        this.f367196l = str9;
        this.f367197m = bundle;
        this.f367198n = i12;
        this.f367199o = str10;
        this.f367200p = str11;
        this.f367201q = list;
        this.f367202r = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SilentAuthInfo a(SilentAuthInfo silentAuthInfo, String str, ArrayList arrayList, int i12) {
        UserId userId = silentAuthInfo.f367186b;
        String str2 = silentAuthInfo.f367187c;
        String str3 = silentAuthInfo.f367188d;
        long j12 = silentAuthInfo.f367189e;
        String str4 = silentAuthInfo.f367190f;
        String str5 = silentAuthInfo.f367191g;
        String str6 = silentAuthInfo.f367192h;
        String str7 = silentAuthInfo.f367193i;
        String str8 = silentAuthInfo.f367194j;
        String str9 = silentAuthInfo.f367195k;
        String str10 = silentAuthInfo.f367196l;
        Bundle bundle = silentAuthInfo.f367197m;
        int i13 = silentAuthInfo.f367198n;
        String str11 = silentAuthInfo.f367199o;
        String str12 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? silentAuthInfo.f367200p : str;
        List list = (i12 & 32768) != 0 ? silentAuthInfo.f367201q : arrayList;
        int i14 = silentAuthInfo.f367202r;
        silentAuthInfo.getClass();
        return new SilentAuthInfo(userId, str2, str3, j12, str4, str5, str6, str7, str8, str9, str10, bundle, i13, str11, str12, list, i14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SilentAuthInfo)) {
            return false;
        }
        SilentAuthInfo silentAuthInfo = (SilentAuthInfo) obj;
        return L.f(this.f367186b, silentAuthInfo.f367186b) && L.f(this.f367187c, silentAuthInfo.f367187c) && L.f(this.f367188d, silentAuthInfo.f367188d) && this.f367189e == silentAuthInfo.f367189e && L.f(this.f367190f, silentAuthInfo.f367190f) && L.f(this.f367191g, silentAuthInfo.f367191g) && L.f(this.f367192h, silentAuthInfo.f367192h) && L.f(this.f367193i, silentAuthInfo.f367193i) && L.f(this.f367194j, silentAuthInfo.f367194j) && L.f(this.f367195k, silentAuthInfo.f367195k) && L.f(this.f367196l, silentAuthInfo.f367196l) && L.f(this.f367197m, silentAuthInfo.f367197m) && this.f367198n == silentAuthInfo.f367198n && L.f(this.f367199o, silentAuthInfo.f367199o) && L.f(this.f367200p, silentAuthInfo.f367200p) && L.f(this.f367201q, silentAuthInfo.f367201q) && this.f367202r == silentAuthInfo.f367202r;
    }

    public final int hashCode() {
        int iD2 = H.d(r.g(H.d(H.d(Long.hashCode(this.f367186b.f366761b) * 31, 31, this.f367187c), 31, this.f367188d), 31, this.f367189e), 31, this.f367190f);
        String str = this.f367191g;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f367192h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f367193i;
        int iD3 = H.d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f367194j);
        String str4 = this.f367195k;
        int iHashCode3 = (iD3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f367196l;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Bundle bundle = this.f367197m;
        int iD4 = H.d(r.e(this.f367198n, (iHashCode4 + (bundle == null ? 0 : bundle.hashCode())) * 31, 31), 31, this.f367199o);
        String str6 = this.f367200p;
        return Integer.hashCode(this.f367202r) + H.e((iD4 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.f367201q);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SilentAuthInfo(userId=");
        sb2.append(this.f367186b);
        sb2.append(", uuid=");
        sb2.append(this.f367187c);
        sb2.append(", token=");
        sb2.append(this.f367188d);
        sb2.append(", expireTime=");
        sb2.append(this.f367189e);
        sb2.append(", firstName=");
        sb2.append(this.f367190f);
        sb2.append(", photo50=");
        sb2.append(this.f367191g);
        sb2.append(", photo100=");
        sb2.append(this.f367192h);
        sb2.append(", photo200=");
        sb2.append(this.f367193i);
        sb2.append(", lastName=");
        sb2.append(this.f367194j);
        sb2.append(", phone=");
        sb2.append(this.f367195k);
        sb2.append(", serviceInfo=");
        sb2.append(this.f367196l);
        sb2.append(", extras=");
        sb2.append(this.f367197m);
        sb2.append(", weight=");
        sb2.append(this.f367198n);
        sb2.append(", userHash=");
        sb2.append(this.f367199o);
        sb2.append(", applicationProviderPackage=");
        sb2.append(this.f367200p);
        sb2.append(", providerInfoItems=");
        sb2.append(this.f367201q);
        sb2.append(", providerAppId=");
        return c.i(this.f367202r, ")", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        UserId userId = this.f367186b;
        parcel.writeInt((int) userId.f366761b);
        parcel.writeString(this.f367187c);
        parcel.writeString(this.f367188d);
        parcel.writeLong(this.f367189e);
        parcel.writeString(this.f367190f);
        parcel.writeString(this.f367191g);
        parcel.writeString(this.f367192h);
        parcel.writeString(this.f367193i);
        parcel.writeString(this.f367194j);
        parcel.writeString(this.f367195k);
        parcel.writeString(this.f367196l);
        parcel.writeParcelable(this.f367197m, 0);
        parcel.writeInt(this.f367198n);
        parcel.writeString(this.f367199o);
        parcel.writeString(this.f367200p);
        parcel.writeList(this.f367201q);
        parcel.writeParcelable(userId, 0);
        parcel.writeInt(this.f367202r);
    }

    public SilentAuthInfo(UserId userId, String str, String str2, long j12, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Bundle bundle, int i12, String str10, String str11, List list, int i13, int i14, C42822w c42822w) {
        this(userId, str, str2, j12, (i14 & 16) != 0 ? "" : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : str6, (i14 & 256) != 0 ? "" : str7, (i14 & 512) != 0 ? null : str8, (i14 & 1024) != 0 ? null : str9, (i14 & 2048) != 0 ? null : bundle, (i14 & 4096) != 0 ? 0 : i12, (i14 & 8192) != 0 ? "" : str10, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str11, (32768 & i14) != 0 ? C42784z0.f406748b : list, (i14 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? 0 : i13);
    }

    public SilentAuthInfo(int i12, String str, String str2, long j12, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Bundle bundle, int i13, String str10, String str11, List list, UserId userId, int i14, int i15, C42822w c42822w) {
        this(i12, str, str2, j12, (i15 & 16) != 0 ? "" : str3, (i15 & 32) != 0 ? null : str4, (i15 & 64) != 0 ? null : str5, (i15 & 128) != 0 ? null : str6, (i15 & 256) != 0 ? "" : str7, (i15 & 512) != 0 ? null : str8, (i15 & 1024) != 0 ? null : str9, (i15 & 2048) != 0 ? null : bundle, (i15 & 4096) != 0 ? 0 : i13, (i15 & 8192) != 0 ? "" : str10, (i15 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str11, (32768 & i15) != 0 ? C42784z0.f406748b : list, (65536 & i15) != 0 ? null : userId, (i15 & 131072) != 0 ? 0 : i14);
    }

    @InterfaceC42830m
    public SilentAuthInfo(int i12, @k String str, @k String str2, long j12, @k String str3, @l String str4, @l String str5, @l String str6, @k String str7, @l String str8, @l String str9, @l Bundle bundle, int i13, @k String str10, @l String str11, @k List<SilentTokenProviderInfo> list, @l UserId userId, int i14) {
        this(userId == null ? new UserId(i12) : userId, str, str2, j12, str3, str4, str5, str6, str7, str8, str9, bundle, i13, str10, str11, list, i14);
    }
}
