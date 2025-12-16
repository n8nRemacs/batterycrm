package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.InterfaceC22215f;
import kotlin.Metadata;

/* compiled from: PagerMeasure.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/foundation/pager/n;", "invoke", "(I)Landroidx/compose/foundation/pager/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class U extends kotlin.jvm.internal.N implements Y41.l<Integer, C20820n> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.Q f29840l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f29841m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O f29842n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f29843o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Orientation f29844p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f.b f29845q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f.c f29846r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f29847s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f29848t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(androidx.compose.foundation.lazy.layout.Q q12, long j12, O o12, long j13, Orientation orientation, InterfaceC22215f.b bVar, InterfaceC22215f.c cVar, boolean z12, int i12) {
        super(1);
        this.f29840l = q12;
        this.f29841m = j12;
        this.f29842n = o12;
        this.f29843o = j13;
        this.f29844p = orientation;
        this.f29845q = bVar;
        this.f29846r = cVar;
        this.f29847s = z12;
        this.f29848t = i12;
    }

    @Override // Y41.l
    public final C20820n invoke(Integer num) {
        int iIntValue = num.intValue();
        androidx.compose.foundation.lazy.layout.Q q12 = this.f29840l;
        return V.a(q12, iIntValue, this.f29841m, this.f29842n, this.f29843o, this.f29844p, this.f29845q, this.f29846r, q12.getF40524b(), this.f29847s, this.f29848t);
    }
}
