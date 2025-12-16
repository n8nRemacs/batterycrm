package db1;

import android.app.Application;
import android.content.Context;
import e21.C39933c;

/* loaded from: classes9.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final jb1.f f393958a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T11.f f393959b;

    public h(@Y61.k jb1.f fVar, @Y61.k Ua1.a aVar) {
        this.f393958a = fVar;
        this.f393959b = aVar.b(h.class.getSimpleName());
    }

    @Override // db1.g
    public final boolean a() {
        jb1.f fVar = this.f393958a;
        C39933c c39933c = fVar.f405684a;
        String strA = c39933c.a("ru.rustore.sdk.pushclient.project_id");
        boolean z12 = false;
        if (strA == null) {
            fVar.f405686c.info("Auto init RuStorePushClient was skipped");
        } else {
            String strA2 = c39933c.a("ru.rustore.sdk.pushclient.params_class");
            ab1.l lVar = fVar.f405685b;
            Application application = lVar.f21046b.f57279a;
            if (strA2 != null) {
                try {
                    boolean z13 = Class.forName(strA2, false, bb1.v.class.getClassLoader()).getDeclaredConstructor(Context.class).newInstance(application) instanceof ru.rustore.sdk.pushclient.provider.a;
                } catch (Throwable th2) {
                    if (th2 instanceof NoSuchMethodException ? true : th2 instanceof SecurityException) {
                        throw new IllegalStateException(strA2.concat(" class must have a once constructor which accepts Context as the only parameter"), th2);
                    }
                    "Error while trying instantiate class ".concat(strA2);
                }
            }
            bb1.u uVar = lVar.f21045a;
            Ua1.a aVar = new Ua1.a("RuStorePushClient");
            Application application2 = uVar.f57277a;
            uVar.f57278b.getClass();
            Pa1.c.b(application2, strA, aVar);
            z12 = true;
        }
        this.f393959b.info(com.avito.android.bxcontent.mvi.entity.f.l("Auto init RuStorePushClient is successful = ", z12));
        return z12;
    }
}
