package cU;

import android.content.Context;
import com.avito.beduin.v2.render.android_view.BeduinView;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinRendererModule_BeduinViewFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LcU/x;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/render/android_view/BeduinView;", "a", "_design-modules_beduin-v2_renderer_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class x implements dagger.internal.h<BeduinView> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f57893d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f57894a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.beduin.v2.render.android_view.A> f57895b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f57896c;

    /* compiled from: BeduinRendererModule_BeduinViewFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LcU/x$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public x(@Y61.k dagger.internal.l lVar, @Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f57894a = lVar;
        this.f57895b = provider;
        this.f57896c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f57894a.f393949a;
        com.avito.beduin.v2.render.android_view.A a12 = this.f57895b.get();
        com.avito.beduin.v2.theme.k kVar = (com.avito.beduin.v2.theme.k) this.f57896c.get();
        f57893d.getClass();
        w.f57892a.getClass();
        BeduinView beduinView = new BeduinView(context, null, 0, 0, 14, null);
        beduinView.f337913c = a12;
        beduinView.f337914d = kVar;
        return beduinView;
    }
}
