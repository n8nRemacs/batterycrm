package com.avito.beduin.v2.repository.client.event.bus.bundle;

import Y61.k;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.d;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.l;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.engine.utils.g;
import dU0.f;
import dV0.C39630a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ClientEventBusRepositoryBundle.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"client-event-bus_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    /* compiled from: ClientEventBusRepositoryBundle.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LdU0/f;", "invoke", "()LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<f> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ m f338172l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f338173m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z zVar, m mVar) {
            super(0);
            this.f338172l = mVar;
            this.f338173m = zVar;
        }

        @Override // Y41.a
        public final f invoke() throws BeduinPropertyException {
            m mVar = this.f338172l;
            z zVar = this.f338173m;
            l lVarT = mVar.t(zVar, "onDisconnect");
            if (lVarT == null) {
                return null;
            }
            m.f336868b.getClass();
            return lVarT.t(zVar, m.f336869c);
        }
    }

    @k
    public static final c a(@k z zVar, @k m mVar) throws BeduinPropertyException {
        try {
            d dVarC = mVar.c("event");
            A a12 = dVarC != null ? dVarC.a(zVar) : null;
            if (a12 != null) {
                return new c(new C39630a(g.b(a12, zVar, "type"), g.c(a12, zVar, "subType")), new a(zVar, mVar));
            }
            throw new IllegalArgumentException("Property event is mandatory");
        } catch (Exception e12) {
            throw new BeduinPropertyException("event", e12);
        }
    }
}
