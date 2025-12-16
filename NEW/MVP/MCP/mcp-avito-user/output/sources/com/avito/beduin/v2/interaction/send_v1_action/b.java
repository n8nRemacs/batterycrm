package com.avito.beduin.v2.interaction.send_v1_action;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SendV1ActionsInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/send_v1_action/b;", "LdU0/b;", "a", "b", "send-v1-action_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a[] f337828a;

    /* compiled from: SendV1ActionsInteraction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/send_v1_action/b$a;", "", "send-v1-action_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f337829a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C36268a f337830b;

        public a(@k String str, @k C36268a c36268a) {
            this.f337829a = str;
            this.f337830b = c36268a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f337829a, aVar.f337829a) && L.f(this.f337830b, aVar.f337830b);
        }

        public final int hashCode() {
            return this.f337830b.f336782b.hashCode() + (this.f337829a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Entity(formId=" + this.f337829a + ", actions=" + this.f337830b + ')';
        }
    }

    /* compiled from: SendV1ActionsInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/send_v1_action/b$b;", "LdU0/c;", "<init>", "()V", "send-v1-action_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.interaction.send_v1_action.b$b, reason: collision with other inner class name */
    public static final class C10468b extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C10468b f337831b = new C10468b();

        public C10468b() {
            super("SendV1Actions");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
        @Override // dU0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final dU0.b b(com.avito.beduin.v2.engine.core.z r11, com.avito.beduin.v2.engine.field.m r12) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
            /*
                r10 = this;
                java.lang.String r0 = "entities"
                com.avito.beduin.v2.engine.field.entity.a r12 = r12.n(r11, r0)
                r0 = 0
                r1 = 0
                if (r12 == 0) goto Lb0
                java.util.List<com.avito.beduin.v2.engine.field.d> r12 = r12.f336782b
                if (r12 == 0) goto Lb0
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r3 = kotlin.collections.C42745f0.q(r12, r3)
                r2.<init>(r3)
                java.util.Iterator r12 = r12.iterator()
                r3 = r1
            L20:
                boolean r4 = r12.hasNext()
                if (r4 == 0) goto Laf
                java.lang.Object r4 = r12.next()
                int r5 = r3 + 1
                if (r3 < 0) goto Lab
                com.avito.beduin.v2.engine.field.d r4 = (com.avito.beduin.v2.engine.field.d) r4
                java.lang.String r6 = "entities["
                r7 = 93
                java.lang.String r3 = androidx.appcompat.app.r.p(r6, r3, r7)
                com.avito.beduin.v2.engine.field.entity.A r4 = r4.a(r11)     // Catch: java.lang.Exception -> L81
                if (r4 == 0) goto L9e
                java.lang.String r6 = "formId"
                java.lang.String r6 = com.avito.beduin.v2.engine.utils.g.c(r4, r11, r6)     // Catch: java.lang.Exception -> L81
                if (r6 != 0) goto L47
                goto L9e
            L47:
                java.lang.String r7 = "actions"
                com.avito.beduin.v2.engine.field.m r4 = r4.f336778b     // Catch: java.lang.Exception -> L56
                com.avito.beduin.v2.engine.field.d r4 = r4.c(r7)     // Catch: java.lang.Exception -> L56
                if (r4 == 0) goto L58
                com.avito.beduin.v2.engine.field.entity.a r4 = r4.l(r11)     // Catch: java.lang.Exception -> L56
                goto L59
            L56:
                r11 = move-exception
                goto L98
            L58:
                r4 = r0
            L59:
                if (r4 == 0) goto L9e
                java.util.List<com.avito.beduin.v2.engine.field.d> r4 = r4.f336782b     // Catch: java.lang.Exception -> L81
                if (r4 == 0) goto L9e
                java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Exception -> L81
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Exception -> L81
                r7.<init>()     // Catch: java.lang.Exception -> L81
                java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L81
            L6a:
                boolean r8 = r4.hasNext()     // Catch: java.lang.Exception -> L81
                if (r8 == 0) goto L83
                java.lang.Object r8 = r4.next()     // Catch: java.lang.Exception -> L81
                r9 = r8
                com.avito.beduin.v2.engine.field.d r9 = (com.avito.beduin.v2.engine.field.d) r9     // Catch: java.lang.Exception -> L81
                com.avito.beduin.v2.engine.field.entity.A r9 = r9.a(r11)     // Catch: java.lang.Exception -> L81
                if (r9 == 0) goto L6a
                r7.add(r8)     // Catch: java.lang.Exception -> L81
                goto L6a
            L81:
                r11 = move-exception
                goto La5
            L83:
                boolean r4 = r7.isEmpty()     // Catch: java.lang.Exception -> L81
                if (r4 != 0) goto L8a
                goto L8b
            L8a:
                r7 = r0
            L8b:
                if (r7 == 0) goto L9e
                com.avito.beduin.v2.engine.field.entity.a r4 = new com.avito.beduin.v2.engine.field.entity.a     // Catch: java.lang.Exception -> L81
                r4.<init>(r7)     // Catch: java.lang.Exception -> L81
                com.avito.beduin.v2.interaction.send_v1_action.b$a r7 = new com.avito.beduin.v2.interaction.send_v1_action.b$a     // Catch: java.lang.Exception -> L81
                r7.<init>(r6, r4)     // Catch: java.lang.Exception -> L81
                goto L9f
            L98:
                com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r12 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException     // Catch: java.lang.Exception -> L81
                r12.<init>(r7, r11)     // Catch: java.lang.Exception -> L81
                throw r12     // Catch: java.lang.Exception -> L81
            L9e:
                r7 = r0
            L9f:
                r2.add(r7)
                r3 = r5
                goto L20
            La5:
                com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r12 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
                r12.<init>(r3, r11)
                throw r12
            Lab:
                kotlin.collections.C42745f0.H0()
                throw r0
            Laf:
                r0 = r2
            Lb0:
                if (r0 != 0) goto Lb4
                kotlin.collections.z0 r0 = kotlin.collections.C42784z0.f406748b
            Lb4:
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r11 = kotlin.collections.C42745f0.C(r0)
                com.avito.beduin.v2.interaction.send_v1_action.b$a[] r12 = new com.avito.beduin.v2.interaction.send_v1_action.b.a[r1]
                java.lang.Object[] r11 = r11.toArray(r12)
                com.avito.beduin.v2.interaction.send_v1_action.b$a[] r11 = (com.avito.beduin.v2.interaction.send_v1_action.b.a[]) r11
                com.avito.beduin.v2.interaction.send_v1_action.b r12 = new com.avito.beduin.v2.interaction.send_v1_action.b
                r12.<init>(r11)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.send_v1_action.b.C10468b.b(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.m):dU0.b");
        }
    }

    public b(@k a[] aVarArr) {
        this.f337828a = aVarArr;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f337828a, ((b) obj).f337828a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f337828a);
    }

    @k
    public final String toString() {
        return "SendV1ActionsInteraction(entities=" + Arrays.toString(this.f337828a) + ')';
    }
}
