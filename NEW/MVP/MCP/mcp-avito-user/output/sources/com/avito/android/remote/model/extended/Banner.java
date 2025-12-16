package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: Banner.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0005,-./0BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ja\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/extended/Banner;", "", "title", "", "description", "attributedDescription", "Lcom/avito/android/remote/model/text/AttributedText;", "type", "Lcom/avito/android/remote/model/extended/Banner$Type;", "buttons", "", "Lcom/avito/android/remote/model/extended/Banner$Button;", "analyticParams", "Lcom/avito/android/remote/model/extended/Banner$CommonAnalyticParams;", "closeParams", "Lcom/avito/android/remote/model/extended/Banner$CloseParams;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/extended/Banner$Type;Ljava/util/List;Lcom/avito/android/remote/model/extended/Banner$CommonAnalyticParams;Lcom/avito/android/remote/model/extended/Banner$CloseParams;)V", "getAnalyticParams", "()Lcom/avito/android/remote/model/extended/Banner$CommonAnalyticParams;", "getAttributedDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "getButtons", "()Ljava/util/List;", "getCloseParams", "()Lcom/avito/android/remote/model/extended/Banner$CloseParams;", "getDescription", "()Ljava/lang/String;", "getTitle", "getType", "()Lcom/avito/android/remote/model/extended/Banner$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Button", "ButtonAnalyticParams", "CloseParams", "CommonAnalyticParams", "Type", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Banner {

    @c("analyticParams")
    @l
    private final CommonAnalyticParams analyticParams;

    @c("attributedDescription")
    @l
    private final AttributedText attributedDescription;

    @c("buttons")
    @l
    private final List<Button> buttons;

    @c("closeParams")
    @l
    private final CloseParams closeParams;

    @c("description")
    @l
    private final String description;

    @c("title")
    @k
    private final String title;

    @c("type")
    @l
    private final Type type;

    /* compiled from: Banner.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/extended/Banner$Button;", "", "title", "", "action", "Lcom/avito/android/remote/model/DeeplinkAction;", "analyticParams", "Lcom/avito/android/remote/model/extended/Banner$ButtonAnalyticParams;", "(Ljava/lang/String;Lcom/avito/android/remote/model/DeeplinkAction;Lcom/avito/android/remote/model/extended/Banner$ButtonAnalyticParams;)V", "getAction", "()Lcom/avito/android/remote/model/DeeplinkAction;", "getAnalyticParams", "()Lcom/avito/android/remote/model/extended/Banner$ButtonAnalyticParams;", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Button {

        @c("action")
        @k
        private final DeeplinkAction action;

        @c("analyticParams")
        @l
        private final ButtonAnalyticParams analyticParams;

        @c("title")
        @k
        private final String title;

        public Button(@k String str, @k DeeplinkAction deeplinkAction, @l ButtonAnalyticParams buttonAnalyticParams) {
            this.title = str;
            this.action = deeplinkAction;
            this.analyticParams = buttonAnalyticParams;
        }

        @k
        public final DeeplinkAction getAction() {
            return this.action;
        }

        @l
        public final ButtonAnalyticParams getAnalyticParams() {
            return this.analyticParams;
        }

        @k
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Banner.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/extended/Banner$ButtonAnalyticParams;", "", "actionType", "", "(Ljava/lang/String;)V", "getActionType", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ButtonAnalyticParams {

        @c("actionType")
        @k
        private final String actionType;

        public ButtonAnalyticParams(@k String str) {
            this.actionType = str;
        }

        @k
        public final String getActionType() {
            return this.actionType;
        }
    }

    /* compiled from: Banner.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/extended/Banner$CloseParams;", "", "id", "", "page", "position", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPage", "getPosition", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseParams {

        @c("id")
        @l
        private final String id;

        @c("page")
        @l
        private final String page;

        @c("position")
        @l
        private final String position;

        public CloseParams(@l String str, @l String str2, @l String str3) {
            this.id = str;
            this.page = str2;
            this.position = str3;
        }

        @l
        public final String getId() {
            return this.id;
        }

        @l
        public final String getPage() {
            return this.page;
        }

        @l
        public final String getPosition() {
            return this.position;
        }
    }

    /* compiled from: Banner.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/extended/Banner$CommonAnalyticParams;", "", "bannerTitle", "", "actionType", "(Ljava/lang/String;Ljava/lang/String;)V", "getActionType", "()Ljava/lang/String;", "getBannerTitle", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CommonAnalyticParams {

        @c("actionType")
        @k
        private final String actionType;

        @c("bannerTitle")
        @k
        private final String bannerTitle;

        public CommonAnalyticParams(@k String str, @k String str2) {
            this.bannerTitle = str;
            this.actionType = str2;
        }

        @k
        public final String getActionType() {
            return this.actionType;
        }

        @k
        public final String getBannerTitle() {
            return this.bannerTitle;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Banner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/extended/Banner$Type;", "", "(Ljava/lang/String;I)V", "ERROR", "WARNING", "INFO", "RE_AGENT_SHORT_FLOW_ENTRY_POINT", "RE_AGENT_EMPTY_INFO", "RE_AGENT_POPUP", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @c("error")
        public static final Type ERROR = new Type("ERROR", 0);

        @c(ConstraintKt.WARNING)
        public static final Type WARNING = new Type("WARNING", 1);

        @c(RequestReviewResultKt.INFO_TYPE)
        public static final Type INFO = new Type("INFO", 2);

        @c("agent-profile/short-flow-entry-point")
        public static final Type RE_AGENT_SHORT_FLOW_ENTRY_POINT = new Type("RE_AGENT_SHORT_FLOW_ENTRY_POINT", 3);

        @c("agent-profile/empty-info")
        public static final Type RE_AGENT_EMPTY_INFO = new Type("RE_AGENT_EMPTY_INFO", 4);

        @c("agent-profile/best-sides")
        public static final Type RE_AGENT_POPUP = new Type("RE_AGENT_POPUP", 5);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{ERROR, WARNING, INFO, RE_AGENT_SHORT_FLOW_ENTRY_POINT, RE_AGENT_EMPTY_INFO, RE_AGENT_POPUP};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = kotlin.enums.c.a(typeArr$values);
        }

        private Type(String str, int i12) {
        }

        @k
        public static a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public Banner(@k String str, @l String str2, @l AttributedText attributedText, @l Type type, @l List<Button> list, @l CommonAnalyticParams commonAnalyticParams, @l CloseParams closeParams) {
        this.title = str;
        this.description = str2;
        this.attributedDescription = attributedText;
        this.type = type;
        this.buttons = list;
        this.analyticParams = commonAnalyticParams;
        this.closeParams = closeParams;
    }

    public static /* synthetic */ Banner copy$default(Banner banner, String str, String str2, AttributedText attributedText, Type type, List list, CommonAnalyticParams commonAnalyticParams, CloseParams closeParams, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = banner.title;
        }
        if ((i12 & 2) != 0) {
            str2 = banner.description;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            attributedText = banner.attributedDescription;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 8) != 0) {
            type = banner.type;
        }
        Type type2 = type;
        if ((i12 & 16) != 0) {
            list = banner.buttons;
        }
        List list2 = list;
        if ((i12 & 32) != 0) {
            commonAnalyticParams = banner.analyticParams;
        }
        CommonAnalyticParams commonAnalyticParams2 = commonAnalyticParams;
        if ((i12 & 64) != 0) {
            closeParams = banner.closeParams;
        }
        return banner.copy(str, str3, attributedText2, type2, list2, commonAnalyticParams2, closeParams);
    }

    @k
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
    public final AttributedText getAttributedDescription() {
        return this.attributedDescription;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @l
    public final List<Button> component5() {
        return this.buttons;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final CommonAnalyticParams getAnalyticParams() {
        return this.analyticParams;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final CloseParams getCloseParams() {
        return this.closeParams;
    }

    @k
    public final Banner copy(@k String title, @l String description, @l AttributedText attributedDescription, @l Type type, @l List<Button> buttons, @l CommonAnalyticParams analyticParams, @l CloseParams closeParams) {
        return new Banner(title, description, attributedDescription, type, buttons, analyticParams, closeParams);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) other;
        return L.f(this.title, banner.title) && L.f(this.description, banner.description) && L.f(this.attributedDescription, banner.attributedDescription) && this.type == banner.type && L.f(this.buttons, banner.buttons) && L.f(this.analyticParams, banner.analyticParams) && L.f(this.closeParams, banner.closeParams);
    }

    @l
    public final CommonAnalyticParams getAnalyticParams() {
        return this.analyticParams;
    }

    @l
    public final AttributedText getAttributedDescription() {
        return this.attributedDescription;
    }

    @l
    public final List<Button> getButtons() {
        return this.buttons;
    }

    @l
    public final CloseParams getCloseParams() {
        return this.closeParams;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.attributedDescription;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Type type = this.type;
        int iHashCode4 = (iHashCode3 + (type == null ? 0 : type.hashCode())) * 31;
        List<Button> list = this.buttons;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        CommonAnalyticParams commonAnalyticParams = this.analyticParams;
        int iHashCode6 = (iHashCode5 + (commonAnalyticParams == null ? 0 : commonAnalyticParams.hashCode())) * 31;
        CloseParams closeParams = this.closeParams;
        return iHashCode6 + (closeParams != null ? closeParams.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Banner(title=" + this.title + ", description=" + this.description + ", attributedDescription=" + this.attributedDescription + ", type=" + this.type + ", buttons=" + this.buttons + ", analyticParams=" + this.analyticParams + ", closeParams=" + this.closeParams + ')';
    }
}
