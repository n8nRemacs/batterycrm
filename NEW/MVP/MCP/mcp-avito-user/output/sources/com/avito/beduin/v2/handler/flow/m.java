package com.avito.beduin.v2.handler.flow;

import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StateInteractionHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/handler/flow/m;", "", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final n f337166a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f337167b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f337168c;

    public m(@Y61.l n nVar, boolean z12, boolean z13) {
        this.f337166a = nVar;
        this.f337167b = z12;
        this.f337168c = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f337166a, mVar.f337166a) && this.f337167b == mVar.f337167b && this.f337168c == mVar.f337168c;
    }

    public final int hashCode() {
        n nVar = this.f337166a;
        return Boolean.hashCode(this.f337168c) + r.i((nVar == null ? 0 : nVar.hashCode()) * 31, 31, this.f337167b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TargetState(engineState=");
        sb2.append(this.f337166a);
        sb2.append(", shouldAddToBackStack=");
        sb2.append(this.f337167b);
        sb2.append(", shouldClearBackStack=");
        return r.x(sb2, this.f337168c, ')');
    }
}
