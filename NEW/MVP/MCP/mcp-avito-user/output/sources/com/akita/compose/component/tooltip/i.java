package com.akita.compose.component.tooltip;

import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Tooltip.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20644z f63495l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f63496m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C20644z c20644z, w wVar, int i12) {
        super(2);
        this.f63495l = c20644z;
        this.f63496m = wVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(71);
        k.a(this.f63495l, this.f63496m, a12, iA2);
        return G0.f406611a;
    }
}
