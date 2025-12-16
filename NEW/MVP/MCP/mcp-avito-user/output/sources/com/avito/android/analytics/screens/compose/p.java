package com.avito.android.analytics.screens.compose;

import Jn.InterfaceC14220a;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.view.InterfaceC22983P;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ScreenTracker.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class p extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14220a f90592l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f90593m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f90594n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f90595o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InterfaceC14220a interfaceC14220a, g gVar, InterfaceC22983P interfaceC22983P, C22096n c22096n, int i12) {
        super(2);
        this.f90592l = interfaceC14220a;
        this.f90593m = gVar;
        this.f90594n = interfaceC22983P;
        this.f90595o = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(3073);
        C22096n c22096n = this.f90595o;
        q.a(this.f90592l, this.f90593m, this.f90594n, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
