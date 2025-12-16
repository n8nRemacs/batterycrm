package com.avito.android.remote.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsGroup.kt */
@d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/models/SparePartsGroup;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "groupTitle", "text", "buttonText", "", "isButtonDisabled", "", "groups", "Lcom/avito/android/remote/models/SparePartsSpecification;", "specifications", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "getText", "c", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getGroups", "()Ljava/util/List;", "e", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SparePartsGroup implements Parcelable {

    @k
    public static final Parcelable.Creator<SparePartsGroup> CREATOR = new a();

    @c("buttonText")
    @l
    private final String buttonText;

    @c("groupTitle")
    @k
    private final String groupTitle;

    @c("groupings")
    @l
    private final List<SparePartsGroup> groups;

    @c("image")
    @l
    private final UniversalImage image;

    @c("isButtonDisabled")
    @l
    private final Boolean isButtonDisabled;

    @c("specifications")
    @l
    private final List<SparePartsSpecification> specifications;

    @c("text")
    @k
    private final String text;

    /* compiled from: SparePartsGroup.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SparePartsGroup> {
        @Override // android.os.Parcelable.Creator
        public final SparePartsGroup createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(SparePartsGroup.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(SparePartsGroup.CREATOR, parcel, arrayList3, iC3, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(SparePartsSpecification.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new SparePartsGroup(universalImage, string, string2, string3, boolValueOf, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final SparePartsGroup[] newArray(int i12) {
            return new SparePartsGroup[i12];
        }
    }

    public SparePartsGroup(@l UniversalImage universalImage, @k String str, @k String str2, @l String str3, @l Boolean bool, @l List<SparePartsGroup> list, @l List<SparePartsSpecification> list2) {
        this.image = universalImage;
        this.groupTitle = str;
        this.text = str2;
        this.buttonText = str3;
        this.isButtonDisabled = bool;
        this.groups = list;
        this.specifications = list2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getGroupTitle() {
        return this.groupTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<SparePartsSpecification> e() {
        return this.specifications;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SparePartsGroup)) {
            return false;
        }
        SparePartsGroup sparePartsGroup = (SparePartsGroup) obj;
        return L.f(this.image, sparePartsGroup.image) && L.f(this.groupTitle, sparePartsGroup.groupTitle) && L.f(this.text, sparePartsGroup.text) && L.f(this.buttonText, sparePartsGroup.buttonText) && L.f(this.isButtonDisabled, sparePartsGroup.isButtonDisabled) && L.f(this.groups, sparePartsGroup.groups) && L.f(this.specifications, sparePartsGroup.specifications);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Boolean getIsButtonDisabled() {
        return this.isButtonDisabled;
    }

    @l
    public final List<SparePartsGroup> getGroups() {
        return this.groups;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        UniversalImage universalImage = this.image;
        int iD2 = H.d(H.d((universalImage == null ? 0 : universalImage.hashCode()) * 31, 31, this.groupTitle), 31, this.text);
        String str = this.buttonText;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isButtonDisabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<SparePartsGroup> list = this.groups;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<SparePartsSpecification> list2 = this.specifications;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SparePartsGroup(image=");
        sb2.append(this.image);
        sb2.append(", groupTitle=");
        sb2.append(this.groupTitle);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", buttonText=");
        sb2.append(this.buttonText);
        sb2.append(", isButtonDisabled=");
        sb2.append(this.isButtonDisabled);
        sb2.append(", groups=");
        sb2.append(this.groups);
        sb2.append(", specifications=");
        return H.p(sb2, this.specifications, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.image, i12);
        parcel.writeString(this.groupTitle);
        parcel.writeString(this.text);
        parcel.writeString(this.buttonText);
        Boolean bool = this.isButtonDisabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<SparePartsGroup> list = this.groups;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((SparePartsGroup) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<SparePartsSpecification> list2 = this.specifications;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((SparePartsSpecification) itA2.next()).writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ SparePartsGroup(UniversalImage universalImage, String str, String str2, String str3, Boolean bool, List list, List list2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : universalImage, str, str2, str3, bool, list, list2);
    }
}
