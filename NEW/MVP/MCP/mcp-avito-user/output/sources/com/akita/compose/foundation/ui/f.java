package com.akita.compose.foundation.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Spacer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class f extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f63718l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f63719m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f63720n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(float f12, v vVar, int i12) {
        super(2);
        this.f63718l = f12;
        this.f63719m = vVar;
        this.f63720n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63720n | 1);
        g.a(this.f63718l, this.f63719m, a12, iA2);
        return G0.f406611a;
    }
}
