package com.avito.android.gig_slot_show_qr.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.gig_slot_show_qr.mvi.a;
import com.avito.android.gig_slot_show_qr.mvi.i;
import com.avito.android.gig_slot_show_qr.mvi.o;
import com.avito.android.gig_slot_show_qr.ui.models.GigSlotShowQrOpenParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GigSlotShowQrActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/gig_slot_show_qr/mvi/a;", "Lcom/avito/android/gig_slot_show_qr/mvi/i;", "Lcom/avito/android/gig_slot_show_qr/mvi/o;", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.arch.mvi.a<a, i, o> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_slot_show_qr.domain.a f160884a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GigSlotShowQrOpenParams f160885b;

    @Inject
    public b(@Y61.k com.avito.android.gig_slot_show_qr.domain.a aVar, @Y61.k GigSlotShowQrOpenParams gigSlotShowQrOpenParams) {
        this.f160884a = aVar;
        this.f160885b = gigSlotShowQrOpenParams;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<i> b(a aVar, o oVar) {
        a aVar2 = aVar;
        o oVar2 = oVar;
        if (aVar2 instanceof a.b) {
            C43210w c43210w = new C43210w(i.c.f160906a);
            GigSlotShowQrOpenParams gigSlotShowQrOpenParams = this.f160885b;
            return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(c43210w, this.f160884a.a(Long.parseLong(gigSlotShowQrOpenParams.f160953b), gigSlotShowQrOpenParams.f160954c)));
        }
        if (aVar2 instanceof a.C4708a) {
            return oVar2 instanceof o.a ? new C43210w(new i.d(((o.a) oVar2).f160915e)) : C43175k.w();
        }
        throw new NoWhenBranchMatchedException();
    }
}
