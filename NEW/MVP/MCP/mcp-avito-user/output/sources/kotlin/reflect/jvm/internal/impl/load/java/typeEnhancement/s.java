package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.H0;
import kotlin.collections.I0;
import kotlin.collections.J0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.H;

/* compiled from: predefinedEnhancementInfo.kt */
/* loaded from: classes8.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f408393a = new LinkedHashMap();

    /* compiled from: predefinedEnhancementInfo.kt */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f408394a;

        /* compiled from: predefinedEnhancementInfo.kt */
        @s0
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.s$a$a, reason: collision with other inner class name */
        public final class C11664a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f408396a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final ArrayList f408397b = new ArrayList();

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public Q<String, v> f408398c = new Q<>("V", null);

            public C11664a(@Y61.k a aVar, String str) {
                this.f408396a = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void a(@Y61.k String str, @Y61.k h... hVarArr) {
                v vVar;
                ArrayList arrayList = this.f408397b;
                if (hVarArr.length == 0) {
                    vVar = null;
                } else {
                    I0 i0M0 = C42756l.m0(hVarArr);
                    int iF2 = P0.f(C42745f0.q(i0M0, 10));
                    if (iF2 < 16) {
                        iF2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                    Iterator it = i0M0.iterator();
                    while (true) {
                        J0 j02 = (J0) it;
                        if (!j02.f406646b.hasNext()) {
                            break;
                        }
                        H0 h02 = (H0) j02.next();
                        linkedHashMap.put(Integer.valueOf(h02.f406643a), (h) h02.f406644b);
                    }
                    vVar = new v(linkedHashMap);
                }
                arrayList.add(new Q(str, vVar));
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void b(@Y61.k String str, @Y61.k h... hVarArr) {
                I0 i0M0 = C42756l.m0(hVarArr);
                int iF2 = P0.f(C42745f0.q(i0M0, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                Iterator it = i0M0.iterator();
                while (true) {
                    J0 j02 = (J0) it;
                    if (!j02.f406646b.hasNext()) {
                        this.f408398c = new Q<>(str, new v(linkedHashMap));
                        return;
                    } else {
                        H0 h02 = (H0) j02.next();
                        linkedHashMap.put(Integer.valueOf(h02.f406643a), (h) h02.f406644b);
                    }
                }
            }
        }

        public a(@Y61.k String str) {
            this.f408394a = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(@Y61.k String str, @Y61.k Y41.l<? super C11664a, G0> lVar) {
            LinkedHashMap linkedHashMap = s.this.f408393a;
            C11664a c11664a = new C11664a(this, str);
            lVar.invoke(c11664a);
            H h12 = H.f408434a;
            ArrayList arrayList = c11664a.f408397b;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((Q) it.next()).f406619b);
            }
            String str2 = c11664a.f408398c.f406619b;
            String str3 = c11664a.f408396a;
            h12.getClass();
            String strF = H.f(this.f408394a, H.e(str3, str2, arrayList2));
            v vVar = c11664a.f408398c.f406620c;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add((v) ((Q) it2.next()).f406620c);
            }
            linkedHashMap.put(strF, new l(vVar, arrayList3));
        }
    }
}
