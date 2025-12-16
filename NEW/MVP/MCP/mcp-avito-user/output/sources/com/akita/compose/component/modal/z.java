package com.akita.compose.component.modal;

import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Modal.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class z extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f62147l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62148m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f62149n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f62150o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, G0> f62151p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.q<InterfaceC20640y, androidx.compose.runtime.A, Integer, G0> f62152q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f62153r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, G0> f62154s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f62155t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C c12, Y41.a aVar, boolean z12, boolean z13, Y41.p pVar, Y41.q qVar, androidx.compose.ui.v vVar, Y41.p pVar2, int i12) {
        super(2);
        this.f62147l = c12;
        this.f62148m = aVar;
        this.f62149n = z12;
        this.f62150o = z13;
        this.f62151p = pVar;
        this.f62152q = qVar;
        this.f62153r = vVar;
        this.f62154s = pVar2;
        this.f62155t = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62155t | 1);
        Y41.p<androidx.compose.runtime.A, Integer, G0> pVar = this.f62151p;
        Y41.q<InterfaceC20640y, androidx.compose.runtime.A, Integer, G0> qVar = this.f62152q;
        B.f(this.f62147l, this.f62148m, this.f62149n, this.f62150o, pVar, qVar, this.f62153r, this.f62154s, a12, iA2);
        return G0.f406611a;
    }
}
