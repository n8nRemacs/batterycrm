package com.avito.android.map_core.beduin;

import K51.d;
import Ui.InterfaceC15524c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinResetMapAction.kt */
@d
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006\""}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinResetMapAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "Lcom/avito/android/map_core/beduin/BeduinResetMapAction$ResetEntity;", "entitiesToReset", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/map_core/beduin/BeduinResetMapAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getEntitiesToReset", "Companion", "a", "ResetEntity", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BeduinResetMapAction implements BeduinAction {

    @k
    private final List<ResetEntity> entitiesToReset;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinResetMapAction> CREATOR = new b();

    @k
    private static final Class<? extends BeduinAction> action = BeduinResetMapAction.class;

    @k
    private static final String type = "resetMap";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinResetMapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinResetMapAction$ResetEntity;", "", "(Ljava/lang/String;I)V", "TOOLTIP", "BOTTOM_SHEET", "PINS", "SAVED_LOCATION", "FOCUS_ON_REGION", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResetEntity {

        @c("bottomSheet")
        public static final ResetEntity BOTTOM_SHEET;

        @c("focusOnRegion")
        public static final ResetEntity FOCUS_ON_REGION;

        @c("pins")
        public static final ResetEntity PINS;

        @c("savedLocation")
        public static final ResetEntity SAVED_LOCATION;

        @c(TooltipAttribute.ATTRIBUTE_TYPE)
        public static final ResetEntity TOOLTIP;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ResetEntity[] f185644b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f185645c;

        static {
            ResetEntity resetEntity = new ResetEntity("TOOLTIP", 0);
            TOOLTIP = resetEntity;
            ResetEntity resetEntity2 = new ResetEntity("BOTTOM_SHEET", 1);
            BOTTOM_SHEET = resetEntity2;
            ResetEntity resetEntity3 = new ResetEntity("PINS", 2);
            PINS = resetEntity3;
            ResetEntity resetEntity4 = new ResetEntity("SAVED_LOCATION", 3);
            SAVED_LOCATION = resetEntity4;
            ResetEntity resetEntity5 = new ResetEntity("FOCUS_ON_REGION", 4);
            FOCUS_ON_REGION = resetEntity5;
            ResetEntity[] resetEntityArr = {resetEntity, resetEntity2, resetEntity3, resetEntity4, resetEntity5};
            f185644b = resetEntityArr;
            f185645c = kotlin.enums.c.a(resetEntityArr);
        }

        private ResetEntity(String str, int i12) {
        }

        public static ResetEntity valueOf(String str) {
            return (ResetEntity) Enum.valueOf(ResetEntity.class, str);
        }

        public static ResetEntity[] values() {
            return (ResetEntity[]) f185644b.clone();
        }
    }

    /* compiled from: BeduinResetMapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinResetMapAction$a;", "LUi/c;", "<init>", "()V", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map_core.beduin.BeduinResetMapAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinResetMapAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF99987c() {
            return BeduinResetMapAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinResetMapAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinResetMapAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinResetMapAction createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList.add(ResetEntity.valueOf(parcel.readString()));
            }
            return new BeduinResetMapAction(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinResetMapAction[] newArray(int i12) {
            return new BeduinResetMapAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinResetMapAction(@k List<? extends ResetEntity> list) {
        this.entitiesToReset = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinResetMapAction copy$default(BeduinResetMapAction beduinResetMapAction, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = beduinResetMapAction.entitiesToReset;
        }
        return beduinResetMapAction.copy(list);
    }

    @k
    public final List<ResetEntity> component1() {
        return this.entitiesToReset;
    }

    @k
    public final BeduinResetMapAction copy(@k List<? extends ResetEntity> entitiesToReset) {
        return new BeduinResetMapAction(entitiesToReset);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeduinResetMapAction) && L.f(this.entitiesToReset, ((BeduinResetMapAction) other).entitiesToReset);
    }

    @k
    public final List<ResetEntity> getEntitiesToReset() {
        return this.entitiesToReset;
    }

    public int hashCode() {
        return this.entitiesToReset.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("BeduinResetMapAction(entitiesToReset="), this.entitiesToReset, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.entitiesToReset, parcel);
        while (itJ.hasNext()) {
            parcel.writeString(((ResetEntity) itJ.next()).name());
        }
    }
}
