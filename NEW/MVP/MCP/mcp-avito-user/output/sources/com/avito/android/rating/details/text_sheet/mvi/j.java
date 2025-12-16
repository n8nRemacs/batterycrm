package com.avito.android.rating.details.text_sheet.mvi;

import Eg0.b;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TextSheetReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/details/text_sheet/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "LEg0/b;", "LEg0/d;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements u<Eg0.b, Eg0.d> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Eg0.d a(Eg0.b bVar, Eg0.d dVar) {
        Eg0.b bVar2 = bVar;
        Eg0.d dVar2 = dVar;
        if (bVar2 instanceof b.j) {
            return Eg0.d.a(dVar2, ((b.j) bVar2).f4152a, null, false, 61);
        }
        if (bVar2 instanceof b.g) {
            return Eg0.d.a(dVar2, null, ((b.g) bVar2).f4147a, false, 39);
        }
        if (bVar2.equals(b.c.f4143a)) {
            return Eg0.d.a(dVar2, null, null, false, 39);
        }
        if (bVar2.equals(b.i.f4151a)) {
            return Eg0.d.a(dVar2, null, null, true, 47);
        }
        if (bVar2.equals(b.e.f4145a)) {
            return Eg0.d.a(dVar2, null, null, false, 47);
        }
        if (bVar2 instanceof b.h ? true : bVar2.equals(b.f.f4146a) ? true : bVar2.equals(b.d.f4144a) ? true : bVar2 instanceof b.C0244b ? true : bVar2 instanceof b.a) {
            return dVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
