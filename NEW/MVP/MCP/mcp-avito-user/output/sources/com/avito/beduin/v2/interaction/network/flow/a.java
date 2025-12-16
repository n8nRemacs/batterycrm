package com.avito.beduin.v2.interaction.network.flow;

import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.entity.x;
import com.avito.beduin.v2.network.api.Method;
import java.util.Arrays;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HttpRequestInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/a;", "Lcom/avito/beduin/v2/handler/flow/actions/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.beduin.v2.handler.flow.actions.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f337570a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f337571b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Method f337572c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final HV0.d[] f337573d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SU0.n[] f337574e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final A f337575f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> f337576g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Y41.a<dU0.f> f337577h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> f337578i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SU0.e f337579j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Y41.p<Integer, com.avito.beduin.v2.engine.field.d, Boolean> f337580k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Y41.a<dU0.f> f337581l;

    /* compiled from: HttpRequestInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/a$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.interaction.network.flow.a$a, reason: collision with other inner class name */
    public static final class C10458a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C10458a f337582b = new C10458a();

        /* compiled from: HttpRequestInteraction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/d;", "it", "LdU0/f;", "invoke", "(Lcom/avito/beduin/v2/engine/field/d;)LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.interaction.network.flow.a$a$a, reason: collision with other inner class name */
        public static final class C10459a extends N implements Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.l f337583l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ z f337584m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10459a(z zVar, com.avito.beduin.v2.engine.field.entity.l lVar) {
                super(1);
                this.f337583l = lVar;
                this.f337584m = zVar;
            }

            @Override // Y41.l
            public final dU0.f invoke(com.avito.beduin.v2.engine.field.d dVar) {
                return this.f337583l.t(this.f337584m.getF336594a().i(), new com.avito.beduin.v2.engine.field.m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("args", dVar)}));
            }
        }

        /* compiled from: HttpRequestInteraction.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LdU0/f;", "invoke", "()LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.interaction.network.flow.a$a$b */
        public static final class b extends N implements Y41.a<dU0.f> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.l f337585l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ z f337586m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(z zVar, com.avito.beduin.v2.engine.field.entity.l lVar) {
                super(0);
                this.f337585l = lVar;
                this.f337586m = zVar;
            }

            @Override // Y41.a
            public final dU0.f invoke() {
                com.avito.beduin.v2.engine.field.entity.l lVar = this.f337585l;
                if (lVar == null) {
                    return null;
                }
                z zVarI = this.f337586m.getF336594a().i();
                com.avito.beduin.v2.engine.field.m.f336868b.getClass();
                return lVar.t(zVarI, com.avito.beduin.v2.engine.field.m.f336869c);
            }
        }

        /* compiled from: HttpRequestInteraction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/d;", "it", "LdU0/f;", "invoke", "(Lcom/avito/beduin/v2/engine/field/d;)LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.interaction.network.flow.a$a$c */
        public static final class c extends N implements Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.l f337587l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ z f337588m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(z zVar, com.avito.beduin.v2.engine.field.entity.l lVar) {
                super(1);
                this.f337587l = lVar;
                this.f337588m = zVar;
            }

            @Override // Y41.l
            public final dU0.f invoke(com.avito.beduin.v2.engine.field.d dVar) {
                com.avito.beduin.v2.engine.field.d dVar2 = dVar;
                com.avito.beduin.v2.engine.field.entity.l lVar = this.f337587l;
                if (lVar != null) {
                    return lVar.t(this.f337588m.getF336594a().i(), new com.avito.beduin.v2.engine.field.m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("args", dVar2)}));
                }
                return null;
            }
        }

        /* compiled from: HttpRequestInteraction.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "code", "Lcom/avito/beduin/v2/engine/field/d;", "data", "", "invoke", "(ILcom/avito/beduin/v2/engine/field/d;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.interaction.network.flow.a$a$d */
        public static final class d extends N implements Y41.p<Integer, com.avito.beduin.v2.engine.field.d, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ x f337589l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ z f337590m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(x xVar, z zVar) {
                super(2);
                this.f337589l = xVar;
                this.f337590m = zVar;
            }

            @Override // Y41.p
            public final Boolean invoke(Integer num, com.avito.beduin.v2.engine.field.d dVar) {
                num.intValue();
                com.avito.beduin.v2.engine.field.m mVar = new com.avito.beduin.v2.engine.field.m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("it", dVar)});
                x xVar = this.f337589l;
                z zVar = this.f337590m;
                v vVarQ = xVar.o(zVar, mVar).q(zVar);
                Boolean boolValueOf = vVarQ != null ? Boolean.valueOf(vVarQ.getF336837b()) : null;
                if (boolValueOf != null) {
                    return boolValueOf;
                }
                throw new IllegalArgumentException("predicate must return boolean result");
            }
        }

        public C10458a() {
            super("HttpRequest");
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
                HV0.d[] r7 = com.avito.beduin.v2.interaction.network.flow.g.a.c(r17, r18)
                SU0.n[] r8 = com.avito.beduin.v2.interaction.network.flow.g.a.d(r17, r18)
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
                com.avito.beduin.v2.interaction.network.flow.a$a$d r12 = new com.avito.beduin.v2.interaction.network.flow.a$a$d
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
                com.avito.beduin.v2.interaction.network.flow.a r1 = new com.avito.beduin.v2.interaction.network.flow.a
                com.avito.beduin.v2.interaction.network.flow.a$a$a r12 = new com.avito.beduin.v2.interaction.network.flow.a$a$a
                r12.<init>(r0, r3)
                com.avito.beduin.v2.interaction.network.flow.a$a$b r6 = new com.avito.beduin.v2.interaction.network.flow.a$a$b
                r6.<init>(r0, r10)
                com.avito.beduin.v2.interaction.network.flow.a$a$c r10 = new com.avito.beduin.v2.interaction.network.flow.a$a$c
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
            throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.network.flow.a.C10458a.b(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.m):dU0.b");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@Y61.l String str, @Y61.l String str2, @Y61.k Method method, @Y61.k HV0.d[] dVarArr, @Y61.k SU0.n[] nVarArr, @Y61.l A a12, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.k Y41.a<dU0.f> aVar, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.k SU0.e eVar, @Y61.l Y41.p<? super Integer, ? super com.avito.beduin.v2.engine.field.d, Boolean> pVar, @Y61.l Y41.a<dU0.f> aVar2) {
        this.f337570a = str;
        this.f337571b = str2;
        this.f337572c = method;
        this.f337573d = dVarArr;
        this.f337574e = nVarArr;
        this.f337575f = a12;
        this.f337576g = lVar;
        this.f337577h = aVar;
        this.f337578i = lVar2;
        this.f337579j = eVar;
        this.f337580k = pVar;
        this.f337581l = aVar2;
    }

    @Override // com.avito.beduin.v2.handler.flow.actions.b
    @Y61.l
    public final Y41.a<dU0.f> c() {
        return this.f337581l;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f337570a, aVar.f337570a) && L.f(this.f337571b, aVar.f337571b) && this.f337572c == aVar.f337572c && L.f(this.f337573d, aVar.f337573d) && L.f(this.f337574e, aVar.f337574e) && L.f(this.f337575f, aVar.f337575f) && L.f(this.f337576g, aVar.f337576g) && L.f(this.f337577h, aVar.f337577h) && L.f(this.f337578i, aVar.f337578i) && L.f(this.f337579j, aVar.f337579j) && L.f(this.f337580k, aVar.f337580k) && L.f(this.f337581l, aVar.f337581l);
    }

    public final int hashCode() {
        String str = this.f337570a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f337571b;
        int iHashCode2 = (Arrays.hashCode(this.f337574e) + ((Arrays.hashCode(this.f337573d) + ((this.f337572c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31;
        A a12 = this.f337575f;
        int iHashCode3 = (this.f337579j.hashCode() + ((this.f337578i.hashCode() + r.h((this.f337576g.hashCode() + ((iHashCode2 + (a12 == null ? 0 : a12.hashCode())) * 31)) * 31, 31, this.f337577h)) * 31)) * 31;
        Y41.p<Integer, com.avito.beduin.v2.engine.field.d, Boolean> pVar = this.f337580k;
        int iHashCode4 = (iHashCode3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        Y41.a<dU0.f> aVar = this.f337581l;
        return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HttpRequestInteraction(baseUrl=");
        sb2.append(this.f337570a);
        sb2.append(", path=");
        sb2.append(this.f337571b);
        sb2.append(", method=");
        sb2.append(this.f337572c);
        sb2.append(", headers=");
        sb2.append(Arrays.toString(this.f337573d));
        sb2.append(", queryParams=");
        sb2.append(Arrays.toString(this.f337574e));
        sb2.append(", body=");
        sb2.append(this.f337575f);
        sb2.append(", onResult=");
        sb2.append(this.f337576g);
        sb2.append(", onStart=");
        sb2.append(this.f337577h);
        sb2.append(", onProgress=");
        sb2.append(this.f337578i);
        sb2.append(", metaInfo=");
        sb2.append(this.f337579j);
        sb2.append(", responsePredicate=");
        sb2.append(this.f337580k);
        sb2.append(", onFinalize=");
        return r.v(sb2, this.f337581l, ')');
    }
}
