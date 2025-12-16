package com.avito.beduin.v2.engine.core.manager;

import Y41.l;
import Y61.k;
import com.avito.beduin.v2.engine.core.M;
import com.avito.beduin.v2.engine.core.N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ReadersManager.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/core/manager/g;", "Lcom/avito/beduin/v2/engine/core/manager/a;", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements com.avito.beduin.v2.engine.core.manager.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f336669a = new LinkedHashMap();

    /* compiled from: ReadersManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/core/N$a;", "it", "", "invoke", "(Lcom/avito/beduin/v2/engine/core/N$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<N.a, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ M f336670l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(M m12) {
            super(1);
            this.f336670l = m12;
        }

        @Override // Y41.l
        public final Boolean invoke(N.a aVar) {
            N.a aVar2 = aVar;
            return Boolean.valueOf(aVar2.getF336603c() || L.f(aVar2.getF336602b(), this.f336670l));
        }
    }

    @k
    public final ArrayList a() {
        LinkedHashMap linkedHashMap = this.f336669a;
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            C42745f0.h((List) ((Map.Entry) it.next()).getValue(), arrayList);
        }
        return arrayList;
    }

    public final void b(@k M m12) {
        int iHashCode = m12.hashCode();
        LinkedHashMap linkedHashMap = this.f336669a;
        List list = (List) linkedHashMap.get(Integer.valueOf(iHashCode));
        if (list != null) {
            C42745f0.l0(new a(m12), list);
        }
        if (list == null || list.size() != 0) {
            return;
        }
        linkedHashMap.remove(Integer.valueOf(iHashCode));
    }
}
