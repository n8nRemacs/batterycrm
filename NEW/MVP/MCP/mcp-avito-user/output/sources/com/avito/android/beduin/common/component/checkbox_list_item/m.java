package com.avito.android.beduin.common.component.checkbox_list_item;

import com.avito.android.beduin.common.component.checkbox.CheckboxState;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckboxListItemPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_list_item/m;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final CheckboxState f101002a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Yh.b f101003b;

    public m(@Y61.l CheckboxState checkboxState, @Y61.l Yh.b bVar) {
        this.f101002a = checkboxState;
        this.f101003b = bVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f101002a == mVar.f101002a && L.f(this.f101003b, mVar.f101003b);
    }

    public final int hashCode() {
        CheckboxState checkboxState = this.f101002a;
        int iHashCode = (checkboxState == null ? 0 : checkboxState.hashCode()) * 31;
        Yh.b bVar = this.f101003b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "CheckboxListItemPayload(state=" + this.f101002a + ", containerPayload=" + this.f101003b + ')';
    }
}
