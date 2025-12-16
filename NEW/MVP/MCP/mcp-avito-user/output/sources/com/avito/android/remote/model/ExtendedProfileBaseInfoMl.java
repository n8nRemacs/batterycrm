package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileBaseInfoMl.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001:\u0006%&'()*B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl;", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "", "widgetName", "Lcom/avito/android/remote/model/Image;", "avatar", "description", "Lcom/avito/android/remote/model/ProfileRating;", "rating", "Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Buttons;", "buttons", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/ProfileRating;Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Buttons;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getWidgetName", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "getDescription", "Lcom/avito/android/remote/model/ProfileRating;", "getRating", "()Lcom/avito/android/remote/model/ProfileRating;", "setRating", "(Lcom/avito/android/remote/model/ProfileRating;)V", "Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Buttons;", "getButtons", "()Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Buttons;", "Action", "ActionWrapper", "Buttons", "Messenger", "Phone", "Subscribe", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExtendedProfileBaseInfoMl implements ExtendedProfileElement {

    @k
    public static final Parcelable.Creator<ExtendedProfileBaseInfoMl> CREATOR = new Creator();

    @c("avatar")
    @l
    private final Image avatar;

    @c("buttons")
    @l
    private final Buttons buttons;

    @c("description")
    @l
    private final String description;

    @c("rating")
    @l
    private ProfileRating rating;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: ExtendedProfileBaseInfoMl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Action;", "Landroid/os/Parcelable;", "()V", "Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Messenger;", "Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Phone;", "Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Subscribe;", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Action implements Parcelable {
        public /* synthetic */ Action(C42822w c42822w) {
            this();
        }

        private Action() {
        }
    }

    /* compiled from: ExtendedProfileBaseInfoMl.kt */
    @d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$ActionWrapper;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Messenger;", NotificationsSettings.Section.SECTION_MESSENGER, "Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Phone;", "phone", "Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Subscribe;", "subscribe", "<init>", "(Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Messenger;Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Phone;Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Subscribe;)V", "component1", "()Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Messenger;", "component2", "()Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Phone;", "component3", "()Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Subscribe;", "copy", "(Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Messenger;Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Phone;Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Subscribe;)Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$ActionWrapper;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Messenger;", "getMessenger", "Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Phone;", "getPhone", "Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Subscribe;", "getSubscribe", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActionWrapper implements Parcelable {

        @k
        public static final Parcelable.Creator<ActionWrapper> CREATOR = new Creator();

        @c(NotificationsSettings.Section.SECTION_MESSENGER)
        @l
        private final Messenger messenger;

        @c("phone")
        @l
        private final Phone phone;

        @c("subscribe")
        @l
        private final Subscribe subscribe;

        /* compiled from: ExtendedProfileBaseInfoMl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActionWrapper> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionWrapper createFromParcel(@k Parcel parcel) {
                return new ActionWrapper(parcel.readInt() == 0 ? null : Messenger.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Phone.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Subscribe.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionWrapper[] newArray(int i12) {
                return new ActionWrapper[i12];
            }
        }

        public ActionWrapper(@l Messenger messenger, @l Phone phone, @l Subscribe subscribe) {
            this.messenger = messenger;
            this.phone = phone;
            this.subscribe = subscribe;
        }

        public static /* synthetic */ ActionWrapper copy$default(ActionWrapper actionWrapper, Messenger messenger, Phone phone, Subscribe subscribe, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                messenger = actionWrapper.messenger;
            }
            if ((i12 & 2) != 0) {
                phone = actionWrapper.phone;
            }
            if ((i12 & 4) != 0) {
                subscribe = actionWrapper.subscribe;
            }
            return actionWrapper.copy(messenger, phone, subscribe);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Messenger getMessenger() {
            return this.messenger;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Phone getPhone() {
            return this.phone;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Subscribe getSubscribe() {
            return this.subscribe;
        }

        @k
        public final ActionWrapper copy(@l Messenger messenger, @l Phone phone, @l Subscribe subscribe) {
            return new ActionWrapper(messenger, phone, subscribe);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionWrapper)) {
                return false;
            }
            ActionWrapper actionWrapper = (ActionWrapper) other;
            return L.f(this.messenger, actionWrapper.messenger) && L.f(this.phone, actionWrapper.phone) && L.f(this.subscribe, actionWrapper.subscribe);
        }

        @l
        public final Messenger getMessenger() {
            return this.messenger;
        }

        @l
        public final Phone getPhone() {
            return this.phone;
        }

        @l
        public final Subscribe getSubscribe() {
            return this.subscribe;
        }

        public int hashCode() {
            Messenger messenger = this.messenger;
            int iHashCode = (messenger == null ? 0 : messenger.hashCode()) * 31;
            Phone phone = this.phone;
            int iHashCode2 = (iHashCode + (phone == null ? 0 : phone.hashCode())) * 31;
            Subscribe subscribe = this.subscribe;
            return iHashCode2 + (subscribe != null ? subscribe.hashCode() : 0);
        }

        @k
        public String toString() {
            return "ActionWrapper(messenger=" + this.messenger + ", phone=" + this.phone + ", subscribe=" + this.subscribe + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Messenger messenger = this.messenger;
            if (messenger == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                messenger.writeToParcel(parcel, flags);
            }
            Phone phone = this.phone;
            if (phone == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                phone.writeToParcel(parcel, flags);
            }
            Subscribe subscribe = this.subscribe;
            if (subscribe == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                subscribe.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: ExtendedProfileBaseInfoMl.kt */
    @d
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Buttons;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$ActionWrapper;", "list", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getList", "()Ljava/util/List;", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Buttons implements Parcelable {

        @k
        public static final Parcelable.Creator<Buttons> CREATOR = new Creator();

        @c("list")
        @l
        private final List<ActionWrapper> list;

        /* compiled from: ExtendedProfileBaseInfoMl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Buttons> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Buttons createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(ActionWrapper.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Buttons(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Buttons[] newArray(int i12) {
                return new Buttons[i12];
            }
        }

        public Buttons(@l List<ActionWrapper> list) {
            this.list = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final List<ActionWrapper> getList() {
            return this.list;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            List<ActionWrapper> list = this.list;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((ActionWrapper) itA.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: ExtendedProfileBaseInfoMl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileBaseInfoMl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileBaseInfoMl createFromParcel(@k Parcel parcel) {
            return new ExtendedProfileBaseInfoMl(parcel.readString(), (Image) parcel.readParcelable(ExtendedProfileBaseInfoMl.class.getClassLoader()), parcel.readString(), (ProfileRating) parcel.readParcelable(ExtendedProfileBaseInfoMl.class.getClassLoader()), parcel.readInt() == 0 ? null : Buttons.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileBaseInfoMl[] newArray(int i12) {
            return new ExtendedProfileBaseInfoMl[i12];
        }
    }

    /* compiled from: ExtendedProfileBaseInfoMl.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u000f¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Messenger;", "Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Action;", "", BeduinCartItemModel.DISABLED_STRING, "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Messenger;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getDisabled", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Messenger extends Action {

        @k
        public static final Parcelable.Creator<Messenger> CREATOR = new Creator();

        @c(BeduinCartItemModel.DISABLED_STRING)
        @l
        private final Boolean disabled;

        @c("title")
        @l
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        /* compiled from: ExtendedProfileBaseInfoMl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Messenger> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Messenger createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Messenger(boolValueOf, parcel.readString(), (DeepLink) parcel.readParcelable(Messenger.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Messenger[] newArray(int i12) {
                return new Messenger[i12];
            }
        }

        public Messenger(@l Boolean bool, @l String str, @l DeepLink deepLink) {
            super(null);
            this.disabled = bool;
            this.title = str;
            this.uri = deepLink;
        }

        public static /* synthetic */ Messenger copy$default(Messenger messenger, Boolean bool, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                bool = messenger.disabled;
            }
            if ((i12 & 2) != 0) {
                str = messenger.title;
            }
            if ((i12 & 4) != 0) {
                deepLink = messenger.uri;
            }
            return messenger.copy(bool, str, deepLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }

        @k
        public final Messenger copy(@l Boolean disabled, @l String title, @l DeepLink uri) {
            return new Messenger(disabled, title, uri);
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
            return L.f(this.disabled, messenger.disabled) && L.f(this.title, messenger.title) && L.f(this.uri, messenger.uri);
        }

        @l
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        public int hashCode() {
            Boolean bool = this.disabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DeepLink deepLink = this.uri;
            return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Messenger(disabled=");
            sb2.append(this.disabled);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", uri=");
            return a.v(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Boolean bool = this.disabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.title);
            parcel.writeParcelable(this.uri, flags);
        }
    }

    /* compiled from: ExtendedProfileBaseInfoMl.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u000f¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Phone;", "Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Action;", "", BeduinCartItemModel.DISABLED_STRING, "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Phone;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getDisabled", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Phone extends Action {

        @k
        public static final Parcelable.Creator<Phone> CREATOR = new Creator();

        @c(BeduinCartItemModel.DISABLED_STRING)
        @l
        private final Boolean disabled;

        @c("title")
        @l
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        /* compiled from: ExtendedProfileBaseInfoMl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Phone> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Phone createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Phone(boolValueOf, parcel.readString(), (DeepLink) parcel.readParcelable(Phone.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Phone[] newArray(int i12) {
                return new Phone[i12];
            }
        }

        public Phone(@l Boolean bool, @l String str, @l DeepLink deepLink) {
            super(null);
            this.disabled = bool;
            this.title = str;
            this.uri = deepLink;
        }

        public static /* synthetic */ Phone copy$default(Phone phone, Boolean bool, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                bool = phone.disabled;
            }
            if ((i12 & 2) != 0) {
                str = phone.title;
            }
            if ((i12 & 4) != 0) {
                deepLink = phone.uri;
            }
            return phone.copy(bool, str, deepLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }

        @k
        public final Phone copy(@l Boolean disabled, @l String title, @l DeepLink uri) {
            return new Phone(disabled, title, uri);
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
            return L.f(this.disabled, phone.disabled) && L.f(this.title, phone.title) && L.f(this.uri, phone.uri);
        }

        @l
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        public int hashCode() {
            Boolean bool = this.disabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DeepLink deepLink = this.uri;
            return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Phone(disabled=");
            sb2.append(this.disabled);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", uri=");
            return a.v(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Boolean bool = this.disabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.title);
            parcel.writeParcelable(this.uri, flags);
        }
    }

    /* compiled from: ExtendedProfileBaseInfoMl.kt */
    @d
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010JL\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b\u0003\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b\u0004\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b'\u0010\u0010¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Subscribe;", "Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Action;", "", "isNotificationsActivated", "isSubscribed", BeduinCartItemModel.DISABLED_STRING, "", "subscribeTitle", "settingsTitle", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/ExtendedProfileBaseInfoMl$Subscribe;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getDisabled", "Ljava/lang/String;", "getSubscribeTitle", "getSettingsTitle", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Subscribe extends Action {

        @k
        public static final Parcelable.Creator<Subscribe> CREATOR = new Creator();

        @c(BeduinCartItemModel.DISABLED_STRING)
        @l
        private final Boolean disabled;

        @c("isNotificationsActivated")
        @l
        private final Boolean isNotificationsActivated;

        @c("isSubscribed")
        @l
        private final Boolean isSubscribed;

        @c("settingsTitle")
        @l
        private final String settingsTitle;

        @c("subscribeTitle")
        @l
        private final String subscribeTitle;

        /* compiled from: ExtendedProfileBaseInfoMl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Subscribe> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Subscribe createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Boolean boolValueOf3 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Subscribe(boolValueOf, boolValueOf2, boolValueOf3, parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Subscribe[] newArray(int i12) {
                return new Subscribe[i12];
            }
        }

        public Subscribe(@l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l String str, @l String str2) {
            super(null);
            this.isNotificationsActivated = bool;
            this.isSubscribed = bool2;
            this.disabled = bool3;
            this.subscribeTitle = str;
            this.settingsTitle = str2;
        }

        public static /* synthetic */ Subscribe copy$default(Subscribe subscribe, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                bool = subscribe.isNotificationsActivated;
            }
            if ((i12 & 2) != 0) {
                bool2 = subscribe.isSubscribed;
            }
            Boolean bool4 = bool2;
            if ((i12 & 4) != 0) {
                bool3 = subscribe.disabled;
            }
            Boolean bool5 = bool3;
            if ((i12 & 8) != 0) {
                str = subscribe.subscribeTitle;
            }
            String str3 = str;
            if ((i12 & 16) != 0) {
                str2 = subscribe.settingsTitle;
            }
            return subscribe.copy(bool, bool4, bool5, str3, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Boolean getIsNotificationsActivated() {
            return this.isNotificationsActivated;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Boolean getIsSubscribed() {
            return this.isSubscribed;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getSubscribeTitle() {
            return this.subscribeTitle;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getSettingsTitle() {
            return this.settingsTitle;
        }

        @k
        public final Subscribe copy(@l Boolean isNotificationsActivated, @l Boolean isSubscribed, @l Boolean disabled, @l String subscribeTitle, @l String settingsTitle) {
            return new Subscribe(isNotificationsActivated, isSubscribed, disabled, subscribeTitle, settingsTitle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subscribe)) {
                return false;
            }
            Subscribe subscribe = (Subscribe) other;
            return L.f(this.isNotificationsActivated, subscribe.isNotificationsActivated) && L.f(this.isSubscribed, subscribe.isSubscribed) && L.f(this.disabled, subscribe.disabled) && L.f(this.subscribeTitle, subscribe.subscribeTitle) && L.f(this.settingsTitle, subscribe.settingsTitle);
        }

        @l
        public final Boolean getDisabled() {
            return this.disabled;
        }

        @l
        public final String getSettingsTitle() {
            return this.settingsTitle;
        }

        @l
        public final String getSubscribeTitle() {
            return this.subscribeTitle;
        }

        public int hashCode() {
            Boolean bool = this.isNotificationsActivated;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.isSubscribed;
            int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.disabled;
            int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str = this.subscribeTitle;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.settingsTitle;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @l
        public final Boolean isNotificationsActivated() {
            return this.isNotificationsActivated;
        }

        @l
        public final Boolean isSubscribed() {
            return this.isSubscribed;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Subscribe(isNotificationsActivated=");
            sb2.append(this.isNotificationsActivated);
            sb2.append(", isSubscribed=");
            sb2.append(this.isSubscribed);
            sb2.append(", disabled=");
            sb2.append(this.disabled);
            sb2.append(", subscribeTitle=");
            sb2.append(this.subscribeTitle);
            sb2.append(", settingsTitle=");
            return C22026a.c(sb2, this.settingsTitle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Boolean bool = this.isNotificationsActivated;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            Boolean bool2 = this.isSubscribed;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool2);
            }
            Boolean bool3 = this.disabled;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool3);
            }
            parcel.writeString(this.subscribeTitle);
            parcel.writeString(this.settingsTitle);
        }
    }

    public ExtendedProfileBaseInfoMl(@l String str, @l Image image, @l String str2, @l ProfileRating profileRating, @l Buttons buttons) {
        this.widgetName = str;
        this.avatar = image;
        this.description = str2;
        this.rating = profileRating;
        this.buttons = buttons;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    public final Buttons getButtons() {
        return this.buttons;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final ProfileRating getRating() {
        return this.rating;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    public final void setRating(@l ProfileRating profileRating) {
        this.rating = profileRating;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.widgetName);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.rating, flags);
        Buttons buttons = this.buttons;
        if (buttons == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttons.writeToParcel(parcel, flags);
        }
    }
}
