package androidx.compose.material;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class H3 extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W3 f32707l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f32708m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H3(W3 w32, kotlinx.coroutines.T t12) {
        super(0);
        this.f32707l = w32;
        this.f32708m = t12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        W3 w32 = this.f32707l;
        if (w32.f33300a.f34350d.invoke(DrawerValue.f32548b).booleanValue()) {
            C43259k.d(this.f32708m, null, null, new G3(w32, null), 3);
        }
        return Boolean.TRUE;
    }
}
