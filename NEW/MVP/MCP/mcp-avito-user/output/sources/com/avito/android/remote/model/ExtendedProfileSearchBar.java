package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSearchBar.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\u0002+,BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b'\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileSearchBar;", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "", "widgetName", "Lcom/avito/android/remote/model/ExtendedProfileSearchBar$AnalyticParams;", "analyticParams", "infoModelForm", "", "hideSingleTab", "", "Lcom/avito/android/remote/model/ExtendedProfileSearchBar$Tab;", "tabs", "showInlineFilters", "Lcom/avito/android/remote/model/ActiveItemsPreview;", "activeItemsPreview", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfileSearchBar$AnalyticParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/remote/model/ActiveItemsPreview;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getWidgetName", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/ExtendedProfileSearchBar$AnalyticParams;", "getAnalyticParams", "()Lcom/avito/android/remote/model/ExtendedProfileSearchBar$AnalyticParams;", "getInfoModelForm", "Ljava/lang/Boolean;", "getHideSingleTab", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "getShowInlineFilters", "Lcom/avito/android/remote/model/ActiveItemsPreview;", "getActiveItemsPreview", "()Lcom/avito/android/remote/model/ActiveItemsPreview;", "AnalyticParams", "Tab", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExtendedProfileSearchBar implements ExtendedProfileElement {

    @k
    public static final Parcelable.Creator<ExtendedProfileSearchBar> CREATOR = new Creator();

    @c("activeItemsPreview")
    @l
    private final ActiveItemsPreview activeItemsPreview;

    @c("analyticParams")
    @l
    private final AnalyticParams analyticParams;

    @c("hideSingleTab")
    @l
    private final Boolean hideSingleTab;

    @c("form")
    @l
    private final String infoModelForm;

    @c("showInlineFilters")
    @l
    private final Boolean showInlineFilters;

    @c("tabs")
    @l
    private final List<Tab> tabs;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: ExtendedProfileSearchBar.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileSearchBar$AnalyticParams;", "Landroid/os/Parcelable;", "", "fromPage", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFromPage", "()Ljava/lang/String;", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnalyticParams implements Parcelable {

        @k
        public static final Parcelable.Creator<AnalyticParams> CREATOR = new Creator();

        @c("fromPage")
        @k
        private final String fromPage;

        /* compiled from: ExtendedProfileSearchBar.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AnalyticParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AnalyticParams createFromParcel(@k Parcel parcel) {
                return new AnalyticParams(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AnalyticParams[] newArray(int i12) {
                return new AnalyticParams[i12];
            }
        }

        public AnalyticParams(@k String str) {
            this.fromPage = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getFromPage() {
            return this.fromPage;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.fromPage);
        }
    }

    /* compiled from: ExtendedProfileSearchBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileSearchBar> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileSearchBar createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            Boolean boolValueOf2;
            String string = parcel.readString();
            AnalyticParams analyticParamsCreateFromParcel = parcel.readInt() == 0 ? null : AnalyticParams.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Tab.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ExtendedProfileSearchBar(string, analyticParamsCreateFromParcel, string2, boolValueOf, arrayList, boolValueOf2, parcel.readInt() != 0 ? ActiveItemsPreview.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileSearchBar[] newArray(int i12) {
            return new ExtendedProfileSearchBar[i12];
        }
    }

    /* compiled from: ExtendedProfileSearchBar.kt */
    @d
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\n¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileSearchBar$Tab;", "Landroid/os/Parcelable;", "", "title", "", "count", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;ILjava/lang/String;)Lcom/avito/android/remote/model/ExtendedProfileSearchBar$Tab;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "I", "getCount", "getType", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Tab implements Parcelable {

        @k
        public static final Parcelable.Creator<Tab> CREATOR = new Creator();

        @c("count")
        private final int count;

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final String type;

        /* compiled from: ExtendedProfileSearchBar.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Tab> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tab createFromParcel(@k Parcel parcel) {
                return new Tab(parcel.readString(), parcel.readInt(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tab[] newArray(int i12) {
                return new Tab[i12];
            }
        }

        public Tab(@k String str, int i12, @k String str2) {
            this.title = str;
            this.count = i12;
            this.type = str2;
        }

        public static /* synthetic */ Tab copy$default(Tab tab, String str, int i12, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = tab.title;
            }
            if ((i13 & 2) != 0) {
                i12 = tab.count;
            }
            if ((i13 & 4) != 0) {
                str2 = tab.type;
            }
            return tab.copy(str, i12, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @k
        public final Tab copy(@k String title, int count, @k String type) {
            return new Tab(title, count, type);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) other;
            return L.f(this.title, tab.title) && this.count == tab.count && L.f(this.type, tab.type);
        }

        public final int getCount() {
            return this.count;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + r.e(this.count, this.title.hashCode() * 31, 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Tab(title=");
            sb2.append(this.title);
            sb2.append(", count=");
            sb2.append(this.count);
            sb2.append(", type=");
            return C22026a.c(sb2, this.type, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeInt(this.count);
            parcel.writeString(this.type);
        }
    }

    public ExtendedProfileSearchBar(@l String str, @l AnalyticParams analyticParams, @l String str2, @l Boolean bool, @l List<Tab> list, @l Boolean bool2, @l ActiveItemsPreview activeItemsPreview) {
        this.widgetName = str;
        this.analyticParams = analyticParams;
        this.infoModelForm = str2;
        this.hideSingleTab = bool;
        this.tabs = list;
        this.showInlineFilters = bool2;
        this.activeItemsPreview = activeItemsPreview;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final ActiveItemsPreview getActiveItemsPreview() {
        return this.activeItemsPreview;
    }

    @l
    public final AnalyticParams getAnalyticParams() {
        return this.analyticParams;
    }

    @l
    public final Boolean getHideSingleTab() {
        return this.hideSingleTab;
    }

    @l
    public final String getInfoModelForm() {
        return this.infoModelForm;
    }

    @l
    public final Boolean getShowInlineFilters() {
        return this.showInlineFilters;
    }

    @l
    public final List<Tab> getTabs() {
        return this.tabs;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.widgetName);
        AnalyticParams analyticParams = this.analyticParams;
        if (analyticParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analyticParams.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.infoModelForm);
        Boolean bool = this.hideSingleTab;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<Tab> list = this.tabs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Tab) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Boolean bool2 = this.showInlineFilters;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        ActiveItemsPreview activeItemsPreview = this.activeItemsPreview;
        if (activeItemsPreview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            activeItemsPreview.writeToParcel(parcel, flags);
        }
    }
}
