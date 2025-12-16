package kotlinx.coroutines.rx3;

import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: RxObservable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class F extends kotlin.jvm.internal.H implements Y41.q<I<?>, kotlinx.coroutines.selects.r<?>, Object, G0> {
    static {
        new F();
    }

    public F() {
        super(3, I.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // Y41.q
    public final G0 invoke(I<?> i12, kotlinx.coroutines.selects.r<?> rVar, Object obj) {
        I<?> i13 = i12;
        kotlinx.coroutines.selects.r<?> rVar2 = rVar;
        if (i13.f412050f.f()) {
            rVar2.d(G0.f406611a);
        } else {
            C43259k.d(i13, null, null, new H(i13, rVar2, null), 3);
        }
        return G0.f406611a;
    }
}
