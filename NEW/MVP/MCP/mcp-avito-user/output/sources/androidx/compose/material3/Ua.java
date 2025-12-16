package androidx.compose.material3;

import androidx.compose.ui.graphics.InterfaceC22276o0;
import kotlin.Metadata;

/* compiled from: NavigationBar.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/o0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/o0;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Ua extends kotlin.jvm.internal.N implements Y41.l<InterfaceC22276o0, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f35555l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f35556m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ua(Y41.a aVar, boolean z12) {
        super(1);
        this.f35555l = z12;
        this.f35556m = aVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(InterfaceC22276o0 interfaceC22276o0) {
        interfaceC22276o0.setAlpha(this.f35555l ? 1.0f : this.f35556m.invoke().floatValue());
        return kotlin.G0.f406611a;
    }
}
