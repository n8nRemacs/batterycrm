package com.yandex.div.evaluable;

import Y61.k;
import com.yandex.div.evaluable.function.C38060d;
import com.yandex.div.evaluable.internal.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: Evaluator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/evaluable/e;", "", "a", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f369413c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f369414a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C38060d f369415b;

    /* compiled from: Evaluator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/e$a;", "", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        
            if (r14.equals(-1L) != false) goto L21;
         */
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Number a(@Y61.k com.yandex.div.evaluable.internal.b.d.a.c r12, @Y61.k java.lang.Object r13, @Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 396
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.e.a.a(com.yandex.div.evaluable.internal.b$d$a$c, java.lang.Object, java.lang.Object):java.lang.Number");
        }

        @k
        public static Object b(@k b.d.a.f fVar, @k Object obj, @k Object obj2) {
            double dDoubleValue;
            if ((obj instanceof String) && (obj2 instanceof String)) {
                if (!(fVar instanceof b.d.a.f.C10915b)) {
                    d.a(fVar, obj, obj2);
                    throw null;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(obj2);
                return sb2.toString();
            }
            if (!(obj instanceof Long) || !(obj2 instanceof Long)) {
                if (!(obj instanceof Double) || !(obj2 instanceof Double)) {
                    d.a(fVar, obj, obj2);
                    throw null;
                }
                if (fVar instanceof b.d.a.f.C10915b) {
                    dDoubleValue = ((Number) obj2).doubleValue() + ((Number) obj).doubleValue();
                } else {
                    if (!(fVar instanceof b.d.a.f.C10914a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dDoubleValue = ((Number) obj).doubleValue() - ((Number) obj2).doubleValue();
                }
                return Double.valueOf(dDoubleValue);
            }
            if (fVar instanceof b.d.a.f.C10915b) {
                Number number = (Number) obj;
                Number number2 = (Number) obj2;
                long jLongValue = number2.longValue() + number.longValue();
                if (((number.longValue() ^ jLongValue) & (number2.longValue() ^ jLongValue)) >= 0) {
                    return Long.valueOf(jLongValue);
                }
                throw new IntegerOverflow(obj + " + " + obj2, null, 2, null);
            }
            if (!(fVar instanceof b.d.a.f.C10914a)) {
                throw new NoWhenBranchMatchedException();
            }
            Number number3 = (Number) obj;
            Number number4 = (Number) obj2;
            long jLongValue2 = number3.longValue() - number4.longValue();
            if (((number3.longValue() ^ number4.longValue()) & (number3.longValue() ^ jLongValue2)) >= 0) {
                return Long.valueOf(jLongValue2);
            }
            throw new IntegerOverflow(obj + " - " + obj2, null, 2, null);
        }

        public a() {
        }
    }

    public e(@k j jVar, @k C38060d c38060d) {
        this.f369414a = jVar;
        this.f369415b = c38060d;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean b(com.yandex.div.evaluable.internal.b.d.a.InterfaceC10901a r3, java.lang.Comparable r4, java.lang.Comparable r5) {
        /*
            boolean r0 = r3 instanceof com.yandex.div.evaluable.internal.b.d.a.InterfaceC10901a.c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            int r3 = r4.compareTo(r5)
            if (r3 >= 0) goto L2f
        Lc:
            r1 = r2
            goto L2f
        Le:
            boolean r0 = r3 instanceof com.yandex.div.evaluable.internal.b.d.a.InterfaceC10901a.C10904d
            if (r0 == 0) goto L19
            int r3 = r4.compareTo(r5)
            if (r3 > 0) goto L2f
            goto Lc
        L19:
            boolean r0 = r3 instanceof com.yandex.div.evaluable.internal.b.d.a.InterfaceC10901a.C10903b
            if (r0 == 0) goto L24
            int r3 = r4.compareTo(r5)
            if (r3 < 0) goto L2f
            goto Lc
        L24:
            boolean r3 = r3 instanceof com.yandex.div.evaluable.internal.b.d.a.InterfaceC10901a.C10902a
            if (r3 == 0) goto L34
            int r3 = r4.compareTo(r5)
            if (r3 <= 0) goto L2f
            goto Lc
        L2f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L34:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.e.b(com.yandex.div.evaluable.internal.b$d$a$a, java.lang.Comparable, java.lang.Comparable):java.lang.Boolean");
    }

    public final <T> T a(@k com.yandex.div.evaluable.a aVar) {
        try {
            return (T) aVar.a(this);
        } catch (EvaluableException e12) {
            throw e12;
        } catch (Exception e13) {
            String message = e13.getMessage();
            if (message == null) {
                message = "";
            }
            throw new EvaluableException(message, e13);
        }
    }
}
