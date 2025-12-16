package com.yandex.div.core.expression.variables;

import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.H0;
import j.K;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: TwoWayVariableBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/expression/variables/j;", "T", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class j<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.errors.f f367509a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.expression.g f367510b;

    /* compiled from: TwoWayVariableBinder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/expression/variables/j$a;", "T", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a<T> {
        @K
        void a(@Y61.l T t12);

        void b(@Y61.k Y41.l<? super T, G0> lVar);
    }

    /* compiled from: TwoWayVariableBinder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends N implements Y41.l<T, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<T> f367511l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.h<C21.h> f367512m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ k f367513n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f367514o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ j<T> f367515p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.h<T> hVar, l0.h<C21.h> hVar2, k kVar, String str, j<T> jVar) {
            super(1);
            this.f367511l = hVar;
            this.f367512m = hVar2;
            this.f367513n = kVar;
            this.f367514o = str;
            this.f367515p = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(Object obj) {
            l0.h<T> hVar = this.f367511l;
            if (!L.f(hVar.f406842b, obj)) {
                hVar.f406842b = obj;
                l0.h<C21.h> hVar2 = this.f367512m;
                C21.h hVar3 = (T) ((C21.h) hVar2.f406842b);
                C21.h hVar4 = hVar3;
                if (hVar3 == null) {
                    T t12 = (T) this.f367513n.c(this.f367514o);
                    hVar2.f406842b = t12;
                    hVar4 = t12;
                }
                if (hVar4 != null) {
                    hVar4.d(this.f367515p.b(obj));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TwoWayVariableBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LC21/h;", "changed", "Lkotlin/G0;", "invoke", "(LC21/h;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends N implements Y41.l<C21.h, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<T> f367516l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a<T> f367517m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l0.h<T> hVar, a<T> aVar) {
            super(1);
            this.f367516l = hVar;
            this.f367517m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(C21.h hVar) {
            T t12 = (T) hVar.b();
            l0.h<T> hVar2 = this.f367516l;
            if (!L.f(hVar2.f406842b, t12)) {
                hVar2.f406842b = t12;
                this.f367517m.a(t12);
            }
            return G0.f406611a;
        }
    }

    public j(@Y61.k com.yandex.div.core.view2.errors.f fVar, @Y61.k com.yandex.div.core.expression.g gVar) {
        this.f367509a = fVar;
        this.f367510b = gVar;
    }

    @Y61.k
    public final InterfaceC37911f a(@Y61.k C38029k c38029k, @Y61.k String str, @Y61.k a<T> aVar) {
        H0 divData = c38029k.getDivData();
        if (divData == null) {
            return InterfaceC37911f.f367528l2;
        }
        l0.h hVar = new l0.h();
        q21.c dataTag = c38029k.getDataTag();
        l0.h hVar2 = new l0.h();
        k kVar = this.f367510b.a(divData, dataTag).f367461b;
        aVar.b(new b(hVar, hVar2, kVar, str, this));
        com.yandex.div.core.view2.errors.d dVarA = this.f367509a.a(divData, dataTag);
        c cVar = new c(hVar, aVar);
        kVar.e(str, dVarA, true, cVar);
        return new com.yandex.div.core.expression.c(kVar, str, cVar, 1);
    }

    @Y61.k
    public abstract String b(T t12);
}
