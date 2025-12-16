package YN0;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.virtual_deal_room_client_creation.ClientCreationActivity;
import com.avito.android.virtual_deal_room_client_creation.clients.model.ClientsArguments;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoryIntentFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYN0/b;", "LYN0/a;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f19460a;

    @Inject
    public b(@k Context context) {
        this.f19460a = context;
    }

    @Override // YN0.a
    @k
    public final Intent a(@k ClientsArguments clientsArguments) {
        ClientCreationActivity.f326478m.getClass();
        Intent intent = new Intent(this.f19460a, (Class<?>) ClientCreationActivity.class);
        intent.putExtra("arguments", clientsArguments);
        return intent;
    }
}
