package com.avito.android.similar_adverts.mvi;

import Ow0.b;
import Ow0.c;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SimilarAdvertsReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/similar_adverts/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "LOw0/b;", "LOw0/c;", "<init>", "()V", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements u<Ow0.b, Ow0.c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Ow0.c a(Ow0.b bVar, Ow0.c cVar) {
        Ow0.b bVar2 = bVar;
        if (bVar2 instanceof b.c) {
            return new c.a(((b.c) bVar2).f12728a);
        }
        if (bVar2 instanceof b.a) {
            return new c.b(((b.a) bVar2).f12726a);
        }
        if (bVar2 instanceof b.C0820b) {
            return new c.C0821c(((b.C0820b) bVar2).f12727a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
