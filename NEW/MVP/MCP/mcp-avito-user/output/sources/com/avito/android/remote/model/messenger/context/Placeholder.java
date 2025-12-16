package com.avito.android.remote.model.messenger.context;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Placeholder.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002*+B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/messenger/context/Placeholder;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/messenger/context/Placeholder$Image;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/messenger/context/Placeholder$Button;", "button", "<init>", "(Lcom/avito/android/remote/model/messenger/context/Placeholder$Image;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/messenger/context/Placeholder$Button;)V", "component1", "()Lcom/avito/android/remote/model/messenger/context/Placeholder$Image;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "()Lcom/avito/android/remote/model/messenger/context/Placeholder$Button;", "copy", "(Lcom/avito/android/remote/model/messenger/context/Placeholder$Image;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/messenger/context/Placeholder$Button;)Lcom/avito/android/remote/model/messenger/context/Placeholder;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/messenger/context/Placeholder$Image;", "getImage", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/remote/model/messenger/context/Placeholder$Button;", "getButton", "Button", "Image", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Placeholder implements Parcelable {

    @k
    public static final Parcelable.Creator<Placeholder> CREATOR = new Creator();

    @l
    private final Button button;

    @k
    private final AttributedText description;

    @k
    private final Image image;

    /* compiled from: Placeholder.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ<\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010\r¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/messenger/context/Placeholder$Button;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "onTapDeepLink", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/context/Placeholder$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Ljava/lang/String;", "getStyle", "getTheme", "getOnTapDeepLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new Creator();

        @l
        private final String onTapDeepLink;

        @k
        private final String style;

        @k
        private final String theme;

        @l
        private final AttributedText title;

        /* compiled from: Placeholder.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Button> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button createFromParcel(@k Parcel parcel) {
                return new Button((AttributedText) parcel.readParcelable(Button.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@l AttributedText attributedText, @k String str, @k String str2, @l String str3) {
            this.title = attributedText;
            this.style = str;
            this.theme = str2;
            this.onTapDeepLink = str3;
        }

        public static /* synthetic */ Button copy$default(Button button, AttributedText attributedText, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                attributedText = button.title;
            }
            if ((i12 & 2) != 0) {
                str = button.style;
            }
            if ((i12 & 4) != 0) {
                str2 = button.theme;
            }
            if ((i12 & 8) != 0) {
                str3 = button.onTapDeepLink;
            }
            return button.copy(attributedText, str, str2, str3);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getTheme() {
            return this.theme;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getOnTapDeepLink() {
            return this.onTapDeepLink;
        }

        @k
        public final Button copy(@l AttributedText title, @k String style, @k String theme, @l String onTapDeepLink) {
            return new Button(title, style, theme, onTapDeepLink);
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
            return L.f(this.title, button.title) && L.f(this.style, button.style) && L.f(this.theme, button.theme) && L.f(this.onTapDeepLink, button.onTapDeepLink);
        }

        @l
        public final String getOnTapDeepLink() {
            return this.onTapDeepLink;
        }

        @k
        public final String getStyle() {
            return this.style;
        }

        @k
        public final String getTheme() {
            return this.theme;
        }

        @l
        public final AttributedText getTitle() {
            return this.title;
        }

        public int hashCode() {
            AttributedText attributedText = this.title;
            int iD2 = H.d(H.d((attributedText == null ? 0 : attributedText.hashCode()) * 31, 31, this.style), 31, this.theme);
            String str = this.onTapDeepLink;
            return iD2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.title);
            sb2.append(", style=");
            sb2.append(this.style);
            sb2.append(", theme=");
            sb2.append(this.theme);
            sb2.append(", onTapDeepLink=");
            return C22026a.c(sb2, this.onTapDeepLink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.title, flags);
            parcel.writeString(this.style);
            parcel.writeString(this.theme);
            parcel.writeString(this.onTapDeepLink);
        }
    }

    /* compiled from: Placeholder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Placeholder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Placeholder createFromParcel(@k Parcel parcel) {
            return new Placeholder(Image.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(Placeholder.class.getClassLoader()), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Placeholder[] newArray(int i12) {
            return new Placeholder[i12];
        }
    }

    /* compiled from: Placeholder.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/messenger/context/Placeholder$Image;", "Landroid/os/Parcelable;", "", "", ContextActionHandler.Link.URL, "Lcom/avito/android/remote/model/messenger/context/Placeholder$Image$Size;", "size", "<init>", "(Ljava/util/Map;Lcom/avito/android/remote/model/messenger/context/Placeholder$Image$Size;)V", "component1", "()Ljava/util/Map;", "component2", "()Lcom/avito/android/remote/model/messenger/context/Placeholder$Image$Size;", "copy", "(Ljava/util/Map;Lcom/avito/android/remote/model/messenger/context/Placeholder$Image$Size;)Lcom/avito/android/remote/model/messenger/context/Placeholder$Image;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getUrl", "Lcom/avito/android/remote/model/messenger/context/Placeholder$Image$Size;", "getSize", "Size", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Image implements Parcelable {

        @k
        public static final Parcelable.Creator<Image> CREATOR = new Creator();

        @k
        private final Size size;

        @k
        private final Map<String, String> url;

        /* compiled from: Placeholder.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Image> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image createFromParcel(@k Parcel parcel) {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
                return new Image(linkedHashMap, Size.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image[] newArray(int i12) {
                return new Image[i12];
            }
        }

        /* compiled from: Placeholder.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/messenger/context/Placeholder$Image$Size;", "Landroid/os/Parcelable;", "", "width", "height", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/avito/android/remote/model/messenger/context/Placeholder$Image$Size;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getWidth", "getHeight", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Size implements Parcelable {

            @k
            public static final Parcelable.Creator<Size> CREATOR = new Creator();
            private final int height;
            private final int width;

            /* compiled from: Placeholder.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Size> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Size createFromParcel(@k Parcel parcel) {
                    return new Size(parcel.readInt(), parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Size[] newArray(int i12) {
                    return new Size[i12];
                }
            }

            public Size(int i12, int i13) {
                this.width = i12;
                this.height = i13;
            }

            public static /* synthetic */ Size copy$default(Size size, int i12, int i13, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    i12 = size.width;
                }
                if ((i14 & 2) != 0) {
                    i13 = size.height;
                }
                return size.copy(i12, i13);
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
            public final Size copy(int width, int height) {
                return new Size(width, height);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Size)) {
                    return false;
                }
                Size size = (Size) other;
                return this.width == size.width && this.height == size.height;
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
                StringBuilder sb2 = new StringBuilder("Size(width=");
                sb2.append(this.width);
                sb2.append(", height=");
                return r.t(sb2, this.height, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(this.width);
                parcel.writeInt(this.height);
            }
        }

        public Image(@k Map<String, String> map, @k Size size) {
            this.url = map;
            this.size = size;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Image copy$default(Image image, Map map, Size size, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                map = image.url;
            }
            if ((i12 & 2) != 0) {
                size = image.size;
            }
            return image.copy(map, size);
        }

        @k
        public final Map<String, String> component1() {
            return this.url;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        @k
        public final Image copy(@k Map<String, String> url, @k Size size) {
            return new Image(url, size);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return L.f(this.url, image.url) && L.f(this.size, image.size);
        }

        @k
        public final Size getSize() {
            return this.size;
        }

        @k
        public final Map<String, String> getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.size.hashCode() + (this.url.hashCode() * 31);
        }

        @k
        public String toString() {
            return "Image(url=" + this.url + ", size=" + this.size + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Iterator itI = C0.i(parcel, this.url);
            while (itI.hasNext()) {
                Map.Entry entry = (Map.Entry) itI.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
            this.size.writeToParcel(parcel, flags);
        }
    }

    public Placeholder(@k Image image, @k AttributedText attributedText, @l Button button) {
        this.image = image;
        this.description = attributedText;
        this.button = button;
    }

    public static /* synthetic */ Placeholder copy$default(Placeholder placeholder, Image image, AttributedText attributedText, Button button, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            image = placeholder.image;
        }
        if ((i12 & 2) != 0) {
            attributedText = placeholder.description;
        }
        if ((i12 & 4) != 0) {
            button = placeholder.button;
        }
        return placeholder.copy(image, attributedText, button);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @k
    public final Placeholder copy(@k Image image, @k AttributedText description, @l Button button) {
        return new Placeholder(image, description, button);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) other;
        return L.f(this.image, placeholder.image) && L.f(this.description, placeholder.description) && L.f(this.button, placeholder.button);
    }

    @l
    public final Button getButton() {
        return this.button;
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final Image getImage() {
        return this.image;
    }

    public int hashCode() {
        int iB2 = a.b(this.image.hashCode() * 31, 31, this.description);
        Button button = this.button;
        return iB2 + (button == null ? 0 : button.hashCode());
    }

    @k
    public String toString() {
        return "Placeholder(image=" + this.image + ", description=" + this.description + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.image.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.description, flags);
        Button button = this.button;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, flags);
        }
    }
}
