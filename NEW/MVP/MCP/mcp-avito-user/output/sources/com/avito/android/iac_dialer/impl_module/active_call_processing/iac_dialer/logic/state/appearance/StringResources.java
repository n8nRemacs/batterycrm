package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StringResources.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/StringResources;", "LdL/d;", "", "finishedCallStatusOnRecallUnavailable", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/StringResources;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFinishedCallStatusOnRecallUnavailable", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class StringResources implements dL.d {
    public static final int $stable = 0;

    @Y61.k
    private final String finishedCallStatusOnRecallUnavailable;

    public StringResources(@Y61.k String str) {
        this.finishedCallStatusOnRecallUnavailable = str;
    }

    public static /* synthetic */ StringResources copy$default(StringResources stringResources, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = stringResources.finishedCallStatusOnRecallUnavailable;
        }
        return stringResources.copy(str);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getFinishedCallStatusOnRecallUnavailable() {
        return this.finishedCallStatusOnRecallUnavailable;
    }

    @Y61.k
    public final StringResources copy(@Y61.k String finishedCallStatusOnRecallUnavailable) {
        return new StringResources(finishedCallStatusOnRecallUnavailable);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StringResources) && L.f(this.finishedCallStatusOnRecallUnavailable, ((StringResources) other).finishedCallStatusOnRecallUnavailable);
    }

    @Y61.k
    public final String getFinishedCallStatusOnRecallUnavailable() {
        return this.finishedCallStatusOnRecallUnavailable;
    }

    public int hashCode() {
        return this.finishedCallStatusOnRecallUnavailable.hashCode();
    }

    @Y61.k
    public String toString() {
        return C22026a.c(new StringBuilder("StringResources(finishedCallStatusOnRecallUnavailable="), this.finishedCallStatusOnRecallUnavailable, ')');
    }
}
