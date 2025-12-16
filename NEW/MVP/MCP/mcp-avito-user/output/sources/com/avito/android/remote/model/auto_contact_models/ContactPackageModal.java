package com.avito.android.remote.model.auto_contact_models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Models.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\\\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u0018¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/auto_contact_models/ContactPackageModal;", "Landroid/os/Parcelable;", "", "title", "description", "benefitsTitle", "", "Lcom/avito/android/remote/model/auto_contact_models/Benefit;", "benefits", "Lcom/avito/android/remote/model/text/AttributedText;", "footerText", "Lcom/avito/android/remote/model/auto_contact_models/Button;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/auto_contact_models/Button;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Lcom/avito/android/remote/model/auto_contact_models/Button;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/auto_contact_models/Button;)Lcom/avito/android/remote/model/auto_contact_models/ContactPackageModal;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "getBenefitsTitle", "Ljava/util/List;", "getBenefits", "Lcom/avito/android/remote/model/text/AttributedText;", "getFooterText", "Lcom/avito/android/remote/model/auto_contact_models/Button;", "getButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ContactPackageModal implements Parcelable {

    @k
    public static final Parcelable.Creator<ContactPackageModal> CREATOR = new Creator();

    @c("benefits")
    @l
    private final List<Benefit> benefits;

    @c("benefitsTitle")
    @l
    private final String benefitsTitle;

    @c("button")
    @k
    private final Button button;

    @c("description")
    @l
    private final String description;

    @c("footerText")
    @l
    private final AttributedText footerText;

    @c("title")
    @l
    private final String title;

    /* compiled from: Models.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ContactPackageModal> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContactPackageModal createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Benefit.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new ContactPackageModal(string, string2, string3, arrayList, (AttributedText) parcel.readParcelable(ContactPackageModal.class.getClassLoader()), Button.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContactPackageModal[] newArray(int i12) {
            return new ContactPackageModal[i12];
        }
    }

    public ContactPackageModal(@l String str, @l String str2, @l String str3, @l List<Benefit> list, @l AttributedText attributedText, @k Button button) {
        this.title = str;
        this.description = str2;
        this.benefitsTitle = str3;
        this.benefits = list;
        this.footerText = attributedText;
        this.button = button;
    }

    public static /* synthetic */ ContactPackageModal copy$default(ContactPackageModal contactPackageModal, String str, String str2, String str3, List list, AttributedText attributedText, Button button, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = contactPackageModal.title;
        }
        if ((i12 & 2) != 0) {
            str2 = contactPackageModal.description;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = contactPackageModal.benefitsTitle;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            list = contactPackageModal.benefits;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            attributedText = contactPackageModal.footerText;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 32) != 0) {
            button = contactPackageModal.button;
        }
        return contactPackageModal.copy(str, str4, str5, list2, attributedText2, button);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getBenefitsTitle() {
        return this.benefitsTitle;
    }

    @l
    public final List<Benefit> component4() {
        return this.benefits;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AttributedText getFooterText() {
        return this.footerText;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @k
    public final ContactPackageModal copy(@l String title, @l String description, @l String benefitsTitle, @l List<Benefit> benefits, @l AttributedText footerText, @k Button button) {
        return new ContactPackageModal(title, description, benefitsTitle, benefits, footerText, button);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactPackageModal)) {
            return false;
        }
        ContactPackageModal contactPackageModal = (ContactPackageModal) other;
        return L.f(this.title, contactPackageModal.title) && L.f(this.description, contactPackageModal.description) && L.f(this.benefitsTitle, contactPackageModal.benefitsTitle) && L.f(this.benefits, contactPackageModal.benefits) && L.f(this.footerText, contactPackageModal.footerText) && L.f(this.button, contactPackageModal.button);
    }

    @l
    public final List<Benefit> getBenefits() {
        return this.benefits;
    }

    @l
    public final String getBenefitsTitle() {
        return this.benefitsTitle;
    }

    @k
    public final Button getButton() {
        return this.button;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final AttributedText getFooterText() {
        return this.footerText;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.benefitsTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Benefit> list = this.benefits;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        AttributedText attributedText = this.footerText;
        return this.button.hashCode() + ((iHashCode4 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        return "ContactPackageModal(title=" + this.title + ", description=" + this.description + ", benefitsTitle=" + this.benefitsTitle + ", benefits=" + this.benefits + ", footerText=" + this.footerText + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.benefitsTitle);
        List<Benefit> list = this.benefits;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Benefit) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeParcelable(this.footerText, flags);
        this.button.writeToParcel(parcel, flags);
    }
}
