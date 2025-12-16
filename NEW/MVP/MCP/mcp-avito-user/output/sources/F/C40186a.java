package f;

import Y41.p;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40186a extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20576h2 f395497l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f395498m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f395499n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f395500o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40186a(C20576h2 c20576h2, boolean z12, v.a aVar, int i12) {
        super(2);
        this.f395497l = c20576h2;
        this.f395498m = z12;
        this.f395499n = aVar;
        this.f395500o = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f395500o | 1);
        boolean z12 = this.f395498m;
        v.a aVar = this.f395499n;
        b.a(this.f395497l, z12, aVar, (A) obj, iA2);
        return G0.f406611a;
    }
}
