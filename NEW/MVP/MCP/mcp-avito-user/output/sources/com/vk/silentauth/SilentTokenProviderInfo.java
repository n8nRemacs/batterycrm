package com.vk.silentauth;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.vk.dto.common.id.UserId;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SilentTokenProviderInfo.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/silentauth/SilentTokenProviderInfo;", "Landroid/os/Parcelable;", "b", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SilentTokenProviderInfo implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UserId f367204b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f367205c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f367206d;

    /* renamed from: e, reason: collision with root package name */
    public final long f367207e;

    /* renamed from: f, reason: collision with root package name */
    public final int f367208f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f367209g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final b f367203h = new b(null);

    @f
    @k
    public static final Parcelable.Creator<SilentTokenProviderInfo> CREATOR = new a();

    /* compiled from: SilentTokenProviderInfo.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/vk/silentauth/SilentTokenProviderInfo$a", "Landroid/os/Parcelable$Creator;", "Lcom/vk/silentauth/SilentTokenProviderInfo;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SilentTokenProviderInfo> {
        @Override // android.os.Parcelable.Creator
        public final SilentTokenProviderInfo createFromParcel(Parcel parcel) {
            return new SilentTokenProviderInfo((UserId) parcel.readParcelable(UserId.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SilentTokenProviderInfo[] newArray(int i12) {
            return new SilentTokenProviderInfo[i12];
        }
    }

    /* compiled from: SilentTokenProviderInfo.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/vk/silentauth/SilentTokenProviderInfo$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/vk/silentauth/SilentTokenProviderInfo;", "CREATOR", "Landroid/os/Parcelable$Creator;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public SilentTokenProviderInfo(@k UserId userId, @k String str, @k String str2, long j12, int i12, @l String str3) {
        this.f367204b = userId;
        this.f367205c = str;
        this.f367206d = str2;
        this.f367207e = j12;
        this.f367208f = i12;
        this.f367209g = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SilentTokenProviderInfo)) {
            return false;
        }
        SilentTokenProviderInfo silentTokenProviderInfo = (SilentTokenProviderInfo) obj;
        return L.f(this.f367204b, silentTokenProviderInfo.f367204b) && L.f(this.f367205c, silentTokenProviderInfo.f367205c) && L.f(this.f367206d, silentTokenProviderInfo.f367206d) && this.f367207e == silentTokenProviderInfo.f367207e && this.f367208f == silentTokenProviderInfo.f367208f && L.f(this.f367209g, silentTokenProviderInfo.f367209g);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f367208f, r.g(H.d(H.d(Long.hashCode(this.f367204b.f366761b) * 31, 31, this.f367205c), 31, this.f367206d), 31, this.f367207e), 31);
        String str = this.f367209g;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        return "SilentTokenProviderInfo(userId=" + this.f367204b + ", uuid=" + this.f367205c + ", token=" + this.f367206d + ", expireTime=" + this.f367207e + ", weight=" + this.f367208f + ", applicationProviderPackage=" + this.f367209g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f367204b, 0);
        parcel.writeString(this.f367205c);
        parcel.writeString(this.f367206d);
        parcel.writeLong(this.f367207e);
        parcel.writeInt(this.f367208f);
        parcel.writeString(this.f367209g);
    }

    public /* synthetic */ SilentTokenProviderInfo(UserId userId, String str, String str2, long j12, int i12, String str3, int i13, C42822w c42822w) {
        this(userId, str, str2, j12, (i13 & 16) != 0 ? 0 : i12, (i13 & 32) != 0 ? null : str3);
    }
}
