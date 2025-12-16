package com.avito.android.oauth.presentation.ui;

import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedForm.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f208416l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f208417m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f208418n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(K k12, Y41.l lVar, int i12) {
        super(2);
        this.f208416l = k12;
        this.f208417m = (N) lVar;
        this.f208418n = i12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f208418n | 1);
        ?? r02 = this.f208417m;
        f.b(this.f208416l, r02, a12, iA2);
        return G0.f406611a;
    }
}
