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
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertsHistory.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000e¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/AdvertsHistory;", "Landroid/os/Parcelable;", "", "title", "description", "", "Lcom/avito/android/remote/model/AdvertsHistory$Tab;", "tabs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/AdvertsHistory;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Ljava/util/List;", "getTabs", "Tab", "_avito-discouraged_avito-api_publish-limits-info"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertsHistory implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertsHistory> CREATOR = new Creator();

    @c("description")
    @k
    private final String description;

    @c("tabs")
    @k
    private final List<Tab> tabs;

    @c("title")
    @k
    private final String title;

    /* compiled from: AdvertsHistory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertsHistory> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertsHistory createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Tab.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AdvertsHistory(string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertsHistory[] newArray(int i12) {
            return new AdvertsHistory[i12];
        }
    }

    public AdvertsHistory(@k String str, @k String str2, @k List<Tab> list) {
        this.title = str;
        this.description = str2;
        this.tabs = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvertsHistory copy$default(AdvertsHistory advertsHistory, String str, String str2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = advertsHistory.title;
        }
        if ((i12 & 2) != 0) {
            str2 = advertsHistory.description;
        }
        if ((i12 & 4) != 0) {
            list = advertsHistory.tabs;
        }
        return advertsHistory.copy(str, str2, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    public final List<Tab> component3() {
        return this.tabs;
    }

    @k
    public final AdvertsHistory copy(@k String title, @k String description, @k List<Tab> tabs) {
        return new AdvertsHistory(title, description, tabs);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertsHistory)) {
            return false;
        }
        AdvertsHistory advertsHistory = (AdvertsHistory) other;
        return L.f(this.title, advertsHistory.title) && L.f(this.description, advertsHistory.description) && L.f(this.tabs, advertsHistory.tabs);
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final List<Tab> getTabs() {
        return this.tabs;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.tabs.hashCode() + H.d(this.title.hashCode() * 31, 31, this.description);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertsHistory(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", tabs=");
        return H.p(sb2, this.tabs, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Iterator itJ = C0.j(this.tabs, parcel);
        while (itJ.hasNext()) {
            ((Tab) itJ.next()).writeToParcel(parcel, flags);
        }
    }

    /* compiled from: AdvertsHistory.kt */
    @d
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JL\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0011J \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b-\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u0016¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/AdvertsHistory$Tab;", "Landroid/os/Parcelable;", "", "title", "", "count", "", "Lcom/avito/android/remote/model/AdvertHistoryInfo;", "items", "description", "Lcom/avito/android/remote/model/text/AttributedText;", "extra", "<init>", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/AdvertsHistory$Tab;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "I", "getCount", "Ljava/util/List;", "getItems", "getDescription", "Lcom/avito/android/remote/model/text/AttributedText;", "getExtra", "_avito-discouraged_avito-api_publish-limits-info"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Tab implements Parcelable {

        @k
        public static final Parcelable.Creator<Tab> CREATOR = new Creator();

        @c("count")
        private final int count;

        @c("extraDescription")
        @l
        private final String description;

        @c("extraInfo")
        @l
        private final AttributedText extra;

        @c("items")
        @k
        private final List<AdvertHistoryInfo> items;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertsHistory.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Tab> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tab createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = a.c(AdvertHistoryInfo.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Tab(string, i12, arrayList, parcel.readString(), (AttributedText) parcel.readParcelable(Tab.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tab[] newArray(int i12) {
                return new Tab[i12];
            }
        }

        public Tab(@k String str, int i12, @k List<AdvertHistoryInfo> list, @l String str2, @l AttributedText attributedText) {
            this.title = str;
            this.count = i12;
            this.items = list;
            this.description = str2;
            this.extra = attributedText;
        }

        public static /* synthetic */ Tab copy$default(Tab tab, String str, int i12, List list, String str2, AttributedText attributedText, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = tab.title;
            }
            if ((i13 & 2) != 0) {
                i12 = tab.count;
            }
            int i14 = i12;
            if ((i13 & 4) != 0) {
                list = tab.items;
            }
            List list2 = list;
            if ((i13 & 8) != 0) {
                str2 = tab.description;
            }
            String str3 = str2;
            if ((i13 & 16) != 0) {
                attributedText = tab.extra;
            }
            return tab.copy(str, i14, list2, str3, attributedText);
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
        public final List<AdvertHistoryInfo> component3() {
            return this.items;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final AttributedText getExtra() {
            return this.extra;
        }

        @k
        public final Tab copy(@k String title, int count, @k List<AdvertHistoryInfo> items, @l String description, @l AttributedText extra) {
            return new Tab(title, count, items, description, extra);
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
            return L.f(this.title, tab.title) && this.count == tab.count && L.f(this.items, tab.items) && L.f(this.description, tab.description) && L.f(this.extra, tab.extra);
        }

        public final int getCount() {
            return this.count;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final AttributedText getExtra() {
            return this.extra;
        }

        @k
        public final List<AdvertHistoryInfo> getItems() {
            return this.items;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iE2 = H.e(r.e(this.count, this.title.hashCode() * 31, 31), 31, this.items);
            String str = this.description;
            int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
            AttributedText attributedText = this.extra;
            return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Tab(title=");
            sb2.append(this.title);
            sb2.append(", count=");
            sb2.append(this.count);
            sb2.append(", items=");
            sb2.append(this.items);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", extra=");
            return a.w(sb2, this.extra, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeInt(this.count);
            Iterator itJ = C0.j(this.items, parcel);
            while (itJ.hasNext()) {
                ((AdvertHistoryInfo) itJ.next()).writeToParcel(parcel, flags);
            }
            parcel.writeString(this.description);
            parcel.writeParcelable(this.extra, flags);
        }

        public /* synthetic */ Tab(String str, int i12, List list, String str2, AttributedText attributedText, int i13, C42822w c42822w) {
            this(str, i12, list, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : attributedText);
        }
    }
}
