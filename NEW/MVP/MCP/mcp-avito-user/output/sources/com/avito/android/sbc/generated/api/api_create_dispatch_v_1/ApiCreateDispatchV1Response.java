package com.avito.android.sbc.generated.api.api_create_dispatch_v_1;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import bp0.C25690b;
import bp0.C25691c;
import bp0.C25692d;
import bp0.h;
import bp0.i;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiCreateDispatchV1Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response;", "", "CustomApiErrorCustomError", "a", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response$CustomApiErrorCustomError;", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response$a;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ApiCreateDispatchV1Response {

    /* compiled from: ApiCreateDispatchV1Response.kt */
    @P
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001e\u001fBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014¨\u0006 "}, d2 = {"Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response$CustomApiErrorCustomError;", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response;", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response$CustomApiErrorCustomError$ActionPreset;", "actionPreset", "", "actionTitle", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response$CustomApiErrorCustomError$ActionType;", "actionType", "Lcom/avito/android/deep_linking/links/DeepLink;", "actionUri", "description", "errorType", "title", "<init>", "(Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response$CustomApiErrorCustomError$ActionPreset;Ljava/lang/String;Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response$CustomApiErrorCustomError$ActionType;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response$CustomApiErrorCustomError$ActionPreset;", "a", "()Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response$CustomApiErrorCustomError$ActionPreset;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response$CustomApiErrorCustomError$ActionType;", "c", "()Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response$CustomApiErrorCustomError$ActionType;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "e", "f", "g", "ActionPreset", "ActionType", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CustomApiErrorCustomError implements ApiCreateDispatchV1Response {

        @c("action_preset")
        @k
        private final ActionPreset actionPreset;

        @c("action_title")
        @k
        private final String actionTitle;

        @c("action_type")
        @k
        private final ActionType actionType;

        @c("action_uri")
        @l
        private final DeepLink actionUri;

        @c("description")
        @k
        private final String description;

        @c("error_type")
        @k
        private final String errorType;

        @c("title")
        @k
        private final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ApiCreateDispatchV1Response.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response$CustomApiErrorCustomError$ActionPreset;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Primary", "Secondary", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ActionPreset {

            @c("primary")
            public static final ActionPreset Primary;

            @c("secondary")
            public static final ActionPreset Secondary;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ ActionPreset[] f260162b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f260163c;

            static {
                ActionPreset actionPreset = new ActionPreset("Primary", 0, "primary");
                Primary = actionPreset;
                ActionPreset actionPreset2 = new ActionPreset("Secondary", 1, "secondary");
                Secondary = actionPreset2;
                ActionPreset[] actionPresetArr = {actionPreset, actionPreset2};
                f260162b = actionPresetArr;
                f260163c = kotlin.enums.c.a(actionPresetArr);
            }

            private ActionPreset(String str, int i12, String str2) {
            }

            public static ActionPreset valueOf(String str) {
                return (ActionPreset) Enum.valueOf(ActionPreset.class, str);
            }

            public static ActionPreset[] values() {
                return (ActionPreset[]) f260162b.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ApiCreateDispatchV1Response.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response$CustomApiErrorCustomError$ActionType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Close", "Update", "Uri", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ActionType {

            @c("close")
            public static final ActionType Close;

            @c("update")
            public static final ActionType Update;

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            public static final ActionType Uri;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ ActionType[] f260164b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f260165c;

            static {
                ActionType actionType = new ActionType("Close", 0, "close");
                Close = actionType;
                ActionType actionType2 = new ActionType("Update", 1, "update");
                Update = actionType2;
                ActionType actionType3 = new ActionType("Uri", 2, TooltipAttribute.PARAM_DEEP_LINK);
                Uri = actionType3;
                ActionType[] actionTypeArr = {actionType, actionType2, actionType3};
                f260164b = actionTypeArr;
                f260165c = kotlin.enums.c.a(actionTypeArr);
            }

            private ActionType(String str, int i12, String str2) {
            }

            public static ActionType valueOf(String str) {
                return (ActionType) Enum.valueOf(ActionType.class, str);
            }

            public static ActionType[] values() {
                return (ActionType[]) f260164b.clone();
            }
        }

        public CustomApiErrorCustomError(@k ActionPreset actionPreset, @k String str, @k ActionType actionType, @l DeepLink deepLink, @k String str2, @k String str3, @k String str4) {
            this.actionPreset = actionPreset;
            this.actionTitle = str;
            this.actionType = actionType;
            this.actionUri = deepLink;
            this.description = str2;
            this.errorType = str3;
            this.title = str4;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final ActionPreset getActionPreset() {
            return this.actionPreset;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getActionTitle() {
            return this.actionTitle;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final ActionType getActionType() {
            return this.actionType;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final DeepLink getActionUri() {
            return this.actionUri;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @k
        /* renamed from: f, reason: from getter */
        public final String getErrorType() {
            return this.errorType;
        }

        @k
        /* renamed from: g, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: ApiCreateDispatchV1Response.kt */
    @P
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b)\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b*\u0010\"R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b1\u0010(R\u001a\u0010\u0013\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b2\u0010-R\u001a\u0010\u0014\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010+\u001a\u0004\b3\u0010-R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response$a;", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/ApiCreateDispatchV1Response;", "", "autoDispatchEnabledByDefault", "autoDispatchFeatureSupport", "Lbp0/d;", "descriptions", "", "Lbp0/b;", "fastChips", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/OkRespDataSuccessForecastPresetsItem;", "forecastPresets", "forecastsForAutoDispatchFeatureSupported", "", "id", "Lbp0/c;", "itemInfo", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/Offer;", "offers", "pricePerRecipient", "recipientsCount", "", "status", "Lbp0/h;", "tariff", "Lbp0/i;", "vas", "<init>", "(ZLjava/lang/Boolean;Lbp0/d;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;JLbp0/c;Ljava/util/List;JJLjava/lang/String;Lbp0/h;Lbp0/i;)V", "Z", "a", "()Z", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "Lbp0/d;", "c", "()Lbp0/d;", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "f", "J", "g", "()J", "Lbp0/c;", "h", "()Lbp0/c;", "i", "j", "k", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "Lbp0/h;", "m", "()Lbp0/h;", "Lbp0/i;", "n", "()Lbp0/i;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ApiCreateDispatchV1Response {

        @c("autoDispatchEnabledByDefault")
        private final boolean autoDispatchEnabledByDefault;

        @c("autoDispatchFeatureSupport")
        @l
        private final Boolean autoDispatchFeatureSupport;

        @c("descriptions")
        @k
        private final C25692d descriptions;

        @c("fastChips")
        @l
        private final List<C25690b> fastChips;

        @c("forecastPresets")
        @l
        private final List<OkRespDataSuccessForecastPresetsItem> forecastPresets;

        @c("forecastsForAutoDispatchFeatureSupported")
        @l
        private final Boolean forecastsForAutoDispatchFeatureSupported;

        @c("id")
        private final long id;

        @c("itemInfo")
        @k
        private final C25691c itemInfo;

        @c("offers")
        @k
        private final List<Offer> offers;

        @c("pricePerRecipient")
        private final long pricePerRecipient;

        @c("recipientsCount")
        private final long recipientsCount;

        @c("status")
        @l
        private final String status;

        @c("tariff")
        @l
        private final h tariff;

        @c("vas")
        @l
        private final i vas;

        public a(boolean z12, @l Boolean bool, @k C25692d c25692d, @l List<C25690b> list, @l List<OkRespDataSuccessForecastPresetsItem> list2, @l Boolean bool2, long j12, @k C25691c c25691c, @k List<Offer> list3, long j13, long j14, @l String str, @l h hVar, @l i iVar) {
            this.autoDispatchEnabledByDefault = z12;
            this.autoDispatchFeatureSupport = bool;
            this.descriptions = c25692d;
            this.fastChips = list;
            this.forecastPresets = list2;
            this.forecastsForAutoDispatchFeatureSupported = bool2;
            this.id = j12;
            this.itemInfo = c25691c;
            this.offers = list3;
            this.pricePerRecipient = j13;
            this.recipientsCount = j14;
            this.status = str;
            this.tariff = hVar;
            this.vas = iVar;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getAutoDispatchEnabledByDefault() {
            return this.autoDispatchEnabledByDefault;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final Boolean getAutoDispatchFeatureSupport() {
            return this.autoDispatchFeatureSupport;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final C25692d getDescriptions() {
            return this.descriptions;
        }

        @l
        public final List<C25690b> d() {
            return this.fastChips;
        }

        @l
        public final List<OkRespDataSuccessForecastPresetsItem> e() {
            return this.forecastPresets;
        }

        @l
        /* renamed from: f, reason: from getter */
        public final Boolean getForecastsForAutoDispatchFeatureSupported() {
            return this.forecastsForAutoDispatchFeatureSupported;
        }

        /* renamed from: g, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @k
        /* renamed from: h, reason: from getter */
        public final C25691c getItemInfo() {
            return this.itemInfo;
        }

        @k
        public final List<Offer> i() {
            return this.offers;
        }

        /* renamed from: j, reason: from getter */
        public final long getPricePerRecipient() {
            return this.pricePerRecipient;
        }

        /* renamed from: k, reason: from getter */
        public final long getRecipientsCount() {
            return this.recipientsCount;
        }

        @l
        /* renamed from: l, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        @l
        /* renamed from: m, reason: from getter */
        public final h getTariff() {
            return this.tariff;
        }

        @l
        /* renamed from: n, reason: from getter */
        public final i getVas() {
            return this.vas;
        }
    }
}
