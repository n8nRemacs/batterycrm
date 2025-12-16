package com.akita.compose.component.toast_bar;

import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToastBar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class A extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC27357f f63160l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f63161m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.q<InterfaceC20572g2, androidx.compose.runtime.A, Integer, G0> f63162n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f63163o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f63164p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(InterfaceC27357f interfaceC27357f, androidx.compose.ui.v vVar, Y41.q qVar, int i12, int i13) {
        super(2);
        this.f63160l = interfaceC27357f;
        this.f63161m = vVar;
        this.f63162n = qVar;
        this.f63163o = i12;
        this.f63164p = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63163o | 1);
        androidx.compose.ui.v vVar = this.f63161m;
        H.a(this.f63160l, vVar, this.f63162n, a12, iA2, this.f63164p);
        return G0.f406611a;
    }
}
