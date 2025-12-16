package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Widgets.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/extended/TextWidget;", "Lcom/avito/android/remote/model/extended/ExtendedSettingsWidget;", Navigation.CONFIG, "Lcom/avito/android/remote/model/extended/TextWidget$Config;", "values", "", "Lcom/avito/android/remote/model/extended/TextWidget$Field;", "widgetName", "", "(Lcom/avito/android/remote/model/extended/TextWidget$Config;Ljava/util/List;Ljava/lang/String;)V", "getConfig", "()Lcom/avito/android/remote/model/extended/TextWidget$Config;", "getValues", "()Ljava/util/List;", "getWidgetName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Config", "Field", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TextWidget implements ExtendedSettingsWidget {

    @c(Navigation.CONFIG)
    @k
    private final Config config;

    @c(LocalPublishState.FIELDS)
    @l
    private final List<Field> values;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u000534567Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0084\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0006HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001f\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013¨\u00068"}, d2 = {"Lcom/avito/android/remote/model/extended/TextWidget$Config;", "", "title", "", ChannelContext.Item.PLACEHOLDER, "maxLengthCount", "", "showMoreLinesCount", "showMoreTitle", "popupTitle", "defaultSaveErrorMessage", "notSavedAlert", "Lcom/avito/android/remote/model/extended/TextWidget$Config$NotSavedAlert;", "formattedAlert", "Lcom/avito/android/remote/model/extended/TextWidget$Config$FormattedAlert;", "popupData", "Lcom/avito/android/remote/model/extended/TextWidget$Config$PopupData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/TextWidget$Config$NotSavedAlert;Lcom/avito/android/remote/model/extended/TextWidget$Config$FormattedAlert;Lcom/avito/android/remote/model/extended/TextWidget$Config$PopupData;)V", "getDefaultSaveErrorMessage", "()Ljava/lang/String;", "getFormattedAlert", "()Lcom/avito/android/remote/model/extended/TextWidget$Config$FormattedAlert;", "getMaxLengthCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNotSavedAlert", "()Lcom/avito/android/remote/model/extended/TextWidget$Config$NotSavedAlert;", "getPlaceholder", "getPopupData", "()Lcom/avito/android/remote/model/extended/TextWidget$Config$PopupData;", "getPopupTitle", "getShowMoreLinesCount", "getShowMoreTitle", "getTitle", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/TextWidget$Config$NotSavedAlert;Lcom/avito/android/remote/model/extended/TextWidget$Config$FormattedAlert;Lcom/avito/android/remote/model/extended/TextWidget$Config$PopupData;)Lcom/avito/android/remote/model/extended/TextWidget$Config;", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "AboutTab", "AboutTabContent", "FormattedAlert", "NotSavedAlert", "PopupData", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config {

        @c("defaultSaveErrorMessage")
        @l
        private final String defaultSaveErrorMessage;

        @c("editedAlert")
        @l
        private final FormattedAlert formattedAlert;

        @c("maxLengthCount")
        @l
        private final Integer maxLengthCount;

        @c("notSavedAlert")
        @l
        private final NotSavedAlert notSavedAlert;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("popupData")
        @l
        private final PopupData popupData;

        @c("popupTitle")
        @l
        private final String popupTitle;

        @c("showMoreLinesCount")
        @l
        private final Integer showMoreLinesCount;

        @c("showMoreTitle")
        @l
        private final String showMoreTitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/extended/TextWidget$Config$AboutTab;", "", "content", "Lcom/avito/android/remote/model/extended/TextWidget$Config$AboutTabContent;", "title", "", "(Lcom/avito/android/remote/model/extended/TextWidget$Config$AboutTabContent;Ljava/lang/String;)V", "getContent", "()Lcom/avito/android/remote/model/extended/TextWidget$Config$AboutTabContent;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AboutTab {

            @c("content")
            @k
            private final AboutTabContent content;

            @c("title")
            @k
            private final String title;

            public AboutTab(@k AboutTabContent aboutTabContent, @k String str) {
                this.content = aboutTabContent;
                this.title = str;
            }

            public static /* synthetic */ AboutTab copy$default(AboutTab aboutTab, AboutTabContent aboutTabContent, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    aboutTabContent = aboutTab.content;
                }
                if ((i12 & 2) != 0) {
                    str = aboutTab.title;
                }
                return aboutTab.copy(aboutTabContent, str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final AboutTabContent getContent() {
                return this.content;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            public final AboutTab copy(@k AboutTabContent content, @k String title) {
                return new AboutTab(content, title);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AboutTab)) {
                    return false;
                }
                AboutTab aboutTab = (AboutTab) other;
                return L.f(this.content, aboutTab.content) && L.f(this.title, aboutTab.title);
            }

            @k
            public final AboutTabContent getContent() {
                return this.content;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.title.hashCode() + (this.content.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("AboutTab(content=");
                sb2.append(this.content);
                sb2.append(", title=");
                return C22026a.c(sb2, this.title, ')');
            }
        }

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/extended/TextWidget$Config$AboutTabContent;", "", "ListTab", "StoriesTab", "Lcom/avito/android/remote/model/extended/TextWidget$Config$AboutTabContent$ListTab;", "Lcom/avito/android/remote/model/extended/TextWidget$Config$AboutTabContent$StoriesTab;", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface AboutTabContent {

            /* compiled from: Widgets.kt */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/extended/TextWidget$Config$AboutTabContent$ListTab;", "Lcom/avito/android/remote/model/extended/TextWidget$Config$AboutTabContent;", "value", "", "", "(Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class ListTab implements AboutTabContent {

                @c("value")
                @k
                private final List<String> value;

                public ListTab(@k List<String> list) {
                    this.value = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ ListTab copy$default(ListTab listTab, List list, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        list = listTab.value;
                    }
                    return listTab.copy(list);
                }

                @k
                public final List<String> component1() {
                    return this.value;
                }

                @k
                public final ListTab copy(@k List<String> value) {
                    return new ListTab(value);
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ListTab) && L.f(this.value, ((ListTab) other).value);
                }

                @k
                public final List<String> getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                @k
                public String toString() {
                    return H.p(new StringBuilder("ListTab(value="), this.value, ')');
                }
            }

            /* compiled from: Widgets.kt */
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/extended/TextWidget$Config$AboutTabContent$StoriesTab;", "Lcom/avito/android/remote/model/extended/TextWidget$Config$AboutTabContent;", "value", "", "Lcom/avito/android/remote/model/extended/TextWidget$Config$AboutTabContent$StoriesTab$Story;", "(Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "Story", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class StoriesTab implements AboutTabContent {

                @c("value")
                @k
                private final List<Story> value;

                /* compiled from: Widgets.kt */
                @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/extended/TextWidget$Config$AboutTabContent$StoriesTab$Story;", "", "points", "", "", "text", "Lcom/avito/android/remote/model/text/AttributedText;", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "getPoints", "()Ljava/util/List;", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Story {

                    @c("list")
                    @l
                    private final List<String> points;

                    @c("attributed")
                    @k
                    private final AttributedText text;

                    public Story(@l List<String> list, @k AttributedText attributedText) {
                        this.points = list;
                        this.text = attributedText;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ Story copy$default(Story story, List list, AttributedText attributedText, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            list = story.points;
                        }
                        if ((i12 & 2) != 0) {
                            attributedText = story.text;
                        }
                        return story.copy(list, attributedText);
                    }

                    @l
                    public final List<String> component1() {
                        return this.points;
                    }

                    @k
                    /* renamed from: component2, reason: from getter */
                    public final AttributedText getText() {
                        return this.text;
                    }

                    @k
                    public final Story copy(@l List<String> points, @k AttributedText text) {
                        return new Story(points, text);
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Story)) {
                            return false;
                        }
                        Story story = (Story) other;
                        return L.f(this.points, story.points) && L.f(this.text, story.text);
                    }

                    @l
                    public final List<String> getPoints() {
                        return this.points;
                    }

                    @k
                    public final AttributedText getText() {
                        return this.text;
                    }

                    public int hashCode() {
                        List<String> list = this.points;
                        return this.text.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
                    }

                    @k
                    public String toString() {
                        StringBuilder sb2 = new StringBuilder("Story(points=");
                        sb2.append(this.points);
                        sb2.append(", text=");
                        return a.w(sb2, this.text, ')');
                    }
                }

                public StoriesTab(@k List<Story> list) {
                    this.value = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ StoriesTab copy$default(StoriesTab storiesTab, List list, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        list = storiesTab.value;
                    }
                    return storiesTab.copy(list);
                }

                @k
                public final List<Story> component1() {
                    return this.value;
                }

                @k
                public final StoriesTab copy(@k List<Story> value) {
                    return new StoriesTab(value);
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof StoriesTab) && L.f(this.value, ((StoriesTab) other).value);
                }

                @k
                public final List<Story> getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                @k
                public String toString() {
                    return H.p(new StringBuilder("StoriesTab(value="), this.value, ')');
                }
            }
        }

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/extended/TextWidget$Config$FormattedAlert;", "", "title", "", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "sendActionTitle", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "getSendActionTitle", "()Ljava/lang/String;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class FormattedAlert {

            @c("sendActionTitle")
            @k
            private final String sendActionTitle;

            @c("subtitle")
            @k
            private final AttributedText subtitle;

            @c("title")
            @k
            private final String title;

            public FormattedAlert(@k String str, @k AttributedText attributedText, @k String str2) {
                this.title = str;
                this.subtitle = attributedText;
                this.sendActionTitle = str2;
            }

            @k
            public final String getSendActionTitle() {
                return this.sendActionTitle;
            }

            @k
            public final AttributedText getSubtitle() {
                return this.subtitle;
            }

            @k
            public final String getTitle() {
                return this.title;
            }
        }

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/extended/TextWidget$Config$NotSavedAlert;", "", "title", "", "subtitle", "confirmActionTitle", "cancelActionTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCancelActionTitle", "()Ljava/lang/String;", "getConfirmActionTitle", "getSubtitle", "getTitle", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NotSavedAlert {

            @c("cancelActionTitle")
            @k
            private final String cancelActionTitle;

            @c("confirmActionTitle")
            @k
            private final String confirmActionTitle;

            @c("subtitle")
            @k
            private final String subtitle;

            @c("title")
            @k
            private final String title;

            public NotSavedAlert(@k String str, @k String str2, @k String str3, @k String str4) {
                this.title = str;
                this.subtitle = str2;
                this.confirmActionTitle = str3;
                this.cancelActionTitle = str4;
            }

            @k
            public final String getCancelActionTitle() {
                return this.cancelActionTitle;
            }

            @k
            public final String getConfirmActionTitle() {
                return this.confirmActionTitle;
            }

            @k
            public final String getSubtitle() {
                return this.subtitle;
            }

            @k
            public final String getTitle() {
                return this.title;
            }
        }

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/extended/TextWidget$Config$PopupData;", "", "tabs", "", "Lcom/avito/android/remote/model/extended/TextWidget$Config$AboutTab;", "(Ljava/util/List;)V", "getTabs", "()Ljava/util/List;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PopupData {

            @c("tabs")
            @k
            private final List<AboutTab> tabs;

            public PopupData(@k List<AboutTab> list) {
                this.tabs = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PopupData copy$default(PopupData popupData, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    list = popupData.tabs;
                }
                return popupData.copy(list);
            }

            @k
            public final List<AboutTab> component1() {
                return this.tabs;
            }

            @k
            public final PopupData copy(@k List<AboutTab> tabs) {
                return new PopupData(tabs);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PopupData) && L.f(this.tabs, ((PopupData) other).tabs);
            }

            @k
            public final List<AboutTab> getTabs() {
                return this.tabs;
            }

            public int hashCode() {
                return this.tabs.hashCode();
            }

            @k
            public String toString() {
                return H.p(new StringBuilder("PopupData(tabs="), this.tabs, ')');
            }
        }

        public Config(@k String str, @l String str2, @l Integer num, @l Integer num2, @l String str3, @l String str4, @l String str5, @l NotSavedAlert notSavedAlert, @l FormattedAlert formattedAlert, @l PopupData popupData) {
            this.title = str;
            this.placeholder = str2;
            this.maxLengthCount = num;
            this.showMoreLinesCount = num2;
            this.showMoreTitle = str3;
            this.popupTitle = str4;
            this.defaultSaveErrorMessage = str5;
            this.notSavedAlert = notSavedAlert;
            this.formattedAlert = formattedAlert;
            this.popupData = popupData;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final PopupData getPopupData() {
            return this.popupData;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Integer getMaxLengthCount() {
            return this.maxLengthCount;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Integer getShowMoreLinesCount() {
            return this.showMoreLinesCount;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getShowMoreTitle() {
            return this.showMoreTitle;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getPopupTitle() {
            return this.popupTitle;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getDefaultSaveErrorMessage() {
            return this.defaultSaveErrorMessage;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final NotSavedAlert getNotSavedAlert() {
            return this.notSavedAlert;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final FormattedAlert getFormattedAlert() {
            return this.formattedAlert;
        }

        @k
        public final Config copy(@k String title, @l String placeholder, @l Integer maxLengthCount, @l Integer showMoreLinesCount, @l String showMoreTitle, @l String popupTitle, @l String defaultSaveErrorMessage, @l NotSavedAlert notSavedAlert, @l FormattedAlert formattedAlert, @l PopupData popupData) {
            return new Config(title, placeholder, maxLengthCount, showMoreLinesCount, showMoreTitle, popupTitle, defaultSaveErrorMessage, notSavedAlert, formattedAlert, popupData);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return L.f(this.title, config.title) && L.f(this.placeholder, config.placeholder) && L.f(this.maxLengthCount, config.maxLengthCount) && L.f(this.showMoreLinesCount, config.showMoreLinesCount) && L.f(this.showMoreTitle, config.showMoreTitle) && L.f(this.popupTitle, config.popupTitle) && L.f(this.defaultSaveErrorMessage, config.defaultSaveErrorMessage) && L.f(this.notSavedAlert, config.notSavedAlert) && L.f(this.formattedAlert, config.formattedAlert) && L.f(this.popupData, config.popupData);
        }

        @l
        public final String getDefaultSaveErrorMessage() {
            return this.defaultSaveErrorMessage;
        }

        @l
        public final FormattedAlert getFormattedAlert() {
            return this.formattedAlert;
        }

        @l
        public final Integer getMaxLengthCount() {
            return this.maxLengthCount;
        }

        @l
        public final NotSavedAlert getNotSavedAlert() {
            return this.notSavedAlert;
        }

        @l
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        public final PopupData getPopupData() {
            return this.popupData;
        }

        @l
        public final String getPopupTitle() {
            return this.popupTitle;
        }

        @l
        public final Integer getShowMoreLinesCount() {
            return this.showMoreLinesCount;
        }

        @l
        public final String getShowMoreTitle() {
            return this.showMoreTitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.placeholder;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.maxLengthCount;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.showMoreLinesCount;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.showMoreTitle;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.popupTitle;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.defaultSaveErrorMessage;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            NotSavedAlert notSavedAlert = this.notSavedAlert;
            int iHashCode8 = (iHashCode7 + (notSavedAlert == null ? 0 : notSavedAlert.hashCode())) * 31;
            FormattedAlert formattedAlert = this.formattedAlert;
            int iHashCode9 = (iHashCode8 + (formattedAlert == null ? 0 : formattedAlert.hashCode())) * 31;
            PopupData popupData = this.popupData;
            return iHashCode9 + (popupData != null ? popupData.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Config(title=" + this.title + ", placeholder=" + this.placeholder + ", maxLengthCount=" + this.maxLengthCount + ", showMoreLinesCount=" + this.showMoreLinesCount + ", showMoreTitle=" + this.showMoreTitle + ", popupTitle=" + this.popupTitle + ", defaultSaveErrorMessage=" + this.defaultSaveErrorMessage + ", notSavedAlert=" + this.notSavedAlert + ", formattedAlert=" + this.formattedAlert + ", popupData=" + this.popupData + ')';
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/extended/TextWidget$Field;", "", "name", "", "values", "", "Lcom/avito/android/remote/model/extended/TextWidget$Field$FieldValue;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "FieldValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Field {

        @c("name")
        @k
        private final String name;

        @c("values")
        @l
        private final List<FieldValue> values;

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/extended/TextWidget$Field$FieldValue;", "", "valueId", "", "text", "status", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/FieldModerationStatus;)V", "getStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getText", "()Ljava/lang/String;", "getValueId", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FieldValue {

            @c("status")
            @l
            private final FieldModerationStatus status;

            @c("value")
            @l
            private final String text;

            @c("valueId")
            @k
            private final String valueId;

            public FieldValue(@k String str, @l String str2, @l FieldModerationStatus fieldModerationStatus) {
                this.valueId = str;
                this.text = str2;
                this.status = fieldModerationStatus;
            }

            public static /* synthetic */ FieldValue copy$default(FieldValue fieldValue, String str, String str2, FieldModerationStatus fieldModerationStatus, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = fieldValue.valueId;
                }
                if ((i12 & 2) != 0) {
                    str2 = fieldValue.text;
                }
                if ((i12 & 4) != 0) {
                    fieldModerationStatus = fieldValue.status;
                }
                return fieldValue.copy(str, str2, fieldModerationStatus);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getValueId() {
                return this.valueId;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final FieldModerationStatus getStatus() {
                return this.status;
            }

            @k
            public final FieldValue copy(@k String valueId, @l String text, @l FieldModerationStatus status) {
                return new FieldValue(valueId, text, status);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FieldValue)) {
                    return false;
                }
                FieldValue fieldValue = (FieldValue) other;
                return L.f(this.valueId, fieldValue.valueId) && L.f(this.text, fieldValue.text) && L.f(this.status, fieldValue.status);
            }

            @l
            public final FieldModerationStatus getStatus() {
                return this.status;
            }

            @l
            public final String getText() {
                return this.text;
            }

            @k
            public final String getValueId() {
                return this.valueId;
            }

            public int hashCode() {
                int iHashCode = this.valueId.hashCode() * 31;
                String str = this.text;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                FieldModerationStatus fieldModerationStatus = this.status;
                return iHashCode2 + (fieldModerationStatus != null ? fieldModerationStatus.hashCode() : 0);
            }

            @k
            public String toString() {
                return "FieldValue(valueId=" + this.valueId + ", text=" + this.text + ", status=" + this.status + ')';
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

    public TextWidget(@k Config config, @l List<Field> list, @l String str) {
        this.config = config;
        this.values = list;
        this.widgetName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextWidget copy$default(TextWidget textWidget, Config config, List list, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            config = textWidget.config;
        }
        if ((i12 & 2) != 0) {
            list = textWidget.values;
        }
        if ((i12 & 4) != 0) {
            str = textWidget.widgetName;
        }
        return textWidget.copy(config, list, str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    @l
    public final List<Field> component2() {
        return this.values;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @k
    public final TextWidget copy(@k Config config, @l List<Field> values, @l String widgetName) {
        return new TextWidget(config, values, widgetName);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextWidget)) {
            return false;
        }
        TextWidget textWidget = (TextWidget) other;
        return L.f(this.config, textWidget.config) && L.f(this.values, textWidget.values) && L.f(this.widgetName, textWidget.widgetName);
    }

    @k
    public final Config getConfig() {
        return this.config;
    }

    @l
    public final List<Field> getValues() {
        return this.values;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int iHashCode = this.config.hashCode() * 31;
        List<Field> list = this.values;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.widgetName;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TextWidget(config=");
        sb2.append(this.config);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", widgetName=");
        return C22026a.c(sb2, this.widgetName, ')');
    }
}
