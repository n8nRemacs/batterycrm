package com.avito.android.mandatory_verification.items.accountVerification;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MandatoryVerificationAccountVerificationItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mandatory_verification/items/accountVerification/MandatoryVerificationAccountVerificationItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Button", "_avito_mandatory-verification-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MandatoryVerificationAccountVerificationItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<MandatoryVerificationAccountVerificationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f184604b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f184605c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f184606d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Button f184607e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f184608f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f184609g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Integer f184610h;

    /* compiled from: MandatoryVerificationAccountVerificationItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/items/accountVerification/MandatoryVerificationAccountVerificationItem$Button;", "Landroid/os/Parcelable;", "_avito_mandatory-verification-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f184611b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f184612c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f184613d;

        /* compiled from: MandatoryVerificationAccountVerificationItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@Y61.k String str, @l DeepLink deepLink, @Y61.k String str2) {
            this.f184611b = str;
            this.f184612c = deepLink;
            this.f184613d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f184611b, button.f184611b) && L.f(this.f184612c, button.f184612c) && L.f(this.f184613d, button.f184613d);
        }

        public final int hashCode() {
            int iHashCode = this.f184611b.hashCode() * 31;
            DeepLink deepLink = this.f184612c;
            return this.f184613d.hashCode() + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.f184611b);
            sb2.append(", link=");
            sb2.append(this.f184612c);
            sb2.append(", style=");
            return C22026a.c(sb2, this.f184613d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f184611b);
            parcel.writeParcelable(this.f184612c, i12);
            parcel.writeString(this.f184613d);
        }
    }

    /* compiled from: MandatoryVerificationAccountVerificationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MandatoryVerificationAccountVerificationItem> {
        @Override // android.os.Parcelable.Creator
        public final MandatoryVerificationAccountVerificationItem createFromParcel(Parcel parcel) {
            return new MandatoryVerificationAccountVerificationItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MandatoryVerificationAccountVerificationItem[] newArray(int i12) {
            return new MandatoryVerificationAccountVerificationItem[i12];
        }
    }

    public MandatoryVerificationAccountVerificationItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @l Button button, boolean z12, @l String str4, @l Integer num) {
        this.f184604b = str;
        this.f184605c = str2;
        this.f184606d = str3;
        this.f184607e = button;
        this.f184608f = z12;
        this.f184609g = str4;
        this.f184610h = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MandatoryVerificationAccountVerificationItem)) {
            return false;
        }
        MandatoryVerificationAccountVerificationItem mandatoryVerificationAccountVerificationItem = (MandatoryVerificationAccountVerificationItem) obj;
        return L.f(this.f184604b, mandatoryVerificationAccountVerificationItem.f184604b) && L.f(this.f184605c, mandatoryVerificationAccountVerificationItem.f184605c) && L.f(this.f184606d, mandatoryVerificationAccountVerificationItem.f184606d) && L.f(this.f184607e, mandatoryVerificationAccountVerificationItem.f184607e) && this.f184608f == mandatoryVerificationAccountVerificationItem.f184608f && L.f(this.f184609g, mandatoryVerificationAccountVerificationItem.f184609g) && L.f(this.f184610h, mandatoryVerificationAccountVerificationItem.f184610h);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154247b() {
        return this.f184604b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f184604b.hashCode() * 31, 31, this.f184605c), 31, this.f184606d);
        Button button = this.f184607e;
        int i12 = r.i((iD2 + (button == null ? 0 : button.hashCode())) * 31, 31, this.f184608f);
        String str = this.f184609g;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f184610h;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MandatoryVerificationAccountVerificationItem(stringId=");
        sb2.append(this.f184604b);
        sb2.append(", title=");
        sb2.append(this.f184605c);
        sb2.append(", description=");
        sb2.append(this.f184606d);
        sb2.append(", button=");
        sb2.append(this.f184607e);
        sb2.append(", showCheckmark=");
        sb2.append(this.f184608f);
        sb2.append(", errorMessage=");
        sb2.append(this.f184609g);
        sb2.append(", topMargin=");
        return s.j(sb2, this.f184610h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f184604b);
        parcel.writeString(this.f184605c);
        parcel.writeString(this.f184606d);
        Button button = this.f184607e;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f184608f ? 1 : 0);
        parcel.writeString(this.f184609g);
        Integer num = this.f184610h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }

    public /* synthetic */ MandatoryVerificationAccountVerificationItem(String str, String str2, String str3, Button button, boolean z12, String str4, Integer num, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? MandatoryVerificationAccountVerificationItem.class.getName() : str, str2, str3, button, z12, str4, (i12 & 64) != 0 ? null : num);
    }
}
