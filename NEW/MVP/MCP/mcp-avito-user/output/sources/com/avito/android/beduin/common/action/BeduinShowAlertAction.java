package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinShowAlertAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0003=>?Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ|\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0013J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b)\u0010$J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b7\u0010\u0016R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u001bR\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b:\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010\u001e¨\u0006@"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinShowAlertAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "title", "subtitle", "", "closeButtonVisible", "Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$Orientation;", "buttonsOrientation", "dismissible", "", "onDismissActions", "Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$Button;", "buttons", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$Orientation;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "()Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$Orientation;", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$Orientation;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)Lcom/avito/android/beduin/common/action/BeduinShowAlertAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/lang/Boolean;", "getCloseButtonVisible", "Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$Orientation;", "getButtonsOrientation", "getDismissible", "Ljava/util/List;", "getOnDismissActions", "getButtons", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "Button", "Orientation", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinShowAlertAction implements BeduinAction {

    @Y61.k
    public static final Parcelable.Creator<BeduinShowAlertAction> CREATOR = new a();

    @l
    private final List<Button> buttons;

    @l
    private final Orientation buttonsOrientation;

    @l
    private final Boolean closeButtonVisible;

    @l
    private final Boolean dismissible;

    @l
    private final List<BeduinAction> onDismissActions;

    @l
    private final String subtitle;

    @l
    private final BeduinComponentTheme theme;

    @l
    private final String title;

    /* compiled from: BeduinShowAlertAction.kt */
    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u000eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0010R\u0011\u0010)\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010\f¨\u0006+"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$Button;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$Button$Type;", "_type", "", "title", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$Button$Type;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$Button$Type;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$Button$Type;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$Button$Type;", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getActions", "getType", "type", "Type", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Button implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        @com.google.gson.annotations.c("type")
        @l
        private final Type _type;

        @l
        private final List<BeduinAction> actions;

        @Y61.k
        private final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BeduinShowAlertAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$Button$Type;", "", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "WARNING", "DEFAULT", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @com.google.gson.annotations.c("default")
            public static final Type DEFAULT;

            @com.google.gson.annotations.c("primary")
            public static final Type PRIMARY;

            @com.google.gson.annotations.c("secondary")
            public static final Type SECONDARY;

            @com.google.gson.annotations.c(ConstraintKt.WARNING)
            public static final Type WARNING;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f100002b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f100003c;

            static {
                Type type = new Type("PRIMARY", 0);
                PRIMARY = type;
                Type type2 = new Type("SECONDARY", 1);
                SECONDARY = type2;
                Type type3 = new Type("WARNING", 2);
                WARNING = type3;
                Type type4 = new Type("DEFAULT", 3);
                DEFAULT = type4;
                Type[] typeArr = {type, type2, type3, type4};
                f100002b = typeArr;
                f100003c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f100002b.clone();
            }
        }

        /* compiled from: BeduinShowAlertAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                ArrayList arrayList = null;
                Type typeValueOf = parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString());
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(Button.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Button(typeValueOf, string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Button(@l Type type, @Y61.k String str, @l List<? extends BeduinAction> list) {
            this._type = type;
            this.title = str;
            this.actions = list;
        }

        /* renamed from: component1, reason: from getter */
        private final Type get_type() {
            return this._type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Button copy$default(Button button, Type type, String str, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                type = button._type;
            }
            if ((i12 & 2) != 0) {
                str = button.title;
            }
            if ((i12 & 4) != 0) {
                list = button.actions;
            }
            return button.copy(type, str, list);
        }

        @Y61.k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        public final List<BeduinAction> component3() {
            return this.actions;
        }

        @Y61.k
        public final Button copy(@l Type _type, @Y61.k String title, @l List<? extends BeduinAction> actions) {
            return new Button(_type, title, actions);
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
            return this._type == button._type && L.f(this.title, button.title) && L.f(this.actions, button.actions);
        }

        @l
        public final List<BeduinAction> getActions() {
            return this.actions;
        }

        @Y61.k
        public final String getTitle() {
            return this.title;
        }

        @Y61.k
        public final Type getType() {
            Type type = this._type;
            return type == null ? Type.DEFAULT : type;
        }

        public int hashCode() {
            Type type = this._type;
            int iD2 = H.d((type == null ? 0 : type.hashCode()) * 31, 31, this.title);
            List<BeduinAction> list = this.actions;
            return iD2 + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Button(_type=");
            sb2.append(this._type);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", actions=");
            return H.p(sb2, this.actions, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            Type type = this._type;
            if (type == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(type.name());
            }
            parcel.writeString(this.title);
            List<BeduinAction> list = this.actions;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinShowAlertAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$Orientation;", "", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Orientation {

        @com.google.gson.annotations.c("horizontal")
        public static final Orientation HORIZONTAL;

        @com.google.gson.annotations.c("vertical")
        public static final Orientation VERTICAL;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Orientation[] f100004b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f100005c;

        static {
            Orientation orientation = new Orientation("HORIZONTAL", 0);
            HORIZONTAL = orientation;
            Orientation orientation2 = new Orientation("VERTICAL", 1);
            VERTICAL = orientation2;
            Orientation[] orientationArr = {orientation, orientation2};
            f100004b = orientationArr;
            f100005c = kotlin.enums.c.a(orientationArr);
        }

        private Orientation(String str, int i12) {
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) f100004b.clone();
        }
    }

    /* compiled from: BeduinShowAlertAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinShowAlertAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinShowAlertAction createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Orientation orientationValueOf = parcel.readInt() == 0 ? null : Orientation.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinShowAlertAction.class, parcel, arrayList3, iL2, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(Button.CREATOR, parcel, arrayList4, iC2, 1);
                }
                arrayList2 = arrayList4;
            }
            return new BeduinShowAlertAction(string, string2, boolValueOf, orientationValueOf, boolValueOf2, arrayList, arrayList2, parcel.readInt() != 0 ? BeduinComponentTheme.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinShowAlertAction[] newArray(int i12) {
            return new BeduinShowAlertAction[i12];
        }
    }

    /* compiled from: BeduinShowAlertAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinShowAlertAction$b;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC15524c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Class<? extends BeduinAction> f100006b = BeduinShowAlertAction.class;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f100007c = "showAlert";

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return this.f100006b;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType, reason: from getter */
        public final String getF99982c() {
            return this.f100007c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinShowAlertAction(@l String str, @l String str2, @l Boolean bool, @l Orientation orientation, @l Boolean bool2, @l List<? extends BeduinAction> list, @l List<Button> list2, @l BeduinComponentTheme beduinComponentTheme) {
        this.title = str;
        this.subtitle = str2;
        this.closeButtonVisible = bool;
        this.buttonsOrientation = orientation;
        this.dismissible = bool2;
        this.onDismissActions = list;
        this.buttons = list2;
        this.theme = beduinComponentTheme;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getCloseButtonVisible() {
        return this.closeButtonVisible;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Orientation getButtonsOrientation() {
        return this.buttonsOrientation;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getDismissible() {
        return this.dismissible;
    }

    @l
    public final List<BeduinAction> component6() {
        return this.onDismissActions;
    }

    @l
    public final List<Button> component7() {
        return this.buttons;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @Y61.k
    public final BeduinShowAlertAction copy(@l String title, @l String subtitle, @l Boolean closeButtonVisible, @l Orientation buttonsOrientation, @l Boolean dismissible, @l List<? extends BeduinAction> onDismissActions, @l List<Button> buttons, @l BeduinComponentTheme theme) {
        return new BeduinShowAlertAction(title, subtitle, closeButtonVisible, buttonsOrientation, dismissible, onDismissActions, buttons, theme);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinShowAlertAction)) {
            return false;
        }
        BeduinShowAlertAction beduinShowAlertAction = (BeduinShowAlertAction) other;
        return L.f(this.title, beduinShowAlertAction.title) && L.f(this.subtitle, beduinShowAlertAction.subtitle) && L.f(this.closeButtonVisible, beduinShowAlertAction.closeButtonVisible) && this.buttonsOrientation == beduinShowAlertAction.buttonsOrientation && L.f(this.dismissible, beduinShowAlertAction.dismissible) && L.f(this.onDismissActions, beduinShowAlertAction.onDismissActions) && L.f(this.buttons, beduinShowAlertAction.buttons) && this.theme == beduinShowAlertAction.theme;
    }

    @l
    public final List<Button> getButtons() {
        return this.buttons;
    }

    @l
    public final Orientation getButtonsOrientation() {
        return this.buttonsOrientation;
    }

    @l
    public final Boolean getCloseButtonVisible() {
        return this.closeButtonVisible;
    }

    @l
    public final Boolean getDismissible() {
        return this.dismissible;
    }

    @l
    public final List<BeduinAction> getOnDismissActions() {
        return this.onDismissActions;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.closeButtonVisible;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Orientation orientation = this.buttonsOrientation;
        int iHashCode4 = (iHashCode3 + (orientation == null ? 0 : orientation.hashCode())) * 31;
        Boolean bool2 = this.dismissible;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<BeduinAction> list = this.onDismissActions;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<Button> list2 = this.buttons;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        return iHashCode7 + (beduinComponentTheme != null ? beduinComponentTheme.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        return "BeduinShowAlertAction(title=" + this.title + ", subtitle=" + this.subtitle + ", closeButtonVisible=" + this.closeButtonVisible + ", buttonsOrientation=" + this.buttonsOrientation + ", dismissible=" + this.dismissible + ", onDismissActions=" + this.onDismissActions + ", buttons=" + this.buttons + ", theme=" + this.theme + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Boolean bool = this.closeButtonVisible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Orientation orientation = this.buttonsOrientation;
        if (orientation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(orientation.name());
        }
        Boolean bool2 = this.dismissible;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        List<BeduinAction> list = this.onDismissActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<Button> list2 = this.buttons;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((Button) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ BeduinShowAlertAction(String str, String str2, Boolean bool, Orientation orientation, Boolean bool2, List list, List list2, BeduinComponentTheme beduinComponentTheme, int i12, C42822w c42822w) {
        this(str, str2, bool, orientation, bool2, list, list2, (i12 & 128) != 0 ? null : beduinComponentTheme);
    }
}
