package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactsGroup.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b+\u0010\u0012¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/ContactsGroup;", "Landroid/os/Parcelable;", "", "title", "", "editable", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "formSections", "Lcom/avito/android/remote/model/ContactsGroup$PrefilledContact;", "prefilledContactsGroup", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/ContactsGroup;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Z", "getEditable", "Ljava/util/List;", "getFormSections", "getPrefilledContactsGroup", "PrefilledContact", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ContactsGroup implements Parcelable {

    @k
    public static final Parcelable.Creator<ContactsGroup> CREATOR = new Creator();

    @c("editable")
    private final boolean editable;

    @c("formSections")
    @l
    private final List<ParameterSlot> formSections;

    @c("prefilledContacts")
    @l
    private final List<PrefilledContact> prefilledContactsGroup;

    @c("title")
    @k
    private final String title;

    /* compiled from: ContactsGroup.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ContactsGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContactsGroup createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(ContactsGroup.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(PrefilledContact.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new ContactsGroup(string, z12, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContactsGroup[] newArray(int i12) {
            return new ContactsGroup[i12];
        }
    }

    /* compiled from: ContactsGroup.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/ContactsGroup$PrefilledContact;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/ContactsGroup$PrefilledContact;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PrefilledContact implements Parcelable {

        @k
        public static final Parcelable.Creator<PrefilledContact> CREATOR = new Creator();

        @c("id")
        @k
        private final String id;

        @c("value")
        @k
        private final AttributedText text;

        /* compiled from: ContactsGroup.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PrefilledContact> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PrefilledContact createFromParcel(@k Parcel parcel) {
                return new PrefilledContact(parcel.readString(), (AttributedText) parcel.readParcelable(PrefilledContact.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PrefilledContact[] newArray(int i12) {
                return new PrefilledContact[i12];
            }
        }

        public PrefilledContact(@k String str, @k AttributedText attributedText) {
            this.id = str;
            this.text = attributedText;
        }

        public static /* synthetic */ PrefilledContact copy$default(PrefilledContact prefilledContact, String str, AttributedText attributedText, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = prefilledContact.id;
            }
            if ((i12 & 2) != 0) {
                attributedText = prefilledContact.text;
            }
            return prefilledContact.copy(str, attributedText);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @k
        public final PrefilledContact copy(@k String id2, @k AttributedText text) {
            return new PrefilledContact(id2, text);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrefilledContact)) {
                return false;
            }
            PrefilledContact prefilledContact = (PrefilledContact) other;
            return L.f(this.id, prefilledContact.id) && L.f(this.text, prefilledContact.text);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final AttributedText getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.id.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PrefilledContact(id=");
            sb2.append(this.id);
            sb2.append(", text=");
            return a.w(sb2, this.text, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeParcelable(this.text, flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContactsGroup(@k String str, boolean z12, @l List<? extends ParameterSlot> list, @l List<PrefilledContact> list2) {
        this.title = str;
        this.editable = z12;
        this.formSections = list;
        this.prefilledContactsGroup = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactsGroup copy$default(ContactsGroup contactsGroup, String str, boolean z12, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = contactsGroup.title;
        }
        if ((i12 & 2) != 0) {
            z12 = contactsGroup.editable;
        }
        if ((i12 & 4) != 0) {
            list = contactsGroup.formSections;
        }
        if ((i12 & 8) != 0) {
            list2 = contactsGroup.prefilledContactsGroup;
        }
        return contactsGroup.copy(str, z12, list, list2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEditable() {
        return this.editable;
    }

    @l
    public final List<ParameterSlot> component3() {
        return this.formSections;
    }

    @l
    public final List<PrefilledContact> component4() {
        return this.prefilledContactsGroup;
    }

    @k
    public final ContactsGroup copy(@k String title, boolean editable, @l List<? extends ParameterSlot> formSections, @l List<PrefilledContact> prefilledContactsGroup) {
        return new ContactsGroup(title, editable, formSections, prefilledContactsGroup);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactsGroup)) {
            return false;
        }
        ContactsGroup contactsGroup = (ContactsGroup) other;
        return L.f(this.title, contactsGroup.title) && this.editable == contactsGroup.editable && L.f(this.formSections, contactsGroup.formSections) && L.f(this.prefilledContactsGroup, contactsGroup.prefilledContactsGroup);
    }

    public final boolean getEditable() {
        return this.editable;
    }

    @l
    public final List<ParameterSlot> getFormSections() {
        return this.formSections;
    }

    @l
    public final List<PrefilledContact> getPrefilledContactsGroup() {
        return this.prefilledContactsGroup;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i12 = r.i(this.title.hashCode() * 31, 31, this.editable);
        List<ParameterSlot> list = this.formSections;
        int iHashCode = (i12 + (list == null ? 0 : list.hashCode())) * 31;
        List<PrefilledContact> list2 = this.prefilledContactsGroup;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ContactsGroup(title=");
        sb2.append(this.title);
        sb2.append(", editable=");
        sb2.append(this.editable);
        sb2.append(", formSections=");
        sb2.append(this.formSections);
        sb2.append(", prefilledContactsGroup=");
        return H.p(sb2, this.prefilledContactsGroup, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeInt(this.editable ? 1 : 0);
        List<ParameterSlot> list = this.formSections;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<PrefilledContact> list2 = this.prefilledContactsGroup;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((PrefilledContact) itA2.next()).writeToParcel(parcel, flags);
        }
    }
}
