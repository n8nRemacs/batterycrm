package com.avito.android.beduin.common.container.componentsPool;

import Y61.l;
import android.view.ViewGroup;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ComponentsPool.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/componentsPool/a;", "", "a", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Wh.c f102992a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f102993b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f102994c = new LinkedHashMap();

    /* compiled from: ComponentsPool.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/componentsPool/a$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.container.componentsPool.a$a, reason: collision with other inner class name */
    public static final /* data */ class C3090a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC40116e f102995a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final BeduinModel f102996b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final j f102997c;

        public C3090a(@Y61.k InterfaceC40116e interfaceC40116e, @Y61.k BeduinModel beduinModel, @Y61.k j jVar) {
            this.f102995a = interfaceC40116e;
            this.f102996b = beduinModel;
            this.f102997c = jVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3090a)) {
                return false;
            }
            C3090a c3090a = (C3090a) obj;
            return L.f(this.f102995a, c3090a.f102995a) && L.f(this.f102996b, c3090a.f102996b) && L.f(this.f102997c, c3090a.f102997c);
        }

        public final int hashCode() {
            return this.f102997c.hashCode() + ((this.f102996b.hashCode() + (this.f102995a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "CachedViewContainer(viewContainer=" + this.f102995a + ", bindedModel=" + this.f102996b + ", initialLayoutParams=" + this.f102997c + ')';
        }
    }

    /* compiled from: ComponentsPool.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/container/componentsPool/a$b;", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C3091a f102998b = new C3091a(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f102999a;

        /* compiled from: ComponentsPool.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/componentsPool/a$b$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.common.container.componentsPool.a$b$a, reason: collision with other inner class name */
        public static final class C3091a {
            public /* synthetic */ C3091a(C42822w c42822w) {
                this();
            }

            public C3091a() {
            }
        }

        public b(@Y61.k String str) {
            this.f102999a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f102999a, ((b) obj).f102999a);
        }

        public final int hashCode() {
            return this.f102999a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ViewContainerKey(key="), this.f102999a, ')');
        }
    }

    public a(@Y61.k Wh.c cVar) {
        this.f102992a = cVar;
    }

    @Y61.k
    public final ArrayList a(@Y61.k List list, @Y61.k ViewGroup viewGroup, @Y61.k Y41.l lVar) {
        InterfaceC40116e interfaceC40116eI;
        LinkedHashMap linkedHashMap = this.f102993b;
        LinkedHashMap linkedHashMap2 = this.f102994c;
        linkedHashMap.putAll(linkedHashMap2);
        linkedHashMap2.clear();
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            BeduinModel beduinModel = (BeduinModel) obj;
            j jVar = (j) lVar.invoke(Integer.valueOf(i12));
            b.f102998b.getClass();
            String f102944b = beduinModel.getF102944b();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(beduinModel.getClass().toString());
            sb2.append(f102944b != null ? "-".concat(f102944b) : "");
            b bVar = new b(sb2.toString());
            AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112aA = this.f102992a.a(beduinModel);
            Queue queue = (Queue) linkedHashMap.get(bVar);
            C3090a c3090a = queue != null ? (C3090a) queue.poll() : null;
            ViewGroup.LayoutParams layoutParamsA = jVar.a();
            if (c3090a != null) {
                boolean zEquals = c3090a.f102997c.equals(jVar);
                interfaceC40116eI = c3090a.f102995a;
                if (!zEquals) {
                    interfaceC40116eI.getF103243b().setLayoutParams(layoutParamsA);
                }
            } else {
                interfaceC40116eI = abstractC40112aA.i(viewGroup, layoutParamsA);
            }
            Queue linkedList = (Queue) linkedHashMap2.get(bVar);
            if (linkedList == null) {
                linkedList = new LinkedList();
            }
            linkedList.add(new C3090a(interfaceC40116eI, beduinModel, jVar));
            linkedHashMap2.put(bVar, linkedList);
            arrayList.add(new k(abstractC40112aA, interfaceC40116eI, !L.f(c3090a != null ? c3090a.f102996b : null, beduinModel)));
            i12 = i13;
        }
        linkedHashMap.clear();
        return arrayList;
    }
}
