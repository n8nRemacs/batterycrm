package pv;

import X41.n;
import Y61.k;
import com.avito.android.deeplink_handler.view.impl.g;
import com.avito.android.deeplink_handler.view.lifecycle.e;
import com.avito.android.deeplink_handler.view.lifecycle.f;
import com.avito.android.deeplink_handler.view.lifecycle.i;
import com.avito.android.deeplink_handler.view.lifecycle.m;
import com.avito.android.deeplink_handler.view.lifecycle.o;
import com.avito.android.deeplink_handler.view.lifecycle.q;
import com.avito.android.deeplink_handler.view.lifecycle.r;
import com.avito.android.deeplink_handler.view.lifecycle.u;
import com.avito.android.deeplink_handler.view.lifecycle.v;
import com.avito.android.deeplink_handler.view.lifecycle.w;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeeplinkViewBridgeImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lpv/c;", "Ldagger/internal/h;", "Lpv/b;", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pv.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47150c implements h<C47149b> {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f428833i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final w f428834a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final q f428835b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.view.lifecycle.h f428836c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final u f428837d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.view.lifecycle.b f428838e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e f428839f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final m f428840g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final g f428841h;

    /* compiled from: DeeplinkViewBridgeImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpv/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pv.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47150c(@k w wVar, @k q qVar, @k com.avito.android.deeplink_handler.view.lifecycle.h hVar, @k u uVar, @k com.avito.android.deeplink_handler.view.lifecycle.b bVar, @k e eVar, @k m mVar, @k g gVar) {
        this.f428834a = wVar;
        this.f428835b = qVar;
        this.f428836c = hVar;
        this.f428837d = uVar;
        this.f428838e = bVar;
        this.f428839f = eVar;
        this.f428840g = mVar;
        this.f428841h = gVar;
    }

    @n
    @k
    public static final C47150c a(@k w wVar, @k q qVar, @k com.avito.android.deeplink_handler.view.lifecycle.h hVar, @k u uVar, @k com.avito.android.deeplink_handler.view.lifecycle.b bVar, @k e eVar, @k m mVar, @k g gVar) {
        f428833i.getClass();
        return new C47150c(wVar, qVar, hVar, uVar, bVar, eVar, mVar, gVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f428834a.getClass();
        v vVar = new v();
        this.f428835b.getClass();
        o oVar = new o();
        this.f428836c.getClass();
        f fVar = new f();
        this.f428837d.getClass();
        r rVar = new r();
        com.avito.android.deeplink_handler.view.lifecycle.a aVar = (com.avito.android.deeplink_handler.view.lifecycle.a) this.f428838e.get();
        this.f428839f.getClass();
        com.avito.android.deeplink_handler.view.lifecycle.d dVar = new com.avito.android.deeplink_handler.view.lifecycle.d();
        this.f428840g.getClass();
        i iVar = new i();
        com.avito.android.deeplink_handler.view.impl.f fVar2 = (com.avito.android.deeplink_handler.view.impl.f) this.f428841h.get();
        f428833i.getClass();
        return new C47149b(vVar, oVar, fVar, rVar, aVar, dVar, iVar, fVar2);
    }
}
