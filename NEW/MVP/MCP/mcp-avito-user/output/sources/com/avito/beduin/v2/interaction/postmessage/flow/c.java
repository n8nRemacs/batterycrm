package com.avito.beduin.v2.interaction.postmessage.flow;

import Y61.k;
import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.component.E;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.d;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.l;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import dU0.InterfaceC39628a;
import dU0.f;
import fU0.AbstractC40338a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: WebViewPostMessageInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/postmessage/flow/c;", "LdU0/a;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements InterfaceC39628a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f337714a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<f> f337715b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractC40338a f337716c;

    /* compiled from: WebViewPostMessageInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/postmessage/flow/c$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f337717b = new a();

        public a() {
            super("WebViewPostMessage");
        }

        @Override // dU0.c
        public final dU0.b b(z zVar, m mVar) throws BeduinPropertyException {
            Map<String, d> map = mVar.m(zVar, "message").f336778b.f336870a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                v vVarQ = ((d) entry.getValue()).q(zVar);
                String f336843b = vVarQ != null ? vVarQ.getF336843b() : null;
                if (f336843b == null) {
                    f336843b = "";
                }
                linkedHashMap.put(key, f336843b);
            }
            l lVarT = mVar.t(zVar, "onSuccess");
            try {
                d dVarC = mVar.c("receiver");
                A a12 = dVarC != null ? dVarC.a(zVar) : null;
                if (a12 != null) {
                    return new c(linkedHashMap, new com.avito.beduin.v2.interaction.postmessage.flow.a(zVar, lVarT), (AbstractC40338a) E.b(zVar, a12.f336778b, b.f337713l));
                }
                throw new IllegalArgumentException(("Property receiver is mandatory").toString());
            } catch (Exception e12) {
                throw new BeduinPropertyException("receiver", e12);
            }
        }
    }

    public c(@k LinkedHashMap linkedHashMap, @k Y41.a aVar, @k AbstractC40338a abstractC40338a) {
        this.f337714a = linkedHashMap;
        this.f337715b = aVar;
        this.f337716c = abstractC40338a;
    }

    @Override // dU0.InterfaceC39628a
    @k
    /* renamed from: a, reason: from getter */
    public final AbstractC40338a getF337716c() {
        return this.f337716c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f337714a.equals(cVar.f337714a) && this.f337715b.equals(cVar.f337715b) && L.f(this.f337716c, cVar.f337716c);
    }

    public final int hashCode() {
        return this.f337716c.hashCode() + r.h(this.f337714a.hashCode() * 31, 31, this.f337715b);
    }

    @k
    public final String toString() {
        return "WebViewPostMessageInteraction(message=" + this.f337714a + ", onSuccess=" + this.f337715b + ", receiver=" + this.f337716c + ')';
    }
}
