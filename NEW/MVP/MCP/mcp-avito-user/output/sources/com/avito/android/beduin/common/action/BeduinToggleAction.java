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

/* compiled from: BeduinToggleAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001%B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u0007\u0010\u000e¨\u0006&"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinToggleAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "LUi/e;", "", "targetFormId", "modelId", "", "isEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/action/BeduinToggleAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTargetFormId", "getModelId", "Ljava/lang/Boolean;", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinToggleAction implements BeduinAction, Ui.e {

    @l
    private final Boolean isEnabled;

    @Y61.k
    private final String modelId;

    @Y61.k
    private final String targetFormId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinToggleAction> CREATOR = new b();

    @Y61.k
    private static final String type = "toggle";

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinToggleAction.class;

    /* compiled from: BeduinToggleAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinToggleAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinToggleAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinToggleAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99987c() {
            return BeduinToggleAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinToggleAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinToggleAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinToggleAction createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinToggleAction(string, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinToggleAction[] newArray(int i12) {
            return new BeduinToggleAction[i12];
        }
    }

    public BeduinToggleAction(@Y61.k String str, @Y61.k String str2, @l Boolean bool) {
        this.targetFormId = str;
        this.modelId = str2;
        this.isEnabled = bool;
    }

    public static /* synthetic */ BeduinToggleAction copy$default(BeduinToggleAction beduinToggleAction, String str, String str2, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinToggleAction.targetFormId;
        }
        if ((i12 & 2) != 0) {
            str2 = beduinToggleAction.modelId;
        }
        if ((i12 & 4) != 0) {
            bool = beduinToggleAction.isEnabled;
        }
        return beduinToggleAction.copy(str, str2, bool);
    }

    @Y61.k
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
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Y61.k
    public final BeduinToggleAction copy(@Y61.k String targetFormId, @Y61.k String modelId, @l Boolean isEnabled) {
        return new BeduinToggleAction(targetFormId, modelId, isEnabled);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinToggleAction)) {
            return false;
        }
        BeduinToggleAction beduinToggleAction = (BeduinToggleAction) other;
        return L.f(this.targetFormId, beduinToggleAction.targetFormId) && L.f(this.modelId, beduinToggleAction.modelId) && L.f(this.isEnabled, beduinToggleAction.isEnabled);
    }

    @Y61.k
    public final String getModelId() {
        return this.modelId;
    }

    @Y61.k
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    public int hashCode() {
        int iD2 = H.d(this.targetFormId.hashCode() * 31, 31, this.modelId);
        Boolean bool = this.isEnabled;
        return iD2 + (bool == null ? 0 : bool.hashCode());
    }

    @l
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinToggleAction(targetFormId=");
        sb2.append(this.targetFormId);
        sb2.append(", modelId=");
        sb2.append(this.modelId);
        sb2.append(", isEnabled=");
        return C0.g(sb2, this.isEnabled, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.targetFormId);
        parcel.writeString(this.modelId);
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
