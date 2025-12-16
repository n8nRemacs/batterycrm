package com.avito.android.user_advert.advert.faq.data;

import com.avito.android.util.C35755b0;
import com.avito.beduin.v2.engine.field.entity.A;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertFaqSurveyDeserializer.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/faq/data/k;", "Lcom/avito/android/user_advert/advert/faq/data/e;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f308904a;

    @Inject
    public k(@Y61.k r rVar) {
        this.f308904a = rVar;
    }

    public static Object c(Y41.l lVar, String str, List list) {
        Object objInvoke;
        Iterator it = list.iterator();
        do {
            objInvoke = null;
            if (!it.hasNext()) {
                break;
            }
            com.avito.beduin.v2.engine.field.d dVarC = ((A) it.next()).f336778b.c(str);
            if (dVarC != null) {
                objInvoke = lVar.invoke(dVarC);
            }
        } while (objInvoke == null);
        return objInvoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @Override // com.avito.android.user_advert.advert.faq.data.e
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.k com.avito.beduin.v2.engine.field.d r25) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.advert.faq.data.k.a(com.avito.beduin.v2.engine.field.d):java.util.ArrayList");
    }

    public final LinkedHashMap b(List list) {
        List list2 = list;
        int iF2 = P0.f(C42745f0.q(list2, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator it = list2.iterator();
        while (true) {
            Object objInvoke = null;
            if (!it.hasNext()) {
                break;
            }
            A a12 = (A) it.next();
            r rVar = this.f308904a;
            f fVar = new f(1, rVar, r.class, "string", "string(Lcom/avito/beduin/v2/engine/field/Data;)Ljava/lang/String;", 0);
            com.avito.beduin.v2.engine.field.d dVarC = a12.f336778b.c("stepIdent");
            String str = (String) (dVarC != null ? fVar.invoke(dVarC) : null);
            g gVar = new g(1, rVar, r.class, "serializable", "serializable(Lcom/avito/beduin/v2/engine/field/Data;)Ljava/lang/Object;", 0);
            com.avito.beduin.v2.engine.field.d dVarC2 = a12.f336778b.c("value");
            if (dVarC2 != null) {
                objInvoke = gVar.invoke(dVarC2);
            }
            linkedHashMap.put(str, objInvoke);
        }
        LinkedHashMap linkedHashMapC = C35755b0.c(C35755b0.b(linkedHashMap));
        if (linkedHashMapC.isEmpty()) {
            return null;
        }
        return linkedHashMapC;
    }
}
