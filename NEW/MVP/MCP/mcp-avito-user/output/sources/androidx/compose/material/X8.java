package androidx.compose.material;

import androidx.compose.ui.semantics.C22559g;
import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class X8 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f33352l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f33353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U8 f33354n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X8(boolean z12, String str, U8 u82) {
        super(1);
        this.f33352l = z12;
        this.f33353m = str;
        this.f33354n = u82;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.semantics.F f12) {
        androidx.compose.ui.semantics.F f13 = f12;
        if (this.f33352l) {
            C22559g.f41736b.getClass();
            androidx.compose.ui.semantics.C.o(f13, 0);
        }
        androidx.compose.ui.semantics.C.p(f13, this.f33353m);
        androidx.compose.ui.semantics.C.d(f13, null, new W8(this.f33354n));
        return kotlin.G0.f406611a;
    }
}
