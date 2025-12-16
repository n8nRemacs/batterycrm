package com.avito.beduin.v2.interaction.status_bar.flow;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SetStatusBarContentAppearanceInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/status_bar/flow/c;", "LdU0/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final StatusBarContentAppearance f337859a;

    /* compiled from: SetStatusBarContentAppearanceInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/status_bar/flow/c$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f337860b = new a();

        public a() {
            super("SetStatusBarContentAppearance");
        }

        @Override // dU0.c
        public final dU0.b b(z zVar, m mVar) throws BeduinPropertyException {
            v vVarQ;
            try {
                com.avito.beduin.v2.engine.field.d dVarC = mVar.c("value");
                String f336843b = null;
                if (dVarC != null && (vVarQ = dVarC.q(zVar)) != null) {
                    f336843b = vVarQ.getF336843b();
                }
                if (f336843b != null) {
                    return new c(StatusBarContentAppearance.valueOf(f336843b));
                }
                throw new IllegalArgumentException("Property value is mandatory");
            } catch (Exception e12) {
                throw new BeduinPropertyException("value", e12);
            }
        }
    }

    public c(@k StatusBarContentAppearance statusBarContentAppearance) {
        this.f337859a = statusBarContentAppearance;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f337859a == ((c) obj).f337859a;
    }

    public final int hashCode() {
        return this.f337859a.hashCode();
    }

    @k
    public final String toString() {
        return "SetStatusBarContentAppearanceInteraction(value=" + this.f337859a + ')';
    }
}
