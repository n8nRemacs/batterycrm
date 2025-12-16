package u31;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* renamed from: u31.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48786a extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f439754l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f439755m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48786a(int i12, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f439754l = interfaceC22204y1;
        this.f439755m = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f439755m | 1);
        AbstractC48787b.a(this.f439754l, (A) obj, iA2);
        return G0.f406611a;
    }
}
