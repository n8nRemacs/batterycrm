package com.avito.beduin.v2.theme;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OptionalExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: OptionalExt.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lcom/avito/beduin/v2/engine/component/G;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> extends N implements Y41.l<G, T> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d<T> f338360l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<T> dVar) {
            super(1);
            this.f338360l = dVar;
        }

        @Override // Y41.l
        public final Object invoke(G g12) {
            return this.f338360l.a(g12);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: OptionalExt.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/theme/m;", "T", "Lcom/avito/beduin/v2/engine/component/G;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/theme/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> extends N implements Y41.l<G, T> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o<T> f338361l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o<T> oVar) {
            super(1);
            this.f338361l = oVar;
        }

        @Override // Y41.l
        public final Object invoke(G g12) {
            return (m) this.f338361l.a(g12);
        }
    }

    @Y61.k
    public static final <T> f<T> a(@Y61.l G g12, @Y61.k String str, @Y61.k Y41.p<? super G, ? super String, ? extends T> pVar) {
        T tInvoke = g12 != null ? pVar.invoke(g12, str) : null;
        return tInvoke != null ? new j(tInvoke) : new g();
    }

    @Y61.k
    public static final <T> f<T> b(@Y61.k G g12, @Y61.k String str, @Y61.k d<T> dVar) {
        Object objF = g12.f(new a(dVar), str, str);
        return objF != null ? new j(objF) : new g();
    }

    @Y61.k
    public static final <T extends m> l<T> c(@Y61.k G g12, @Y61.k String str, @Y61.k o<T> oVar) {
        m mVar = (m) g12.f(new b(oVar), str, str);
        return mVar != null ? new B(mVar) : new e(oVar);
    }
}
