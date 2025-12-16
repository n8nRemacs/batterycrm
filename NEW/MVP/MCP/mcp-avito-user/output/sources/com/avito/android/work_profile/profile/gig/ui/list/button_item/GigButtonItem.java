package com.avito.android.work_profile.profile.gig.ui.list.button_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigButtonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/ui/list/button_item/GigButtonItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "IconType", "Status", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GigButtonItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<GigButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f331190b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f331191c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f331192d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final IconType f331193e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f331194f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f331195g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Status f331196h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f331197i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GigButtonItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/ui/list/button_item/GigButtonItem$IconType;", "", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IconType {

        /* renamed from: b, reason: collision with root package name */
        public static final IconType f331198b;

        /* renamed from: c, reason: collision with root package name */
        public static final IconType f331199c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ IconType[] f331200d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f331201e;

        static {
            IconType iconType = new IconType("SBP", 0);
            f331198b = iconType;
            IconType iconType2 = new IconType("CARD", 1);
            f331199c = iconType2;
            IconType[] iconTypeArr = {iconType, iconType2};
            f331200d = iconTypeArr;
            f331201e = kotlin.enums.c.a(iconTypeArr);
        }

        public IconType() {
            throw null;
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) f331200d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GigButtonItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/ui/list/button_item/GigButtonItem$Status;", "", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final Status f331202b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f331203c;

        /* renamed from: d, reason: collision with root package name */
        public static final Status f331204d;

        /* renamed from: e, reason: collision with root package name */
        public static final Status f331205e;

        /* renamed from: f, reason: collision with root package name */
        public static final Status f331206f;

        /* renamed from: g, reason: collision with root package name */
        public static final Status f331207g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ Status[] f331208h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f331209i;

        static {
            Status status = new Status("DEFAULT", 0);
            f331202b = status;
            Status status2 = new Status("SUCCESS", 1);
            f331203c = status2;
            Status status3 = new Status("FAILED", 2);
            f331204d = status3;
            Status status4 = new Status("PROGRESS", 3);
            f331205e = status4;
            Status status5 = new Status("EXPIRING", 4);
            f331206f = status5;
            Status status6 = new Status("DISABLED", 5);
            f331207g = status6;
            Status[] statusArr = {status, status2, status3, status4, status5, status6};
            f331208h = statusArr;
            f331209i = kotlin.enums.c.a(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f331208h.clone();
        }
    }

    /* compiled from: GigButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final GigButtonItem createFromParcel(Parcel parcel) {
            return new GigButtonItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(GigButtonItem.class.getClassLoader()), parcel.readInt() == 0 ? null : IconType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GigButtonItem[] newArray(int i12) {
            return new GigButtonItem[i12];
        }
    }

    public GigButtonItem(@k String str, @k String str2, @l DeepLink deepLink, @l IconType iconType, @l String str3, @l String str4, @l Status status, @k String str5) {
        this.f331190b = str;
        this.f331191c = str2;
        this.f331192d = deepLink;
        this.f331193e = iconType;
        this.f331194f = str3;
        this.f331195g = str4;
        this.f331196h = status;
        this.f331197i = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GigButtonItem)) {
            return false;
        }
        GigButtonItem gigButtonItem = (GigButtonItem) obj;
        return L.f(this.f331190b, gigButtonItem.f331190b) && L.f(this.f331191c, gigButtonItem.f331191c) && L.f(this.f331192d, gigButtonItem.f331192d) && this.f331193e == gigButtonItem.f331193e && L.f(this.f331194f, gigButtonItem.f331194f) && L.f(this.f331195g, gigButtonItem.f331195g) && this.f331196h == gigButtonItem.f331196h && L.f(this.f331197i, gigButtonItem.f331197i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80070b() {
        return getF302737b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF302737b() {
        return this.f331197i;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f331190b.hashCode() * 31, 31, this.f331191c);
        DeepLink deepLink = this.f331192d;
        int iHashCode = (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        IconType iconType = this.f331193e;
        int iHashCode2 = (iHashCode + (iconType == null ? 0 : iconType.hashCode())) * 31;
        String str = this.f331194f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f331195g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Status status = this.f331196h;
        return this.f331197i.hashCode() + ((iHashCode4 + (status != null ? status.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigButtonItem(title=");
        sb2.append(this.f331190b);
        sb2.append(", subtitle=");
        sb2.append(this.f331191c);
        sb2.append(", deeplink=");
        sb2.append(this.f331192d);
        sb2.append(", iconType=");
        sb2.append(this.f331193e);
        sb2.append(", iconUrl=");
        sb2.append(this.f331194f);
        sb2.append(", trailingText=");
        sb2.append(this.f331195g);
        sb2.append(", status=");
        sb2.append(this.f331196h);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f331197i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f331190b);
        parcel.writeString(this.f331191c);
        parcel.writeParcelable(this.f331192d, i12);
        IconType iconType = this.f331193e;
        if (iconType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iconType.name());
        }
        parcel.writeString(this.f331194f);
        parcel.writeString(this.f331195g);
        Status status = this.f331196h;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
        parcel.writeString(this.f331197i);
    }

    public /* synthetic */ GigButtonItem(String str, String str2, DeepLink deepLink, IconType iconType, String str3, String str4, Status status, String str5, int i12, C42822w c42822w) {
        this(str, str2, deepLink, iconType, str3, str4, status, (i12 & 128) != 0 ? GigButtonItem.class.getName() : str5);
    }
}
