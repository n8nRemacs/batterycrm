package androidx.compose.foundation.selection;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Toggleable.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Boolean, G0> f30140l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f30141m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(Y41.l<? super Boolean, G0> lVar, boolean z12) {
        super(0);
        this.f30140l = lVar;
        this.f30141m = z12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f30140l.invoke(Boolean.valueOf(!this.f30141m));
        return G0.f406611a;
    }
}
