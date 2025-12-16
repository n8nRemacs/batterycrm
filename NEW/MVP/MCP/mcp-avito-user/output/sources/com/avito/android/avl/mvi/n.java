package com.avito.android.avl.mvi;

import Lg.InterfaceC14391b;
import Mg.InterfaceC14486a;
import com.avito.android.advertising.loaders.j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43187o;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import zg.e;
import zg.f;

/* compiled from: AvlPlayerActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/avl/mvi/n;", "Lcom/avito/android/arch/mvi/a;", "Lzg/e;", "Lzg/f;", "Lzg/h;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements com.avito.android.arch.mvi.a<zg.e, zg.f, zg.h> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14391b f98238a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14486a f98239b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f98240c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.avl_analytics.a f98241d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.n f98242e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.j f98243f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f98244g;

    @Inject
    public n(@Y61.k InterfaceC14391b interfaceC14391b, @Y61.k InterfaceC14486a interfaceC14486a, @Y61.l String str, @Y61.k com.avito.android.avl_analytics.a aVar, @Y61.k com.avito.android.advertising.loaders.n nVar, @Y61.k com.avito.android.advertising.loaders.j jVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f98238a = interfaceC14391b;
        this.f98239b = interfaceC14486a;
        this.f98240c = str;
        this.f98241d = aVar;
        this.f98242e = nVar;
        this.f98243f = jVar;
        this.f98244g = screenPerformanceTracker;
    }

    public static final C0 c(n nVar, List list, int i12) {
        long jD2 = nVar.f98242e.d();
        return C43175k.B(new c(nVar, jD2, i12, null), new b(new a(new C43187o(C42745f0.S0(list)))));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<zg.f> b(zg.e eVar, zg.h hVar) {
        zg.e eVar2 = eVar;
        if (eVar2 instanceof e.h) {
            return new C43152f0(C43175k.B(new h(this, null), C43175k.Y(C43175k.G(new g(this, null, eVar2)), new d(this, null, eVar2))), new i(3, null));
        }
        if (eVar2 instanceof e.j) {
            return new C43152f0(C43175k.B(new j(this, null), this.f98239b.c(this.f98240c)), new k(3, null));
        }
        if (eVar2 instanceof e.c) {
            return C43175k.G(new l(this, null, eVar2));
        }
        if (eVar2 instanceof e.a) {
            return new C43137a0(new m(2, null), new e(y.a(this.f98238a.a())));
        }
        if (eVar2 instanceof e.f) {
            return new C43210w(f.g.f444152a);
        }
        if (eVar2 instanceof e.C12965e) {
            return new C43210w(f.C12966f.f444151a);
        }
        if (eVar2 instanceof e.i) {
            return new C43210w(f.b.f444147a);
        }
        if (eVar2 instanceof e.b) {
            return C43175k.G(new f(this, null, eVar2));
        }
        boolean z12 = eVar2 instanceof e.g;
        com.avito.android.advertising.loaders.j jVar = this.f98243f;
        if (z12) {
            e.g gVar = (e.g) eVar2;
            j.a.c(jVar, gVar.f444140a, gVar.f444141b, null, 12);
            return new C43207v(new zg.f[0]);
        }
        if (!(eVar2 instanceof e.d)) {
            throw new NoWhenBranchMatchedException();
        }
        e.d dVar = (e.d) eVar2;
        j.a.b(jVar, dVar.f444136a, dVar.f444137b);
        return new C43207v(new zg.f[0]);
    }
}
