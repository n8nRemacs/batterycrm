package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileTabsWithWidgets.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets;", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "", "widgetName", "title", "", "Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$Tab;", "tabs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getWidgetName", "()Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "Tab", "Widget", "WidgetValue", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExtendedProfileTabsWithWidgets implements ExtendedProfileElement {

    @k
    public static final Parcelable.Creator<ExtendedProfileTabsWithWidgets> CREATOR = new Creator();

    @c("tabs")
    @l
    private final List<Tab> tabs;

    @c("title")
    @l
    private final String title;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: ExtendedProfileTabsWithWidgets.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileTabsWithWidgets> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileTabsWithWidgets createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Tab.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new ExtendedProfileTabsWithWidgets(string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileTabsWithWidgets[] newArray(int i12) {
            return new ExtendedProfileTabsWithWidgets[i12];
        }
    }

    /* compiled from: ExtendedProfileTabsWithWidgets.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$Tab;", "Landroid/os/Parcelable;", "", "tabTitle", "Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$Widget;", "widget", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$Widget;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$Widget;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$Widget;)Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$Tab;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTabTitle", "Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$Widget;", "getWidget", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Tab implements Parcelable {

        @k
        public static final Parcelable.Creator<Tab> CREATOR = new Creator();

        @c("tabTitle")
        @k
        private final String tabTitle;

        @c("widget")
        @k
        private final Widget widget;

        /* compiled from: ExtendedProfileTabsWithWidgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Tab> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tab createFromParcel(@k Parcel parcel) {
                return new Tab(parcel.readString(), Widget.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tab[] newArray(int i12) {
                return new Tab[i12];
            }
        }

        public Tab(@k String str, @k Widget widget) {
            this.tabTitle = str;
            this.widget = widget;
        }

        public static /* synthetic */ Tab copy$default(Tab tab, String str, Widget widget, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = tab.tabTitle;
            }
            if ((i12 & 2) != 0) {
                widget = tab.widget;
            }
            return tab.copy(str, widget);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTabTitle() {
            return this.tabTitle;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Widget getWidget() {
            return this.widget;
        }

        @k
        public final Tab copy(@k String tabTitle, @k Widget widget) {
            return new Tab(tabTitle, widget);
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
            return L.f(this.tabTitle, tab.tabTitle) && L.f(this.widget, tab.widget);
        }

        @k
        public final String getTabTitle() {
            return this.tabTitle;
        }

        @k
        public final Widget getWidget() {
            return this.widget;
        }

        public int hashCode() {
            return this.widget.hashCode() + (this.tabTitle.hashCode() * 31);
        }

        @k
        public String toString() {
            return "Tab(tabTitle=" + this.tabTitle + ", widget=" + this.widget + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.tabTitle);
            this.widget.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: ExtendedProfileTabsWithWidgets.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$Widget;", "Landroid/os/Parcelable;", "", "type", "name", "Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$WidgetValue;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$WidgetValue;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$WidgetValue;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$WidgetValue;)Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$Widget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "getName", "Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$WidgetValue;", "getValue", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Widget implements Parcelable {

        @k
        public static final Parcelable.Creator<Widget> CREATOR = new Creator();

        @c("name")
        @k
        private final String name;

        @c("type")
        @k
        private final String type;

        @c("value")
        @k
        private final WidgetValue value;

        /* compiled from: ExtendedProfileTabsWithWidgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Widget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget createFromParcel(@k Parcel parcel) {
                return new Widget(parcel.readString(), parcel.readString(), WidgetValue.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget[] newArray(int i12) {
                return new Widget[i12];
            }
        }

        public Widget(@k String str, @k String str2, @k WidgetValue widgetValue) {
            this.type = str;
            this.name = str2;
            this.value = widgetValue;
        }

        public static /* synthetic */ Widget copy$default(Widget widget, String str, String str2, WidgetValue widgetValue, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = widget.type;
            }
            if ((i12 & 2) != 0) {
                str2 = widget.name;
            }
            if ((i12 & 4) != 0) {
                widgetValue = widget.value;
            }
            return widget.copy(str, str2, widgetValue);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final WidgetValue getValue() {
            return this.value;
        }

        @k
        public final Widget copy(@k String type, @k String name, @k WidgetValue value) {
            return new Widget(type, name, value);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Widget)) {
                return false;
            }
            Widget widget = (Widget) other;
            return L.f(this.type, widget.type) && L.f(this.name, widget.name) && L.f(this.value, widget.value);
        }

        @k
        public final String getName() {
            return this.name;
        }

        @k
        public final String getType() {
            return this.type;
        }

        @k
        public final WidgetValue getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + H.d(this.type.hashCode() * 31, 31, this.name);
        }

        @k
        public String toString() {
            return "Widget(type=" + this.type + ", name=" + this.name + ", value=" + this.value + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.type);
            parcel.writeString(this.name);
            this.value.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: ExtendedProfileTabsWithWidgets.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$WidgetValue;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/ExtendedProfileGeo;", "geo", "Lcom/avito/android/remote/model/ExtendedProfileAboutV2;", "about_v2", "<init>", "(Lcom/avito/android/remote/model/ExtendedProfileGeo;Lcom/avito/android/remote/model/ExtendedProfileAboutV2;)V", "component1", "()Lcom/avito/android/remote/model/ExtendedProfileGeo;", "component2", "()Lcom/avito/android/remote/model/ExtendedProfileAboutV2;", "copy", "(Lcom/avito/android/remote/model/ExtendedProfileGeo;Lcom/avito/android/remote/model/ExtendedProfileAboutV2;)Lcom/avito/android/remote/model/ExtendedProfileTabsWithWidgets$WidgetValue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/ExtendedProfileGeo;", "getGeo", "Lcom/avito/android/remote/model/ExtendedProfileAboutV2;", "getAbout_v2", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WidgetValue implements Parcelable {

        @k
        public static final Parcelable.Creator<WidgetValue> CREATOR = new Creator();

        @c("about_v2")
        @l
        private final ExtendedProfileAboutV2 about_v2;

        @c("geo")
        @l
        private final ExtendedProfileGeo geo;

        /* compiled from: ExtendedProfileTabsWithWidgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WidgetValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final WidgetValue createFromParcel(@k Parcel parcel) {
                return new WidgetValue(parcel.readInt() == 0 ? null : ExtendedProfileGeo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ExtendedProfileAboutV2.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final WidgetValue[] newArray(int i12) {
                return new WidgetValue[i12];
            }
        }

        public WidgetValue(@l ExtendedProfileGeo extendedProfileGeo, @l ExtendedProfileAboutV2 extendedProfileAboutV2) {
            this.geo = extendedProfileGeo;
            this.about_v2 = extendedProfileAboutV2;
        }

        public static /* synthetic */ WidgetValue copy$default(WidgetValue widgetValue, ExtendedProfileGeo extendedProfileGeo, ExtendedProfileAboutV2 extendedProfileAboutV2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                extendedProfileGeo = widgetValue.geo;
            }
            if ((i12 & 2) != 0) {
                extendedProfileAboutV2 = widgetValue.about_v2;
            }
            return widgetValue.copy(extendedProfileGeo, extendedProfileAboutV2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final ExtendedProfileGeo getGeo() {
            return this.geo;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final ExtendedProfileAboutV2 getAbout_v2() {
            return this.about_v2;
        }

        @k
        public final WidgetValue copy(@l ExtendedProfileGeo geo, @l ExtendedProfileAboutV2 about_v2) {
            return new WidgetValue(geo, about_v2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetValue)) {
                return false;
            }
            WidgetValue widgetValue = (WidgetValue) other;
            return L.f(this.geo, widgetValue.geo) && L.f(this.about_v2, widgetValue.about_v2);
        }

        @l
        public final ExtendedProfileAboutV2 getAbout_v2() {
            return this.about_v2;
        }

        @l
        public final ExtendedProfileGeo getGeo() {
            return this.geo;
        }

        public int hashCode() {
            ExtendedProfileGeo extendedProfileGeo = this.geo;
            int iHashCode = (extendedProfileGeo == null ? 0 : extendedProfileGeo.hashCode()) * 31;
            ExtendedProfileAboutV2 extendedProfileAboutV2 = this.about_v2;
            return iHashCode + (extendedProfileAboutV2 != null ? extendedProfileAboutV2.hashCode() : 0);
        }

        @k
        public String toString() {
            return "WidgetValue(geo=" + this.geo + ", about_v2=" + this.about_v2 + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            ExtendedProfileGeo extendedProfileGeo = this.geo;
            if (extendedProfileGeo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                extendedProfileGeo.writeToParcel(parcel, flags);
            }
            ExtendedProfileAboutV2 extendedProfileAboutV2 = this.about_v2;
            if (extendedProfileAboutV2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                extendedProfileAboutV2.writeToParcel(parcel, flags);
            }
        }
    }

    public ExtendedProfileTabsWithWidgets(@l String str, @l String str2, @l List<Tab> list) {
        this.widgetName = str;
        this.title = str2;
        this.tabs = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<Tab> getTabs() {
        return this.tabs;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.widgetName);
        parcel.writeString(this.title);
        List<Tab> list = this.tabs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((Tab) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
