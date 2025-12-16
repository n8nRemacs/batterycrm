package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersBuyerResponse.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJj\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b&\u0010 J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b+\u0010,R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b1\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b4\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b5\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001a¨\u00068"}, d2 = {"Lcom/avito/android/remote/model/StrOrdersBuyerResponseSection;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItem;", "items", "", "size", "name", "Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionPagination;", "pagination", "title", "description", "Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionButton;", "button", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionPagination;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionButton;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionPagination;", "component5", "component6", "component7", "()Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionButton;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionPagination;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionButton;)Lcom/avito/android/remote/model/StrOrdersBuyerResponseSection;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getItems", "Ljava/lang/String;", "getSize", "getName", "Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionPagination;", "getPagination", "getTitle", "getDescription", "Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionButton;", "getButton", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrOrdersBuyerResponseSection implements Parcelable {

    @k
    public static final Parcelable.Creator<StrOrdersBuyerResponseSection> CREATOR = new Creator();

    @c("button")
    @l
    private final StrOrdersBuyerResponseSectionButton button;

    @c("description")
    @l
    private final String description;

    @c("items")
    @l
    private final List<StrOrdersBuyerResponseSectionItem> items;

    @c("name")
    @l
    private final String name;

    @c("pagination")
    @l
    private final StrOrdersBuyerResponseSectionPagination pagination;

    @c("size")
    @l
    private final String size;

    @c("title")
    @l
    private final String title;

    /* compiled from: StrOrdersBuyerResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrOrdersBuyerResponseSection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrOrdersBuyerResponseSection createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(StrOrdersBuyerResponseSectionItem.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new StrOrdersBuyerResponseSection(arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StrOrdersBuyerResponseSectionPagination.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? StrOrdersBuyerResponseSectionButton.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrOrdersBuyerResponseSection[] newArray(int i12) {
            return new StrOrdersBuyerResponseSection[i12];
        }
    }

    public StrOrdersBuyerResponseSection(@l List<StrOrdersBuyerResponseSectionItem> list, @l String str, @l String str2, @l StrOrdersBuyerResponseSectionPagination strOrdersBuyerResponseSectionPagination, @l String str3, @l String str4, @l StrOrdersBuyerResponseSectionButton strOrdersBuyerResponseSectionButton) {
        this.items = list;
        this.size = str;
        this.name = str2;
        this.pagination = strOrdersBuyerResponseSectionPagination;
        this.title = str3;
        this.description = str4;
        this.button = strOrdersBuyerResponseSectionButton;
    }

    public static /* synthetic */ StrOrdersBuyerResponseSection copy$default(StrOrdersBuyerResponseSection strOrdersBuyerResponseSection, List list, String str, String str2, StrOrdersBuyerResponseSectionPagination strOrdersBuyerResponseSectionPagination, String str3, String str4, StrOrdersBuyerResponseSectionButton strOrdersBuyerResponseSectionButton, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = strOrdersBuyerResponseSection.items;
        }
        if ((i12 & 2) != 0) {
            str = strOrdersBuyerResponseSection.size;
        }
        String str5 = str;
        if ((i12 & 4) != 0) {
            str2 = strOrdersBuyerResponseSection.name;
        }
        String str6 = str2;
        if ((i12 & 8) != 0) {
            strOrdersBuyerResponseSectionPagination = strOrdersBuyerResponseSection.pagination;
        }
        StrOrdersBuyerResponseSectionPagination strOrdersBuyerResponseSectionPagination2 = strOrdersBuyerResponseSectionPagination;
        if ((i12 & 16) != 0) {
            str3 = strOrdersBuyerResponseSection.title;
        }
        String str7 = str3;
        if ((i12 & 32) != 0) {
            str4 = strOrdersBuyerResponseSection.description;
        }
        String str8 = str4;
        if ((i12 & 64) != 0) {
            strOrdersBuyerResponseSectionButton = strOrdersBuyerResponseSection.button;
        }
        return strOrdersBuyerResponseSection.copy(list, str5, str6, strOrdersBuyerResponseSectionPagination2, str7, str8, strOrdersBuyerResponseSectionButton);
    }

    @l
    public final List<StrOrdersBuyerResponseSectionItem> component1() {
        return this.items;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final StrOrdersBuyerResponseSectionPagination getPagination() {
        return this.pagination;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final StrOrdersBuyerResponseSectionButton getButton() {
        return this.button;
    }

    @k
    public final StrOrdersBuyerResponseSection copy(@l List<StrOrdersBuyerResponseSectionItem> items, @l String size, @l String name, @l StrOrdersBuyerResponseSectionPagination pagination, @l String title, @l String description, @l StrOrdersBuyerResponseSectionButton button) {
        return new StrOrdersBuyerResponseSection(items, size, name, pagination, title, description, button);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrOrdersBuyerResponseSection)) {
            return false;
        }
        StrOrdersBuyerResponseSection strOrdersBuyerResponseSection = (StrOrdersBuyerResponseSection) other;
        return L.f(this.items, strOrdersBuyerResponseSection.items) && L.f(this.size, strOrdersBuyerResponseSection.size) && L.f(this.name, strOrdersBuyerResponseSection.name) && L.f(this.pagination, strOrdersBuyerResponseSection.pagination) && L.f(this.title, strOrdersBuyerResponseSection.title) && L.f(this.description, strOrdersBuyerResponseSection.description) && L.f(this.button, strOrdersBuyerResponseSection.button);
    }

    @l
    public final StrOrdersBuyerResponseSectionButton getButton() {
        return this.button;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final List<StrOrdersBuyerResponseSectionItem> getItems() {
        return this.items;
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final StrOrdersBuyerResponseSectionPagination getPagination() {
        return this.pagination;
    }

    @l
    public final String getSize() {
        return this.size;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        List<StrOrdersBuyerResponseSectionItem> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.size;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StrOrdersBuyerResponseSectionPagination strOrdersBuyerResponseSectionPagination = this.pagination;
        int iHashCode4 = (iHashCode3 + (strOrdersBuyerResponseSectionPagination == null ? 0 : strOrdersBuyerResponseSectionPagination.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        StrOrdersBuyerResponseSectionButton strOrdersBuyerResponseSectionButton = this.button;
        return iHashCode6 + (strOrdersBuyerResponseSectionButton != null ? strOrdersBuyerResponseSectionButton.hashCode() : 0);
    }

    @k
    public String toString() {
        return "StrOrdersBuyerResponseSection(items=" + this.items + ", size=" + this.size + ", name=" + this.name + ", pagination=" + this.pagination + ", title=" + this.title + ", description=" + this.description + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<StrOrdersBuyerResponseSectionItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((StrOrdersBuyerResponseSectionItem) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.size);
        parcel.writeString(this.name);
        StrOrdersBuyerResponseSectionPagination strOrdersBuyerResponseSectionPagination = this.pagination;
        if (strOrdersBuyerResponseSectionPagination == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strOrdersBuyerResponseSectionPagination.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        StrOrdersBuyerResponseSectionButton strOrdersBuyerResponseSectionButton = this.button;
        if (strOrdersBuyerResponseSectionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strOrdersBuyerResponseSectionButton.writeToParcel(parcel, flags);
        }
    }
}
