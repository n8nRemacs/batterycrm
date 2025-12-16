package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CompletionState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/E;", "", "Lkotlinx/atomicfu/AtomicBoolean;", "_handled", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class E {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f410692b = AtomicIntegerFieldUpdater.newUpdater(E.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Throwable f410693a;

    public E(@Y61.k Throwable th2, boolean z12) {
        this.f410693a = th2;
        this._handled$volatile = z12 ? 1 : 0;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f410693a, ']');
    }

    public /* synthetic */ E(Throwable th2, boolean z12, int i12, C42822w c42822w) {
        this(th2, (i12 & 2) != 0 ? false : z12);
    }
}
