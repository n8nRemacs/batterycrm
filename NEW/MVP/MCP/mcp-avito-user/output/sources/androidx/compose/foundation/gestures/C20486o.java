package androidx.compose.foundation.gestures;

import kotlin.Metadata;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ll0/g;", "deltaForDrag", "invoke-MK-Hz9U", "(J)J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.gestures.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20486o extends kotlin.jvm.internal.N implements Y41.l<l0.g, l0.g> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20490p<Object> f27881l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20430a f27882m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20486o(C20490p<Object> c20490p, InterfaceC20430a interfaceC20430a) {
        super(1);
        this.f27881l = c20490p;
        this.f27882m = interfaceC20430a;
    }

    @Override // Y41.l
    public final l0.g invoke(l0.g gVar) {
        long j12 = gVar.f413387a;
        C20490p<Object> c20490p = this.f27881l;
        float fE2 = c20490p.f27894z.e(Float.intBitsToFloat((int) (c20490p.f27887A == Orientation.f27425b ? j12 & 4294967295L : j12 >> 32)));
        long jX2 = C20490p.x2(c20490p, fE2 - c20490p.f27894z.f());
        this.f27882m.a(fE2, 0.0f);
        return l0.g.a(jX2);
    }
}
