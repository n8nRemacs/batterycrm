package com.avito.beduin.v2.interaction.delegate.flow;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import dU0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DelegateInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/delegate/flow/b;", "LdU0/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Y41.a<f> f337289a;

    /* compiled from: DelegateInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/delegate/flow/b$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f337290b = new a();

        public a() {
            super("Delegate");
        }

        @Override // dU0.c
        public final dU0.b b(z zVar, m mVar) throws BeduinPropertyException {
            A aX2 = mVar.x(zVar, "targetArgs");
            if (aX2 == null) {
                aX2 = new A(null, null, 3, null);
            }
            return new b(new com.avito.beduin.v2.interaction.delegate.flow.a(mVar.t(zVar, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME), zVar, aX2));
        }
    }

    public b(@k Y41.a<f> aVar) {
        this.f337289a = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f337289a, ((b) obj).f337289a);
    }

    public final int hashCode() {
        return this.f337289a.hashCode();
    }

    @k
    public final String toString() {
        return r.v(new StringBuilder("DelegateInteraction(getNext="), this.f337289a, ')');
    }
}
