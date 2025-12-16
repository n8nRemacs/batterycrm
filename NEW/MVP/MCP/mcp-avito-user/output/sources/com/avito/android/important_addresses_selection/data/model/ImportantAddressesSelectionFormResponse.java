package com.avito.android.important_addresses_selection.data.model;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesSelectionFormResponse.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001:\u0003 \u001b\u0015BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse;", "", "", "dialogTitle", "constraintWarning", "", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$a;", "addresses", "", "realtyAddressesMaxCount", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$AdditionalAction;", "additionalAction", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$b;", "dialogButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$AdditionalAction;Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$b;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "f", "()I", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$AdditionalAction;", "a", "()Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$AdditionalAction;", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$b;", "d", "()Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$b;", "AdditionalAction", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImportantAddressesSelectionFormResponse {

    @c("additionalAction")
    @k
    private final AdditionalAction additionalAction;

    @c("addresses")
    @l
    private final List<a> addresses;

    @c("constraintWarning")
    @l
    private final String constraintWarning;

    @c("button")
    @k
    private final b dialogButton;

    @c("title")
    @k
    private final String dialogTitle;

    @c("maxCount")
    private final int realtyAddressesMaxCount;

    /* compiled from: ImportantAddressesSelectionFormResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$AdditionalAction;", "", "Lcom/avito/android/remote/model/text/AttributedText;", RequestReviewResultKt.INFO_TYPE, "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$AdditionalAction$Button;", "button", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$AdditionalAction$Button;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$AdditionalAction$Button;", "a", "()Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$AdditionalAction$Button;", "Button", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdditionalAction {

        @c("button")
        @k
        private final Button button;

        @c(RequestReviewResultKt.INFO_TYPE)
        @l
        private final AttributedText info;

        /* compiled from: ImportantAddressesSelectionFormResponse.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$AdditionalAction$Button;", "", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$AdditionalAction$Button$ButtonType;", "type", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$AdditionalAction$Button$ButtonType;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$AdditionalAction$Button$ButtonType;", "b", "()Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$AdditionalAction$Button$ButtonType;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "ButtonType", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Button {

            @c("text")
            @k
            private final String text;

            @c("type")
            @k
            private final ButtonType type;

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @k
            private final DeepLink uri;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ImportantAddressesSelectionFormResponse.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$AdditionalAction$Button$ButtonType;", "", "(Ljava/lang/String;I)V", "ADD_ADDRESS", "PROFILE", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ButtonType {

                @c("addAddress")
                public static final ButtonType ADD_ADDRESS;

                @c("profile")
                public static final ButtonType PROFILE;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ ButtonType[] f169714b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f169715c;

                static {
                    ButtonType buttonType = new ButtonType("ADD_ADDRESS", 0);
                    ADD_ADDRESS = buttonType;
                    ButtonType buttonType2 = new ButtonType("PROFILE", 1);
                    PROFILE = buttonType2;
                    ButtonType[] buttonTypeArr = {buttonType, buttonType2};
                    f169714b = buttonTypeArr;
                    f169715c = kotlin.enums.c.a(buttonTypeArr);
                }

                private ButtonType(String str, int i12) {
                }

                public static ButtonType valueOf(String str) {
                    return (ButtonType) Enum.valueOf(ButtonType.class, str);
                }

                public static ButtonType[] values() {
                    return (ButtonType[]) f169714b.clone();
                }
            }

            public Button(@k ButtonType buttonType, @k String str, @k DeepLink deepLink) {
                this.type = buttonType;
                this.text = str;
                this.uri = deepLink;
            }

            @k
            /* renamed from: a, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @k
            /* renamed from: b, reason: from getter */
            public final ButtonType getType() {
                return this.type;
            }

            @k
            /* renamed from: c, reason: from getter */
            public final DeepLink getUri() {
                return this.uri;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return this.type == button.type && L.f(this.text, button.text) && L.f(this.uri, button.uri);
            }

            public final int hashCode() {
                return this.uri.hashCode() + H.d(this.type.hashCode() * 31, 31, this.text);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Button(type=");
                sb2.append(this.type);
                sb2.append(", text=");
                sb2.append(this.text);
                sb2.append(", uri=");
                return com.avito.android.actions_sheet.a.v(sb2, this.uri, ')');
            }
        }

        public AdditionalAction(@l AttributedText attributedText, @k Button button) {
            this.info = attributedText;
            this.button = button;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final Button getButton() {
            return this.button;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final AttributedText getInfo() {
            return this.info;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdditionalAction)) {
                return false;
            }
            AdditionalAction additionalAction = (AdditionalAction) obj;
            return L.f(this.info, additionalAction.info) && L.f(this.button, additionalAction.button);
        }

        public final int hashCode() {
            AttributedText attributedText = this.info;
            return this.button.hashCode() + ((attributedText == null ? 0 : attributedText.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "AdditionalAction(info=" + this.info + ", button=" + this.button + ')';
        }
    }

    /* compiled from: ImportantAddressesSelectionFormResponse.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$a;", "", "", "id", "", "title", "location", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$a$a;", "payload", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$a$a;)V", "I", "a", "()I", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$a$a;", "c", "()Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$a$a;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        @c("id")
        private final int id;

        @c("location")
        @k
        private final String location;

        @c("payload")
        @l
        private final C5016a payload;

        @c("title")
        @k
        private final String title;

        /* compiled from: ImportantAddressesSelectionFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$a$a;", "", "", "isUsedInRealtyInfra", "<init>", "(Z)V", "Z", "a", "()Z", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.important_addresses_selection.data.model.ImportantAddressesSelectionFormResponse$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5016a {

            @c("isUsedInRealtyInfra")
            private final boolean isUsedInRealtyInfra;

            public C5016a(boolean z12) {
                this.isUsedInRealtyInfra = z12;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsUsedInRealtyInfra() {
                return this.isUsedInRealtyInfra;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5016a) && this.isUsedInRealtyInfra == ((C5016a) obj).isUsedInRealtyInfra;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.isUsedInRealtyInfra);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("Payload(isUsedInRealtyInfra="), this.isUsedInRealtyInfra, ')');
            }
        }

        public a(int i12, @k String str, @k String str2, @l C5016a c5016a) {
            this.id = i12;
            this.title = str;
            this.location = str2;
            this.payload = c5016a;
        }

        /* renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final C5016a getPayload() {
            return this.payload;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.id == aVar.id && L.f(this.title, aVar.title) && L.f(this.location, aVar.location) && L.f(this.payload, aVar.payload);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.location);
            C5016a c5016a = this.payload;
            return iD2 + (c5016a == null ? 0 : c5016a.hashCode());
        }

        @k
        public final String toString() {
            return "Address(id=" + this.id + ", title=" + this.title + ", location=" + this.location + ", payload=" + this.payload + ')';
        }
    }

    /* compiled from: ImportantAddressesSelectionFormResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesSelectionFormResponse$b;", "", "", "text", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @k
        private final String style;

        @c("text")
        @k
        private final String text;

        public b(@k String str, @k String str2) {
            this.text = str;
            this.style = str2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.text, bVar.text) && L.f(this.style, bVar.style);
        }

        public final int hashCode() {
            return this.style.hashCode() + (this.text.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(text=");
            sb2.append(this.text);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }
    }

    public ImportantAddressesSelectionFormResponse(@k String str, @l String str2, @l List<a> list, int i12, @k AdditionalAction additionalAction, @k b bVar) {
        this.dialogTitle = str;
        this.constraintWarning = str2;
        this.addresses = list;
        this.realtyAddressesMaxCount = i12;
        this.additionalAction = additionalAction;
        this.dialogButton = bVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final AdditionalAction getAdditionalAction() {
        return this.additionalAction;
    }

    @l
    public final List<a> b() {
        return this.addresses;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getConstraintWarning() {
        return this.constraintWarning;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final b getDialogButton() {
        return this.dialogButton;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportantAddressesSelectionFormResponse)) {
            return false;
        }
        ImportantAddressesSelectionFormResponse importantAddressesSelectionFormResponse = (ImportantAddressesSelectionFormResponse) obj;
        return L.f(this.dialogTitle, importantAddressesSelectionFormResponse.dialogTitle) && L.f(this.constraintWarning, importantAddressesSelectionFormResponse.constraintWarning) && L.f(this.addresses, importantAddressesSelectionFormResponse.addresses) && this.realtyAddressesMaxCount == importantAddressesSelectionFormResponse.realtyAddressesMaxCount && L.f(this.additionalAction, importantAddressesSelectionFormResponse.additionalAction) && L.f(this.dialogButton, importantAddressesSelectionFormResponse.dialogButton);
    }

    /* renamed from: f, reason: from getter */
    public final int getRealtyAddressesMaxCount() {
        return this.realtyAddressesMaxCount;
    }

    public final int hashCode() {
        int iHashCode = this.dialogTitle.hashCode() * 31;
        String str = this.constraintWarning;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<a> list = this.addresses;
        return this.dialogButton.hashCode() + ((this.additionalAction.hashCode() + r.e(this.realtyAddressesMaxCount, (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31)) * 31);
    }

    @k
    public final String toString() {
        return "ImportantAddressesSelectionFormResponse(dialogTitle=" + this.dialogTitle + ", constraintWarning=" + this.constraintWarning + ", addresses=" + this.addresses + ", realtyAddressesMaxCount=" + this.realtyAddressesMaxCount + ", additionalAction=" + this.additionalAction + ", dialogButton=" + this.dialogButton + ')';
    }
}
