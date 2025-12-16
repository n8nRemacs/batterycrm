package com.avito.android.tariff_lf_constructor.configure.level.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mD0.C43952d;
import mD0.InterfaceC43949a;

/* compiled from: ConstructorConfigureLevelScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class u extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C43952d f299795l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC43949a, G0> f299796m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f299797n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(C43952d c43952d, Y41.l<? super InterfaceC43949a, G0> lVar, int i12) {
        super(2);
        this.f299795l = c43952d;
        this.f299796m = lVar;
        this.f299797n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f299797n | 1);
        j.b(this.f299795l, this.f299796m, a12, iA2);
        return G0.f406611a;
    }
}
