package com.avito.android.remote.model;

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
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteItemsWidgets.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002#$B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/CategoriesWidget;", "Landroid/os/Parcelable;", "", "queryParam", "", "Lcom/avito/android/remote/model/CategoriesWidget$Category;", "options", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/CategoriesWidget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getQueryParam", "Ljava/util/List;", "getOptions", "Category", "CategoryOnboarding", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CategoriesWidget implements Parcelable {

    @k
    public static final Parcelable.Creator<CategoriesWidget> CREATOR = new Creator();

    @c("options")
    @k
    private final List<Category> options;

    @c("queryParam")
    @k
    private final String queryParam;

    /* compiled from: FavoriteItemsWidgets.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0013¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/CategoriesWidget$CategoryOnboarding;", "Landroid/os/Parcelable;", "", "id", "", "priority", "title", "body", "Lcom/avito/android/deep_linking/links/DeepLink;", "onShow", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/CategoriesWidget$CategoryOnboarding;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/lang/Integer;", "getPriority", "getTitle", "getBody", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnShow", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CategoryOnboarding implements Parcelable {

        @k
        public static final Parcelable.Creator<CategoryOnboarding> CREATOR = new Creator();

        @c("body")
        @l
        private final String body;

        @c("id")
        @l
        private final String id;

        @c("onShow")
        @l
        private final DeepLink onShow;

        @c("priority")
        @l
        private final Integer priority;

        @c("title")
        @l
        private final String title;

        /* compiled from: FavoriteItemsWidgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CategoryOnboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CategoryOnboarding createFromParcel(@k Parcel parcel) {
                return new CategoryOnboarding(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(CategoryOnboarding.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CategoryOnboarding[] newArray(int i12) {
                return new CategoryOnboarding[i12];
            }
        }

        public CategoryOnboarding(@l String str, @l Integer num, @l String str2, @l String str3, @l DeepLink deepLink) {
            this.id = str;
            this.priority = num;
            this.title = str2;
            this.body = str3;
            this.onShow = deepLink;
        }

        public static /* synthetic */ CategoryOnboarding copy$default(CategoryOnboarding categoryOnboarding, String str, Integer num, String str2, String str3, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = categoryOnboarding.id;
            }
            if ((i12 & 2) != 0) {
                num = categoryOnboarding.priority;
            }
            Integer num2 = num;
            if ((i12 & 4) != 0) {
                str2 = categoryOnboarding.title;
            }
            String str4 = str2;
            if ((i12 & 8) != 0) {
                str3 = categoryOnboarding.body;
            }
            String str5 = str3;
            if ((i12 & 16) != 0) {
                deepLink = categoryOnboarding.onShow;
            }
            return categoryOnboarding.copy(str, num2, str4, str5, deepLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Integer getPriority() {
            return this.priority;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final DeepLink getOnShow() {
            return this.onShow;
        }

        @k
        public final CategoryOnboarding copy(@l String id2, @l Integer priority, @l String title, @l String body, @l DeepLink onShow) {
            return new CategoryOnboarding(id2, priority, title, body, onShow);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CategoryOnboarding)) {
                return false;
            }
            CategoryOnboarding categoryOnboarding = (CategoryOnboarding) other;
            return L.f(this.id, categoryOnboarding.id) && L.f(this.priority, categoryOnboarding.priority) && L.f(this.title, categoryOnboarding.title) && L.f(this.body, categoryOnboarding.body) && L.f(this.onShow, categoryOnboarding.onShow);
        }

        @l
        public final String getBody() {
            return this.body;
        }

        @l
        public final String getId() {
            return this.id;
        }

        @l
        public final DeepLink getOnShow() {
            return this.onShow;
        }

        @l
        public final Integer getPriority() {
            return this.priority;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.priority;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.title;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.body;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            DeepLink deepLink = this.onShow;
            return iHashCode4 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CategoryOnboarding(id=");
            sb2.append(this.id);
            sb2.append(", priority=");
            sb2.append(this.priority);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", body=");
            sb2.append(this.body);
            sb2.append(", onShow=");
            return a.v(sb2, this.onShow, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            Integer num = this.priority;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            parcel.writeString(this.title);
            parcel.writeString(this.body);
            parcel.writeParcelable(this.onShow, flags);
        }
    }

    /* compiled from: FavoriteItemsWidgets.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CategoriesWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CategoriesWidget createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Category.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CategoriesWidget(string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CategoriesWidget[] newArray(int i12) {
            return new CategoriesWidget[i12];
        }
    }

    public CategoriesWidget(@k String str, @k List<Category> list) {
        this.queryParam = str;
        this.options = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoriesWidget copy$default(CategoriesWidget categoriesWidget, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = categoriesWidget.queryParam;
        }
        if ((i12 & 2) != 0) {
            list = categoriesWidget.options;
        }
        return categoriesWidget.copy(str, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getQueryParam() {
        return this.queryParam;
    }

    @k
    public final List<Category> component2() {
        return this.options;
    }

    @k
    public final CategoriesWidget copy(@k String queryParam, @k List<Category> options) {
        return new CategoriesWidget(queryParam, options);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoriesWidget)) {
            return false;
        }
        CategoriesWidget categoriesWidget = (CategoriesWidget) other;
        return L.f(this.queryParam, categoriesWidget.queryParam) && L.f(this.options, categoriesWidget.options);
    }

    @k
    public final List<Category> getOptions() {
        return this.options;
    }

    @k
    public final String getQueryParam() {
        return this.queryParam;
    }

    public int hashCode() {
        return this.options.hashCode() + (this.queryParam.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CategoriesWidget(queryParam=");
        sb2.append(this.queryParam);
        sb2.append(", options=");
        return H.p(sb2, this.options, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.queryParam);
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((Category) itJ.next()).writeToParcel(parcel, flags);
        }
    }

    /* compiled from: FavoriteItemsWidgets.kt */
    @d
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u001e\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\\\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0010J\u001a\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010J \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0010R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b\n\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u0019¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/CategoriesWidget$Category;", "Landroid/os/Parcelable;", "", "id", "", "title", "count", "", "analyticsParams", "", "isSortDisabled", "Lcom/avito/android/remote/model/CategoriesWidget$CategoryOnboarding;", "onboarding", "<init>", "(ILjava/lang/String;ILjava/util/Map;ZLcom/avito/android/remote/model/CategoriesWidget$CategoryOnboarding;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/Map;", "component5", "()Z", "component6", "()Lcom/avito/android/remote/model/CategoriesWidget$CategoryOnboarding;", "copy", "(ILjava/lang/String;ILjava/util/Map;ZLcom/avito/android/remote/model/CategoriesWidget$CategoryOnboarding;)Lcom/avito/android/remote/model/CategoriesWidget$Category;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/String;", "getTitle", "getCount", "Ljava/util/Map;", "getAnalyticsParams", "Z", "Lcom/avito/android/remote/model/CategoriesWidget$CategoryOnboarding;", "getOnboarding", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Category implements Parcelable {

        @k
        public static final Parcelable.Creator<Category> CREATOR = new Creator();

        @c("analyticsParams")
        @l
        private final Map<String, String> analyticsParams;

        @c("count")
        private final int count;

        @c("id")
        private final int id;

        @c("isSortDisabled")
        private final boolean isSortDisabled;

        @c("onboarding")
        @l
        private final CategoryOnboarding onboarding;

        @c("title")
        @k
        private final String title;

        /* compiled from: FavoriteItemsWidgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Category> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Category createFromParcel(@k Parcel parcel) {
                LinkedHashMap linkedHashMap;
                int i12 = parcel.readInt();
                String string = parcel.readString();
                int i13 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i14 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i14);
                    int iA2 = 0;
                    while (iA2 != i14) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                }
                return new Category(i12, string, i13, linkedHashMap, parcel.readInt() != 0, parcel.readInt() != 0 ? CategoryOnboarding.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Category[] newArray(int i12) {
                return new Category[i12];
            }
        }

        public Category(int i12, @k String str, int i13, @l Map<String, String> map, boolean z12, @l CategoryOnboarding categoryOnboarding) {
            this.id = i12;
            this.title = str;
            this.count = i13;
            this.analyticsParams = map;
            this.isSortDisabled = z12;
            this.onboarding = categoryOnboarding;
        }

        public static /* synthetic */ Category copy$default(Category category, int i12, String str, int i13, Map map, boolean z12, CategoryOnboarding categoryOnboarding, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i12 = category.id;
            }
            if ((i14 & 2) != 0) {
                str = category.title;
            }
            String str2 = str;
            if ((i14 & 4) != 0) {
                i13 = category.count;
            }
            int i15 = i13;
            if ((i14 & 8) != 0) {
                map = category.analyticsParams;
            }
            Map map2 = map;
            if ((i14 & 16) != 0) {
                z12 = category.isSortDisabled;
            }
            boolean z13 = z12;
            if ((i14 & 32) != 0) {
                categoryOnboarding = category.onboarding;
            }
            return category.copy(i12, str2, i15, map2, z13, categoryOnboarding);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        @l
        public final Map<String, String> component4() {
            return this.analyticsParams;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsSortDisabled() {
            return this.isSortDisabled;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final CategoryOnboarding getOnboarding() {
            return this.onboarding;
        }

        @k
        public final Category copy(int id2, @k String title, int count, @l Map<String, String> analyticsParams, boolean isSortDisabled, @l CategoryOnboarding onboarding) {
            return new Category(id2, title, count, analyticsParams, isSortDisabled, onboarding);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Category)) {
                return false;
            }
            Category category = (Category) other;
            return this.id == category.id && L.f(this.title, category.title) && this.count == category.count && L.f(this.analyticsParams, category.analyticsParams) && this.isSortDisabled == category.isSortDisabled && L.f(this.onboarding, category.onboarding);
        }

        @l
        public final Map<String, String> getAnalyticsParams() {
            return this.analyticsParams;
        }

        public final int getCount() {
            return this.count;
        }

        public final int getId() {
            return this.id;
        }

        @l
        public final CategoryOnboarding getOnboarding() {
            return this.onboarding;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iE2 = r.e(this.count, H.d(Integer.hashCode(this.id) * 31, 31, this.title), 31);
            Map<String, String> map = this.analyticsParams;
            int i12 = r.i((iE2 + (map == null ? 0 : map.hashCode())) * 31, 31, this.isSortDisabled);
            CategoryOnboarding categoryOnboarding = this.onboarding;
            return i12 + (categoryOnboarding != null ? categoryOnboarding.hashCode() : 0);
        }

        public final boolean isSortDisabled() {
            return this.isSortDisabled;
        }

        @k
        public String toString() {
            return "Category(id=" + this.id + ", title=" + this.title + ", count=" + this.count + ", analyticsParams=" + this.analyticsParams + ", isSortDisabled=" + this.isSortDisabled + ", onboarding=" + this.onboarding + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.id);
            parcel.writeString(this.title);
            parcel.writeInt(this.count);
            Map<String, String> map = this.analyticsParams;
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
            parcel.writeInt(this.isSortDisabled ? 1 : 0);
            CategoryOnboarding categoryOnboarding = this.onboarding;
            if (categoryOnboarding == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                categoryOnboarding.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ Category(int i12, String str, int i13, Map map, boolean z12, CategoryOnboarding categoryOnboarding, int i14, C42822w c42822w) {
            this(i12, str, i13, map, (i14 & 16) != 0 ? false : z12, categoryOnboarding);
        }
    }
}
