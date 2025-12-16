package com.avito.android.offlinization.beduin;

import com.avito.android.offlinization.beduin.analytics.BeduinPatternCacheErrorType;
import com.avito.android.offlinization.memory.OutOfDiskException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import o40.InterfaceC44578a;
import org.json.JSONObject;

/* compiled from: BeduinPatternCacheProviderImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/beduin/f;", "Lcom/avito/android/offlinization/beduin/e;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<o> f208546b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44578a f208547c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final i f208548d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final v40.b f208549e;

    @Inject
    public f(@Y61.k Set<o> set, @Y61.k InterfaceC44578a interfaceC44578a, @Y61.k i iVar, @Y61.k v40.b bVar) {
        this.f208546b = set;
        this.f208547c = interfaceC44578a;
        this.f208548d = iVar;
        this.f208549e = bVar;
    }

    public static boolean c(String str) {
        return C43066x.r(str, '_') && str.length() > 2 && str.length() < 64;
    }

    @Override // com.avito.android.offlinization.beduin.e
    @Y61.k
    public final List<String> a(@Y61.k String str) {
        Set<o> set = this.f208546b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            C42745f0.h(((o) it.next()).a(str), arrayList);
        }
        List listE0 = C42745f0.E0(arrayList, 30);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listE0) {
            if (c((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // com.avito.android.offlinization.beduin.e
    @Y61.k
    public final String b(@Y61.k JSONObject jSONObject, @Y61.k String str, boolean z12) {
        BeduinPatternCacheErrorType beduinPatternCacheErrorType;
        String strOptString = jSONObject.optString("cacheKey");
        Object obj = null;
        if (C43066x.K(strOptString) || !c(strOptString)) {
            InterfaceC44578a.b.a(this.f208547c, str, C43066x.K(strOptString) ? null : strOptString, false, (c(strOptString) || C43066x.K(strOptString)) ? null : BeduinPatternCacheErrorType.f208515c, 28);
            return jSONObject.toString();
        }
        Iterator<T> it = this.f208546b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((o) next).b(strOptString)) {
                obj = next;
                break;
            }
        }
        o oVar = (o) obj;
        if (oVar == null) {
            InterfaceC44578a.b.a(this.f208547c, str, strOptString, z12, BeduinPatternCacheErrorType.f208516d, 20);
            return jSONObject.toString();
        }
        String string = jSONObject.toString();
        try {
            return oVar.c(strOptString, str, jSONObject, z12);
        } catch (IOException e12) {
            if (e12.getCause() instanceof OutOfDiskException) {
                this.f208549e.b();
                this.f208548d.clear();
                beduinPatternCacheErrorType = BeduinPatternCacheErrorType.f208519g;
            } else {
                beduinPatternCacheErrorType = BeduinPatternCacheErrorType.f208520h;
            }
            InterfaceC44578a.b.a(this.f208547c, str, strOptString, z12, beduinPatternCacheErrorType, 20);
            return string;
        }
    }
}
