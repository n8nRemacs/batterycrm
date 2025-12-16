package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinApplyCountdownTextAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 42\u00020\u0001:\u0003567BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J`\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u000fR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0017¨\u00068"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "id", "targetFormId", "modelId", "Lcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction$CountdownParams;", "countdown", "baseText", "replacementKey", "", "onFinishActions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction$CountdownParams;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction$CountdownParams;", "component5", "component6", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction$CountdownParams;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTargetFormId", "getModelId", "Lcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction$CountdownParams;", "getCountdown", "getBaseText", "getReplacementKey", "Ljava/util/List;", "getOnFinishActions", "Companion", "a", "CountdownParams", "CountdownUnit", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinApplyCountdownTextAction implements BeduinAction {

    @Y61.k
    private final String baseText;

    @Y61.k
    private final CountdownParams countdown;

    @l
    private final String id;

    @Y61.k
    private final String modelId;

    @l
    private final List<BeduinAction> onFinishActions;

    @Y61.k
    private final String replacementKey;

    @Y61.k
    private final String targetFormId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinApplyCountdownTextAction> CREATOR = new b();

    @Y61.k
    private static final String type = "applyCountdownText";

    @Y61.k
    private static final Class<BeduinApplyCountdownTextAction> action = BeduinApplyCountdownTextAction.class;

    /* compiled from: BeduinApplyCountdownTextAction.kt */
    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\r¨\u0006'"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction$CountdownParams;", "Landroid/os/Parcelable;", "", "duration", "step", "Lcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction$CountdownUnit;", "unit", "<init>", "(JJLcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction$CountdownUnit;)V", "component1", "()J", "component2", "component3", "()Lcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction$CountdownUnit;", "copy", "(JJLcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction$CountdownUnit;)Lcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction$CountdownParams;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getDuration", "getStep", "Lcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction$CountdownUnit;", "getUnit", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class CountdownParams implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<CountdownParams> CREATOR = new a();
        private final long duration;
        private final long step;

        @l
        private final CountdownUnit unit;

        /* compiled from: BeduinApplyCountdownTextAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CountdownParams> {
            @Override // android.os.Parcelable.Creator
            public final CountdownParams createFromParcel(Parcel parcel) {
                return new CountdownParams(parcel.readLong(), parcel.readLong(), parcel.readInt() == 0 ? null : CountdownUnit.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final CountdownParams[] newArray(int i12) {
                return new CountdownParams[i12];
            }
        }

        public CountdownParams(long j12, long j13, @l CountdownUnit countdownUnit) {
            this.duration = j12;
            this.step = j13;
            this.unit = countdownUnit;
        }

        public static /* synthetic */ CountdownParams copy$default(CountdownParams countdownParams, long j12, long j13, CountdownUnit countdownUnit, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j12 = countdownParams.duration;
            }
            long j14 = j12;
            if ((i12 & 2) != 0) {
                j13 = countdownParams.step;
            }
            long j15 = j13;
            if ((i12 & 4) != 0) {
                countdownUnit = countdownParams.unit;
            }
            return countdownParams.copy(j14, j15, countdownUnit);
        }

        /* renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* renamed from: component2, reason: from getter */
        public final long getStep() {
            return this.step;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final CountdownUnit getUnit() {
            return this.unit;
        }

        @Y61.k
        public final CountdownParams copy(long duration, long step, @l CountdownUnit unit) {
            return new CountdownParams(duration, step, unit);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountdownParams)) {
                return false;
            }
            CountdownParams countdownParams = (CountdownParams) other;
            return this.duration == countdownParams.duration && this.step == countdownParams.step && this.unit == countdownParams.unit;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStep() {
            return this.step;
        }

        @l
        public final CountdownUnit getUnit() {
            return this.unit;
        }

        public int hashCode() {
            int iG2 = r.g(Long.hashCode(this.duration) * 31, 31, this.step);
            CountdownUnit countdownUnit = this.unit;
            return iG2 + (countdownUnit == null ? 0 : countdownUnit.hashCode());
        }

        @Y61.k
        public String toString() {
            return "CountdownParams(duration=" + this.duration + ", step=" + this.step + ", unit=" + this.unit + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeLong(this.duration);
            parcel.writeLong(this.step);
            CountdownUnit countdownUnit = this.unit;
            if (countdownUnit == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(countdownUnit.name());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinApplyCountdownTextAction.kt */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction$CountdownUnit;", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "getTimeUnit", "()Ljava/util/concurrent/TimeUnit;", "SECONDS", "MINUTES", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CountdownUnit {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ CountdownUnit[] $VALUES;

        @Y61.k
        private final TimeUnit timeUnit;

        @com.google.gson.annotations.c("seconds")
        public static final CountdownUnit SECONDS = new CountdownUnit("SECONDS", 0, TimeUnit.SECONDS);

        @com.google.gson.annotations.c("minutes")
        public static final CountdownUnit MINUTES = new CountdownUnit("MINUTES", 1, TimeUnit.MINUTES);

        private static final /* synthetic */ CountdownUnit[] $values() {
            return new CountdownUnit[]{SECONDS, MINUTES};
        }

        static {
            CountdownUnit[] countdownUnitArr$values = $values();
            $VALUES = countdownUnitArr$values;
            $ENTRIES = kotlin.enums.c.a(countdownUnitArr$values);
        }

        private CountdownUnit(String str, int i12, TimeUnit timeUnit) {
            this.timeUnit = timeUnit;
        }

        @Y61.k
        public static kotlin.enums.a<CountdownUnit> getEntries() {
            return $ENTRIES;
        }

        public static CountdownUnit valueOf(String str) {
            return (CountdownUnit) Enum.valueOf(CountdownUnit.class, str);
        }

        public static CountdownUnit[] values() {
            return (CountdownUnit[]) $VALUES.clone();
        }

        @Y61.k
        public final TimeUnit getTimeUnit() {
            return this.timeUnit;
        }
    }

    /* compiled from: BeduinApplyCountdownTextAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinApplyCountdownTextAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<BeduinApplyCountdownTextAction> getAction() {
            return BeduinApplyCountdownTextAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99987c() {
            return BeduinApplyCountdownTextAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinApplyCountdownTextAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinApplyCountdownTextAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinApplyCountdownTextAction createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            CountdownParams countdownParamsCreateFromParcel = CountdownParams.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinApplyCountdownTextAction.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BeduinApplyCountdownTextAction(string, string2, string3, countdownParamsCreateFromParcel, string4, string5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinApplyCountdownTextAction[] newArray(int i12) {
            return new BeduinApplyCountdownTextAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinApplyCountdownTextAction(@l String str, @Y61.k String str2, @Y61.k String str3, @Y61.k CountdownParams countdownParams, @Y61.k String str4, @Y61.k String str5, @l List<? extends BeduinAction> list) {
        this.id = str;
        this.targetFormId = str2;
        this.modelId = str3;
        this.countdown = countdownParams;
        this.baseText = str4;
        this.replacementKey = str5;
        this.onFinishActions = list;
    }

    public static /* synthetic */ BeduinApplyCountdownTextAction copy$default(BeduinApplyCountdownTextAction beduinApplyCountdownTextAction, String str, String str2, String str3, CountdownParams countdownParams, String str4, String str5, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinApplyCountdownTextAction.id;
        }
        if ((i12 & 2) != 0) {
            str2 = beduinApplyCountdownTextAction.targetFormId;
        }
        String str6 = str2;
        if ((i12 & 4) != 0) {
            str3 = beduinApplyCountdownTextAction.modelId;
        }
        String str7 = str3;
        if ((i12 & 8) != 0) {
            countdownParams = beduinApplyCountdownTextAction.countdown;
        }
        CountdownParams countdownParams2 = countdownParams;
        if ((i12 & 16) != 0) {
            str4 = beduinApplyCountdownTextAction.baseText;
        }
        String str8 = str4;
        if ((i12 & 32) != 0) {
            str5 = beduinApplyCountdownTextAction.replacementKey;
        }
        String str9 = str5;
        if ((i12 & 64) != 0) {
            list = beduinApplyCountdownTextAction.onFinishActions;
        }
        return beduinApplyCountdownTextAction.copy(str, str6, str7, countdownParams2, str8, str9, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    @Y61.k
    /* renamed from: component3, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    @Y61.k
    /* renamed from: component4, reason: from getter */
    public final CountdownParams getCountdown() {
        return this.countdown;
    }

    @Y61.k
    /* renamed from: component5, reason: from getter */
    public final String getBaseText() {
        return this.baseText;
    }

    @Y61.k
    /* renamed from: component6, reason: from getter */
    public final String getReplacementKey() {
        return this.replacementKey;
    }

    @l
    public final List<BeduinAction> component7() {
        return this.onFinishActions;
    }

    @Y61.k
    public final BeduinApplyCountdownTextAction copy(@l String id2, @Y61.k String targetFormId, @Y61.k String modelId, @Y61.k CountdownParams countdown, @Y61.k String baseText, @Y61.k String replacementKey, @l List<? extends BeduinAction> onFinishActions) {
        return new BeduinApplyCountdownTextAction(id2, targetFormId, modelId, countdown, baseText, replacementKey, onFinishActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinApplyCountdownTextAction)) {
            return false;
        }
        BeduinApplyCountdownTextAction beduinApplyCountdownTextAction = (BeduinApplyCountdownTextAction) other;
        return L.f(this.id, beduinApplyCountdownTextAction.id) && L.f(this.targetFormId, beduinApplyCountdownTextAction.targetFormId) && L.f(this.modelId, beduinApplyCountdownTextAction.modelId) && L.f(this.countdown, beduinApplyCountdownTextAction.countdown) && L.f(this.baseText, beduinApplyCountdownTextAction.baseText) && L.f(this.replacementKey, beduinApplyCountdownTextAction.replacementKey) && L.f(this.onFinishActions, beduinApplyCountdownTextAction.onFinishActions);
    }

    @Y61.k
    public final String getBaseText() {
        return this.baseText;
    }

    @Y61.k
    public final CountdownParams getCountdown() {
        return this.countdown;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @Y61.k
    public final String getModelId() {
        return this.modelId;
    }

    @l
    public final List<BeduinAction> getOnFinishActions() {
        return this.onFinishActions;
    }

    @Y61.k
    public final String getReplacementKey() {
        return this.replacementKey;
    }

    @Y61.k
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    public int hashCode() {
        String str = this.id;
        int iD2 = H.d(H.d((this.countdown.hashCode() + H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.targetFormId), 31, this.modelId)) * 31, 31, this.baseText), 31, this.replacementKey);
        List<BeduinAction> list = this.onFinishActions;
        return iD2 + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinApplyCountdownTextAction(id=");
        sb2.append(this.id);
        sb2.append(", targetFormId=");
        sb2.append(this.targetFormId);
        sb2.append(", modelId=");
        sb2.append(this.modelId);
        sb2.append(", countdown=");
        sb2.append(this.countdown);
        sb2.append(", baseText=");
        sb2.append(this.baseText);
        sb2.append(", replacementKey=");
        sb2.append(this.replacementKey);
        sb2.append(", onFinishActions=");
        return H.p(sb2, this.onFinishActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.targetFormId);
        parcel.writeString(this.modelId);
        this.countdown.writeToParcel(parcel, flags);
        parcel.writeString(this.baseText);
        parcel.writeString(this.replacementKey);
        List<BeduinAction> list = this.onFinishActions;
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
