package com.avito.android.arch.mvi;

import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;

/* compiled from: FeatureBuffer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/arch/mvi/p;", "T", "Lcom/avito/android/arch/mvi/n;", "<init>", "()V", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p<T> implements n<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedBlockingQueue<T> f92004a = new LinkedBlockingQueue<>();

    @Override // com.avito.android.arch.mvi.n
    public final void a(@Y61.k Y41.a aVar, Object obj) throws InterruptedException {
        aVar.invoke();
        this.f92004a.put(obj);
    }

    @Override // com.avito.android.arch.mvi.n
    public final void b(@Y61.k e2 e2Var, @Y61.k T t12, @Y61.k Y41.l lVar) {
        StringBuilder sb2 = new StringBuilder("flushing pending values (size: ");
        LinkedBlockingQueue<T> linkedBlockingQueue = this.f92004a;
        sb2.append(linkedBlockingQueue.size());
        sb2.append(')');
        lVar.invoke(sb2.toString());
        if (linkedBlockingQueue.isEmpty()) {
            return;
        }
        C43259k.d(t12, null, null, new o(this, e2Var, lVar, null), 3);
    }
}
