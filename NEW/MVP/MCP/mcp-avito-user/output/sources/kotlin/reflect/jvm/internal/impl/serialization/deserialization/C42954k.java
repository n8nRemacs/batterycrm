package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import f51.InterfaceC40235a;
import f51.InterfaceC40236b;
import f51.c;
import i51.InterfaceC41229c;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import kotlin.reflect.jvm.internal.impl.types.C42996v;
import kotlin.reflect.jvm.internal.impl.types.checker.p;
import kotlin.reflect.jvm.internal.impl.types.m0;
import okhttp3.internal.http2.Http2;
import q51.InterfaceC47205a;

/* compiled from: context.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42954k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.p f409914a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.E f409915b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42955l f409916c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42951h f409917d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42944c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f409918e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.L f409919f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final x f409920g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final s f409921h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41229c f409922i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final t f409923j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Iterable<InterfaceC40236b> f409924k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.H f409925l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42953j f409926m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40235a f409927n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final f51.c f409928o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.protobuf.f f409929p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.types.checker.p f409930q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47205a f409931r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final List<m0> f409932s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final r f409933t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final C42952i f409934u;

    /* JADX WARN: Multi-variable type inference failed */
    public C42954k(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.E e12, @Y61.k InterfaceC42955l interfaceC42955l, @Y61.k InterfaceC42951h interfaceC42951h, @Y61.k InterfaceC42944c<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> interfaceC42944c, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.L l12, @Y61.k x xVar, @Y61.k s sVar, @Y61.k InterfaceC41229c interfaceC41229c, @Y61.k t tVar, @Y61.k Iterable<? extends InterfaceC40236b> iterable, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.H h12, @Y61.k InterfaceC42953j interfaceC42953j, @Y61.k InterfaceC40235a interfaceC40235a, @Y61.k f51.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.protobuf.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.types.checker.p pVar2, @Y61.k InterfaceC47205a interfaceC47205a, @Y61.k List<? extends m0> list, @Y61.k r rVar) {
        this.f409914a = pVar;
        this.f409915b = e12;
        this.f409916c = interfaceC42955l;
        this.f409917d = interfaceC42951h;
        this.f409918e = interfaceC42944c;
        this.f409919f = l12;
        this.f409920g = xVar;
        this.f409921h = sVar;
        this.f409922i = interfaceC41229c;
        this.f409923j = tVar;
        this.f409924k = iterable;
        this.f409925l = h12;
        this.f409926m = interfaceC42953j;
        this.f409927n = interfaceC40235a;
        this.f409928o = cVar;
        this.f409929p = fVar;
        this.f409930q = pVar2;
        this.f409931r = interfaceC47205a;
        this.f409932s = list;
        this.f409933t = rVar;
        this.f409934u = new C42952i(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C42954k(kotlin.reflect.jvm.internal.impl.storage.p pVar, kotlin.reflect.jvm.internal.impl.descriptors.E e12, InterfaceC42955l interfaceC42955l, InterfaceC42951h interfaceC42951h, InterfaceC42944c interfaceC42944c, kotlin.reflect.jvm.internal.impl.descriptors.L l12, x xVar, s sVar, InterfaceC41229c interfaceC41229c, t tVar, Iterable iterable, kotlin.reflect.jvm.internal.impl.descriptors.H h12, InterfaceC42953j interfaceC42953j, InterfaceC40235a interfaceC40235a, f51.c cVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, kotlin.reflect.jvm.internal.impl.types.checker.p pVar2, InterfaceC47205a interfaceC47205a, List list, r rVar, int i12, C42822w c42822w) {
        kotlin.reflect.jvm.internal.impl.types.checker.p pVar3;
        InterfaceC40235a interfaceC40235a2 = (i12 & 8192) != 0 ? InterfaceC40235a.C11125a.f395657a : interfaceC40235a;
        f51.c cVar2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? c.a.f395658a : cVar;
        if ((65536 & i12) != 0) {
            kotlin.reflect.jvm.internal.impl.types.checker.p.f410117b.getClass();
            pVar3 = p.a.f410119b;
        } else {
            pVar3 = pVar2;
        }
        this(pVar, e12, interfaceC42955l, interfaceC42951h, interfaceC42944c, l12, xVar, sVar, interfaceC41229c, tVar, iterable, h12, interfaceC42953j, interfaceC40235a2, cVar2, fVar, pVar3, interfaceC47205a, (262144 & i12) != 0 ? Collections.singletonList(C42996v.f410262a) : list, (i12 & 524288) != 0 ? r.a.f409954a : rVar);
    }
}
