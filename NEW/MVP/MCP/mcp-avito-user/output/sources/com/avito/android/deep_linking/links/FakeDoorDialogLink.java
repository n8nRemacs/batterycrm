package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: FakeDoorDialogLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/FakeDoorDialogLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "ButtonStyle", "DialogButton", "Stage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class FakeDoorDialogLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<FakeDoorDialogLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133323b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133324c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<Stage> f133325d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f133326e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FakeDoorDialogLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/FakeDoorDialogLink$ButtonStyle;", "", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ButtonStyle {

        @com.google.gson.annotations.c("primary")
        public static final ButtonStyle PRIMARY;

        @com.google.gson.annotations.c("secondary")
        public static final ButtonStyle SECONDARY;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ButtonStyle[] f133327b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133328c;

        static {
            ButtonStyle buttonStyle = new ButtonStyle("PRIMARY", 0);
            PRIMARY = buttonStyle;
            ButtonStyle buttonStyle2 = new ButtonStyle("SECONDARY", 1);
            SECONDARY = buttonStyle2;
            ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
            f133327b = buttonStyleArr;
            f133328c = kotlin.enums.c.a(buttonStyleArr);
        }

        private ButtonStyle(String str, int i12) {
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) f133327b.clone();
        }
    }

    /* compiled from: FakeDoorDialogLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/deep_linking/links/FakeDoorDialogLink$DialogButton;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "", "text", "Lcom/avito/android/deep_linking/links/FakeDoorDialogLink$ButtonStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/deep_linking/links/FakeDoorDialogLink$ButtonStyle;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/FakeDoorDialogLink$ButtonStyle;", "c", "()Lcom/avito/android/deep_linking/links/FakeDoorDialogLink$ButtonStyle;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DialogButton implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<DialogButton> CREATOR = new a();

        @com.google.gson.annotations.c("action")
        @Y61.l
        private final DeepLink action;

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @Y61.k
        private final ButtonStyle style;

        @com.google.gson.annotations.c("text")
        @Y61.k
        private final String text;

        /* compiled from: FakeDoorDialogLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DialogButton> {
            @Override // android.os.Parcelable.Creator
            public final DialogButton createFromParcel(Parcel parcel) {
                return new DialogButton((DeepLink) parcel.readParcelable(DialogButton.class.getClassLoader()), parcel.readString(), ButtonStyle.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final DialogButton[] newArray(int i12) {
                return new DialogButton[i12];
            }
        }

        public DialogButton(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.k ButtonStyle buttonStyle) {
            this.action = deepLink;
            this.text = str;
            this.style = buttonStyle;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final ButtonStyle getStyle() {
            return this.style;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DialogButton)) {
                return false;
            }
            DialogButton dialogButton = (DialogButton) obj;
            return kotlin.jvm.internal.L.f(this.action, dialogButton.action) && kotlin.jvm.internal.L.f(this.text, dialogButton.text) && this.style == dialogButton.style;
        }

        @Y61.l
        public final DeepLink getAction() {
            return this.action;
        }

        @Y61.k
        public final String getText() {
            return this.text;
        }

        public final int hashCode() {
            DeepLink deepLink = this.action;
            return this.style.hashCode() + androidx.compose.foundation.H.d((deepLink == null ? 0 : deepLink.hashCode()) * 31, 31, this.text);
        }

        @Y61.k
        public final String toString() {
            return "DialogButton(action=" + this.action + ", text=" + this.text + ", style=" + this.style + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.action, i12);
            parcel.writeString(this.text);
            parcel.writeString(this.style.name());
        }
    }

    /* compiled from: FakeDoorDialogLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/deep_linking/links/FakeDoorDialogLink$Stage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "content", "", "Lcom/avito/android/deep_linking/links/FakeDoorDialogLink$DialogButton;", "buttons", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Stage implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Stage> CREATOR = new a();

        @com.google.gson.annotations.c("buttons")
        @Y61.k
        private final List<DialogButton> buttons;

        @com.google.gson.annotations.c("content")
        @Y61.l
        private final AttributedText content;

        /* compiled from: FakeDoorDialogLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Stage> {
            @Override // android.os.Parcelable.Creator
            public final Stage createFromParcel(Parcel parcel) {
                AttributedText attributedText = (AttributedText) parcel.readParcelable(Stage.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(DialogButton.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Stage(attributedText, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Stage[] newArray(int i12) {
                return new Stage[i12];
            }
        }

        public Stage(@Y61.l AttributedText attributedText, @Y61.k List<DialogButton> list) {
            this.content = attributedText;
            this.buttons = list;
        }

        @Y61.k
        public final List<DialogButton> c() {
            return this.buttons;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final AttributedText getContent() {
            return this.content;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Stage)) {
                return false;
            }
            Stage stage = (Stage) obj;
            return kotlin.jvm.internal.L.f(this.content, stage.content) && kotlin.jvm.internal.L.f(this.buttons, stage.buttons);
        }

        public final int hashCode() {
            AttributedText attributedText = this.content;
            return this.buttons.hashCode() + ((attributedText == null ? 0 : attributedText.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Stage(content=");
            sb2.append(this.content);
            sb2.append(", buttons=");
            return androidx.compose.foundation.H.p(sb2, this.buttons, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.content, i12);
            Iterator itJ = C0.j(this.buttons, parcel);
            while (itJ.hasNext()) {
                ((DialogButton) itJ.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: FakeDoorDialogLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FakeDoorDialogLink> {
        @Override // android.os.Parcelable.Creator
        public final FakeDoorDialogLink createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iA2 = 0;
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Stage.CREATOR, parcel, arrayList, iC2, 1);
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                while (iA2 != i13) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new FakeDoorDialogLink(string, string2, arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final FakeDoorDialogLink[] newArray(int i12) {
            return new FakeDoorDialogLink[i12];
        }
    }

    public FakeDoorDialogLink(@Y61.k String str, @Y61.l String str2, @Y61.k List<Stage> list, @Y61.l Map<String, String> map) {
        this.f133323b = str;
        this.f133324c = str2;
        this.f133325d = list;
        this.f133326e = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133323b);
        parcel.writeString(this.f133324c);
        Iterator itJ = C0.j(this.f133325d, parcel);
        while (itJ.hasNext()) {
            ((Stage) itJ.next()).writeToParcel(parcel, i12);
        }
        Map<String, String> map = this.f133326e;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
