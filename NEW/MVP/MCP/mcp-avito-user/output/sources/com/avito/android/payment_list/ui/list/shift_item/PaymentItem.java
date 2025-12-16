package com.avito.android.payment_list.ui.list.shift_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: PaymentItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/payment_list/ui/list/shift_item/PaymentItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "IconType", "Status", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PaymentItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<PaymentItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f215043b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f215044c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f215045d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final IconType f215046e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f215047f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f215048g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Status f215049h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f215050i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment_list/ui/list/shift_item/PaymentItem$IconType;", "", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IconType {

        /* renamed from: b, reason: collision with root package name */
        public static final IconType f215051b;

        /* renamed from: c, reason: collision with root package name */
        public static final IconType f215052c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ IconType[] f215053d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f215054e;

        static {
            IconType iconType = new IconType("SBP", 0);
            f215051b = iconType;
            IconType iconType2 = new IconType("CARD", 1);
            f215052c = iconType2;
            IconType[] iconTypeArr = {iconType, iconType2};
            f215053d = iconTypeArr;
            f215054e = kotlin.enums.c.a(iconTypeArr);
        }

        public IconType() {
            throw null;
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) f215053d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment_list/ui/list/shift_item/PaymentItem$Status;", "", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final Status f215055b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f215056c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Status[] f215057d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f215058e;

        static {
            Status status = new Status("DEFAULT", 0);
            f215055b = status;
            Status status2 = new Status("FAILED", 1);
            f215056c = status2;
            Status[] statusArr = {status, status2};
            f215057d = statusArr;
            f215058e = kotlin.enums.c.a(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f215057d.clone();
        }
    }

    /* compiled from: PaymentItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentItem> {
        @Override // android.os.Parcelable.Creator
        public final PaymentItem createFromParcel(Parcel parcel) {
            return new PaymentItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(PaymentItem.class.getClassLoader()), parcel.readInt() == 0 ? null : IconType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentItem[] newArray(int i12) {
            return new PaymentItem[i12];
        }
    }

    public PaymentItem(@k String str, @k String str2, @l DeepLink deepLink, @l IconType iconType, @l String str3, @l String str4, @l Status status, @k String str5) {
        this.f215043b = str;
        this.f215044c = str2;
        this.f215045d = deepLink;
        this.f215046e = iconType;
        this.f215047f = str3;
        this.f215048g = str4;
        this.f215049h = status;
        this.f215050i = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84654b() {
        return getF202409b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF202409b() {
        return this.f215050i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f215043b);
        parcel.writeString(this.f215044c);
        parcel.writeParcelable(this.f215045d, i12);
        IconType iconType = this.f215046e;
        if (iconType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iconType.name());
        }
        parcel.writeString(this.f215047f);
        parcel.writeString(this.f215048g);
        Status status = this.f215049h;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
        parcel.writeString(this.f215050i);
    }
}
