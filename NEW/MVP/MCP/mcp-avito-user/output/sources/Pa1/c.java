package Pa1;

import Qa1.j;
import Qa1.m;
import Qa1.p;
import Y61.k;
import ab1.C19861a;
import android.app.Application;
import bb1.C25623a;
import com.vk.push.core.ipc.s;
import j.K;
import jb1.g;
import jb1.i;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import ru.rustore.sdk.core.config.a;
import ru.rustore.sdk.core.tasks.f;
import ru.rustore.sdk.core.tasks.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPa1/c;", "", "<init>", "()V", "sdk-public-push-client_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f13143a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f13144b;

    @k
    public static f a() {
        if (!f13144b) {
            throw new IllegalStateException("RuStorePushClient.init() must be called before accessing its methods.");
        }
        j jVar = j.f13811r;
        if (jVar != null) {
            return jVar.c();
        }
        r rVar = r.f436804a;
        IllegalStateException illegalStateException = new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
        rVar.getClass();
        return r.a(illegalStateException);
    }

    @X41.j
    @K
    public static void b(@k Application application, @k String str, @k Ua1.b bVar) {
        if (f13144b) {
            bVar.a("RuStorePushClient already initialized", null);
            return;
        }
        if (C43066x.K(str)) {
            throw new IllegalStateException("projectId can't be empty");
        }
        ru.rustore.sdk.core.config.a.f436771b.getClass();
        String str2 = a.C12582a.a(null).f436772a.f436770b;
        C42784z0 c42784z0 = C42784z0.f406748b;
        s.f367096a.getClass();
        p pVar = new p(application, str, bVar, c42784z0, c42784z0, null, null, new T11.a("ru.vk.store", "661F20828EF780DE0B79BC59F26A30864316355F30E4F91CFA14A20791839914"), c42784z0, str2);
        L.f(null, "prod");
        synchronized (j.f13810q) {
            try {
                j jVar = j.f13811r;
                if (jVar != null) {
                    bVar.a("Client SDK has been already initialized", null);
                } else {
                    if (jVar != null) {
                        if (jVar == null) {
                            throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
                        }
                        U.b(jVar.f13826o, null);
                        Q0.d(jVar.f13826o.f411905b);
                    }
                    j jVar2 = new j(pVar);
                    j.f13811r = jVar2;
                    i iVar = (i) jVar2.f13817f.getValue();
                    C19861a c19861a = iVar.f405692a;
                    g gVar = new g(2, iVar, i.class, "onActivityCreated", "onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V", 0);
                    c19861a.f21012a.f57214a.registerActivityLifecycleCallbacks(new C25623a(gVar));
                    jVar2.f13827p = C43259k.d(jVar2.f13826o, null, null, new m(jVar2, null), 3);
                }
            } finally {
            }
        }
        f13144b = true;
    }
}
