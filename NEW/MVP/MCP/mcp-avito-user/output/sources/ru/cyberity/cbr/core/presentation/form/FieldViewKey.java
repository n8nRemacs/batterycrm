package ru.cyberity.cbr.core.presentation.form;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;

/* compiled from: FieldViewKey.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/FieldViewKey;", "", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "qItem", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "getQItem", "()Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class FieldViewKey {

    @k
    private final FormItem qItem;

    public boolean equals(@l Object other) {
        if (super.equals(other)) {
            return true;
        }
        if (other == null) {
            return false;
        }
        FieldViewKey fieldViewKey = other instanceof FieldViewKey ? (FieldViewKey) other : null;
        if (fieldViewKey == null) {
            return false;
        }
        return L.f(this.qItem.getSectionId(), fieldViewKey.qItem.getSectionId()) && L.f(this.qItem.getItem().getId(), fieldViewKey.qItem.getItem().getId());
    }

    public int hashCode() {
        String sectionId = this.qItem.getSectionId();
        int iHashCode = sectionId != null ? sectionId.hashCode() : 0;
        String id2 = this.qItem.getItem().getId();
        return iHashCode + (id2 != null ? id2.hashCode() : 0);
    }

    @k
    public String toString() {
        return s.a(this) + " -> " + this.qItem;
    }
}
