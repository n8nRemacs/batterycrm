package androidx.view.compose;

import Y41.l;
import Y41.p;
import androidx.compose.animation.AbstractC20359j1;
import androidx.compose.animation.AbstractC20365l1;
import androidx.compose.animation.InterfaceC20401y;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.i;
import androidx.compose.ui.v;
import androidx.view.C23326c0;
import androidx.view.C23395u;
import androidx.view.C23404y0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavHost.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.compose.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23332F extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C23404y0 f52926l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f52927m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f52928n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l<InterfaceC20401y<C23395u>, AbstractC20359j1> f52929o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l<InterfaceC20401y<C23395u>, AbstractC20365l1> f52930p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l<InterfaceC20401y<C23395u>, AbstractC20359j1> f52931q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l<InterfaceC20401y<C23395u>, AbstractC20365l1> f52932r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l<C23326c0, G0> f52933s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23332F(C23404y0 c23404y0, String str, v vVar, i iVar, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i12) {
        super(2);
        this.f52926l = c23404y0;
        this.f52927m = str;
        this.f52928n = vVar;
        this.f52929o = lVar;
        this.f52930p = lVar2;
        this.f52931q = lVar3;
        this.f52932r = lVar4;
        this.f52933s = lVar5;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        l<C23326c0, G0> lVar = this.f52933s;
        C23359y.b(this.f52926l, this.f52927m, lVar, a12, iA2);
        return G0.f406611a;
    }
}
