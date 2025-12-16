package com.avito.android.leakcanary.release;

import android.app.Application;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import leakcanary.B;
import leakcanary.C43755m;
import leakcanary.C43756n;
import leakcanary.C43758p;
import leakcanary.K;
import leakcanary.v;
import leakcanary.w;
import leakcanary.x;

/* compiled from: ReleaseLeakCanaryInitializer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/leakcanary/release/f;", "", "_common_leakcanary-release_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f175080a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f175081b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final k f175082c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f175083d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f175084e;

    /* compiled from: ReleaseLeakCanaryInitializer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/Application;", "it", "Lleakcanary/n;", "invoke", "(Landroid/app/Application;)Lleakcanary/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Application, C43756n> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Application f175085l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            super(1);
            this.f175085l = application;
        }

        @Override // Y41.l
        public final C43756n invoke(Application application) {
            e eVar = new e(this.f175085l);
            C43758p c43758p = new C43758p(null, null, null, false, null, true, null, 95, null);
            C43756n.f414105d.getClass();
            C43755m c43755m = new C43755m();
            Application application2 = this.f175085l;
            return new C43756n(eVar, c43758p, C42745f0.U(c43755m, new v(application2, 0L, null, 6, null), new x(application2, 0L, null, 6, null), new w(0L, null, 3, null), new B(application2, 0L, 2, null), new K(application2.getResources())));
        }
    }

    public f() {
        throw null;
    }

    public f(Application application, InterfaceC28373a interfaceC28373a, InterfaceC35745a5 interfaceC35745a5, Y41.l lVar, int i12, C42822w c42822w) {
        lVar = (i12 & 8) != 0 ? new a(application) : lVar;
        this.f175080a = application;
        this.f175081b = interfaceC35745a5;
        this.f175082c = new k(interfaceC28373a);
        this.f175083d = C42727D.c(new g(lVar, this));
        this.f175084e = Executors.newSingleThreadExecutor(new c());
    }
}
