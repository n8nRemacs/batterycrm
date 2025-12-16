package NU0;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.d;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import dU0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ValueCallbackInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LNU0/b;", "LdU0/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final v f11533a;

    /* compiled from: ValueCallbackInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNU0/b$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f11534b = new a();

        public a() {
            super("ValueCallback");
        }

        @Override // dU0.c
        public final dU0.b b(z zVar, m mVar) throws BeduinPropertyException {
            try {
                d dVarC = mVar.c("value");
                v vVarQ = dVarC != null ? dVarC.q(zVar) : null;
                if (vVarQ != null) {
                    return new b(vVarQ);
                }
                throw new IllegalArgumentException("Property value is mandatory");
            } catch (Exception e12) {
                throw new BeduinPropertyException("value", e12);
            }
        }
    }

    public b(@k v vVar) {
        this.f11533a = vVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f11533a, ((b) obj).f11533a);
    }

    public final int hashCode() {
        return this.f11533a.hashCode();
    }

    @k
    public final String toString() {
        return "ValueCallbackInteraction(value=" + this.f11533a + ')';
    }
}
