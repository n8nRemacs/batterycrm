package androidx.compose.material3;

import androidx.compose.animation.core.C20304o;
import androidx.compose.animation.core.C20318t;
import androidx.compose.runtime.C22082i3;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/o;", "", "Landroidx/compose/animation/core/t;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/o;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22005z0 extends kotlin.jvm.internal.N implements Y41.l<C20304o<Float, C20318t>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.e f37828l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Fl f37829m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.e f37830n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22005z0(l0.e eVar, Fl fl2, l0.e eVar2) {
        super(1);
        this.f37828l = eVar;
        this.f37829m = fl2;
        this.f37830n = eVar2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C20304o<Float, C20318t> c20304o) {
        C20304o<Float, C20318t> c20304o2 = c20304o;
        float fFloatValue = ((Number) ((C22082i3) c20304o2.f26389e).getF42167b()).floatValue();
        l0.e eVar = this.f37828l;
        float f12 = fFloatValue - eVar.f406839b;
        Fl fl2 = this.f37829m;
        float fB2 = fl2.b();
        fl2.c(fB2 + f12);
        float fAbs = Math.abs(fB2 - fl2.b());
        eVar.f406839b = ((Number) ((C22082i3) c20304o2.f26389e).getF42167b()).floatValue();
        this.f37830n.f406839b = c20304o2.b().floatValue();
        if (Math.abs(f12 - fAbs) > 0.5f) {
            c20304o2.a();
        }
        return kotlin.G0.f406611a;
    }
}
