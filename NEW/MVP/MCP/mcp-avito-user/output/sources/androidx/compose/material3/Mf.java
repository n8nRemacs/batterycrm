package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Mf extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f35141l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.ranges.f<Float> f35142m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C21589gd f35143n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mf(boolean z12, kotlin.ranges.f<Float> fVar, C21589gd c21589gd) {
        super(1);
        this.f35141l = z12;
        this.f35142m = fVar;
        this.f35143n = c21589gd;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.semantics.F f12) {
        androidx.compose.ui.semantics.F f13 = f12;
        if (!this.f35141l) {
            androidx.compose.ui.semantics.C.c(f13);
        }
        androidx.compose.ui.semantics.C.q(f13, new Lf(this.f35142m, this.f35143n));
        return kotlin.G0.f406611a;
    }
}
