package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TooltipOptions.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\f¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/TooltipOptions;", "Landroid/os/Parcelable;", "", "text", "", "showOnValue", "Lcom/avito/android/remote/model/category_parameters/TooltipOptions$Button;", "button", "onShowRegexp", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/TooltipOptions$Button;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/avito/android/remote/model/category_parameters/TooltipOptions$Button;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/TooltipOptions$Button;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/TooltipOptions;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Ljava/lang/Boolean;", "getShowOnValue", "Lcom/avito/android/remote/model/category_parameters/TooltipOptions$Button;", "getButton", "getOnShowRegexp", "Button", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TooltipOptions implements Parcelable {

    @k
    public static final Parcelable.Creator<TooltipOptions> CREATOR = new Creator();

    @c("button")
    @l
    private final Button button;

    @c("onShowRegexp")
    @l
    private final String onShowRegexp;

    @c("showOnValue")
    @l
    private final Boolean showOnValue;

    @c("text")
    @l
    private final String text;

    /* compiled from: TooltipOptions.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/TooltipOptions$Button;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/category_parameters/TooltipOptions$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new Creator();

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @c("text")
        @l
        private final String text;

        /* compiled from: TooltipOptions.kt */
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

        /* JADX WARN: Multi-variable type inference failed */
        public Button() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Button copy$default(Button button, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = button.text;
            }
            if ((i12 & 2) != 0) {
                deepLink = button.deeplink;
            }
            return button.copy(str, deepLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final Button copy(@l String text, @l DeepLink deeplink) {
            return new Button(text, deeplink);
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
            return L.f(this.text, button.text) && L.f(this.deeplink, button.deeplink);
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.text;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            DeepLink deepLink = this.deeplink;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Button(text=");
            sb2.append(this.text);
            sb2.append(", deeplink=");
            return a.v(sb2, this.deeplink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeParcelable(this.deeplink, flags);
        }

        public Button(@l String str, @l DeepLink deepLink) {
            this.text = str;
            this.deeplink = deepLink;
        }

        public /* synthetic */ Button(String str, DeepLink deepLink, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : deepLink);
        }
    }

    /* compiled from: TooltipOptions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TooltipOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TooltipOptions createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TooltipOptions(string, boolValueOf, parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TooltipOptions[] newArray(int i12) {
            return new TooltipOptions[i12];
        }
    }

    public TooltipOptions() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TooltipOptions copy$default(TooltipOptions tooltipOptions, String str, Boolean bool, Button button, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = tooltipOptions.text;
        }
        if ((i12 & 2) != 0) {
            bool = tooltipOptions.showOnValue;
        }
        if ((i12 & 4) != 0) {
            button = tooltipOptions.button;
        }
        if ((i12 & 8) != 0) {
            str2 = tooltipOptions.onShowRegexp;
        }
        return tooltipOptions.copy(str, bool, button, str2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getShowOnValue() {
        return this.showOnValue;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getOnShowRegexp() {
        return this.onShowRegexp;
    }

    @k
    public final TooltipOptions copy(@l String text, @l Boolean showOnValue, @l Button button, @l String onShowRegexp) {
        return new TooltipOptions(text, showOnValue, button, onShowRegexp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipOptions)) {
            return false;
        }
        TooltipOptions tooltipOptions = (TooltipOptions) other;
        return L.f(this.text, tooltipOptions.text) && L.f(this.showOnValue, tooltipOptions.showOnValue) && L.f(this.button, tooltipOptions.button) && L.f(this.onShowRegexp, tooltipOptions.onShowRegexp);
    }

    @l
    public final Button getButton() {
        return this.button;
    }

    @l
    public final String getOnShowRegexp() {
        return this.onShowRegexp;
    }

    @l
    public final Boolean getShowOnValue() {
        return this.showOnValue;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.showOnValue;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Button button = this.button;
        int iHashCode3 = (iHashCode2 + (button == null ? 0 : button.hashCode())) * 31;
        String str2 = this.onShowRegexp;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TooltipOptions(text=");
        sb2.append(this.text);
        sb2.append(", showOnValue=");
        sb2.append(this.showOnValue);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", onShowRegexp=");
        return C22026a.c(sb2, this.onShowRegexp, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        Boolean bool = this.showOnValue;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Button button = this.button;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.onShowRegexp);
    }

    public TooltipOptions(@l String str, @l Boolean bool, @l Button button, @l String str2) {
        this.text = str;
        this.showOnValue = bool;
        this.button = button;
        this.onShowRegexp = str2;
    }

    public /* synthetic */ TooltipOptions(String str, Boolean bool, Button button, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : bool, (i12 & 4) != 0 ? null : button, (i12 & 8) != 0 ? null : str2);
    }
}
