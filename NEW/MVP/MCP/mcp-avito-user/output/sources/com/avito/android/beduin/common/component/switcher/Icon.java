package com.avito.android.beduin.common.component.switcher;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Icon.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000e¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/component/switcher/Icon;", "Landroid/os/Parcelable;", "", "image", "Lcom/avito/android/remote/model/UniversalColor;", "tintColor", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "", "getImageAttr", "()Ljava/lang/Integer;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/component/switcher/Icon;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getImage", "Lcom/avito/android/remote/model/UniversalColor;", "getTintColor", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Icon implements Parcelable {

    @k
    public static final Parcelable.Creator<Icon> CREATOR = new a();

    @k
    private final String image;

    @l
    private final UniversalColor tintColor;

    /* compiled from: Icon.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Icon> {
        @Override // android.os.Parcelable.Creator
        public final Icon createFromParcel(Parcel parcel) {
            return new Icon(parcel.readString(), (UniversalColor) parcel.readParcelable(Icon.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Icon[] newArray(int i12) {
            return new Icon[i12];
        }
    }

    public Icon(@k String str, @l UniversalColor universalColor) {
        this.image = str;
        this.tintColor = universalColor;
    }

    public static /* synthetic */ Icon copy$default(Icon icon, String str, UniversalColor universalColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = icon.image;
        }
        if ((i12 & 2) != 0) {
            universalColor = icon.tintColor;
        }
        return icon.copy(str, universalColor);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getTintColor() {
        return this.tintColor;
    }

    @k
    public final Icon copy(@k String image, @l UniversalColor tintColor) {
        return new Icon(image, tintColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) other;
        return L.f(this.image, icon.image) && L.f(this.tintColor, icon.tintColor);
    }

    @k
    public final String getImage() {
        return this.image;
    }

    @InterfaceC42150f
    @l
    public final Integer getImageAttr() {
        String str = this.image;
        int iHashCode = str.hashCode();
        if (iHashCode != 3046160) {
            if (iHashCode != 823466996) {
                if (iHashCode == 957939245 && str.equals("courier")) {
                    return Integer.valueOf(R.attr.ic_courier24);
                }
            } else if (str.equals(NotificationsSettings.Section.SECTION_DELIVERY)) {
                return Integer.valueOf(R.attr.ic_delivery24);
            }
        } else if (str.equals(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_CARD)) {
            return Integer.valueOf(R.attr.ic_card24);
        }
        return null;
    }

    @l
    public final UniversalColor getTintColor() {
        return this.tintColor;
    }

    public int hashCode() {
        int iHashCode = this.image.hashCode() * 31;
        UniversalColor universalColor = this.tintColor;
        return iHashCode + (universalColor == null ? 0 : universalColor.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Icon(image=");
        sb2.append(this.image);
        sb2.append(", tintColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.tintColor, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.image);
        parcel.writeParcelable(this.tintColor, flags);
    }
}
