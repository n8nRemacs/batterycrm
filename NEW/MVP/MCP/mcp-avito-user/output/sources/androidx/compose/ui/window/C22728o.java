package androidx.compose.ui.window;

import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidPopup.android.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.window.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22728o extends kotlin.jvm.internal.N implements Y41.l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ L f43100l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f43101m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U f43102n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f43103o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f43104p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22728o(L l12, Y41.a<G0> aVar, U u12, String str, LayoutDirection layoutDirection) {
        super(1);
        this.f43100l = l12;
        this.f43101m = aVar;
        this.f43102n = u12;
        this.f43103o = str;
        this.f43104p = layoutDirection;
    }

    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        L l12 = this.f43100l;
        l12.f43041o.addView(l12, l12.params);
        l12.l(this.f43101m, this.f43102n, this.f43103o, this.f43104p);
        return new C22727n(l12);
    }
}
