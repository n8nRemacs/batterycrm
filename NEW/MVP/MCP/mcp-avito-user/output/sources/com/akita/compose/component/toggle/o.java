package com.akita.compose.component.toggle;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import p0.InterfaceC44967a;
import p0.b;

/* compiled from: RadioToggle.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class o extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f63392l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f63393m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44967a f63394n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Y41.a<G0> aVar, boolean z12, InterfaceC44967a interfaceC44967a) {
        super(0);
        this.f63392l = aVar;
        this.f63393m = z12;
        this.f63394n = interfaceC44967a;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f63392l.invoke();
        if (this.f63393m) {
            p0.b.f422385b.getClass();
            b.a.a();
            this.f63394n.a(0);
        }
        return G0.f406611a;
    }
}
