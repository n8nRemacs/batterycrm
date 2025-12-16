package com.akita.compose.component.modal;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.window.H;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Modal.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class n extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62097l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f62098m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f62099n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f62100o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Y41.a aVar, H h12, C22096n c22096n, int i12) {
        super(2);
        this.f62097l = aVar;
        this.f62098m = h12;
        this.f62099n = c22096n;
        this.f62100o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62100o | 1);
        C22096n c22096n = this.f62099n;
        B.e(this.f62097l, this.f62098m, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
