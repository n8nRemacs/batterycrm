package androidx.privacysandbox.ads.adservices.java.internal;

import Y41.l;
import androidx.concurrent.futures.b;
import java.util.concurrent.CancellationException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.InterfaceC43076a0;

/* compiled from: CoroutineAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class b extends N implements l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b.a<Object> f53548l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43076a0<Object> f53549m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b.a<Object> aVar, InterfaceC43076a0<Object> interfaceC43076a0) {
        super(1);
        this.f53548l = aVar;
        this.f53549m = interfaceC43076a0;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        Throwable th3 = th2;
        b.a<Object> aVar = this.f53548l;
        if (th3 == null) {
            aVar.b(this.f53549m.i());
        } else if (th3 instanceof CancellationException) {
            aVar.c();
        } else {
            aVar.d(th3);
        }
        return G0.f406611a;
    }
}
