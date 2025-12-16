package com.avito.android.rating_form.api.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import aW.InterfaceC19825c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import org.webrtc.h;

/* compiled from: RatingFormField.kt */
@d
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\b\u0087\b\u0018\u00002\u00020\u0001:\n]^_`abcdefB\u0084\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0019\u0010#\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\u0002\b\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010 \u0012\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\r¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b3\u00102R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u00106R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u00109R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010<R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\bC\u00102R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\bD\u00102R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bF\u0010GR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010=\u001a\u0004\bH\u0010?R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\u001b\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010L\u001a\u0004\bO\u0010NR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00100\u001a\u0004\bP\u00102R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\bQ\u00102R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010R\u001a\u0004\bS\u0010TR-\u0010#\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\u0002\b\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010U\u001a\u0004\bV\u0010WR\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010X\u001a\u0004\bY\u0010ZR(\u0010(\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010U\u001a\u0004\b[\u0010WR\"\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010=\u001a\u0004\b\\\u0010?¨\u0006g"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RatingFormItem;", "", "id", "", "slug", "title", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "dataType", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$EntityType;", "entityType", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ViewType;", "viewType", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Value;", "values", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType;", "value", ChannelContext.Item.PLACEHOLDER, "helpText", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Description;", "description", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Validation;", "validations", "maxSymbolLimit", "", "sendOnChange", BeduinCartItemModel.DISABLED_STRING, "errorText", "hintText", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$MaskType;", "inputMaskType", "", "", "LK51/e;", "customParams", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ViewAction;", "Lcom/avito/android/deep_linking/links/DeepLink;", "analytics", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$FileInfo;", "files", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;Lcom/avito/android/rating_form/api/remote/model/RatingFormField$EntityType;Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ViewType;Ljava/util/List;Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Description;Ljava/util/List;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Lcom/avito/android/rating_form/api/remote/model/RatingFormField$MaskType;Ljava/util/Map;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/Map;Ljava/util/List;)V", "I", "o", "()I", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "getTitle", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "f", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$EntityType;", "i", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormField$EntityType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ViewType;", "v", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ViewType;", "Ljava/util/List;", "u", "()Ljava/util/List;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType;", "t", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType;", "getPlaceholder", "m", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Description;", "g", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Description;", "s", "Ljava/lang/Integer;", "q", "()Ljava/lang/Integer;", "Z", "r", "()Z", "h", "j", "n", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$MaskType;", "p", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormField$MaskType;", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "c", "l", "DataType", "Description", "EntityType", "FileInfo", "MaskType", "Validation", "Value", "ValueType", "ViewAction", "ViewType", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingFormField extends RatingFormAddValueType.RatingFormItem {

    @k
    public static final Parcelable.Creator<RatingFormField> CREATOR = new a();

    @c("analytics")
    @l
    private final Map<ViewAction, DeepLink> analytics;

    @c("attributedText")
    @l
    private final AttributedText attributedText;

    @c("customParams")
    @l
    private final Map<String, Object> customParams;

    @c("dataType")
    @k
    private final DataType dataType;

    @c("description")
    @l
    private final Description description;

    @c(BeduinCartItemModel.DISABLED_STRING)
    private final boolean disabled;

    @c("entityType")
    @k
    private final EntityType entityType;

    @c("errorText")
    @l
    private final String errorText;

    @c("files")
    @l
    private final List<FileInfo> files;

    @c("helpText")
    @l
    private final String helpText;

    @c("hintText")
    @l
    private final String hintText;

    @c("id")
    private final int id;

    @c("inputMaskType")
    @l
    private final MaskType inputMaskType;

    @c("maxSymbolLimit")
    @l
    private final Integer maxSymbolLimit;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c("sendOnChange")
    private final boolean sendOnChange;

    @c("slug")
    @k
    private final String slug;

    @c("title")
    @l
    private final String title;

    @c("validations")
    @l
    private final List<Validation> validations;

    @c("value")
    @l
    private final ValueType value;

    @c("values")
    @l
    private final List<Value> values;

    @c("viewType")
    @k
    private final ViewType viewType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RatingFormField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "", "(Ljava/lang/String;I)V", "STRING", "INT", "INT_ARRAY", "STRING_ARRAY", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DataType {

        @c(IntParameter.TYPE)
        public static final DataType INT;

        @c("intArray")
        public static final DataType INT_ARRAY;

        @c("string")
        public static final DataType STRING;

        @c("stringArray")
        public static final DataType STRING_ARRAY;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ DataType[] f247989b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f247990c;

        static {
            DataType dataType = new DataType("STRING", 0);
            STRING = dataType;
            DataType dataType2 = new DataType("INT", 1);
            INT = dataType2;
            DataType dataType3 = new DataType("INT_ARRAY", 2);
            INT_ARRAY = dataType3;
            DataType dataType4 = new DataType("STRING_ARRAY", 3);
            STRING_ARRAY = dataType4;
            DataType[] dataTypeArr = {dataType, dataType2, dataType3, dataType4};
            f247989b = dataTypeArr;
            f247990c = kotlin.enums.c.a(dataTypeArr);
        }

        private DataType(String str, int i12) {
        }

        public static DataType valueOf(String str) {
            return (DataType) Enum.valueOf(DataType.class, str);
        }

        public static DataType[] values() {
            return (DataType[]) f247989b.clone();
        }
    }

    /* compiled from: RatingFormField.kt */
    @d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Description;", "Landroid/os/Parcelable;", "", "title", "", "value", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Description implements Parcelable {

        @k
        public static final Parcelable.Creator<Description> CREATOR = new a();

        @c("title")
        @l
        private final String title;

        @c("value")
        @l
        private final List<String> value;

        /* compiled from: RatingFormField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Description> {
            @Override // android.os.Parcelable.Creator
            public final Description createFromParcel(Parcel parcel) {
                return new Description(parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Description[] newArray(int i12) {
                return new Description[i12];
            }
        }

        public Description(@l String str, @l List<String> list) {
            this.title = str;
            this.value = list;
        }

        @l
        public final List<String> c() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Description)) {
                return false;
            }
            Description description = (Description) obj;
            return L.f(this.title, description.title) && L.f(this.value, description.value);
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.value;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Description(title=");
            sb2.append(this.title);
            sb2.append(", value=");
            return H.p(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeStringList(this.value);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RatingFormField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$EntityType;", "", "(Ljava/lang/String;I)V", "TEXT", "SELECT", "MULTISELECT", "ADDRESS", "DEVELOPMENT", "IMAGES", "FILES", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EntityType {

        @c(AddressParameter.TYPE)
        public static final EntityType ADDRESS;

        @c("development")
        public static final EntityType DEVELOPMENT;

        @c("files")
        public static final EntityType FILES;

        @c("images")
        public static final EntityType IMAGES;

        @c("multiselect")
        public static final EntityType MULTISELECT;

        @c("select")
        public static final EntityType SELECT;

        @c("text")
        public static final EntityType TEXT;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ EntityType[] f247991b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f247992c;

        static {
            EntityType entityType = new EntityType("TEXT", 0);
            TEXT = entityType;
            EntityType entityType2 = new EntityType("SELECT", 1);
            SELECT = entityType2;
            EntityType entityType3 = new EntityType("MULTISELECT", 2);
            MULTISELECT = entityType3;
            EntityType entityType4 = new EntityType("ADDRESS", 3);
            ADDRESS = entityType4;
            EntityType entityType5 = new EntityType("DEVELOPMENT", 4);
            DEVELOPMENT = entityType5;
            EntityType entityType6 = new EntityType("IMAGES", 5);
            IMAGES = entityType6;
            EntityType entityType7 = new EntityType("FILES", 6);
            FILES = entityType7;
            EntityType[] entityTypeArr = {entityType, entityType2, entityType3, entityType4, entityType5, entityType6, entityType7};
            f247991b = entityTypeArr;
            f247992c = kotlin.enums.c.a(entityTypeArr);
        }

        private EntityType(String str, int i12) {
        }

        public static EntityType valueOf(String str) {
            return (EntityType) Enum.valueOf(EntityType.class, str);
        }

        public static EntityType[] values() {
            return (EntityType[]) f247991b.clone();
        }
    }

    /* compiled from: RatingFormField.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$FileInfo;", "Landroid/os/Parcelable;", "", "key", "name", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getName", "d", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FileInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<FileInfo> CREATOR = new a();

        @c("key")
        @k
        private final String key;

        @c("name")
        @k
        private final String name;

        @c("size")
        @l
        private final String size;

        /* compiled from: RatingFormField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FileInfo> {
            @Override // android.os.Parcelable.Creator
            public final FileInfo createFromParcel(Parcel parcel) {
                return new FileInfo(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FileInfo[] newArray(int i12) {
                return new FileInfo[i12];
            }
        }

        public FileInfo(@k String str, @k String str2, @l String str3) {
            this.key = str;
            this.name = str2;
            this.size = str3;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getSize() {
            return this.size;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileInfo)) {
                return false;
            }
            FileInfo fileInfo = (FileInfo) obj;
            return L.f(this.key, fileInfo.key) && L.f(this.name, fileInfo.name) && L.f(this.size, fileInfo.size);
        }

        @k
        public final String getName() {
            return this.name;
        }

        public final int hashCode() {
            int iD2 = H.d(this.key.hashCode() * 31, 31, this.name);
            String str = this.size;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FileInfo(key=");
            sb2.append(this.key);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", size=");
            return C22026a.c(sb2, this.size, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.key);
            parcel.writeString(this.name);
            parcel.writeString(this.size);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RatingFormField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$MaskType;", "", "(Ljava/lang/String;I)V", "ROUBLES", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MaskType {

        @c("roubles")
        public static final MaskType ROUBLES;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ MaskType[] f247993b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f247994c;

        static {
            MaskType maskType = new MaskType("ROUBLES", 0);
            ROUBLES = maskType;
            MaskType[] maskTypeArr = {maskType};
            f247993b = maskTypeArr;
            f247994c = kotlin.enums.c.a(maskTypeArr);
        }

        private MaskType(String str, int i12) {
        }

        public static MaskType valueOf(String str) {
            return (MaskType) Enum.valueOf(MaskType.class, str);
        }

        public static MaskType[] values() {
            return (MaskType[]) f247993b.clone();
        }
    }

    /* compiled from: RatingFormField.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006#"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Validation;", "Landroid/os/Parcelable;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Validation$Rule;", "rule", "", "min", "max", "", "message", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Validation$MessageView;", "messageView", "", "values", AttachMenuItem.File.EXTENSIONS, "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Validation$Rule;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Validation$MessageView;Ljava/util/List;Ljava/util/List;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Validation$Rule;", "g", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Validation$Rule;", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "d", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Validation$MessageView;", "e", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Validation$MessageView;", "Ljava/util/List;", "h", "()Ljava/util/List;", "c", "MessageView", "Rule", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Validation implements Parcelable {

        @k
        public static final Parcelable.Creator<Validation> CREATOR = new a();

        @c(AttachMenuItem.File.EXTENSIONS)
        @l
        private final List<String> extensions;

        @c("max")
        @l
        private final Integer max;

        @c("message")
        @l
        private final String message;

        @c("messageView")
        @l
        private final MessageView messageView;

        @c("min")
        @l
        private final Integer min;

        @c("rule")
        @l
        private final Rule rule;

        @c("values")
        @l
        private final List<String> values;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: RatingFormField.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Validation$MessageView;", "", "(Ljava/lang/String;I)V", "TOAST", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MessageView {

            @c("toast")
            public static final MessageView TOAST;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ MessageView[] f247995b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f247996c;

            static {
                MessageView messageView = new MessageView("TOAST", 0);
                TOAST = messageView;
                MessageView[] messageViewArr = {messageView};
                f247995b = messageViewArr;
                f247996c = kotlin.enums.c.a(messageViewArr);
            }

            private MessageView(String str, int i12) {
            }

            public static MessageView valueOf(String str) {
                return (MessageView) Enum.valueOf(MessageView.class, str);
            }

            public static MessageView[] values() {
                return (MessageView[]) f247995b.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: RatingFormField.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Validation$Rule;", "", "(Ljava/lang/String;I)V", "REQUIRED", "RANGE", "LENGTH", "FILE_EXTENSIONS", "FILE_SIZE", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Rule {

            @c("fileExtensions")
            public static final Rule FILE_EXTENSIONS;

            @c("fileSize")
            public static final Rule FILE_SIZE;

            @c("length")
            public static final Rule LENGTH;

            @c("range")
            public static final Rule RANGE;

            @c("required")
            public static final Rule REQUIRED;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Rule[] f247997b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f247998c;

            static {
                Rule rule = new Rule("REQUIRED", 0);
                REQUIRED = rule;
                Rule rule2 = new Rule("RANGE", 1);
                RANGE = rule2;
                Rule rule3 = new Rule("LENGTH", 2);
                LENGTH = rule3;
                Rule rule4 = new Rule("FILE_EXTENSIONS", 3);
                FILE_EXTENSIONS = rule4;
                Rule rule5 = new Rule("FILE_SIZE", 4);
                FILE_SIZE = rule5;
                Rule[] ruleArr = {rule, rule2, rule3, rule4, rule5};
                f247997b = ruleArr;
                f247998c = kotlin.enums.c.a(ruleArr);
            }

            private Rule(String str, int i12) {
            }

            public static Rule valueOf(String str) {
                return (Rule) Enum.valueOf(Rule.class, str);
            }

            public static Rule[] values() {
                return (Rule[]) f247997b.clone();
            }
        }

        /* compiled from: RatingFormField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Validation> {
            @Override // android.os.Parcelable.Creator
            public final Validation createFromParcel(Parcel parcel) {
                return new Validation(parcel.readInt() == 0 ? null : Rule.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : MessageView.valueOf(parcel.readString()), parcel.createStringArrayList(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Validation[] newArray(int i12) {
                return new Validation[i12];
            }
        }

        public Validation(@l Rule rule, @l Integer num, @l Integer num2, @l String str, @l MessageView messageView, @l List<String> list, @l List<String> list2) {
            this.rule = rule;
            this.min = num;
            this.max = num2;
            this.message = str;
            this.messageView = messageView;
            this.values = list;
            this.extensions = list2;
        }

        @l
        public final List<String> c() {
            return this.extensions;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Integer getMax() {
            return this.max;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final MessageView getMessageView() {
            return this.messageView;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Validation)) {
                return false;
            }
            Validation validation = (Validation) obj;
            return this.rule == validation.rule && L.f(this.min, validation.min) && L.f(this.max, validation.max) && L.f(this.message, validation.message) && this.messageView == validation.messageView && L.f(this.values, validation.values) && L.f(this.extensions, validation.extensions);
        }

        @l
        /* renamed from: f, reason: from getter */
        public final Integer getMin() {
            return this.min;
        }

        @l
        /* renamed from: g, reason: from getter */
        public final Rule getRule() {
            return this.rule;
        }

        @l
        public final String getMessage() {
            return this.message;
        }

        @l
        public final List<String> h() {
            return this.values;
        }

        public final int hashCode() {
            Rule rule = this.rule;
            int iHashCode = (rule == null ? 0 : rule.hashCode()) * 31;
            Integer num = this.min;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.max;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.message;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            MessageView messageView = this.messageView;
            int iHashCode5 = (iHashCode4 + (messageView == null ? 0 : messageView.hashCode())) * 31;
            List<String> list = this.values;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.extensions;
            return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Validation(rule=");
            sb2.append(this.rule);
            sb2.append(", min=");
            sb2.append(this.min);
            sb2.append(", max=");
            sb2.append(this.max);
            sb2.append(", message=");
            sb2.append(this.message);
            sb2.append(", messageView=");
            sb2.append(this.messageView);
            sb2.append(", values=");
            sb2.append(this.values);
            sb2.append(", extensions=");
            return H.p(sb2, this.extensions, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Rule rule = this.rule;
            if (rule == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(rule.name());
            }
            Integer num = this.min;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.max;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
            parcel.writeString(this.message);
            MessageView messageView = this.messageView;
            if (messageView == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(messageView.name());
            }
            parcel.writeStringList(this.values);
            parcel.writeStringList(this.extensions);
        }
    }

    /* compiled from: RatingFormField.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Value;", "Landroid/os/Parcelable;", "", "label", "description", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getDescription", "getValue", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Value implements Parcelable {

        @k
        public static final Parcelable.Creator<Value> CREATOR = new a();

        @c("description")
        @l
        private final String description;

        @c("label")
        @k
        private final String label;

        @c("value")
        @k
        private final String value;

        /* compiled from: RatingFormField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Value> {
            @Override // android.os.Parcelable.Creator
            public final Value createFromParcel(Parcel parcel) {
                return new Value(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Value[] newArray(int i12) {
                return new Value[i12];
            }
        }

        public Value(@k String str, @l String str2, @k String str3) {
            this.label = str;
            this.description = str2;
            this.value = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return L.f(this.label, value.label) && L.f(this.description, value.description) && L.f(this.value, value.value);
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @k
        public final String getLabel() {
            return this.label;
        }

        @k
        public final String getValue() {
            return this.value;
        }

        public final int hashCode() {
            int iHashCode = this.label.hashCode() * 31;
            String str = this.description;
            return this.value.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Value(label=");
            sb2.append(this.label);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", value=");
            return C22026a.c(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.label);
            parcel.writeString(this.description);
            parcel.writeString(this.value);
        }
    }

    /* compiled from: RatingFormField.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType;", "Landroid/os/Parcelable;", "()V", "IntArrayValue", "LongArrayValue", "LongValue", "StringArrayValue", "StringValue", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType$IntArrayValue;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType$LongArrayValue;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType$LongValue;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType$StringArrayValue;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType$StringValue;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class ValueType implements Parcelable {

        /* compiled from: RatingFormField.kt */
        @InterfaceC19823a
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType$IntArrayValue;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class IntArrayValue extends ValueType {

            @k
            public static final Parcelable.Creator<IntArrayValue> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Object f247999b;

            /* compiled from: RatingFormField.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<IntArrayValue> {
                @Override // android.os.Parcelable.Creator
                public final IntArrayValue createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iD2 = 0;
                    while (iD2 != i12) {
                        iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList, iD2, 1);
                    }
                    return new IntArrayValue(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final IntArrayValue[] newArray(int i12) {
                    return new IntArrayValue[i12];
                }
            }

            public IntArrayValue(@k List<Integer> list) {
                super(null);
                this.f247999b = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof IntArrayValue) && L.f(this.f247999b, ((IntArrayValue) obj).f247999b);
            }

            public final int hashCode() {
                return this.f247999b.hashCode();
            }

            @k
            public final String toString() {
                return H.n(new StringBuilder("IntArrayValue(value="), this.f247999b, ')');
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                ?? r32 = this.f247999b;
                parcel.writeInt(r32.size());
                Iterator it = r32.iterator();
                while (it.hasNext()) {
                    parcel.writeInt(((Number) it.next()).intValue());
                }
            }
        }

        /* compiled from: RatingFormField.kt */
        @InterfaceC19825c
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType$LongArrayValue;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class LongArrayValue extends ValueType {

            @k
            public static final Parcelable.Creator<LongArrayValue> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ArrayList f248000b;

            /* compiled from: RatingFormField.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<LongArrayValue> {
                @Override // android.os.Parcelable.Creator
                public final LongArrayValue createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        arrayList.add(Long.valueOf(parcel.readLong()));
                    }
                    return new LongArrayValue(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final LongArrayValue[] newArray(int i12) {
                    return new LongArrayValue[i12];
                }
            }

            public LongArrayValue(@k ArrayList arrayList) {
                super(null);
                this.f248000b = arrayList;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LongArrayValue) && L.f(this.f248000b, ((LongArrayValue) obj).f248000b);
            }

            public final int hashCode() {
                return this.f248000b.hashCode();
            }

            @k
            public final String toString() {
                return e.p(new StringBuilder("LongArrayValue(value="), this.f248000b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                Iterator itZ = com.avito.android.actions_sheet.a.z(this.f248000b, parcel);
                while (itZ.hasNext()) {
                    parcel.writeLong(((Number) itZ.next()).longValue());
                }
            }
        }

        /* compiled from: RatingFormField.kt */
        @InterfaceC19823a
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType$LongValue;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class LongValue extends ValueType {

            @k
            public static final Parcelable.Creator<LongValue> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final long f248001b;

            /* compiled from: RatingFormField.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<LongValue> {
                @Override // android.os.Parcelable.Creator
                public final LongValue createFromParcel(Parcel parcel) {
                    return new LongValue(parcel.readLong());
                }

                @Override // android.os.Parcelable.Creator
                public final LongValue[] newArray(int i12) {
                    return new LongValue[i12];
                }
            }

            public LongValue(long j12) {
                super(null);
                this.f248001b = j12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LongValue) && this.f248001b == ((LongValue) obj).f248001b;
            }

            public final int hashCode() {
                return Long.hashCode(this.f248001b);
            }

            @k
            public final String toString() {
                return r.u(new StringBuilder("LongValue(value="), this.f248001b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeLong(this.f248001b);
            }
        }

        /* compiled from: RatingFormField.kt */
        @InterfaceC19823a
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType$StringArrayValue;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class StringArrayValue extends ValueType {

            @k
            public static final Parcelable.Creator<StringArrayValue> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Object f248002b;

            /* compiled from: RatingFormField.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<StringArrayValue> {
                @Override // android.os.Parcelable.Creator
                public final StringArrayValue createFromParcel(Parcel parcel) {
                    return new StringArrayValue(parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                public final StringArrayValue[] newArray(int i12) {
                    return new StringArrayValue[i12];
                }
            }

            public StringArrayValue(@k List<String> list) {
                super(null);
                this.f248002b = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StringArrayValue) && L.f(this.f248002b, ((StringArrayValue) obj).f248002b);
            }

            public final int hashCode() {
                return this.f248002b.hashCode();
            }

            @k
            public final String toString() {
                return H.n(new StringBuilder("StringArrayValue(value="), this.f248002b, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeStringList(this.f248002b);
            }
        }

        /* compiled from: RatingFormField.kt */
        @InterfaceC19823a
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType$StringValue;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ValueType;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class StringValue extends ValueType {

            @k
            public static final Parcelable.Creator<StringValue> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f248003b;

            /* compiled from: RatingFormField.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<StringValue> {
                @Override // android.os.Parcelable.Creator
                public final StringValue createFromParcel(Parcel parcel) {
                    return new StringValue(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final StringValue[] newArray(int i12) {
                    return new StringValue[i12];
                }
            }

            public StringValue(@k String str) {
                super(null);
                this.f248003b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StringValue) && L.f(this.f248003b, ((StringValue) obj).f248003b);
            }

            public final int hashCode() {
                return this.f248003b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("StringValue(value="), this.f248003b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f248003b);
            }
        }

        public /* synthetic */ ValueType(C42822w c42822w) {
            this();
        }

        public ValueType() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RatingFormField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ViewAction;", "", "(Ljava/lang/String;I)V", "PHOTO_PICKER_OPEN", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ViewAction {

        @c("photopickerOpen")
        public static final ViewAction PHOTO_PICKER_OPEN;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ViewAction[] f248004b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f248005c;

        static {
            ViewAction viewAction = new ViewAction("PHOTO_PICKER_OPEN", 0);
            PHOTO_PICKER_OPEN = viewAction;
            ViewAction[] viewActionArr = {viewAction};
            f248004b = viewActionArr;
            f248005c = kotlin.enums.c.a(viewActionArr);
        }

        private ViewAction(String str, int i12) {
        }

        public static ViewAction valueOf(String str) {
            return (ViewAction) Enum.valueOf(ViewAction.class, str);
        }

        public static ViewAction[] values() {
            return (ViewAction[]) f248004b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RatingFormField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField$ViewType;", "", "(Ljava/lang/String;I)V", "INPUT_NUMBER", "INPUT_TEXT", "TEXTAREA", "SCORE", "SELECT", "ADDRESS", "DEVELOPMENT", "CHECKBOX", "RADIO_BUTTON", "IMAGES", "ITEMS", "FILES", "CHIPS", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ViewType {

        @c("selectAddress")
        public static final ViewType ADDRESS;

        @c("checkbox")
        public static final ViewType CHECKBOX;

        @c("chips")
        public static final ViewType CHIPS;

        @c("selectDevelopment")
        public static final ViewType DEVELOPMENT;

        @c("files")
        public static final ViewType FILES;

        @c("images")
        public static final ViewType IMAGES;

        @c("inputNumber")
        public static final ViewType INPUT_NUMBER;

        @c("inputText")
        public static final ViewType INPUT_TEXT;

        @c("items")
        public static final ViewType ITEMS;

        @c("radiobutton")
        public static final ViewType RADIO_BUTTON;

        @c("score")
        public static final ViewType SCORE;

        @c("select")
        public static final ViewType SELECT;

        @c("textarea")
        public static final ViewType TEXTAREA;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ViewType[] f248006b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f248007c;

        static {
            ViewType viewType = new ViewType("INPUT_NUMBER", 0);
            INPUT_NUMBER = viewType;
            ViewType viewType2 = new ViewType("INPUT_TEXT", 1);
            INPUT_TEXT = viewType2;
            ViewType viewType3 = new ViewType("TEXTAREA", 2);
            TEXTAREA = viewType3;
            ViewType viewType4 = new ViewType("SCORE", 3);
            SCORE = viewType4;
            ViewType viewType5 = new ViewType("SELECT", 4);
            SELECT = viewType5;
            ViewType viewType6 = new ViewType("ADDRESS", 5);
            ADDRESS = viewType6;
            ViewType viewType7 = new ViewType("DEVELOPMENT", 6);
            DEVELOPMENT = viewType7;
            ViewType viewType8 = new ViewType("CHECKBOX", 7);
            CHECKBOX = viewType8;
            ViewType viewType9 = new ViewType("RADIO_BUTTON", 8);
            RADIO_BUTTON = viewType9;
            ViewType viewType10 = new ViewType("IMAGES", 9);
            IMAGES = viewType10;
            ViewType viewType11 = new ViewType("ITEMS", 10);
            ITEMS = viewType11;
            ViewType viewType12 = new ViewType("FILES", 11);
            FILES = viewType12;
            ViewType viewType13 = new ViewType("CHIPS", 12);
            CHIPS = viewType13;
            ViewType[] viewTypeArr = {viewType, viewType2, viewType3, viewType4, viewType5, viewType6, viewType7, viewType8, viewType9, viewType10, viewType11, viewType12, viewType13};
            f248006b = viewTypeArr;
            f248007c = kotlin.enums.c.a(viewTypeArr);
        }

        private ViewType(String str, int i12) {
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) f248006b.clone();
        }
    }

    /* compiled from: RatingFormField.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingFormField> {
        @Override // android.os.Parcelable.Creator
        public final RatingFormField createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            ArrayList arrayList3;
            int i12 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            DataType dataTypeValueOf = DataType.valueOf(parcel.readString());
            EntityType entityTypeValueOf = EntityType.valueOf(parcel.readString());
            ViewType viewTypeValueOf = ViewType.valueOf(parcel.readString());
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = com.avito.android.actions_sheet.a.c(Value.CREATOR, parcel, arrayList4, iC3, 1);
                }
                arrayList = arrayList4;
            }
            ValueType valueType = (ValueType) parcel.readParcelable(RatingFormField.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Description descriptionCreateFromParcel = parcel.readInt() == 0 ? null : Description.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i14);
                int iC4 = 0;
                while (iC4 != i14) {
                    iC4 = com.avito.android.actions_sheet.a.c(Validation.CREATOR, parcel, arrayList5, iC4, 1);
                }
                arrayList2 = arrayList5;
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            MaskType maskTypeValueOf = parcel.readInt() == 0 ? null : MaskType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i15 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i15);
                int iC5 = 0;
                while (iC5 != i15) {
                    iC5 = h.c(RatingFormField.class, parcel, linkedHashMap3, parcel.readString(), iC5, 1);
                    linkedHashMap3 = linkedHashMap3;
                    i15 = i15;
                }
                linkedHashMap = linkedHashMap3;
            }
            AttributedText attributedText = (AttributedText) parcel.readParcelable(RatingFormField.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i16 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    linkedHashMap4.put(ViewAction.valueOf(parcel.readString()), parcel.readParcelable(RatingFormField.class.getClassLoader()));
                }
                linkedHashMap2 = linkedHashMap4;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i18 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i18);
                while (iC2 != i18) {
                    iC2 = com.avito.android.actions_sheet.a.c(FileInfo.CREATOR, parcel, arrayList6, iC2, 1);
                }
                arrayList3 = arrayList6;
            }
            return new RatingFormField(i12, string, string2, dataTypeValueOf, entityTypeValueOf, viewTypeValueOf, arrayList, valueType, string3, string4, descriptionCreateFromParcel, arrayList2, numValueOf, z12, z13, string5, string6, maskTypeValueOf, linkedHashMap, attributedText, linkedHashMap2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingFormField[] newArray(int i12) {
            return new RatingFormField[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RatingFormField(int i12, @k String str, @l String str2, @k DataType dataType, @k EntityType entityType, @k ViewType viewType, @l List<Value> list, @l ValueType valueType, @l String str3, @l String str4, @l Description description, @l List<Validation> list2, @l Integer num, boolean z12, boolean z13, @l String str5, @l String str6, @l MaskType maskType, @l Map<String, ? extends Object> map, @l AttributedText attributedText, @l Map<ViewAction, ? extends DeepLink> map2, @l List<FileInfo> list3) {
        super(null);
        this.id = i12;
        this.slug = str;
        this.title = str2;
        this.dataType = dataType;
        this.entityType = entityType;
        this.viewType = viewType;
        this.values = list;
        this.value = valueType;
        this.placeholder = str3;
        this.helpText = str4;
        this.description = description;
        this.validations = list2;
        this.maxSymbolLimit = num;
        this.sendOnChange = z12;
        this.disabled = z13;
        this.errorText = str5;
        this.hintText = str6;
        this.inputMaskType = maskType;
        this.customParams = map;
        this.attributedText = attributedText;
        this.analytics = map2;
        this.files = list3;
    }

    public static RatingFormField a(RatingFormField ratingFormField, List list, ValueType valueType, boolean z12, int i12) {
        int i13 = ratingFormField.id;
        String str = ratingFormField.slug;
        String str2 = ratingFormField.title;
        DataType dataType = ratingFormField.dataType;
        EntityType entityType = ratingFormField.entityType;
        ViewType viewType = ratingFormField.viewType;
        List list2 = (i12 & 64) != 0 ? ratingFormField.values : list;
        ValueType valueType2 = (i12 & 128) != 0 ? ratingFormField.value : valueType;
        String str3 = ratingFormField.placeholder;
        String str4 = ratingFormField.helpText;
        Description description = ratingFormField.description;
        List<Validation> list3 = ratingFormField.validations;
        Integer num = ratingFormField.maxSymbolLimit;
        boolean z13 = ratingFormField.sendOnChange;
        boolean z14 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? ratingFormField.disabled : z12;
        String str5 = ratingFormField.errorText;
        String str6 = ratingFormField.hintText;
        MaskType maskType = ratingFormField.inputMaskType;
        Map<String, Object> map = ratingFormField.customParams;
        AttributedText attributedText = ratingFormField.attributedText;
        Map<ViewAction, DeepLink> map2 = ratingFormField.analytics;
        List<FileInfo> list4 = ratingFormField.files;
        ratingFormField.getClass();
        return new RatingFormField(i13, str, str2, dataType, entityType, viewType, list2, valueType2, str3, str4, description, list3, num, z13, z14, str5, str6, maskType, map, attributedText, map2, list4);
    }

    @l
    public final Map<ViewAction, DeepLink> c() {
        return this.analytics;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getAttributedText() {
        return this.attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final Map<String, Object> e() {
        return this.customParams;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingFormField)) {
            return false;
        }
        RatingFormField ratingFormField = (RatingFormField) obj;
        return this.id == ratingFormField.id && L.f(this.slug, ratingFormField.slug) && L.f(this.title, ratingFormField.title) && this.dataType == ratingFormField.dataType && this.entityType == ratingFormField.entityType && this.viewType == ratingFormField.viewType && L.f(this.values, ratingFormField.values) && L.f(this.value, ratingFormField.value) && L.f(this.placeholder, ratingFormField.placeholder) && L.f(this.helpText, ratingFormField.helpText) && L.f(this.description, ratingFormField.description) && L.f(this.validations, ratingFormField.validations) && L.f(this.maxSymbolLimit, ratingFormField.maxSymbolLimit) && this.sendOnChange == ratingFormField.sendOnChange && this.disabled == ratingFormField.disabled && L.f(this.errorText, ratingFormField.errorText) && L.f(this.hintText, ratingFormField.hintText) && this.inputMaskType == ratingFormField.inputMaskType && L.f(this.customParams, ratingFormField.customParams) && L.f(this.attributedText, ratingFormField.attributedText) && L.f(this.analytics, ratingFormField.analytics) && L.f(this.files, ratingFormField.files);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final DataType getDataType() {
        return this.dataType;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Description getDescription() {
        return this.description;
    }

    @l
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @k
    public final String getSlug() {
        return this.slug;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    public final int hashCode() {
        int iD2 = H.d(Integer.hashCode(this.id) * 31, 31, this.slug);
        String str = this.title;
        int iHashCode = (this.viewType.hashCode() + ((this.entityType.hashCode() + ((this.dataType.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        List<Value> list = this.values;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ValueType valueType = this.value;
        int iHashCode3 = (iHashCode2 + (valueType == null ? 0 : valueType.hashCode())) * 31;
        String str2 = this.placeholder;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.helpText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Description description = this.description;
        int iHashCode6 = (iHashCode5 + (description == null ? 0 : description.hashCode())) * 31;
        List<Validation> list2 = this.validations;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.maxSymbolLimit;
        int i12 = r.i(r.i((iHashCode7 + (num == null ? 0 : num.hashCode())) * 31, 31, this.sendOnChange), 31, this.disabled);
        String str4 = this.errorText;
        int iHashCode8 = (i12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hintText;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        MaskType maskType = this.inputMaskType;
        int iHashCode10 = (iHashCode9 + (maskType == null ? 0 : maskType.hashCode())) * 31;
        Map<String, Object> map = this.customParams;
        int iHashCode11 = (iHashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        AttributedText attributedText = this.attributedText;
        int iHashCode12 = (iHashCode11 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Map<ViewAction, DeepLink> map2 = this.analytics;
        int iHashCode13 = (iHashCode12 + (map2 == null ? 0 : map2.hashCode())) * 31;
        List<FileInfo> list3 = this.files;
        return iHashCode13 + (list3 != null ? list3.hashCode() : 0);
    }

    @k
    /* renamed from: i, reason: from getter */
    public final EntityType getEntityType() {
        return this.entityType;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final String getErrorText() {
        return this.errorText;
    }

    @k
    public final FieldIdentifier k() {
        return new FieldIdentifier(this.id, this.slug);
    }

    @l
    public final List<FileInfo> l() {
        return this.files;
    }

    @l
    /* renamed from: m, reason: from getter */
    public final String getHelpText() {
        return this.helpText;
    }

    @l
    /* renamed from: n, reason: from getter */
    public final String getHintText() {
        return this.hintText;
    }

    /* renamed from: o, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @l
    /* renamed from: p, reason: from getter */
    public final MaskType getInputMaskType() {
        return this.inputMaskType;
    }

    @l
    /* renamed from: q, reason: from getter */
    public final Integer getMaxSymbolLimit() {
        return this.maxSymbolLimit;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getSendOnChange() {
        return this.sendOnChange;
    }

    @l
    public final List<Validation> s() {
        return this.validations;
    }

    @l
    /* renamed from: t, reason: from getter */
    public final ValueType getValue() {
        return this.value;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingFormField(id=");
        sb2.append(this.id);
        sb2.append(", slug=");
        sb2.append(this.slug);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", dataType=");
        sb2.append(this.dataType);
        sb2.append(", entityType=");
        sb2.append(this.entityType);
        sb2.append(", viewType=");
        sb2.append(this.viewType);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", helpText=");
        sb2.append(this.helpText);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", validations=");
        sb2.append(this.validations);
        sb2.append(", maxSymbolLimit=");
        sb2.append(this.maxSymbolLimit);
        sb2.append(", sendOnChange=");
        sb2.append(this.sendOnChange);
        sb2.append(", disabled=");
        sb2.append(this.disabled);
        sb2.append(", errorText=");
        sb2.append(this.errorText);
        sb2.append(", hintText=");
        sb2.append(this.hintText);
        sb2.append(", inputMaskType=");
        sb2.append(this.inputMaskType);
        sb2.append(", customParams=");
        sb2.append(this.customParams);
        sb2.append(", attributedText=");
        sb2.append(this.attributedText);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", files=");
        return H.p(sb2, this.files, ')');
    }

    @l
    public final List<Value> u() {
        return this.values;
    }

    @k
    /* renamed from: v, reason: from getter */
    public final ViewType getViewType() {
        return this.viewType;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.id);
        parcel.writeString(this.slug);
        parcel.writeString(this.title);
        parcel.writeString(this.dataType.name());
        parcel.writeString(this.entityType.name());
        parcel.writeString(this.viewType.name());
        List<Value> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Value) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.value, i12);
        parcel.writeString(this.placeholder);
        parcel.writeString(this.helpText);
        Description description = this.description;
        if (description == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            description.writeToParcel(parcel, i12);
        }
        List<Validation> list2 = this.validations;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((Validation) itA2.next()).writeToParcel(parcel, i12);
            }
        }
        Integer num = this.maxSymbolLimit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.sendOnChange ? 1 : 0);
        parcel.writeInt(this.disabled ? 1 : 0);
        parcel.writeString(this.errorText);
        parcel.writeString(this.hintText);
        MaskType maskType = this.inputMaskType;
        if (maskType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(maskType.name());
        }
        Map<String, Object> map = this.customParams;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        parcel.writeParcelable(this.attributedText, i12);
        Map<ViewAction, DeepLink> map2 = this.analytics;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH2 = C0.h(parcel, 1, map2);
            while (itH2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itH2.next();
                parcel.writeString(((ViewAction) entry2.getKey()).name());
                parcel.writeParcelable((Parcelable) entry2.getValue(), i12);
            }
        }
        List<FileInfo> list3 = this.files;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
        while (itA3.hasNext()) {
            ((FileInfo) itA3.next()).writeToParcel(parcel, i12);
        }
    }
}
