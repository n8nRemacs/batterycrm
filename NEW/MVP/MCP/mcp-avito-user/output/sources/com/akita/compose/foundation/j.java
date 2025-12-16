package com.akita.compose.foundation;

import androidx.compose.animation.core.G1;
import androidx.compose.material.ripple.C21332c;
import androidx.compose.material.ripple.w;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f63590l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(0);
        this.f63590l = kVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        k kVar = this.f63590l;
        if (kVar.f63595v == null) {
            i iVar = new i(kVar);
            h hVar = new h(kVar);
            G1<Float> g12 = w.f34146a;
            C21332c c21332c = new C21332c(kVar.f63591r, kVar.f63592s, kVar.f63593t, iVar, hVar, null);
            kVar.k2(c21332c);
            kVar.f63595v = c21332c;
        }
        return G0.f406611a;
    }
}
