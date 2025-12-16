package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.component.toast.f;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinToastAction.kt */
@K51.d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001:\u0005/0123Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b.\u0010*¨\u00064"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinToastAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/beduin/common/action/BeduinToastAction$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "title", "Lcom/avito/android/beduin/common/action/BeduinToastAction$Button;", "button", "Lcom/avito/android/beduin/common/action/BeduinToastAction$Buttons;", "buttons", "Lcom/avito/android/beduin/common/action/BeduinToastAction$Timeout;", "_timeout", "", "_timeoutDuration", "", "closeOnAction", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedTitle", "isForceVerticalLayout", "<init>", "(Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin/common/action/BeduinToastAction$Style;Ljava/lang/String;Lcom/avito/android/beduin/common/action/BeduinToastAction$Button;Lcom/avito/android/beduin/common/action/BeduinToastAction$Buttons;Lcom/avito/android/beduin/common/action/BeduinToastAction$Timeout;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;)V", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "h", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "Lcom/avito/android/beduin/common/action/BeduinToastAction$Style;", "g", "()Lcom/avito/android/beduin/common/action/BeduinToastAction$Style;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/beduin/common/action/BeduinToastAction$Button;", "d", "()Lcom/avito/android/beduin/common/action/BeduinToastAction$Button;", "Lcom/avito/android/beduin/common/action/BeduinToastAction$Buttons;", "e", "()Lcom/avito/android/beduin/common/action/BeduinToastAction$Buttons;", "Lcom/avito/android/beduin/common/action/BeduinToastAction$Timeout;", "Ljava/lang/Integer;", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "k", "Button", "Buttons", "a", "Style", "Timeout", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinToastAction implements BeduinAction {

    @com.google.gson.annotations.c("timeout")
    @l
    private final Timeout _timeout;

    @com.google.gson.annotations.c("timeoutDuration")
    @l
    private final Integer _timeoutDuration;

    @com.google.gson.annotations.c("attributedTitle")
    @l
    private final AttributedText attributedTitle;

    @com.google.gson.annotations.c("button")
    @l
    private final Button button;

    @com.google.gson.annotations.c("buttons")
    @l
    private final Buttons buttons;

    @com.google.gson.annotations.c("closeOnAction")
    @l
    private final Boolean closeOnAction;

    @com.google.gson.annotations.c("isForceVerticalLayout")
    @l
    private final Boolean isForceVerticalLayout;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @Y61.k
    private final Style style;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @l
    private final BeduinComponentTheme theme;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f100012b = new a(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinToastAction> CREATOR = new b();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Class<BeduinToastAction> f100013c = BeduinToastAction.class;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final String f100014d = "showToast";

    /* compiled from: BeduinToastAction.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinToastAction$Buttons;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/beduin/common/action/BeduinToastAction$Button;", "items", "", "spaceBetween", "<init>", "(Ljava/util/List;I)V", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "I", "c", "()I", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Buttons implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Buttons> CREATOR = new a();

        @com.google.gson.annotations.c("items")
        @Y61.k
        private final List<Button> items;

        @com.google.gson.annotations.c("spaceBetween")
        private final int spaceBetween;

        /* compiled from: BeduinToastAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Buttons> {
            @Override // android.os.Parcelable.Creator
            public final Buttons createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Button.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Buttons(arrayList, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Buttons[] newArray(int i12) {
                return new Buttons[i12];
            }
        }

        public Buttons(@Y61.k List<Button> list, int i12) {
            this.items = list;
            this.spaceBetween = i12;
        }

        /* renamed from: c, reason: from getter */
        public final int getSpaceBetween() {
            return this.spaceBetween;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Buttons)) {
                return false;
            }
            Buttons buttons = (Buttons) obj;
            return L.f(this.items, buttons.items) && this.spaceBetween == buttons.spaceBetween;
        }

        @Y61.k
        public final List<Button> getItems() {
            return this.items;
        }

        public final int hashCode() {
            return Integer.hashCode(this.spaceBetween) + (this.items.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Buttons(items=");
            sb2.append(this.items);
            sb2.append(", spaceBetween=");
            return r.t(sb2, this.spaceBetween, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Iterator itJ = C0.j(this.items, parcel);
            while (itJ.hasNext()) {
                ((Button) itJ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeInt(this.spaceBetween);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinToastAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinToastAction$Style;", "", "Lcom/avito/android/component/toast/f;", "type", "<init>", "(Ljava/lang/String;ILcom/avito/android/component/toast/f;)V", "ERROR", "DEFAULT", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @com.google.gson.annotations.c("default")
        public static final Style DEFAULT;

        @com.google.gson.annotations.c("error")
        public static final Style ERROR;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Style[] f100015c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f100016d;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.component.toast.f f100017b;

        static {
            f.c.f125255c.getClass();
            Style style = new Style("ERROR", 0, f.c.a.b());
            ERROR = style;
            Style style2 = new Style("DEFAULT", 1, f.a.f125253a);
            DEFAULT = style2;
            Style[] styleArr = {style, style2};
            f100015c = styleArr;
            f100016d = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12, com.avito.android.component.toast.f fVar) {
            this.f100017b = fVar;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f100015c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinToastAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinToastAction$Timeout;", "", "", "length", "<init>", "(Ljava/lang/String;II)V", "NORMAL", "LONG", "NONE", "CUSTOM", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Timeout {

        @com.google.gson.annotations.c("custom")
        public static final Timeout CUSTOM;

        @com.google.gson.annotations.c(Constants.LONG)
        public static final Timeout LONG;

        @com.google.gson.annotations.c("none")
        public static final Timeout NONE;

        @com.google.gson.annotations.c(Constants.NORMAL)
        public static final Timeout NORMAL;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Timeout[] f100018c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f100019d;

        /* renamed from: b, reason: collision with root package name */
        public final int f100020b;

        static {
            Timeout timeout = new Timeout("NORMAL", 0, 1500);
            NORMAL = timeout;
            Timeout timeout2 = new Timeout("LONG", 1, 2750);
            LONG = timeout2;
            Timeout timeout3 = new Timeout("NONE", 2, -1);
            NONE = timeout3;
            Timeout timeout4 = new Timeout("CUSTOM", 3, -1);
            CUSTOM = timeout4;
            Timeout[] timeoutArr = {timeout, timeout2, timeout3, timeout4};
            f100018c = timeoutArr;
            f100019d = kotlin.enums.c.a(timeoutArr);
        }

        private Timeout(String str, int i12, int i13) {
            this.f100020b = i13;
        }

        public static Timeout valueOf(String str) {
            return (Timeout) Enum.valueOf(Timeout.class, str);
        }

        public static Timeout[] values() {
            return (Timeout[]) f100018c.clone();
        }
    }

    /* compiled from: BeduinToastAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinToastAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC15524c {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<BeduinToastAction> getAction() {
            return BeduinToastAction.f100013c;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinToastAction.f100014d;
        }

        public a() {
        }
    }

    /* compiled from: BeduinToastAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinToastAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinToastAction createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            Style styleValueOf = Style.valueOf(parcel.readString());
            String string = parcel.readString();
            Button buttonCreateFromParcel = parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel);
            Buttons buttonsCreateFromParcel = parcel.readInt() == 0 ? null : Buttons.CREATOR.createFromParcel(parcel);
            Timeout timeoutValueOf = parcel.readInt() == 0 ? null : Timeout.valueOf(parcel.readString());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            AttributedText attributedText = (AttributedText) parcel.readParcelable(BeduinToastAction.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinToastAction(beduinComponentThemeCreateFromParcel, styleValueOf, string, buttonCreateFromParcel, buttonsCreateFromParcel, timeoutValueOf, numValueOf, boolValueOf, attributedText, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinToastAction[] newArray(int i12) {
            return new BeduinToastAction[i12];
        }
    }

    public BeduinToastAction(@l BeduinComponentTheme beduinComponentTheme, @Y61.k Style style, @Y61.k String str, @l Button button, @l Buttons buttons, @l Timeout timeout, @l Integer num, @l Boolean bool, @l AttributedText attributedText, @l Boolean bool2) {
        this.theme = beduinComponentTheme;
        this.style = style;
        this.title = str;
        this.button = button;
        this.buttons = buttons;
        this._timeout = timeout;
        this._timeoutDuration = num;
        this.closeOnAction = bool;
        this.attributedTitle = attributedText;
        this.isForceVerticalLayout = bool2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getAttributedTitle() {
        return this.attributedTitle;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Buttons getButtons() {
        return this.buttons;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinToastAction)) {
            return false;
        }
        BeduinToastAction beduinToastAction = (BeduinToastAction) obj;
        return this.theme == beduinToastAction.theme && this.style == beduinToastAction.style && L.f(this.title, beduinToastAction.title) && L.f(this.button, beduinToastAction.button) && L.f(this.buttons, beduinToastAction.buttons) && this._timeout == beduinToastAction._timeout && L.f(this._timeoutDuration, beduinToastAction._timeoutDuration) && L.f(this.closeOnAction, beduinToastAction.closeOnAction) && L.f(this.attributedTitle, beduinToastAction.attributedTitle) && L.f(this.isForceVerticalLayout, beduinToastAction.isForceVerticalLayout);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Boolean getCloseOnAction() {
        return this.closeOnAction;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @Y61.k
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public final int hashCode() {
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iD2 = H.d((this.style.hashCode() + ((beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode()) * 31)) * 31, 31, this.title);
        Button button = this.button;
        int iHashCode = (iD2 + (button == null ? 0 : button.hashCode())) * 31;
        Buttons buttons = this.buttons;
        int iHashCode2 = (iHashCode + (buttons == null ? 0 : buttons.hashCode())) * 31;
        Timeout timeout = this._timeout;
        int iHashCode3 = (iHashCode2 + (timeout == null ? 0 : timeout.hashCode())) * 31;
        Integer num = this._timeoutDuration;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.closeOnAction;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        AttributedText attributedText = this.attributedTitle;
        int iHashCode6 = (iHashCode5 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool2 = this.isForceVerticalLayout;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Y61.k
    public final Timeout i() {
        Timeout timeout = this._timeout;
        return timeout == null ? Timeout.LONG : timeout;
    }

    public final int j() {
        Integer num = this._timeoutDuration;
        if (num != null) {
            return num.intValue();
        }
        return 2750;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final Boolean getIsForceVerticalLayout() {
        return this.isForceVerticalLayout;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinToastAction(theme=");
        sb2.append(this.theme);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", buttons=");
        sb2.append(this.buttons);
        sb2.append(", _timeout=");
        sb2.append(this._timeout);
        sb2.append(", _timeoutDuration=");
        sb2.append(this._timeoutDuration);
        sb2.append(", closeOnAction=");
        sb2.append(this.closeOnAction);
        sb2.append(", attributedTitle=");
        sb2.append(this.attributedTitle);
        sb2.append(", isForceVerticalLayout=");
        return C0.g(sb2, this.isForceVerticalLayout, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.style.name());
        parcel.writeString(this.title);
        Button button = this.button;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, i12);
        }
        Buttons buttons = this.buttons;
        if (buttons == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttons.writeToParcel(parcel, i12);
        }
        Timeout timeout = this._timeout;
        if (timeout == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(timeout.name());
        }
        Integer num = this._timeoutDuration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Boolean bool = this.closeOnAction;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.attributedTitle, i12);
        Boolean bool2 = this.isForceVerticalLayout;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }

    /* compiled from: BeduinToastAction.kt */
    @K51.d
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinToastAction$Button;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "", "closeOnAction", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "getStyle", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        @com.google.gson.annotations.c("closeOnAction")
        @l
        private final Boolean closeOnAction;

        @com.google.gson.annotations.c("onTapActions")
        @Y61.k
        private final List<BeduinAction> onTapActions;

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        /* compiled from: BeduinToastAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Button.class, parcel, arrayList, iL2, 1);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Button(string, arrayList, boolValueOf, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Button(@Y61.k String str, @Y61.k List<? extends BeduinAction> list, @l Boolean bool, @l String str2) {
            this.title = str;
            this.onTapActions = list;
            this.closeOnAction = bool;
            this.style = str2;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Boolean getCloseOnAction() {
            return this.closeOnAction;
        }

        @Y61.k
        public final List<BeduinAction> d() {
            return this.onTapActions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.title, button.title) && L.f(this.onTapActions, button.onTapActions) && L.f(this.closeOnAction, button.closeOnAction) && L.f(this.style, button.style);
        }

        @l
        public final String getStyle() {
            return this.style;
        }

        @Y61.k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iE2 = H.e(this.title.hashCode() * 31, 31, this.onTapActions);
            Boolean bool = this.closeOnAction;
            int iHashCode = (iE2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.style;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.title);
            sb2.append(", onTapActions=");
            sb2.append(this.onTapActions);
            sb2.append(", closeOnAction=");
            sb2.append(this.closeOnAction);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            Iterator itJ = C0.j(this.onTapActions, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            Boolean bool = this.closeOnAction;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.style);
        }

        public /* synthetic */ Button(String str, List list, Boolean bool, String str2, int i12, C42822w c42822w) {
            this(str, list, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str2);
        }
    }

    public /* synthetic */ BeduinToastAction(BeduinComponentTheme beduinComponentTheme, Style style, String str, Button button, Buttons buttons, Timeout timeout, Integer num, Boolean bool, AttributedText attributedText, Boolean bool2, int i12, C42822w c42822w) {
        this(beduinComponentTheme, style, str, (i12 & 8) != 0 ? null : button, (i12 & 16) != 0 ? null : buttons, (i12 & 32) != 0 ? null : timeout, (i12 & 64) != 0 ? null : num, (i12 & 128) != 0 ? null : bool, (i12 & 256) != 0 ? null : attributedText, (i12 & 512) != 0 ? null : bool2);
    }
}
