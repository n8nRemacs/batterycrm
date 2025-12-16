package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;

/* compiled from: StaticScopeForKotlinEnum.kt */
/* loaded from: classes8.dex */
final class n extends N implements Y41.a<List<? extends a0>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f409688l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar) {
        super(0);
        this.f409688l = pVar;
    }

    @Override // Y41.a
    public final List<? extends a0> invoke() {
        p pVar = this.f409688l;
        return C42745f0.U(kotlin.reflect.jvm.internal.impl.resolve.i.f(pVar.f409691b), kotlin.reflect.jvm.internal.impl.resolve.i.g(pVar.f409691b));
    }
}
