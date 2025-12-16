package androidx.compose.runtime.internal;

import androidx.compose.runtime.B2;
import androidx.compose.runtime.C2;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RememberEventDispatcher.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/internal/I;", "Landroidx/compose/runtime/B2;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I implements B2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<B2> f38423b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<C2> f38424c = new androidx.compose.runtime.collection.e<>(new C2[16], 0);

    public I(@Y61.k Set<B2> set) {
        this.f38423b = set;
    }

    @Override // androidx.compose.runtime.B2
    public final void c() {
        androidx.compose.runtime.collection.e<C2> eVar = this.f38424c;
        C2[] c2Arr = eVar.f38260b;
        int i12 = eVar.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            B2 b22 = c2Arr[i13].f37941a;
            this.f38423b.remove(b22);
            b22.c();
        }
    }

    @Override // androidx.compose.runtime.B2
    public final void b() {
    }

    @Override // androidx.compose.runtime.B2
    public final void e() {
    }
}
