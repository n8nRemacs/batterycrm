package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFairPrice.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/AdvertDetailsFairPrice;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AdvertDetailsFairPrice$Explanation;", "explanation", "Lcom/avito/android/remote/model/AdvertDetailsFairPrice$Icon;", "icon", "", "linkText", "<init>", "(Lcom/avito/android/remote/model/AdvertDetailsFairPrice$Explanation;Lcom/avito/android/remote/model/AdvertDetailsFairPrice$Icon;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/AdvertDetailsFairPrice$Explanation;", "getExplanation", "()Lcom/avito/android/remote/model/AdvertDetailsFairPrice$Explanation;", "Lcom/avito/android/remote/model/AdvertDetailsFairPrice$Icon;", "getIcon", "()Lcom/avito/android/remote/model/AdvertDetailsFairPrice$Icon;", "Ljava/lang/String;", "getLinkText", "()Ljava/lang/String;", "Explanation", "Icon", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertDetailsFairPrice implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDetailsFairPrice> CREATOR = new Creator();

    @c("explanation")
    @l
    private final Explanation explanation;

    @c("icon")
    @l
    private final Icon icon;

    @c("linkText")
    @l
    private final String linkText;

    /* compiled from: AdvertDetailsFairPrice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertDetailsFairPrice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsFairPrice createFromParcel(@k Parcel parcel) {
            return new AdvertDetailsFairPrice(parcel.readInt() == 0 ? null : Explanation.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Icon.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsFairPrice[] newArray(int i12) {
            return new AdvertDetailsFairPrice[i12];
        }
    }

    /* compiled from: AdvertDetailsFairPrice.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/AdvertDetailsFairPrice$Explanation;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AdvertDetailsFairPrice$Explanation$ActionButton;", "button", "", "", "texts", "title", "<init>", "(Lcom/avito/android/remote/model/AdvertDetailsFairPrice$Explanation$ActionButton;Ljava/util/List;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/AdvertDetailsFairPrice$Explanation$ActionButton;", "getButton", "()Lcom/avito/android/remote/model/AdvertDetailsFairPrice$Explanation$ActionButton;", "Ljava/util/List;", "getTexts", "()Ljava/util/List;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "ActionButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Explanation implements Parcelable {

        @k
        public static final Parcelable.Creator<Explanation> CREATOR = new Creator();

        @c("button")
        @l
        private final ActionButton button;

        @c("texts")
        @l
        private final List<String> texts;

        @c("title")
        @l
        private final String title;

        /* compiled from: AdvertDetailsFairPrice.kt */
        @d
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/AdvertDetailsFairPrice$Explanation$ActionButton;", "Landroid/os/Parcelable;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "text", "Lcom/avito/android/deep_linking/links/DeepLink;", "buttonUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStyle", "()Ljava/lang/String;", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getButtonUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ActionButton implements Parcelable {

            @k
            public static final Parcelable.Creator<ActionButton> CREATOR = new Creator();

            @c("buttonUri")
            @l
            private final DeepLink buttonUri;

            @c("buttonStyle")
            @l
            private final String style;

            @c("buttonText")
            @l
            private final String text;

            /* compiled from: AdvertDetailsFairPrice.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ActionButton> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ActionButton createFromParcel(@k Parcel parcel) {
                    return new ActionButton(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ActionButton.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ActionButton[] newArray(int i12) {
                    return new ActionButton[i12];
                }
            }

            public ActionButton(@l String str, @l String str2, @l DeepLink deepLink) {
                this.style = str;
                this.text = str2;
                this.buttonUri = deepLink;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final DeepLink getButtonUri() {
                return this.buttonUri;
            }

            @l
            public final String getStyle() {
                return this.style;
            }

            @l
            public final String getText() {
                return this.text;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.style);
                parcel.writeString(this.text);
                parcel.writeParcelable(this.buttonUri, flags);
            }
        }

        /* compiled from: AdvertDetailsFairPrice.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Explanation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Explanation createFromParcel(@k Parcel parcel) {
                return new Explanation(parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Explanation[] newArray(int i12) {
                return new Explanation[i12];
            }
        }

        public Explanation(@l ActionButton actionButton, @l List<String> list, @l String str) {
            this.button = actionButton;
            this.texts = list;
            this.title = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final ActionButton getButton() {
            return this.button;
        }

        @l
        public final List<String> getTexts() {
            return this.texts;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            ActionButton actionButton = this.button;
            if (actionButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                actionButton.writeToParcel(parcel, flags);
            }
            parcel.writeStringList(this.texts);
            parcel.writeString(this.title);
        }
    }

    /* compiled from: AdvertDetailsFairPrice.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/AdvertDetailsFairPrice$Icon;", "Landroid/os/Parcelable;", "", "color", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getColor", "()Ljava/lang/String;", "getName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Icon implements Parcelable {

        @k
        public static final Parcelable.Creator<Icon> CREATOR = new Creator();

        @c("color")
        @l
        private final String color;

        @c("name")
        @l
        private final String name;

        /* compiled from: AdvertDetailsFairPrice.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Icon> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Icon createFromParcel(@k Parcel parcel) {
                return new Icon(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Icon[] newArray(int i12) {
                return new Icon[i12];
            }
        }

        public Icon(@l String str, @l String str2) {
            this.color = str;
            this.name = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getColor() {
            return this.color;
        }

        @l
        public final String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.color);
            parcel.writeString(this.name);
        }
    }

    public AdvertDetailsFairPrice(@l Explanation explanation, @l Icon icon, @l String str) {
        this.explanation = explanation;
        this.icon = icon;
        this.linkText = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Explanation getExplanation() {
        return this.explanation;
    }

    @l
    public final Icon getIcon() {
        return this.icon;
    }

    @l
    public final String getLinkText() {
        return this.linkText;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Explanation explanation = this.explanation;
        if (explanation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            explanation.writeToParcel(parcel, flags);
        }
        Icon icon = this.icon;
        if (icon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            icon.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.linkText);
    }
}
