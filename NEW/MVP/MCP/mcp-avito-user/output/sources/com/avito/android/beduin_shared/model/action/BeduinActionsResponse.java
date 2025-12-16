package com.avito.android.beduin_shared.model.action;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinActionsResponse.kt */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/BeduinActionsResponse;", "", "actions", "", "Lcom/avito/android/beduin_models/BeduinAction;", "(Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinActionsResponse {

    @l
    private final List<BeduinAction> actions;

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinActionsResponse(@l List<? extends BeduinAction> list) {
        this.actions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinActionsResponse copy$default(BeduinActionsResponse beduinActionsResponse, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = beduinActionsResponse.actions;
        }
        return beduinActionsResponse.copy(list);
    }

    @l
    public final List<BeduinAction> component1() {
        return this.actions;
    }

    @k
    public final BeduinActionsResponse copy(@l List<? extends BeduinAction> actions) {
        return new BeduinActionsResponse(actions);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeduinActionsResponse) && L.f(this.actions, ((BeduinActionsResponse) other).actions);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    public int hashCode() {
        List<BeduinAction> list = this.actions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("BeduinActionsResponse(actions="), this.actions, ')');
    }
}
