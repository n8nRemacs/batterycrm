package com.avito.beduin.v2.interaction.network.flow;

import SU0.o;
import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.entity.x;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.network.api.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: NetworkRequestInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/g;", "Lcom/avito/beduin/v2/handler/flow/actions/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class g implements com.avito.beduin.v2.handler.flow.actions.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f337619a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f337620b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Method f337621c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final HV0.d[] f337622d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SU0.n[] f337623e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final A f337624f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> f337625g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Y41.a<dU0.f> f337626h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> f337627i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SU0.e f337628j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Y41.p<Integer, com.avito.beduin.v2.engine.field.d, Boolean> f337629k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Y41.a<dU0.f> f337630l;

    /* compiled from: NetworkRequestInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/g$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f337631b = new a();

        /* compiled from: NetworkRequestInteraction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/d;", "it", "LdU0/f;", "invoke", "(Lcom/avito/beduin/v2/engine/field/d;)LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.interaction.network.flow.g$a$a, reason: collision with other inner class name */
        public static final class C10463a extends N implements Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.l f337632l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ z f337633m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10463a(z zVar, com.avito.beduin.v2.engine.field.entity.l lVar) {
                super(1);
                this.f337632l = lVar;
                this.f337633m = zVar;
            }

            @Override // Y41.l
            public final dU0.f invoke(com.avito.beduin.v2.engine.field.d dVar) {
                return this.f337632l.t(this.f337633m.getF336696a().i(), new com.avito.beduin.v2.engine.field.m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("args", dVar)}));
            }
        }

        /* compiled from: NetworkRequestInteraction.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LdU0/f;", "invoke", "()LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends N implements Y41.a<dU0.f> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.l f337634l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ z f337635m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(z zVar, com.avito.beduin.v2.engine.field.entity.l lVar) {
                super(0);
                this.f337634l = lVar;
                this.f337635m = zVar;
            }

            @Override // Y41.a
            public final dU0.f invoke() {
                com.avito.beduin.v2.engine.field.entity.l lVar = this.f337634l;
                if (lVar == null) {
                    return null;
                }
                z zVarI = this.f337635m.getF336696a().i();
                com.avito.beduin.v2.engine.field.m.f336868b.getClass();
                return lVar.t(zVarI, com.avito.beduin.v2.engine.field.m.f336869c);
            }
        }

        /* compiled from: NetworkRequestInteraction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/d;", "it", "LdU0/f;", "invoke", "(Lcom/avito/beduin/v2/engine/field/d;)LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class c extends N implements Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.l f337636l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ z f337637m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(z zVar, com.avito.beduin.v2.engine.field.entity.l lVar) {
                super(1);
                this.f337636l = lVar;
                this.f337637m = zVar;
            }

            @Override // Y41.l
            public final dU0.f invoke(com.avito.beduin.v2.engine.field.d dVar) {
                com.avito.beduin.v2.engine.field.d dVar2 = dVar;
                com.avito.beduin.v2.engine.field.entity.l lVar = this.f337636l;
                if (lVar != null) {
                    return lVar.t(this.f337637m.getF336696a().i(), new com.avito.beduin.v2.engine.field.m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("args", dVar2)}));
                }
                return null;
            }
        }

        /* compiled from: NetworkRequestInteraction.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "code", "Lcom/avito/beduin/v2/engine/field/d;", "data", "", "invoke", "(ILcom/avito/beduin/v2/engine/field/d;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class d extends N implements Y41.p<Integer, com.avito.beduin.v2.engine.field.d, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ x f337638l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ z f337639m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(x xVar, z zVar) {
                super(2);
                this.f337638l = xVar;
                this.f337639m = zVar;
            }

            @Override // Y41.p
            public final Boolean invoke(Integer num, com.avito.beduin.v2.engine.field.d dVar) {
                num.intValue();
                com.avito.beduin.v2.engine.field.m mVar = new com.avito.beduin.v2.engine.field.m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("it", dVar)});
                x xVar = this.f337638l;
                z zVar = this.f337639m;
                v vVarQ = xVar.o(zVar, mVar).q(zVar);
                Boolean boolValueOf = vVarQ != null ? Boolean.valueOf(vVarQ.getF336837b()) : null;
                if (boolValueOf != null) {
                    return boolValueOf;
                }
                throw new IllegalArgumentException("predicate must return boolean result");
            }
        }

        public a() {
            super("NetworkRequest");
        }

        @Y61.k
        public static HV0.d[] c(@Y61.k z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
            HV0.d[] dVarArrF;
            A a12;
            try {
                com.avito.beduin.v2.engine.field.d dVarC = mVar.c("headers");
                if (dVarC == null || (a12 = dVarC.a(zVar)) == null) {
                    dVarArrF = null;
                } else {
                    f337631b.getClass();
                    dVarArrF = f(zVar, a12);
                }
                return dVarArrF == null ? f(zVar, null) : dVarArrF;
            } catch (Exception e12) {
                throw new BeduinPropertyException("headers", e12);
            }
        }

        @Y61.k
        public static SU0.n[] d(@Y61.k z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
            SU0.n[] nVarArrE;
            A a12;
            try {
                com.avito.beduin.v2.engine.field.d dVarC = mVar.c("params");
                if (dVarC == null || (a12 = dVarC.a(zVar)) == null) {
                    nVarArrE = null;
                } else {
                    f337631b.getClass();
                    nVarArrE = e(zVar, a12);
                }
                return nVarArrE == null ? e(zVar, null) : nVarArrE;
            } catch (Exception e12) {
                throw new BeduinPropertyException("params", e12);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.z0] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
        public static SU0.n[] e(z zVar, A a12) {
            ?? arrayList;
            SU0.o bVar;
            if (a12 != null) {
                com.avito.beduin.v2.engine.field.m mVar = a12.f336778b;
                Map<String, com.avito.beduin.v2.engine.field.d> map = mVar.f336870a;
                arrayList = new ArrayList(map.size());
                for (Map.Entry<String, com.avito.beduin.v2.engine.field.d> entry : map.entrySet()) {
                    com.avito.beduin.v2.engine.field.d dVarC = mVar.c(entry.getKey());
                    if (dVarC instanceof C36268a) {
                        entry.getKey();
                        C36268a c36268a = (C36268a) dVarC;
                        c36268a.getClass();
                        List<com.avito.beduin.v2.engine.field.d> list = c36268a.f336782b;
                        ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            v vVarQ = ((com.avito.beduin.v2.engine.field.d) it.next()).q(zVar);
                            String f336843b = vVarQ != null ? vVarQ.getF336843b() : null;
                            if (f336843b == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList2.add(f336843b);
                        }
                        bVar = new o.a((String[]) arrayList2.toArray(new String[0]));
                    } else {
                        String key = entry.getKey();
                        v vVarQ2 = entry.getValue().q(zVar);
                        String f336843b2 = vVarQ2 != null ? vVarQ2.getF336843b() : null;
                        if (f336843b2 == null) {
                            throw new IllegalArgumentException(AK.c.k("Property ", key, " is mandatory").toString());
                        }
                        bVar = new o.b(f336843b2);
                    }
                    arrayList.add(new SU0.n(entry.getKey(), bVar));
                }
            } else {
                arrayList = C42784z0.f406748b;
            }
            return (SU0.n[]) ((Collection) arrayList).toArray(new SU0.n[0]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.z0] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
        public static HV0.d[] f(z zVar, A a12) {
            ?? arrayList;
            if (a12 != null) {
                Map<String, com.avito.beduin.v2.engine.field.d> map = a12.f336778b.f336870a;
                arrayList = new ArrayList(map.size());
                for (Map.Entry<String, com.avito.beduin.v2.engine.field.d> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String key2 = entry.getKey();
                    v vVarQ = entry.getValue().q(zVar);
                    String f336843b = vVarQ != null ? vVarQ.getF336843b() : null;
                    if (f336843b == null) {
                        throw new IllegalArgumentException(AK.c.k("Property ", key2, " is mandatory").toString());
                    }
                    arrayList.add(new HV0.d(key, f336843b));
                }
            } else {
                arrayList = C42784z0.f406748b;
            }
            return (HV0.d[]) ((Collection) arrayList).toArray(new HV0.d[0]);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
        @Override // dU0.c
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final dU0.b b(@Y61.k com.avito.beduin.v2.engine.core.z r17, @Y61.k com.avito.beduin.v2.engine.field.m r18) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
            /*
                r16 = this;
                r0 = r17
                r1 = r18
                java.lang.String r2 = "baseUrl"
                java.lang.String r4 = r1.w(r0, r2)
                java.lang.String r2 = "path"
                java.lang.String r5 = r1.w(r0, r2)
                java.lang.String r2 = "method"
                com.avito.beduin.v2.engine.field.d r3 = r1.c(r2)     // Catch: java.lang.Exception -> L23
                if (r3 == 0) goto L2e
                com.avito.beduin.v2.engine.field.entity.v r3 = r3.q(r0)     // Catch: java.lang.Exception -> L23
                if (r3 == 0) goto L26
                java.lang.String r3 = r3.getF336843b()     // Catch: java.lang.Exception -> L23
                goto L27
            L23:
                r0 = move-exception
                goto Ld9
            L26:
                r3 = 0
            L27:
                if (r3 == 0) goto L2e
                com.avito.beduin.v2.network.api.Method r2 = com.avito.beduin.v2.network.api.Method.valueOf(r3)     // Catch: java.lang.Exception -> L23
                goto L2f
            L2e:
                r2 = 0
            L2f:
                if (r2 != 0) goto L33
                com.avito.beduin.v2.network.api.Method r2 = com.avito.beduin.v2.network.api.Method.f337866b
            L33:
                com.avito.beduin.v2.interaction.network.flow.g$a r3 = com.avito.beduin.v2.interaction.network.flow.g.a.f337631b
                r3.getClass()
                HV0.d[] r7 = c(r17, r18)
                SU0.n[] r8 = d(r17, r18)
                java.lang.String r3 = "body"
                com.avito.beduin.v2.engine.field.entity.A r9 = r1.x(r0, r3)
                java.lang.String r3 = "onResult"
                com.avito.beduin.v2.engine.field.entity.l r3 = r1.i(r0, r3)
                java.lang.String r10 = "onStart"
                com.avito.beduin.v2.engine.field.entity.l r10 = r1.t(r0, r10)
                java.lang.String r11 = "onProgress"
                com.avito.beduin.v2.engine.field.entity.l r11 = r1.t(r0, r11)
                java.lang.String r12 = "metaInfo"
                com.avito.beduin.v2.engine.field.entity.A r12 = r1.x(r0, r12)
                if (r12 == 0) goto L9c
                com.avito.beduin.v2.engine.field.m r13 = r12.f336778b
                java.util.Map<java.lang.String, com.avito.beduin.v2.engine.field.d> r13 = r13.f336870a
                java.util.Set r13 = r13.entrySet()
                java.lang.Iterable r13 = (java.lang.Iterable) r13
                r14 = 10
                int r14 = kotlin.collections.C42745f0.q(r13, r14)
                int r14 = kotlin.collections.P0.f(r14)
                r15 = 16
                if (r14 >= r15) goto L79
                r14 = r15
            L79:
                java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
                r15.<init>(r14)
                java.util.Iterator r13 = r13.iterator()
            L82:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto La0
                java.lang.Object r14 = r13.next()
                java.util.Map$Entry r14 = (java.util.Map.Entry) r14
                java.lang.Object r14 = r14.getKey()
                java.lang.String r14 = (java.lang.String) r14
                java.lang.String r6 = com.avito.beduin.v2.engine.utils.g.c(r12, r0, r14)
                r15.put(r14, r6)
                goto L82
            L9c:
                java.util.Map r15 = kotlin.collections.P0.c()
            La0:
                java.lang.String r6 = "responsePredicate"
                com.avito.beduin.v2.engine.field.entity.x r6 = r1.v(r0, r6)
                if (r6 == 0) goto Laf
                com.avito.beduin.v2.interaction.network.flow.g$a$d r12 = new com.avito.beduin.v2.interaction.network.flow.g$a$d
                r12.<init>(r6, r0)
                r14 = r12
                goto Lb0
            Laf:
                r14 = 0
            Lb0:
                SU0.e$a r6 = SU0.e.f15010c
                r6.getClass()
                SU0.e r13 = SU0.e.a.a(r4, r5, r15)
                Y41.a r15 = com.avito.beduin.v2.handler.flow.actions.c.a(r17, r18)
                com.avito.beduin.v2.interaction.network.flow.g r1 = new com.avito.beduin.v2.interaction.network.flow.g
                com.avito.beduin.v2.interaction.network.flow.g$a$a r12 = new com.avito.beduin.v2.interaction.network.flow.g$a$a
                r12.<init>(r0, r3)
                com.avito.beduin.v2.interaction.network.flow.g$a$b r6 = new com.avito.beduin.v2.interaction.network.flow.g$a$b
                r6.<init>(r0, r10)
                com.avito.beduin.v2.interaction.network.flow.g$a$c r10 = new com.avito.beduin.v2.interaction.network.flow.g$a$c
                r10.<init>(r0, r11)
                r3 = r1
                r0 = r6
                r6 = r2
                r2 = r10
                r10 = r12
                r11 = r0
                r12 = r2
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return r1
            Ld9:
                com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r1 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.network.flow.g.a.b(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.m):dU0.b");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@Y61.l String str, @Y61.l String str2, @Y61.k Method method, @Y61.k HV0.d[] dVarArr, @Y61.k SU0.n[] nVarArr, @Y61.l A a12, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.k Y41.a<dU0.f> aVar, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.k SU0.e eVar, @Y61.l Y41.p<? super Integer, ? super com.avito.beduin.v2.engine.field.d, Boolean> pVar, @Y61.l Y41.a<dU0.f> aVar2) {
        this.f337619a = str;
        this.f337620b = str2;
        this.f337621c = method;
        this.f337622d = dVarArr;
        this.f337623e = nVarArr;
        this.f337624f = a12;
        this.f337625g = lVar;
        this.f337626h = aVar;
        this.f337627i = lVar2;
        this.f337628j = eVar;
        this.f337629k = pVar;
        this.f337630l = aVar2;
    }

    @Override // com.avito.beduin.v2.handler.flow.actions.b
    @Y61.l
    public final Y41.a<dU0.f> c() {
        return this.f337630l;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f337619a, gVar.f337619a) && L.f(this.f337620b, gVar.f337620b) && this.f337621c == gVar.f337621c && L.f(this.f337622d, gVar.f337622d) && L.f(this.f337623e, gVar.f337623e) && L.f(this.f337624f, gVar.f337624f) && L.f(this.f337625g, gVar.f337625g) && L.f(this.f337626h, gVar.f337626h) && L.f(this.f337627i, gVar.f337627i) && L.f(this.f337628j, gVar.f337628j) && L.f(this.f337629k, gVar.f337629k) && L.f(this.f337630l, gVar.f337630l);
    }

    public final int hashCode() {
        String str = this.f337619a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f337620b;
        int iHashCode2 = (Arrays.hashCode(this.f337623e) + ((Arrays.hashCode(this.f337622d) + ((this.f337621c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31;
        A a12 = this.f337624f;
        int iHashCode3 = (this.f337628j.hashCode() + ((this.f337627i.hashCode() + r.h((this.f337625g.hashCode() + ((iHashCode2 + (a12 == null ? 0 : a12.hashCode())) * 31)) * 31, 31, this.f337626h)) * 31)) * 31;
        Y41.p<Integer, com.avito.beduin.v2.engine.field.d, Boolean> pVar = this.f337629k;
        int iHashCode4 = (iHashCode3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        Y41.a<dU0.f> aVar = this.f337630l;
        return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkRequestInteraction(baseUrl=");
        sb2.append(this.f337619a);
        sb2.append(", path=");
        sb2.append(this.f337620b);
        sb2.append(", method=");
        sb2.append(this.f337621c);
        sb2.append(", headers=");
        sb2.append(Arrays.toString(this.f337622d));
        sb2.append(", queryParams=");
        sb2.append(Arrays.toString(this.f337623e));
        sb2.append(", body=");
        sb2.append(this.f337624f);
        sb2.append(", onResult=");
        sb2.append(this.f337625g);
        sb2.append(", onStart=");
        sb2.append(this.f337626h);
        sb2.append(", onProgress=");
        sb2.append(this.f337627i);
        sb2.append(", metaInfo=");
        sb2.append(this.f337628j);
        sb2.append(", responsePredicate=");
        sb2.append(this.f337629k);
        sb2.append(", onFinalize=");
        return r.v(sb2, this.f337630l, ')');
    }
}
