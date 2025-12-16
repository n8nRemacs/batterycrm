package com.avito.beduin.v2.component.scrollable_containers.compose;

import androidx.compose.foundation.lazy.K;
import androidx.compose.foundation.lazy.Y;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.I3;
import com.avito.beduin.v2.component.scrollable_containers.compose.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyScrollableState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/scrollable_containers/compose/e;", "Lcom/avito/beduin/v2/component/scrollable_containers/compose/f;", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w0 f336272a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I3<h> f336273b = C22126m3.d(new a());

    /* compiled from: LazyScrollableState.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/scrollable_containers/compose/h;", "invoke", "()Lcom/avito/beduin/v2/component/scrollable_containers/compose/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<h> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final h invoke() {
            Y yJ2 = e.this.f336272a.j();
            List<K> listH = yJ2.h();
            ArrayList arrayList = new ArrayList(C42745f0.q(listH, 10));
            for (K k12 : listH) {
                arrayList.add(new h.a(k12.getF29645a(), k12.getF28969q()));
            }
            return new h(arrayList, yJ2.c(), yJ2.getF28948n(), null);
        }
    }

    public e(@Y61.k w0 w0Var) {
        this.f336272a = w0Var;
    }

    @Override // com.avito.beduin.v2.component.scrollable_containers.compose.f
    @Y61.l
    public final Object a(int i12, @Y61.k Continuation<? super G0> continuation) {
        w0.c cVar = w0.f29712w;
        Object objK = this.f336272a.k(i12, 0, continuation);
        return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : G0.f406611a;
    }

    @Override // com.avito.beduin.v2.component.scrollable_containers.compose.f
    public final int b() {
        return this.f336272a.i();
    }

    @Override // com.avito.beduin.v2.component.scrollable_containers.compose.f
    public final int c() {
        return this.f336272a.h();
    }

    @Override // com.avito.beduin.v2.component.scrollable_containers.compose.f
    @Y61.l
    public final Object d(int i12, int i13, @Y61.k ContinuationImpl continuationImpl) {
        Object objK = this.f336272a.k(i12, i13, continuationImpl);
        return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : G0.f406611a;
    }

    @Override // com.avito.beduin.v2.component.scrollable_containers.compose.f
    @Y61.k
    public final h e() {
        return this.f336273b.getF42167b();
    }

    @Override // com.avito.beduin.v2.component.scrollable_containers.compose.f
    @Y61.l
    public final Object f(int i12, int i13, @Y61.k ContinuationImpl continuationImpl) {
        Object objF = this.f336272a.f(i12, i13, continuationImpl);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : G0.f406611a;
    }

    @Override // com.avito.beduin.v2.component.scrollable_containers.compose.f
    @Y61.l
    public final Object g(int i12, @Y61.k Continuation<? super G0> continuation) {
        w0.c cVar = w0.f29712w;
        Object objF = this.f336272a.f(i12, 0, continuation);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : G0.f406611a;
    }
}
