package androidx.compose.foundation.lazy.layout;

import androidx.collection.R0;
import androidx.collection.i1;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: LazyLayoutItemContentFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/B;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.saveable.l f29246a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<F> f29247b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0<Object, a> f29248c = i1.b();

    /* compiled from: LazyLayoutItemContentFactory.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/B$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Object f29249a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Object f29250b;

        /* renamed from: c, reason: collision with root package name */
        public int f29251c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public C22096n f29252d;

        public a(int i12, @Y61.k Object obj, @Y61.l Object obj2) {
            this.f29249a = obj;
            this.f29250b = obj2;
            this.f29251c = i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public B(@Y61.k androidx.compose.runtime.saveable.l lVar, @Y61.k Y41.a<? extends F> aVar) {
        this.f29246a = lVar;
        this.f29247b = aVar;
    }

    @Y61.k
    public final Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> a(int i12, @Y61.k Object obj, @Y61.l Object obj2) {
        C22096n c22096n;
        R0<Object, a> r02 = this.f29248c;
        a aVarE = r02.e(obj);
        if (aVarE != null && aVarE.f29251c == i12 && kotlin.jvm.internal.L.f(aVarE.f29250b, obj2)) {
            C22096n c22096n2 = aVarE.f29252d;
            if (c22096n2 != null) {
                return c22096n2;
            }
            c22096n = new C22096n(1403994769, new A(B.this, aVarE), true);
            aVarE.f29252d = c22096n;
        } else {
            a aVar = new a(i12, obj, obj2);
            r02.m(obj, aVar);
            C22096n c22096n3 = aVar.f29252d;
            if (c22096n3 != null) {
                return c22096n3;
            }
            c22096n = new C22096n(1403994769, new A(this, aVar), true);
            aVar.f29252d = c22096n;
        }
        return c22096n;
    }

    @Y61.l
    public final Object b(@Y61.l Object obj) {
        if (obj == null) {
            return null;
        }
        a aVarE = this.f29248c.e(obj);
        if (aVarE != null) {
            return aVarE.f29250b;
        }
        F f12 = (F) ((M) this.f29247b).invoke();
        int iB2 = f12.b(obj);
        if (iB2 != -1) {
            return f12.g(iB2);
        }
        return null;
    }
}
