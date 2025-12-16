package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.U;

/* compiled from: StaticScopeForKotlinEnum.kt */
/* loaded from: classes8.dex */
final class o extends N implements Y41.a<List<? extends U>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f409689l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar) {
        super(0);
        this.f409689l = pVar;
    }

    @Override // Y41.a
    public final List<? extends U> invoke() {
        p pVar = this.f409689l;
        return pVar.f409692c ? C42745f0.V(kotlin.reflect.jvm.internal.impl.resolve.i.e(pVar.f409691b)) : C42784z0.f406748b;
    }
}
