package Bw0;

import AK0.l;
import Y61.k;
import android.content.Context;
import com.avito.android.H2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.permissions.u;
import com.avito.android.permissions.v;
import com.avito.android.remote.C34390u;
import com.avito.android.util.C;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: SilentUpdateProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBw0/f;", "", "_avito_silent-update_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface f {
    @k
    com.avito.android.silent_update.download.a a(@k R0 r02, @k C34390u c34390u, @k com.avito.android.remote.config.b bVar, @k C c12, @k com.avito.android.silent_update.download.e eVar, @k InterfaceC28373a interfaceC28373a, @k u uVar);

    @k
    com.avito.android.silent_update.download.f b(@k l lVar, @k Context context, @k R0 r02);

    @k
    com.avito.android.silent_update.b c(@k com.avito.android.service.short_task.j jVar, @k l lVar, @k Gson gson);

    @k
    com.avito.android.silent_update.permissions.d d(@k Context context);

    @Y61.l
    H2 e(@k Context context, @k v vVar, @k InterfaceC28373a interfaceC28373a);
}
