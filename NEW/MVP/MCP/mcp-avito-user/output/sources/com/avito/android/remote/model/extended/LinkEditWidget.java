package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: Widgets.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0007\u001b\u001c\u001d\u001e\u001f !B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/extended/LinkEditWidget;", "Lcom/avito/android/remote/model/extended/ExtendedSettingsWidget;", Navigation.CONFIG, "Lcom/avito/android/remote/model/extended/LinkEditWidget$Config;", LocalPublishState.FIELDS, "", "Lcom/avito/android/remote/model/extended/LinkEditWidget$Field;", "widgetName", "", "(Lcom/avito/android/remote/model/extended/LinkEditWidget$Config;Ljava/util/List;Ljava/lang/String;)V", "getConfig", "()Lcom/avito/android/remote/model/extended/LinkEditWidget$Config;", "getFields", "()Ljava/util/List;", "getWidgetName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Action", "ActionType", "Config", "EditorConfig", "Field", "FieldValue", "Value", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LinkEditWidget implements ExtendedSettingsWidget {

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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/extended/LinkEditWidget$Action;", "", "title", "", "type", "Lcom/avito/android/remote/model/extended/LinkEditWidget$ActionType;", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/LinkEditWidget$ActionType;)V", "getTitle", "()Ljava/lang/String;", "getType", "()Lcom/avito/android/remote/model/extended/LinkEditWidget$ActionType;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action {

        @c("title")
        @k
        private final String title;

        @c("type")
        @l
        private final ActionType type;

        public Action(@k String str, @l ActionType actionType) {
            this.title = str;
            this.type = actionType;
        }

        public static /* synthetic */ Action copy$default(Action action, String str, ActionType actionType, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = action.title;
            }
            if ((i12 & 2) != 0) {
                actionType = action.type;
            }
            return action.copy(str, actionType);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final ActionType getType() {
            return this.type;
        }

        @k
        public final Action copy(@k String title, @l ActionType type) {
            return new Action(title, type);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return L.f(this.title, action.title) && this.type == action.type;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final ActionType getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            ActionType actionType = this.type;
            return iHashCode + (actionType == null ? 0 : actionType.hashCode());
        }

        @k
        public String toString() {
            return "Action(title=" + this.title + ", type=" + this.type + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/extended/LinkEditWidget$ActionType;", "", "(Ljava/lang/String;I)V", "EDIT", "COPY", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        @c("edit")
        public static final ActionType EDIT = new ActionType("EDIT", 0);

        @c("copy")
        public static final ActionType COPY = new ActionType("COPY", 1);

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{EDIT, COPY};
        }

        static {
            ActionType[] actionTypeArr$values = $values();
            $VALUES = actionTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(actionTypeArr$values);
        }

        private ActionType(String str, int i12) {
        }

        @k
        public static a<ActionType> getEntries() {
            return $ENTRIES;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/extended/LinkEditWidget$Config;", "", "title", "", "actions", "", "Lcom/avito/android/remote/model/extended/LinkEditWidget$Action;", "prefix", "form", "Lcom/avito/android/remote/model/extended/LinkEditWidget$EditorConfig;", "defaultValue", "Lcom/avito/android/remote/model/extended/LinkEditWidget$FieldValue;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/extended/LinkEditWidget$EditorConfig;Lcom/avito/android/remote/model/extended/LinkEditWidget$FieldValue;)V", "getActions", "()Ljava/util/List;", "getDefaultValue", "()Lcom/avito/android/remote/model/extended/LinkEditWidget$FieldValue;", "getForm", "()Lcom/avito/android/remote/model/extended/LinkEditWidget$EditorConfig;", "getPrefix", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config {

        @c("actions")
        @l
        private final List<Action> actions;

        @c("defaultValue")
        @l
        private final FieldValue defaultValue;

        @c("form")
        @l
        private final EditorConfig form;

        @c("prefix")
        @k
        private final String prefix;

        @c("title")
        @k
        private final String title;

        public Config(@k String str, @l List<Action> list, @k String str2, @l EditorConfig editorConfig, @l FieldValue fieldValue) {
            this.title = str;
            this.actions = list;
            this.prefix = str2;
            this.form = editorConfig;
            this.defaultValue = fieldValue;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, List list, String str2, EditorConfig editorConfig, FieldValue fieldValue, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = config.title;
            }
            if ((i12 & 2) != 0) {
                list = config.actions;
            }
            List list2 = list;
            if ((i12 & 4) != 0) {
                str2 = config.prefix;
            }
            String str3 = str2;
            if ((i12 & 8) != 0) {
                editorConfig = config.form;
            }
            EditorConfig editorConfig2 = editorConfig;
            if ((i12 & 16) != 0) {
                fieldValue = config.defaultValue;
            }
            return config.copy(str, list2, str3, editorConfig2, fieldValue);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        public final List<Action> component2() {
            return this.actions;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getPrefix() {
            return this.prefix;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final EditorConfig getForm() {
            return this.form;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final FieldValue getDefaultValue() {
            return this.defaultValue;
        }

        @k
        public final Config copy(@k String title, @l List<Action> actions, @k String prefix, @l EditorConfig form, @l FieldValue defaultValue) {
            return new Config(title, actions, prefix, form, defaultValue);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return L.f(this.title, config.title) && L.f(this.actions, config.actions) && L.f(this.prefix, config.prefix) && L.f(this.form, config.form) && L.f(this.defaultValue, config.defaultValue);
        }

        @l
        public final List<Action> getActions() {
            return this.actions;
        }

        @l
        public final FieldValue getDefaultValue() {
            return this.defaultValue;
        }

        @l
        public final EditorConfig getForm() {
            return this.form;
        }

        @k
        public final String getPrefix() {
            return this.prefix;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            List<Action> list = this.actions;
            int iD2 = H.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.prefix);
            EditorConfig editorConfig = this.form;
            int iHashCode2 = (iD2 + (editorConfig == null ? 0 : editorConfig.hashCode())) * 31;
            FieldValue fieldValue = this.defaultValue;
            return iHashCode2 + (fieldValue != null ? fieldValue.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Config(title=" + this.title + ", actions=" + this.actions + ", prefix=" + this.prefix + ", form=" + this.form + ", defaultValue=" + this.defaultValue + ')';
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\\\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\bHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/extended/LinkEditWidget$EditorConfig;", "", "title", "", "description", "hint", ChannelContext.Item.PLACEHOLDER, "minLengthCount", "", "maxLengthCount", "saveButtonText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getHint", "getMaxLengthCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinLengthCount", "getPlaceholder", "getSaveButtonText", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/avito/android/remote/model/extended/LinkEditWidget$EditorConfig;", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EditorConfig {

        @c("description")
        @k
        private final String description;

        @c("hint")
        @l
        private final String hint;

        @c("maxLengthCount")
        @l
        private final Integer maxLengthCount;

        @c("minLengthCount")
        @l
        private final Integer minLengthCount;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("saveButtonText")
        @k
        private final String saveButtonText;

        @c("title")
        @k
        private final String title;

        public EditorConfig(@k String str, @k String str2, @l String str3, @l String str4, @l Integer num, @l Integer num2, @k String str5) {
            this.title = str;
            this.description = str2;
            this.hint = str3;
            this.placeholder = str4;
            this.minLengthCount = num;
            this.maxLengthCount = num2;
            this.saveButtonText = str5;
        }

        public static /* synthetic */ EditorConfig copy$default(EditorConfig editorConfig, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = editorConfig.title;
            }
            if ((i12 & 2) != 0) {
                str2 = editorConfig.description;
            }
            String str6 = str2;
            if ((i12 & 4) != 0) {
                str3 = editorConfig.hint;
            }
            String str7 = str3;
            if ((i12 & 8) != 0) {
                str4 = editorConfig.placeholder;
            }
            String str8 = str4;
            if ((i12 & 16) != 0) {
                num = editorConfig.minLengthCount;
            }
            Integer num3 = num;
            if ((i12 & 32) != 0) {
                num2 = editorConfig.maxLengthCount;
            }
            Integer num4 = num2;
            if ((i12 & 64) != 0) {
                str5 = editorConfig.saveButtonText;
            }
            return editorConfig.copy(str, str6, str7, str8, num3, num4, str5);
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

        @l
        /* renamed from: component3, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Integer getMinLengthCount() {
            return this.minLengthCount;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Integer getMaxLengthCount() {
            return this.maxLengthCount;
        }

        @k
        /* renamed from: component7, reason: from getter */
        public final String getSaveButtonText() {
            return this.saveButtonText;
        }

        @k
        public final EditorConfig copy(@k String title, @k String description, @l String hint, @l String placeholder, @l Integer minLengthCount, @l Integer maxLengthCount, @k String saveButtonText) {
            return new EditorConfig(title, description, hint, placeholder, minLengthCount, maxLengthCount, saveButtonText);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditorConfig)) {
                return false;
            }
            EditorConfig editorConfig = (EditorConfig) other;
            return L.f(this.title, editorConfig.title) && L.f(this.description, editorConfig.description) && L.f(this.hint, editorConfig.hint) && L.f(this.placeholder, editorConfig.placeholder) && L.f(this.minLengthCount, editorConfig.minLengthCount) && L.f(this.maxLengthCount, editorConfig.maxLengthCount) && L.f(this.saveButtonText, editorConfig.saveButtonText);
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @l
        public final String getHint() {
            return this.hint;
        }

        @l
        public final Integer getMaxLengthCount() {
            return this.maxLengthCount;
        }

        @l
        public final Integer getMinLengthCount() {
            return this.minLengthCount;
        }

        @l
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @k
        public final String getSaveButtonText() {
            return this.saveButtonText;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iD2 = H.d(this.title.hashCode() * 31, 31, this.description);
            String str = this.hint;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.placeholder;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.minLengthCount;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.maxLengthCount;
            return this.saveButtonText.hashCode() + ((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("EditorConfig(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", hint=");
            sb2.append(this.hint);
            sb2.append(", placeholder=");
            sb2.append(this.placeholder);
            sb2.append(", minLengthCount=");
            sb2.append(this.minLengthCount);
            sb2.append(", maxLengthCount=");
            sb2.append(this.maxLengthCount);
            sb2.append(", saveButtonText=");
            return C22026a.c(sb2, this.saveButtonText, ')');
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/extended/LinkEditWidget$Field;", "", "name", "", "values", "", "Lcom/avito/android/remote/model/extended/LinkEditWidget$FieldValue;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Field {

        @c("name")
        @k
        private final String name;

        @c("values")
        @l
        private final List<FieldValue> values;

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

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/extended/LinkEditWidget$FieldValue;", "", "valueId", "", "value", "Lcom/avito/android/remote/model/extended/LinkEditWidget$Value;", "status", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/LinkEditWidget$Value;Lcom/avito/android/remote/model/extended/FieldModerationStatus;)V", "getStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getValue", "()Lcom/avito/android/remote/model/extended/LinkEditWidget$Value;", "getValueId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FieldValue {

        @c("status")
        @k
        private final FieldModerationStatus status;

        @c("value")
        @k
        private final Value value;

        @c("valueId")
        @k
        private final String valueId;

        public FieldValue(@k String str, @k Value value, @k FieldModerationStatus fieldModerationStatus) {
            this.valueId = str;
            this.value = value;
            this.status = fieldModerationStatus;
        }

        public static /* synthetic */ FieldValue copy$default(FieldValue fieldValue, String str, Value value, FieldModerationStatus fieldModerationStatus, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = fieldValue.valueId;
            }
            if ((i12 & 2) != 0) {
                value = fieldValue.value;
            }
            if ((i12 & 4) != 0) {
                fieldModerationStatus = fieldValue.status;
            }
            return fieldValue.copy(str, value, fieldModerationStatus);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getValueId() {
            return this.valueId;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Value getValue() {
            return this.value;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @k
        public final FieldValue copy(@k String valueId, @k Value value, @k FieldModerationStatus status) {
            return new FieldValue(valueId, value, status);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldValue)) {
                return false;
            }
            FieldValue fieldValue = (FieldValue) other;
            return L.f(this.valueId, fieldValue.valueId) && L.f(this.value, fieldValue.value) && L.f(this.status, fieldValue.status);
        }

        @k
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @k
        public final Value getValue() {
            return this.value;
        }

        @k
        public final String getValueId() {
            return this.valueId;
        }

        public int hashCode() {
            return this.status.hashCode() + ((this.value.hashCode() + (this.valueId.hashCode() * 31)) * 31);
        }

        @k
        public String toString() {
            return "FieldValue(valueId=" + this.valueId + ", value=" + this.value + ", status=" + this.status + ')';
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/extended/LinkEditWidget$Value;", "", "personalLink", "", "prefixedPersonalLink", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "urlToCopy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getPersonalLink", "()Ljava/lang/String;", "getPrefixedPersonalLink", "getUrlToCopy", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Value {

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @c("personalLink")
        @k
        private final String personalLink;

        @c("prefixedPersonalLink")
        @k
        private final String prefixedPersonalLink;

        @c("urlToCopy")
        @l
        private final String urlToCopy;

        public Value(@k String str, @k String str2, @l DeepLink deepLink, @l String str3) {
            this.personalLink = str;
            this.prefixedPersonalLink = str2;
            this.deeplink = deepLink;
            this.urlToCopy = str3;
        }

        public static /* synthetic */ Value copy$default(Value value, String str, String str2, DeepLink deepLink, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = value.personalLink;
            }
            if ((i12 & 2) != 0) {
                str2 = value.prefixedPersonalLink;
            }
            if ((i12 & 4) != 0) {
                deepLink = value.deeplink;
            }
            if ((i12 & 8) != 0) {
                str3 = value.urlToCopy;
            }
            return value.copy(str, str2, deepLink, str3);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getPersonalLink() {
            return this.personalLink;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getPrefixedPersonalLink() {
            return this.prefixedPersonalLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getUrlToCopy() {
            return this.urlToCopy;
        }

        @k
        public final Value copy(@k String personalLink, @k String prefixedPersonalLink, @l DeepLink deeplink, @l String urlToCopy) {
            return new Value(personalLink, prefixedPersonalLink, deeplink, urlToCopy);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return L.f(this.personalLink, value.personalLink) && L.f(this.prefixedPersonalLink, value.prefixedPersonalLink) && L.f(this.deeplink, value.deeplink) && L.f(this.urlToCopy, value.urlToCopy);
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final String getPersonalLink() {
            return this.personalLink;
        }

        @k
        public final String getPrefixedPersonalLink() {
            return this.prefixedPersonalLink;
        }

        @l
        public final String getUrlToCopy() {
            return this.urlToCopy;
        }

        public int hashCode() {
            int iD2 = H.d(this.personalLink.hashCode() * 31, 31, this.prefixedPersonalLink);
            DeepLink deepLink = this.deeplink;
            int iHashCode = (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            String str = this.urlToCopy;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Value(personalLink=");
            sb2.append(this.personalLink);
            sb2.append(", prefixedPersonalLink=");
            sb2.append(this.prefixedPersonalLink);
            sb2.append(", deeplink=");
            sb2.append(this.deeplink);
            sb2.append(", urlToCopy=");
            return C22026a.c(sb2, this.urlToCopy, ')');
        }
    }

    public LinkEditWidget(@k Config config, @l List<Field> list, @l String str) {
        this.config = config;
        this.fields = list;
        this.widgetName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkEditWidget copy$default(LinkEditWidget linkEditWidget, Config config, List list, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            config = linkEditWidget.config;
        }
        if ((i12 & 2) != 0) {
            list = linkEditWidget.fields;
        }
        if ((i12 & 4) != 0) {
            str = linkEditWidget.widgetName;
        }
        return linkEditWidget.copy(config, list, str);
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
    public final LinkEditWidget copy(@k Config config, @l List<Field> fields, @l String widgetName) {
        return new LinkEditWidget(config, fields, widgetName);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkEditWidget)) {
            return false;
        }
        LinkEditWidget linkEditWidget = (LinkEditWidget) other;
        return L.f(this.config, linkEditWidget.config) && L.f(this.fields, linkEditWidget.fields) && L.f(this.widgetName, linkEditWidget.widgetName);
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
        StringBuilder sb2 = new StringBuilder("LinkEditWidget(config=");
        sb2.append(this.config);
        sb2.append(", fields=");
        sb2.append(this.fields);
        sb2.append(", widgetName=");
        return C22026a.c(sb2, this.widgetName, ')');
    }
}
