package com.yandex.div.core.view2.errors;

import com.yandex.div.core.dagger.z;
import com.yandex.div2.H0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: ErrorCollectors.kt */
@z
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/errors/f;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f369071a = new LinkedHashMap();

    @Inject
    public f() {
    }

    @Y61.k
    public final d a(@Y61.l H0 h02, @Y61.k q21.c cVar) {
        d dVar;
        synchronized (this.f369071a) {
            try {
                LinkedHashMap linkedHashMap = this.f369071a;
                String str = cVar.f428995a;
                Object dVar2 = linkedHashMap.get(str);
                if (dVar2 == null) {
                    dVar2 = new d();
                    linkedHashMap.put(str, dVar2);
                }
                d dVar3 = (d) dVar2;
                ArrayList arrayList = dVar3.f369068c;
                arrayList.clear();
                Collection collection = h02 == null ? null : h02.f372516g;
                arrayList.addAll(collection == null ? C42784z0.f406748b : collection);
                dVar3.c();
                dVar = (d) dVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }
}
