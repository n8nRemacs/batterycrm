package com.avito.android.profile_phones.phones_list.phone_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PhoneListItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/phone_item/PhoneListItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "Action", "Status", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneListItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<PhoneListItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f228126b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f228127c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f228128d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Status f228129e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f228130f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f228131g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<Action> f228132h;

    /* renamed from: i, reason: collision with root package name */
    public final int f228133i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f228134j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f228135k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f228136l;

    /* compiled from: PhoneListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/phone_item/PhoneListItem$Action;", "Landroid/os/Parcelable;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f228137b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f228138c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f228139d;

        /* compiled from: PhoneListItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Action> {
            @Override // android.os.Parcelable.Creator
            public final Action createFromParcel(Parcel parcel) {
                return new Action(parcel.readString(), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k String str, boolean z12, @k DeepLink deepLink) {
            this.f228137b = str;
            this.f228138c = z12;
            this.f228139d = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f228137b);
            parcel.writeInt(this.f228138c ? 1 : 0);
            parcel.writeParcelable(this.f228139d, i12);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhoneListItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/phone_item/PhoneListItem$Status;", "", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final Status f228140b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f228141c;

        /* renamed from: d, reason: collision with root package name */
        public static final Status f228142d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Status[] f228143e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f228144f;

        static {
            Status status = new Status("ON_VERIFICATION", 0);
            f228140b = status;
            Status status2 = new Status("VERIFIED", 1);
            f228141c = status2;
            Status status3 = new Status("NOT_VERIFIED", 2);
            f228142d = status3;
            Status[] statusArr = {status, status2, status3};
            f228143e = statusArr;
            f228144f = kotlin.enums.c.a(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f228143e.clone();
        }
    }

    /* compiled from: PhoneListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneListItem> {
        @Override // android.os.Parcelable.Creator
        public final PhoneListItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Status statusValueOf = Status.valueOf(parcel.readString());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Action.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new PhoneListItem(string, string2, string3, statusValueOf, string4, string5, arrayList, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneListItem[] newArray(int i12) {
            return new PhoneListItem[i12];
        }
    }

    public PhoneListItem(@k String str, @k String str2, @k String str3, @k Status status, @l String str4, @l String str5, @k List<Action> list, int i12, boolean z12, boolean z13, boolean z14) {
        this.f228126b = str;
        this.f228127c = str2;
        this.f228128d = str3;
        this.f228129e = status;
        this.f228130f = str4;
        this.f228131g = str5;
        this.f228132h = list;
        this.f228133i = i12;
        this.f228134j = z12;
        this.f228135k = z13;
        this.f228136l = z14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222258b() {
        return getF223585b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223585b() {
        return this.f228126b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f228126b);
        parcel.writeString(this.f228127c);
        parcel.writeString(this.f228128d);
        parcel.writeString(this.f228129e.name());
        parcel.writeString(this.f228130f);
        parcel.writeString(this.f228131g);
        Iterator itJ = C0.j(this.f228132h, parcel);
        while (itJ.hasNext()) {
            ((Action) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f228133i);
        parcel.writeInt(this.f228134j ? 1 : 0);
        parcel.writeInt(this.f228135k ? 1 : 0);
        parcel.writeInt(this.f228136l ? 1 : 0);
    }
}
