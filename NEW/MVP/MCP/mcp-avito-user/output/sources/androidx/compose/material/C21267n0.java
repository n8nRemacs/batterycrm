package androidx.compose.material;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21267n0 extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ L0 f33819l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f33820m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21267n0(L0 l02, kotlinx.coroutines.T t12) {
        super(0);
        this.f33819l = l02;
        this.f33820m = t12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        L0 l02 = this.f33819l;
        if (l02.f32845a.invoke(BackdropValue.f32406c).booleanValue()) {
            C43259k.d(this.f33820m, null, null, new C21254m0(l02, null), 3);
        }
        return Boolean.TRUE;
    }
}
