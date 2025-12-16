package com.avito.android.remote.model.category_parameters.slot;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import j.InterfaceC42153i;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: Slot.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B%\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b&\u0010\u000fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R4\u0010,\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030+\u0012\u0004\u0012\u00020\u0014\u0018\u00010*8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R6\u00107\u001a\b\u0012\u0004\u0012\u000203022\f\u00106\u001a\b\u0012\u0004\u0012\u000203028V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00105\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "T", "Lcom/avito/android/remote/model/category_parameters/slot/BaseSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/ParameterHolder;", "Lcom/avito/android/remote/model/category_parameters/slot/ParametersInitializer;", "Lcom/avito/android/remote/model/category_parameters/slot/ParameterChangesListenerHolder;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;)V", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "Lcom/avito/android/remote/model/PretendErrorValue;", "pretendResult", "applyPretendResult", "(Ljava/util/Map;)Lcom/avito/android/remote/model/PretendErrorValue;", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Ljava/lang/String;", "getId", "getLabel", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "getWidget", "()Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "Lkotlin/Function1;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "changesListener", "LY41/l;", "getChangesListener", "()LY41/l;", "setChangesListener", "(LY41/l;)V", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "_parameters", "Ljava/util/List;", "value", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "getParameters", "()Ljava/util/List;", "setParameters", "(Ljava/util/List;)V", "Lcom/avito/android/remote/model/category_parameters/slot/SlotType;", "getSlotType", "()Lcom/avito/android/remote/model/category_parameters/slot/SlotType;", "slotType", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class Slot<T extends SlotConfig> extends BaseSlot implements ParameterHolder, ParametersInitializer, ParameterChangesListenerHolder {
    private transient List<? extends ParameterSlot> _parameters;

    @l
    private Y41.l<? super EditableParameter<?>, G0> changesListener;

    @c("id")
    @k
    private final String id;

    @c("label")
    @k
    private final String label;

    @k
    private transient List<? extends ParameterSlot> parameters = C42784z0.f406748b;

    @c("widget")
    @k
    private final SlotWidget<T> widget;

    public Slot(@k String str, @k String str2, @k SlotWidget<T> slotWidget) {
        this.id = str;
        this.label = str2;
        this.widget = slotWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final PretendErrorValue applyPretendResult(@l Map<String, ? extends PretendErrorValue> pretendResult) {
        PretendErrorValue pretendErrorValue;
        ParameterSlot next;
        Iterator<ParameterSlot> it = getParameters().iterator();
        do {
            pretendErrorValue = null;
            if (!it.hasNext()) {
                PretendErrorValue pretendErrorValue2 = pretendResult != null ? pretendResult.get(getSlotType().getStrValue()) : null;
                if (!(this instanceof HasError) || pretendErrorValue2 == null) {
                    return null;
                }
                ((HasError) this).setErrorMessage(pretendErrorValue2.getSingleMessage());
                return pretendErrorValue2;
            }
            next = it.next();
            if ((next instanceof CategoryParameter) && pretendResult != null) {
                pretendErrorValue = pretendResult.get(next.getId());
            }
        } while (pretendErrorValue == null);
        if (next instanceof HasError) {
            ((HasError) next).setErrorMessage(pretendErrorValue.getSingleMessage());
        }
        return pretendErrorValue;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Slot slot = (Slot) other;
        return L.f(getId(), slot.getId()) && L.f(this.label, slot.label) && L.f(this.widget, slot.widget);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParameterChangesListenerHolder
    @l
    public Y41.l<EditableParameter<?>, G0> getChangesListener() {
        return this.changesListener;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
    @k
    public String getId() {
        return this.id;
    }

    @k
    public final String getLabel() {
        return this.label;
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParameterHolder
    @k
    public List<ParameterSlot> getParameters() {
        if (this._parameters == null) {
            List<ParameterSlot> listInitParameters = initParameters();
            this._parameters = listInitParameters;
            if (listInitParameters == null) {
                listInitParameters = null;
            }
            this.parameters = listInitParameters;
        }
        return this.parameters;
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.BaseSlot
    @k
    public SlotType getSlotType() {
        return this.widget.getType();
    }

    @k
    public final SlotWidget<T> getWidget() {
        return this.widget;
    }

    public int hashCode() {
        return this.widget.hashCode() + H.d(getId().hashCode() * 31, 31, this.label);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParameterChangesListenerHolder
    public void setChangesListener(@l Y41.l<? super EditableParameter<?>, G0> lVar) {
        this.changesListener = lVar;
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParameterHolder
    public void setParameters(@k List<? extends ParameterSlot> list) {
        this._parameters = list;
        this.parameters = list;
        onParametersUpdated();
    }

    @k
    public String toString() {
        return "Slot(id:" + getId() + ", type:" + getSlotType().getStrValue() + ')';
    }

    @Override // android.os.Parcelable
    @InterfaceC42153i
    public void writeToParcel(@k Parcel dest, int flags) {
        dest.writeString(getId());
        dest.writeString(this.label);
        dest.writeParcelable(this.widget, flags);
    }
}
