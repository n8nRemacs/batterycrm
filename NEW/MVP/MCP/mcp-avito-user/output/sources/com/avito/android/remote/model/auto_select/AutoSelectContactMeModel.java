package com.avito.android.remote.model.auto_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectContactMeModel.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/auto_select/AutoSelectContactMeModel;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/auto_select/AutoSelectContactMeModel$ContactModel;", "phone", NotificationsSettings.Section.SECTION_MESSENGER, "<init>", "(Lcom/avito/android/remote/model/auto_select/AutoSelectContactMeModel$ContactModel;Lcom/avito/android/remote/model/auto_select/AutoSelectContactMeModel$ContactModel;)V", "component1", "()Lcom/avito/android/remote/model/auto_select/AutoSelectContactMeModel$ContactModel;", "component2", "copy", "(Lcom/avito/android/remote/model/auto_select/AutoSelectContactMeModel$ContactModel;Lcom/avito/android/remote/model/auto_select/AutoSelectContactMeModel$ContactModel;)Lcom/avito/android/remote/model/auto_select/AutoSelectContactMeModel;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/auto_select/AutoSelectContactMeModel$ContactModel;", "getPhone", "getMessenger", "Contact", "ContactModel", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutoSelectContactMeModel implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoSelectContactMeModel> CREATOR = new Creator();

    @c(NotificationsSettings.Section.SECTION_MESSENGER)
    @k
    private final ContactModel messenger;

    @c("phone")
    @k
    private final ContactModel phone;

    /* compiled from: AutoSelectContactMeModel.kt */
    @d
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/auto_select/AutoSelectContactMeModel$ContactModel;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/auto_select/AutoSelectContactMeModel$Contact;", "contacts", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/auto_select/AutoSelectContactMeModel$ContactModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getContacts", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContactModel implements Parcelable {

        @k
        public static final Parcelable.Creator<ContactModel> CREATOR = new Creator();

        @c("contacts")
        @k
        private final List<Contact> contacts;

        @c("title")
        @k
        private final String title;

        /* compiled from: AutoSelectContactMeModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ContactModel> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ContactModel createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Contact.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new ContactModel(string, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ContactModel[] newArray(int i12) {
                return new ContactModel[i12];
            }
        }

        public ContactModel(@k String str, @k List<Contact> list) {
            this.title = str;
            this.contacts = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ContactModel copy$default(ContactModel contactModel, String str, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = contactModel.title;
            }
            if ((i12 & 2) != 0) {
                list = contactModel.contacts;
            }
            return contactModel.copy(str, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final List<Contact> component2() {
            return this.contacts;
        }

        @k
        public final ContactModel copy(@k String title, @k List<Contact> contacts) {
            return new ContactModel(title, contacts);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContactModel)) {
                return false;
            }
            ContactModel contactModel = (ContactModel) other;
            return L.f(this.title, contactModel.title) && L.f(this.contacts, contactModel.contacts);
        }

        @k
        public final List<Contact> getContacts() {
            return this.contacts;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.contacts.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ContactModel(title=");
            sb2.append(this.title);
            sb2.append(", contacts=");
            return H.p(sb2, this.contacts, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            Iterator itJ = C0.j(this.contacts, parcel);
            while (itJ.hasNext()) {
                ((Contact) itJ.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: AutoSelectContactMeModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoSelectContactMeModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectContactMeModel createFromParcel(@k Parcel parcel) {
            Parcelable.Creator<ContactModel> creator = ContactModel.CREATOR;
            return new AutoSelectContactMeModel(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectContactMeModel[] newArray(int i12) {
            return new AutoSelectContactMeModel[i12];
        }
    }

    public AutoSelectContactMeModel(@k ContactModel contactModel, @k ContactModel contactModel2) {
        this.phone = contactModel;
        this.messenger = contactModel2;
    }

    public static /* synthetic */ AutoSelectContactMeModel copy$default(AutoSelectContactMeModel autoSelectContactMeModel, ContactModel contactModel, ContactModel contactModel2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            contactModel = autoSelectContactMeModel.phone;
        }
        if ((i12 & 2) != 0) {
            contactModel2 = autoSelectContactMeModel.messenger;
        }
        return autoSelectContactMeModel.copy(contactModel, contactModel2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final ContactModel getPhone() {
        return this.phone;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final ContactModel getMessenger() {
        return this.messenger;
    }

    @k
    public final AutoSelectContactMeModel copy(@k ContactModel phone, @k ContactModel messenger) {
        return new AutoSelectContactMeModel(phone, messenger);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoSelectContactMeModel)) {
            return false;
        }
        AutoSelectContactMeModel autoSelectContactMeModel = (AutoSelectContactMeModel) other;
        return L.f(this.phone, autoSelectContactMeModel.phone) && L.f(this.messenger, autoSelectContactMeModel.messenger);
    }

    @k
    public final ContactModel getMessenger() {
        return this.messenger;
    }

    @k
    public final ContactModel getPhone() {
        return this.phone;
    }

    public int hashCode() {
        return this.messenger.hashCode() + (this.phone.hashCode() * 31);
    }

    @k
    public String toString() {
        return "AutoSelectContactMeModel(phone=" + this.phone + ", messenger=" + this.messenger + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.phone.writeToParcel(parcel, flags);
        this.messenger.writeToParcel(parcel, flags);
    }

    /* compiled from: AutoSelectContactMeModel.kt */
    @d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJZ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020 HÖ\u0001¢\u0006\u0004\b'\u0010\"J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020 HÖ\u0001¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u0018R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b\f\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010\u001c¨\u0006:"}, d2 = {"Lcom/avito/android/remote/model/auto_select/AutoSelectContactMeModel$Contact;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "", "color", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "", "isActive", "needsLogItemCall", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;ZLjava/lang/Boolean;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component6", "()Z", "component7", "()Ljava/lang/Boolean;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;ZLjava/lang/Boolean;)Lcom/avito/android/remote/model/auto_select/AutoSelectContactMeModel$Contact;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getDescription", "Ljava/lang/String;", "getColor", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "Z", "Ljava/lang/Boolean;", "getNeedsLogItemCall", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Contact implements Parcelable {

        @k
        public static final Parcelable.Creator<Contact> CREATOR = new Creator();

        @c("color")
        @k
        private final String color;

        @c("description")
        @k
        private final AttributedText description;

        @c("image")
        @k
        private final UniversalImage image;

        @c("isActive")
        private final boolean isActive;

        @c("needsLogItemCall")
        @l
        private final Boolean needsLogItemCall;

        @c("title")
        @k
        private final AttributedText title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        /* compiled from: AutoSelectContactMeModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Contact> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Contact createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                AttributedText attributedText = (AttributedText) parcel.readParcelable(Contact.class.getClassLoader());
                AttributedText attributedText2 = (AttributedText) parcel.readParcelable(Contact.class.getClassLoader());
                String string = parcel.readString();
                UniversalImage universalImage = (UniversalImage) parcel.readParcelable(Contact.class.getClassLoader());
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Contact.class.getClassLoader());
                boolean z12 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Contact(attributedText, attributedText2, string, universalImage, deepLink, z12, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Contact[] newArray(int i12) {
                return new Contact[i12];
            }
        }

        public Contact(@k AttributedText attributedText, @k AttributedText attributedText2, @k String str, @k UniversalImage universalImage, @l DeepLink deepLink, boolean z12, @l Boolean bool) {
            this.title = attributedText;
            this.description = attributedText2;
            this.color = str;
            this.image = universalImage;
            this.uri = deepLink;
            this.isActive = z12;
            this.needsLogItemCall = bool;
        }

        public static /* synthetic */ Contact copy$default(Contact contact, AttributedText attributedText, AttributedText attributedText2, String str, UniversalImage universalImage, DeepLink deepLink, boolean z12, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                attributedText = contact.title;
            }
            if ((i12 & 2) != 0) {
                attributedText2 = contact.description;
            }
            AttributedText attributedText3 = attributedText2;
            if ((i12 & 4) != 0) {
                str = contact.color;
            }
            String str2 = str;
            if ((i12 & 8) != 0) {
                universalImage = contact.image;
            }
            UniversalImage universalImage2 = universalImage;
            if ((i12 & 16) != 0) {
                deepLink = contact.uri;
            }
            DeepLink deepLink2 = deepLink;
            if ((i12 & 32) != 0) {
                z12 = contact.isActive;
            }
            boolean z13 = z12;
            if ((i12 & 64) != 0) {
                bool = contact.needsLogItemCall;
            }
            return contact.copy(attributedText, attributedText3, str2, universalImage2, deepLink2, z13, bool);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Boolean getNeedsLogItemCall() {
            return this.needsLogItemCall;
        }

        @k
        public final Contact copy(@k AttributedText title, @k AttributedText description, @k String color, @k UniversalImage image, @l DeepLink uri, boolean isActive, @l Boolean needsLogItemCall) {
            return new Contact(title, description, color, image, uri, isActive, needsLogItemCall);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Contact)) {
                return false;
            }
            Contact contact = (Contact) other;
            return L.f(this.title, contact.title) && L.f(this.description, contact.description) && L.f(this.color, contact.color) && L.f(this.image, contact.image) && L.f(this.uri, contact.uri) && this.isActive == contact.isActive && L.f(this.needsLogItemCall, contact.needsLogItemCall);
        }

        @k
        public final String getColor() {
            return this.color;
        }

        @k
        public final AttributedText getDescription() {
            return this.description;
        }

        @k
        public final UniversalImage getImage() {
            return this.image;
        }

        @l
        public final Boolean getNeedsLogItemCall() {
            return this.needsLogItemCall;
        }

        @k
        public final AttributedText getTitle() {
            return this.title;
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        public int hashCode() {
            int iA2 = a.a(H.d(a.b(this.title.hashCode() * 31, 31, this.description), 31, this.color), 31, this.image);
            DeepLink deepLink = this.uri;
            int i12 = r.i((iA2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.isActive);
            Boolean bool = this.needsLogItemCall;
            return i12 + (bool != null ? bool.hashCode() : 0);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Contact(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", color=");
            sb2.append(this.color);
            sb2.append(", image=");
            sb2.append(this.image);
            sb2.append(", uri=");
            sb2.append(this.uri);
            sb2.append(", isActive=");
            sb2.append(this.isActive);
            sb2.append(", needsLogItemCall=");
            return C0.g(sb2, this.needsLogItemCall, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.title, flags);
            parcel.writeParcelable(this.description, flags);
            parcel.writeString(this.color);
            parcel.writeParcelable(this.image, flags);
            parcel.writeParcelable(this.uri, flags);
            parcel.writeInt(this.isActive ? 1 : 0);
            Boolean bool = this.needsLogItemCall;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }

        public /* synthetic */ Contact(AttributedText attributedText, AttributedText attributedText2, String str, UniversalImage universalImage, DeepLink deepLink, boolean z12, Boolean bool, int i12, C42822w c42822w) {
            this(attributedText, attributedText2, str, universalImage, (i12 & 16) != 0 ? null : deepLink, z12, (i12 & 64) != 0 ? null : bool);
        }
    }
}
