package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationDisclaimer.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002)*B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/VerificationDisclaimer;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/VerificationDisclaimer$InfoBlock;", "infoBlocks", "Lcom/avito/android/remote/model/VerificationDisclaimer$Button;", "submitButton", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/VerificationDisclaimer$Button;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/VerificationDisclaimer$Button;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/VerificationDisclaimer$Button;)Lcom/avito/android/remote/model/VerificationDisclaimer;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getInfoBlocks", "Lcom/avito/android/remote/model/VerificationDisclaimer$Button;", "getSubmitButton", "Button", "InfoBlock", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationDisclaimer implements Parcelable {

    @k
    public static final Parcelable.Creator<VerificationDisclaimer> CREATOR = new Creator();

    @c("infoBlocks")
    @l
    private final List<InfoBlock> infoBlocks;

    @c("submitButton")
    @l
    private final Button submitButton;

    @c("title")
    @l
    private final String title;

    /* compiled from: VerificationDisclaimer.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/VerificationDisclaimer$Button;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/VerificationDisclaimer$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new Creator();

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        /* compiled from: VerificationDisclaimer.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Button> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button createFromParcel(@k Parcel parcel) {
                return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @k DeepLink deepLink) {
            this.title = str;
            this.uri = deepLink;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = button.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = button.uri;
            }
            return button.copy(str, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }

        @k
        public final Button copy(@k String title, @k DeepLink uri) {
            return new Button(title, uri);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return L.f(this.title, button.title) && L.f(this.uri, button.uri);
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final DeepLink getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.title);
            sb2.append(", uri=");
            return a.v(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.uri, flags);
        }
    }

    /* compiled from: VerificationDisclaimer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VerificationDisclaimer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationDisclaimer createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(InfoBlock.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new VerificationDisclaimer(string, arrayList, parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationDisclaimer[] newArray(int i12) {
            return new VerificationDisclaimer[i12];
        }
    }

    /* compiled from: VerificationDisclaimer.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/VerificationDisclaimer$InfoBlock;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/VerificationDisclaimer$InfoBlock;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InfoBlock implements Parcelable {

        @k
        public static final Parcelable.Creator<InfoBlock> CREATOR = new Creator();

        @c("text")
        @k
        private final AttributedText text;

        @c("title")
        @l
        private final String title;

        /* compiled from: VerificationDisclaimer.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InfoBlock> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InfoBlock createFromParcel(@k Parcel parcel) {
                return new InfoBlock(parcel.readString(), (AttributedText) parcel.readParcelable(InfoBlock.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InfoBlock[] newArray(int i12) {
                return new InfoBlock[i12];
            }
        }

        public InfoBlock(@l String str, @k AttributedText attributedText) {
            this.title = str;
            this.text = attributedText;
        }

        public static /* synthetic */ InfoBlock copy$default(InfoBlock infoBlock, String str, AttributedText attributedText, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = infoBlock.title;
            }
            if ((i12 & 2) != 0) {
                attributedText = infoBlock.text;
            }
            return infoBlock.copy(str, attributedText);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @k
        public final InfoBlock copy(@l String title, @k AttributedText text) {
            return new InfoBlock(title, text);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoBlock)) {
                return false;
            }
            InfoBlock infoBlock = (InfoBlock) other;
            return L.f(this.title, infoBlock.title) && L.f(this.text, infoBlock.text);
        }

        @k
        public final AttributedText getText() {
            return this.text;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            return this.text.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("InfoBlock(title=");
            sb2.append(this.title);
            sb2.append(", text=");
            return a.w(sb2, this.text, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.text, flags);
        }
    }

    public VerificationDisclaimer(@l String str, @l List<InfoBlock> list, @l Button button) {
        this.title = str;
        this.infoBlocks = list;
        this.submitButton = button;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VerificationDisclaimer copy$default(VerificationDisclaimer verificationDisclaimer, String str, List list, Button button, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationDisclaimer.title;
        }
        if ((i12 & 2) != 0) {
            list = verificationDisclaimer.infoBlocks;
        }
        if ((i12 & 4) != 0) {
            button = verificationDisclaimer.submitButton;
        }
        return verificationDisclaimer.copy(str, list, button);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<InfoBlock> component2() {
        return this.infoBlocks;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Button getSubmitButton() {
        return this.submitButton;
    }

    @k
    public final VerificationDisclaimer copy(@l String title, @l List<InfoBlock> infoBlocks, @l Button submitButton) {
        return new VerificationDisclaimer(title, infoBlocks, submitButton);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationDisclaimer)) {
            return false;
        }
        VerificationDisclaimer verificationDisclaimer = (VerificationDisclaimer) other;
        return L.f(this.title, verificationDisclaimer.title) && L.f(this.infoBlocks, verificationDisclaimer.infoBlocks) && L.f(this.submitButton, verificationDisclaimer.submitButton);
    }

    @l
    public final List<InfoBlock> getInfoBlocks() {
        return this.infoBlocks;
    }

    @l
    public final Button getSubmitButton() {
        return this.submitButton;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<InfoBlock> list = this.infoBlocks;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Button button = this.submitButton;
        return iHashCode2 + (button != null ? button.hashCode() : 0);
    }

    @k
    public String toString() {
        return "VerificationDisclaimer(title=" + this.title + ", infoBlocks=" + this.infoBlocks + ", submitButton=" + this.submitButton + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        List<InfoBlock> list = this.infoBlocks;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((InfoBlock) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Button button = this.submitButton;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, flags);
        }
    }
}
