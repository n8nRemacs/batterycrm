package androidx.compose.material;

import androidx.compose.runtime.C22082i3;
import kotlin.Metadata;

/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class I3 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f32756l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W3 f32757m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f32758n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I3(String str, W3 w32, kotlinx.coroutines.T t12) {
        super(1);
        this.f32756l = str;
        this.f32757m = w32;
        this.f32758n = t12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.semantics.F f12) {
        androidx.compose.ui.semantics.F f13 = f12;
        androidx.compose.ui.semantics.C.p(f13, this.f32756l);
        W3 w32 = this.f32757m;
        if (((DrawerValue) ((C22082i3) w32.f33300a.f34353g).getF42167b()) == DrawerValue.f32549c) {
            androidx.compose.ui.semantics.C.d(f13, null, new H3(w32, this.f32758n));
        }
        return kotlin.G0.f406611a;
    }
}
