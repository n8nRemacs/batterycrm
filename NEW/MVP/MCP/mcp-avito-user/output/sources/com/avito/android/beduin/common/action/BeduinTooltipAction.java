package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinTooltipAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0007LMNOPQRBq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0090\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0017J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00122\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020+HÖ\u0001¢\u0006\u0004\b2\u0010-J \u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020+HÖ\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b>\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b?\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bD\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bF\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010%R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bJ\u0010'¨\u0006S"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinTooltipAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "formId", "modelId", "Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Position;", "position", "title", "text", "Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Size;", "size", "Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Button;", "button", "closeButton", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "showTail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Position;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Size;Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Button;Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Button;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Style;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Position;", "component4", "component5", "component6", "()Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Size;", "component7", "()Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Button;", "component8", "component9", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component10", "()Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Style;", "component11", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Position;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Size;Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Button;Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Button;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Style;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/action/BeduinTooltipAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFormId", "getModelId", "Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Position;", "getPosition", "getTitle", "getText", "Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Size;", "getSize", "Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Button;", "getButton", "getCloseButton", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Style;", "getStyle", "Ljava/lang/Boolean;", "getShowTail", "Companion", "Button", "a", "MainPosition", "Position", "Size", "Style", "TailPosition", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinTooltipAction implements BeduinAction {

    @l
    private final Button button;

    @l
    private final Button closeButton;

    @Y61.k
    private final String formId;

    @Y61.k
    private final String modelId;

    @l
    private final Position position;

    @l
    private final Boolean showTail;

    @l
    private final Size size;

    @l
    private final Style style;

    @l
    private final String text;

    @l
    private final BeduinComponentTheme theme;

    @l
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinTooltipAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinTooltipAction.class;

    @Y61.k
    private static final String type = "showTooltip";

    /* compiled from: BeduinTooltipAction.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Button;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        @com.google.gson.annotations.c("onTapActions")
        @l
        private final List<BeduinAction> onTapActions;

        @com.google.gson.annotations.c("title")
        @l
        private final String title;

        /* compiled from: BeduinTooltipAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(Button.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Button(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Button(@l String str, @l List<? extends BeduinAction> list) {
            this.title = str;
            this.onTapActions = list;
        }

        @l
        public final List<BeduinAction> c() {
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
            return L.f(this.title, button.title) && L.f(this.onTapActions, button.onTapActions);
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<BeduinAction> list = this.onTapActions;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.title);
            sb2.append(", onTapActions=");
            return H.p(sb2, this.onTapActions, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            List<BeduinAction> list = this.onTapActions;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinTooltipAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinTooltipAction$MainPosition;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "LEFT", "RIGHT", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MainPosition {

        @com.google.gson.annotations.c("bottom")
        public static final MainPosition BOTTOM;

        @com.google.gson.annotations.c("left")
        public static final MainPosition LEFT;

        @com.google.gson.annotations.c("right")
        public static final MainPosition RIGHT;

        @com.google.gson.annotations.c("top")
        public static final MainPosition TOP;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ MainPosition[] f100024b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f100025c;

        static {
            MainPosition mainPosition = new MainPosition("TOP", 0);
            TOP = mainPosition;
            MainPosition mainPosition2 = new MainPosition("BOTTOM", 1);
            BOTTOM = mainPosition2;
            MainPosition mainPosition3 = new MainPosition("LEFT", 2);
            LEFT = mainPosition3;
            MainPosition mainPosition4 = new MainPosition("RIGHT", 3);
            RIGHT = mainPosition4;
            MainPosition[] mainPositionArr = {mainPosition, mainPosition2, mainPosition3, mainPosition4};
            f100024b = mainPositionArr;
            f100025c = kotlin.enums.c.a(mainPositionArr);
        }

        private MainPosition(String str, int i12) {
        }

        public static MainPosition valueOf(String str) {
            return (MainPosition) Enum.valueOf(MainPosition.class, str);
        }

        public static MainPosition[] values() {
            return (MainPosition[]) f100024b.clone();
        }
    }

    /* compiled from: BeduinTooltipAction.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Position;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/action/BeduinTooltipAction$MainPosition;", "tooltipPosition", "Lcom/avito/android/beduin/common/action/BeduinTooltipAction$TailPosition;", "tailPosition", "anchorPosition", "<init>", "(Lcom/avito/android/beduin/common/action/BeduinTooltipAction$MainPosition;Lcom/avito/android/beduin/common/action/BeduinTooltipAction$TailPosition;Lcom/avito/android/beduin/common/action/BeduinTooltipAction$TailPosition;)V", "Lcom/avito/android/beduin/common/action/BeduinTooltipAction$MainPosition;", "e", "()Lcom/avito/android/beduin/common/action/BeduinTooltipAction$MainPosition;", "Lcom/avito/android/beduin/common/action/BeduinTooltipAction$TailPosition;", "d", "()Lcom/avito/android/beduin/common/action/BeduinTooltipAction$TailPosition;", "c", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Position implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Position> CREATOR = new a();

        @com.google.gson.annotations.c("anchorPosition")
        @l
        private final TailPosition anchorPosition;

        @com.google.gson.annotations.c("tailPosition")
        @l
        private final TailPosition tailPosition;

        @com.google.gson.annotations.c("tooltipPosition")
        @l
        private final MainPosition tooltipPosition;

        /* compiled from: BeduinTooltipAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Position> {
            @Override // android.os.Parcelable.Creator
            public final Position createFromParcel(Parcel parcel) {
                return new Position(parcel.readInt() == 0 ? null : MainPosition.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : TailPosition.valueOf(parcel.readString()), parcel.readInt() != 0 ? TailPosition.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Position[] newArray(int i12) {
                return new Position[i12];
            }
        }

        public Position(@l MainPosition mainPosition, @l TailPosition tailPosition, @l TailPosition tailPosition2) {
            this.tooltipPosition = mainPosition;
            this.tailPosition = tailPosition;
            this.anchorPosition = tailPosition2;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final TailPosition getAnchorPosition() {
            return this.anchorPosition;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final TailPosition getTailPosition() {
            return this.tailPosition;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final MainPosition getTooltipPosition() {
            return this.tooltipPosition;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Position)) {
                return false;
            }
            Position position = (Position) obj;
            return this.tooltipPosition == position.tooltipPosition && this.tailPosition == position.tailPosition && this.anchorPosition == position.anchorPosition;
        }

        public final int hashCode() {
            MainPosition mainPosition = this.tooltipPosition;
            int iHashCode = (mainPosition == null ? 0 : mainPosition.hashCode()) * 31;
            TailPosition tailPosition = this.tailPosition;
            int iHashCode2 = (iHashCode + (tailPosition == null ? 0 : tailPosition.hashCode())) * 31;
            TailPosition tailPosition2 = this.anchorPosition;
            return iHashCode2 + (tailPosition2 != null ? tailPosition2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Position(tooltipPosition=" + this.tooltipPosition + ", tailPosition=" + this.tailPosition + ", anchorPosition=" + this.anchorPosition + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            MainPosition mainPosition = this.tooltipPosition;
            if (mainPosition == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(mainPosition.name());
            }
            TailPosition tailPosition = this.tailPosition;
            if (tailPosition == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(tailPosition.name());
            }
            TailPosition tailPosition2 = this.anchorPosition;
            if (tailPosition2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(tailPosition2.name());
            }
        }
    }

    /* compiled from: BeduinTooltipAction.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Size;", "Landroid/os/Parcelable;", "", "width", "height", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "c", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Size implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Size> CREATOR = new a();

        @com.google.gson.annotations.c("height")
        @l
        private final Integer height;

        @com.google.gson.annotations.c("width")
        @l
        private final Integer width;

        /* compiled from: BeduinTooltipAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Size> {
            @Override // android.os.Parcelable.Creator
            public final Size createFromParcel(Parcel parcel) {
                return new Size(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Size[] newArray(int i12) {
                return new Size[i12];
            }
        }

        public Size(@l Integer num, @l Integer num2) {
            this.width = num;
            this.height = num2;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Integer getHeight() {
            return this.height;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Integer getWidth() {
            return this.width;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Size)) {
                return false;
            }
            Size size = (Size) obj;
            return L.f(this.width, size.width) && L.f(this.height, size.height);
        }

        public final int hashCode() {
            Integer num = this.width;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.height;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Size(width=");
            sb2.append(this.width);
            sb2.append(", height=");
            return s.j(sb2, this.height, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Integer num = this.width;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.height;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinTooltipAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinTooltipAction$Style;", "", "(Ljava/lang/String;I)V", "STANDARD", "MEDIUM", "SMALL", "INVERSE", "INVERSE_SMALL", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @com.google.gson.annotations.c("whiteMedium")
        public static final Style INVERSE;

        @com.google.gson.annotations.c("whiteSmall")
        public static final Style INVERSE_SMALL;

        @com.google.gson.annotations.c("defaultMedium")
        public static final Style MEDIUM;

        @com.google.gson.annotations.c("defaultSmall")
        public static final Style SMALL;

        @com.google.gson.annotations.c("standard")
        public static final Style STANDARD;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Style[] f100026b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f100027c;

        static {
            Style style = new Style("STANDARD", 0);
            STANDARD = style;
            Style style2 = new Style("MEDIUM", 1);
            MEDIUM = style2;
            Style style3 = new Style("SMALL", 2);
            SMALL = style3;
            Style style4 = new Style("INVERSE", 3);
            INVERSE = style4;
            Style style5 = new Style("INVERSE_SMALL", 4);
            INVERSE_SMALL = style5;
            Style[] styleArr = {style, style2, style3, style4, style5};
            f100026b = styleArr;
            f100027c = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f100026b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinTooltipAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinTooltipAction$TailPosition;", "", "(Ljava/lang/String;I)V", "START", "END", "CENTER", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TailPosition {

        @com.google.gson.annotations.c("center")
        public static final TailPosition CENTER;

        @com.google.gson.annotations.c("end")
        public static final TailPosition END;

        @com.google.gson.annotations.c("start")
        public static final TailPosition START;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ TailPosition[] f100028b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f100029c;

        static {
            TailPosition tailPosition = new TailPosition("START", 0);
            START = tailPosition;
            TailPosition tailPosition2 = new TailPosition("END", 1);
            END = tailPosition2;
            TailPosition tailPosition3 = new TailPosition("CENTER", 2);
            CENTER = tailPosition3;
            TailPosition[] tailPositionArr = {tailPosition, tailPosition2, tailPosition3};
            f100028b = tailPositionArr;
            f100029c = kotlin.enums.c.a(tailPositionArr);
        }

        private TailPosition(String str, int i12) {
        }

        public static TailPosition valueOf(String str) {
            return (TailPosition) Enum.valueOf(TailPosition.class, str);
        }

        public static TailPosition[] values() {
            return (TailPosition[]) f100028b.clone();
        }
    }

    /* compiled from: BeduinTooltipAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinTooltipAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinTooltipAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinTooltipAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinTooltipAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinTooltipAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinTooltipAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinTooltipAction createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Position positionCreateFromParcel = parcel.readInt() == 0 ? null : Position.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Size sizeCreateFromParcel = parcel.readInt() == 0 ? null : Size.CREATOR.createFromParcel(parcel);
            Button buttonCreateFromParcel = parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel);
            Button buttonCreateFromParcel2 = parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel);
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            Style styleValueOf = parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinTooltipAction(string, string2, positionCreateFromParcel, string3, string4, sizeCreateFromParcel, buttonCreateFromParcel, buttonCreateFromParcel2, beduinComponentThemeCreateFromParcel, styleValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinTooltipAction[] newArray(int i12) {
            return new BeduinTooltipAction[i12];
        }
    }

    public BeduinTooltipAction(@Y61.k String str, @Y61.k String str2, @l Position position, @l String str3, @l String str4, @l Size size, @l Button button, @l Button button2, @l BeduinComponentTheme beduinComponentTheme, @l Style style, @l Boolean bool) {
        this.formId = str;
        this.modelId = str2;
        this.position = position;
        this.title = str3;
        this.text = str4;
        this.size = size;
        this.button = button;
        this.closeButton = button2;
        this.theme = beduinComponentTheme;
        this.style = style;
        this.showTail = bool;
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getFormId() {
        return this.formId;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final Boolean getShowTail() {
        return this.showTail;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Position getPosition() {
        return this.position;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Button getCloseButton() {
        return this.closeButton;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @Y61.k
    public final BeduinTooltipAction copy(@Y61.k String formId, @Y61.k String modelId, @l Position position, @l String title, @l String text, @l Size size, @l Button button, @l Button closeButton, @l BeduinComponentTheme theme, @l Style style, @l Boolean showTail) {
        return new BeduinTooltipAction(formId, modelId, position, title, text, size, button, closeButton, theme, style, showTail);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinTooltipAction)) {
            return false;
        }
        BeduinTooltipAction beduinTooltipAction = (BeduinTooltipAction) other;
        return L.f(this.formId, beduinTooltipAction.formId) && L.f(this.modelId, beduinTooltipAction.modelId) && L.f(this.position, beduinTooltipAction.position) && L.f(this.title, beduinTooltipAction.title) && L.f(this.text, beduinTooltipAction.text) && L.f(this.size, beduinTooltipAction.size) && L.f(this.button, beduinTooltipAction.button) && L.f(this.closeButton, beduinTooltipAction.closeButton) && this.theme == beduinTooltipAction.theme && this.style == beduinTooltipAction.style && L.f(this.showTail, beduinTooltipAction.showTail);
    }

    @l
    public final Button getButton() {
        return this.button;
    }

    @l
    public final Button getCloseButton() {
        return this.closeButton;
    }

    @Y61.k
    public final String getFormId() {
        return this.formId;
    }

    @Y61.k
    public final String getModelId() {
        return this.modelId;
    }

    @l
    public final Position getPosition() {
        return this.position;
    }

    @l
    public final Boolean getShowTail() {
        return this.showTail;
    }

    @l
    public final Size getSize() {
        return this.size;
    }

    @l
    public final Style getStyle() {
        return this.style;
    }

    @l
    public final String getText() {
        return this.text;
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
        int iD2 = H.d(this.formId.hashCode() * 31, 31, this.modelId);
        Position position = this.position;
        int iHashCode = (iD2 + (position == null ? 0 : position.hashCode())) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Size size = this.size;
        int iHashCode4 = (iHashCode3 + (size == null ? 0 : size.hashCode())) * 31;
        Button button = this.button;
        int iHashCode5 = (iHashCode4 + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.closeButton;
        int iHashCode6 = (iHashCode5 + (button2 == null ? 0 : button2.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iHashCode7 = (iHashCode6 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        Style style = this.style;
        int iHashCode8 = (iHashCode7 + (style == null ? 0 : style.hashCode())) * 31;
        Boolean bool = this.showTail;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinTooltipAction(formId=");
        sb2.append(this.formId);
        sb2.append(", modelId=");
        sb2.append(this.modelId);
        sb2.append(", position=");
        sb2.append(this.position);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", closeButton=");
        sb2.append(this.closeButton);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", showTail=");
        return C0.g(sb2, this.showTail, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.formId);
        parcel.writeString(this.modelId);
        Position position = this.position;
        if (position == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            position.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        Size size = this.size;
        if (size == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            size.writeToParcel(parcel, flags);
        }
        Button button = this.button;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, flags);
        }
        Button button2 = this.closeButton;
        if (button2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button2.writeToParcel(parcel, flags);
        }
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        Style style = this.style;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(style.name());
        }
        Boolean bool = this.showTail;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
