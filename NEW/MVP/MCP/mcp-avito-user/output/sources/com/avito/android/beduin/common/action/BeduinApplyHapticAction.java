package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinApplyHapticAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006!"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinApplyHapticAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "Lcom/avito/android/beduin/common/action/BeduinApplyHapticAction$AndroidType;", "androidType", "<init>", "(Lcom/avito/android/beduin/common/action/BeduinApplyHapticAction$AndroidType;)V", "component1", "()Lcom/avito/android/beduin/common/action/BeduinApplyHapticAction$AndroidType;", "copy", "(Lcom/avito/android/beduin/common/action/BeduinApplyHapticAction$AndroidType;)Lcom/avito/android/beduin/common/action/BeduinApplyHapticAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/action/BeduinApplyHapticAction$AndroidType;", "getAndroidType", "Companion", "AndroidType", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinApplyHapticAction implements BeduinAction {

    @Y61.k
    private final AndroidType androidType;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinApplyHapticAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinApplyHapticAction.class;

    @Y61.k
    private static final String type = "applyHaptic";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinApplyHapticAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinApplyHapticAction$AndroidType;", "", "(Ljava/lang/String;I)V", "CLOCK_TICK", "CONFIRM", "CONTEXT_CLICK", "DRAG_START", "GESTURE_END", "GESTURE_START", "KEYBOARD_PRESS", "KEYBOARD_RELEASE", "LONG_PRESS", "REJECT", "SEGMENT_TICK", "SEGMENT_FREQUENT_TICK", "TEXT_HANDLE_MOVE", "TOGGLE_OFF", "TOGGLE_ON", "NO_HAPTICS", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AndroidType {

        @com.google.gson.annotations.c("clockTick")
        public static final AndroidType CLOCK_TICK;

        @com.google.gson.annotations.c("confirm")
        public static final AndroidType CONFIRM;

        @com.google.gson.annotations.c("contextClick")
        public static final AndroidType CONTEXT_CLICK;

        @com.google.gson.annotations.c("dragStart")
        public static final AndroidType DRAG_START;

        @com.google.gson.annotations.c("gestureEnd")
        public static final AndroidType GESTURE_END;

        @com.google.gson.annotations.c("gestureStart")
        public static final AndroidType GESTURE_START;

        @com.google.gson.annotations.c("keyboardPress")
        public static final AndroidType KEYBOARD_PRESS;

        @com.google.gson.annotations.c("keyboardRelease")
        public static final AndroidType KEYBOARD_RELEASE;

        @com.google.gson.annotations.c("longPress")
        public static final AndroidType LONG_PRESS;

        @com.google.gson.annotations.c("noHaptics")
        public static final AndroidType NO_HAPTICS;

        @com.google.gson.annotations.c("reject")
        public static final AndroidType REJECT;

        @com.google.gson.annotations.c("segmentFrequentTick")
        public static final AndroidType SEGMENT_FREQUENT_TICK;

        @com.google.gson.annotations.c("segmentTick")
        public static final AndroidType SEGMENT_TICK;

        @com.google.gson.annotations.c("textHandleMove")
        public static final AndroidType TEXT_HANDLE_MOVE;

        @com.google.gson.annotations.c("toggleOff")
        public static final AndroidType TOGGLE_OFF;

        @com.google.gson.annotations.c("toggleOn")
        public static final AndroidType TOGGLE_ON;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AndroidType[] f99964b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f99965c;

        static {
            AndroidType androidType = new AndroidType("CLOCK_TICK", 0);
            CLOCK_TICK = androidType;
            AndroidType androidType2 = new AndroidType("CONFIRM", 1);
            CONFIRM = androidType2;
            AndroidType androidType3 = new AndroidType("CONTEXT_CLICK", 2);
            CONTEXT_CLICK = androidType3;
            AndroidType androidType4 = new AndroidType("DRAG_START", 3);
            DRAG_START = androidType4;
            AndroidType androidType5 = new AndroidType("GESTURE_END", 4);
            GESTURE_END = androidType5;
            AndroidType androidType6 = new AndroidType("GESTURE_START", 5);
            GESTURE_START = androidType6;
            AndroidType androidType7 = new AndroidType("KEYBOARD_PRESS", 6);
            KEYBOARD_PRESS = androidType7;
            AndroidType androidType8 = new AndroidType("KEYBOARD_RELEASE", 7);
            KEYBOARD_RELEASE = androidType8;
            AndroidType androidType9 = new AndroidType("LONG_PRESS", 8);
            LONG_PRESS = androidType9;
            AndroidType androidType10 = new AndroidType("REJECT", 9);
            REJECT = androidType10;
            AndroidType androidType11 = new AndroidType("SEGMENT_TICK", 10);
            SEGMENT_TICK = androidType11;
            AndroidType androidType12 = new AndroidType("SEGMENT_FREQUENT_TICK", 11);
            SEGMENT_FREQUENT_TICK = androidType12;
            AndroidType androidType13 = new AndroidType("TEXT_HANDLE_MOVE", 12);
            TEXT_HANDLE_MOVE = androidType13;
            AndroidType androidType14 = new AndroidType("TOGGLE_OFF", 13);
            TOGGLE_OFF = androidType14;
            AndroidType androidType15 = new AndroidType("TOGGLE_ON", 14);
            TOGGLE_ON = androidType15;
            AndroidType androidType16 = new AndroidType("NO_HAPTICS", 15);
            NO_HAPTICS = androidType16;
            AndroidType[] androidTypeArr = {androidType, androidType2, androidType3, androidType4, androidType5, androidType6, androidType7, androidType8, androidType9, androidType10, androidType11, androidType12, androidType13, androidType14, androidType15, androidType16};
            f99964b = androidTypeArr;
            f99965c = kotlin.enums.c.a(androidTypeArr);
        }

        private AndroidType(String str, int i12) {
        }

        public static AndroidType valueOf(String str) {
            return (AndroidType) Enum.valueOf(AndroidType.class, str);
        }

        public static AndroidType[] values() {
            return (AndroidType[]) f99964b.clone();
        }
    }

    /* compiled from: BeduinApplyHapticAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinApplyHapticAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinApplyHapticAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinApplyHapticAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99995b() {
            return BeduinApplyHapticAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinApplyHapticAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinApplyHapticAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinApplyHapticAction createFromParcel(Parcel parcel) {
            return new BeduinApplyHapticAction(AndroidType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinApplyHapticAction[] newArray(int i12) {
            return new BeduinApplyHapticAction[i12];
        }
    }

    public BeduinApplyHapticAction(@Y61.k AndroidType androidType) {
        this.androidType = androidType;
    }

    public static /* synthetic */ BeduinApplyHapticAction copy$default(BeduinApplyHapticAction beduinApplyHapticAction, AndroidType androidType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            androidType = beduinApplyHapticAction.androidType;
        }
        return beduinApplyHapticAction.copy(androidType);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final AndroidType getAndroidType() {
        return this.androidType;
    }

    @Y61.k
    public final BeduinApplyHapticAction copy(@Y61.k AndroidType androidType) {
        return new BeduinApplyHapticAction(androidType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeduinApplyHapticAction) && this.androidType == ((BeduinApplyHapticAction) other).androidType;
    }

    @Y61.k
    public final AndroidType getAndroidType() {
        return this.androidType;
    }

    public int hashCode() {
        return this.androidType.hashCode();
    }

    @Y61.k
    public String toString() {
        return "BeduinApplyHapticAction(androidType=" + this.androidType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.androidType.name());
    }
}
