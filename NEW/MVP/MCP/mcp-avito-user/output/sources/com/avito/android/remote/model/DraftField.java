package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.gson.d;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Draft.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/DraftField;", "", "id", "", "tags", "", "value", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTags", "()Ljava/util/List;", "getValue", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DraftField {

    @c("id")
    @k
    private final String id;

    @c("tags")
    @l
    private final List<String> tags;

    @c("value")
    @l
    private final String value;

    public DraftField(@k String str, @l List<String> list, @l String str2) {
        this.id = str;
        this.tags = list;
        this.value = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftField copy$default(DraftField draftField, String str, List list, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = draftField.id;
        }
        if ((i12 & 2) != 0) {
            list = draftField.tags;
        }
        if ((i12 & 4) != 0) {
            str2 = draftField.value;
        }
        return draftField.copy(str, list, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    public final List<String> component2() {
        return this.tags;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @k
    public final DraftField copy(@k String id2, @l List<String> tags, @l String value) {
        return new DraftField(id2, tags, value);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraftField)) {
            return false;
        }
        DraftField draftField = (DraftField) other;
        return L.f(this.id, draftField.id) && L.f(this.tags, draftField.tags) && L.f(this.value, draftField.value);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final List<String> getTags() {
        return this.tags;
    }

    @l
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        List<String> list = this.tags;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.value;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DraftField(id=");
        sb2.append(this.id);
        sb2.append(", tags=");
        sb2.append(this.tags);
        sb2.append(", value=");
        return C22026a.c(sb2, this.value, ')');
    }

    public /* synthetic */ DraftField(String str, List list, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : list, str2);
    }
}
