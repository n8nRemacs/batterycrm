package com.yandex.div.evaluable;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: Function.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/g;", "", "b", "c", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final j f369934a;

    /* compiled from: Function.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/div/evaluable/g$a", "Lcom/yandex/div/evaluable/g;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends g {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f369935b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C42784z0 f369936c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final EvaluableType f369937d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f369938e;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            super(null, 1, 0 == true ? 1 : 0);
            this.f369935b = "stub";
            this.f369936c = C42784z0.f406748b;
            this.f369937d = EvaluableType.BOOLEAN;
            this.f369938e = true;
        }

        @Override // com.yandex.div.evaluable.g
        @k
        public final Object a(@k List<? extends Object> list) {
            return Boolean.TRUE;
        }

        @Override // com.yandex.div.evaluable.g
        @k
        public final List<h> b() {
            return this.f369936c;
        }

        @Override // com.yandex.div.evaluable.g
        @k
        /* renamed from: c, reason: from getter */
        public final String getF369935b() {
            return this.f369935b;
        }

        @Override // com.yandex.div.evaluable.g
        @k
        /* renamed from: d, reason: from getter */
        public final EvaluableType getF369758d() {
            return this.f369937d;
        }

        @Override // com.yandex.div.evaluable.g
        /* renamed from: f, reason: from getter */
        public final boolean getF369759e() {
            return this.f369938e;
        }
    }

    /* compiled from: Function.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/evaluable/g$b;", "", "<init>", "()V", "Lcom/yandex/div/evaluable/g;", "STUB", "Lcom/yandex/div/evaluable/g;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Function.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/div/evaluable/g$c;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/yandex/div/evaluable/g$c$b;", "Lcom/yandex/div/evaluable/g$c$c;", "Lcom/yandex/div/evaluable/g$c$d;", "Lcom/yandex/div/evaluable/g$c$a;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class c {

        /* compiled from: Function.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/g$c$a;", "Lcom/yandex/div/evaluable/g$c;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final EvaluableType f369939a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final EvaluableType f369940b;

            public a(@k EvaluableType evaluableType, @k EvaluableType evaluableType2) {
                super(null);
                this.f369939a = evaluableType;
                this.f369940b = evaluableType2;
            }
        }

        /* compiled from: Function.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/g$c$b;", "Lcom/yandex/div/evaluable/g$c;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f369941a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: Function.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/g$c$c;", "Lcom/yandex/div/evaluable/g$c;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.evaluable.g$c$c, reason: collision with other inner class name */
        public static final class C10892c extends c {

            /* renamed from: a, reason: collision with root package name */
            public final int f369942a;

            /* renamed from: b, reason: collision with root package name */
            public final int f369943b;

            public C10892c(int i12, int i13) {
                super(null);
                this.f369942a = i12;
                this.f369943b = i13;
            }
        }

        /* compiled from: Function.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/g$c$d;", "Lcom/yandex/div/evaluable/g$c;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class d extends c {

            /* renamed from: a, reason: collision with root package name */
            public final int f369944a;

            /* renamed from: b, reason: collision with root package name */
            public final int f369945b;

            public d(int i12, int i13) {
                super(null);
                this.f369944a = i12;
                this.f369945b = i13;
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: Function.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div/evaluable/h;", "arg", "", "invoke", "(Lcom/yandex/div/evaluable/h;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends N implements Y41.l<h, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f369946l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(h hVar) {
            h hVar2 = hVar;
            EvaluableType evaluableType = hVar2.f369947a;
            return hVar2.f369948b ? L.j(evaluableType, "vararg ") : evaluableType.f369375b;
        }
    }

    static {
        new b(null);
        new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @k
    public abstract Object a(@k List<? extends Object> list);

    @k
    public abstract List<h> b();

    @k
    /* renamed from: c */
    public abstract String getF369935b();

    @k
    /* renamed from: d */
    public abstract EvaluableType getF369758d();

    @k
    public final Object e(@k List<? extends Object> list) {
        EvaluableType evaluableType;
        EvaluableType evaluableType2;
        Object objA = a(list);
        EvaluableType evaluableType3 = EvaluableType.INTEGER;
        boolean z12 = objA instanceof Long;
        if (z12) {
            evaluableType = EvaluableType.INTEGER;
        } else if (objA instanceof Double) {
            evaluableType = EvaluableType.NUMBER;
        } else if (objA instanceof Boolean) {
            evaluableType = EvaluableType.BOOLEAN;
        } else if (objA instanceof String) {
            evaluableType = EvaluableType.STRING;
        } else if (objA instanceof com.yandex.div.evaluable.types.b) {
            evaluableType = EvaluableType.DATETIME;
        } else {
            if (!(objA instanceof com.yandex.div.evaluable.types.a)) {
                if (objA == null) {
                    throw new EvaluableException("Unable to find type for null", null, 2, null);
                }
                throw new EvaluableException(L.j(objA.getClass().getName(), "Unable to find type for "), null, 2, null);
            }
            evaluableType = EvaluableType.COLOR;
        }
        if (evaluableType == getF369758d()) {
            return objA;
        }
        StringBuilder sb2 = new StringBuilder("Function returned ");
        if (z12) {
            evaluableType2 = EvaluableType.INTEGER;
        } else if (objA instanceof Double) {
            evaluableType2 = EvaluableType.NUMBER;
        } else if (objA instanceof Boolean) {
            evaluableType2 = EvaluableType.BOOLEAN;
        } else if (objA instanceof String) {
            evaluableType2 = EvaluableType.STRING;
        } else if (objA instanceof com.yandex.div.evaluable.types.b) {
            evaluableType2 = EvaluableType.DATETIME;
        } else {
            if (!(objA instanceof com.yandex.div.evaluable.types.a)) {
                if (objA == null) {
                    throw new EvaluableException("Unable to find type for null", null, 2, null);
                }
                throw new EvaluableException(L.j(objA.getClass().getName(), "Unable to find type for "), null, 2, null);
            }
            evaluableType2 = EvaluableType.COLOR;
        }
        sb2.append(evaluableType2);
        sb2.append(", but  ");
        sb2.append(getF369758d());
        sb2.append(" was expected");
        throw new EvaluableException(sb2.toString(), null, 2, null);
    }

    /* renamed from: f */
    public abstract boolean getF369759e();

    @k
    public final c g(@k ArrayList arrayList) {
        int size;
        int size2;
        int i12 = 0;
        if (b().isEmpty()) {
            size2 = 0;
            size = 0;
        } else {
            boolean z12 = ((h) C42745f0.Q(b())).f369948b;
            size = b().size();
            if (z12) {
                size--;
            }
            size2 = z12 ? Integer.MAX_VALUE : b().size();
        }
        if (arrayList.size() < size) {
            return new c.C10892c(size, arrayList.size());
        }
        if (arrayList.size() > size2) {
            return new c.d(size2, arrayList.size());
        }
        int size3 = arrayList.size();
        while (i12 < size3) {
            int i13 = i12 + 1;
            List<h> listB = b();
            int iJ2 = C42745f0.J(b());
            if (i12 <= iJ2) {
                iJ2 = i12;
            }
            h hVar = listB.get(iJ2);
            Object obj = arrayList.get(i12);
            EvaluableType evaluableType = hVar.f369947a;
            if (obj != evaluableType) {
                return new c.a(evaluableType, (EvaluableType) arrayList.get(i12));
            }
            i12 = i13;
        }
        return c.b.f369941a;
    }

    @k
    public final String toString() {
        return C42745f0.O(b(), null, L.j("(", getF369935b()), ")", d.f369946l, 25);
    }

    public g(@l j jVar) {
        this.f369934a = jVar;
    }

    public /* synthetic */ g(j jVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : jVar);
    }
}
