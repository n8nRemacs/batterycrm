package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Widgets.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/extended/CarouselEditWidget;", "Lcom/avito/android/remote/model/extended/ExtendedSettingsWidget;", Navigation.CONFIG, "Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config;", LocalPublishState.FIELDS, "", "Lcom/avito/android/remote/model/extended/CarouselEditWidget$Field;", "widgetName", "", "(Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config;Ljava/util/List;Ljava/lang/String;)V", "getConfig", "()Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config;", "getFields", "()Ljava/util/List;", "getWidgetName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Config", "Field", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CarouselEditWidget implements ExtendedSettingsWidget {

    @c(Navigation.CONFIG)
    @k
    private final Config config;

    @c(LocalPublishState.FIELDS)
    @k
    private final List<Field> fields;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0005\"#$%&B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config;", "", "emptyState", "Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$EmptyState;", "settings", "Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$Settings;", "minItemsCount", "", "maxItemsCount", "possibleNames", "", "Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$ItemsShowcaseNameOption;", "(Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$EmptyState;Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$Settings;IILjava/util/List;)V", "getEmptyState", "()Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$EmptyState;", "getMaxItemsCount", "()I", "getMinItemsCount", "getPossibleNames", "()Ljava/util/List;", "getSettings", "()Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$Settings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "", "EmptyState", "ItemsShowcaseNameOption", "SelectItems", "SelectName", "Settings", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config {

        @c("emptyState")
        @k
        private final EmptyState emptyState;

        @c("maxItemsCount")
        private final int maxItemsCount;

        @c("minItemsCount")
        private final int minItemsCount;

        @c("possibleNames")
        @k
        private final List<ItemsShowcaseNameOption> possibleNames;

        @c("settings")
        @k
        private final Settings settings;

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$EmptyState;", "", "title", "", "subtitle", "button", "Lcom/avito/android/remote/model/DeeplinkAction;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/DeeplinkAction;)V", "getButton", "()Lcom/avito/android/remote/model/DeeplinkAction;", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class EmptyState {

            @c("button")
            @k
            private final DeeplinkAction button;

            @c("subtitle")
            @k
            private final String subtitle;

            @c("title")
            @k
            private final String title;

            public EmptyState(@k String str, @k String str2, @k DeeplinkAction deeplinkAction) {
                this.title = str;
                this.subtitle = str2;
                this.button = deeplinkAction;
            }

            public static /* synthetic */ EmptyState copy$default(EmptyState emptyState, String str, String str2, DeeplinkAction deeplinkAction, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = emptyState.title;
                }
                if ((i12 & 2) != 0) {
                    str2 = emptyState.subtitle;
                }
                if ((i12 & 4) != 0) {
                    deeplinkAction = emptyState.button;
                }
                return emptyState.copy(str, str2, deeplinkAction);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final DeeplinkAction getButton() {
                return this.button;
            }

            @k
            public final EmptyState copy(@k String title, @k String subtitle, @k DeeplinkAction button) {
                return new EmptyState(title, subtitle, button);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EmptyState)) {
                    return false;
                }
                EmptyState emptyState = (EmptyState) other;
                return L.f(this.title, emptyState.title) && L.f(this.subtitle, emptyState.subtitle) && L.f(this.button, emptyState.button);
            }

            @k
            public final DeeplinkAction getButton() {
                return this.button;
            }

            @k
            public final String getSubtitle() {
                return this.subtitle;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.button.hashCode() + H.d(this.title.hashCode() * 31, 31, this.subtitle);
            }

            @k
            public String toString() {
                return "EmptyState(title=" + this.title + ", subtitle=" + this.subtitle + ", button=" + this.button + ')';
            }
        }

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$ItemsShowcaseNameOption;", "", "id", "", "name", "", "(ILjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ItemsShowcaseNameOption {

            @c("id")
            private final int id;

            @c("name")
            @k
            private final String name;

            public ItemsShowcaseNameOption(int i12, @k String str) {
                this.id = i12;
                this.name = str;
            }

            public static /* synthetic */ ItemsShowcaseNameOption copy$default(ItemsShowcaseNameOption itemsShowcaseNameOption, int i12, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i12 = itemsShowcaseNameOption.id;
                }
                if ((i13 & 2) != 0) {
                    str = itemsShowcaseNameOption.name;
                }
                return itemsShowcaseNameOption.copy(i12, str);
            }

            /* renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @k
            public final ItemsShowcaseNameOption copy(int id2, @k String name) {
                return new ItemsShowcaseNameOption(id2, name);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ItemsShowcaseNameOption)) {
                    return false;
                }
                ItemsShowcaseNameOption itemsShowcaseNameOption = (ItemsShowcaseNameOption) other;
                return this.id == itemsShowcaseNameOption.id && L.f(this.name, itemsShowcaseNameOption.name);
            }

            public final int getId() {
                return this.id;
            }

            @k
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ItemsShowcaseNameOption(id=");
                sb2.append(this.id);
                sb2.append(", name=");
                return C22026a.c(sb2, this.name, ')');
            }
        }

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$SelectItems;", "", "title", "", "subtitle", "button", "Lcom/avito/android/remote/model/DeeplinkAction;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/DeeplinkAction;)V", "getButton", "()Lcom/avito/android/remote/model/DeeplinkAction;", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SelectItems {

            @c("button")
            @k
            private final DeeplinkAction button;

            @c("subtitle")
            @k
            private final String subtitle;

            @c("title")
            @k
            private final String title;

            public SelectItems(@k String str, @k String str2, @k DeeplinkAction deeplinkAction) {
                this.title = str;
                this.subtitle = str2;
                this.button = deeplinkAction;
            }

            public static /* synthetic */ SelectItems copy$default(SelectItems selectItems, String str, String str2, DeeplinkAction deeplinkAction, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = selectItems.title;
                }
                if ((i12 & 2) != 0) {
                    str2 = selectItems.subtitle;
                }
                if ((i12 & 4) != 0) {
                    deeplinkAction = selectItems.button;
                }
                return selectItems.copy(str, str2, deeplinkAction);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final DeeplinkAction getButton() {
                return this.button;
            }

            @k
            public final SelectItems copy(@k String title, @k String subtitle, @k DeeplinkAction button) {
                return new SelectItems(title, subtitle, button);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectItems)) {
                    return false;
                }
                SelectItems selectItems = (SelectItems) other;
                return L.f(this.title, selectItems.title) && L.f(this.subtitle, selectItems.subtitle) && L.f(this.button, selectItems.button);
            }

            @k
            public final DeeplinkAction getButton() {
                return this.button;
            }

            @k
            public final String getSubtitle() {
                return this.subtitle;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.button.hashCode() + H.d(this.title.hashCode() * 31, 31, this.subtitle);
            }

            @k
            public String toString() {
                return "SelectItems(title=" + this.title + ", subtitle=" + this.subtitle + ", button=" + this.button + ')';
            }
        }

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$SelectName;", "", "title", "", "subtitle", "(Ljava/lang/String;Ljava/lang/String;)V", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SelectName {

            @c("subtitle")
            @k
            private final String subtitle;

            @c("title")
            @k
            private final String title;

            public SelectName(@k String str, @k String str2) {
                this.title = str;
                this.subtitle = str2;
            }

            public static /* synthetic */ SelectName copy$default(SelectName selectName, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = selectName.title;
                }
                if ((i12 & 2) != 0) {
                    str2 = selectName.subtitle;
                }
                return selectName.copy(str, str2);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            @k
            public final SelectName copy(@k String title, @k String subtitle) {
                return new SelectName(title, subtitle);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectName)) {
                    return false;
                }
                SelectName selectName = (SelectName) other;
                return L.f(this.title, selectName.title) && L.f(this.subtitle, selectName.subtitle);
            }

            @k
            public final String getSubtitle() {
                return this.subtitle;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.subtitle.hashCode() + (this.title.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("SelectName(title=");
                sb2.append(this.title);
                sb2.append(", subtitle=");
                return C22026a.c(sb2, this.subtitle, ')');
            }
        }

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$Settings;", "", "title", "", "selectName", "Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$SelectName;", "selectItems", "Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$SelectItems;", "button", "Lcom/avito/android/remote/model/DeeplinkAction;", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$SelectName;Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$SelectItems;Lcom/avito/android/remote/model/DeeplinkAction;)V", "getButton", "()Lcom/avito/android/remote/model/DeeplinkAction;", "getSelectItems", "()Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$SelectItems;", "getSelectName", "()Lcom/avito/android/remote/model/extended/CarouselEditWidget$Config$SelectName;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Settings {

            @c("button")
            @k
            private final DeeplinkAction button;

            @c("selectItems")
            @k
            private final SelectItems selectItems;

            @c("selectName")
            @k
            private final SelectName selectName;

            @c("title")
            @k
            private final String title;

            public Settings(@k String str, @k SelectName selectName, @k SelectItems selectItems, @k DeeplinkAction deeplinkAction) {
                this.title = str;
                this.selectName = selectName;
                this.selectItems = selectItems;
                this.button = deeplinkAction;
            }

            public static /* synthetic */ Settings copy$default(Settings settings, String str, SelectName selectName, SelectItems selectItems, DeeplinkAction deeplinkAction, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = settings.title;
                }
                if ((i12 & 2) != 0) {
                    selectName = settings.selectName;
                }
                if ((i12 & 4) != 0) {
                    selectItems = settings.selectItems;
                }
                if ((i12 & 8) != 0) {
                    deeplinkAction = settings.button;
                }
                return settings.copy(str, selectName, selectItems, deeplinkAction);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final SelectName getSelectName() {
                return this.selectName;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final SelectItems getSelectItems() {
                return this.selectItems;
            }

            @k
            /* renamed from: component4, reason: from getter */
            public final DeeplinkAction getButton() {
                return this.button;
            }

            @k
            public final Settings copy(@k String title, @k SelectName selectName, @k SelectItems selectItems, @k DeeplinkAction button) {
                return new Settings(title, selectName, selectItems, button);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Settings)) {
                    return false;
                }
                Settings settings = (Settings) other;
                return L.f(this.title, settings.title) && L.f(this.selectName, settings.selectName) && L.f(this.selectItems, settings.selectItems) && L.f(this.button, settings.button);
            }

            @k
            public final DeeplinkAction getButton() {
                return this.button;
            }

            @k
            public final SelectItems getSelectItems() {
                return this.selectItems;
            }

            @k
            public final SelectName getSelectName() {
                return this.selectName;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.button.hashCode() + ((this.selectItems.hashCode() + ((this.selectName.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31);
            }

            @k
            public String toString() {
                return "Settings(title=" + this.title + ", selectName=" + this.selectName + ", selectItems=" + this.selectItems + ", button=" + this.button + ')';
            }
        }

        public Config(@k EmptyState emptyState, @k Settings settings, int i12, int i13, @k List<ItemsShowcaseNameOption> list) {
            this.emptyState = emptyState;
            this.settings = settings;
            this.minItemsCount = i12;
            this.maxItemsCount = i13;
            this.possibleNames = list;
        }

        public static /* synthetic */ Config copy$default(Config config, EmptyState emptyState, Settings settings, int i12, int i13, List list, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                emptyState = config.emptyState;
            }
            if ((i14 & 2) != 0) {
                settings = config.settings;
            }
            Settings settings2 = settings;
            if ((i14 & 4) != 0) {
                i12 = config.minItemsCount;
            }
            int i15 = i12;
            if ((i14 & 8) != 0) {
                i13 = config.maxItemsCount;
            }
            int i16 = i13;
            if ((i14 & 16) != 0) {
                list = config.possibleNames;
            }
            return config.copy(emptyState, settings2, i15, i16, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Settings getSettings() {
            return this.settings;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMinItemsCount() {
            return this.minItemsCount;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMaxItemsCount() {
            return this.maxItemsCount;
        }

        @k
        public final List<ItemsShowcaseNameOption> component5() {
            return this.possibleNames;
        }

        @k
        public final Config copy(@k EmptyState emptyState, @k Settings settings, int minItemsCount, int maxItemsCount, @k List<ItemsShowcaseNameOption> possibleNames) {
            return new Config(emptyState, settings, minItemsCount, maxItemsCount, possibleNames);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return L.f(this.emptyState, config.emptyState) && L.f(this.settings, config.settings) && this.minItemsCount == config.minItemsCount && this.maxItemsCount == config.maxItemsCount && L.f(this.possibleNames, config.possibleNames);
        }

        @k
        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        public final int getMaxItemsCount() {
            return this.maxItemsCount;
        }

        public final int getMinItemsCount() {
            return this.minItemsCount;
        }

        @k
        public final List<ItemsShowcaseNameOption> getPossibleNames() {
            return this.possibleNames;
        }

        @k
        public final Settings getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.possibleNames.hashCode() + r.e(this.maxItemsCount, r.e(this.minItemsCount, (this.settings.hashCode() + (this.emptyState.hashCode() * 31)) * 31, 31), 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Config(emptyState=");
            sb2.append(this.emptyState);
            sb2.append(", settings=");
            sb2.append(this.settings);
            sb2.append(", minItemsCount=");
            sb2.append(this.minItemsCount);
            sb2.append(", maxItemsCount=");
            sb2.append(this.maxItemsCount);
            sb2.append(", possibleNames=");
            return H.p(sb2, this.possibleNames, ')');
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/extended/CarouselEditWidget$Field;", "", "name", "", "values", "", "Lcom/avito/android/remote/model/extended/CarouselEditWidget$Field$FieldValue;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "FieldValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Field {

        @c("name")
        @k
        private final String name;

        @c("values")
        @l
        private final List<FieldValue> values;

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/extended/CarouselEditWidget$Field$FieldValue;", "", "valueId", "", "carouselValue", "Lcom/avito/android/remote/model/extended/CarouselValue;", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/CarouselValue;)V", "getCarouselValue", "()Lcom/avito/android/remote/model/extended/CarouselValue;", "getValueId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FieldValue {

            @c("value")
            @k
            private final CarouselValue carouselValue;

            @c("valueId")
            @k
            private final String valueId;

            public FieldValue(@k String str, @k CarouselValue carouselValue) {
                this.valueId = str;
                this.carouselValue = carouselValue;
            }

            public static /* synthetic */ FieldValue copy$default(FieldValue fieldValue, String str, CarouselValue carouselValue, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = fieldValue.valueId;
                }
                if ((i12 & 2) != 0) {
                    carouselValue = fieldValue.carouselValue;
                }
                return fieldValue.copy(str, carouselValue);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getValueId() {
                return this.valueId;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final CarouselValue getCarouselValue() {
                return this.carouselValue;
            }

            @k
            public final FieldValue copy(@k String valueId, @k CarouselValue carouselValue) {
                return new FieldValue(valueId, carouselValue);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FieldValue)) {
                    return false;
                }
                FieldValue fieldValue = (FieldValue) other;
                return L.f(this.valueId, fieldValue.valueId) && L.f(this.carouselValue, fieldValue.carouselValue);
            }

            @k
            public final CarouselValue getCarouselValue() {
                return this.carouselValue;
            }

            @k
            public final String getValueId() {
                return this.valueId;
            }

            public int hashCode() {
                return this.carouselValue.hashCode() + (this.valueId.hashCode() * 31);
            }

            @k
            public String toString() {
                return "FieldValue(valueId=" + this.valueId + ", carouselValue=" + this.carouselValue + ')';
            }
        }

        public Field(@k String str, @l List<FieldValue> list) {
            this.name = str;
            this.values = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Field copy$default(Field field, String str, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = field.name;
            }
            if ((i12 & 2) != 0) {
                list = field.values;
            }
            return field.copy(str, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        public final List<FieldValue> component2() {
            return this.values;
        }

        @k
        public final Field copy(@k String name, @l List<FieldValue> values) {
            return new Field(name, values);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return L.f(this.name, field.name) && L.f(this.values, field.values);
        }

        @k
        public final String getName() {
            return this.name;
        }

        @l
        public final List<FieldValue> getValues() {
            return this.values;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            List<FieldValue> list = this.values;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Field(name=");
            sb2.append(this.name);
            sb2.append(", values=");
            return H.p(sb2, this.values, ')');
        }
    }

    public CarouselEditWidget(@k Config config, @k List<Field> list, @l String str) {
        this.config = config;
        this.fields = list;
        this.widgetName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CarouselEditWidget copy$default(CarouselEditWidget carouselEditWidget, Config config, List list, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            config = carouselEditWidget.config;
        }
        if ((i12 & 2) != 0) {
            list = carouselEditWidget.fields;
        }
        if ((i12 & 4) != 0) {
            str = carouselEditWidget.widgetName;
        }
        return carouselEditWidget.copy(config, list, str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    @k
    public final List<Field> component2() {
        return this.fields;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @k
    public final CarouselEditWidget copy(@k Config config, @k List<Field> fields, @l String widgetName) {
        return new CarouselEditWidget(config, fields, widgetName);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselEditWidget)) {
            return false;
        }
        CarouselEditWidget carouselEditWidget = (CarouselEditWidget) other;
        return L.f(this.config, carouselEditWidget.config) && L.f(this.fields, carouselEditWidget.fields) && L.f(this.widgetName, carouselEditWidget.widgetName);
    }

    @k
    public final Config getConfig() {
        return this.config;
    }

    @k
    public final List<Field> getFields() {
        return this.fields;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int iE2 = H.e(this.config.hashCode() * 31, 31, this.fields);
        String str = this.widgetName;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CarouselEditWidget(config=");
        sb2.append(this.config);
        sb2.append(", fields=");
        sb2.append(this.fields);
        sb2.append(", widgetName=");
        return C22026a.c(sb2, this.widgetName, ')');
    }
}
