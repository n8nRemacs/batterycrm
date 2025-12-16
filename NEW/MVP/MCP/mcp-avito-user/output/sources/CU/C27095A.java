package cU;

import bU0.C25567b;
import com.avito.android.C29270c0;
import com.avito.android.C30276e0;
import com.avito.beduin.v2.render.android_view.C36336f;
import com.avito.beduin.v2.render.android_view.H;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinRendererModule_ProvideRendererContextFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LcU/A;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/render/android_view/A;", "a", "_design-modules_beduin-v2_renderer_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cU.A, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C27095A implements dagger.internal.h<com.avito.beduin.v2.render.android_view.A> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f57863f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f57864a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<H> f57865b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f57866c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C30276e0 f57867d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<YT0.a> f57868e;

    /* compiled from: BeduinRendererModule_ProvideRendererContextFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LcU/A$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cU.A$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C27095A(@Y61.k dagger.internal.l lVar, @Y61.k Provider provider, @Y61.k dagger.internal.l lVar2, @Y61.k C30276e0 c30276e0, @Y61.k Provider provider2) {
        this.f57864a = lVar;
        this.f57865b = provider;
        this.f57866c = lVar2;
        this.f57867d = c30276e0;
        this.f57868e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.beduin.v2.engine.component.B b12 = (com.avito.beduin.v2.engine.component.B) this.f57864a.f393949a;
        H h12 = this.f57865b.get();
        aU0.b bVar = (aU0.b) this.f57866c.f393949a;
        C29270c0 c29270c0 = (C29270c0) this.f57867d.get();
        YT0.a aVar = this.f57868e.get();
        f57863f.getClass();
        w.f57892a.getClass();
        C36336f c36336f = new C36336f(null, 1, null);
        kotlin.reflect.n<Object>[] nVarArr = C29270c0.f113263t;
        kotlin.reflect.n<Object> nVar = nVarArr[4];
        boolean zBooleanValue = ((Boolean) c29270c0.f113268f.a().invoke()).booleanValue();
        kotlin.reflect.n<Object> nVar2 = nVarArr[10];
        boolean zBooleanValue2 = ((Boolean) c29270c0.f113274l.a().invoke()).booleanValue();
        kotlin.reflect.n<Object> nVar3 = nVarArr[13];
        return new com.avito.beduin.v2.render.android_view.A(h12, b12, c36336f, bVar, new C25567b(zBooleanValue, zBooleanValue2, ((Boolean) c29270c0.f113277o.a().invoke()).booleanValue()), aVar);
    }
}
