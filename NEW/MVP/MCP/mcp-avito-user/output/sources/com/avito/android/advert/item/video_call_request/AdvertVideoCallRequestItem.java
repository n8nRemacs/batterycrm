package com.avito.android.advert.item.video_call_request;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertVideoCallRequestItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/video_call_request/AdvertVideoCallRequestItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "a", "Type", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertVideoCallRequestItem implements BlockItem {

    @k
    public static final Parcelable.Creator<AdvertVideoCallRequestItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public final long f80676b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f80677c;

    /* renamed from: d, reason: collision with root package name */
    public final int f80678d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f80679e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Type f80680f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f80681g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f80682h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertVideoCallRequestItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/video_call_request/AdvertVideoCallRequestItem$Type;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f80683b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f80684c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f80685d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f80686e;

        static {
            Type type = new Type("VIDEO_CALL_REQUEST", 0);
            f80683b = type;
            Type type2 = new Type("MESSENGER", 1);
            f80684c = type2;
            Type[] typeArr = {type, type2};
            f80685d = typeArr;
            f80686e = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f80685d.clone();
        }
    }

    /* compiled from: AdvertVideoCallRequestItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/video_call_request/AdvertVideoCallRequestItem$a;", "", "<init>", "()V", "", "VIDEO_CALL_REQUEST_KEY", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertVideoCallRequestItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AdvertVideoCallRequestItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertVideoCallRequestItem createFromParcel(Parcel parcel) {
            return new AdvertVideoCallRequestItem(parcel.readLong(), parcel.readString(), parcel.readInt(), (DeepLink) parcel.readParcelable(AdvertVideoCallRequestItem.class.getClassLoader()), Type.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertVideoCallRequestItem[] newArray(int i12) {
            return new AdvertVideoCallRequestItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public AdvertVideoCallRequestItem(long j12, @k String str, int i12, @k DeepLink deepLink, @k Type type, boolean z12, boolean z13) {
        this.f80676b = j12;
        this.f80677c = str;
        this.f80678d = i12;
        this.f80679e = deepLink;
        this.f80680f = type;
        this.f80681g = z12;
        this.f80682h = z13;
    }

    public static AdvertVideoCallRequestItem a(AdvertVideoCallRequestItem advertVideoCallRequestItem, int i12, DeepLink deepLink, int i13) {
        Type type = Type.f80684c;
        long j12 = advertVideoCallRequestItem.f80676b;
        String str = advertVideoCallRequestItem.f80677c;
        if ((i13 & 4) != 0) {
            i12 = advertVideoCallRequestItem.f80678d;
        }
        int i14 = i12;
        if ((i13 & 8) != 0) {
            deepLink = advertVideoCallRequestItem.f80679e;
        }
        DeepLink deepLink2 = deepLink;
        if ((i13 & 16) != 0) {
            type = advertVideoCallRequestItem.f80680f;
        }
        boolean z12 = advertVideoCallRequestItem.f80681g;
        boolean z13 = advertVideoCallRequestItem.f80682h;
        advertVideoCallRequestItem.getClass();
        return new AdvertVideoCallRequestItem(j12, str, i14, deepLink2, type, z12, z13);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return a(this, i12, null, 123);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertVideoCallRequestItem)) {
            return false;
        }
        AdvertVideoCallRequestItem advertVideoCallRequestItem = (AdvertVideoCallRequestItem) obj;
        return this.f80676b == advertVideoCallRequestItem.f80676b && L.f(this.f80677c, advertVideoCallRequestItem.f80677c) && this.f80678d == advertVideoCallRequestItem.f80678d && L.f(this.f80679e, advertVideoCallRequestItem.f80679e) && this.f80680f == advertVideoCallRequestItem.f80680f && this.f80681g == advertVideoCallRequestItem.f80681g && this.f80682h == advertVideoCallRequestItem.f80682h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF78219b() {
        return this.f80676b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78221d() {
        return this.f80678d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78220c() {
        return this.f80677c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f80682h) + r.i((this.f80680f.hashCode() + com.avito.android.actions_sheet.a.e(this.f80679e, r.e(this.f80678d, H.d(Long.hashCode(this.f80676b) * 31, 31, this.f80677c), 31), 31)) * 31, 31, this.f80681g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertVideoCallRequestItem(id=");
        sb2.append(this.f80676b);
        sb2.append(", stringId=");
        sb2.append(this.f80677c);
        sb2.append(", spanCount=");
        sb2.append(this.f80678d);
        sb2.append(", deeplink=");
        sb2.append(this.f80679e);
        sb2.append(", type=");
        sb2.append(this.f80680f);
        sb2.append(", isForceGrayButtonStyle=");
        sb2.append(this.f80681g);
        sb2.append(", isRedesign=");
        return r.x(sb2, this.f80682h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f80676b);
        parcel.writeString(this.f80677c);
        parcel.writeInt(this.f80678d);
        parcel.writeParcelable(this.f80679e, i12);
        parcel.writeString(this.f80680f.name());
        parcel.writeInt(this.f80681g ? 1 : 0);
        parcel.writeInt(this.f80682h ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertVideoCallRequestItem(long j12, String str, int i12, DeepLink deepLink, Type type, boolean z12, boolean z13, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 159;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, deepLink, type, z12, z13);
    }
}
