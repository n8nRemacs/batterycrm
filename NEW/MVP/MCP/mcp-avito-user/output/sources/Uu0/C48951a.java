package uU0;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.engine.utils.g;
import com.avito.beduin.v2.logger.LogLevel;
import dU0.c;
import dU0.d;
import dU0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DisposeInteractionScope.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"LuU0/a;", "LdU0/b;", "Lcom/avito/beduin/v2/handler/flow/actions/a;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uU0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48951a implements dU0.b, com.avito.beduin.v2.handler.flow.actions.a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final d f439976a;

    /* compiled from: DisposeInteractionScope.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuU0/a$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uU0.a$a, reason: collision with other inner class name */
    public static final class C12718a extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C12718a f439977b = new C12718a();

        public C12718a() {
            super("DisposeInteractionScope");
        }

        @Override // dU0.c
        public final dU0.b b(z zVar, m mVar) {
            A a12;
            String strC;
            e.f393889a.getClass();
            com.avito.beduin.v2.engine.field.d dVarC = mVar.c("interactionScope");
            d dVar = (dVarC == null || (a12 = dVarC.a(zVar)) == null || (strC = g.c(a12, zVar, "scopeId")) == null) ? null : new d(strC);
            if (dVar == null) {
                RU0.b bVar = RU0.b.f14467a;
                LogLevel[] logLevelArr = LogLevel.f337864b;
                bVar.getClass();
                if (3 >= RU0.b.f14469c) {
                    RU0.b.f14468b.e(RU0.b.f14470d + ":DisposeInteractionScope", "interactionScope is set to null!");
                }
            }
            return new C48951a(dVar);
        }
    }

    public C48951a(@l d dVar) {
        this.f439976a = dVar;
    }

    @Override // com.avito.beduin.v2.handler.flow.actions.a
    @l
    /* renamed from: b, reason: from getter */
    public final d getF439976a() {
        return this.f439976a;
    }
}
