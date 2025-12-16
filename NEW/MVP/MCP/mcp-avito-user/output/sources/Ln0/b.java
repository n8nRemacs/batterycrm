package LN0;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.avito.android.virtual_deal_room.client_room.ClientRoomActivity;
import com.avito.android.virtual_deal_room.client_room.model.ClientRoomArguments;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoryIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLN0/b;", "LLN0/a;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f9943a;

    @Inject
    public b(@k Context context) {
        this.f9943a = context;
    }

    @Override // LN0.a
    @k
    public final Intent a(@k ClientRoomArguments clientRoomArguments) {
        ClientRoomActivity.f326247m.getClass();
        Intent intent = new Intent(this.f9943a, (Class<?>) ClientRoomActivity.class);
        intent.putExtra("arguments", clientRoomArguments);
        return intent;
    }
}
