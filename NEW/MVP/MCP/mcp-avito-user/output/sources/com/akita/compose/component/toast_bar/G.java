package com.akita.compose.component.toast_bar;

import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToastBar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class G extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f63206l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1 f63207m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f63208n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f63209o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f63210p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f63211q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(androidx.compose.ui.v vVar, T1 t12, com.akita.compose.foundation.p pVar, float f12, C22096n c22096n, int i12) {
        super(2);
        this.f63206l = vVar;
        this.f63207m = t12;
        this.f63208n = pVar;
        this.f63209o = f12;
        this.f63210p = c22096n;
        this.f63211q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63211q | 1);
        C22096n c22096n = this.f63210p;
        T1 t12 = this.f63207m;
        com.akita.compose.foundation.p pVar = this.f63208n;
        H.c(this.f63206l, t12, pVar, this.f63209o, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
