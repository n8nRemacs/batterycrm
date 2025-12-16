package com.avito.android.mortgage.pre_approval.result.list.items.status;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: StatusItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/status/c;", "LT00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements T00.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f202069b;

    public c(int i12) {
        this.f202069b = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return this.f202069b == cVar.f202069b;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF183828b() {
        return "STATUS_ID";
    }

    public final int hashCode() {
        return Integer.hashCode(this.f202069b) + 734381176;
    }

    @k
    public final String toString() {
        return r.t(new StringBuilder("StatusItem(stringId=STATUS_ID, imageRes="), this.f202069b, ')');
    }
}
