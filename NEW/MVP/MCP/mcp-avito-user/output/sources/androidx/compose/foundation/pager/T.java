package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.InterfaceC22215f;
import kotlin.Metadata;

/* compiled from: PagerMeasure.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/foundation/pager/n;", "invoke", "(I)Landroidx/compose/foundation/pager/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class T extends kotlin.jvm.internal.N implements Y41.l<Integer, C20820n> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.Q f29831l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f29832m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O f29833n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f29834o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Orientation f29835p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f.b f29836q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f.c f29837r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f29838s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f29839t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(androidx.compose.foundation.lazy.layout.Q q12, long j12, O o12, long j13, Orientation orientation, InterfaceC22215f.b bVar, InterfaceC22215f.c cVar, boolean z12, int i12) {
        super(1);
        this.f29831l = q12;
        this.f29832m = j12;
        this.f29833n = o12;
        this.f29834o = j13;
        this.f29835p = orientation;
        this.f29836q = bVar;
        this.f29837r = cVar;
        this.f29838s = z12;
        this.f29839t = i12;
    }

    @Override // Y41.l
    public final C20820n invoke(Integer num) {
        int iIntValue = num.intValue();
        androidx.compose.foundation.lazy.layout.Q q12 = this.f29831l;
        return V.a(q12, iIntValue, this.f29832m, this.f29833n, this.f29834o, this.f29835p, this.f29836q, this.f29837r, q12.getF40524b(), this.f29838s, this.f29839t);
    }
}
