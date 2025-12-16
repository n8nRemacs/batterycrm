package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SelectionGestures.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.selection.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20995a0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.pointer.C, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21028o f31910l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21049z f31911m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.a f31912n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20995a0(InterfaceC21028o interfaceC21028o, InterfaceC21049z interfaceC21049z, l0.a aVar) {
        super(1);
        this.f31910l = interfaceC21028o;
        this.f31911m = interfaceC21049z;
        this.f31912n = aVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.input.pointer.C c12) {
        androidx.compose.ui.input.pointer.C c13 = c12;
        if (this.f31910l.a(c13.f40118c, this.f31911m)) {
            c13.a();
            this.f31912n.f406838b = true;
        }
        return kotlin.G0.f406611a;
    }
}
