package kotlinx.coroutines.rx3;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RxAwait.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlinx.coroutines.rx3.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43291n extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.disposables.d f412112l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43291n(io.reactivex.rxjava3.disposables.d dVar) {
        super(1);
        this.f412112l = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        this.f412112l.dispose();
        return G0.f406611a;
    }
}
