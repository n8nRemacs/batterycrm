package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.file_uploader.ValidationRule;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import com.huawei.hms.adapter.internal.CommonCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Widgets.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/extended/PremiumBannerWidget;", "Lcom/avito/android/remote/model/extended/ExtendedSettingsWidget;", Navigation.CONFIG, "Lcom/avito/android/remote/model/extended/PremiumBannerWidget$Config;", LocalPublishState.FIELDS, "", "Lcom/avito/android/remote/model/extended/PremiumBannerWidget$Field;", "widgetName", "", "(Lcom/avito/android/remote/model/extended/PremiumBannerWidget$Config;Ljava/util/List;Ljava/lang/String;)V", "getConfig", "()Lcom/avito/android/remote/model/extended/PremiumBannerWidget$Config;", "getFields", "()Ljava/util/List;", "getWidgetName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Config", "Field", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PremiumBannerWidget implements ExtendedSettingsWidget {

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
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002%&B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JG\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/extended/PremiumBannerWidget$Config;", "", "title", "", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "filledSubtitle", ValidationRule.MAX_FILES_COUNT_RULE, "", "sizeExceededDialog", "Lcom/avito/android/remote/model/extended/PremiumBannerWidget$Config$Dialog;", CommonCode.MapKey.HAS_RESOLUTION, "Lcom/avito/android/remote/model/extended/PremiumBannerWidget$Config$Resolution;", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;ILcom/avito/android/remote/model/extended/PremiumBannerWidget$Config$Dialog;Lcom/avito/android/remote/model/extended/PremiumBannerWidget$Config$Resolution;)V", "getFilledSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getMaxFilesCount", "()I", "getResolution", "()Lcom/avito/android/remote/model/extended/PremiumBannerWidget$Config$Resolution;", "getSizeExceededDialog", "()Lcom/avito/android/remote/model/extended/PremiumBannerWidget$Config$Dialog;", "getSubtitle", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "Dialog", "Resolution", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config {

        @c("filledSubtitle")
        @l
        private final AttributedText filledSubtitle;

        @c(ValidationRule.MAX_FILES_COUNT_RULE)
        private final int maxFilesCount;

        @c(CommonCode.MapKey.HAS_RESOLUTION)
        @k
        private final Resolution resolution;

        @c("sizeExceededDialog")
        @k
        private final Dialog sizeExceededDialog;

        @c("subtitle")
        @k
        private final AttributedText subtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/extended/PremiumBannerWidget$Config$Dialog;", "", "title", "", "subtitle", "submitButtonTitle", "cancelButtonTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCancelButtonTitle", "()Ljava/lang/String;", "getSubmitButtonTitle", "getSubtitle", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Dialog {

            @c("cancelButtonTitle")
            @l
            private final String cancelButtonTitle;

            @c("submitButtonTitle")
            @l
            private final String submitButtonTitle;

            @c("subtitle")
            @k
            private final String subtitle;

            @c("title")
            @k
            private final String title;

            public Dialog(@k String str, @k String str2, @l String str3, @l String str4) {
                this.title = str;
                this.subtitle = str2;
                this.submitButtonTitle = str3;
                this.cancelButtonTitle = str4;
            }

            public static /* synthetic */ Dialog copy$default(Dialog dialog, String str, String str2, String str3, String str4, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = dialog.title;
                }
                if ((i12 & 2) != 0) {
                    str2 = dialog.subtitle;
                }
                if ((i12 & 4) != 0) {
                    str3 = dialog.submitButtonTitle;
                }
                if ((i12 & 8) != 0) {
                    str4 = dialog.cancelButtonTitle;
                }
                return dialog.copy(str, str2, str3, str4);
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

            @l
            /* renamed from: component3, reason: from getter */
            public final String getSubmitButtonTitle() {
                return this.submitButtonTitle;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final String getCancelButtonTitle() {
                return this.cancelButtonTitle;
            }

            @k
            public final Dialog copy(@k String title, @k String subtitle, @l String submitButtonTitle, @l String cancelButtonTitle) {
                return new Dialog(title, subtitle, submitButtonTitle, cancelButtonTitle);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) other;
                return L.f(this.title, dialog.title) && L.f(this.subtitle, dialog.subtitle) && L.f(this.submitButtonTitle, dialog.submitButtonTitle) && L.f(this.cancelButtonTitle, dialog.cancelButtonTitle);
            }

            @l
            public final String getCancelButtonTitle() {
                return this.cancelButtonTitle;
            }

            @l
            public final String getSubmitButtonTitle() {
                return this.submitButtonTitle;
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
                int iD2 = H.d(this.title.hashCode() * 31, 31, this.subtitle);
                String str = this.submitButtonTitle;
                int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.cancelButtonTitle;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Dialog(title=");
                sb2.append(this.title);
                sb2.append(", subtitle=");
                sb2.append(this.subtitle);
                sb2.append(", submitButtonTitle=");
                sb2.append(this.submitButtonTitle);
                sb2.append(", cancelButtonTitle=");
                return C22026a.c(sb2, this.cancelButtonTitle, ')');
            }
        }

        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/extended/PremiumBannerWidget$Config$Resolution;", "", "width", "", "height", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Resolution {

            @c("height")
            private final int height;

            @c("width")
            private final int width;

            public Resolution(int i12, int i13) {
                this.width = i12;
                this.height = i13;
            }

            public static /* synthetic */ Resolution copy$default(Resolution resolution, int i12, int i13, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    i12 = resolution.width;
                }
                if ((i14 & 2) != 0) {
                    i13 = resolution.height;
                }
                return resolution.copy(i12, i13);
            }

            /* renamed from: component1, reason: from getter */
            public final int getWidth() {
                return this.width;
            }

            /* renamed from: component2, reason: from getter */
            public final int getHeight() {
                return this.height;
            }

            @k
            public final Resolution copy(int width, int height) {
                return new Resolution(width, height);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Resolution)) {
                    return false;
                }
                Resolution resolution = (Resolution) other;
                return this.width == resolution.width && this.height == resolution.height;
            }

            public final int getHeight() {
                return this.height;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Resolution(width=");
                sb2.append(this.width);
                sb2.append(", height=");
                return r.t(sb2, this.height, ')');
            }
        }

        public Config(@k String str, @k AttributedText attributedText, @l AttributedText attributedText2, int i12, @k Dialog dialog, @k Resolution resolution) {
            this.title = str;
            this.subtitle = attributedText;
            this.filledSubtitle = attributedText2;
            this.maxFilesCount = i12;
            this.sizeExceededDialog = dialog;
            this.resolution = resolution;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, AttributedText attributedText, AttributedText attributedText2, int i12, Dialog dialog, Resolution resolution, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = config.title;
            }
            if ((i13 & 2) != 0) {
                attributedText = config.subtitle;
            }
            AttributedText attributedText3 = attributedText;
            if ((i13 & 4) != 0) {
                attributedText2 = config.filledSubtitle;
            }
            AttributedText attributedText4 = attributedText2;
            if ((i13 & 8) != 0) {
                i12 = config.maxFilesCount;
            }
            int i14 = i12;
            if ((i13 & 16) != 0) {
                dialog = config.sizeExceededDialog;
            }
            Dialog dialog2 = dialog;
            if ((i13 & 32) != 0) {
                resolution = config.resolution;
            }
            return config.copy(str, attributedText3, attributedText4, i14, dialog2, resolution);
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
        public final AttributedText getFilledSubtitle() {
            return this.filledSubtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMaxFilesCount() {
            return this.maxFilesCount;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final Dialog getSizeExceededDialog() {
            return this.sizeExceededDialog;
        }

        @k
        /* renamed from: component6, reason: from getter */
        public final Resolution getResolution() {
            return this.resolution;
        }

        @k
        public final Config copy(@k String title, @k AttributedText subtitle, @l AttributedText filledSubtitle, int maxFilesCount, @k Dialog sizeExceededDialog, @k Resolution resolution) {
            return new Config(title, subtitle, filledSubtitle, maxFilesCount, sizeExceededDialog, resolution);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return L.f(this.title, config.title) && L.f(this.subtitle, config.subtitle) && L.f(this.filledSubtitle, config.filledSubtitle) && this.maxFilesCount == config.maxFilesCount && L.f(this.sizeExceededDialog, config.sizeExceededDialog) && L.f(this.resolution, config.resolution);
        }

        @l
        public final AttributedText getFilledSubtitle() {
            return this.filledSubtitle;
        }

        public final int getMaxFilesCount() {
            return this.maxFilesCount;
        }

        @k
        public final Resolution getResolution() {
            return this.resolution;
        }

        @k
        public final Dialog getSizeExceededDialog() {
            return this.sizeExceededDialog;
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
            AttributedText attributedText = this.filledSubtitle;
            return this.resolution.hashCode() + ((this.sizeExceededDialog.hashCode() + r.e(this.maxFilesCount, (iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31)) * 31);
        }

        @k
        public String toString() {
            return "Config(title=" + this.title + ", subtitle=" + this.subtitle + ", filledSubtitle=" + this.filledSubtitle + ", maxFilesCount=" + this.maxFilesCount + ", sizeExceededDialog=" + this.sizeExceededDialog + ", resolution=" + this.resolution + ')';
        }
    }

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/extended/PremiumBannerWidget$Field;", "", "name", "", "values", "", "Lcom/avito/android/remote/model/extended/ImageFieldValue;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public PremiumBannerWidget(@k Config config, @l List<Field> list, @l String str) {
        this.config = config;
        this.fields = list;
        this.widgetName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PremiumBannerWidget copy$default(PremiumBannerWidget premiumBannerWidget, Config config, List list, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            config = premiumBannerWidget.config;
        }
        if ((i12 & 2) != 0) {
            list = premiumBannerWidget.fields;
        }
        if ((i12 & 4) != 0) {
            str = premiumBannerWidget.widgetName;
        }
        return premiumBannerWidget.copy(config, list, str);
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
    public final PremiumBannerWidget copy(@k Config config, @l List<Field> fields, @l String widgetName) {
        return new PremiumBannerWidget(config, fields, widgetName);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PremiumBannerWidget)) {
            return false;
        }
        PremiumBannerWidget premiumBannerWidget = (PremiumBannerWidget) other;
        return L.f(this.config, premiumBannerWidget.config) && L.f(this.fields, premiumBannerWidget.fields) && L.f(this.widgetName, premiumBannerWidget.widgetName);
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
        StringBuilder sb2 = new StringBuilder("PremiumBannerWidget(config=");
        sb2.append(this.config);
        sb2.append(", fields=");
        sb2.append(this.fields);
        sb2.append(", widgetName=");
        return C22026a.c(sb2, this.widgetName, ')');
    }
}
