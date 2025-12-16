package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.component.file_uploader.ValidationRule;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Widgets.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/extended/GalleryWidget;", "Lcom/avito/android/remote/model/extended/ExtendedSettingsWidget;", Navigation.CONFIG, "Lcom/avito/android/remote/model/extended/GalleryWidget$Config;", LocalPublishState.FIELDS, "", "Lcom/avito/android/remote/model/extended/GalleryWidget$Field;", "widgetName", "", "(Lcom/avito/android/remote/model/extended/GalleryWidget$Config;Ljava/util/List;Ljava/lang/String;)V", "getConfig", "()Lcom/avito/android/remote/model/extended/GalleryWidget$Config;", "getFields", "()Ljava/util/List;", "getWidgetName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Config", "Field", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GalleryWidget implements ExtendedSettingsWidget {

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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/extended/GalleryWidget$Config;", "", "title", "", ChannelContext.Item.PLACEHOLDER, ValidationRule.MAX_FILES_COUNT_RULE, "", "maxFileSizeMB", "", "(Ljava/lang/String;Ljava/lang/String;IF)V", "getMaxFileSizeMB", "()F", "getMaxFilesCount", "()I", "getPlaceholder", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config {

        @c("maxFileSizeMB")
        private final float maxFileSizeMB;

        @c(ValidationRule.MAX_FILES_COUNT_RULE)
        private final int maxFilesCount;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("title")
        @k
        private final String title;

        public Config(@k String str, @l String str2, int i12, float f12) {
            this.title = str;
            this.placeholder = str2;
            this.maxFilesCount = i12;
            this.maxFileSizeMB = f12;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, String str2, int i12, float f12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = config.title;
            }
            if ((i13 & 2) != 0) {
                str2 = config.placeholder;
            }
            if ((i13 & 4) != 0) {
                i12 = config.maxFilesCount;
            }
            if ((i13 & 8) != 0) {
                f12 = config.maxFileSizeMB;
            }
            return config.copy(str, str2, i12, f12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxFilesCount() {
            return this.maxFilesCount;
        }

        /* renamed from: component4, reason: from getter */
        public final float getMaxFileSizeMB() {
            return this.maxFileSizeMB;
        }

        @k
        public final Config copy(@k String title, @l String placeholder, int maxFilesCount, float maxFileSizeMB) {
            return new Config(title, placeholder, maxFilesCount, maxFileSizeMB);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return L.f(this.title, config.title) && L.f(this.placeholder, config.placeholder) && this.maxFilesCount == config.maxFilesCount && Float.compare(this.maxFileSizeMB, config.maxFileSizeMB) == 0;
        }

        public final float getMaxFileSizeMB() {
            return this.maxFileSizeMB;
        }

        public final int getMaxFilesCount() {
            return this.maxFilesCount;
        }

        @l
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.placeholder;
            return Float.hashCode(this.maxFileSizeMB) + r.e(this.maxFilesCount, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Config(title=");
            sb2.append(this.title);
            sb2.append(", placeholder=");
            sb2.append(this.placeholder);
            sb2.append(", maxFilesCount=");
            sb2.append(this.maxFilesCount);
            sb2.append(", maxFileSizeMB=");
            return r.k(')', this.maxFileSizeMB, sb2);
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/extended/GalleryWidget$Field;", "", "name", "", "values", "", "Lcom/avito/android/remote/model/extended/ImageFieldValue;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Field {

        @c("name")
        @k
        private final String name;

        @c("values")
        @l
        private final List<ImageFieldValue> values;

        public Field(@k String str, @l List<ImageFieldValue> list) {
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
        public final List<ImageFieldValue> component2() {
            return this.values;
        }

        @k
        public final Field copy(@k String name, @l List<ImageFieldValue> values) {
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
        public final List<ImageFieldValue> getValues() {
            return this.values;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            List<ImageFieldValue> list = this.values;
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

    public GalleryWidget(@k Config config, @l List<Field> list, @l String str) {
        this.config = config;
        this.fields = list;
        this.widgetName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GalleryWidget copy$default(GalleryWidget galleryWidget, Config config, List list, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            config = galleryWidget.config;
        }
        if ((i12 & 2) != 0) {
            list = galleryWidget.fields;
        }
        if ((i12 & 4) != 0) {
            str = galleryWidget.widgetName;
        }
        return galleryWidget.copy(config, list, str);
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
    public final GalleryWidget copy(@k Config config, @l List<Field> fields, @l String widgetName) {
        return new GalleryWidget(config, fields, widgetName);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryWidget)) {
            return false;
        }
        GalleryWidget galleryWidget = (GalleryWidget) other;
        return L.f(this.config, galleryWidget.config) && L.f(this.fields, galleryWidget.fields) && L.f(this.widgetName, galleryWidget.widgetName);
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
        StringBuilder sb2 = new StringBuilder("GalleryWidget(config=");
        sb2.append(this.config);
        sb2.append(", fields=");
        sb2.append(this.fields);
        sb2.append(", widgetName=");
        return C22026a.c(sb2, this.widgetName, ')');
    }
}
