package sS;

import Y61.k;
import com.avito.android.C29270c0;
import com.avito.android.C30276e0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.beduin.v2.render.android_view.n;
import dagger.internal.h;
import dagger.internal.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qS.C47337b;

/* compiled from: AvitoLazyRowComponentModule_LazyRowFactory.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"LsS/b;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/render/android_view/n;", "LX41/o;", "a", "_design-modules_beduin-v2_renderer_component_lazy-row"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sS.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48104b implements h<n<?>> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f437663c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f437664a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C30276e0 f437665b;

    /* compiled from: AvitoLazyRowComponentModule_LazyRowFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsS/b$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_lazy-row"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sS.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48104b(@k l lVar, @k C30276e0 c30276e0) {
        this.f437664a = lVar;
        this.f437665b = c30276e0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f437664a.f393949a;
        C29270c0 c29270c0 = (C29270c0) this.f437665b.get();
        f437663c.getClass();
        C48103a.f437662a.getClass();
        return new C47337b(screenPerformanceTracker, c29270c0);
    }
}
