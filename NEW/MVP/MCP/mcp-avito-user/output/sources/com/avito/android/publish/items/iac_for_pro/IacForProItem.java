package com.avito.android.publish.items.iac_for_pro;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacForProItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro/IacForProItem;", "Lcom/avito/android/publish/items/iac_for_pro/IacProBlockItem;", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class IacForProItem implements IacProBlockItem {

    @k
    public static final Parcelable.Creator<IacForProItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f236903b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f236904c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f236905d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f236906e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f236907f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f236908g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f236909h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f236910i;

    /* compiled from: IacForProItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacForProItem> {
        @Override // android.os.Parcelable.Creator
        public final IacForProItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            return new IacForProItem(parcel.readInt() != 0, string, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IacForProItem[] newArray(int i12) {
            return new IacForProItem[i12];
        }
    }

    /* compiled from: IacForProItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro/IacForProItem$b;", "", "<init>", "()V", "a", "Lcom/avito/android/publish/items/iac_for_pro/IacForProItem$b$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: IacForProItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro/IacForProItem$b$a;", "Lcom/avito/android/publish/items/iac_for_pro/IacForProItem$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final IacForProItem f236911a;

            public a(@k IacForProItem iacForProItem) {
                super(null);
                this.f236911a = iacForProItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f236911a, ((a) obj).f236911a);
            }

            public final int hashCode() {
                return this.f236911a.hashCode();
            }

            @k
            public final String toString() {
                return "DeviceCheckedChange(item=" + this.f236911a + ')';
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public IacForProItem(boolean z12, @k String str, @k String str2, boolean z13, boolean z14, boolean z15, @k String str3, @k String str4) {
        this.f236903b = str;
        this.f236904c = z12;
        this.f236905d = str2;
        this.f236906e = str3;
        this.f236907f = str4;
        this.f236908g = z13;
        this.f236909h = z14;
        this.f236910i = z15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacForProItem)) {
            return false;
        }
        IacForProItem iacForProItem = (IacForProItem) obj;
        return L.f(this.f236903b, iacForProItem.f236903b) && this.f236904c == iacForProItem.f236904c && L.f(this.f236905d, iacForProItem.f236905d) && L.f(this.f236906e, iacForProItem.f236906e) && L.f(this.f236907f, iacForProItem.f236907f) && this.f236908g == iacForProItem.f236908g && this.f236909h == iacForProItem.f236909h && this.f236910i == iacForProItem.f236910i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF164006b() {
        return this.f236903b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f236910i) + r.i(r.i(H.d(H.d(H.d(r.i(this.f236903b.hashCode() * 31, 31, this.f236904c), 31, this.f236905d), 31, this.f236906e), 31, this.f236907f), 31, this.f236908g), 31, this.f236909h);
    }

    @Override // com.avito.android.publish.items.iac_for_pro.IacProBlockItem
    /* renamed from: p0, reason: from getter */
    public final boolean getF236934c() {
        return this.f236904c;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacForProItem(stringId=");
        sb2.append(this.f236903b);
        sb2.append(", deviceChecked=");
        sb2.append(this.f236904c);
        sb2.append(", title=");
        sb2.append(this.f236905d);
        sb2.append(", text=");
        sb2.append(this.f236906e);
        sb2.append(", deviceTitle=");
        sb2.append(this.f236907f);
        sb2.append(", isEditing=");
        sb2.append(this.f236908g);
        sb2.append(", hasTopMargin=");
        sb2.append(this.f236909h);
        sb2.append(", isRedesigned=");
        return r.x(sb2, this.f236910i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f236903b);
        parcel.writeInt(this.f236904c ? 1 : 0);
        parcel.writeString(this.f236905d);
        parcel.writeString(this.f236906e);
        parcel.writeString(this.f236907f);
        parcel.writeInt(this.f236908g ? 1 : 0);
        parcel.writeInt(this.f236909h ? 1 : 0);
        parcel.writeInt(this.f236910i ? 1 : 0);
    }
}
