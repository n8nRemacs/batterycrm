package com.yandex.div.json.expressions;

import X41.n;
import Y41.l;
import Y61.k;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.a;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.F;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.i;
import com.yandex.div.json.j;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: Expression.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/yandex/div/json/expressions/b;", "", "T", "<init>", "()V", "a", "b", "c", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class b<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f370552a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final ConcurrentHashMap<Object, b<?>> f370553b = new ConcurrentHashMap<>(1000);

    /* compiled from: Expression.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/json/expressions/b$a;", "", "<init>", "()V", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/yandex/div/json/expressions/b;", "pool", "Ljava/util/concurrent/ConcurrentHashMap;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static b a(@k Object obj) {
            b<?> bVarPutIfAbsent;
            ConcurrentHashMap<Object, b<?>> concurrentHashMap = b.f370553b;
            b<?> c10936b = concurrentHashMap.get(obj);
            if (c10936b == null && (bVarPutIfAbsent = concurrentHashMap.putIfAbsent(obj, (c10936b = new C10936b<>(obj)))) != null) {
                c10936b = bVarPutIfAbsent;
            }
            return c10936b;
        }

        public a() {
        }
    }

    /* compiled from: Expression.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/json/expressions/b$b;", "", "T", "Lcom/yandex/div/json/expressions/b;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.json.expressions.b$b, reason: collision with other inner class name */
    public static final class C10936b<T> extends b<T> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final T f370554c;

        public C10936b(@k T t12) {
            this.f370554c = t12;
        }

        @Override // com.yandex.div.json.expressions.b
        @k
        public final T a(@k e eVar) {
            return this.f370554c;
        }

        @Override // com.yandex.div.json.expressions.b
        @k
        /* renamed from: b, reason: from getter */
        public final Object getF370554c() {
            return this.f370554c;
        }

        @Override // com.yandex.div.json.expressions.b
        @k
        public final InterfaceC37911f d(@k e eVar, @k l<? super T, G0> lVar) {
            return InterfaceC37911f.f367528l2;
        }

        @Override // com.yandex.div.json.expressions.b
        @k
        public final InterfaceC37911f e(@k e eVar, @k l<? super T, G0> lVar) {
            lVar.invoke(this.f370554c);
            return InterfaceC37911f.f367528l2;
        }
    }

    /* compiled from: Expression.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/json/expressions/b$c;", "R", "", "T", "Lcom/yandex/div/json/expressions/b;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c<R, T> extends b<T> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f370555c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f370556d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final l<R, T> f370557e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final F<T> f370558f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final i f370559g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final D<T> f370560h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final b<T> f370561i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final String f370562j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public a.d f370563k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public T f370564l;

        /* compiled from: Expression.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ l<T, G0> f370565l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ c<R, T> f370566m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ e f370567n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(l<? super T, G0> lVar, c<R, T> cVar, e eVar) {
                super(0);
                this.f370565l = lVar;
                this.f370566m = cVar;
                this.f370567n = eVar;
            }

            @Override // Y41.a
            public final G0 invoke() {
                this.f370565l.invoke(this.f370566m.a(this.f370567n));
                return G0.f406611a;
            }
        }

        public /* synthetic */ c(String str, String str2, l lVar, F f12, i iVar, D d12, b bVar, int i12, C42822w c42822w) {
            this(str, str2, lVar, f12, iVar, d12, (i12 & 64) != 0 ? null : bVar);
        }

        @Override // com.yandex.div.json.expressions.b
        @k
        public final T a(@k e eVar) {
            T tA2;
            try {
                T tG2 = g(eVar);
                this.f370564l = tG2;
                return tG2;
            } catch (ParsingException e12) {
                i iVar = this.f370559g;
                iVar.a(e12);
                eVar.c(e12);
                T t12 = this.f370564l;
                if (t12 != null) {
                    return t12;
                }
                try {
                    b<T> bVar = this.f370561i;
                    if (bVar != null && (tA2 = bVar.a(eVar)) != null) {
                        this.f370564l = tA2;
                        return tA2;
                    }
                    return this.f370560h.getF370137b();
                } catch (ParsingException e13) {
                    iVar.a(e13);
                    eVar.c(e13);
                    throw e13;
                }
            }
        }

        @Override // com.yandex.div.json.expressions.b
        /* renamed from: b */
        public final Object getF370554c() {
            return this.f370562j;
        }

        @Override // com.yandex.div.json.expressions.b
        @k
        public final InterfaceC37911f d(@k e eVar, @k l<? super T, G0> lVar) {
            String str = this.f370556d;
            try {
                List<String> listB = f().b();
                return listB.isEmpty() ? InterfaceC37911f.f367528l2 : eVar.a(str, listB, new a(lVar, this, eVar));
            } catch (Exception e12) {
                ParsingException parsingExceptionI = j.i(this.f370555c, str, e12);
                this.f370559g.a(parsingExceptionI);
                eVar.c(parsingExceptionI);
                return InterfaceC37911f.f367528l2;
            }
        }

        public final com.yandex.div.evaluable.a f() {
            String str = this.f370556d;
            a.d dVar = this.f370563k;
            if (dVar != null) {
                return dVar;
            }
            try {
                com.yandex.div.evaluable.a.f369377c.getClass();
                a.d dVar2 = new a.d(str);
                this.f370563k = dVar2;
                return dVar2;
            } catch (EvaluableException e12) {
                throw j.i(this.f370555c, str, e12);
            }
        }

        public final T g(e eVar) {
            T t12 = (T) eVar.b(this.f370555c, this.f370556d, f(), this.f370557e, this.f370558f, this.f370560h, this.f370559g);
            String str = this.f370556d;
            String str2 = this.f370555c;
            if (t12 == null) {
                throw j.i(str2, str, null);
            }
            if (this.f370560h.b(t12)) {
                return t12;
            }
            throw j.k(str2, str, t12, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(@k String str, @k String str2, @Y61.l l<? super R, ? extends T> lVar, @k F<T> f12, @k i iVar, @k D<T> d12, @Y61.l b<T> bVar) {
            this.f370555c = str;
            this.f370556d = str2;
            this.f370557e = lVar;
            this.f370558f = f12;
            this.f370559g = iVar;
            this.f370560h = d12;
            this.f370561i = bVar;
            this.f370562j = str2;
        }
    }

    @n
    public static final boolean c(@Y61.l Object obj) {
        f370552a.getClass();
        return (obj instanceof String) && C43066x.q((CharSequence) obj, "@{", false);
    }

    @k
    public abstract T a(@k e eVar);

    @k
    /* renamed from: b */
    public abstract Object getF370554c();

    @k
    public abstract InterfaceC37911f d(@k e eVar, @k l<? super T, G0> lVar);

    @k
    public InterfaceC37911f e(@k e eVar, @k l<? super T, G0> lVar) {
        T tA2;
        try {
            tA2 = a(eVar);
        } catch (ParsingException unused) {
            tA2 = null;
        }
        if (tA2 != null) {
            lVar.invoke(tA2);
        }
        return d(eVar, lVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof b) {
            return L.f(getF370554c(), ((b) obj).getF370554c());
        }
        return false;
    }

    public final int hashCode() {
        return getF370554c().hashCode() * 16;
    }
}
