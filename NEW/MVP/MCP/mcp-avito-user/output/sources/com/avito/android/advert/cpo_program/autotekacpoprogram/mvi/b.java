package com.avito.android.advert.cpo_program.autotekacpoprogram.mvi;

import X3.a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutotekaCpoProgramActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/cpo_program/autotekacpoprogram/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LX3/a;", "LX3/b;", "LX3/d;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.arch.mvi.a<X3.a, X3.b, X3.d> {
    @Inject
    public b() {
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<X3.b> b(X3.a aVar, X3.d dVar) {
        if (aVar.equals(a.C1315a.f18569a)) {
            return C43175k.G(new a(2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
