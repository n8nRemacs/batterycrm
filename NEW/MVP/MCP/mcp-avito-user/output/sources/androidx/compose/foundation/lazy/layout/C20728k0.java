package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C20304o;
import androidx.compose.animation.core.C20318t;
import androidx.compose.runtime.C22082i3;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: LazyLayoutScrollScope.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/o;", "", "Landroidx/compose/animation/core/t;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.lazy.layout.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20728k0 extends kotlin.jvm.internal.N implements Y41.l<C20304o<Float, C20318t>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f29452l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.e f29453m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20722h0 f29454n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20728k0(float f12, l0.e eVar, InterfaceC20722h0 interfaceC20722h0) {
        super(1);
        this.f29452l = f12;
        this.f29453m = eVar;
        this.f29454n = interfaceC20722h0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C20304o<Float, C20318t> c20304o) {
        C20304o<Float, C20318t> c20304o2 = c20304o;
        float f12 = this.f29452l;
        float fA2 = 0.0f;
        if (f12 > 0.0f) {
            fA2 = kotlin.ranges.s.c(((Number) ((C22082i3) c20304o2.f26389e).getF42167b()).floatValue(), f12);
        } else if (f12 < 0.0f) {
            fA2 = kotlin.ranges.s.a(((Number) ((C22082i3) c20304o2.f26389e).getF42167b()).floatValue(), f12);
        }
        l0.e eVar = this.f29453m;
        float f13 = fA2 - eVar.f406839b;
        if (f13 != this.f29454n.a(f13) || fA2 != ((Number) ((C22082i3) c20304o2.f26389e).getF42167b()).floatValue()) {
            c20304o2.a();
        }
        eVar.f406839b += f13;
        return kotlin.G0.f406611a;
    }
}
