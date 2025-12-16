package com.avito.android.messenger.conversation.mvi.data;

import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import arrow.core.Z0;
import com.avito.android.persistence.messenger.O1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: Observables.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\t\u0010\t\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/avito/android/util/rx3/J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class F<T1, T2, R> implements l41.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f190416b;

    public F(d0 d0Var) {
        this.f190416b = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.c
    @Y61.k
    public final R apply(@Y61.k T1 t12, @Y61.k T2 t22) {
        List list = (List) t22;
        O1 o12 = (O1) C42745f0.G((List) t12);
        Y0 y0B = Z0.b(o12 != null ? this.f190416b.f190458e.b(o12) : null);
        if (y0B instanceof X0) {
            return (R) X0.f56264b;
        }
        if (y0B instanceof C23703n1) {
            return (R) new C23703n1(new kotlin.Q((LocalMessage) ((C23703n1) y0B).f56288b, C42745f0.G(list)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
