package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.C22387u;
import androidx.compose.ui.layout.K0;
import kotlin.Metadata;

/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.layout.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20545b extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC22348a f28581l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f28582m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28583n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f28584o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f28585p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f28586q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f28587r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20545b(AbstractC22348a abstractC22348a, float f12, int i12, int i13, int i14, androidx.compose.ui.layout.K0 k02, int i15) {
        super(1);
        this.f28581l = abstractC22348a;
        this.f28582m = f12;
        this.f28583n = i12;
        this.f28584o = i13;
        this.f28585p = i14;
        this.f28586q = k02;
        this.f28587r = i15;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(K0.a aVar) {
        int i12;
        K0.a aVar2 = aVar;
        boolean z12 = this.f28581l instanceof C22387u;
        androidx.compose.ui.layout.K0 k02 = this.f28586q;
        int i13 = this.f28585p;
        int i14 = this.f28583n;
        float f12 = this.f28582m;
        if (z12) {
            i12 = 0;
        } else {
            androidx.compose.ui.unit.h.f42849c.getClass();
            i12 = !androidx.compose.ui.unit.h.b(f12, androidx.compose.ui.unit.h.f42851e) ? i14 : (this.f28584o - i13) - k02.f40345b;
        }
        if (z12) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            if (androidx.compose.ui.unit.h.b(f12, androidx.compose.ui.unit.h.f42851e)) {
                i14 = (this.f28587r - i13) - k02.f40346c;
            }
        } else {
            i14 = 0;
        }
        aVar2.h(k02, i12, i14, 0.0f);
        return kotlin.G0.f406611a;
    }
}
