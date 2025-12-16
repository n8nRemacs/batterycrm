package Bw0;

import AK0.l;
import Y61.k;
import android.content.Context;
import com.avito.android.H2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.ApplicationForegroundStartupTask;
import com.avito.android.permissions.u;
import com.avito.android.permissions.v;
import com.avito.android.remote.C34390u;
import com.avito.android.silent_update.permissions.SilentUpdatePermissionsCheckTask;
import com.avito.android.util.C;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SilentUpdateProviderImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBw0/h;", "LBw0/f;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements f {
    @Override // Bw0.f
    @k
    public final com.avito.android.silent_update.download.a a(@k R0 r02, @k C34390u c34390u, @k com.avito.android.remote.config.b bVar, @k C c12, @k com.avito.android.silent_update.download.e eVar, @k InterfaceC28373a interfaceC28373a, @k u uVar) {
        return new com.avito.android.silent_update.download.a(r02, c34390u, bVar, c12, eVar, new Cw0.e(interfaceC28373a), uVar);
    }

    @Override // Bw0.f
    @k
    public final com.avito.android.silent_update.download.f b(@k l lVar, @k Context context, @k R0 r02) {
        return new com.avito.android.silent_update.download.f(context, new com.avito.android.silent_update.download.i(lVar), r02);
    }

    @Override // Bw0.f
    @k
    public final com.avito.android.silent_update.b c(@k com.avito.android.service.short_task.j jVar, @k l lVar, @k Gson gson) {
        return new com.avito.android.silent_update.b(jVar, new com.avito.android.silent_update.a(lVar, gson));
    }

    @Override // Bw0.f
    @k
    public final com.avito.android.silent_update.permissions.d d(@k Context context) {
        return new com.avito.android.silent_update.permissions.d(context);
    }

    @Override // Bw0.f
    @k
    public final H2 e(@k final Context context, @k final v vVar, @k final InterfaceC28373a interfaceC28373a) {
        return new H2(ApplicationForegroundStartupTask.class, dagger.internal.g.a(new dagger.internal.u() { // from class: Bw0.g
            @Override // javax.inject.Provider
            public final Object get() {
                return new SilentUpdatePermissionsCheckTask(new com.avito.android.silent_update.permissions.i(context, vVar), new Ew0.c(interfaceC28373a));
            }
        }));
    }
}
