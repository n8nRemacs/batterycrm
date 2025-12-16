package com.avito.android.publish.items.iac_devices;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.items.ItemWithState;
import com.avito.android.publish.iac_devices.IacDevice;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacDevicesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/iac_devices/IacDevicesItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Lcom/avito/android/items/ItemWithState;", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class IacDevicesItem implements ParcelableItem, ItemWithState {

    @k
    public static final Parcelable.Creator<IacDevicesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f236852b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public ItemWithState.State f236853c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<IacDevice> f236854d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f236855e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f236856f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f236857g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f236858h;

    /* compiled from: IacDevicesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacDevicesItem> {
        @Override // android.os.Parcelable.Creator
        public final IacDevicesItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ItemWithState.State state = (ItemWithState.State) parcel.readParcelable(IacDevicesItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(IacDevice.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new IacDevicesItem(string, state, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IacDevicesItem[] newArray(int i12) {
            return new IacDevicesItem[i12];
        }
    }

    /* compiled from: IacDevicesItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/items/iac_devices/IacDevicesItem$b;", "", "<init>", "()V", "a", "Lcom/avito/android/publish/items/iac_devices/IacDevicesItem$b$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: IacDevicesItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/iac_devices/IacDevicesItem$b$a;", "Lcom/avito/android/publish/items/iac_devices/IacDevicesItem$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final IacDevicesItem f236859a;

            public a(@k IacDevicesItem iacDevicesItem) {
                super(null);
                this.f236859a = iacDevicesItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f236859a, ((a) obj).f236859a);
            }

            public final int hashCode() {
                return this.f236859a.hashCode();
            }

            @k
            public final String toString() {
                return "DeviceViewClick(item=" + this.f236859a + ')';
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public IacDevicesItem(@k String str, @k ItemWithState.State state, @k List<IacDevice> list, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f236852b = str;
        this.f236853c = state;
        this.f236854d = list;
        this.f236855e = z12;
        this.f236856f = z13;
        this.f236857g = z14;
        this.f236858h = z15;
    }

    public static IacDevicesItem a(IacDevicesItem iacDevicesItem, List list, boolean z12, boolean z13, int i12) {
        String str = iacDevicesItem.f236852b;
        ItemWithState.State state = iacDevicesItem.f236853c;
        if ((i12 & 4) != 0) {
            list = iacDevicesItem.f236854d;
        }
        List list2 = list;
        boolean z14 = iacDevicesItem.f236855e;
        boolean z15 = iacDevicesItem.f236856f;
        if ((i12 & 32) != 0) {
            z12 = iacDevicesItem.f236857g;
        }
        boolean z16 = z12;
        if ((i12 & 64) != 0) {
            z13 = iacDevicesItem.f236858h;
        }
        iacDevicesItem.getClass();
        return new IacDevicesItem(str, state, list2, z14, z15, z16, z13);
    }

    @Override // com.avito.android.items.ItemWithState
    public final void O0(@k ItemWithState.State state) {
        this.f236853c = state;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacDevicesItem)) {
            return false;
        }
        IacDevicesItem iacDevicesItem = (IacDevicesItem) obj;
        return L.f(this.f236852b, iacDevicesItem.f236852b) && L.f(this.f236853c, iacDevicesItem.f236853c) && L.f(this.f236854d, iacDevicesItem.f236854d) && this.f236855e == iacDevicesItem.f236855e && this.f236856f == iacDevicesItem.f236856f && this.f236857g == iacDevicesItem.f236857g && this.f236858h == iacDevicesItem.f236858h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.items.ItemWithState
    @k
    /* renamed from: getState, reason: from getter */
    public final ItemWithState.State getF236967e() {
        return this.f236853c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF162964b() {
        return this.f236852b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f236858h) + r.i(r.i(r.i(H.e((this.f236853c.hashCode() + (this.f236852b.hashCode() * 31)) * 31, 31, this.f236854d), 31, this.f236855e), 31, this.f236856f), 31, this.f236857g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacDevicesItem(stringId=");
        sb2.append(this.f236852b);
        sb2.append(", state=");
        sb2.append(this.f236853c);
        sb2.append(", devices=");
        sb2.append(this.f236854d);
        sb2.append(", isPro=");
        sb2.append(this.f236855e);
        sb2.append(", isEnabled=");
        sb2.append(this.f236856f);
        sb2.append(", needShowErrorValidation=");
        sb2.append(this.f236857g);
        sb2.append(", needShowOnBoarding=");
        return r.x(sb2, this.f236858h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f236852b);
        parcel.writeParcelable(this.f236853c, i12);
        Iterator itJ = C0.j(this.f236854d, parcel);
        while (itJ.hasNext()) {
            ((IacDevice) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f236855e ? 1 : 0);
        parcel.writeInt(this.f236856f ? 1 : 0);
        parcel.writeInt(this.f236857g ? 1 : 0);
        parcel.writeInt(this.f236858h ? 1 : 0);
    }

    public /* synthetic */ IacDevicesItem(String str, ItemWithState.State state, List list, boolean z12, boolean z13, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? new ItemWithState.State.Normal(null, 1, null) : state, list, z12, z13, z14, z15);
    }
}
