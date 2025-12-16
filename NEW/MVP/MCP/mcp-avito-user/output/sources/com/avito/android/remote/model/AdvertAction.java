package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19824b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertAction.kt */
@InterfaceC19824b
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u0082\u0001\u000b\u001c\u001d\u001e\u001f !\"#$%&¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction;", "Landroid/os/Parcelable;", "()V", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", BeduinCartItemModel.DISABLED_STRING, "", "getDisabled", "()Ljava/lang/Boolean;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "getStyle", "()Ljava/lang/String;", "title", "getTitle", "Access", "Booking", "CallOrder", "FindShift", "GigApply", "IacVideoCallRequest", "Messenger", "Phone", "RealtyLayout", "SecondaryAction", "ServiceOrderRequest", "Lcom/avito/android/remote/model/AdvertAction$Access;", "Lcom/avito/android/remote/model/AdvertAction$Booking;", "Lcom/avito/android/remote/model/AdvertAction$CallOrder;", "Lcom/avito/android/remote/model/AdvertAction$FindShift;", "Lcom/avito/android/remote/model/AdvertAction$GigApply;", "Lcom/avito/android/remote/model/AdvertAction$IacVideoCallRequest;", "Lcom/avito/android/remote/model/AdvertAction$Messenger;", "Lcom/avito/android/remote/model/AdvertAction$Phone;", "Lcom/avito/android/remote/model/AdvertAction$RealtyLayout;", "Lcom/avito/android/remote/model/AdvertAction$SecondaryAction;", "Lcom/avito/android/remote/model/AdvertAction$ServiceOrderRequest;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class AdvertAction implements Parcelable {

    /* compiled from: AdvertAction.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction$Access;", "Lcom/avito/android/remote/model/AdvertAction;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", BeduinCartItemModel.DISABLED_STRING, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertAction$Access;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/lang/Boolean;", "getDisabled", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Access extends AdvertAction {

        @k
        public static final Parcelable.Creator<Access> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c(BeduinCartItemModel.DISABLED_STRING)
        @l
        private final Boolean disabled;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Access> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Access createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Access.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Access(string, deepLink, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Access[] newArray(int i12) {
                return new Access[i12];
            }
        }

        public /* synthetic */ Access(String str, DeepLink deepLink, Boolean bool, String str2, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str2);
        }

        public static /* synthetic */ Access copy$default(Access access, String str, DeepLink deepLink, Boolean bool, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = access.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = access.deepLink;
            }
            if ((i12 & 4) != 0) {
                bool = access.disabled;
            }
            if ((i12 & 8) != 0) {
                str2 = access.style;
            }
            return access.copy(str, deepLink, bool, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final Access copy(@k String title, @l DeepLink deepLink, @l Boolean disabled, @l String style) {
            return new Access(title, deepLink, disabled, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Access)) {
                return false;
            }
            Access access = (Access) other;
            return L.f(this.title, access.title) && L.f(this.deepLink, access.deepLink) && L.f(this.disabled, access.disabled) && L.f(this.style, access.style);
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public Boolean getDisabled() {
            return this.disabled;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public String getStyle() {
            return this.style;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.deepLink;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool = this.disabled;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.style;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Access(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", disabled=");
            sb2.append(this.disabled);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
            Boolean bool = this.disabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.style);
        }

        public Access(@k String str, @l DeepLink deepLink, @l Boolean bool, @l String str2) {
            super(null);
            this.title = str;
            this.deepLink = deepLink;
            this.disabled = bool;
            this.style = str2;
        }
    }

    /* compiled from: AdvertAction.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction$Booking;", "Lcom/avito/android/remote/model/AdvertAction;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", BeduinCartItemModel.DISABLED_STRING, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertAction$Booking;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/lang/Boolean;", "getDisabled", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Booking extends AdvertAction {

        @k
        public static final Parcelable.Creator<Booking> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c(BeduinCartItemModel.DISABLED_STRING)
        @l
        private final Boolean disabled;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Booking> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Booking createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Booking.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Booking(string, deepLink, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Booking[] newArray(int i12) {
                return new Booking[i12];
            }
        }

        public /* synthetic */ Booking(String str, DeepLink deepLink, Boolean bool, String str2, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str2);
        }

        public static /* synthetic */ Booking copy$default(Booking booking, String str, DeepLink deepLink, Boolean bool, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = booking.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = booking.deepLink;
            }
            if ((i12 & 4) != 0) {
                bool = booking.disabled;
            }
            if ((i12 & 8) != 0) {
                str2 = booking.style;
            }
            return booking.copy(str, deepLink, bool, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final Booking copy(@k String title, @l DeepLink deepLink, @l Boolean disabled, @l String style) {
            return new Booking(title, deepLink, disabled, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Booking)) {
                return false;
            }
            Booking booking = (Booking) other;
            return L.f(this.title, booking.title) && L.f(this.deepLink, booking.deepLink) && L.f(this.disabled, booking.disabled) && L.f(this.style, booking.style);
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public Boolean getDisabled() {
            return this.disabled;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public String getStyle() {
            return this.style;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.deepLink;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool = this.disabled;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.style;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Booking(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", disabled=");
            sb2.append(this.disabled);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
            Boolean bool = this.disabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.style);
        }

        public Booking(@k String str, @l DeepLink deepLink, @l Boolean bool, @l String str2) {
            super(null);
            this.title = str;
            this.deepLink = deepLink;
            this.disabled = bool;
            this.style = str2;
        }
    }

    /* compiled from: AdvertAction.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction$CallOrder;", "Lcom/avito/android/remote/model/AdvertAction;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", BeduinCartItemModel.DISABLED_STRING, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertAction$CallOrder;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/lang/Boolean;", "getDisabled", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CallOrder extends AdvertAction {

        @k
        public static final Parcelable.Creator<CallOrder> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c(BeduinCartItemModel.DISABLED_STRING)
        @l
        private final Boolean disabled;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CallOrder> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CallOrder createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(CallOrder.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new CallOrder(string, deepLink, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CallOrder[] newArray(int i12) {
                return new CallOrder[i12];
            }
        }

        public /* synthetic */ CallOrder(String str, DeepLink deepLink, Boolean bool, String str2, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str2);
        }

        public static /* synthetic */ CallOrder copy$default(CallOrder callOrder, String str, DeepLink deepLink, Boolean bool, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = callOrder.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = callOrder.deepLink;
            }
            if ((i12 & 4) != 0) {
                bool = callOrder.disabled;
            }
            if ((i12 & 8) != 0) {
                str2 = callOrder.style;
            }
            return callOrder.copy(str, deepLink, bool, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final CallOrder copy(@k String title, @l DeepLink deepLink, @l Boolean disabled, @l String style) {
            return new CallOrder(title, deepLink, disabled, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CallOrder)) {
                return false;
            }
            CallOrder callOrder = (CallOrder) other;
            return L.f(this.title, callOrder.title) && L.f(this.deepLink, callOrder.deepLink) && L.f(this.disabled, callOrder.disabled) && L.f(this.style, callOrder.style);
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public Boolean getDisabled() {
            return this.disabled;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public String getStyle() {
            return this.style;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.deepLink;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool = this.disabled;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.style;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CallOrder(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", disabled=");
            sb2.append(this.disabled);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
            Boolean bool = this.disabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.style);
        }

        public CallOrder(@k String str, @l DeepLink deepLink, @l Boolean bool, @l String str2) {
            super(null);
            this.title = str;
            this.deepLink = deepLink;
            this.disabled = bool;
            this.style = str2;
        }
    }

    /* compiled from: AdvertAction.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction$FindShift;", "Lcom/avito/android/remote/model/AdvertAction;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", BeduinCartItemModel.DISABLED_STRING, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertAction$FindShift;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/lang/Boolean;", "getDisabled", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FindShift extends AdvertAction {

        @k
        public static final Parcelable.Creator<FindShift> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c(BeduinCartItemModel.DISABLED_STRING)
        @l
        private final Boolean disabled;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FindShift> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FindShift createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(FindShift.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new FindShift(string, deepLink, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FindShift[] newArray(int i12) {
                return new FindShift[i12];
            }
        }

        public /* synthetic */ FindShift(String str, DeepLink deepLink, Boolean bool, String str2, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str2);
        }

        public static /* synthetic */ FindShift copy$default(FindShift findShift, String str, DeepLink deepLink, Boolean bool, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = findShift.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = findShift.deepLink;
            }
            if ((i12 & 4) != 0) {
                bool = findShift.disabled;
            }
            if ((i12 & 8) != 0) {
                str2 = findShift.style;
            }
            return findShift.copy(str, deepLink, bool, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final FindShift copy(@k String title, @l DeepLink deepLink, @l Boolean disabled, @l String style) {
            return new FindShift(title, deepLink, disabled, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FindShift)) {
                return false;
            }
            FindShift findShift = (FindShift) other;
            return L.f(this.title, findShift.title) && L.f(this.deepLink, findShift.deepLink) && L.f(this.disabled, findShift.disabled) && L.f(this.style, findShift.style);
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public Boolean getDisabled() {
            return this.disabled;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public String getStyle() {
            return this.style;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.deepLink;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool = this.disabled;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.style;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FindShift(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", disabled=");
            sb2.append(this.disabled);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
            Boolean bool = this.disabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.style);
        }

        public FindShift(@k String str, @l DeepLink deepLink, @l Boolean bool, @l String str2) {
            super(null);
            this.title = str;
            this.deepLink = deepLink;
            this.disabled = bool;
            this.style = str2;
        }
    }

    /* compiled from: AdvertAction.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction$GigApply;", "Lcom/avito/android/remote/model/AdvertAction;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", BeduinCartItemModel.DISABLED_STRING, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertAction$GigApply;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/lang/Boolean;", "getDisabled", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GigApply extends AdvertAction {

        @k
        public static final Parcelable.Creator<GigApply> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c(BeduinCartItemModel.DISABLED_STRING)
        @l
        private final Boolean disabled;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GigApply> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final GigApply createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(GigApply.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new GigApply(string, deepLink, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final GigApply[] newArray(int i12) {
                return new GigApply[i12];
            }
        }

        public /* synthetic */ GigApply(String str, DeepLink deepLink, Boolean bool, String str2, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str2);
        }

        public static /* synthetic */ GigApply copy$default(GigApply gigApply, String str, DeepLink deepLink, Boolean bool, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = gigApply.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = gigApply.deepLink;
            }
            if ((i12 & 4) != 0) {
                bool = gigApply.disabled;
            }
            if ((i12 & 8) != 0) {
                str2 = gigApply.style;
            }
            return gigApply.copy(str, deepLink, bool, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final GigApply copy(@k String title, @l DeepLink deepLink, @l Boolean disabled, @l String style) {
            return new GigApply(title, deepLink, disabled, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GigApply)) {
                return false;
            }
            GigApply gigApply = (GigApply) other;
            return L.f(this.title, gigApply.title) && L.f(this.deepLink, gigApply.deepLink) && L.f(this.disabled, gigApply.disabled) && L.f(this.style, gigApply.style);
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public Boolean getDisabled() {
            return this.disabled;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public String getStyle() {
            return this.style;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.deepLink;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool = this.disabled;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.style;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("GigApply(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", disabled=");
            sb2.append(this.disabled);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
            Boolean bool = this.disabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.style);
        }

        public GigApply(@k String str, @l DeepLink deepLink, @l Boolean bool, @l String str2) {
            super(null);
            this.title = str;
            this.deepLink = deepLink;
            this.disabled = bool;
            this.style = str2;
        }
    }

    /* compiled from: AdvertAction.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction$IacVideoCallRequest;", "Lcom/avito/android/remote/model/AdvertAction;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", BeduinCartItemModel.DISABLED_STRING, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertAction$IacVideoCallRequest;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/lang/Boolean;", "getDisabled", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IacVideoCallRequest extends AdvertAction {

        @k
        public static final Parcelable.Creator<IacVideoCallRequest> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c(BeduinCartItemModel.DISABLED_STRING)
        @l
        private final Boolean disabled;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IacVideoCallRequest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final IacVideoCallRequest createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(IacVideoCallRequest.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new IacVideoCallRequest(string, deepLink, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final IacVideoCallRequest[] newArray(int i12) {
                return new IacVideoCallRequest[i12];
            }
        }

        public /* synthetic */ IacVideoCallRequest(String str, DeepLink deepLink, Boolean bool, String str2, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str2);
        }

        public static /* synthetic */ IacVideoCallRequest copy$default(IacVideoCallRequest iacVideoCallRequest, String str, DeepLink deepLink, Boolean bool, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = iacVideoCallRequest.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = iacVideoCallRequest.deepLink;
            }
            if ((i12 & 4) != 0) {
                bool = iacVideoCallRequest.disabled;
            }
            if ((i12 & 8) != 0) {
                str2 = iacVideoCallRequest.style;
            }
            return iacVideoCallRequest.copy(str, deepLink, bool, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final IacVideoCallRequest copy(@k String title, @l DeepLink deepLink, @l Boolean disabled, @l String style) {
            return new IacVideoCallRequest(title, deepLink, disabled, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IacVideoCallRequest)) {
                return false;
            }
            IacVideoCallRequest iacVideoCallRequest = (IacVideoCallRequest) other;
            return L.f(this.title, iacVideoCallRequest.title) && L.f(this.deepLink, iacVideoCallRequest.deepLink) && L.f(this.disabled, iacVideoCallRequest.disabled) && L.f(this.style, iacVideoCallRequest.style);
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public Boolean getDisabled() {
            return this.disabled;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public String getStyle() {
            return this.style;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.deepLink;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool = this.disabled;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.style;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("IacVideoCallRequest(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", disabled=");
            sb2.append(this.disabled);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
            Boolean bool = this.disabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.style);
        }

        public IacVideoCallRequest(@k String str, @l DeepLink deepLink, @l Boolean bool, @l String str2) {
            super(null);
            this.title = str;
            this.deepLink = deepLink;
            this.disabled = bool;
            this.style = str2;
        }
    }

    /* compiled from: AdvertAction.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction$Messenger;", "Lcom/avito/android/remote/model/AdvertAction;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", BeduinCartItemModel.DISABLED_STRING, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertAction$Messenger;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/lang/Boolean;", "getDisabled", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Messenger extends AdvertAction {

        @k
        public static final Parcelable.Creator<Messenger> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c(BeduinCartItemModel.DISABLED_STRING)
        @l
        private final Boolean disabled;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Messenger> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Messenger createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Messenger.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Messenger(string, deepLink, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Messenger[] newArray(int i12) {
                return new Messenger[i12];
            }
        }

        public /* synthetic */ Messenger(String str, DeepLink deepLink, Boolean bool, String str2, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str2);
        }

        public static /* synthetic */ Messenger copy$default(Messenger messenger, String str, DeepLink deepLink, Boolean bool, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = messenger.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = messenger.deepLink;
            }
            if ((i12 & 4) != 0) {
                bool = messenger.disabled;
            }
            if ((i12 & 8) != 0) {
                str2 = messenger.style;
            }
            return messenger.copy(str, deepLink, bool, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final Messenger copy(@k String title, @l DeepLink deepLink, @l Boolean disabled, @l String style) {
            return new Messenger(title, deepLink, disabled, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Messenger)) {
                return false;
            }
            Messenger messenger = (Messenger) other;
            return L.f(this.title, messenger.title) && L.f(this.deepLink, messenger.deepLink) && L.f(this.disabled, messenger.disabled) && L.f(this.style, messenger.style);
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public Boolean getDisabled() {
            return this.disabled;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public String getStyle() {
            return this.style;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.deepLink;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool = this.disabled;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.style;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Messenger(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", disabled=");
            sb2.append(this.disabled);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
            Boolean bool = this.disabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.style);
        }

        public Messenger(@k String str, @l DeepLink deepLink, @l Boolean bool, @l String str2) {
            super(null);
            this.title = str;
            this.deepLink = deepLink;
            this.disabled = bool;
            this.style = str2;
        }
    }

    /* compiled from: AdvertAction.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction$Phone;", "Lcom/avito/android/remote/model/AdvertAction;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", BeduinCartItemModel.DISABLED_STRING, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertAction$Phone;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/lang/Boolean;", "getDisabled", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Phone extends AdvertAction {

        @k
        public static final Parcelable.Creator<Phone> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c(BeduinCartItemModel.DISABLED_STRING)
        @l
        private final Boolean disabled;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Phone> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Phone createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Phone.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Phone(string, deepLink, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Phone[] newArray(int i12) {
                return new Phone[i12];
            }
        }

        public /* synthetic */ Phone(String str, DeepLink deepLink, Boolean bool, String str2, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str2);
        }

        public static /* synthetic */ Phone copy$default(Phone phone, String str, DeepLink deepLink, Boolean bool, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = phone.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = phone.deepLink;
            }
            if ((i12 & 4) != 0) {
                bool = phone.disabled;
            }
            if ((i12 & 8) != 0) {
                str2 = phone.style;
            }
            return phone.copy(str, deepLink, bool, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final Phone copy(@k String title, @l DeepLink deepLink, @l Boolean disabled, @l String style) {
            return new Phone(title, deepLink, disabled, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) other;
            return L.f(this.title, phone.title) && L.f(this.deepLink, phone.deepLink) && L.f(this.disabled, phone.disabled) && L.f(this.style, phone.style);
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public Boolean getDisabled() {
            return this.disabled;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public String getStyle() {
            return this.style;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.deepLink;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool = this.disabled;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.style;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Phone(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", disabled=");
            sb2.append(this.disabled);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
            Boolean bool = this.disabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.style);
        }

        public Phone(@k String str, @l DeepLink deepLink, @l Boolean bool, @l String str2) {
            super(null);
            this.title = str;
            this.deepLink = deepLink;
            this.disabled = bool;
            this.style = str2;
        }
    }

    /* compiled from: AdvertAction.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction$RealtyLayout;", "Lcom/avito/android/remote/model/AdvertAction;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", BeduinCartItemModel.DISABLED_STRING, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertAction$RealtyLayout;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/lang/Boolean;", "getDisabled", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RealtyLayout extends AdvertAction {

        @k
        public static final Parcelable.Creator<RealtyLayout> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c(BeduinCartItemModel.DISABLED_STRING)
        @l
        private final Boolean disabled;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RealtyLayout> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final RealtyLayout createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(RealtyLayout.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new RealtyLayout(string, deepLink, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final RealtyLayout[] newArray(int i12) {
                return new RealtyLayout[i12];
            }
        }

        public /* synthetic */ RealtyLayout(String str, DeepLink deepLink, Boolean bool, String str2, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str2);
        }

        public static /* synthetic */ RealtyLayout copy$default(RealtyLayout realtyLayout, String str, DeepLink deepLink, Boolean bool, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = realtyLayout.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = realtyLayout.deepLink;
            }
            if ((i12 & 4) != 0) {
                bool = realtyLayout.disabled;
            }
            if ((i12 & 8) != 0) {
                str2 = realtyLayout.style;
            }
            return realtyLayout.copy(str, deepLink, bool, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final RealtyLayout copy(@k String title, @l DeepLink deepLink, @l Boolean disabled, @l String style) {
            return new RealtyLayout(title, deepLink, disabled, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RealtyLayout)) {
                return false;
            }
            RealtyLayout realtyLayout = (RealtyLayout) other;
            return L.f(this.title, realtyLayout.title) && L.f(this.deepLink, realtyLayout.deepLink) && L.f(this.disabled, realtyLayout.disabled) && L.f(this.style, realtyLayout.style);
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public Boolean getDisabled() {
            return this.disabled;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public String getStyle() {
            return this.style;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.deepLink;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool = this.disabled;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.style;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RealtyLayout(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", disabled=");
            sb2.append(this.disabled);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
            Boolean bool = this.disabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.style);
        }

        public RealtyLayout(@k String str, @l DeepLink deepLink, @l Boolean bool, @l String str2) {
            super(null);
            this.title = str;
            this.deepLink = deepLink;
            this.disabled = bool;
            this.style = str2;
        }
    }

    /* compiled from: AdvertAction.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJJ\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b,\u0010\r¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction$SecondaryAction;", "Lcom/avito/android/remote/model/AdvertAction;", "", "title", "subtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", BeduinCartItemModel.DISABLED_STRING, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Ljava/lang/Boolean;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertAction$SecondaryAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/lang/Boolean;", "getDisabled", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SecondaryAction extends AdvertAction {

        @k
        public static final Parcelable.Creator<SecondaryAction> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c(BeduinCartItemModel.DISABLED_STRING)
        @l
        private final Boolean disabled;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SecondaryAction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SecondaryAction createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(SecondaryAction.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SecondaryAction(string, string2, deepLink, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SecondaryAction[] newArray(int i12) {
                return new SecondaryAction[i12];
            }
        }

        public /* synthetic */ SecondaryAction(String str, String str2, DeepLink deepLink, Boolean bool, String str3, int i12, C42822w c42822w) {
            this(str, str2, deepLink, (i12 & 8) != 0 ? null : bool, (i12 & 16) != 0 ? null : str3);
        }

        public static /* synthetic */ SecondaryAction copy$default(SecondaryAction secondaryAction, String str, String str2, DeepLink deepLink, Boolean bool, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = secondaryAction.title;
            }
            if ((i12 & 2) != 0) {
                str2 = secondaryAction.subtitle;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                deepLink = secondaryAction.deepLink;
            }
            DeepLink deepLink2 = deepLink;
            if ((i12 & 8) != 0) {
                bool = secondaryAction.disabled;
            }
            Boolean bool2 = bool;
            if ((i12 & 16) != 0) {
                str3 = secondaryAction.style;
            }
            return secondaryAction.copy(str, str4, deepLink2, bool2, str3);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final SecondaryAction copy(@k String title, @l String subtitle, @l DeepLink deepLink, @l Boolean disabled, @l String style) {
            return new SecondaryAction(title, subtitle, deepLink, disabled, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SecondaryAction)) {
                return false;
            }
            SecondaryAction secondaryAction = (SecondaryAction) other;
            return L.f(this.title, secondaryAction.title) && L.f(this.subtitle, secondaryAction.subtitle) && L.f(this.deepLink, secondaryAction.deepLink) && L.f(this.disabled, secondaryAction.disabled) && L.f(this.style, secondaryAction.style);
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public Boolean getDisabled() {
            return this.disabled;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public String getStyle() {
            return this.style;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DeepLink deepLink = this.deepLink;
            int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool = this.disabled;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.style;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SecondaryAction(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", disabled=");
            sb2.append(this.disabled);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.deepLink, flags);
            Boolean bool = this.disabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.style);
        }

        public SecondaryAction(@k String str, @l String str2, @l DeepLink deepLink, @l Boolean bool, @l String str3) {
            super(null);
            this.title = str;
            this.subtitle = str2;
            this.deepLink = deepLink;
            this.disabled = bool;
            this.style = str3;
        }
    }

    /* compiled from: AdvertAction.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010&R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010*R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b-\u0010\fR(\u0010.\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b3\u00104\u001a\u0004\b.\u00100\"\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction$ServiceOrderRequest;", "Lcom/avito/android/remote/model/AdvertAction;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", BeduinCartItemModel.DISABLED_STRING, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertAction$ServiceOrderRequest;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "setTitle", "(Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "setDeepLink", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/Boolean;", "getDisabled", "getStyle", "isLoading", "Z", "()Z", "setLoading", "(Z)V", "isLoading$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServiceOrderRequest extends AdvertAction {

        @k
        public static final Parcelable.Creator<ServiceOrderRequest> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private DeepLink deepLink;

        @c(BeduinCartItemModel.DISABLED_STRING)
        @l
        private final Boolean disabled;
        private transient boolean isLoading;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private String title;

        /* compiled from: AdvertAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ServiceOrderRequest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ServiceOrderRequest createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(ServiceOrderRequest.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ServiceOrderRequest(string, deepLink, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ServiceOrderRequest[] newArray(int i12) {
                return new ServiceOrderRequest[i12];
            }
        }

        public /* synthetic */ ServiceOrderRequest(String str, DeepLink deepLink, Boolean bool, String str2, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str2);
        }

        public static /* synthetic */ ServiceOrderRequest copy$default(ServiceOrderRequest serviceOrderRequest, String str, DeepLink deepLink, Boolean bool, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = serviceOrderRequest.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = serviceOrderRequest.deepLink;
            }
            if ((i12 & 4) != 0) {
                bool = serviceOrderRequest.disabled;
            }
            if ((i12 & 8) != 0) {
                str2 = serviceOrderRequest.style;
            }
            return serviceOrderRequest.copy(str, deepLink, bool, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final ServiceOrderRequest copy(@k String title, @l DeepLink deepLink, @l Boolean disabled, @l String style) {
            return new ServiceOrderRequest(title, deepLink, disabled, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServiceOrderRequest)) {
                return false;
            }
            ServiceOrderRequest serviceOrderRequest = (ServiceOrderRequest) other;
            return L.f(this.title, serviceOrderRequest.title) && L.f(this.deepLink, serviceOrderRequest.deepLink) && L.f(this.disabled, serviceOrderRequest.disabled) && L.f(this.style, serviceOrderRequest.style);
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public Boolean getDisabled() {
            return this.disabled;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @l
        public String getStyle() {
            return this.style;
        }

        @Override // com.avito.android.remote.model.AdvertAction
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.deepLink;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool = this.disabled;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.style;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        /* renamed from: isLoading, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public void setDeepLink(@l DeepLink deepLink) {
            this.deepLink = deepLink;
        }

        public final void setLoading(boolean z12) {
            this.isLoading = z12;
        }

        public void setTitle(@k String str) {
            this.title = str;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceOrderRequest(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", disabled=");
            sb2.append(this.disabled);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
            Boolean bool = this.disabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.style);
        }

        public ServiceOrderRequest(@k String str, @l DeepLink deepLink, @l Boolean bool, @l String str2) {
            super(null);
            this.title = str;
            this.deepLink = deepLink;
            this.disabled = bool;
            this.style = str2;
        }

        public static /* synthetic */ void isLoading$annotations() {
        }
    }

    public /* synthetic */ AdvertAction(C42822w c42822w) {
        this();
    }

    @l
    public abstract DeepLink getDeepLink();

    @l
    public abstract Boolean getDisabled();

    @l
    public abstract String getStyle();

    @k
    public abstract String getTitle();

    private AdvertAction() {
    }
}
