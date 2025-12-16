package kotlinx.coroutines.reactive;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Await.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlinx.coroutines.reactive.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43276c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ org.reactivestreams.e f411987l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43276c(org.reactivestreams.e eVar) {
        super(0);
        this.f411987l = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f411987l.cancel();
        return G0.f406611a;
    }
}
