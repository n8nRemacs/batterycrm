package com.avito.android.beduin.common.navigation_bar.cart_native;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.component.cart_icon.BeduinCartIconModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.navigation_bar.NavigationBarItem;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NavigationBarCartNative.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/avito/android/beduin/common/navigation_bar/cart_native/NavigationBarCartNative;", "Lcom/avito/android/beduin/common/navigation_bar/NavigationBarItem;", "Lcom/avito/android/beduin/common/navigation_bar/cart_native/NavigationBarCartNative$ShoppingCartButtonStyle;", "_style", "Lcom/avito/android/beduin/common/navigation_bar/cart_native/NavigationBarCartNative$EventData;", "eventData", "<init>", "(Lcom/avito/android/beduin/common/navigation_bar/cart_native/NavigationBarCartNative$ShoppingCartButtonStyle;Lcom/avito/android/beduin/common/navigation_bar/cart_native/NavigationBarCartNative$EventData;)V", "Lcom/avito/android/beduin/common/navigation_bar/cart_native/NavigationBarCartNative$ShoppingCartButtonStyle;", "Lcom/avito/android/beduin/common/navigation_bar/cart_native/NavigationBarCartNative$EventData;", "getEventData", "()Lcom/avito/android/beduin/common/navigation_bar/cart_native/NavigationBarCartNative$EventData;", "EventData", "b", "ShoppingCartButtonStyle", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NavigationBarCartNative implements NavigationBarItem {

    @k
    public static final Parcelable.Creator<NavigationBarCartNative> CREATOR = new a();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final ShoppingCartButtonStyle _style;

    @c("eventData")
    @l
    private final EventData eventData;

    /* compiled from: NavigationBarCartNative.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/navigation_bar/cart_native/NavigationBarCartNative$EventData;", "Landroid/os/Parcelable;", "", "context", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getContext", "()Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EventData implements Parcelable {

        @k
        public static final Parcelable.Creator<EventData> CREATOR = new a();

        @c("context")
        @l
        private final String context;

        /* compiled from: NavigationBarCartNative.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EventData> {
            @Override // android.os.Parcelable.Creator
            public final EventData createFromParcel(Parcel parcel) {
                return new EventData(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EventData[] newArray(int i12) {
                return new EventData[i12];
            }
        }

        public EventData(@l String str) {
            this.context = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EventData) && L.f(this.context, ((EventData) obj).context);
        }

        @l
        public final String getContext() {
            return this.context;
        }

        public final int hashCode() {
            String str = this.context;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("EventData(context="), this.context, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.context);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NavigationBarCartNative.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/navigation_bar/cart_native/NavigationBarCartNative$ShoppingCartButtonStyle;", "", "(Ljava/lang/String;I)V", "Default", "Redesign", "AvitoBlack", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShoppingCartButtonStyle {

        @c("avitoBlack")
        public static final ShoppingCartButtonStyle AvitoBlack;

        @c("default")
        public static final ShoppingCartButtonStyle Default;

        @c("redesign")
        public static final ShoppingCartButtonStyle Redesign;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ShoppingCartButtonStyle[] f103436b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f103437c;

        static {
            ShoppingCartButtonStyle shoppingCartButtonStyle = new ShoppingCartButtonStyle("Default", 0);
            Default = shoppingCartButtonStyle;
            ShoppingCartButtonStyle shoppingCartButtonStyle2 = new ShoppingCartButtonStyle("Redesign", 1);
            Redesign = shoppingCartButtonStyle2;
            ShoppingCartButtonStyle shoppingCartButtonStyle3 = new ShoppingCartButtonStyle("AvitoBlack", 2);
            AvitoBlack = shoppingCartButtonStyle3;
            ShoppingCartButtonStyle[] shoppingCartButtonStyleArr = {shoppingCartButtonStyle, shoppingCartButtonStyle2, shoppingCartButtonStyle3};
            f103436b = shoppingCartButtonStyleArr;
            f103437c = kotlin.enums.c.a(shoppingCartButtonStyleArr);
        }

        private ShoppingCartButtonStyle(String str, int i12) {
        }

        public static ShoppingCartButtonStyle valueOf(String str) {
            return (ShoppingCartButtonStyle) Enum.valueOf(ShoppingCartButtonStyle.class, str);
        }

        public static ShoppingCartButtonStyle[] values() {
            return (ShoppingCartButtonStyle[]) f103436b.clone();
        }
    }

    /* compiled from: NavigationBarCartNative.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NavigationBarCartNative> {
        @Override // android.os.Parcelable.Creator
        public final NavigationBarCartNative createFromParcel(Parcel parcel) {
            return new NavigationBarCartNative(parcel.readInt() == 0 ? null : ShoppingCartButtonStyle.valueOf(parcel.readString()), parcel.readInt() != 0 ? EventData.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NavigationBarCartNative[] newArray(int i12) {
            return new NavigationBarCartNative[i12];
        }
    }

    /* compiled from: NavigationBarCartNative.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/navigation_bar/cart_native/NavigationBarCartNative$b;", "Lcom/avito/android/beduin/common/navigation_bar/d;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.navigation_bar.d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f103438a = new b();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Class<NavigationBarCartNative> f103439b = NavigationBarCartNative.class;

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f103440c = "cartNative";

        @Override // com.avito.android.beduin.common.navigation_bar.d
        @k
        public final String getType() {
            return f103440c;
        }

        @Override // com.avito.android.beduin.common.navigation_bar.d
        @k
        public final Class<NavigationBarCartNative> getValue() {
            return f103439b;
        }
    }

    public NavigationBarCartNative(@l ShoppingCartButtonStyle shoppingCartButtonStyle, @l EventData eventData) {
        this._style = shoppingCartButtonStyle;
        this.eventData = eventData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationBarCartNative)) {
            return false;
        }
        NavigationBarCartNative navigationBarCartNative = (NavigationBarCartNative) obj;
        return this._style == navigationBarCartNative._style && L.f(this.eventData, navigationBarCartNative.eventData);
    }

    public final int hashCode() {
        ShoppingCartButtonStyle shoppingCartButtonStyle = this._style;
        int iHashCode = (shoppingCartButtonStyle == null ? 0 : shoppingCartButtonStyle.hashCode()) * 31;
        EventData eventData = this.eventData;
        return iHashCode + (eventData != null ? eventData.hashCode() : 0);
    }

    @Override // com.avito.android.beduin.common.navigation_bar.NavigationBarItem
    public final BeduinModel toBeduinModel(UniversalColor universalColor) {
        String string = UUID.randomUUID().toString();
        ShoppingCartButtonStyle shoppingCartButtonStyle = this._style;
        if (shoppingCartButtonStyle == null) {
            shoppingCartButtonStyle = ShoppingCartButtonStyle.Default;
        }
        return new BeduinCartIconModel(string, null, shoppingCartButtonStyle, this.eventData);
    }

    @k
    public final String toString() {
        return "NavigationBarCartNative(_style=" + this._style + ", eventData=" + this.eventData + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        ShoppingCartButtonStyle shoppingCartButtonStyle = this._style;
        if (shoppingCartButtonStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(shoppingCartButtonStyle.name());
        }
        EventData eventData = this.eventData;
        if (eventData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eventData.writeToParcel(parcel, i12);
        }
    }
}
