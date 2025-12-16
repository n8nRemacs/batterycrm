package com.avito.beduin.v2.client.permission;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: PermissionClientExt.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f335476l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<g, G0> f335477m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.h<HV0.c> f335478n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<HV0.c> f335479o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l<Throwable, G0> f335480p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, l lVar, l0.h hVar, Y41.a aVar2, l lVar2) {
        super(0);
        this.f335476l = aVar;
        this.f335477m = lVar;
        this.f335478n = hVar;
        this.f335479o = aVar2;
        this.f335480p = lVar2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = new b(this.f335479o, this.f335478n);
        c cVar = new c(this.f335480p);
        a aVar = this.f335476l;
        aVar.getClass();
        g gVar = new g();
        gVar.f335481a = bVar;
        gVar.f335482b = cVar;
        aVar.f335469b = gVar;
        aVar.f335468a.b("android.permission.CAMERA");
        this.f335477m.invoke(gVar);
        return G0.f406611a;
    }
}
