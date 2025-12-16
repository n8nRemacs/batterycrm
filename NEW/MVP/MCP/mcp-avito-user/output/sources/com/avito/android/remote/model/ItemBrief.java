package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ItemBrief.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JT\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010)R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010&\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010)R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010&\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010)R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010&\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010&\u001a\u0004\b0\u0010\r\"\u0004\b1\u0010)R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u0013\"\u0004\b4\u00105¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/ItemBrief;", "Landroid/os/Parcelable;", "", "id", "categoryId", "version", "title", "description", "Lcom/avito/android/remote/model/Navigation;", "navigation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Navigation;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/Navigation;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Navigation;)Lcom/avito/android/remote/model/ItemBrief;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "getCategoryId", "setCategoryId", "getVersion", "setVersion", "getTitle", "setTitle", "getDescription", "setDescription", "Lcom/avito/android/remote/model/Navigation;", "getNavigation", "setNavigation", "(Lcom/avito/android/remote/model/Navigation;)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ItemBrief implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemBrief> CREATOR = new Creator();

    @c("categoryId")
    @l
    private String categoryId;

    @c("description")
    @l
    private String description;

    @c("id")
    @k
    private String id;

    @c("navigation")
    @k
    private Navigation navigation;

    @c("title")
    @l
    private String title;

    @c("version")
    @l
    private String version;

    /* compiled from: ItemBrief.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemBrief> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemBrief createFromParcel(@k Parcel parcel) {
            return new ItemBrief(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), Navigation.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemBrief[] newArray(int i12) {
            return new ItemBrief[i12];
        }
    }

    public ItemBrief(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @k Navigation navigation2) {
        this.id = str;
        this.categoryId = str2;
        this.version = str3;
        this.title = str4;
        this.description = str5;
        this.navigation = navigation2;
    }

    public static /* synthetic */ ItemBrief copy$default(ItemBrief itemBrief, String str, String str2, String str3, String str4, String str5, Navigation navigation2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = itemBrief.id;
        }
        if ((i12 & 2) != 0) {
            str2 = itemBrief.categoryId;
        }
        String str6 = str2;
        if ((i12 & 4) != 0) {
            str3 = itemBrief.version;
        }
        String str7 = str3;
        if ((i12 & 8) != 0) {
            str4 = itemBrief.title;
        }
        String str8 = str4;
        if ((i12 & 16) != 0) {
            str5 = itemBrief.description;
        }
        String str9 = str5;
        if ((i12 & 32) != 0) {
            navigation2 = itemBrief.navigation;
        }
        return itemBrief.copy(str, str6, str7, str8, str9, navigation2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final Navigation getNavigation() {
        return this.navigation;
    }

    @k
    public final ItemBrief copy(@k String id2, @l String categoryId, @l String version, @l String title, @l String description, @k Navigation navigation2) {
        return new ItemBrief(id2, categoryId, version, title, description, navigation2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemBrief)) {
            return false;
        }
        ItemBrief itemBrief = (ItemBrief) other;
        return L.f(this.id, itemBrief.id) && L.f(this.categoryId, itemBrief.categoryId) && L.f(this.version, itemBrief.version) && L.f(this.title, itemBrief.title) && L.f(this.description, itemBrief.description) && L.f(this.navigation, itemBrief.navigation);
    }

    @l
    public final String getCategoryId() {
        return this.categoryId;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final Navigation getNavigation() {
        return this.navigation;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.categoryId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.version;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        return this.navigation.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final void setCategoryId(@l String str) {
        this.categoryId = str;
    }

    public final void setDescription(@l String str) {
        this.description = str;
    }

    public final void setId(@k String str) {
        this.id = str;
    }

    public final void setNavigation(@k Navigation navigation2) {
        this.navigation = navigation2;
    }

    public final void setTitle(@l String str) {
        this.title = str;
    }

    public final void setVersion(@l String str) {
        this.version = str;
    }

    @k
    public String toString() {
        return "ItemBrief(id=" + this.id + ", categoryId=" + this.categoryId + ", version=" + this.version + ", title=" + this.title + ", description=" + this.description + ", navigation=" + this.navigation + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.categoryId);
        parcel.writeString(this.version);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        this.navigation.writeToParcel(parcel, flags);
    }

    public /* synthetic */ ItemBrief(String str, String str2, String str3, String str4, String str5, Navigation navigation2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) == 0 ? str5 : null, (i12 & 32) != 0 ? new Navigation(null, null, null, null, null, null, null, null, null, 511, null) : navigation2);
    }
}
