package androidx.compose.material;

import androidx.compose.runtime.C22040c3;
import kotlin.Metadata;

/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class B3 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W3 f32380l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.d f32381m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f32382n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B3(W3 w32, androidx.compose.ui.unit.d dVar, float f12) {
        super(0);
        this.f32380l = w32;
        this.f32381m = dVar;
        this.f32382n = f12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final kotlin.G0 invoke() {
        Object f42167b;
        W3 w32 = this.f32380l;
        w32.f33301b = this.f32381m;
        InterfaceC21153e3 interfaceC21153e3A = C21385w.a(new A3(this.f32382n));
        C21398x<DrawerValue> c21398x = w32.f33300a;
        boolean zIsNaN = Float.isNaN(((C22040c3) c21398x.f34356j).f());
        androidx.compose.runtime.I3 i32 = c21398x.f34354h;
        if (zIsNaN) {
            f42167b = i32.getF42167b();
        } else {
            f42167b = ((C21339s5) interfaceC21153e3A).a(((C22040c3) c21398x.f34356j).f());
            if (f42167b == null) {
                f42167b = i32.getF42167b();
            }
        }
        c21398x.l(interfaceC21153e3A, f42167b);
        return kotlin.G0.f406611a;
    }
}
