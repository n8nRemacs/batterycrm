package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinScrollToComponentAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010JJ\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b\u0006\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b+\u0010\u0010¨\u0006/"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinScrollToComponentAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "targetFormId", "modelId", "", "isAnimated", "Lcom/avito/android/beduin/common/action/BeduinScrollToComponentAction$ScrollPosition;", "scrollPosition", "requireFocus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/action/BeduinScrollToComponentAction$ScrollPosition;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "()Lcom/avito/android/beduin/common/action/BeduinScrollToComponentAction$ScrollPosition;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/action/BeduinScrollToComponentAction$ScrollPosition;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/action/BeduinScrollToComponentAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTargetFormId", "getModelId", "Ljava/lang/Boolean;", "Lcom/avito/android/beduin/common/action/BeduinScrollToComponentAction$ScrollPosition;", "getScrollPosition", "getRequireFocus", "Companion", "a", "ScrollPosition", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinScrollToComponentAction implements BeduinAction {

    @l
    private final Boolean isAnimated;

    @Y61.k
    private final String modelId;

    @l
    private final Boolean requireFocus;

    @l
    private final ScrollPosition scrollPosition;

    @l
    private final String targetFormId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinScrollToComponentAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinScrollToComponentAction.class;

    @Y61.k
    private static final String type = "scrollToComponent";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinScrollToComponentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinScrollToComponentAction$ScrollPosition;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "LEFT", "RIGHT", "CENTERED_VERTICALLY", "CENTERED_HORIZONTALLY", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScrollPosition {

        @com.google.gson.annotations.c("bottom")
        public static final ScrollPosition BOTTOM;

        @com.google.gson.annotations.c("centeredHorizontally")
        public static final ScrollPosition CENTERED_HORIZONTALLY;

        @com.google.gson.annotations.c("centeredVertically")
        public static final ScrollPosition CENTERED_VERTICALLY;

        @com.google.gson.annotations.c("left")
        public static final ScrollPosition LEFT;

        @com.google.gson.annotations.c("right")
        public static final ScrollPosition RIGHT;

        @com.google.gson.annotations.c("top")
        public static final ScrollPosition TOP;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ScrollPosition[] f99998b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f99999c;

        static {
            ScrollPosition scrollPosition = new ScrollPosition("TOP", 0);
            TOP = scrollPosition;
            ScrollPosition scrollPosition2 = new ScrollPosition("BOTTOM", 1);
            BOTTOM = scrollPosition2;
            ScrollPosition scrollPosition3 = new ScrollPosition("LEFT", 2);
            LEFT = scrollPosition3;
            ScrollPosition scrollPosition4 = new ScrollPosition("RIGHT", 3);
            RIGHT = scrollPosition4;
            ScrollPosition scrollPosition5 = new ScrollPosition("CENTERED_VERTICALLY", 4);
            CENTERED_VERTICALLY = scrollPosition5;
            ScrollPosition scrollPosition6 = new ScrollPosition("CENTERED_HORIZONTALLY", 5);
            CENTERED_HORIZONTALLY = scrollPosition6;
            ScrollPosition[] scrollPositionArr = {scrollPosition, scrollPosition2, scrollPosition3, scrollPosition4, scrollPosition5, scrollPosition6};
            f99998b = scrollPositionArr;
            f99999c = kotlin.enums.c.a(scrollPositionArr);
        }

        private ScrollPosition(String str, int i12) {
        }

        public static ScrollPosition valueOf(String str) {
            return (ScrollPosition) Enum.valueOf(ScrollPosition.class, str);
        }

        public static ScrollPosition[] values() {
            return (ScrollPosition[]) f99998b.clone();
        }
    }

    /* compiled from: BeduinScrollToComponentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinScrollToComponentAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinScrollToComponentAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinScrollToComponentAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99969c() {
            return BeduinScrollToComponentAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinScrollToComponentAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinScrollToComponentAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinScrollToComponentAction createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            ScrollPosition scrollPositionValueOf = parcel.readInt() == 0 ? null : ScrollPosition.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinScrollToComponentAction(string, string2, boolValueOf, scrollPositionValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinScrollToComponentAction[] newArray(int i12) {
            return new BeduinScrollToComponentAction[i12];
        }
    }

    public BeduinScrollToComponentAction(@l String str, @Y61.k String str2, @l Boolean bool, @l ScrollPosition scrollPosition, @l Boolean bool2) {
        this.targetFormId = str;
        this.modelId = str2;
        this.isAnimated = bool;
        this.scrollPosition = scrollPosition;
        this.requireFocus = bool2;
    }

    public static /* synthetic */ BeduinScrollToComponentAction copy$default(BeduinScrollToComponentAction beduinScrollToComponentAction, String str, String str2, Boolean bool, ScrollPosition scrollPosition, Boolean bool2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinScrollToComponentAction.targetFormId;
        }
        if ((i12 & 2) != 0) {
            str2 = beduinScrollToComponentAction.modelId;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            bool = beduinScrollToComponentAction.isAnimated;
        }
        Boolean bool3 = bool;
        if ((i12 & 8) != 0) {
            scrollPosition = beduinScrollToComponentAction.scrollPosition;
        }
        ScrollPosition scrollPosition2 = scrollPosition;
        if ((i12 & 16) != 0) {
            bool2 = beduinScrollToComponentAction.requireFocus;
        }
        return beduinScrollToComponentAction.copy(str, str3, bool3, scrollPosition2, bool2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getIsAnimated() {
        return this.isAnimated;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final ScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getRequireFocus() {
        return this.requireFocus;
    }

    @Y61.k
    public final BeduinScrollToComponentAction copy(@l String targetFormId, @Y61.k String modelId, @l Boolean isAnimated, @l ScrollPosition scrollPosition, @l Boolean requireFocus) {
        return new BeduinScrollToComponentAction(targetFormId, modelId, isAnimated, scrollPosition, requireFocus);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinScrollToComponentAction)) {
            return false;
        }
        BeduinScrollToComponentAction beduinScrollToComponentAction = (BeduinScrollToComponentAction) other;
        return L.f(this.targetFormId, beduinScrollToComponentAction.targetFormId) && L.f(this.modelId, beduinScrollToComponentAction.modelId) && L.f(this.isAnimated, beduinScrollToComponentAction.isAnimated) && this.scrollPosition == beduinScrollToComponentAction.scrollPosition && L.f(this.requireFocus, beduinScrollToComponentAction.requireFocus);
    }

    @Y61.k
    public final String getModelId() {
        return this.modelId;
    }

    @l
    public final Boolean getRequireFocus() {
        return this.requireFocus;
    }

    @l
    public final ScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    @l
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    public int hashCode() {
        String str = this.targetFormId;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.modelId);
        Boolean bool = this.isAnimated;
        int iHashCode = (iD2 + (bool == null ? 0 : bool.hashCode())) * 31;
        ScrollPosition scrollPosition = this.scrollPosition;
        int iHashCode2 = (iHashCode + (scrollPosition == null ? 0 : scrollPosition.hashCode())) * 31;
        Boolean bool2 = this.requireFocus;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @l
    public final Boolean isAnimated() {
        return this.isAnimated;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinScrollToComponentAction(targetFormId=");
        sb2.append(this.targetFormId);
        sb2.append(", modelId=");
        sb2.append(this.modelId);
        sb2.append(", isAnimated=");
        sb2.append(this.isAnimated);
        sb2.append(", scrollPosition=");
        sb2.append(this.scrollPosition);
        sb2.append(", requireFocus=");
        return C0.g(sb2, this.requireFocus, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.targetFormId);
        parcel.writeString(this.modelId);
        Boolean bool = this.isAnimated;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        ScrollPosition scrollPosition = this.scrollPosition;
        if (scrollPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(scrollPosition.name());
        }
        Boolean bool2 = this.requireFocus;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }
}
