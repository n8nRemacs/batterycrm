package com.avito.android.multi_message_send.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import com.akita.compose.component.chips.InterfaceC27333b;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiSendAnchor.kt */
@d
@H0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/multi_message_send/model/MultiSendAnchor;", "Lcom/akita/compose/component/chips/b;", "Landroid/os/Parcelable;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MultiSendAnchor implements InterfaceC27333b, Parcelable {

    @k
    public static final Parcelable.Creator<MultiSendAnchor> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f206737b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f206738c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f206739d;

    /* compiled from: MultiSendAnchor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MultiSendAnchor> {
        @Override // android.os.Parcelable.Creator
        public final MultiSendAnchor createFromParcel(Parcel parcel) {
            return new MultiSendAnchor(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiSendAnchor[] newArray(int i12) {
            return new MultiSendAnchor[i12];
        }
    }

    public MultiSendAnchor(@k String str, boolean z12, @k String str2) {
        this.f206737b = str;
        this.f206738c = z12;
        this.f206739d = str2;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @InterfaceC42165v
    @l
    /* renamed from: c */
    public final Integer getF60871f() {
        return null;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @InterfaceC42165v
    @l
    /* renamed from: d */
    public final Integer getF60870e() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiSendAnchor)) {
            return false;
        }
        MultiSendAnchor multiSendAnchor = (MultiSendAnchor) obj;
        return L.f(this.f206737b, multiSendAnchor.f206737b) && this.f206738c == multiSendAnchor.f206738c && L.f(this.f206739d, multiSendAnchor.f206739d);
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF206739d() {
        return this.f206739d;
    }

    public final int hashCode() {
        return this.f206739d.hashCode() + r.i(this.f206737b.hashCode() * 31, 31, this.f206738c);
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isActive */
    public final boolean getF99070e() {
        return true;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isEnabled */
    public final boolean getF439534e() {
        return true;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isSelected, reason: from getter */
    public final boolean getF206738c() {
        return this.f206738c;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiSendAnchor(id=");
        sb2.append(this.f206737b);
        sb2.append(", isSelected=");
        sb2.append(this.f206738c);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f206739d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f206737b);
        parcel.writeInt(this.f206738c ? 1 : 0);
        parcel.writeString(this.f206739d);
    }
}
