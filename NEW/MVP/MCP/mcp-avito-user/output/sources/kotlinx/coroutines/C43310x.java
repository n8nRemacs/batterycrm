package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/x;", "Lkotlinx/coroutines/O0;", "Lkotlinx/coroutines/w;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43310x extends O0 implements InterfaceC43308w {

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final V0 f412303f;

    public C43310x(@Y61.k V0 v02) {
        this.f412303f = v02;
    }

    @Override // kotlinx.coroutines.H0
    public final void a(@Y61.l Throwable th2) {
        V0 v02 = this.f410722e;
        if (v02 == null) {
            v02 = null;
        }
        this.f412303f.U(v02);
    }

    @Override // kotlinx.coroutines.InterfaceC43308w
    public final boolean b(@Y61.k Throwable th2) {
        V0 v02 = this.f410722e;
        if (v02 == null) {
            v02 = null;
        }
        return v02.Y(th2);
    }

    @Override // kotlinx.coroutines.InterfaceC43308w
    @Y61.k
    public final N0 getParent() {
        V0 v02 = this.f410722e;
        if (v02 != null) {
            return v02;
        }
        return null;
    }
}
