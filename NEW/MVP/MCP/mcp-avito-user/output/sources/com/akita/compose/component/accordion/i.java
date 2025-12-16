package com.akita.compose.component.accordion;

import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Accordion.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f60201l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f60202m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f60203n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z12, t tVar, boolean z13) {
        super(2);
        this.f60201l = z12;
        this.f60202m = tVar;
        this.f60203n = z13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            e.a(this.f60201l, this.f60202m, null, this.f60203n, a13, 0);
        }
        return G0.f406611a;
    }
}
