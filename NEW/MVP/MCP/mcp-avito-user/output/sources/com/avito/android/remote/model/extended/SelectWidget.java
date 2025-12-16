package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Widgets.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/extended/SelectWidget;", "Lcom/avito/android/remote/model/extended/ExtendedSettingsWidget;", Navigation.CONFIG, "Lcom/avito/android/remote/model/extended/SelectWidget$Config;", "values", "", "Lcom/avito/android/remote/model/extended/SelectWidget$Field;", "widgetName", "", "(Lcom/avito/android/remote/model/extended/SelectWidget$Config;Ljava/util/List;Ljava/lang/String;)V", "getConfig", "()Lcom/avito/android/remote/model/extended/SelectWidget$Config;", "getValues", "()Ljava/util/List;", "getWidgetName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Config", "Field", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SelectWidget implements ExtendedSettingsWidget {

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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J_\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/extended/SelectWidget$Config;", "", "defaultSaveErrorMessage", "", "title", "description", ChannelContext.Item.PLACEHOLDER, "inputPlaceholder", "popupTitle", "options", "", "Lcom/avito/android/remote/model/extended/SelectWidget$Config$Option;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDefaultSaveErrorMessage", "()Ljava/lang/String;", "getDescription", "getInputPlaceholder", "getOptions", "()Ljava/util/List;", "getPlaceholder", "getPopupTitle", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Option", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config {

        @c("defaultErrorMessageText")
        @l
        private final String defaultSaveErrorMessage;

        @c("description")
        @l
        private final String description;

        @c("inputPlaceholder")
        @l
        private final String inputPlaceholder;

        @c("options")
        @k
        private final List<Option> options;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("popupTitle")
        @l
        private final String popupTitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/extended/SelectWidget$Config$Option;", "", "label", "", "value", "", "(Ljava/lang/String;I)V", "getLabel", "()Ljava/lang/String;", "getValue", "()I", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Option {

            @c("label")
            @k
            private final String label;

            @c("value")
            private final int value;

            public Option(@k String str, int i12) {
                this.label = str;
                this.value = i12;
            }

            public static /* synthetic */ Option copy$default(Option option, String str, int i12, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = option.label;
                }
                if ((i13 & 2) != 0) {
                    i12 = option.value;
                }
                return option.copy(str, i12);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            /* renamed from: component2, reason: from getter */
            public final int getValue() {
                return this.value;
            }

            @k
            public final Option copy(@k String label, int value) {
                return new Option(label, value);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Option)) {
                    return false;
                }
                Option option = (Option) other;
                return L.f(this.label, option.label) && this.value == option.value;
            }

            @k
            public final String getLabel() {
                return this.label;
            }

            public final int getValue() {
                return this.value;
            }

            public int hashCode() {
                return Integer.hashCode(this.value) + (this.label.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Option(label=");
                sb2.append(this.label);
                sb2.append(", value=");
                return r.t(sb2, this.value, ')');
            }
        }

        public Config(@l String str, @k String str2, @l String str3, @l String str4, @l String str5, @l String str6, @k List<Option> list) {
            this.defaultSaveErrorMessage = str;
            this.title = str2;
            this.description = str3;
            this.placeholder = str4;
            this.inputPlaceholder = str5;
            this.popupTitle = str6;
            this.options = list;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, String str2, String str3, String str4, String str5, String str6, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = config.defaultSaveErrorMessage;
            }
            if ((i12 & 2) != 0) {
                str2 = config.title;
            }
            String str7 = str2;
            if ((i12 & 4) != 0) {
                str3 = config.description;
            }
            String str8 = str3;
            if ((i12 & 8) != 0) {
                str4 = config.placeholder;
            }
            String str9 = str4;
            if ((i12 & 16) != 0) {
                str5 = config.inputPlaceholder;
            }
            String str10 = str5;
            if ((i12 & 32) != 0) {
                str6 = config.popupTitle;
            }
            String str11 = str6;
            if ((i12 & 64) != 0) {
                list = config.options;
            }
            return config.copy(str, str7, str8, str9, str10, str11, list);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getDefaultSaveErrorMessage() {
            return this.defaultSaveErrorMessage;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getInputPlaceholder() {
            return this.inputPlaceholder;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getPopupTitle() {
            return this.popupTitle;
        }

        @k
        public final List<Option> component7() {
            return this.options;
        }

        @k
        public final Config copy(@l String defaultSaveErrorMessage, @k String title, @l String description, @l String placeholder, @l String inputPlaceholder, @l String popupTitle, @k List<Option> options) {
            return new Config(defaultSaveErrorMessage, title, description, placeholder, inputPlaceholder, popupTitle, options);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return L.f(this.defaultSaveErrorMessage, config.defaultSaveErrorMessage) && L.f(this.title, config.title) && L.f(this.description, config.description) && L.f(this.placeholder, config.placeholder) && L.f(this.inputPlaceholder, config.inputPlaceholder) && L.f(this.popupTitle, config.popupTitle) && L.f(this.options, config.options);
        }

        @l
        public final String getDefaultSaveErrorMessage() {
            return this.defaultSaveErrorMessage;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final String getInputPlaceholder() {
            return this.inputPlaceholder;
        }

        @k
        public final List<Option> getOptions() {
            return this.options;
        }

        @l
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        public final String getPopupTitle() {
            return this.popupTitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.defaultSaveErrorMessage;
            int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
            String str2 = this.description;
            int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.placeholder;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.inputPlaceholder;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.popupTitle;
            return this.options.hashCode() + ((iHashCode3 + (str5 != null ? str5.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Config(defaultSaveErrorMessage=");
            sb2.append(this.defaultSaveErrorMessage);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", placeholder=");
            sb2.append(this.placeholder);
            sb2.append(", inputPlaceholder=");
            sb2.append(this.inputPlaceholder);
            sb2.append(", popupTitle=");
            sb2.append(this.popupTitle);
            sb2.append(", options=");
            return H.p(sb2, this.options, ')');
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/extended/SelectWidget$Field;", "", "name", "", "values", "", "Lcom/avito/android/remote/model/extended/SelectWidget$Field$FieldValue;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "FieldValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Field {

        @c("name")
        @k
        private final String name;

        @c("values")
        @l
        private final List<FieldValue> values;

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/extended/SelectWidget$Field$FieldValue;", "", "valueId", "", "value", "", "(Ljava/lang/String;I)V", "getValue", "()I", "getValueId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FieldValue {

            @c("value")
            private final int value;

            @c("valueId")
            @k
            private final String valueId;

            public FieldValue(@k String str, int i12) {
                this.valueId = str;
                this.value = i12;
            }

            public static /* synthetic */ FieldValue copy$default(FieldValue fieldValue, String str, int i12, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = fieldValue.valueId;
                }
                if ((i13 & 2) != 0) {
                    i12 = fieldValue.value;
                }
                return fieldValue.copy(str, i12);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getValueId() {
                return this.valueId;
            }

            /* renamed from: component2, reason: from getter */
            public final int getValue() {
                return this.value;
            }

            @k
            public final FieldValue copy(@k String valueId, int value) {
                return new FieldValue(valueId, value);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FieldValue)) {
                    return false;
                }
                FieldValue fieldValue = (FieldValue) other;
                return L.f(this.valueId, fieldValue.valueId) && this.value == fieldValue.value;
            }

            public final int getValue() {
                return this.value;
            }

            @k
            public final String getValueId() {
                return this.valueId;
            }

            public int hashCode() {
                return Integer.hashCode(this.value) + (this.valueId.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("FieldValue(valueId=");
                sb2.append(this.valueId);
                sb2.append(", value=");
                return r.t(sb2, this.value, ')');
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

    public SelectWidget(@k Config config, @l List<Field> list, @l String str) {
        this.config = config;
        this.values = list;
        this.widgetName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectWidget copy$default(SelectWidget selectWidget, Config config, List list, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            config = selectWidget.config;
        }
        if ((i12 & 2) != 0) {
            list = selectWidget.values;
        }
        if ((i12 & 4) != 0) {
            str = selectWidget.widgetName;
        }
        return selectWidget.copy(config, list, str);
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
    public final SelectWidget copy(@k Config config, @l List<Field> values, @l String widgetName) {
        return new SelectWidget(config, values, widgetName);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectWidget)) {
            return false;
        }
        SelectWidget selectWidget = (SelectWidget) other;
        return L.f(this.config, selectWidget.config) && L.f(this.values, selectWidget.values) && L.f(this.widgetName, selectWidget.widgetName);
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
        StringBuilder sb2 = new StringBuilder("SelectWidget(config=");
        sb2.append(this.config);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", widgetName=");
        return C22026a.c(sb2, this.widgetName, ')');
    }
}
