package com.avito.beduin.v2.interaction.network.parser.serializer;

import SU0.j;
import Y61.k;
import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.logger.LogLevel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: UrlFromEncodedSerializer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/parser/serializer/i;", "LSU0/f;", "<init>", "()V", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements SU0.f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final i f337704a = new i();

    public static List b(F.a aVar, String str, com.avito.beduin.v2.engine.field.d dVar) {
        if (dVar instanceof v) {
            return Collections.singletonList(new Q(str, ((v) dVar).getF336843b()));
        }
        boolean z12 = dVar instanceof C36268a;
        i iVar = f337704a;
        if (z12) {
            List<com.avito.beduin.v2.engine.field.d> list = ((C36268a) dVar).f336782b;
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                com.avito.beduin.v2.engine.field.d dVarC = ((com.avito.beduin.v2.engine.field.d) obj).c(aVar);
                iVar.getClass();
                C42745f0.h(b(aVar, str + '[' + i12 + ']', dVarC), arrayList);
                i12 = i13;
            }
            return arrayList;
        }
        if (dVar instanceof A) {
            Map<String, com.avito.beduin.v2.engine.field.d> map = ((A) dVar).f336778b.f336870a;
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, com.avito.beduin.v2.engine.field.d> entry : map.entrySet()) {
                String key = entry.getKey();
                com.avito.beduin.v2.engine.field.d dVarC2 = entry.getValue().c(aVar);
                iVar.getClass();
                C42745f0.h(b(aVar, str + '[' + key + ']', dVarC2), arrayList2);
            }
            return arrayList2;
        }
        if (dVar == null) {
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.b.f14468b.d(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":RequestSerializer"), "PlainTextSerializer: skip [" + str + "], value is null");
            }
        } else {
            RU0.b bVar2 = RU0.b.f14467a;
            LogLevel[] logLevelArr2 = LogLevel.f337864b;
            bVar2.getClass();
            if (3 >= RU0.b.f14469c) {
                RU0.c cVar = RU0.b.f14468b;
                String strS = AK.c.s(new StringBuilder(), RU0.b.f14470d, ":RequestSerializer");
                StringBuilder sbA = r.A("PlainTextSerializer: skip [", str, "], unsupported value ");
                sbA.append(m0.f406844a.b(dVar.getClass()).l0());
                cVar.e(strS, sbA.toString());
            }
        }
        return C42784z0.f406748b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // SU0.f
    public final j a(com.avito.beduin.v2.engine.field.d dVar) {
        F.a aVar = F.f336593b;
        com.avito.beduin.v2.engine.field.d dVarC = dVar.c(aVar);
        if (!(dVarC instanceof A)) {
            throw new IllegalArgumentException("value of UrlFormEncoded body must be a structure");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, com.avito.beduin.v2.engine.field.d> entry : ((A) dVarC).f336778b.f336870a.entrySet()) {
            String key = entry.getKey();
            com.avito.beduin.v2.engine.field.d dVarC2 = entry.getValue().c(aVar);
            f337704a.getClass();
            for (Q q12 : b(aVar, key, dVarC2)) {
                arrayList.add(new HV0.d((String) q12.f406619b, (String) q12.f406620c));
            }
        }
        return new j.c.d((HV0.d[]) arrayList.toArray(new HV0.d[0]));
    }
}
