package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectionsWidget.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0005\u001b\u001c\u001d\u001e\u001fB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/extended/SelectionsWidget;", "Lcom/avito/android/remote/model/extended/ExtendedSettingsWidget;", Navigation.CONFIG, "Lcom/avito/android/remote/model/extended/SelectionsWidget$Config;", LocalPublishState.FIELDS, "", "Lcom/avito/android/remote/model/extended/SelectionsWidget$Field;", "widgetName", "", "(Lcom/avito/android/remote/model/extended/SelectionsWidget$Config;Ljava/util/List;Ljava/lang/String;)V", "getConfig", "()Lcom/avito/android/remote/model/extended/SelectionsWidget$Config;", "getFields", "()Ljava/util/List;", "getWidgetName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Config", "Field", "SelectionError", "SelectionFieldValue", "SelectionValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SelectionsWidget implements ExtendedSettingsWidget {

    @c(Navigation.CONFIG)
    @k
    private final Config config;

    @c(LocalPublishState.FIELDS)
    @l
    private final List<Field> fields;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: SelectionsWidget.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003Jt\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\tHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000f¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/extended/SelectionsWidget$Config;", "", "title", "", "description", "createNewText", "form", "fromPage", "maxItemSelectionPageSize", "", "maxItemSelections", "minItemsInSelection", "maxItemsInSelection", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;III)V", "getCreateNewText", "()Ljava/lang/String;", "getDescription", "getForm", "getFromPage", "getMaxItemSelectionPageSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxItemSelections", "()I", "getMaxItemsInSelection", "getMinItemsInSelection", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;III)Lcom/avito/android/remote/model/extended/SelectionsWidget$Config;", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config {

        @c("createNewText")
        @l
        private final String createNewText;

        @c("description")
        @l
        private final String description;

        @c("form")
        @l
        private final String form;

        @c("fromPage")
        @l
        private final String fromPage;

        @c("maxItemSelectionPageSize")
        @l
        private final Integer maxItemSelectionPageSize;

        @c("maxItemSelections")
        private final int maxItemSelections;

        @c("maxItemsInSelection")
        private final int maxItemsInSelection;

        @c("minItemsInSelection")
        private final int minItemsInSelection;

        @c("title")
        @l
        private final String title;

        public Config(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l Integer num, int i12, int i13, int i14) {
            this.title = str;
            this.description = str2;
            this.createNewText = str3;
            this.form = str4;
            this.fromPage = str5;
            this.maxItemSelectionPageSize = num;
            this.maxItemSelections = i12;
            this.minItemsInSelection = i13;
            this.maxItemsInSelection = i14;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getCreateNewText() {
            return this.createNewText;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getForm() {
            return this.form;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getFromPage() {
            return this.fromPage;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Integer getMaxItemSelectionPageSize() {
            return this.maxItemSelectionPageSize;
        }

        /* renamed from: component7, reason: from getter */
        public final int getMaxItemSelections() {
            return this.maxItemSelections;
        }

        /* renamed from: component8, reason: from getter */
        public final int getMinItemsInSelection() {
            return this.minItemsInSelection;
        }

        /* renamed from: component9, reason: from getter */
        public final int getMaxItemsInSelection() {
            return this.maxItemsInSelection;
        }

        @k
        public final Config copy(@l String title, @l String description, @l String createNewText, @l String form, @l String fromPage, @l Integer maxItemSelectionPageSize, int maxItemSelections, int minItemsInSelection, int maxItemsInSelection) {
            return new Config(title, description, createNewText, form, fromPage, maxItemSelectionPageSize, maxItemSelections, minItemsInSelection, maxItemsInSelection);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return L.f(this.title, config.title) && L.f(this.description, config.description) && L.f(this.createNewText, config.createNewText) && L.f(this.form, config.form) && L.f(this.fromPage, config.fromPage) && L.f(this.maxItemSelectionPageSize, config.maxItemSelectionPageSize) && this.maxItemSelections == config.maxItemSelections && this.minItemsInSelection == config.minItemsInSelection && this.maxItemsInSelection == config.maxItemsInSelection;
        }

        @l
        public final String getCreateNewText() {
            return this.createNewText;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final String getForm() {
            return this.form;
        }

        @l
        public final String getFromPage() {
            return this.fromPage;
        }

        @l
        public final Integer getMaxItemSelectionPageSize() {
            return this.maxItemSelectionPageSize;
        }

        public final int getMaxItemSelections() {
            return this.maxItemSelections;
        }

        public final int getMaxItemsInSelection() {
            return this.maxItemsInSelection;
        }

        public final int getMinItemsInSelection() {
            return this.minItemsInSelection;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.description;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.createNewText;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.form;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.fromPage;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.maxItemSelectionPageSize;
            return Integer.hashCode(this.maxItemsInSelection) + r.e(this.minItemsInSelection, r.e(this.maxItemSelections, (iHashCode5 + (num != null ? num.hashCode() : 0)) * 31, 31), 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Config(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", createNewText=");
            sb2.append(this.createNewText);
            sb2.append(", form=");
            sb2.append(this.form);
            sb2.append(", fromPage=");
            sb2.append(this.fromPage);
            sb2.append(", maxItemSelectionPageSize=");
            sb2.append(this.maxItemSelectionPageSize);
            sb2.append(", maxItemSelections=");
            sb2.append(this.maxItemSelections);
            sb2.append(", minItemsInSelection=");
            sb2.append(this.minItemsInSelection);
            sb2.append(", maxItemsInSelection=");
            return r.t(sb2, this.maxItemsInSelection, ')');
        }
    }

    /* compiled from: SelectionsWidget.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/extended/SelectionsWidget$Field;", "", "name", "", "values", "", "Lcom/avito/android/remote/model/extended/SelectionsWidget$SelectionFieldValue;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Field {

        @c("name")
        @k
        private final String name;

        @c("values")
        @l
        private final List<SelectionFieldValue> values;

        public Field(@k String str, @l List<SelectionFieldValue> list) {
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
        public final List<SelectionFieldValue> component2() {
            return this.values;
        }

        @k
        public final Field copy(@k String name, @l List<SelectionFieldValue> values) {
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
        public final List<SelectionFieldValue> getValues() {
            return this.values;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            List<SelectionFieldValue> list = this.values;
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

    /* compiled from: SelectionsWidget.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/extended/SelectionsWidget$SelectionError;", "", "title", "", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectionError {

        @c("subtitle")
        @l
        private final AttributedText subtitle;

        @c("title")
        @l
        private final String title;

        public SelectionError(@l String str, @l AttributedText attributedText) {
            this.title = str;
            this.subtitle = attributedText;
        }

        public static /* synthetic */ SelectionError copy$default(SelectionError selectionError, String str, AttributedText attributedText, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = selectionError.title;
            }
            if ((i12 & 2) != 0) {
                attributedText = selectionError.subtitle;
            }
            return selectionError.copy(str, attributedText);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @k
        public final SelectionError copy(@l String title, @l AttributedText subtitle) {
            return new SelectionError(title, subtitle);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionError)) {
                return false;
            }
            SelectionError selectionError = (SelectionError) other;
            return L.f(this.title, selectionError.title) && L.f(this.subtitle, selectionError.subtitle);
        }

        @l
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AttributedText attributedText = this.subtitle;
            return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SelectionError(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            return a.w(sb2, this.subtitle, ')');
        }
    }

    /* compiled from: SelectionsWidget.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/extended/SelectionsWidget$SelectionFieldValue;", "", "status", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "value", "Lcom/avito/android/remote/model/extended/SelectionsWidget$SelectionValue;", "valueId", "", "(Lcom/avito/android/remote/model/extended/FieldModerationStatus;Lcom/avito/android/remote/model/extended/SelectionsWidget$SelectionValue;Ljava/lang/String;)V", "getStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getValue", "()Lcom/avito/android/remote/model/extended/SelectionsWidget$SelectionValue;", "getValueId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectionFieldValue {

        @c("status")
        @l
        private final FieldModerationStatus status;

        @c("value")
        @l
        private final SelectionValue value;

        @c("valueId")
        @k
        private final String valueId;

        public SelectionFieldValue(@l FieldModerationStatus fieldModerationStatus, @l SelectionValue selectionValue, @k String str) {
            this.status = fieldModerationStatus;
            this.value = selectionValue;
            this.valueId = str;
        }

        public static /* synthetic */ SelectionFieldValue copy$default(SelectionFieldValue selectionFieldValue, FieldModerationStatus fieldModerationStatus, SelectionValue selectionValue, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                fieldModerationStatus = selectionFieldValue.status;
            }
            if ((i12 & 2) != 0) {
                selectionValue = selectionFieldValue.value;
            }
            if ((i12 & 4) != 0) {
                str = selectionFieldValue.valueId;
            }
            return selectionFieldValue.copy(fieldModerationStatus, selectionValue, str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final SelectionValue getValue() {
            return this.value;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getValueId() {
            return this.valueId;
        }

        @k
        public final SelectionFieldValue copy(@l FieldModerationStatus status, @l SelectionValue value, @k String valueId) {
            return new SelectionFieldValue(status, value, valueId);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionFieldValue)) {
                return false;
            }
            SelectionFieldValue selectionFieldValue = (SelectionFieldValue) other;
            return L.f(this.status, selectionFieldValue.status) && L.f(this.value, selectionFieldValue.value) && L.f(this.valueId, selectionFieldValue.valueId);
        }

        @l
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @l
        public final SelectionValue getValue() {
            return this.value;
        }

        @k
        public final String getValueId() {
            return this.valueId;
        }

        public int hashCode() {
            FieldModerationStatus fieldModerationStatus = this.status;
            int iHashCode = (fieldModerationStatus == null ? 0 : fieldModerationStatus.hashCode()) * 31;
            SelectionValue selectionValue = this.value;
            return this.valueId.hashCode() + ((iHashCode + (selectionValue != null ? selectionValue.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SelectionFieldValue(status=");
            sb2.append(this.status);
            sb2.append(", value=");
            sb2.append(this.value);
            sb2.append(", valueId=");
            return C22026a.c(sb2, this.valueId, ')');
        }
    }

    /* compiled from: SelectionsWidget.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0080\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\n\u0010\u001cR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001e\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/extended/SelectionsWidget$SelectionValue;", "", "itemListId", "", "name", "", "description", "shareLink", "viewDeeplink", "Lcom/avito/android/deep_linking/links/DeepLink;", "isPublic", "", "coverImageId", "images", "", "Lcom/avito/android/remote/model/Image;", "error", "Lcom/avito/android/remote/model/extended/SelectionsWidget$SelectionError;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/util/List;Lcom/avito/android/remote/model/extended/SelectionsWidget$SelectionError;)V", "getCoverImageId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDescription", "()Ljava/lang/String;", "getError", "()Lcom/avito/android/remote/model/extended/SelectionsWidget$SelectionError;", "getImages", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getItemListId", "getName", "getShareLink", "getViewDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/util/List;Lcom/avito/android/remote/model/extended/SelectionsWidget$SelectionError;)Lcom/avito/android/remote/model/extended/SelectionsWidget$SelectionValue;", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectionValue {

        @c("coverImageId")
        @l
        private final Long coverImageId;

        @c("description")
        @l
        private final String description;

        @c("error")
        @l
        private final SelectionError error;

        @c("images")
        @l
        private final List<Image> images;

        @c("isPublic")
        @l
        private final Boolean isPublic;

        @c("itemListId")
        @l
        private final Long itemListId;

        @c("name")
        @l
        private final String name;

        @c("shareLink")
        @l
        private final String shareLink;

        @c("viewDeeplink")
        @l
        private final DeepLink viewDeeplink;

        public SelectionValue(@l Long l12, @l String str, @l String str2, @l String str3, @l DeepLink deepLink, @l Boolean bool, @l Long l13, @l List<Image> list, @l SelectionError selectionError) {
            this.itemListId = l12;
            this.name = str;
            this.description = str2;
            this.shareLink = str3;
            this.viewDeeplink = deepLink;
            this.isPublic = bool;
            this.coverImageId = l13;
            this.images = list;
            this.error = selectionError;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Long getItemListId() {
            return this.itemListId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getShareLink() {
            return this.shareLink;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final DeepLink getViewDeeplink() {
            return this.viewDeeplink;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Boolean getIsPublic() {
            return this.isPublic;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Long getCoverImageId() {
            return this.coverImageId;
        }

        @l
        public final List<Image> component8() {
            return this.images;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final SelectionError getError() {
            return this.error;
        }

        @k
        public final SelectionValue copy(@l Long itemListId, @l String name, @l String description, @l String shareLink, @l DeepLink viewDeeplink, @l Boolean isPublic, @l Long coverImageId, @l List<Image> images, @l SelectionError error) {
            return new SelectionValue(itemListId, name, description, shareLink, viewDeeplink, isPublic, coverImageId, images, error);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionValue)) {
                return false;
            }
            SelectionValue selectionValue = (SelectionValue) other;
            return L.f(this.itemListId, selectionValue.itemListId) && L.f(this.name, selectionValue.name) && L.f(this.description, selectionValue.description) && L.f(this.shareLink, selectionValue.shareLink) && L.f(this.viewDeeplink, selectionValue.viewDeeplink) && L.f(this.isPublic, selectionValue.isPublic) && L.f(this.coverImageId, selectionValue.coverImageId) && L.f(this.images, selectionValue.images) && L.f(this.error, selectionValue.error);
        }

        @l
        public final Long getCoverImageId() {
            return this.coverImageId;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final SelectionError getError() {
            return this.error;
        }

        @l
        public final List<Image> getImages() {
            return this.images;
        }

        @l
        public final Long getItemListId() {
            return this.itemListId;
        }

        @l
        public final String getName() {
            return this.name;
        }

        @l
        public final String getShareLink() {
            return this.shareLink;
        }

        @l
        public final DeepLink getViewDeeplink() {
            return this.viewDeeplink;
        }

        public int hashCode() {
            Long l12 = this.itemListId;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            String str = this.name;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.shareLink;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            DeepLink deepLink = this.viewDeeplink;
            int iHashCode5 = (iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool = this.isPublic;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            Long l13 = this.coverImageId;
            int iHashCode7 = (iHashCode6 + (l13 == null ? 0 : l13.hashCode())) * 31;
            List<Image> list = this.images;
            int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            SelectionError selectionError = this.error;
            return iHashCode8 + (selectionError != null ? selectionError.hashCode() : 0);
        }

        @l
        public final Boolean isPublic() {
            return this.isPublic;
        }

        @k
        public String toString() {
            return "SelectionValue(itemListId=" + this.itemListId + ", name=" + this.name + ", description=" + this.description + ", shareLink=" + this.shareLink + ", viewDeeplink=" + this.viewDeeplink + ", isPublic=" + this.isPublic + ", coverImageId=" + this.coverImageId + ", images=" + this.images + ", error=" + this.error + ')';
        }
    }

    public SelectionsWidget(@k Config config, @l List<Field> list, @l String str) {
        this.config = config;
        this.fields = list;
        this.widgetName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectionsWidget copy$default(SelectionsWidget selectionsWidget, Config config, List list, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            config = selectionsWidget.config;
        }
        if ((i12 & 2) != 0) {
            list = selectionsWidget.fields;
        }
        if ((i12 & 4) != 0) {
            str = selectionsWidget.widgetName;
        }
        return selectionsWidget.copy(config, list, str);
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
    public final SelectionsWidget copy(@k Config config, @l List<Field> fields, @l String widgetName) {
        return new SelectionsWidget(config, fields, widgetName);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionsWidget)) {
            return false;
        }
        SelectionsWidget selectionsWidget = (SelectionsWidget) other;
        return L.f(this.config, selectionsWidget.config) && L.f(this.fields, selectionsWidget.fields) && L.f(this.widgetName, selectionsWidget.widgetName);
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
        StringBuilder sb2 = new StringBuilder("SelectionsWidget(config=");
        sb2.append(this.config);
        sb2.append(", fields=");
        sb2.append(this.fields);
        sb2.append(", widgetName=");
        return C22026a.c(sb2, this.widgetName, ')');
    }
}
