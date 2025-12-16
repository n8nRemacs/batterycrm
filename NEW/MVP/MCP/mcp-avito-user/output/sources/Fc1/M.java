package Fc1;

import androidx.compose.runtime.C22066f2;

/* loaded from: classes9.dex */
public final class M extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5086l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.g f5087m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f5088n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(int i12, androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar, Y41.a aVar, int i13) {
        super(2);
        this.f5086l = i12;
        this.f5087m = gVar;
        this.f5088n = aVar;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(65);
        androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar = this.f5087m;
        Y41.a<kotlin.G0> aVar = this.f5088n;
        N.a(this.f5086l, gVar, aVar, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
