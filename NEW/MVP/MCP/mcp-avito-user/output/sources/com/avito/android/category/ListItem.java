package com.avito.android.category;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ListItem.kt */
@H0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category/ListItem;", "Landroid/os/Parcelable;", "Category", "Header", "Lcom/avito/android/category/ListItem$Category;", "Lcom/avito/android/category/ListItem$Header;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ListItem extends Parcelable {

    /* compiled from: ListItem.kt */
    @H0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category/ListItem$Category;", "Lcom/avito/android/category/ListItem;", "Badge", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Category implements ListItem {

        @Y61.k
        public static final Parcelable.Creator<Category> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f116476b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f116477c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Map<String, String> f116478d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final List<Category> f116479e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f116480f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Badge f116481g;

        /* compiled from: ListItem.kt */
        @H0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category/ListItem$Category$Badge;", "Landroid/os/Parcelable;", "Size", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Badge implements Parcelable {

            @Y61.k
            public static final Parcelable.Creator<Badge> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f116482b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final Size f116483c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ListItem.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/ListItem$Category$Badge$Size;", "", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Size {

                /* renamed from: b, reason: collision with root package name */
                public static final Size f116484b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ Size[] f116485c;

                /* renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f116486d;

                static {
                    Size size = new Size("S", 0);
                    f116484b = size;
                    Size[] sizeArr = {size, new Size("M", 1), new Size("L", 2)};
                    f116485c = sizeArr;
                    f116486d = kotlin.enums.c.a(sizeArr);
                }

                public Size() {
                    throw null;
                }

                public static Size valueOf(String str) {
                    return (Size) Enum.valueOf(Size.class, str);
                }

                public static Size[] values() {
                    return (Size[]) f116485c.clone();
                }
            }

            /* compiled from: ListItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Badge> {
                @Override // android.os.Parcelable.Creator
                public final Badge createFromParcel(Parcel parcel) {
                    return new Badge(parcel.readString(), Size.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Badge[] newArray(int i12) {
                    return new Badge[i12];
                }
            }

            public Badge(@Y61.k String str, @Y61.k Size size) {
                this.f116482b = str;
                this.f116483c = size;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Badge)) {
                    return false;
                }
                Badge badge = (Badge) obj;
                return L.f(this.f116482b, badge.f116482b) && this.f116483c == badge.f116483c;
            }

            public final int hashCode() {
                return this.f116483c.hashCode() + (this.f116482b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "Badge(text=" + this.f116482b + ", size=" + this.f116483c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f116482b);
                parcel.writeString(this.f116483c.name());
            }
        }

        /* compiled from: ListItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Category> {
            @Override // android.os.Parcelable.Creator
            public final Category createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                String string = parcel.readString();
                String string2 = parcel.readString();
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
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(Category.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Category(string, string2, linkedHashMap, arrayList, parcel.readInt() != 0, parcel.readInt() != 0 ? Badge.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Category[] newArray(int i12) {
                return new Category[i12];
            }
        }

        public Category(@Y61.k String str, @Y61.k String str2, @Y61.l Map<String, String> map, @Y61.k List<Category> list, boolean z12, @Y61.l Badge badge) {
            this.f116476b = str;
            this.f116477c = str2;
            this.f116478d = map;
            this.f116479e = list;
            this.f116480f = z12;
            this.f116481g = badge;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Category)) {
                return false;
            }
            Category category = (Category) obj;
            return L.f(this.f116476b, category.f116476b) && L.f(this.f116477c, category.f116477c) && L.f(this.f116478d, category.f116478d) && L.f(this.f116479e, category.f116479e) && this.f116480f == category.f116480f && L.f(this.f116481g, category.f116481g);
        }

        @Override // com.avito.android.category.ListItem
        @Y61.k
        /* renamed from: getId, reason: from getter */
        public final String getF116487b() {
            return this.f116476b;
        }

        @Override // com.avito.android.category.ListItem
        @Y61.k
        /* renamed from: getName, reason: from getter */
        public final String getF116488c() {
            return this.f116477c;
        }

        @Override // com.avito.android.category.ListItem
        @Y61.l
        public final Map<String, String> getParams() {
            return this.f116478d;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f116476b.hashCode() * 31, 31, this.f116477c);
            Map<String, String> map = this.f116478d;
            int i12 = androidx.appcompat.app.r.i(H.e((iD2 + (map == null ? 0 : map.hashCode())) * 31, 31, this.f116479e), 31, this.f116480f);
            Badge badge = this.f116481g;
            return i12 + (badge != null ? badge.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Category(id=" + this.f116476b + ", name=" + this.f116477c + ", params=" + this.f116478d + ", children=" + this.f116479e + ", isChildrenVisible=" + this.f116480f + ", badge=" + this.f116481g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f116476b);
            parcel.writeString(this.f116477c);
            Map<String, String> map = this.f116478d;
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
            Iterator itJ = C0.j(this.f116479e, parcel);
            while (itJ.hasNext()) {
                ((Category) itJ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeInt(this.f116480f ? 1 : 0);
            Badge badge = this.f116481g;
            if (badge == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                badge.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: ListItem.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/ListItem$Header;", "Lcom/avito/android/category/ListItem;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Header implements ListItem {

        @Y61.k
        public static final Parcelable.Creator<Header> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f116487b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f116488c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final LinkedHashMap f116489d;

        /* compiled from: ListItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Header> {
            @Override // android.os.Parcelable.Creator
            public final Header createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Header(string, string2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Header[] newArray(int i12) {
                return new Header[i12];
            }
        }

        public Header(@Y61.l String str, @Y61.k String str2, @Y61.l LinkedHashMap linkedHashMap) {
            this.f116487b = str;
            this.f116488c = str2;
            this.f116489d = linkedHashMap;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return L.f(this.f116487b, header.f116487b) && L.f(this.f116488c, header.f116488c) && L.f(this.f116489d, header.f116489d);
        }

        @Override // com.avito.android.category.ListItem
        @Y61.l
        /* renamed from: getId, reason: from getter */
        public final String getF116487b() {
            return this.f116487b;
        }

        @Override // com.avito.android.category.ListItem
        @Y61.k
        /* renamed from: getName, reason: from getter */
        public final String getF116488c() {
            return this.f116488c;
        }

        @Override // com.avito.android.category.ListItem
        @Y61.l
        public final Map<String, String> getParams() {
            return this.f116489d;
        }

        public final int hashCode() {
            String str = this.f116487b;
            int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f116488c);
            LinkedHashMap linkedHashMap = this.f116489d;
            return iD2 + (linkedHashMap != null ? linkedHashMap.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Header(id=");
            sb2.append(this.f116487b);
            sb2.append(", name=");
            sb2.append(this.f116488c);
            sb2.append(", params=");
            return org.webrtc.h.e(sb2, this.f116489d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f116487b);
            parcel.writeString(this.f116488c);
            LinkedHashMap linkedHashMap = this.f116489d;
            if (linkedHashMap == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
    }

    @Y61.l
    /* renamed from: getId */
    String getF116487b();

    @Y61.k
    /* renamed from: getName */
    String getF116488c();

    @Y61.l
    Map<String, String> getParams();
}
