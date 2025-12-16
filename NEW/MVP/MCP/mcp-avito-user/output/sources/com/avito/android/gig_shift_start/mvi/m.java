package com.avito.android.gig_shift_start.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.gig_shift_start.mvi.i;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigShiftStartReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_start/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/gig_shift_start/mvi/i;", "Lcom/avito/android/gig_shift_start/mvi/o;", "_avito_gig_start-shift-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements u<i, o> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final EH.a f160813b;

    @Inject
    public m(@Y61.k EH.a aVar) {
        this.f160813b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final o a(i iVar, o oVar) {
        o oVar2 = oVar;
        if (!(iVar instanceof i.a)) {
            return oVar2;
        }
        EH.a aVar = this.f160813b;
        return new o(aVar.f3909c, aVar.f3910d, oVar2.f160817d, oVar2.f160818e, true);
    }
}
