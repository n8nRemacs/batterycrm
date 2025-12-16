package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MyAdvertAutoSelect.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001f B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\u0005¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/MyAdvertAutoSelect;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/MyAdvertAutoSelect$MyAdvertAutoSelectDialog;", "closeDialog", "<init>", "(Lcom/avito/android/remote/model/MyAdvertAutoSelect$MyAdvertAutoSelectDialog;)V", "component1", "()Lcom/avito/android/remote/model/MyAdvertAutoSelect$MyAdvertAutoSelectDialog;", "copy", "(Lcom/avito/android/remote/model/MyAdvertAutoSelect$MyAdvertAutoSelectDialog;)Lcom/avito/android/remote/model/MyAdvertAutoSelect;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/MyAdvertAutoSelect$MyAdvertAutoSelectDialog;", "getCloseDialog", "setCloseDialog", "MyAdvertAutoSelectButton", "MyAdvertAutoSelectDialog", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MyAdvertAutoSelect implements Parcelable {

    @k
    public static final Parcelable.Creator<MyAdvertAutoSelect> CREATOR = new Creator();

    @c("advertCloseDialog")
    @l
    private MyAdvertAutoSelectDialog closeDialog;

    /* compiled from: MyAdvertAutoSelect.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MyAdvertAutoSelect> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MyAdvertAutoSelect createFromParcel(@k Parcel parcel) {
            return new MyAdvertAutoSelect(parcel.readInt() == 0 ? null : MyAdvertAutoSelectDialog.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MyAdvertAutoSelect[] newArray(int i12) {
            return new MyAdvertAutoSelect[i12];
        }
    }

    /* compiled from: MyAdvertAutoSelect.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/MyAdvertAutoSelect$MyAdvertAutoSelectButton;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/MyAdvertAutoSelect$MyAdvertAutoSelectButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "setText", "(Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "setDeeplink", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MyAdvertAutoSelectButton implements Parcelable {

        @k
        public static final Parcelable.Creator<MyAdvertAutoSelectButton> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private DeepLink deeplink;

        @c("text")
        @k
        private String text;

        /* compiled from: MyAdvertAutoSelect.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MyAdvertAutoSelectButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MyAdvertAutoSelectButton createFromParcel(@k Parcel parcel) {
                return new MyAdvertAutoSelectButton(parcel.readString(), (DeepLink) parcel.readParcelable(MyAdvertAutoSelectButton.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MyAdvertAutoSelectButton[] newArray(int i12) {
                return new MyAdvertAutoSelectButton[i12];
            }
        }

        public MyAdvertAutoSelectButton(@k String str, @k DeepLink deepLink) {
            this.text = str;
            this.deeplink = deepLink;
        }

        public static /* synthetic */ MyAdvertAutoSelectButton copy$default(MyAdvertAutoSelectButton myAdvertAutoSelectButton, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = myAdvertAutoSelectButton.text;
            }
            if ((i12 & 2) != 0) {
                deepLink = myAdvertAutoSelectButton.deeplink;
            }
            return myAdvertAutoSelectButton.copy(str, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final MyAdvertAutoSelectButton copy(@k String text, @k DeepLink deeplink) {
            return new MyAdvertAutoSelectButton(text, deeplink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MyAdvertAutoSelectButton)) {
                return false;
            }
            MyAdvertAutoSelectButton myAdvertAutoSelectButton = (MyAdvertAutoSelectButton) other;
            return L.f(this.text, myAdvertAutoSelectButton.text) && L.f(this.deeplink, myAdvertAutoSelectButton.deeplink);
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.deeplink.hashCode() + (this.text.hashCode() * 31);
        }

        public final void setDeeplink(@k DeepLink deepLink) {
            this.deeplink = deepLink;
        }

        public final void setText(@k String str) {
            this.text = str;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MyAdvertAutoSelectButton(text=");
            sb2.append(this.text);
            sb2.append(", deeplink=");
            return a.v(sb2, this.deeplink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeParcelable(this.deeplink, flags);
        }
    }

    /* compiled from: MyAdvertAutoSelect.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010'R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010$\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010'R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010-R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0011\"\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/MyAdvertAutoSelect$MyAdvertAutoSelectDialog;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/MyAdvertAutoSelect$MyAdvertAutoSelectButton;", "button", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/MyAdvertAutoSelect$MyAdvertAutoSelectButton;Lcom/avito/android/remote/model/UniversalImage;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/MyAdvertAutoSelect$MyAdvertAutoSelectButton;", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/MyAdvertAutoSelect$MyAdvertAutoSelectButton;Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/MyAdvertAutoSelect$MyAdvertAutoSelectDialog;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "setTitle", "(Ljava/lang/String;)V", "getDescription", "setDescription", "Lcom/avito/android/remote/model/MyAdvertAutoSelect$MyAdvertAutoSelectButton;", "getButton", "setButton", "(Lcom/avito/android/remote/model/MyAdvertAutoSelect$MyAdvertAutoSelectButton;)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "setImage", "(Lcom/avito/android/remote/model/UniversalImage;)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MyAdvertAutoSelectDialog implements Parcelable {

        @k
        public static final Parcelable.Creator<MyAdvertAutoSelectDialog> CREATOR = new Creator();

        @c("button")
        @l
        private MyAdvertAutoSelectButton button;

        @c("description")
        @l
        private String description;

        @c("image")
        @l
        private UniversalImage image;

        @c("title")
        @l
        private String title;

        /* compiled from: MyAdvertAutoSelect.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MyAdvertAutoSelectDialog> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MyAdvertAutoSelectDialog createFromParcel(@k Parcel parcel) {
                return new MyAdvertAutoSelectDialog(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MyAdvertAutoSelectButton.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(MyAdvertAutoSelectDialog.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MyAdvertAutoSelectDialog[] newArray(int i12) {
                return new MyAdvertAutoSelectDialog[i12];
            }
        }

        public MyAdvertAutoSelectDialog() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ MyAdvertAutoSelectDialog copy$default(MyAdvertAutoSelectDialog myAdvertAutoSelectDialog, String str, String str2, MyAdvertAutoSelectButton myAdvertAutoSelectButton, UniversalImage universalImage, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = myAdvertAutoSelectDialog.title;
            }
            if ((i12 & 2) != 0) {
                str2 = myAdvertAutoSelectDialog.description;
            }
            if ((i12 & 4) != 0) {
                myAdvertAutoSelectButton = myAdvertAutoSelectDialog.button;
            }
            if ((i12 & 8) != 0) {
                universalImage = myAdvertAutoSelectDialog.image;
            }
            return myAdvertAutoSelectDialog.copy(str, str2, myAdvertAutoSelectButton, universalImage);
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
        public final MyAdvertAutoSelectButton getButton() {
            return this.button;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final MyAdvertAutoSelectDialog copy(@l String title, @l String description, @l MyAdvertAutoSelectButton button, @l UniversalImage image) {
            return new MyAdvertAutoSelectDialog(title, description, button, image);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MyAdvertAutoSelectDialog)) {
                return false;
            }
            MyAdvertAutoSelectDialog myAdvertAutoSelectDialog = (MyAdvertAutoSelectDialog) other;
            return L.f(this.title, myAdvertAutoSelectDialog.title) && L.f(this.description, myAdvertAutoSelectDialog.description) && L.f(this.button, myAdvertAutoSelectDialog.button) && L.f(this.image, myAdvertAutoSelectDialog.image);
        }

        @l
        public final MyAdvertAutoSelectButton getButton() {
            return this.button;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final UniversalImage getImage() {
            return this.image;
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
            MyAdvertAutoSelectButton myAdvertAutoSelectButton = this.button;
            int iHashCode3 = (iHashCode2 + (myAdvertAutoSelectButton == null ? 0 : myAdvertAutoSelectButton.hashCode())) * 31;
            UniversalImage universalImage = this.image;
            return iHashCode3 + (universalImage != null ? universalImage.hashCode() : 0);
        }

        public final void setButton(@l MyAdvertAutoSelectButton myAdvertAutoSelectButton) {
            this.button = myAdvertAutoSelectButton;
        }

        public final void setDescription(@l String str) {
            this.description = str;
        }

        public final void setImage(@l UniversalImage universalImage) {
            this.image = universalImage;
        }

        public final void setTitle(@l String str) {
            this.title = str;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MyAdvertAutoSelectDialog(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", button=");
            sb2.append(this.button);
            sb2.append(", image=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            MyAdvertAutoSelectButton myAdvertAutoSelectButton = this.button;
            if (myAdvertAutoSelectButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                myAdvertAutoSelectButton.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.image, flags);
        }

        public MyAdvertAutoSelectDialog(@l String str, @l String str2, @l MyAdvertAutoSelectButton myAdvertAutoSelectButton, @l UniversalImage universalImage) {
            this.title = str;
            this.description = str2;
            this.button = myAdvertAutoSelectButton;
            this.image = universalImage;
        }

        public /* synthetic */ MyAdvertAutoSelectDialog(String str, String str2, MyAdvertAutoSelectButton myAdvertAutoSelectButton, UniversalImage universalImage, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : myAdvertAutoSelectButton, (i12 & 8) != 0 ? null : universalImage);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MyAdvertAutoSelect() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MyAdvertAutoSelect copy$default(MyAdvertAutoSelect myAdvertAutoSelect, MyAdvertAutoSelectDialog myAdvertAutoSelectDialog, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            myAdvertAutoSelectDialog = myAdvertAutoSelect.closeDialog;
        }
        return myAdvertAutoSelect.copy(myAdvertAutoSelectDialog);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final MyAdvertAutoSelectDialog getCloseDialog() {
        return this.closeDialog;
    }

    @k
    public final MyAdvertAutoSelect copy(@l MyAdvertAutoSelectDialog closeDialog) {
        return new MyAdvertAutoSelect(closeDialog);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MyAdvertAutoSelect) && L.f(this.closeDialog, ((MyAdvertAutoSelect) other).closeDialog);
    }

    @l
    public final MyAdvertAutoSelectDialog getCloseDialog() {
        return this.closeDialog;
    }

    public int hashCode() {
        MyAdvertAutoSelectDialog myAdvertAutoSelectDialog = this.closeDialog;
        if (myAdvertAutoSelectDialog == null) {
            return 0;
        }
        return myAdvertAutoSelectDialog.hashCode();
    }

    public final void setCloseDialog(@l MyAdvertAutoSelectDialog myAdvertAutoSelectDialog) {
        this.closeDialog = myAdvertAutoSelectDialog;
    }

    @k
    public String toString() {
        return "MyAdvertAutoSelect(closeDialog=" + this.closeDialog + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        MyAdvertAutoSelectDialog myAdvertAutoSelectDialog = this.closeDialog;
        if (myAdvertAutoSelectDialog == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            myAdvertAutoSelectDialog.writeToParcel(parcel, flags);
        }
    }

    public MyAdvertAutoSelect(@l MyAdvertAutoSelectDialog myAdvertAutoSelectDialog) {
        this.closeDialog = myAdvertAutoSelectDialog;
    }

    public /* synthetic */ MyAdvertAutoSelect(MyAdvertAutoSelectDialog myAdvertAutoSelectDialog, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : myAdvertAutoSelectDialog);
    }
}
