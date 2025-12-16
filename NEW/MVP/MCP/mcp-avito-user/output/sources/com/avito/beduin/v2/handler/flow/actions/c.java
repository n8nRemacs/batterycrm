package com.avito.beduin.v2.handler.flow.actions;

import Y61.k;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.l;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import dU0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FinalizableInteraction.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"flow_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    /* compiled from: FinalizableInteraction.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LdU0/f;", "invoke", "()LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<f> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l f337158l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f337159m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z zVar, l lVar) {
            super(0);
            this.f337158l = lVar;
            this.f337159m = zVar;
        }

        @Override // Y41.a
        public final f invoke() {
            z zVarI = this.f337159m.getF336594a().i();
            m.f336868b.getClass();
            return this.f337158l.t(zVarI, m.f336869c);
        }
    }

    @Y61.l
    public static final Y41.a a(@k z zVar, @k m mVar) throws BeduinPropertyException {
        l lVarT = mVar.t(zVar, "onFinalize");
        if (lVarT != null) {
            return new a(zVar, lVarT);
        }
        return null;
    }
}
