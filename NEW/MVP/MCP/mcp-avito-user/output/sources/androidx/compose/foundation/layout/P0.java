package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import kotlin.Metadata;

/* compiled from: FlowLayout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class P0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f28458l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C20585k.e f28459m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C20585k.m f28460n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f.c f28461o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f28462p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C20599n1 f28463q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f28464r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f28465s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(androidx.compose.ui.v vVar, C20585k.e eVar, C20585k.m mVar, InterfaceC22215f.c cVar, int i12, C20599n1 c20599n1, C22096n c22096n, int i13) {
        super(2);
        this.f28458l = vVar;
        this.f28459m = eVar;
        this.f28460n = mVar;
        this.f28461o = cVar;
        this.f28462p = i12;
        this.f28463q = c20599n1;
        this.f28464r = c22096n;
        this.f28465s = i13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f28465s | 1);
        C22096n c22096n = this.f28464r;
        InterfaceC22215f.c cVar = this.f28461o;
        int i12 = this.f28462p;
        S0.c(this.f28458l, this.f28459m, this.f28460n, cVar, i12, this.f28463q, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
