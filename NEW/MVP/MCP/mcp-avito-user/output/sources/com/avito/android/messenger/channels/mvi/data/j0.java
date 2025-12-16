package com.avito.android.messenger.channels.mvi.data;

import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.persistence.messenger.c3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: UserRepo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/persistence/messenger/c3;", "userEntities", "Larrow/core/Y0;", "Lcom/avito/android/remote/model/User;", "apply", "(Ljava/util/List;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f187234b;

    public j0(g0 g0Var) {
        this.f187234b = g0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        if (!list.isEmpty()) {
            return new C23703n1(this.f187234b.f187225b.b((c3) C42745f0.E(list)));
        }
        Y0.f56266a.getClass();
        return X0.f56264b;
    }
}
