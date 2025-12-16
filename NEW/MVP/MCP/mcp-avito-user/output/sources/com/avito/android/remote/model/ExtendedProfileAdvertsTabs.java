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
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileAdvertsTabs.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002)*B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileAdvertsTabs;", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "", "widgetName", "", "Lcom/avito/android/remote/model/ExtendedProfileAdvertsTabs$Tab;", "tabs", "Lcom/avito/android/remote/model/ExtendedProfileAdvertsTabs$Config;", Navigation.CONFIG, "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/ExtendedProfileAdvertsTabs$Config;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/ExtendedProfileAdvertsTabs$Config;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/ExtendedProfileAdvertsTabs$Config;)Lcom/avito/android/remote/model/ExtendedProfileAdvertsTabs;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getWidgetName", "Ljava/util/List;", "getTabs", "Lcom/avito/android/remote/model/ExtendedProfileAdvertsTabs$Config;", "getConfig", "Config", "Tab", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileAdvertsTabs implements ExtendedProfileElement {

    @k
    public static final Parcelable.Creator<ExtendedProfileAdvertsTabs> CREATOR = new Creator();

    @c(Navigation.CONFIG)
    @l
    private final Config config;

    @c("tabs")
    @l
    private final List<Tab> tabs;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: ExtendedProfileAdvertsTabs.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileAdvertsTabs$Config;", "Landroid/os/Parcelable;", "", "emptyStateText", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/ExtendedProfileAdvertsTabs$Config;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getEmptyStateText", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config implements Parcelable {

        @k
        public static final Parcelable.Creator<Config> CREATOR = new Creator();

        @c("emptyStateText")
        @l
        private final String emptyStateText;

        /* compiled from: ExtendedProfileAdvertsTabs.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Config> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Config createFromParcel(@k Parcel parcel) {
                return new Config(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Config[] newArray(int i12) {
                return new Config[i12];
            }
        }

        public Config(@l String str) {
            this.emptyStateText = str;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = config.emptyStateText;
            }
            return config.copy(str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getEmptyStateText() {
            return this.emptyStateText;
        }

        @k
        public final Config copy(@l String emptyStateText) {
            return new Config(emptyStateText);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Config) && L.f(this.emptyStateText, ((Config) other).emptyStateText);
        }

        @l
        public final String getEmptyStateText() {
            return this.emptyStateText;
        }

        public int hashCode() {
            String str = this.emptyStateText;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("Config(emptyStateText="), this.emptyStateText, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.emptyStateText);
        }
    }

    /* compiled from: ExtendedProfileAdvertsTabs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileAdvertsTabs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileAdvertsTabs createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
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
            return new ExtendedProfileAdvertsTabs(string, arrayList, parcel.readInt() != 0 ? Config.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileAdvertsTabs[] newArray(int i12) {
            return new ExtendedProfileAdvertsTabs[i12];
        }
    }

    /* compiled from: ExtendedProfileAdvertsTabs.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0011¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileAdvertsTabs$Tab;", "Landroid/os/Parcelable;", "", "title", "", "count", "type", "", "useSearchRequest", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/ExtendedProfileAdvertsTabs$Tab;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/lang/Integer;", "getCount", "getType", "Ljava/lang/Boolean;", "getUseSearchRequest", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Tab implements Parcelable {

        @k
        public static final Parcelable.Creator<Tab> CREATOR = new Creator();

        @c("count")
        @l
        private final Integer count;

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final String type;

        @c("useSearchRequest")
        @l
        private final Boolean useSearchRequest;

        /* compiled from: ExtendedProfileAdvertsTabs.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Tab> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tab createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                Boolean boolValueOf = null;
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Tab(string, numValueOf, string2, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tab[] newArray(int i12) {
                return new Tab[i12];
            }
        }

        public Tab(@k String str, @l Integer num, @k String str2, @l Boolean bool) {
            this.title = str;
            this.count = num;
            this.type = str2;
            this.useSearchRequest = bool;
        }

        public static /* synthetic */ Tab copy$default(Tab tab, String str, Integer num, String str2, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = tab.title;
            }
            if ((i12 & 2) != 0) {
                num = tab.count;
            }
            if ((i12 & 4) != 0) {
                str2 = tab.type;
            }
            if ((i12 & 8) != 0) {
                bool = tab.useSearchRequest;
            }
            return tab.copy(str, num, str2, bool);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Integer getCount() {
            return this.count;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Boolean getUseSearchRequest() {
            return this.useSearchRequest;
        }

        @k
        public final Tab copy(@k String title, @l Integer count, @k String type, @l Boolean useSearchRequest) {
            return new Tab(title, count, type, useSearchRequest);
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
            return L.f(this.title, tab.title) && L.f(this.count, tab.count) && L.f(this.type, tab.type) && L.f(this.useSearchRequest, tab.useSearchRequest);
        }

        @l
        public final Integer getCount() {
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

        @l
        public final Boolean getUseSearchRequest() {
            return this.useSearchRequest;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            Integer num = this.count;
            int iD2 = H.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.type);
            Boolean bool = this.useSearchRequest;
            return iD2 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Tab(title=");
            sb2.append(this.title);
            sb2.append(", count=");
            sb2.append(this.count);
            sb2.append(", type=");
            sb2.append(this.type);
            sb2.append(", useSearchRequest=");
            return C0.g(sb2, this.useSearchRequest, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            Integer num = this.count;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            parcel.writeString(this.type);
            Boolean bool = this.useSearchRequest;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    public ExtendedProfileAdvertsTabs(@l String str, @l List<Tab> list, @l Config config) {
        this.widgetName = str;
        this.tabs = list;
        this.config = config;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtendedProfileAdvertsTabs copy$default(ExtendedProfileAdvertsTabs extendedProfileAdvertsTabs, String str, List list, Config config, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = extendedProfileAdvertsTabs.widgetName;
        }
        if ((i12 & 2) != 0) {
            list = extendedProfileAdvertsTabs.tabs;
        }
        if ((i12 & 4) != 0) {
            config = extendedProfileAdvertsTabs.config;
        }
        return extendedProfileAdvertsTabs.copy(str, list, config);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @l
    public final List<Tab> component2() {
        return this.tabs;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    @k
    public final ExtendedProfileAdvertsTabs copy(@l String widgetName, @l List<Tab> tabs, @l Config config) {
        return new ExtendedProfileAdvertsTabs(widgetName, tabs, config);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileAdvertsTabs)) {
            return false;
        }
        ExtendedProfileAdvertsTabs extendedProfileAdvertsTabs = (ExtendedProfileAdvertsTabs) other;
        return L.f(this.widgetName, extendedProfileAdvertsTabs.widgetName) && L.f(this.tabs, extendedProfileAdvertsTabs.tabs) && L.f(this.config, extendedProfileAdvertsTabs.config);
    }

    @l
    public final Config getConfig() {
        return this.config;
    }

    @l
    public final List<Tab> getTabs() {
        return this.tabs;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        String str = this.widgetName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Tab> list = this.tabs;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Config config = this.config;
        return iHashCode2 + (config != null ? config.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ExtendedProfileAdvertsTabs(widgetName=" + this.widgetName + ", tabs=" + this.tabs + ", config=" + this.config + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.widgetName);
        List<Tab> list = this.tabs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Tab) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Config config = this.config;
        if (config == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            config.writeToParcel(parcel, flags);
        }
    }
}
