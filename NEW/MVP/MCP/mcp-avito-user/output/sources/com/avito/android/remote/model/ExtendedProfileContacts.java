package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileContacts.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0014¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileContacts;", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "", "widgetName", "", "Lcom/avito/android/remote/model/AdvertAction;", "actions", "Lcom/avito/android/remote/model/SellerReplySpeed;", "replySpeed", "", "disableFloating", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/SellerReplySpeed;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/SellerReplySpeed;", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/SellerReplySpeed;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/ExtendedProfileContacts;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getWidgetName", "Ljava/util/List;", "getActions", "Lcom/avito/android/remote/model/SellerReplySpeed;", "getReplySpeed", "Ljava/lang/Boolean;", "getDisableFloating", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileContacts implements ExtendedProfileElement {

    @k
    public static final Parcelable.Creator<ExtendedProfileContacts> CREATOR = new Creator();

    @c("list")
    @l
    private final List<AdvertAction> actions;

    @c("disableFloating")
    @l
    private final Boolean disableFloating;

    @c(ChannelContext.Item.REPLY_TIME)
    @l
    private final SellerReplySpeed replySpeed;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: ExtendedProfileContacts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileContacts> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileContacts createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(ExtendedProfileContacts.class, parcel, arrayList, iL2, 1);
                }
            }
            SellerReplySpeed sellerReplySpeed = (SellerReplySpeed) parcel.readParcelable(ExtendedProfileContacts.class.getClassLoader());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ExtendedProfileContacts(string, arrayList, sellerReplySpeed, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileContacts[] newArray(int i12) {
            return new ExtendedProfileContacts[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedProfileContacts(@l String str, @l List<? extends AdvertAction> list, @l SellerReplySpeed sellerReplySpeed, @l Boolean bool) {
        this.widgetName = str;
        this.actions = list;
        this.replySpeed = sellerReplySpeed;
        this.disableFloating = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtendedProfileContacts copy$default(ExtendedProfileContacts extendedProfileContacts, String str, List list, SellerReplySpeed sellerReplySpeed, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = extendedProfileContacts.widgetName;
        }
        if ((i12 & 2) != 0) {
            list = extendedProfileContacts.actions;
        }
        if ((i12 & 4) != 0) {
            sellerReplySpeed = extendedProfileContacts.replySpeed;
        }
        if ((i12 & 8) != 0) {
            bool = extendedProfileContacts.disableFloating;
        }
        return extendedProfileContacts.copy(str, list, sellerReplySpeed, bool);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @l
    public final List<AdvertAction> component2() {
        return this.actions;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final SellerReplySpeed getReplySpeed() {
        return this.replySpeed;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getDisableFloating() {
        return this.disableFloating;
    }

    @k
    public final ExtendedProfileContacts copy(@l String widgetName, @l List<? extends AdvertAction> actions, @l SellerReplySpeed replySpeed, @l Boolean disableFloating) {
        return new ExtendedProfileContacts(widgetName, actions, replySpeed, disableFloating);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileContacts)) {
            return false;
        }
        ExtendedProfileContacts extendedProfileContacts = (ExtendedProfileContacts) other;
        return L.f(this.widgetName, extendedProfileContacts.widgetName) && L.f(this.actions, extendedProfileContacts.actions) && L.f(this.replySpeed, extendedProfileContacts.replySpeed) && L.f(this.disableFloating, extendedProfileContacts.disableFloating);
    }

    @l
    public final List<AdvertAction> getActions() {
        return this.actions;
    }

    @l
    public final Boolean getDisableFloating() {
        return this.disableFloating;
    }

    @l
    public final SellerReplySpeed getReplySpeed() {
        return this.replySpeed;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        String str = this.widgetName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<AdvertAction> list = this.actions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        SellerReplySpeed sellerReplySpeed = this.replySpeed;
        int iHashCode3 = (iHashCode2 + (sellerReplySpeed == null ? 0 : sellerReplySpeed.hashCode())) * 31;
        Boolean bool = this.disableFloating;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileContacts(widgetName=");
        sb2.append(this.widgetName);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", replySpeed=");
        sb2.append(this.replySpeed);
        sb2.append(", disableFloating=");
        return C0.g(sb2, this.disableFloating, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.widgetName);
        List<AdvertAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeParcelable(this.replySpeed, flags);
        Boolean bool = this.disableFloating;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
