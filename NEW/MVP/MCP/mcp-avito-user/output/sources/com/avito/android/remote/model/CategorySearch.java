package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategorySearch.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u00014BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u001e\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017Jf\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u000fR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0017¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/CategorySearch;", "Landroid/os/Parcelable;", "", "id", "parentId", "name", "", "params", "", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "Lcom/avito/android/remote/model/CategorySearch$Badge;", "badge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/avito/android/remote/model/CategorySearch$Badge;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "component5", "()Ljava/util/List;", "component6", "()Lcom/avito/android/remote/model/CategorySearch$Badge;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/avito/android/remote/model/CategorySearch$Badge;)Lcom/avito/android/remote/model/CategorySearch;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getParentId", "getName", "Ljava/util/Map;", "getParams", "Ljava/util/List;", "getChildren", "Lcom/avito/android/remote/model/CategorySearch$Badge;", "getBadge", "Badge", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CategorySearch implements Parcelable {

    @k
    public static final Parcelable.Creator<CategorySearch> CREATOR = new Creator();

    @c("badge")
    @l
    private final Badge badge;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    @l
    private final List<CategorySearch> children;

    @c("id")
    @k
    private final String id;

    @c("name")
    @k
    private final String name;

    @c("params")
    @l
    private final Map<String, String> params;

    @c("parentId")
    @l
    private final String parentId;

    /* compiled from: CategorySearch.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/CategorySearch$Badge;", "Landroid/os/Parcelable;", "", "text", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/CategorySearch$Badge;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Badge implements Parcelable {

        @k
        public static final Parcelable.Creator<Badge> CREATOR = new Creator();

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @k
        private final String style;

        @c("text")
        @k
        private final String text;

        /* compiled from: CategorySearch.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Badge> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Badge createFromParcel(@k Parcel parcel) {
                return new Badge(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Badge[] newArray(int i12) {
                return new Badge[i12];
            }
        }

        public Badge(@k String str, @k String str2) {
            this.text = str;
            this.style = str2;
        }

        public static /* synthetic */ Badge copy$default(Badge badge, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = badge.text;
            }
            if ((i12 & 2) != 0) {
                str2 = badge.style;
            }
            return badge.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final Badge copy(@k String text, @k String style) {
            return new Badge(text, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) other;
            return L.f(this.text, badge.text) && L.f(this.style, badge.style);
        }

        @k
        public final String getStyle() {
            return this.style;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.style.hashCode() + (this.text.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Badge(text=");
            sb2.append(this.text);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeString(this.style);
        }
    }

    /* compiled from: CategorySearch.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CategorySearch> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CategorySearch createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(CategorySearch.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new CategorySearch(string, string2, string3, linkedHashMap, arrayList, parcel.readInt() != 0 ? Badge.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CategorySearch[] newArray(int i12) {
            return new CategorySearch[i12];
        }
    }

    public CategorySearch(@k String str, @l String str2, @k String str3, @l Map<String, String> map, @l List<CategorySearch> list, @l Badge badge) {
        this.id = str;
        this.parentId = str2;
        this.name = str3;
        this.params = map;
        this.children = list;
        this.badge = badge;
    }

    public static /* synthetic */ CategorySearch copy$default(CategorySearch categorySearch, String str, String str2, String str3, Map map, List list, Badge badge, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = categorySearch.id;
        }
        if ((i12 & 2) != 0) {
            str2 = categorySearch.parentId;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = categorySearch.name;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            map = categorySearch.params;
        }
        Map map2 = map;
        if ((i12 & 16) != 0) {
            list = categorySearch.children;
        }
        List list2 = list;
        if ((i12 & 32) != 0) {
            badge = categorySearch.badge;
        }
        return categorySearch.copy(str, str4, str5, map2, list2, badge);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    public final Map<String, String> component4() {
        return this.params;
    }

    @l
    public final List<CategorySearch> component5() {
        return this.children;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    @k
    public final CategorySearch copy(@k String id2, @l String parentId, @k String name, @l Map<String, String> params, @l List<CategorySearch> children, @l Badge badge) {
        return new CategorySearch(id2, parentId, name, params, children, badge);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategorySearch)) {
            return false;
        }
        CategorySearch categorySearch = (CategorySearch) other;
        return L.f(this.id, categorySearch.id) && L.f(this.parentId, categorySearch.parentId) && L.f(this.name, categorySearch.name) && L.f(this.params, categorySearch.params) && L.f(this.children, categorySearch.children) && L.f(this.badge, categorySearch.badge);
    }

    @l
    public final Badge getBadge() {
        return this.badge;
    }

    @l
    public final List<CategorySearch> getChildren() {
        return this.children;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final Map<String, String> getParams() {
        return this.params;
    }

    @l
    public final String getParentId() {
        return this.parentId;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.parentId;
        int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.name);
        Map<String, String> map = this.params;
        int iHashCode2 = (iD2 + (map == null ? 0 : map.hashCode())) * 31;
        List<CategorySearch> list = this.children;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Badge badge = this.badge;
        return iHashCode3 + (badge != null ? badge.hashCode() : 0);
    }

    @k
    public String toString() {
        return "CategorySearch(id=" + this.id + ", parentId=" + this.parentId + ", name=" + this.name + ", params=" + this.params + ", children=" + this.children + ", badge=" + this.badge + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.parentId);
        parcel.writeString(this.name);
        Map<String, String> map = this.params;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        List<CategorySearch> list = this.children;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((CategorySearch) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Badge badge = this.badge;
        if (badge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badge.writeToParcel(parcel, flags);
        }
    }
}
