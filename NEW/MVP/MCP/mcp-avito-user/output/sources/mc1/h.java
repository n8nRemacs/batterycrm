package Mc1;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class h extends N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f10874l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f10875m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f10876n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l f10877o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10878p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, v vVar, long j12, Y41.l lVar, int i12) {
        super(2);
        this.f10874l = str;
        this.f10875m = vVar;
        this.f10876n = j12;
        this.f10877o = lVar;
        this.f10878p = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f10878p | 1);
        long j12 = this.f10876n;
        Y41.l lVar = this.f10877o;
        s.e(this.f10874l, this.f10875m, j12, lVar, (A) obj, iA2);
        return G0.f406611a;
    }
}
