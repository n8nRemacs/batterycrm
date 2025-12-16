package com.avito.android.comfortable_deal.client_room.mvi;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.comfortable_deal.client_room.model.PartnerStatus;
import fp.c;
import fp.e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: ClientRoomReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/mvi/q;", "Lcom/avito/android/arch/mvi/u;", "Lfp/e;", "Lfp/g;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q implements u<fp.e, fp.g> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f119928b;

    @Inject
    public q(@Y61.k Context context) {
        this.f119928b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final fp.g a(fp.e eVar, fp.g gVar) {
        Q q12;
        fp.e eVar2 = eVar;
        fp.g gVar2 = gVar;
        if (!(eVar2 instanceof e.a)) {
            return gVar2;
        }
        e.a aVar = (e.a) eVar2;
        fp.c cVar = aVar.f396103a;
        boolean z12 = cVar instanceof c.b;
        Context context = this.f119928b;
        if (z12) {
            q12 = new Q(context.getString(R.string.client_room_title_agent), null);
        } else if (cVar instanceof c.C11172c) {
            PartnerStatus partnerStatus = ((c.C11172c) cVar).f396094a;
            boolean z13 = partnerStatus instanceof PartnerStatus.Agency;
            q12 = (z13 && ((PartnerStatus.Agency) partnerStatus).f119874e == null) ? new Q(context.getString(R.string.client_room_title_agency), context.getString(R.string.client_room_description)) : ((partnerStatus instanceof PartnerStatus.Agent) || z13) ? new Q(context.getString(R.string.client_room_title_agent), context.getString(R.string.client_room_description)) : new Q(context.getString(R.string.client_room_title_no_agency), context.getString(R.string.client_room_description_no_agency));
        } else {
            q12 = new Q(context.getString(R.string.client_room_title_no_agency), context.getString(R.string.client_room_description_no_agency));
        }
        return new fp.g((String) q12.f406619b, (String) q12.f406620c, cVar, aVar.f396104b);
    }
}
