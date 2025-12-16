package kb1;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f406460a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T11.f f406461b;

    public k(@Y61.k Context context, @Y61.k T11.f fVar) {
        this.f406460a = context;
        this.f406461b = fVar.b("ClientServiceStarter");
    }

    public final void a() {
        T11.f fVar = this.f406461b;
        fVar.info("Trying to start the client app service");
        ru.rustore.sdk.pushclient.messaging.service.a.f436831i.getClass();
        Intent intent = new Intent("ru.rustore.sdk.pushclient.MESSAGING_EVENT");
        Context context = this.f406460a;
        intent.setPackage(context.getPackageName());
        try {
            context.startService(intent);
        } catch (IllegalStateException e12) {
            fVar.a("Unable to start service, possible background limitations: " + e12.getMessage(), null);
        } catch (Exception e13) {
            fVar.a("Unable to start service", e13);
        }
    }
}
