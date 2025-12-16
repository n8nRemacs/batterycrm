package com.avito.android.publish.drafts;

import androidx.annotation.Keep;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import nj0.InterfaceC44435b;

/* compiled from: LocalPublishState.kt */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/avito/android/publish/drafts/LocalPublishState;", "", "", "Lcom/avito/android/publish/drafts/IdValuePair;", LocalPublishState.FIELDS, "", LocalPublishState.CHANGED_IDS, "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/avito/android/publish/drafts/LocalPublishState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFields", "getChangedFieldIds", "Companion", "a", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class LocalPublishState {

    @Y61.k
    public static final String CHANGED_IDS = "changedFieldIds";

    @Y61.k
    public static final String FIELDS = "fields";

    @com.google.gson.annotations.c(CHANGED_IDS)
    @Y61.l
    private final List<String> changedFieldIds;

    @com.google.gson.annotations.c(FIELDS)
    @Y61.l
    private final List<IdValuePair> fields;

    /* JADX WARN: Multi-variable type inference failed */
    public LocalPublishState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalPublishState copy$default(LocalPublishState localPublishState, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = localPublishState.fields;
        }
        if ((i12 & 2) != 0) {
            list2 = localPublishState.changedFieldIds;
        }
        return localPublishState.copy(list, list2);
    }

    @Y61.l
    public final List<IdValuePair> component1() {
        return this.fields;
    }

    @Y61.l
    public final List<String> component2() {
        return this.changedFieldIds;
    }

    @Y61.k
    public final LocalPublishState copy(@Y61.l List<IdValuePair> fields, @Y61.l List<String> changedFieldIds) {
        return new LocalPublishState(fields, changedFieldIds);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalPublishState)) {
            return false;
        }
        LocalPublishState localPublishState = (LocalPublishState) other;
        return kotlin.jvm.internal.L.f(this.fields, localPublishState.fields) && kotlin.jvm.internal.L.f(this.changedFieldIds, localPublishState.changedFieldIds);
    }

    @Y61.l
    @InterfaceC44435b(name = CHANGED_IDS)
    public final List<String> getChangedFieldIds() {
        return this.changedFieldIds;
    }

    @Y61.l
    @InterfaceC44435b(name = FIELDS)
    public final List<IdValuePair> getFields() {
        return this.fields;
    }

    public int hashCode() {
        List<IdValuePair> list = this.fields;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.changedFieldIds;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LocalPublishState(fields=");
        sb2.append(this.fields);
        sb2.append(", changedFieldIds=");
        return androidx.compose.foundation.H.p(sb2, this.changedFieldIds, ')');
    }

    public LocalPublishState(@Y61.l List<IdValuePair> list, @Y61.l List<String> list2) {
        this.fields = list;
        this.changedFieldIds = list2;
    }

    public /* synthetic */ LocalPublishState(List list, List list2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? null : list2);
    }
}
