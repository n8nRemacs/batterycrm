package com.avito.android.remote.model.service_order_widget;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrderWidget.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u001c\u001d\u001eR\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0001\u0002\u001f ¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "analyticParams", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$AnalyticsParams;", "getAnalyticParams", "()Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$AnalyticsParams;", "description", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "image", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "layoutType", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetLayoutType;", "getLayoutType", "()Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetLayoutType;", "primaryAction", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetAction;", "getPrimaryAction", "()Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetAction;", "title", "", "getTitle", "()Ljava/lang/String;", "AnalyticsParams", "ServiceOrderWidgetAction", "ServiceOrderWidgetLayoutType", "Lcom/avito/android/remote/model/service_order_widget/DefaultServiceOrderWidget;", "Lcom/avito/android/remote/model/service_order_widget/FormServiceOrderWidget;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ServiceOrderWidget extends SerpElement, AnalyticsElement, SettingsElement {

    /* compiled from: ServiceOrderWidget.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J|\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b5\u0010\u0010¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$AnalyticsParams;", "Landroid/os/Parcelable;", "", "categoryId", "microCategoryId", SearchParamsConverterKt.LOCATION_ID, "formRawParams", "query", "widgetID", "requestType", "", "formVersion", "fromPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Integer;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$AnalyticsParams;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCategoryId", "getMicroCategoryId", "getLocationId", "getFormRawParams", "getQuery", "getWidgetID", "getRequestType", "Ljava/lang/Integer;", "getFormVersion", "getFromPage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnalyticsParams implements Parcelable {

        @k
        public static final Parcelable.Creator<AnalyticsParams> CREATOR = new Creator();

        @c("categoryId")
        @l
        private final String categoryId;

        @c("formRawParams")
        @l
        private final String formRawParams;

        @c("formVersion")
        @l
        private final Integer formVersion;

        @c("fromPage")
        @l
        private final String fromPage;

        @c(SearchParamsConverterKt.LOCATION_ID)
        @l
        private final String locationId;

        @c("microCategoryId")
        @l
        private final String microCategoryId;

        @c("query")
        @l
        private final String query;

        @c("requestType")
        @l
        private final String requestType;

        @c("widgetId")
        @l
        private final String widgetID;

        /* compiled from: ServiceOrderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AnalyticsParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AnalyticsParams createFromParcel(@k Parcel parcel) {
                return new AnalyticsParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AnalyticsParams[] newArray(int i12) {
                return new AnalyticsParams[i12];
            }
        }

        public AnalyticsParams(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l Integer num, @l String str8) {
            this.categoryId = str;
            this.microCategoryId = str2;
            this.locationId = str3;
            this.formRawParams = str4;
            this.query = str5;
            this.widgetID = str6;
            this.requestType = str7;
            this.formVersion = num;
            this.fromPage = str8;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getCategoryId() {
            return this.categoryId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getMicroCategoryId() {
            return this.microCategoryId;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getLocationId() {
            return this.locationId;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getFormRawParams() {
            return this.formRawParams;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getWidgetID() {
            return this.widgetID;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getRequestType() {
            return this.requestType;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final Integer getFormVersion() {
            return this.formVersion;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final String getFromPage() {
            return this.fromPage;
        }

        @k
        public final AnalyticsParams copy(@l String categoryId, @l String microCategoryId, @l String locationId, @l String formRawParams, @l String query, @l String widgetID, @l String requestType, @l Integer formVersion, @l String fromPage) {
            return new AnalyticsParams(categoryId, microCategoryId, locationId, formRawParams, query, widgetID, requestType, formVersion, fromPage);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnalyticsParams)) {
                return false;
            }
            AnalyticsParams analyticsParams = (AnalyticsParams) other;
            return L.f(this.categoryId, analyticsParams.categoryId) && L.f(this.microCategoryId, analyticsParams.microCategoryId) && L.f(this.locationId, analyticsParams.locationId) && L.f(this.formRawParams, analyticsParams.formRawParams) && L.f(this.query, analyticsParams.query) && L.f(this.widgetID, analyticsParams.widgetID) && L.f(this.requestType, analyticsParams.requestType) && L.f(this.formVersion, analyticsParams.formVersion) && L.f(this.fromPage, analyticsParams.fromPage);
        }

        @l
        public final String getCategoryId() {
            return this.categoryId;
        }

        @l
        public final String getFormRawParams() {
            return this.formRawParams;
        }

        @l
        public final Integer getFormVersion() {
            return this.formVersion;
        }

        @l
        public final String getFromPage() {
            return this.fromPage;
        }

        @l
        public final String getLocationId() {
            return this.locationId;
        }

        @l
        public final String getMicroCategoryId() {
            return this.microCategoryId;
        }

        @l
        public final String getQuery() {
            return this.query;
        }

        @l
        public final String getRequestType() {
            return this.requestType;
        }

        @l
        public final String getWidgetID() {
            return this.widgetID;
        }

        public int hashCode() {
            String str = this.categoryId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.microCategoryId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.locationId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.formRawParams;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.query;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.widgetID;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.requestType;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Integer num = this.formVersion;
            int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
            String str8 = this.fromPage;
            return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AnalyticsParams(categoryId=");
            sb2.append(this.categoryId);
            sb2.append(", microCategoryId=");
            sb2.append(this.microCategoryId);
            sb2.append(", locationId=");
            sb2.append(this.locationId);
            sb2.append(", formRawParams=");
            sb2.append(this.formRawParams);
            sb2.append(", query=");
            sb2.append(this.query);
            sb2.append(", widgetID=");
            sb2.append(this.widgetID);
            sb2.append(", requestType=");
            sb2.append(this.requestType);
            sb2.append(", formVersion=");
            sb2.append(this.formVersion);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.fromPage, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.categoryId);
            parcel.writeString(this.microCategoryId);
            parcel.writeString(this.locationId);
            parcel.writeString(this.formRawParams);
            parcel.writeString(this.query);
            parcel.writeString(this.widgetID);
            parcel.writeString(this.requestType);
            Integer num = this.formVersion;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            parcel.writeString(this.fromPage);
        }
    }

    /* compiled from: ServiceOrderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetAction;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ServiceOrderWidgetAction implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceOrderWidgetAction> CREATOR = new Creator();

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        /* compiled from: ServiceOrderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ServiceOrderWidgetAction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ServiceOrderWidgetAction createFromParcel(@k Parcel parcel) {
                return new ServiceOrderWidgetAction(parcel.readString(), (DeepLink) parcel.readParcelable(ServiceOrderWidgetAction.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ServiceOrderWidgetAction[] newArray(int i12) {
                return new ServiceOrderWidgetAction[i12];
            }
        }

        public ServiceOrderWidgetAction(@k String str, @k DeepLink deepLink) {
            this.title = str;
            this.uri = deepLink;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final DeepLink getUri() {
            return this.uri;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.uri, flags);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceOrderWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetLayoutType;", "", "(Ljava/lang/String;I)V", "DEFAULT", "FORM", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ServiceOrderWidgetLayoutType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ ServiceOrderWidgetLayoutType[] $VALUES;

        @c("default")
        public static final ServiceOrderWidgetLayoutType DEFAULT = new ServiceOrderWidgetLayoutType("DEFAULT", 0);

        @c("form")
        public static final ServiceOrderWidgetLayoutType FORM = new ServiceOrderWidgetLayoutType("FORM", 1);

        private static final /* synthetic */ ServiceOrderWidgetLayoutType[] $values() {
            return new ServiceOrderWidgetLayoutType[]{DEFAULT, FORM};
        }

        static {
            ServiceOrderWidgetLayoutType[] serviceOrderWidgetLayoutTypeArr$values = $values();
            $VALUES = serviceOrderWidgetLayoutTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(serviceOrderWidgetLayoutTypeArr$values);
        }

        private ServiceOrderWidgetLayoutType(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<ServiceOrderWidgetLayoutType> getEntries() {
            return $ENTRIES;
        }

        public static ServiceOrderWidgetLayoutType valueOf(String str) {
            return (ServiceOrderWidgetLayoutType) Enum.valueOf(ServiceOrderWidgetLayoutType.class, str);
        }

        public static ServiceOrderWidgetLayoutType[] values() {
            return (ServiceOrderWidgetLayoutType[]) $VALUES.clone();
        }
    }

    @l
    AnalyticsParams getAnalyticParams();

    @l
    AttributedText getDescription();

    @l
    UniversalImage getImage();

    @l
    ServiceOrderWidgetLayoutType getLayoutType();

    @l
    ServiceOrderWidgetAction getPrimaryAction();

    @k
    String getTitle();
}
