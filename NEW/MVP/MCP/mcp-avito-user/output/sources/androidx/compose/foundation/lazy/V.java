package androidx.compose.foundation.lazy;

import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.K0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyList.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/V;", "Landroidx/compose/foundation/lazy/i0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V extends i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f28857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.Q f28858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f28859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f28860g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f.b f28861h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f.c f28862i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f28863j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f28864k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f28865l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f28866m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w0 f28867n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(long j12, boolean z12, L l12, androidx.compose.foundation.lazy.layout.Q q12, int i12, int i13, InterfaceC22215f.b bVar, InterfaceC22215f.c cVar, boolean z13, int i14, int i15, long j13, w0 w0Var) {
        super(j12, z12, l12, q12, null);
        this.f28857d = z12;
        this.f28858e = q12;
        this.f28859f = i12;
        this.f28860g = i13;
        this.f28861h = bVar;
        this.f28862i = cVar;
        this.f28863j = z13;
        this.f28864k = i14;
        this.f28865l = i15;
        this.f28866m = j13;
        this.f28867n = w0Var;
    }

    @Override // androidx.compose.foundation.lazy.i0
    public final g0 b(int i12, Object obj, Object obj2, List<? extends K0> list, long j12) {
        int i13 = i12 == this.f28859f + (-1) ? 0 : this.f28860g;
        return new g0(i12, list, this.f28857d, this.f28861h, this.f28862i, this.f28858e.getF40524b(), this.f28863j, this.f28864k, this.f28865l, i13, this.f28866m, obj, obj2, this.f28867n.f29726m, j12, null);
    }
}
