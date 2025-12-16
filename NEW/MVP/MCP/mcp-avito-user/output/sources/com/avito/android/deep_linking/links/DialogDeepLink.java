package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47204b;

/* compiled from: DialogDeepLink.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/DialogDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "ControlsDirection", "DialogButton", "DialogButtonStyle", "c", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class DialogDeepLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DialogDeepLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ControlsDirection f133254b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f133255c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f133256d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f133257e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<DialogButton> f133258f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f133259g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f133260h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f133261i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f133262j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f133263k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogDeepLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DialogDeepLink$ControlsDirection;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ControlsDirection {

        /* renamed from: b, reason: collision with root package name */
        public static final ControlsDirection f133264b;

        /* renamed from: c, reason: collision with root package name */
        public static final ControlsDirection f133265c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ControlsDirection[] f133266d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133267e;

        static {
            ControlsDirection controlsDirection = new ControlsDirection("HORIZONTAL", 0);
            f133264b = controlsDirection;
            ControlsDirection controlsDirection2 = new ControlsDirection("VERTICAL", 1);
            f133265c = controlsDirection2;
            ControlsDirection[] controlsDirectionArr = {controlsDirection, controlsDirection2};
            f133266d = controlsDirectionArr;
            f133267e = kotlin.enums.c.a(controlsDirectionArr);
        }

        public ControlsDirection() {
            throw null;
        }

        public static ControlsDirection valueOf(String str) {
            return (ControlsDirection) Enum.valueOf(ControlsDirection.class, str);
        }

        public static ControlsDirection[] values() {
            return (ControlsDirection[]) f133266d.clone();
        }
    }

    /* compiled from: DialogDeepLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/deep_linking/links/DialogDeepLink$DialogButton;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "", "text", "Lcom/avito/android/deep_linking/links/DialogDeepLink$DialogButtonStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DialogDeepLink$DialogButtonStyle;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DialogDeepLink$DialogButtonStyle;", "c", "()Lcom/avito/android/deep_linking/links/DialogDeepLink$DialogButtonStyle;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DialogButton implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<DialogButton> CREATOR = new a();

        @com.google.gson.annotations.c("action")
        @Y61.l
        private final DeepLink action;

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @Y61.k
        private final DialogButtonStyle style;

        @com.google.gson.annotations.c("text")
        @Y61.k
        private final String text;

        /* compiled from: DialogDeepLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DialogButton> {
            @Override // android.os.Parcelable.Creator
            public final DialogButton createFromParcel(Parcel parcel) {
                return new DialogButton((DeepLink) parcel.readParcelable(DialogButton.class.getClassLoader()), parcel.readString(), DialogButtonStyle.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final DialogButton[] newArray(int i12) {
                return new DialogButton[i12];
            }
        }

        public DialogButton(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.k DialogButtonStyle dialogButtonStyle) {
            this.action = deepLink;
            this.text = str;
            this.style = dialogButtonStyle;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final DialogButtonStyle getStyle() {
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogDeepLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DialogDeepLink$DialogButtonStyle;", "", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "DANGER", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DialogButtonStyle {

        @com.google.gson.annotations.c("danger")
        public static final DialogButtonStyle DANGER;

        @com.google.gson.annotations.c("primary")
        public static final DialogButtonStyle PRIMARY;

        @com.google.gson.annotations.c("secondary")
        public static final DialogButtonStyle SECONDARY;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ DialogButtonStyle[] f133268b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133269c;

        static {
            DialogButtonStyle dialogButtonStyle = new DialogButtonStyle("PRIMARY", 0);
            PRIMARY = dialogButtonStyle;
            DialogButtonStyle dialogButtonStyle2 = new DialogButtonStyle("SECONDARY", 1);
            SECONDARY = dialogButtonStyle2;
            DialogButtonStyle dialogButtonStyle3 = new DialogButtonStyle("DANGER", 2);
            DANGER = dialogButtonStyle3;
            DialogButtonStyle[] dialogButtonStyleArr = {dialogButtonStyle, dialogButtonStyle2, dialogButtonStyle3};
            f133268b = dialogButtonStyleArr;
            f133269c = kotlin.enums.c.a(dialogButtonStyleArr);
        }

        private DialogButtonStyle(String str, int i12) {
        }

        public static DialogButtonStyle valueOf(String str) {
            return (DialogButtonStyle) Enum.valueOf(DialogButtonStyle.class, str);
        }

        public static DialogButtonStyle[] values() {
            return (DialogButtonStyle[]) f133268b.clone();
        }
    }

    /* compiled from: DialogDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/DialogDeepLink$a;", "", "<init>", "()V", "", "MUST_USE_RE23_ARGS_KEY", "Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DialogDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DialogDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final DialogDeepLink createFromParcel(Parcel parcel) {
            ControlsDirection controlsDirectionValueOf = ControlsDirection.valueOf(parcel.readString());
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(DialogButton.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new DialogDeepLink(controlsDirectionValueOf, z12, z13, string, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DialogDeepLink[] newArray(int i12) {
            return new DialogDeepLink[i12];
        }
    }

    /* compiled from: DialogDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DialogDeepLink$c;", "", "a", "b", "Lcom/avito/android/deep_linking/links/DialogDeepLink$c$a;", "Lcom/avito/android/deep_linking/links/DialogDeepLink$c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: DialogDeepLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DialogDeepLink$c$a;", "LJu/c$b;", "Lcom/avito/android/deep_linking/links/DialogDeepLink$c;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b, c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133270b = new a();
        }

        /* compiled from: DialogDeepLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/DialogDeepLink$c$b;", "LJu/c$a;", "Lcom/avito/android/deep_linking/links/DialogDeepLink$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements InterfaceC14249c.a, c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final DeepLink f133271b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f133272c;

            public b(@Y61.l DeepLink deepLink, @Y61.l String str) {
                this.f133271b = deepLink;
                this.f133272c = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.L.f(this.f133271b, bVar.f133271b) && kotlin.jvm.internal.L.f(this.f133272c, bVar.f133272c);
            }

            public final int hashCode() {
                DeepLink deepLink = this.f133271b;
                int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
                String str = this.f133272c;
                return iHashCode + (str != null ? str.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("OpenAction(deepLink=");
                sb2.append(this.f133271b);
                sb2.append(", actionTitle=");
                return C22026a.c(sb2, this.f133272c, ')');
            }
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public DialogDeepLink(ControlsDirection controlsDirection, boolean z12, boolean z13, String str, List list, String str2, String str3, String str4, String str5, String str6, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? ControlsDirection.f133265c : controlsDirection, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? "" : str, (i12 & 16) != 0 ? C42784z0.f406748b : list, str2, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : str5, (i12 & 512) != 0 ? null : str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133254b.name());
        parcel.writeInt(this.f133255c ? 1 : 0);
        parcel.writeInt(this.f133256d ? 1 : 0);
        parcel.writeString(this.f133257e);
        Iterator itJ = C0.j(this.f133258f, parcel);
        while (itJ.hasNext()) {
            ((DialogButton) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f133259g);
        parcel.writeString(this.f133260h);
        parcel.writeString(this.f133261i);
        parcel.writeString(this.f133262j);
        parcel.writeString(this.f133263k);
    }

    public DialogDeepLink(@Y61.k ControlsDirection controlsDirection, boolean z12, boolean z13, @Y61.k String str, @Y61.k List<DialogButton> list, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6) {
        this.f133254b = controlsDirection;
        this.f133255c = z12;
        this.f133256d = z13;
        this.f133257e = str;
        this.f133258f = list;
        this.f133259g = str2;
        this.f133260h = str3;
        this.f133261i = str4;
        this.f133262j = str5;
        this.f133263k = str6;
    }
}
