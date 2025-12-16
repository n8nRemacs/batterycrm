package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactAccessService.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/ContactAccessService;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "legal", "Lcom/avito/android/remote/model/ContactAccessService$Service;", "service", "Lcom/avito/android/remote/model/Action;", "action", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ContactAccessService$Service;Lcom/avito/android/remote/model/Action;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "()Lcom/avito/android/remote/model/ContactAccessService$Service;", "component4", "()Lcom/avito/android/remote/model/Action;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ContactAccessService$Service;Lcom/avito/android/remote/model/Action;)Lcom/avito/android/remote/model/ContactAccessService;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getLegal", "Lcom/avito/android/remote/model/ContactAccessService$Service;", "getService", "Lcom/avito/android/remote/model/Action;", "getAction", "Service", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ContactAccessService implements Parcelable {

    @k
    public static final Parcelable.Creator<ContactAccessService> CREATOR = new Creator();

    @c("action")
    @k
    private final Action action;

    @c("legal")
    @l
    private final AttributedText legal;

    @c("service")
    @k
    private final Service service;

    @c("title")
    @k
    private final String title;

    /* compiled from: ContactAccessService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ContactAccessService> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContactAccessService createFromParcel(@k Parcel parcel) {
            return new ContactAccessService(parcel.readString(), (AttributedText) parcel.readParcelable(ContactAccessService.class.getClassLoader()), Service.CREATOR.createFromParcel(parcel), (Action) parcel.readParcelable(ContactAccessService.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContactAccessService[] newArray(int i12) {
            return new ContactAccessService[i12];
        }
    }

    /* compiled from: ContactAccessService.kt */
    @InterfaceC19823a
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JZ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u0012J \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b.\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0016¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/ContactAccessService$Service;", "Landroid/os/Parcelable;", "", "id", "name", "price", "", "priceValue", "title", "subtitle", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "component6", "component7", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/avito/android/remote/model/ContactAccessService$Service;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getName", "getPrice", "I", "getPriceValue", "getTitle", "getSubtitle", "Ljava/lang/Integer;", "getSize", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Service implements Parcelable {

        @k
        public static final Parcelable.Creator<Service> CREATOR = new Creator();

        @k
        private final String id;

        @k
        private final String name;

        @k
        private final String price;
        private final int priceValue;

        @l
        private final Integer size;

        @l
        private final String subtitle;

        @k
        private final String title;

        /* compiled from: ContactAccessService.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Service> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Service createFromParcel(@k Parcel parcel) {
                return new Service(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Service[] newArray(int i12) {
                return new Service[i12];
            }
        }

        public Service(@k String str, @k String str2, @k String str3, int i12, @k String str4, @l String str5, @l Integer num) {
            this.id = str;
            this.name = str2;
            this.price = str3;
            this.priceValue = i12;
            this.title = str4;
            this.subtitle = str5;
            this.size = num;
        }

        public static /* synthetic */ Service copy$default(Service service, String str, String str2, String str3, int i12, String str4, String str5, Integer num, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = service.id;
            }
            if ((i13 & 2) != 0) {
                str2 = service.name;
            }
            String str6 = str2;
            if ((i13 & 4) != 0) {
                str3 = service.price;
            }
            String str7 = str3;
            if ((i13 & 8) != 0) {
                i12 = service.priceValue;
            }
            int i14 = i12;
            if ((i13 & 16) != 0) {
                str4 = service.title;
            }
            String str8 = str4;
            if ((i13 & 32) != 0) {
                str5 = service.subtitle;
            }
            String str9 = str5;
            if ((i13 & 64) != 0) {
                num = service.size;
            }
            return service.copy(str, str6, str7, i14, str8, str9, num);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        /* renamed from: component4, reason: from getter */
        public final int getPriceValue() {
            return this.priceValue;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Integer getSize() {
            return this.size;
        }

        @k
        public final Service copy(@k String id2, @k String name, @k String price, int priceValue, @k String title, @l String subtitle, @l Integer size) {
            return new Service(id2, name, price, priceValue, title, subtitle, size);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Service)) {
                return false;
            }
            Service service = (Service) other;
            return L.f(this.id, service.id) && L.f(this.name, service.name) && L.f(this.price, service.price) && this.priceValue == service.priceValue && L.f(this.title, service.title) && L.f(this.subtitle, service.subtitle) && L.f(this.size, service.size);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @k
        public final String getPrice() {
            return this.price;
        }

        public final int getPriceValue() {
            return this.priceValue;
        }

        @l
        public final Integer getSize() {
            return this.size;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iD2 = H.d(r.e(this.priceValue, H.d(H.d(this.id.hashCode() * 31, 31, this.name), 31, this.price), 31), 31, this.title);
            String str = this.subtitle;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.size;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Service(id=");
            sb2.append(this.id);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", price=");
            sb2.append(this.price);
            sb2.append(", priceValue=");
            sb2.append(this.priceValue);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", size=");
            return s.j(sb2, this.size, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.name);
            parcel.writeString(this.price);
            parcel.writeInt(this.priceValue);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            Integer num = this.size;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
        }
    }

    public ContactAccessService(@k String str, @l AttributedText attributedText, @k Service service, @k Action action) {
        this.title = str;
        this.legal = attributedText;
        this.service = service;
        this.action = action;
    }

    public static /* synthetic */ ContactAccessService copy$default(ContactAccessService contactAccessService, String str, AttributedText attributedText, Service service, Action action, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = contactAccessService.title;
        }
        if ((i12 & 2) != 0) {
            attributedText = contactAccessService.legal;
        }
        if ((i12 & 4) != 0) {
            service = contactAccessService.service;
        }
        if ((i12 & 8) != 0) {
            action = contactAccessService.action;
        }
        return contactAccessService.copy(str, attributedText, service, action);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getLegal() {
        return this.legal;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Service getService() {
        return this.service;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @k
    public final ContactAccessService copy(@k String title, @l AttributedText legal, @k Service service, @k Action action) {
        return new ContactAccessService(title, legal, service, action);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactAccessService)) {
            return false;
        }
        ContactAccessService contactAccessService = (ContactAccessService) other;
        return L.f(this.title, contactAccessService.title) && L.f(this.legal, contactAccessService.legal) && L.f(this.service, contactAccessService.service) && L.f(this.action, contactAccessService.action);
    }

    @k
    public final Action getAction() {
        return this.action;
    }

    @l
    public final AttributedText getLegal() {
        return this.legal;
    }

    @k
    public final Service getService() {
        return this.service;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.legal;
        return this.action.hashCode() + ((this.service.hashCode() + ((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31);
    }

    @k
    public String toString() {
        return "ContactAccessService(title=" + this.title + ", legal=" + this.legal + ", service=" + this.service + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.legal, flags);
        this.service.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.action, flags);
    }
}
