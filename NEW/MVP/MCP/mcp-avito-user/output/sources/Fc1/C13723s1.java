package Fc1;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;

/* renamed from: Fc1.s1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13723s1 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f5809l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5810m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f5811n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5812o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13723s1(androidx.compose.ui.v vVar, boolean z12, C22096n c22096n, int i12) {
        super(2);
        this.f5809l = vVar;
        this.f5810m = z12;
        this.f5811n = c22096n;
        this.f5812o = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f5812o | 1);
        C22096n c22096n = this.f5811n;
        C13732t1.a(this.f5809l, this.f5810m, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
