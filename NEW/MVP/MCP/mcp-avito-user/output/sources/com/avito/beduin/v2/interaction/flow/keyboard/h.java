package com.avito.beduin.v2.interaction.flow.keyboard;

import Y41.l;
import Y61.k;
import com.avito.beduin.v2.engine.component.E;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import fU0.AbstractC40338a;
import fU0.C40339b;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ShowKeyboardInteractionFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/flow/keyboard/h;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends dU0.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final h f337437b = new h();

    /* compiled from: ShowKeyboardInteractionFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "LfU0/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)LfU0/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<G, AbstractC40338a> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f337438l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final AbstractC40338a invoke(G g12) {
            C40339b.f395886a.getClass();
            AbstractC40338a abstractC40338aA = C40339b.a(g12);
            if (abstractC40338aA != null) {
                return abstractC40338aA;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public h() {
        super("ShowKeyboard");
    }

    @Override // dU0.c
    @k
    public final dU0.b b(@k z zVar, @k m mVar) throws BeduinPropertyException {
        try {
            com.avito.beduin.v2.engine.field.d dVarC = mVar.c("receiver");
            A a12 = dVarC != null ? dVarC.a(zVar) : null;
            if (a12 != null) {
                return new g((AbstractC40338a) E.b(zVar, a12.f336778b, a.f337438l));
            }
            throw new IllegalArgumentException("Property receiver is mandatory");
        } catch (Exception e12) {
            throw new BeduinPropertyException("receiver", e12);
        }
    }
}
