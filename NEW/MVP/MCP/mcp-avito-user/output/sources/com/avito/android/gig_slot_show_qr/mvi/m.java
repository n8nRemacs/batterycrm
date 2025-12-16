package com.avito.android.gig_slot_show_qr.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.gig_slot_show_qr.mvi.i;
import com.avito.android.gig_slot_show_qr.mvi.o;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigSlotShowQrReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/gig_slot_show_qr/mvi/i;", "Lcom/avito/android/gig_slot_show_qr/mvi/o;", "<init>", "()V", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements u<i, o> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final o a(i iVar, o oVar) {
        i iVar2 = iVar;
        o oVar2 = oVar;
        if (iVar2 instanceof i.c) {
            return o.c.f160917a;
        }
        if (!(iVar2 instanceof i.a)) {
            return iVar2 instanceof i.b ? o.b.f160916a : oVar2;
        }
        i.a aVar = (i.a) iVar2;
        return new o.a(aVar.f160904e, aVar.f160900a, aVar.f160901b, aVar.f160903d, aVar.f160902c);
    }
}
