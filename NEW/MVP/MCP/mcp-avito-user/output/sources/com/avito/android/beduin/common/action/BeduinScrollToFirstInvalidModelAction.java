package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinScrollToFirstInvalidModelAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinScrollToFirstInvalidModelAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "formId", "", "requireFocus", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/action/BeduinScrollToFirstInvalidModelAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFormId", "Ljava/lang/Boolean;", "getRequireFocus", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinScrollToFirstInvalidModelAction implements BeduinAction {

    @Y61.k
    private final String formId;

    @l
    private final Boolean requireFocus;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinScrollToFirstInvalidModelAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinScrollToFirstInvalidModelAction.class;

    @Y61.k
    private static final String type = "scrollToFirstInvalidModel";

    /* compiled from: BeduinScrollToFirstInvalidModelAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinScrollToFirstInvalidModelAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinScrollToFirstInvalidModelAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinScrollToFirstInvalidModelAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99985c() {
            return BeduinScrollToFirstInvalidModelAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinScrollToFirstInvalidModelAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinScrollToFirstInvalidModelAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinScrollToFirstInvalidModelAction createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinScrollToFirstInvalidModelAction(string, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinScrollToFirstInvalidModelAction[] newArray(int i12) {
            return new BeduinScrollToFirstInvalidModelAction[i12];
        }
    }

    public BeduinScrollToFirstInvalidModelAction(@Y61.k String str, @l Boolean bool) {
        this.formId = str;
        this.requireFocus = bool;
    }

    public static /* synthetic */ BeduinScrollToFirstInvalidModelAction copy$default(BeduinScrollToFirstInvalidModelAction beduinScrollToFirstInvalidModelAction, String str, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinScrollToFirstInvalidModelAction.formId;
        }
        if ((i12 & 2) != 0) {
            bool = beduinScrollToFirstInvalidModelAction.requireFocus;
        }
        return beduinScrollToFirstInvalidModelAction.copy(str, bool);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getFormId() {
        return this.formId;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getRequireFocus() {
        return this.requireFocus;
    }

    @Y61.k
    public final BeduinScrollToFirstInvalidModelAction copy(@Y61.k String formId, @l Boolean requireFocus) {
        return new BeduinScrollToFirstInvalidModelAction(formId, requireFocus);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinScrollToFirstInvalidModelAction)) {
            return false;
        }
        BeduinScrollToFirstInvalidModelAction beduinScrollToFirstInvalidModelAction = (BeduinScrollToFirstInvalidModelAction) other;
        return L.f(this.formId, beduinScrollToFirstInvalidModelAction.formId) && L.f(this.requireFocus, beduinScrollToFirstInvalidModelAction.requireFocus);
    }

    @Y61.k
    public final String getFormId() {
        return this.formId;
    }

    @l
    public final Boolean getRequireFocus() {
        return this.requireFocus;
    }

    public int hashCode() {
        int iHashCode = this.formId.hashCode() * 31;
        Boolean bool = this.requireFocus;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinScrollToFirstInvalidModelAction(formId=");
        sb2.append(this.formId);
        sb2.append(", requireFocus=");
        return C0.g(sb2, this.requireFocus, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.formId);
        Boolean bool = this.requireFocus;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
