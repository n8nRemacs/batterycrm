package com.avito.beduin.v2.engine.core;

import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.manager.c;
import com.avito.beduin.v2.logger.LogLevel;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: LambdaValue.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.engine.core.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36260j extends kotlin.jvm.internal.N implements Y41.a<Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C36259i<Object> f336639l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36260j(C36259i<Object> c36259i) {
        super(0);
        this.f336639l = c36259i;
    }

    @Override // Y41.a
    public final Object invoke() {
        C36259i<Object> c36259i = this.f336639l;
        com.avito.beduin.v2.engine.core.manager.e eVar = c36259i.f336636h;
        String str = c36259i.f336629a;
        boolean z12 = c36259i.f336634f;
        InterfaceC36274k interfaceC36274k = c36259i.f336630b;
        com.avito.beduin.v2.engine.core.manager.c cVar = c36259i.f336635g;
        z zVarI = z12 ? interfaceC36274k.i() : new v(interfaceC36274k, new c.a(cVar.f336658a, cVar.f336660c));
        try {
            try {
                return c36259i.f336631c.invoke(zVarI);
            } catch (Exception e12) {
                throw e12;
            }
        } finally {
            Set<N> setH = zVarI.H();
            c.a f336697b = zVarI.getF336697b();
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (RU0.b.f14469c <= 0) {
                RU0.b.f14468b.f(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":Invalidating"), "LambdaValue " + str + " calculated");
            }
            c36259i.f336633e = true;
            eVar.a(setH);
            cVar.c(f336697b);
            zVarI.close();
        }
    }
}
