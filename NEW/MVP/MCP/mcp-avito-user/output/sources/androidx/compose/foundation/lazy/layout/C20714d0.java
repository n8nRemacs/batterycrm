package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.W0;
import androidx.compose.foundation.lazy.layout.G0;
import androidx.compose.foundation.lazy.layout.G0.a;
import androidx.compose.runtime.F3;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyLayoutPrefetchState.kt */
@W0
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d0;", "", "a", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.layout.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20714d0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final K0 f29402a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.l<E0, kotlin.G0> f29403b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H0 f29404c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public G0 f29405d;

    /* compiled from: LazyLayoutPrefetchState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d0$a;", "Landroidx/compose/foundation/lazy/layout/E0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.d0$a */
    public final class a implements E0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f29406a = new ArrayList();

        public a() {
        }

        @Override // androidx.compose.foundation.lazy.layout.E0
        public final void a(int i12) {
            long j12 = C20716e0.f29409a;
            C20714d0 c20714d0 = C20714d0.this;
            G0 g02 = c20714d0.f29405d;
            if (g02 == null) {
                return;
            }
            this.f29406a.add(g02.new a(i12, j12, c20714d0.f29404c, null));
        }
    }

    /* compiled from: LazyLayoutPrefetchState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d0$b;", "", "Landroidx/compose/foundation/lazy/layout/e;", "Landroidx/compose/foundation/lazy/layout/G0$a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.d0$b */
    public interface b {
        void b();

        void cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20714d0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Y61.k
    public final b a(int i12, long j12) {
        G0 g02 = this.f29405d;
        if (g02 == null) {
            return C20715e.f29408a;
        }
        G0.a aVar = g02.new a(i12, j12, this.f29404c, null);
        g02.f29276c.a(aVar);
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20714d0(@Y61.l K0 k02, @Y61.l Y41.l<? super E0, kotlin.G0> lVar) {
        this.f29402a = k02;
        this.f29403b = lVar;
        this.f29404c = new H0();
    }

    public /* synthetic */ C20714d0(K0 k02, Y41.l lVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : k02, (i12 & 2) != 0 ? null : lVar);
    }
}
