package xc1;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class c extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v.a f442577l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f442578m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f442579n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f442580o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v.a aVar, boolean z12, int i12, int i13) {
        super(2);
        this.f442577l = aVar;
        this.f442578m = z12;
        this.f442579n = i12;
        this.f442580o = i13;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f442579n | 1);
        d.a(this.f442577l, this.f442578m, (A) obj, iA2, this.f442580o);
        return G0.f406611a;
    }
}
