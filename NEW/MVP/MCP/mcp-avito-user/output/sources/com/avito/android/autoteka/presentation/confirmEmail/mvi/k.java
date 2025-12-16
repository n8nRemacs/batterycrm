package com.avito.android.autoteka.presentation.confirmEmail.mvi;

import Jf.b;
import Jf.d;
import com.avito.android.arch.mvi.u;
import com.avito.android.autoteka.helpers.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaConfirmEmailReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/confirmEmail/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "LJf/b;", "LJf/d;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements u<Jf.b, Jf.d> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Jf.d a(Jf.b bVar, Jf.d dVar) {
        Jf.b bVar2 = bVar;
        Jf.d dVar2 = dVar;
        if (bVar2 instanceof b.C0535b) {
            return new Jf.d(((b.C0535b) bVar2).f9084a, false);
        }
        if (bVar2 instanceof b.f) {
            k.a aVar = dVar2.f9093a;
            d.a aVar2 = Jf.d.f9091c;
            dVar2.getClass();
            return new Jf.d(aVar, false);
        }
        if (bVar2 instanceof b.d) {
            return new Jf.d(null, true);
        }
        if (!(bVar2 instanceof b.a)) {
            return dVar2;
        }
        boolean z12 = dVar2.f9094b;
        dVar2.getClass();
        return new Jf.d(null, z12);
    }
}
