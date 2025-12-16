package com.avito.android.publish.items.iac_for_pro_enabled;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.items.iac_for_pro.IacProBlockItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacForProEnabledItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro_enabled/IacForProEnabledItem;", "Lcom/avito/android/publish/items/iac_for_pro/IacProBlockItem;", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class IacForProEnabledItem implements IacProBlockItem {

    @k
    public static final Parcelable.Creator<IacForProEnabledItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f236933b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f236934c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f236935d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f236936e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f236937f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f236938g;

    /* compiled from: IacForProEnabledItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacForProEnabledItem> {
        @Override // android.os.Parcelable.Creator
        public final IacForProEnabledItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            return new IacForProEnabledItem((AttributedText) parcel.readParcelable(IacForProEnabledItem.class.getClassLoader()), string, parcel.readString(), parcel.readString(), z12, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IacForProEnabledItem[] newArray(int i12) {
            return new IacForProEnabledItem[i12];
        }
    }

    /* compiled from: IacForProEnabledItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro_enabled/IacForProEnabledItem$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/publish/items/iac_for_pro_enabled/IacForProEnabledItem$b$a;", "Lcom/avito/android/publish/items/iac_for_pro_enabled/IacForProEnabledItem$b$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: IacForProEnabledItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro_enabled/IacForProEnabledItem$b$a;", "Lcom/avito/android/publish/items/iac_for_pro_enabled/IacForProEnabledItem$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final IacForProEnabledItem f236939a;

            public a(@k IacForProEnabledItem iacForProEnabledItem) {
                super(null);
                this.f236939a = iacForProEnabledItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f236939a, ((a) obj).f236939a);
            }

            public final int hashCode() {
                return this.f236939a.hashCode();
            }

            @k
            public final String toString() {
                return "DeviceCheckedChange(item=" + this.f236939a + ')';
            }
        }

        /* compiled from: IacForProEnabledItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro_enabled/IacForProEnabledItem$b$b;", "Lcom/avito/android/publish/items/iac_for_pro_enabled/IacForProEnabledItem$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.items.iac_for_pro_enabled.IacForProEnabledItem$b$b, reason: collision with other inner class name */
        public static final /* data */ class C7139b extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final IacForProEnabledItem f236940a;

            public C7139b(@k IacForProEnabledItem iacForProEnabledItem) {
                super(null);
                this.f236940a = iacForProEnabledItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7139b) && L.f(this.f236940a, ((C7139b) obj).f236940a);
            }

            public final int hashCode() {
                return this.f236940a.hashCode();
            }

            @k
            public final String toString() {
                return "OpenConfirmDisablingDialog(item=" + this.f236940a + ')';
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public IacForProEnabledItem(@k AttributedText attributedText, @k String str, @k String str2, @k String str3, boolean z12, boolean z13) {
        this.f236933b = str;
        this.f236934c = z12;
        this.f236935d = str2;
        this.f236936e = attributedText;
        this.f236937f = str3;
        this.f236938g = z13;
    }

    public static IacForProEnabledItem a(IacForProEnabledItem iacForProEnabledItem, boolean z12) {
        String str = iacForProEnabledItem.f236933b;
        String str2 = iacForProEnabledItem.f236935d;
        AttributedText attributedText = iacForProEnabledItem.f236936e;
        String str3 = iacForProEnabledItem.f236937f;
        boolean z13 = iacForProEnabledItem.f236938g;
        iacForProEnabledItem.getClass();
        return new IacForProEnabledItem(attributedText, str, str2, str3, z12, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacForProEnabledItem)) {
            return false;
        }
        IacForProEnabledItem iacForProEnabledItem = (IacForProEnabledItem) obj;
        return L.f(this.f236933b, iacForProEnabledItem.f236933b) && this.f236934c == iacForProEnabledItem.f236934c && L.f(this.f236935d, iacForProEnabledItem.f236935d) && L.f(this.f236936e, iacForProEnabledItem.f236936e) && L.f(this.f236937f, iacForProEnabledItem.f236937f) && this.f236938g == iacForProEnabledItem.f236938g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF132087b() {
        return this.f236933b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f236938g) + H.d(com.avito.android.actions_sheet.a.b(H.d(r.i(this.f236933b.hashCode() * 31, 31, this.f236934c), 31, this.f236935d), 31, this.f236936e), 31, this.f236937f);
    }

    @Override // com.avito.android.publish.items.iac_for_pro.IacProBlockItem
    /* renamed from: p0, reason: from getter */
    public final boolean getF236904c() {
        return this.f236934c;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacForProEnabledItem(stringId=");
        sb2.append(this.f236933b);
        sb2.append(", deviceChecked=");
        sb2.append(this.f236934c);
        sb2.append(", title=");
        sb2.append(this.f236935d);
        sb2.append(", text=");
        sb2.append(this.f236936e);
        sb2.append(", switcherTitle=");
        sb2.append(this.f236937f);
        sb2.append(", isEditing=");
        return r.x(sb2, this.f236938g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f236933b);
        parcel.writeInt(this.f236934c ? 1 : 0);
        parcel.writeString(this.f236935d);
        parcel.writeParcelable(this.f236936e, i12);
        parcel.writeString(this.f236937f);
        parcel.writeInt(this.f236938g ? 1 : 0);
    }
}
