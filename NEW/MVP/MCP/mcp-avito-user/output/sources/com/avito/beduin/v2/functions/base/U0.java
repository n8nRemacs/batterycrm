package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SwitchFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/U0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class U0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final U0 f337015a = new U0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337016b = "Switch";

    @Override // cU0.AbstractC27103a, cU0.InterfaceC27104b
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.h hVar, @Y61.k Map<com.avito.beduin.v2.engine.field.q, ? extends com.avito.beduin.v2.engine.core.K<? extends com.avito.beduin.v2.engine.field.d>> map) {
        Object objA;
        if (!zVar.a().f336480g) {
            if (zVar.F()) {
                InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336696a(), "@wrapToRaw", hVar);
                zVar.w(interfaceC36252bE);
                if (!interfaceC36252bE.getF336616h()) {
                    interfaceC36252bE.g();
                    try {
                        interfaceC36252bE.l(V0.a(hVar));
                    } catch (Throwable th2) {
                        interfaceC36252bE.l(null);
                        throw th2;
                    }
                }
                objA = interfaceC36252bE.getF336702c();
            } else {
                objA = V0.a(hVar);
            }
            hVar = (com.avito.beduin.v2.engine.field.h) objA;
        }
        return super.a(zVar, jVar, str, hVar, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:10:0x002c, B:12:0x0032, B:17:0x003f, B:20:0x004d, B:15:0x0039), top: B:36:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    @Override // cU0.AbstractC27103a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z r6, @Y61.k com.avito.beduin.v2.engine.field.j r7, @Y61.k com.avito.beduin.v2.engine.field.m r8) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
        /*
            r5 = this;
            java.lang.String r7 = "value"
            java.lang.String r7 = r8.w(r6, r7)
            if (r7 != 0) goto La
            java.lang.String r7 = ""
        La:
            boolean r0 = r6.F()
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r8}
            java.util.List r1 = kotlin.collections.C42745f0.U(r1)
            java.lang.String r2 = "else"
            java.util.Map<java.lang.String, com.avito.beduin.v2.engine.field.d> r3 = r8.f336870a
            java.lang.String r4 = "@result"
            if (r0 == 0) goto L5d
            com.avito.beduin.v2.engine.core.b r6 = com.avito.android.messenger.blacklist.mvi.C31685o.k(r6, r4, r1)
            boolean r0 = r6.getF336616h()
            if (r0 != 0) goto L58
            com.avito.beduin.v2.engine.core.z r0 = r6.g()
            boolean r1 = r3.containsKey(r7)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            com.avito.beduin.v2.engine.field.entity.x r7 = r8.y(r0, r7)     // Catch: java.lang.Throwable -> L37
            goto L3d
        L37:
            r7 = move-exception
            goto L53
        L39:
            com.avito.beduin.v2.engine.field.entity.x r7 = r8.y(r0, r2)     // Catch: java.lang.Throwable -> L37
        L3d:
            if (r7 == 0) goto L4d
            com.avito.beduin.v2.engine.field.m$a r8 = com.avito.beduin.v2.engine.field.m.f336868b     // Catch: java.lang.Throwable -> L37
            r8.getClass()     // Catch: java.lang.Throwable -> L37
            com.avito.beduin.v2.engine.field.m r8 = com.avito.beduin.v2.engine.field.m.f336869c     // Catch: java.lang.Throwable -> L37
            com.avito.beduin.v2.engine.field.d r7 = r7.o(r0, r8)     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L4d
            goto L4f
        L4d:
            com.avito.beduin.v2.engine.field.entity.f r7 = com.avito.beduin.v2.engine.field.entity.f.f336800b     // Catch: java.lang.Throwable -> L37
        L4f:
            r6.l(r7)
            goto L58
        L53:
            r8 = 0
            r6.l(r8)
            throw r7
        L58:
            java.lang.Object r6 = r6.getF336702c()
            goto L82
        L5d:
            com.avito.beduin.v2.engine.core.z r6 = r6.x(r4, r0)
            boolean r0 = r3.containsKey(r7)
            if (r0 == 0) goto L6c
            com.avito.beduin.v2.engine.field.entity.x r7 = r8.y(r6, r7)
            goto L70
        L6c:
            com.avito.beduin.v2.engine.field.entity.x r7 = r8.y(r6, r2)
        L70:
            if (r7 == 0) goto L80
            com.avito.beduin.v2.engine.field.m$a r8 = com.avito.beduin.v2.engine.field.m.f336868b
            r8.getClass()
            com.avito.beduin.v2.engine.field.m r8 = com.avito.beduin.v2.engine.field.m.f336869c
            com.avito.beduin.v2.engine.field.d r6 = r7.o(r6, r8)
            if (r6 == 0) goto L80
            goto L82
        L80:
            com.avito.beduin.v2.engine.field.entity.f r6 = com.avito.beduin.v2.engine.field.entity.f.f336800b
        L82:
            com.avito.beduin.v2.engine.field.d r6 = (com.avito.beduin.v2.engine.field.d) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.functions.base.U0.c(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.j, com.avito.beduin.v2.engine.field.m):com.avito.beduin.v2.engine.field.d");
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337016b;
    }
}
