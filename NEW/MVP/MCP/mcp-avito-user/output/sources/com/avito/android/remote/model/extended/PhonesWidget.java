package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Widgets.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/extended/PhonesWidget;", "Lcom/avito/android/remote/model/extended/ExtendedSettingsWidget;", Navigation.CONFIG, "Lcom/avito/android/remote/model/extended/PhonesWidget$Config;", LocalPublishState.FIELDS, "", "Lcom/avito/android/remote/model/extended/PhonesWidget$Field;", "widgetName", "", "(Lcom/avito/android/remote/model/extended/PhonesWidget$Config;Ljava/util/List;Ljava/lang/String;)V", "getConfig", "()Lcom/avito/android/remote/model/extended/PhonesWidget$Config;", "getFields", "()Ljava/util/List;", "getWidgetName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Config", "Field", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PhonesWidget implements ExtendedSettingsWidget {

    @c(Navigation.CONFIG)
    @k
    private final Config config;

    @c(LocalPublishState.FIELDS)
    @l
    private final List<Field> fields;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\"B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/extended/PhonesWidget$Config;", "", "maxCount", "", "title", "", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "addButton", "Lcom/avito/android/remote/model/DeeplinkAction;", "emptyState", "Lcom/avito/android/remote/model/extended/PhonesWidget$Config$EmptyState;", "(ILjava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/DeeplinkAction;Lcom/avito/android/remote/model/extended/PhonesWidget$Config$EmptyState;)V", "getAddButton", "()Lcom/avito/android/remote/model/DeeplinkAction;", "getEmptyState", "()Lcom/avito/android/remote/model/extended/PhonesWidget$Config$EmptyState;", "getMaxCount", "()I", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "EmptyState", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config {

        @c("addButton")
        @l
        private final DeeplinkAction addButton;

        @c("emptyState")
        @k
        private final EmptyState emptyState;

        @c("maxCount")
        private final int maxCount;

        @c("subtitle")
        @l
        private final AttributedText subtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/extended/PhonesWidget$Config$EmptyState;", "", "title", "", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "addButton", "Lcom/avito/android/remote/model/DeeplinkAction;", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/DeeplinkAction;)V", "getAddButton", "()Lcom/avito/android/remote/model/DeeplinkAction;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class EmptyState {

            @c("addButton")
            @l
            private final DeeplinkAction addButton;

            @c("subtitle")
            @k
            private final AttributedText subtitle;

            @c("title")
            @k
            private final String title;

            public EmptyState(@k String str, @k AttributedText attributedText, @l DeeplinkAction deeplinkAction) {
                this.title = str;
                this.subtitle = attributedText;
                this.addButton = deeplinkAction;
            }

            public static /* synthetic */ EmptyState copy$default(EmptyState emptyState, String str, AttributedText attributedText, DeeplinkAction deeplinkAction, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = emptyState.title;
                }
                if ((i12 & 2) != 0) {
                    attributedText = emptyState.subtitle;
                }
                if ((i12 & 4) != 0) {
                    deeplinkAction = emptyState.addButton;
                }
                return emptyState.copy(str, attributedText, deeplinkAction);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final AttributedText getSubtitle() {
                return this.subtitle;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final DeeplinkAction getAddButton() {
                return this.addButton;
            }

            @k
            public final EmptyState copy(@k String title, @k AttributedText subtitle, @l DeeplinkAction addButton) {
                return new EmptyState(title, subtitle, addButton);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EmptyState)) {
                    return false;
                }
                EmptyState emptyState = (EmptyState) other;
                return L.f(this.title, emptyState.title) && L.f(this.subtitle, emptyState.subtitle) && L.f(this.addButton, emptyState.addButton);
            }

            @l
            public final DeeplinkAction getAddButton() {
                return this.addButton;
            }

            @k
            public final AttributedText getSubtitle() {
                return this.subtitle;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iB2 = a.b(this.title.hashCode() * 31, 31, this.subtitle);
                DeeplinkAction deeplinkAction = this.addButton;
                return iB2 + (deeplinkAction == null ? 0 : deeplinkAction.hashCode());
            }

            @k
            public String toString() {
                return "EmptyState(title=" + this.title + ", subtitle=" + this.subtitle + ", addButton=" + this.addButton + ')';
            }
        }

        public Config(int i12, @k String str, @l AttributedText attributedText, @l DeeplinkAction deeplinkAction, @k EmptyState emptyState) {
            this.maxCount = i12;
            this.title = str;
            this.subtitle = attributedText;
            this.addButton = deeplinkAction;
            this.emptyState = emptyState;
        }

        public static /* synthetic */ Config copy$default(Config config, int i12, String str, AttributedText attributedText, DeeplinkAction deeplinkAction, EmptyState emptyState, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = config.maxCount;
            }
            if ((i13 & 2) != 0) {
                str = config.title;
            }
            String str2 = str;
            if ((i13 & 4) != 0) {
                attributedText = config.subtitle;
            }
            AttributedText attributedText2 = attributedText;
            if ((i13 & 8) != 0) {
                deeplinkAction = config.addButton;
            }
            DeeplinkAction deeplinkAction2 = deeplinkAction;
            if ((i13 & 16) != 0) {
                emptyState = config.emptyState;
            }
            return config.copy(i12, str2, attributedText2, deeplinkAction2, emptyState);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMaxCount() {
            return this.maxCount;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final DeeplinkAction getAddButton() {
            return this.addButton;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        @k
        public final Config copy(int maxCount, @k String title, @l AttributedText subtitle, @l DeeplinkAction addButton, @k EmptyState emptyState) {
            return new Config(maxCount, title, subtitle, addButton, emptyState);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return this.maxCount == config.maxCount && L.f(this.title, config.title) && L.f(this.subtitle, config.subtitle) && L.f(this.addButton, config.addButton) && L.f(this.emptyState, config.emptyState);
        }

        @l
        public final DeeplinkAction getAddButton() {
            return this.addButton;
        }

        @k
        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        public final int getMaxCount() {
            return this.maxCount;
        }

        @l
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iD2 = H.d(Integer.hashCode(this.maxCount) * 31, 31, this.title);
            AttributedText attributedText = this.subtitle;
            int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            DeeplinkAction deeplinkAction = this.addButton;
            return this.emptyState.hashCode() + ((iHashCode + (deeplinkAction != null ? deeplinkAction.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            return "Config(maxCount=" + this.maxCount + ", title=" + this.title + ", subtitle=" + this.subtitle + ", addButton=" + this.addButton + ", emptyState=" + this.emptyState + ')';
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/extended/PhonesWidget$Field;", "", "name", "", "values", "", "Lcom/avito/android/remote/model/extended/PhonesWidget$Field$FieldValue;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "FieldValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Field {

        @c("name")
        @k
        private final String name;

        @c("values")
        @l
        private final List<FieldValue> values;

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/extended/PhonesWidget$Field$FieldValue;", "", "valueId", "", "phoneEditValue", "Lcom/avito/android/remote/model/extended/PhoneEditValue;", "status", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/PhoneEditValue;Lcom/avito/android/remote/model/extended/FieldModerationStatus;)V", "getPhoneEditValue", "()Lcom/avito/android/remote/model/extended/PhoneEditValue;", "getStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getValueId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FieldValue {

            @c("value")
            @k
            private final PhoneEditValue phoneEditValue;

            @c("status")
            @l
            private final FieldModerationStatus status;

            @c("valueId")
            @k
            private final String valueId;

            public FieldValue(@k String str, @k PhoneEditValue phoneEditValue, @l FieldModerationStatus fieldModerationStatus) {
                this.valueId = str;
                this.phoneEditValue = phoneEditValue;
                this.status = fieldModerationStatus;
            }

            public static /* synthetic */ FieldValue copy$default(FieldValue fieldValue, String str, PhoneEditValue phoneEditValue, FieldModerationStatus fieldModerationStatus, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = fieldValue.valueId;
                }
                if ((i12 & 2) != 0) {
                    phoneEditValue = fieldValue.phoneEditValue;
                }
                if ((i12 & 4) != 0) {
                    fieldModerationStatus = fieldValue.status;
                }
                return fieldValue.copy(str, phoneEditValue, fieldModerationStatus);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getValueId() {
                return this.valueId;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final PhoneEditValue getPhoneEditValue() {
                return this.phoneEditValue;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final FieldModerationStatus getStatus() {
                return this.status;
            }

            @k
            public final FieldValue copy(@k String valueId, @k PhoneEditValue phoneEditValue, @l FieldModerationStatus status) {
                return new FieldValue(valueId, phoneEditValue, status);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FieldValue)) {
                    return false;
                }
                FieldValue fieldValue = (FieldValue) other;
                return L.f(this.valueId, fieldValue.valueId) && L.f(this.phoneEditValue, fieldValue.phoneEditValue) && L.f(this.status, fieldValue.status);
            }

            @k
            public final PhoneEditValue getPhoneEditValue() {
                return this.phoneEditValue;
            }

            @l
            public final FieldModerationStatus getStatus() {
                return this.status;
            }

            @k
            public final String getValueId() {
                return this.valueId;
            }

            public int hashCode() {
                int iHashCode = (this.phoneEditValue.hashCode() + (this.valueId.hashCode() * 31)) * 31;
                FieldModerationStatus fieldModerationStatus = this.status;
                return iHashCode + (fieldModerationStatus == null ? 0 : fieldModerationStatus.hashCode());
            }

            @k
            public String toString() {
                return "FieldValue(valueId=" + this.valueId + ", phoneEditValue=" + this.phoneEditValue + ", status=" + this.status + ')';
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

    public PhonesWidget(@k Config config, @l List<Field> list, @l String str) {
        this.config = config;
        this.fields = list;
        this.widgetName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhonesWidget copy$default(PhonesWidget phonesWidget, Config config, List list, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            config = phonesWidget.config;
        }
        if ((i12 & 2) != 0) {
            list = phonesWidget.fields;
        }
        if ((i12 & 4) != 0) {
            str = phonesWidget.widgetName;
        }
        return phonesWidget.copy(config, list, str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    @l
    public final List<Field> component2() {
        return this.fields;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @k
    public final PhonesWidget copy(@k Config config, @l List<Field> fields, @l String widgetName) {
        return new PhonesWidget(config, fields, widgetName);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhonesWidget)) {
            return false;
        }
        PhonesWidget phonesWidget = (PhonesWidget) other;
        return L.f(this.config, phonesWidget.config) && L.f(this.fields, phonesWidget.fields) && L.f(this.widgetName, phonesWidget.widgetName);
    }

    @k
    public final Config getConfig() {
        return this.config;
    }

    @l
    public final List<Field> getFields() {
        return this.fields;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int iHashCode = this.config.hashCode() * 31;
        List<Field> list = this.fields;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.widgetName;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PhonesWidget(config=");
        sb2.append(this.config);
        sb2.append(", fields=");
        sb2.append(this.fields);
        sb2.append(", widgetName=");
        return C22026a.c(sb2, this.widgetName, ')');
    }
}
