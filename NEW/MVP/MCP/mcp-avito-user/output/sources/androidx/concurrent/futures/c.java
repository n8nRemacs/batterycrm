package androidx.concurrent.futures;

import Y41.l;
import com.google.common.util.concurrent.D0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ListenableFuture.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class c extends N implements l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D0<Object> f43166l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(D0<Object> d02) {
        super(1);
        this.f43166l = d02;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        this.f43166l.cancel(false);
        return G0.f406611a;
    }
}
