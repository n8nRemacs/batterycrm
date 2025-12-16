package com.akita.compose.component.stepper;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Stepper.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class t extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f62930l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f62931m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f62932n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f62933o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62934p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(int i12, int i13, int i14, Y41.l<? super Integer, G0> lVar, Y41.a<G0> aVar) {
        super(0);
        this.f62930l = i12;
        this.f62931m = i13;
        this.f62932n = i14;
        this.f62933o = lVar;
        this.f62934p = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        int i12 = this.f62930l + this.f62931m;
        if (i12 <= this.f62932n) {
            this.f62933o.invoke(Integer.valueOf(i12));
        } else {
            this.f62934p.invoke();
        }
        return G0.f406611a;
    }
}
