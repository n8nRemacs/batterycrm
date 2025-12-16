package com.avito.android.installments.fakedoor.mvi;

import TN.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FakedoorReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/installments/fakedoor/mvi/h;", "Lcom/avito/android/arch/mvi/u;", "LTN/b;", "LTN/c;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements u<TN.b, TN.c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final TN.c a(TN.b bVar, TN.c cVar) {
        TN.b bVar2 = bVar;
        TN.c cVar2 = cVar;
        return bVar2 instanceof b.c ? TN.c.a(cVar2, true, false) : bVar2 instanceof b.C1069b ? TN.c.a(cVar2, false, true) : bVar2 instanceof b.a ? new TN.c(((b.a) bVar2).f15628a, false, false) : cVar2;
    }
}
