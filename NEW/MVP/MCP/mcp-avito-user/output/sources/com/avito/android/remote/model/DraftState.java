package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.gson.d;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Draft.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J?\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\bHÖ\u0001R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/DraftState;", "", "steps", "", "Lcom/avito/android/remote/model/DraftStep;", LocalPublishState.FIELDS, "Lcom/avito/android/remote/model/DraftField;", "changedIds", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getChangedIds", "()Ljava/util/List;", "getFields", "getSteps", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DraftState {

    @c(LocalPublishState.CHANGED_IDS)
    @l
    private final List<String> changedIds;

    @c(LocalPublishState.FIELDS)
    @l
    private final List<DraftField> fields;

    @c("steps")
    @l
    private final List<DraftStep> steps;

    public DraftState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftState copy$default(DraftState draftState, List list, List list2, List list3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = draftState.steps;
        }
        if ((i12 & 2) != 0) {
            list2 = draftState.fields;
        }
        if ((i12 & 4) != 0) {
            list3 = draftState.changedIds;
        }
        return draftState.copy(list, list2, list3);
    }

    @l
    public final List<DraftStep> component1() {
        return this.steps;
    }

    @l
    public final List<DraftField> component2() {
        return this.fields;
    }

    @l
    public final List<String> component3() {
        return this.changedIds;
    }

    @k
    public final DraftState copy(@l List<DraftStep> steps, @l List<DraftField> fields, @l List<String> changedIds) {
        return new DraftState(steps, fields, changedIds);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraftState)) {
            return false;
        }
        DraftState draftState = (DraftState) other;
        return L.f(this.steps, draftState.steps) && L.f(this.fields, draftState.fields) && L.f(this.changedIds, draftState.changedIds);
    }

    @l
    public final List<String> getChangedIds() {
        return this.changedIds;
    }

    @l
    public final List<DraftField> getFields() {
        return this.fields;
    }

    @l
    public final List<DraftStep> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        List<DraftStep> list = this.steps;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<DraftField> list2 = this.fields;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.changedIds;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DraftState(steps=");
        sb2.append(this.steps);
        sb2.append(", fields=");
        sb2.append(this.fields);
        sb2.append(", changedIds=");
        return H.p(sb2, this.changedIds, ')');
    }

    public DraftState(@l List<DraftStep> list, @l List<DraftField> list2, @l List<String> list3) {
        this.steps = list;
        this.fields = list2;
        this.changedIds = list3;
    }

    public /* synthetic */ DraftState(List list, List list2, List list3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? null : list2, (i12 & 4) != 0 ? null : list3);
    }
}
