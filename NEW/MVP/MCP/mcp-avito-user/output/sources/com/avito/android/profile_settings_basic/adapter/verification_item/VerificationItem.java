package com.avito.android.profile_settings_basic.adapter.verification_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_settings_basic.adapter.BasicSettingsListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/verification_item/VerificationItem;", "Lcom/avito/android/profile_settings_basic/adapter/BasicSettingsListItem;", "Status", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VerificationItem implements BasicSettingsListItem {

    @k
    public static final Parcelable.Creator<VerificationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f228708b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f228709c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f228710d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Status f228711e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f228712f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VerificationItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/verification_item/VerificationItem$Status;", "", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f228713b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f228714c;

        /* renamed from: d, reason: collision with root package name */
        public static final Status f228715d;

        /* renamed from: e, reason: collision with root package name */
        public static final Status f228716e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Status[] f228717f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f228718g;

        /* compiled from: VerificationItem.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/verification_item/VerificationItem$Status$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            Status status = new Status("IN_PROGRESS", 0);
            f228714c = status;
            Status status2 = new Status("ERROR", 1);
            f228715d = status2;
            Status status3 = new Status("INFO", 2);
            f228716e = status3;
            Status[] statusArr = {status, status2, status3};
            f228717f = statusArr;
            f228718g = kotlin.enums.c.a(statusArr);
            f228713b = new a(null);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f228717f.clone();
        }
    }

    /* compiled from: VerificationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationItem> {
        @Override // android.os.Parcelable.Creator
        public final VerificationItem createFromParcel(Parcel parcel) {
            return new VerificationItem(parcel.readString(), parcel.readString(), parcel.readString(), Status.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(VerificationItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationItem[] newArray(int i12) {
            return new VerificationItem[i12];
        }
    }

    public VerificationItem(@k String str, @k String str2, @l String str3, @k Status status, @k DeepLink deepLink) {
        this.f228708b = str;
        this.f228709c = str2;
        this.f228710d = str3;
        this.f228711e = status;
        this.f228712f = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationItem)) {
            return false;
        }
        VerificationItem verificationItem = (VerificationItem) obj;
        return L.f(this.f228708b, verificationItem.f228708b) && L.f(this.f228709c, verificationItem.f228709c) && L.f(this.f228710d, verificationItem.f228710d) && this.f228711e == verificationItem.f228711e && L.f(this.f228712f, verificationItem.f228712f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223392b() {
        return this.f228708b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f228708b.hashCode() * 31, 31, this.f228709c);
        String str = this.f228710d;
        return this.f228712f.hashCode() + ((this.f228711e.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationItem(stringId=");
        sb2.append(this.f228708b);
        sb2.append(", title=");
        sb2.append(this.f228709c);
        sb2.append(", subtitle=");
        sb2.append(this.f228710d);
        sb2.append(", status=");
        sb2.append(this.f228711e);
        sb2.append(", action=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f228712f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f228708b);
        parcel.writeString(this.f228709c);
        parcel.writeString(this.f228710d);
        parcel.writeString(this.f228711e.name());
        parcel.writeParcelable(this.f228712f, i12);
    }

    public /* synthetic */ VerificationItem(String str, String str2, String str3, Status status, DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "action_item" : str, str2, str3, status, deepLink);
    }
}
