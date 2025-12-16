package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import nj0.InterfaceC44435b;

/* compiled from: Navigation.kt */
@d
@com.avito.android.gson.d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0001CB¥\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bj\u0002`\t\u0018\u00010\u0006¢\u0006\u0002\b\n\u0012\u001b\b\u0002\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0002\b\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J-\u0010\"\u001a\u001f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bj\u0002`\t\u0018\u00010\u0006¢\u0006\u0002\b\nHÆ\u0003¢\u0006\u0004\b\"\u0010!J#\u0010#\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0002\b\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0015J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0015J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0015J®\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bj\u0002`\t\u0018\u00010\u0006¢\u0006\u0002\b\n2\u001b\b\u0002\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0002\b\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010\u001cJ \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b1\u00102R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u001fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010!R7\u0010\u000b\u001a\u001f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bj\u0002`\t\u0018\u00010\u0006¢\u0006\u0002\b\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b9\u0010!R-\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0002\b\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b>\u0010\u0015R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b?\u0010\u0015R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b@\u0010\u0015R\u0011\u0010A\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/avito/android/remote/model/Navigation;", "Landroid/os/Parcelable;", "", "group", "", "categoryId", "", Navigation.CATEGORY_IDS, "", "Lcom/avito/android/remote/model/Attribute;", "LK51/e;", Navigation.ATTRIBUTES, Navigation.CONFIG, "Lcom/avito/android/remote/model/Displaying;", Navigation.DISPLAYING, "title", "description", "microCategoryId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/avito/android/remote/model/Displaying;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/util/List;", "component4", "component5", "()Ljava/util/Map;", "component6", "()Lcom/avito/android/remote/model/Displaying;", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/avito/android/remote/model/Displaying;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/Navigation;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getGroup", "Ljava/lang/Integer;", "getCategoryId", "Ljava/util/List;", "getCategoryIds", "getAttributes", "Ljava/util/Map;", "getConfig", "Lcom/avito/android/remote/model/Displaying;", "getDisplaying", "getTitle", "getDescription", "getMicroCategoryId", "isEmpty", "()Z", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Navigation implements Parcelable {

    @k
    public static final String ATTRIBUTES = "attributes";

    @k
    public static final String CATEGORY_ID = "categoryId";

    @k
    public static final String CATEGORY_IDS = "categoryIds";

    @k
    public static final String CONFIG = "config";

    @k
    public static final String DESCRIPTION = "description";

    @k
    public static final String DISPLAYING = "displaying";

    @k
    public static final String GROUP = "group";

    @k
    public static final String MICRO_CATEGORY_ID = "microcategoryId";

    @k
    public static final String TITLE = "title";

    @c(ATTRIBUTES)
    @l
    private final List<Map<String, String>> attributes;

    @c("categoryId")
    @l
    private final Integer categoryId;

    @c(CATEGORY_IDS)
    @l
    private final List<Integer> categoryIds;

    @c(CONFIG)
    @l
    private final Map<String, String> config;

    @c("description")
    @l
    private final String description;

    @c(DISPLAYING)
    @l
    private final Displaying displaying;

    @c("group")
    @l
    private final String group;

    @c(MICRO_CATEGORY_ID)
    @l
    private final String microCategoryId;

    @c("title")
    @l
    private final String title;

    @k
    public static final Parcelable.Creator<Navigation> CREATOR = new Creator();

    /* compiled from: Navigation.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Navigation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Navigation createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int iA2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iD2 = 0;
                while (iD2 != i12) {
                    iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList, iD2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    int i15 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i15);
                    int iA3 = 0;
                    while (iA3 != i15) {
                        iA3 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA3, 1);
                    }
                    arrayList2.add(linkedHashMap2);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i16 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i16);
                while (iA2 != i16) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            return new Navigation(string, numValueOf, arrayList, arrayList2, linkedHashMap, parcel.readInt() != 0 ? Displaying.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Navigation[] newArray(int i12) {
            return new Navigation[i12];
        }
    }

    public Navigation() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    @l
    public final List<Integer> component3() {
        return this.categoryIds;
    }

    @l
    public final List<Map<String, String>> component4() {
        return this.attributes;
    }

    @l
    public final Map<String, String> component5() {
        return this.config;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Displaying getDisplaying() {
        return this.displaying;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getMicroCategoryId() {
        return this.microCategoryId;
    }

    @k
    public final Navigation copy(@l String group, @l Integer categoryId, @l List<Integer> categoryIds, @l List<? extends Map<String, String>> attributes, @l Map<String, String> config, @l Displaying displaying, @l String title, @l String description, @l String microCategoryId) {
        return new Navigation(group, categoryId, categoryIds, attributes, config, displaying, title, description, microCategoryId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!Navigation.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Navigation navigation2 = (Navigation) other;
        String str = this.group;
        if (str == null) {
            str = "";
        }
        String str2 = navigation2.group;
        if (!str.equals(str2 != null ? str2 : "") || !L.f(this.categoryId, navigation2.categoryId)) {
            return false;
        }
        Object obj = this.attributes;
        if (obj == null) {
            obj = C42784z0.f406748b;
        }
        Object obj2 = navigation2.attributes;
        if (obj2 == null) {
            obj2 = C42784z0.f406748b;
        }
        return L.f(obj, obj2);
    }

    @l
    @InterfaceC44435b(name = ATTRIBUTES)
    public final List<Map<String, String>> getAttributes() {
        return this.attributes;
    }

    @l
    @InterfaceC44435b(name = "categoryId")
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    @l
    @InterfaceC44435b(name = CATEGORY_IDS)
    public final List<Integer> getCategoryIds() {
        return this.categoryIds;
    }

    @l
    @InterfaceC44435b(name = CONFIG)
    public final Map<String, String> getConfig() {
        return this.config;
    }

    @l
    @InterfaceC44435b(name = "description")
    public final String getDescription() {
        return this.description;
    }

    @l
    @InterfaceC44435b(name = DISPLAYING)
    public final Displaying getDisplaying() {
        return this.displaying;
    }

    @l
    @InterfaceC44435b(name = "group")
    public final String getGroup() {
        return this.group;
    }

    @l
    @InterfaceC44435b(name = MICRO_CATEGORY_ID)
    public final String getMicroCategoryId() {
        return this.microCategoryId;
    }

    @l
    @InterfaceC44435b(name = "title")
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.group;
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode() * 31;
        Integer num = this.categoryId;
        int iIntValue = (iHashCode + (num != null ? num.intValue() : 0)) * 31;
        Object obj = this.attributes;
        if (obj == null) {
            obj = C42784z0.f406748b;
        }
        return obj.hashCode() + iIntValue;
    }

    public final boolean isEmpty() {
        List<Map<String, String>> list;
        List<Integer> list2;
        String str = this.group;
        return (str == null || str.length() == 0) && this.categoryId == null && ((list = this.attributes) == null || list.isEmpty()) && ((list2 = this.categoryIds) == null || list2.isEmpty());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("g=");
        String str = this.group;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append("&c=");
        Integer num = this.categoryId;
        String string = num != null ? num.toString() : null;
        if (string == null) {
            string = "";
        }
        sb2.append(string);
        sb2.append("&cs=");
        List<Integer> list = this.categoryIds;
        String string2 = list != null ? list.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        sb2.append(string2);
        sb2.append("&a=");
        List<Map<String, String>> list2 = this.attributes;
        String strJoinToString = list2 != null ? NavigationKt.joinToString((Iterable<? extends Map<String, String>>) list2) : null;
        if (strJoinToString == null) {
            strJoinToString = "";
        }
        sb2.append(strJoinToString);
        sb2.append("&c=");
        Map<String, String> map = this.config;
        String strJoinToString2 = map != null ? NavigationKt.joinToString(map) : null;
        sb2.append(strJoinToString2 != null ? strJoinToString2 : "");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.group);
        Integer num = this.categoryId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        List<Integer> list = this.categoryIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeInt(((Number) itA.next()).intValue());
            }
        }
        List<Map<String, String>> list2 = this.attributes;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                Iterator itI = C0.i(parcel, (Map) itA2.next());
                while (itI.hasNext()) {
                    Map.Entry entry = (Map.Entry) itI.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
            }
        }
        Map<String, String> map = this.config;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itH.next();
                parcel.writeString((String) entry2.getKey());
                parcel.writeString((String) entry2.getValue());
            }
        }
        Displaying displaying = this.displaying;
        if (displaying == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displaying.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.microCategoryId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Navigation(@l String str, @l Integer num, @l List<Integer> list, @l List<? extends Map<String, String>> list2, @l Map<String, String> map, @l Displaying displaying, @l String str2, @l String str3, @l String str4) {
        this.group = str;
        this.categoryId = num;
        this.categoryIds = list;
        this.attributes = list2;
        this.config = map;
        this.displaying = displaying;
        this.title = str2;
        this.description = str3;
        this.microCategoryId = str4;
    }

    public /* synthetic */ Navigation(String str, Integer num, List list, List list2, Map map, Displaying displaying, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : list, (i12 & 8) != 0 ? null : list2, (i12 & 16) != 0 ? null : map, (i12 & 32) != 0 ? null : displaying, (i12 & 64) != 0 ? null : str2, (i12 & 128) != 0 ? null : str3, (i12 & 256) == 0 ? str4 : null);
    }
}
