package com.avito.beduin.v2.interaction.delay.flow;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import dU0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DelayInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/delay/flow/b;", "Lcom/avito/beduin/v2/handler/flow/actions/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements com.avito.beduin.v2.handler.flow.actions.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f337277a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<f> f337278b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.a<f> f337279c;

    /* compiled from: DelayInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/delay/flow/b$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f337280b = new a();

        public a() {
            super("Delay");
        }

        @Override // dU0.c
        public final dU0.b b(z zVar, m mVar) throws BeduinPropertyException {
            Integer numS = mVar.s(zVar, "seconds");
            int iIntValue = numS != null ? numS.intValue() : 0;
            Integer numS2 = mVar.s(zVar, "millis");
            return new b((iIntValue * 1000) + (numS2 != null ? numS2.intValue() : 0), new com.avito.beduin.v2.interaction.delay.flow.a(zVar, mVar.t(zVar, "onFinished")), com.avito.beduin.v2.handler.flow.actions.c.a(zVar, mVar));
        }
    }

    public b(int i12, @k Y41.a<f> aVar, @l Y41.a<f> aVar2) {
        this.f337277a = i12;
        this.f337278b = aVar;
        this.f337279c = aVar2;
    }

    @Override // com.avito.beduin.v2.handler.flow.actions.b
    @l
    public final Y41.a<f> c() {
        return this.f337279c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f337277a == bVar.f337277a && L.f(this.f337278b, bVar.f337278b) && L.f(this.f337279c, bVar.f337279c);
    }

    public final int hashCode() {
        int iH2 = r.h(Integer.hashCode(this.f337277a) * 31, 31, this.f337278b);
        Y41.a<f> aVar = this.f337279c;
        return iH2 + (aVar == null ? 0 : aVar.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DelayInteraction(millis=");
        sb2.append(this.f337277a);
        sb2.append(", onFinished=");
        sb2.append(this.f337278b);
        sb2.append(", onFinalize=");
        return r.v(sb2, this.f337279c, ')');
    }
}
