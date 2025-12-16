package Wp;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.ComfortableDealActivity;
import com.avito.android.comfortable_deal.client_room.model.ClientRoomArguments;
import com.avito.android.comfortable_deal.clients.model.ClientsArguments;
import com.avito.android.comfortable_deal.contract_sign.model.ContractSignArguments;
import com.avito.android.comfortable_deal.model.ComfortableDealArguments;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ComfortableDealIntentFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWp/b;", "LWp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements InterfaceC15788a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f18065a;

    @Inject
    public b(@k Context context) {
        this.f18065a = context;
    }

    @Override // Wp.InterfaceC15788a
    @k
    public final Intent a(@k ClientsArguments clientsArguments) {
        return d(clientsArguments);
    }

    @Override // Wp.InterfaceC15788a
    @k
    public final Intent b(@k ClientRoomArguments clientRoomArguments) {
        return d(clientRoomArguments);
    }

    @Override // Wp.InterfaceC15788a
    @k
    public final Intent c(@k ContractSignArguments contractSignArguments) {
        return d(contractSignArguments);
    }

    public final Intent d(ComfortableDealArguments comfortableDealArguments) {
        ComfortableDealActivity.f119734m.getClass();
        Intent intent = new Intent(this.f18065a, (Class<?>) ComfortableDealActivity.class);
        intent.putExtra("arguments", comfortableDealArguments);
        return intent;
    }
}
